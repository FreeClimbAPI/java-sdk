package com.github.freeclimbapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import com.github.freeclimbapi.utils.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import org.junit.Test;

public class RequestVerifierTest {

    private final RequestVerifier instance = new RequestVerifier();

    @Test
    public void checkRequestBodyTest() throws Exception {
        String requestBody = "";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader =
                "t=1679931346,v1=117b796d951eb332e8196a3803517e4b5a6ac09a33cc7e87890cb99bde159341,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60 * 1000;
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals("Request Body cannot be empty or null", exception.getMessage());
    }

    @Test
    public void checkRequestHeaderTest() {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader =
                "v1=2f33654710a27e57828fa8556c2ed47c7a324aca88f155e296579e2ae851ce7b,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60 * 1000;
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals("Error with request header, timestamp is not present", exception.getMessage());
    }

    @Test
    public void checkRequestHeaderTest2() {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "t=1679944186";
        Integer tolerance = 5 * 60 * 1000;
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals(
                "Error with request header, signatures are not present", exception.getMessage());
    }

    @Test
    public void checkRequestHeaderTest3() {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader = "";
        int tolerance = 5 * 60;
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals("Error with request header, Request header is empty", exception.getMessage());
    }

    @Test
    public void checkSigningSecretTest() {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "";
        String requestHeader =
                "t=1679944186,v1=2f33654710a27e57828fa8556c2ed47c7a324aca88f155e296579e2ae851ce7b,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60;
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals("Signing secret cannot be empty or null", exception.getMessage());
    }

    @Test
    public void checkToleranceTest() {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader =
                "t=1679944186,v1=2f33654710a27e57828fa8556c2ed47c7a324aca88f155e296579e2ae851ce7b,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = Integer.MAX_VALUE;
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals("Tolerance value must be a positive integer", exception.getMessage());
    }

    @Test
    public void checkToleranceTest2() {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader =
                "t=1679944186,v1=2f33654710a27e57828fa8556c2ed47c7a324aca88f155e296579e2ae851ce7b,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = -5;
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals("Tolerance value must be a positive integer", exception.getMessage());
    }

    @Test
    public void checkToleranceTest3() {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader =
                "t=1679944186,v1=2f33654710a27e57828fa8556c2ed47c7a324aca88f155e296579e2ae851ce7b,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        int tolerance = 0;
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals("Tolerance value must be a positive integer", exception.getMessage());
    }

    @Test
    public void verifyToleranceTest() {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        Integer currentTime = (int) (System.currentTimeMillis() / 1000L);
        Integer timeCalcuation = currentTime - (6 * 60);
        String requestHeader =
                "t="
                        + timeCalcuation.toString()
                        + ",v1=1d798c86e977ff734dec3a8b8d67fe8621dcc1df46ef4212e0bfe2e122b01bfd,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60;

        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals(
                "Request time exceeded tolerance threshold. Request: "
                        + timeCalcuation.toString()
                        + ", CurrentTime: "
                        + Integer.toString(currentTime)
                        + ", tolerance: "
                        + tolerance,
                exception.getMessage());
    }

    @Test
    public void verifySignatureTest() {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7794";
        Integer currentTime = (int) (System.currentTimeMillis() / 1000L);
        String requestHeader =
                "t="
                        + currentTime.toString()
                        + ",v1=1d798c86e977ff734dec3a8b8d67fe8621dcc1df46ef4212e0bfe2e122b01bfd,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
        Integer tolerance = 5 * 60;
        RuntimeException exception =
                assertThrows(
                        RuntimeException.class,
                        () -> {
                            RequestVerifier.verifyRequestSignature(
                                    requestBody, requestHeader, signingSecret, tolerance);
                        });

        assertEquals(
                "Unverified signature request, If this request was unexpected, it may be from a bad"
                    + " actor. Please proceed with caution. If the request was exepected, please"
                    + " check any typos or issues with the signingSecret",
                exception.getMessage());
    }

    @Test
    public void verifyRequestSignatureTest() throws NoSuchAlgorithmException, InvalidKeyException {
        String requestBody =
                "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef00\",\"callId\":\"CA0123456789abcdefABCDEF0123456789abcdef00\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        String requestHeader =
                "t=2130000000,v1=2f33654710a27e57828fa8556c2ed47c7a324aca88f155e296579e2ae851ce7b,v1=7239961b8aa1212ed50408e206602d0d6b13590f48fcab22dd1aae47069e8820";
        Integer tolerance = 5 * 60;
        RequestVerifier.verifyRequestSignature(
                requestBody, requestHeader, signingSecret, tolerance);
    }
}
