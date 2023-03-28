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

public class SignatureInformationTest {
    private String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
    private final SignatureInformation instance = new SignatureInformation(requestHeader);

    @Test
    public void isRequestTimeValidTest() {
        Integer tolerance = 5 * 60;
        Boolean isRequestTimeValid = instance.isRequestTimeValid(tolerance);
        Assert.assertEquals(isRequestTimeValid, true);
    }

    @Test
    public void isRequestTimeValidTest2() {
        Integer tolerance = 5 * 60 * 1000;
        Boolean isRequestTimeValid = instance.isRequestTimeValid(tolerance);
        Assert.assertEquals(isRequestTimeValid, false);
    }

    @Test
    public void isSignatureSafeTest() {
        Integer tolerance = 5 * 60;
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
        Boolean isSignatureSafe = instance.isSignatureSafe(requestBody, signingSecret);
        Assert.assertEquals(isSignatureSafe, true);
    }

    @Test
    public void isSignatureSafeTest2() {
        Integer tolerance = 5 * 60;
        String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
        String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7794";
        Boolean isSignatureSafe = instance.isSignatureSafe(requestBody, signingSecret);
        Assert.assertEquals(isSignatureSafe, false);
    }

}