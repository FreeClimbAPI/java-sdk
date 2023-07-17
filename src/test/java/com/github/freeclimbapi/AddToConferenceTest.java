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
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDate;

import java.util.*;
import java.util.Arrays;
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
 * Model tests for AddToConference
 */
 public class AddToConferenceTest {
    private final AddToConference model = new AddToConference();

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

  /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      AddToConference test1 = new AddToConference();
        test1.setAllowCallControl(true);
        test1.setCallControlSequence("TS");
        test1.setCallControlUrl("TS");
        test1.setConferenceId("TS");
        test1.setCallId(true);
        test1.setLeaveConferenceUrl("TS");
        test1.setListen(true);
        test1.setNotificationUrl("TS");
        test1.setStartConfOnEnter(true);
        test1.setTalk(true);
      AddToConference test2 = new AddToConference();
        test2.setAllowCallControl(true);
        test2.setCallControlSequence("TS");
        test2.setCallControlUrl("TS");
        test2.setConferenceId("TS");
        test2.setCallId(true);
        test2.setLeaveConferenceUrl("TS");
        test2.setListen(true);
        test2.setNotificationUrl("TS");
        test2.setStartConfOnEnter(true);
        test2.setTalk(true);
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      AddToConference test1 = new AddToConference();
        test1.setAllowCallControl(true);
        test1.setCallControlSequence("TS");
        test1.setCallControlUrl("TS");
        test1.setConferenceId("TS");
        test1.setCallId(true);
        test1.setLeaveConferenceUrl("TS");
        test1.setListen(true);
        test1.setNotificationUrl("TS");
        test1.setStartConfOnEnter(true);
        test1.setTalk(true);
      AddToConference test2 = new AddToConference();
        test2.setAllowCallControl(false);
        test2.setCallControlSequence("tS");
        test2.setCallControlUrl("tS");
        test2.setConferenceId("tS");
        test2.setCallId(false);
        test2.setLeaveConferenceUrl("tS");
        test2.setListen(false);
        test2.setNotificationUrl("tS");
        test2.setStartConfOnEnter(false);
        test2.setTalk(false);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      AddToConference test1 = new AddToConference();
        test1.setAllowCallControl(true);
        test1.setCallControlSequence("TS");
        test1.setCallControlUrl("TS");
        test1.setConferenceId("TS");
        test1.setCallId(true);
        test1.setLeaveConferenceUrl("TS");
        test1.setListen(true);
        test1.setNotificationUrl("TS");
        test1.setStartConfOnEnter(true);
        test1.setTalk(true);
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      AddToConference test1 = new AddToConference();
        test1.setAllowCallControl(true);
        test1.setCallControlSequence("TS");
        test1.setCallControlUrl("TS");
        test1.setConferenceId("TS");
        test1.setCallId(true);
        test1.setLeaveConferenceUrl("TS");
        test1.setListen(true);
        test1.setNotificationUrl("TS");
        test1.setStartConfOnEnter(true);
        test1.setTalk(true);
      AddToConference test2 = new AddToConference();
        test2.setAllowCallControl(true);
        test2.setCallControlSequence("TS");
        test2.setCallControlUrl("TS");
        test2.setConferenceId("TS");
        test2.setCallId(true);
        test2.setLeaveConferenceUrl("TS");
        test2.setListen(true);
        test2.setNotificationUrl("TS");
        test2.setStartConfOnEnter(true);
        test2.setTalk(true);
        
       String toString1 = test1.toString();
       String toString2 = test2.toString();
       Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      AddToConference test1 = new AddToConference();
        test1.setAllowCallControl(true);
        test1.setCallControlSequence("TS");
        test1.setCallControlUrl("TS");
        test1.setConferenceId("TS");
        test1.setCallId(true);
        test1.setLeaveConferenceUrl("TS");
        test1.setListen(true);
        test1.setNotificationUrl("TS");
        test1.setStartConfOnEnter(true);
        test1.setTalk(true);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
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