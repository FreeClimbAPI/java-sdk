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
 * Model tests for TerminateConference
 */
 public class TerminateConferenceTest {
    private final TerminateConference model = new TerminateConference();

    /**
     * Test the property 'conferenceId'
     */
    @Test
    public void conferenceIdTest() {
      
        
        model.setConferenceId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getConferenceId());
        
        
        
        
        
      
  
  }

  /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      TerminateConference test1 = new TerminateConference();
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      TerminateConference test2 = new TerminateConference();
        test2.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      TerminateConference test1 = new TerminateConference();
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      TerminateConference test2 = new TerminateConference();
        test2.setConferenceId("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        

      Assert.assertFalse(test1.equals(test2));
    }

    /**
     * Test the method 'hashEquals'
     */

     @Test
    public void hashEqualsTest() {
      TerminateConference test1 = new TerminateConference();
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
       TerminateConference test2 = new TerminateConference();
        test2.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        

        int hashCode1 = test1.hashCode();
        int hashCode2 = test2.hashCode();

      Assert.assertEquals(hashCode1, hashCode2);
     }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      TerminateConference test1 = new TerminateConference();
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      TerminateConference test1 = new TerminateConference();
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      TerminateConference test2 = new TerminateConference();
        test2.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       String toString1 = test1.toString();
       String toString2 = test2.toString();
        
        Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      TerminateConference test1 = new TerminateConference();
        test1.setConferenceId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void buildTest() throws Exception {
        
          
        model.setConferenceId("TEST_STRING");
          
         
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("conferenceId"), model.getConferenceId());
    }
 }