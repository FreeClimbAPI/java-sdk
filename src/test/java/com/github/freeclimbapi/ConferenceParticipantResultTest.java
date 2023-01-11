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
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
/**
 * Model tests for ConferenceParticipantResult
 */
public class ConferenceParticipantResultTest {
    private final ConferenceParticipantResult model = new ConferenceParticipantResult();
    /**
     * Test the property 'uri'
     */
    @Test
    public void uriTest() {

        model.setUri("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getUri());
        
        
    }

    /**
     * Test the property 'dateCreated'
     */
    @Test
    public void dateCreatedTest() {

        model.setDateCreated("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDateCreated());
        
        
    }

    /**
     * Test the property 'dateUpdated'
     */
    @Test
    public void dateUpdatedTest() {

        model.setDateUpdated("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDateUpdated());
        
        
    }

    /**
     * Test the property 'revision'
     */
    @Test
    public void revisionTest() {

        
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
     * Test the property 'conferenceId'
     */
    @Test
    public void conferenceIdTest() {

        model.setConferenceId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getConferenceId());
        
        
    }

    /**
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {

        model.setCallId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallId());
        
        
    }

    /**
     * Test the property 'talk'
     */
    @Test
    public void talkTest() {
        model.setTalk(false);
        Assert.assertEquals(false, model.getTalk());
        
        
    }

    /**
     * Test the property 'listen'
     */
    @Test
    public void listenTest() {
        model.setListen(false);
        Assert.assertEquals(false, model.getListen());
        
        
    }

    /**
     * Test the property 'startConfOnEnter'
     */
    @Test
    public void startConfOnEnterTest() {
        model.setStartConfOnEnter(false);
        Assert.assertEquals(false, model.getStartConfOnEnter());
        
        
    }

}
