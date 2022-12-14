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
 * Model tests for AddToConference
 */
public class AddToConferenceTest {
    private final AddToConference model = new AddToConference();
    /**
     * Test the property 'command'
     */
    @Test
    public void commandTest() {

        Assert.assertEquals("AddToConference", model.getCommand());
    }

    /**
     * Test the property 'allowCallControl'
     */
    @Test
    public void allowCallControlTest() {
        model.setAllowCallControl(false);
        Assert.assertEquals(false, model.getAllowCallControl());
        
        
    }

    /**
     * Test the property 'callControlSequence'
     */
    @Test
    public void callControlSequenceTest() {

        model.setCallControlSequence("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallControlSequence());
        
        
    }

    /**
     * Test the property 'callControlUrl'
     */
    @Test
    public void callControlUrlTest() {

        model.setCallControlUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallControlUrl());
        
        
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
        model.setCallId(false);
        Assert.assertEquals(false, model.getCallId());
        
        
    }

    /**
     * Test the property 'leaveConferenceUrl'
     */
    @Test
    public void leaveConferenceUrlTest() {

        model.setLeaveConferenceUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getLeaveConferenceUrl());
        
        
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
     * Test the property 'notificationUrl'
     */
    @Test
    public void notificationUrlTest() {

        model.setNotificationUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getNotificationUrl());
        
        
    }

    /**
     * Test the property 'startConfOnEnter'
     */
    @Test
    public void startConfOnEnterTest() {
        model.setStartConfOnEnter(false);
        Assert.assertEquals(false, model.getStartConfOnEnter());
        
        
    }

    /**
     * Test the property 'talk'
     */
    @Test
    public void talkTest() {
        model.setTalk(false);
        Assert.assertEquals(false, model.getTalk());
        
        
    }

    @Test
    public void buildTest() throws Exception {
        
        model.setAllowCallControl(false);   
        model.setCallControlSequence("TEST_STRING");   
        model.setCallControlUrl("TEST_STRING");   
        model.setConferenceId("TEST_STRING");  
        model.setCallId(false);   
        model.setLeaveConferenceUrl("TEST_STRING");  
        model.setListen(false);   
        model.setNotificationUrl("TEST_STRING");  
        model.setStartConfOnEnter(false);  
        model.setTalk(false);  
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("allowCallControl"), model.getAllowCallControl());
        Assert.assertEquals(attributes.get("callControlSequence"), model.getCallControlSequence());
        Assert.assertEquals(attributes.get("callControlUrl"), model.getCallControlUrl());
        Assert.assertEquals(attributes.get("conferenceId"), model.getConferenceId());
        Assert.assertEquals(attributes.get("callId"), model.getCallId());
        Assert.assertEquals(attributes.get("leaveConferenceUrl"), model.getLeaveConferenceUrl());
        Assert.assertEquals(attributes.get("listen"), model.getListen());
        Assert.assertEquals(attributes.get("notificationUrl"), model.getNotificationUrl());
        Assert.assertEquals(attributes.get("startConfOnEnter"), model.getStartConfOnEnter());
        Assert.assertEquals(attributes.get("talk"), model.getTalk());
    }
}
