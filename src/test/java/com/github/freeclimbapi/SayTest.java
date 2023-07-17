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
 * Model tests for Say
 */
 public class SayTest {
    private final Say model = new Say();

    /**
     * Test the property 'text'
     */
    @Test
    public void textTest() {
      
        
        model.setText("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getText());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'language'
     */
    @Test
    public void languageTest() {
      
        
        model.setLanguage("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getLanguage());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'loop'
     */
    @Test
    public void loopTest() {
      
        
        
        
        
        
      
  
      model.setLoop(1);
      Assert.assertEquals(1, (int) model.getLoop());
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
     * Test the property 'privacyMode'
     */
    @Test
    public void privacyModeTest() {
      
        model.setPrivacyMode(false);
        Assert.assertEquals(false, model.getPrivacyMode());       
        
        
        
        
        
      
  
  }

  /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      Say test1 = new Say();
        test1.setText("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLanguage("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLoop(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPrivacyMode(true);
        
        
        
        
        
        
        
        
        
        
        
        
      Say test2 = new Say();
        test2.setText("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLanguage("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLoop(1);
        
        
        
        
        
        
        
        
        
        
        
        test2.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPrivacyMode(true);
        
        
        
        
        
        
        
        
        
        
        
        
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      Say test1 = new Say();
        test1.setText("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLanguage("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLoop(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPrivacyMode(true);
        
        
        
        
        
        
        
        
        
        
        
        
      Say test2 = new Say();
        test2.setText("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLanguage("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLoop(0);
        
        
        
        
        
        
        
        
        
        
        
        test2.setConferenceId("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPrivacyMode(false);
        
        
        
        
        
        
        
        
        
        
        
        

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      Say test1 = new Say();
        test1.setText("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLanguage("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLoop(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPrivacyMode(true);
        
        
        
        
        
        
        
        
        
        
        
        
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      Say test1 = new Say();
        test1.setText("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLanguage("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLoop(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPrivacyMode(true);
        
        
        
        
        
        
        
        
        
        
        
        
      Say test2 = new Say();
        test2.setText("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLanguage("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLoop(1);
        
        
        
        
        
        
        
        
        
        
        
        test2.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPrivacyMode(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
       String toString1 = test1.toString();
       String toString2 = test2.toString();
        
        Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      Say test1 = new Say();
        test1.setText("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLanguage("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLoop(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPrivacyMode(true);
        
        
        
        
        
        
        
        
        
        
        
        

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void buildTest() throws Exception {
        
          
        model.setText("TEST_STRING");
          
         
          
        model.setLanguage("TEST_STRING");
          
         
         
         
          
        model.setConferenceId("TEST_STRING");
          
         
        model.setPrivacyMode(false);
         
         
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("text"), model.getText());
        Assert.assertEquals(attributes.get("language"), model.getLanguage());
        Assert.assertEquals(attributes.get("loop"), model.getLoop());
        Assert.assertEquals(attributes.get("conferenceId"), model.getConferenceId());
        Assert.assertEquals(attributes.get("privacyMode"), model.getPrivacyMode());
    }
 }