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
 * Model tests for CreateConferenceAllOf
 */
 public class CreateConferenceAllOfTest {
    private final CreateConferenceAllOf model = new CreateConferenceAllOf();

    /**
     * Test the property 'actionUrl'
     */
    @Test
    public void actionUrlTest() {
      
        
        model.setActionUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getActionUrl());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'alias'
     */
    @Test
    public void aliasTest() {
      
        model.setAlias(false);
        Assert.assertEquals(false, model.getAlias());       
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'playBeep'
     */
    @Test
    public void playBeepTest() {
      
      model.setPlayBeep(PlayBeep.ALWAYS);
      Assert.assertEquals(model.getPlayBeep(),PlayBeep.ALWAYS);
      model.setPlayBeep(PlayBeep.NEVER);
      Assert.assertEquals(model.getPlayBeep(),PlayBeep.NEVER);
      model.setPlayBeep(PlayBeep.ENTRY_ONLY);
      Assert.assertEquals(model.getPlayBeep(),PlayBeep.ENTRY_ONLY);
      model.setPlayBeep(PlayBeep.EXIT_ONLY);
      Assert.assertEquals(model.getPlayBeep(),PlayBeep.EXIT_ONLY);
  
  }

    /**
     * Test the property 'record'
     */
    @Test
    public void recordTest() {
      
        model.setRecord(false);
        Assert.assertEquals(false, model.getRecord());       
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'statusCallbackUrl'
     */
    @Test
    public void statusCallbackUrlTest() {
      
        
        model.setStatusCallbackUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getStatusCallbackUrl());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'waitUrl'
     */
    @Test
    public void waitUrlTest() {
      
        
        model.setWaitUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getWaitUrl());
        
        
        
        
        
      
  
  }

  /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      CreateConferenceAllOf test1 = new CreateConferenceAllOf();
        test1.setActionUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPlayBeep(PlayBeep.ALWAYS);
        
        
        
        
        
        
        test1.setRecord(true);
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStatusCallbackUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWaitUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      CreateConferenceAllOf test2 = new CreateConferenceAllOf();
        test2.setActionUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAlias(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPlayBeep(PlayBeep.ALWAYS);
        
        
        
        
        
        
        test2.setRecord(true);
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setStatusCallbackUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setWaitUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      CreateConferenceAllOf test1 = new CreateConferenceAllOf();
        test1.setActionUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPlayBeep(PlayBeep.NEVER);
        
        
        
        
        
        
        test1.setRecord(true);
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStatusCallbackUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWaitUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      CreateConferenceAllOf test2 = new CreateConferenceAllOf();
        test2.setActionUrl("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAlias(false);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPlayBeep(PlayBeep.ALWAYS);
        
        
        
        
        
        
        test2.setRecord(false);
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setStatusCallbackUrl("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setWaitUrl("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      CreateConferenceAllOf test1 = new CreateConferenceAllOf();
        test1.setActionUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPlayBeep(PlayBeep.ALWAYS);
        
        
        
        
        
        
        test1.setRecord(true);
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStatusCallbackUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWaitUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      CreateConferenceAllOf test1 = new CreateConferenceAllOf();
        test1.setActionUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPlayBeep(PlayBeep.ALWAYS);
        
        
        
        
        
        
        test1.setRecord(true);
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStatusCallbackUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWaitUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
      CreateConferenceAllOf test2 = new CreateConferenceAllOf();
        test2.setActionUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAlias(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPlayBeep(PlayBeep.ALWAYS);
        
        
        
        
        
        
        test2.setRecord(true);
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setStatusCallbackUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setWaitUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       String toString1 = test1.toString();
       String toString2 = test2.toString();
        
        Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      CreateConferenceAllOf test1 = new CreateConferenceAllOf();
        test1.setActionUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPlayBeep(PlayBeep.ALWAYS);
        
        
        
        
        
        
        test1.setRecord(true);
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStatusCallbackUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWaitUrl("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }