package com.github.freeclimbapi.utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Hex;

public class SignatureInformation {
    public Integer requestTimestamp;
    public List<String> signatures;

    public SignatureInformation(String requestHeader) {
        signatures = new ArrayList<String>();
        String[] signatureHeaders = requestHeader.split(",");
        for (String signatureHeader : signatureHeaders) {
            String[] split = signatureHeader.split("=");
            String header = split[0];
            String value = split[1];
            if (header.equals("t")) {
                requestTimestamp = Integer.valueOf(value);
            } else if (header.equals("v1")) {
                signatures.add(value);
            }
        }
    }

    public boolean isRequestTimeValid(Integer tolerance) {
        Integer currentUnixTimestamp = getCurrentUnixTime();
        return currentUnixTimestamp < (requestTimestamp + tolerance);
    }

    public boolean isSignatureSafe(String requestBody, String signingSecret)
            throws NoSuchAlgorithmException, InvalidKeyException {
        String hashValue = computeHash(requestBody, signingSecret);
        return signatures.contains(hashValue);
    }

    private String computeHash(String requestBody, String signingSecret)
            throws NoSuchAlgorithmException, InvalidKeyException {
        String hashHexadecimalValue = "";
        String hashSeedString = requestTimestamp + "." + requestBody;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(signingSecret.getBytes(), "HmacSHA256"));
        return Hex.encodeHexString(mac.doFinal(hashSeedString.getBytes()));
    }

    public Integer getCurrentUnixTime() {
        Long timeCalculation = (System.currentTimeMillis() / 1000L);
        return Integer.valueOf(timeCalculation.intValue());
    }
}
