package com.github.freeclimbapi.utils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Hex;

public class RequestVerifier {
    public static final Integer DEFAULT_TOLERANCE = 5 * 60 * 1000;

    public static void verifyRequestSignature(String requestBody, String requestHeader, String signingSecret,
            Integer tolerance) throws NoSuchAlgorithmException, InvalidKeyException {
        RequestVerifier verifier = new RequestVerifier();
        verifier.checkRequestBody(requestBody);
        verifier.checkRequestHeader(requestHeader);
        verifier.checkSigningSecret(signingSecret);
        verifier.checkTolerance(tolerance);
        SignatureInformation info = new SignatureInformation(requestHeader);
        verifier.verifyTolerance(info, tolerance);
        verifier.verifySignature(info, requestBody, signingSecret);
    }

    private void verifyRequestSignature(String requestBody, String requestHeader, String signingSecret)
            throws NoSuchAlgorithmException, InvalidKeyException {
        verifyRequestSignature(requestBody, requestHeader, signingSecret, DEFAULT_TOLERANCE);
    }

    private void checkRequestBody(String requestBody) {
        if (requestBody == "" || requestBody == null) {
            throw new java.lang.RuntimeException("Request Body cannot be empty or null");
        }
    }

    private void checkRequestHeader(String requestHeader) {
        if (requestHeader == "" || requestHeader == null) {
            throw new java.lang.RuntimeException("Error with request header, Request header is empty");
        } else if (!requestHeader.contains("t=")) {
            throw new java.lang.RuntimeException("Error with request header, timestamp is not present");
        } else if (!requestHeader.contains("v1=")) {
            throw new java.lang.RuntimeException("Error with request header, signatures are not present");
        }
    }

    private void checkSigningSecret(String signingSecret) {
        if (signingSecret.equals("") || signingSecret.equals(null)) {
            throw new java.lang.RuntimeException("Signing secret cannot be empty or null");
        }
    }

    private void checkTolerance(Integer tolerance) {
        if ((tolerance <= 0) || tolerance >= Integer.MAX_VALUE) {
            throw new java.lang.RuntimeException("Tolerance value must be a positive integer");
        }
    }

    private void verifyTolerance(SignatureInformation info, Integer tolerance) {
        int currentTime = info.getCurrentUnixTime();
        if (!info.isRequestTimeValid(tolerance)) {
            throw new java.lang.RuntimeException(
                    "Request time exceeded tolerance threshold. Request: " + info.requestTimestamp
                            + ", CurrentTime: " + Integer.toString(currentTime) + ", tolerance: " + tolerance);
        }
    }

    private void verifySignature(SignatureInformation info, String requestBody, String signingSecret)
            throws NoSuchAlgorithmException, InvalidKeyException {
        if (!info.isSignatureSafe(requestBody, signingSecret)) {
            throw new java.lang.RuntimeException(
                    "Unverified signature request, If this request was unexpected, it may be from a bad actor. Please proceed with caution. If the request was exepected, please check any typos or issues with the signingSecret");
        }
    }
}