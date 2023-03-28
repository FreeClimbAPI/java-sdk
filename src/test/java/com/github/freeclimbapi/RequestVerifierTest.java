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

public class RequestVerifierTest {

    private final RequestVerifier instance = new RequestVerifier();

    @Test(expected = RuntimeException.class)
    public void checkRequestBodyTest() {
        String requestBody = "";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679931346,v1=4945505e46930b6e31df721c069f10cd3a4cfb3c8e2ec67d2663fae49f95644f,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = 5 * 60 * 1000;

        instance.verifyRequestSignature(requestBody, signingSecret, requestHeader, tolerance);

    }

    @Test(expected = RuntimeException.class)
    public void checkRequestHeaderTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = 5 * 60 * 1000;
        instance.verifyRequestSignature(requestBody, signingSecret, requestHeader, tolerance);
    }

    @Test(expected = RuntimeException.class)
    public void checkRequestHeaderTest2() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,";
        int tolerance = 5 * 60 * 1000;
        instance.verifyRequestSignature(requestBody, signingSecret, requestHeader, tolerance);
    }

    @Test(expected = RuntimeException.class)
    public void checkRequestHeaderTest3() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,";
        int tolerance = 5 * 60;
        instance.verifyRequestSignature(requestBody, signingSecret, requestHeader, tolerance);
    }

    @Test(expected = RuntimeException.class)
    public void checkSigningSecretTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = 5 * 60;
        instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
    }

    @Test(expected = RuntimeException.class)
    public void checkToleranceTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = Integer.MAX_VALUE;
        instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
    }

    @Test(expected = RuntimeException.class)
    public void checkToleranceTest2() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = -5;
        instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
    }

    @Test(expected = RuntimeException.class)
    public void checkToleranceTest3() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = 0;
        instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
    }

    @Test(expected = RuntimeException.class)
    public void verifyToleranceTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1900871395,v1=1d798c86e977ff734dec3a8b8d67fe8621dcc1df46ef4212e0bfe2e122b01bfd,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = 5 * 60;
        instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
    }

    @Test(expected = RuntimeException.class)
    public void verifySignatureTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7794";
        String requestHeader = "t=1679944186,v1=1d798c86e977ff734dec3a8b8d67fe8621dcc1df46ef4212e0bfe2e122b01bfd,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = 5 * 60;
        instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
    }

    @Test
    public void verifyRequestSignatureTest() {
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = 5 * 60;
        instance.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
    }
}