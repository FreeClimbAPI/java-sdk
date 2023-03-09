/*
 * FreeClimb API
 * FreeClimb is a cloud-based application programming interface (API) that puts the power of the Vail platform in your hands. FreeClimb simplifies the process of creating applications that can use a full range of telephony features without requiring specialized or on-site telephony equipment. Using the FreeClimb REST API to write applications is easy! You have the option to use the language of your choice or hit the API directly. Your application can execute a command by issuing a RESTful request to the FreeClimb API. The base URL to send HTTP requests to the FreeClimb REST API is: /apiserver. FreeClimb authenticates and processes your request.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@freeclimb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import java.net.URI;
import java.net.URISyntaxException;
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
/**
 * Model tests for CallResultAllOf
 */
public class CallResultAllOfTest {
    private final CallResultAllOf model = new CallResultAllOf();
    /**
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {

        model.setCallId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallId());
        
        
    }

    /**
     * Test the property 'parentCallId'
     */
    @Test
    public void parentCallIdTest() {

        model.setParentCallId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getParentCallId());
        
        
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {

        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
        
        
    }

    /**
     * Test the property 'from'
     */
    @Test
    public void fromTest() {

        model.setFrom("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getFrom());
        
        
    }

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {

        model.setTo("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getTo());
        
        
    }

    /**
     * Test the property 'phoneNumberId'
     */
    @Test
    public void phoneNumberIdTest() {

        model.setPhoneNumberId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getPhoneNumberId());
        
        
    }

    /**
     * Test the property 'callStatus'
     */
    @Test
    public void callStatusTest() {

        
    }

    /**
     * Test the property 'startTime'
     */
    @Test
    public void startTimeTest() {

        model.setStartTime("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getStartTime());
        
        
    }

    /**
     * Test the property 'connectTime'
     */
    @Test
    public void connectTimeTest() {

        model.setConnectTime("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getConnectTime());
        
        
    }

    /**
     * Test the property 'endTime'
     */
    @Test
    public void endTimeTest() {

        model.setEndTime("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getEndTime());
        
        
    }

    /**
     * Test the property 'duration'
     */
    @Test
    public void durationTest() {

        
    }

    /**
     * Test the property 'connectDuration'
     */
    @Test
    public void connectDurationTest() {

        
    }

    /**
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {

        
    }

    /**
     * Test the property 'answeredBy'
     */
    @Test
    public void answeredByTest() {

        
    }

    /**
     * Test the property 'subresourceUris'
     */
    @Test
    public void subresourceUrisTest() {

        
    }

}
