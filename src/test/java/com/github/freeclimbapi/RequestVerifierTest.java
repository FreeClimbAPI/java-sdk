package com.github.freeclimbapi;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.math.BigDecimal;
import com.github.freeclimbapi.utils.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RequestVerifierTest {

    private final RequestVerifier instance = new RequestVerifier();

    @Test
    public void checkRequestBodyTest() throws Exception {
        String requestBody = "";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679931346,v1=4945505e46930b6e31df721c069f10cd3a4cfb3c8e2ec67d2663fae49f95644f,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60 * 1000;
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals("Request Body cannot be empty or null", exception.getMessage());

    }

    @Test
    public void checkRequestHeaderTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60 * 1000;
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals("Error with request header, timestamp is not present", exception.getMessage());
    }

    @Test
    public void checkRequestHeaderTest2() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186";
        Integer tolerance = 5 * 60 * 1000;
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals("Error with request header, signatures are not present", exception.getMessage());
    }

    @Test
    public void checkRequestHeaderTest3() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "";
        int tolerance = 5 * 60;
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals("Error with request header, Request header is empty", exception.getMessage());
    }

    @Test
    public void checkSigningSecretTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60;
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals("Signing secret cannot be empty or null", exception.getMessage());
    }

    @Test
    public void checkToleranceTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = Integer.MAX_VALUE;
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals("Tolerance value must be a positive integer", exception.getMessage());
    }

    @Test
    public void checkToleranceTest2() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = -5;
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals("Tolerance value must be a positive integer", exception.getMessage());
    }

    @Test
    public void checkToleranceTest3() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = 0;
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals("Tolerance value must be a positive integer", exception.getMessage());
    }

    @Test
    public void verifyToleranceTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1900871395,v1=1d798c86e977ff734dec3a8b8d67fe8621dcc1df46ef4212e0bfe2e122b01bfd,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60;
        Integer currentTime = (int) (System.currentTimeMillis() / 1000L);
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals("Request time exceeded tolerance threshold. Request: 1900871395, CurrentTime: "
                + Integer.toString(currentTime) + ", tolerance: " + tolerance, exception.getMessage());
    }

    @Test
    public void verifySignatureTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7794";
        String requestHeader = "t=1679944186,v1=1d798c86e977ff734dec3a8b8d67fe8621dcc1df46ef4212e0bfe2e122b01bfd,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60;
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> {
                    instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
                });

        assertEquals(
                "Unverified signature request, If this request was unexpected, it may be from a bad actor. Please proceed with caution. If the request was exepected, please check any typos or issues with the signingSecret",
                exception.getMessage());
    }

    @Test
    public void verifyRequestSignatureTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60;
        instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
    }
}