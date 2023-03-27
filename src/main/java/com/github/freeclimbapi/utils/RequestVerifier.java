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

public class RequestVerifier {

    public void verifyRequestSignature(String requestBody, String requestHeader, String signingSecret,
            int tolerance) {
        checkRequestBody(requestBody);
        checkRequestHeader(requestHeader);
        checkSigningSecret(signingSecret);
        checkTolerance(tolerance);
        SignatureInformation info = new SignatureInformation(requestHeader);
        verifyTolerance(info, tolerance);
        verifySignature(info, requestBody, signingSecret);
    }

    public void checkRequestBody(String requestBody) {
        if (requestBody == "" || requestBody == null) {
            throw new java.lang.RuntimeException("Request Body cannot be empty or null");
        }
    }

    public void checkRequestHeader(String requestHeader) {
        if (!requestHeader.contains("t=") || !requestHeader.contains("v1=")) {
            throw new java.lang.RuntimeException(
                    "Error with request header, ether it is null or an empty string or request header does not meet requirements");
        } else if (requestHeader == "" || requestHeader == null) {
            throw new java.lang.RuntimeException(
                    "Error with request header, ether it is null or an empty string or request header does not meet requirements");
        }
    }

    public void checkSigningSecret(String signingSecret) {
        if (signingSecret.equals("") || signingSecret.equals(null)) {
            throw new java.lang.RuntimeException("Signing secret cannot be empty or null");
        }
    }

    public void checkTolerance(int tolerance) {
        if (!(tolerance > 0) || tolerance >= Integer.MAX_VALUE) {
            throw new java.lang.RuntimeException("Tolerance value must be a positive integer");
        }
    }

    public void verifyTolerance(SignatureInformation info, int tolerance) {
        int currentTime = (int) (System.currentTimeMillis() / 1000L);
        if (!info.isRequestTimeValid(tolerance)) {
            throw new java.lang.RuntimeException(
                    "Request time exceeded tolerance threshold. Request:" + info.requestTimestamp
                            + ", CurrentTime: " + Integer.toString(currentTime) + ", tolerance: " + tolerance);
        }
    }

    public void verifySignature(SignatureInformation info, String requestBody, String signingSecret) {
        if (!info.isSignatureSafe(requestBody, signingSecret)) {
            throw new java.lang.RuntimeException(
                    "Unverified signature request, If this request was unexpected, it may be from a bad actor. Please proceed with caution. If the request was exepected, please check any typos or issues with the signingSecret");
        }
    }
}