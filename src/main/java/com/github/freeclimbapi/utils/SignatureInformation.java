package com.github.freeclimbapi.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Hex;

public class SignatureInformation {
    public int requestTimestamp;
    public List<String> signatures;

    public SignatureInformation(String requestHeader) {
        List<String> constructorSignatures = new ArrayList<String>();
        String[] signatureHeaders = requestHeader.split(",");
        for (String signatureHeader : signatureHeaders) {
            String headerKey = signatureHeader.split("=")[0];
            String headerValue = signatureHeader.split("=")[1];
            if (headerKey.equals("t")) {
                requestTimestamp = Integer.valueOf(signatureHeader.split("=")[1]);
            } else if (headerKey.equals("v1")) {
                constructorSignatures.add(headerValue);
            }
        }
        signatures = constructorSignatures;
    }

    public boolean isRequestTimeValid(int tolerance) {
        int currentUnixTimestamp = getCurrentUnixTime();
        return (requestTimestamp + tolerance) < currentUnixTimestamp;
    }

    public boolean isSignatureSafe(String requestBody, String signingSecret) {
        String hashValue = computeHash(requestBody, signingSecret);
        return signatures.contains(hashValue);
    }

    private String computeHash(String requestBody, String signingSecret) {
        String hashHexadecimalValue = "";
        String hashSeedString = requestTimestamp + "." + requestBody;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(signingSecret.getBytes(), "HmacSHA256"));
            hashHexadecimalValue = Hex.encodeHexString(mac.doFinal(hashSeedString.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashHexadecimalValue;
    }

    private int getCurrentUnixTime() {
        int unixTime = (int) (System.currentTimeMillis() / 1000L);
        return unixTime;
    }
}