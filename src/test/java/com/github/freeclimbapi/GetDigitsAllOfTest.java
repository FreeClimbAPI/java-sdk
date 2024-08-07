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
 * Model tests for GetDigitsAllOf
 */
 public class GetDigitsAllOfTest {
    private final GetDigitsAllOf model = new GetDigitsAllOf(
    );
    
    
    /**
     * Test the property 'actionUrl'
     */
    @Test
    public void actionUrlTest() {
      
      model.setActionUrl("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getActionUrl());
      
      
      
    }
    /**
     * Test the property 'digitTimeoutMs'
     */
    @Test
    public void digitTimeoutMsTest() {
      
      model.setDigitTimeoutMs(1);
      Assert.assertEquals(1, (int) model.getDigitTimeoutMs());
    }
    /**
     * Test the property 'finishOnKey'
     */
    @Test
    public void finishOnKeyTest() {
      
      
      model.setFinishOnKey("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getFinishOnKey());
      
      
    }
    /**
     * Test the property 'flushBuffer'
     */
    @Test
    public void flushBufferTest() {
      model.setFlushBuffer(false);
      Assert.assertEquals(false, model.getFlushBuffer());       
      
    }
    /**
     * Test the property 'initialTimeoutMs'
     */
    @Test
    public void initialTimeoutMsTest() {
      
      model.setInitialTimeoutMs(1);
      Assert.assertEquals(1, (int) model.getInitialTimeoutMs());
    }
    /**
     * Test the property 'maxDigits'
     */
    @Test
    public void maxDigitsTest() {
      
      model.setMaxDigits(1);
      Assert.assertEquals(1, (int) model.getMaxDigits());
    }
    /**
     * Test the property 'minDigits'
     */
    @Test
    public void minDigitsTest() {
      
      model.setMinDigits(1);
      Assert.assertEquals(1, (int) model.getMinDigits());
    }
    /**
     * Test the property 'prompts'
     */
    @Test
    public void promptsTest() {
      
      List<PerclCommand> testList = new ArrayList<PerclCommand>();
      model.setPrompts(testList);
      Assert.assertEquals(testList, model.getPrompts()); 
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
      GetDigitsAllOf test1 = new GetDigitsAllOf();
        
      test1.setActionUrl("TS");
        
        
      test1.setDigitTimeoutMs(1);
        
        
      test1.setFinishOnKey("TS");
      
      test1.setFlushBuffer(true);
      test1.setInitialTimeoutMs(1);
      test1.setMaxDigits(1);
      test1.setMinDigits(1);
      List<PerclCommand> testList = new ArrayList<PerclCommand>();
      test1.setPrompts(testList);
      test1.setPrivacyMode(true);
      GetDigitsAllOf test2 = new GetDigitsAllOf();
        
      test2.setActionUrl("TS");
        
        
      test2.setDigitTimeoutMs(1);
        
        
      test2.setFinishOnKey("TS");
      
      test2.setFlushBuffer(true);
      test2.setInitialTimeoutMs(1);
      test2.setMaxDigits(1);
      test2.setMinDigits(1);
      List<PerclCommand> testList2 = testList;
      test2.setPrompts(testList2);
      test2.setPrivacyMode(true);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      GetDigitsAllOf test1 = new GetDigitsAllOf();
        
      test1.setActionUrl("TS");
        
        
      test1.setDigitTimeoutMs(1);
        
        
      test1.setFinishOnKey("TS");
      
      test1.setFlushBuffer(true);
      test1.setInitialTimeoutMs(1);
      test1.setMaxDigits(1);
      test1.setMinDigits(1);
      List<PerclCommand> testList = new ArrayList<PerclCommand>();
      test1.setPrompts(testList);
      test1.setPrivacyMode(true);
      GetDigitsAllOf test2 = new GetDigitsAllOf();
        
      test2.setActionUrl("TS2");
        
        
      test2.setDigitTimeoutMs(0);
        
        
      test2.setFinishOnKey("TS2");
      
      test2.setFlushBuffer(false);
      test2.setInitialTimeoutMs(0);
      test2.setMaxDigits(0);
      test2.setMinDigits(0);
      List<PerclCommand> testList2 = null;
      test2.setPrompts(testList2);
      test2.setPrivacyMode(false);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      GetDigitsAllOf test1 = new GetDigitsAllOf();
        
      test1.setActionUrl("TS");
        
        
      test1.setDigitTimeoutMs(1);
        
        
      test1.setFinishOnKey("TS");
      
      test1.setFlushBuffer(true);
      test1.setInitialTimeoutMs(1);
      test1.setMaxDigits(1);
      test1.setMinDigits(1);
      List<PerclCommand> testList = new ArrayList<PerclCommand>();
      test1.setPrompts(testList);
      test1.setPrivacyMode(true);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      GetDigitsAllOf test1 = new GetDigitsAllOf();
        
      test1.setActionUrl("TS");
        
        
      test1.setDigitTimeoutMs(1);
        
        
      test1.setFinishOnKey("TS");
      
      test1.setFlushBuffer(true);
      test1.setInitialTimeoutMs(1);
      test1.setMaxDigits(1);
      test1.setMinDigits(1);
      List<PerclCommand> testList = new ArrayList<PerclCommand>();
      test1.setPrompts(testList);
      test1.setPrivacyMode(true);
      GetDigitsAllOf test2 = new GetDigitsAllOf();
        
      test2.setActionUrl("TS");
        
        
      test2.setDigitTimeoutMs(1);
        
        
      test2.setFinishOnKey("TS");
      
      test2.setFlushBuffer(true);
      test2.setInitialTimeoutMs(1);
      test2.setMaxDigits(1);
      test2.setMinDigits(1);
      List<PerclCommand> testList2 = testList;
      test2.setPrompts(testList2);
      test2.setPrivacyMode(true);
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      GetDigitsAllOf test1 = new GetDigitsAllOf();
        
      test1.setActionUrl("TS");
        
        
      test1.setDigitTimeoutMs(1);
        
        
      test1.setFinishOnKey("TS");
      
      test1.setFlushBuffer(true);
      test1.setInitialTimeoutMs(1);
      test1.setMaxDigits(1);
      test1.setMinDigits(1);
      List<PerclCommand> testList = new ArrayList<PerclCommand>();
      test1.setPrompts(testList);
      test1.setPrivacyMode(true);
      GetDigitsAllOf test2 = new GetDigitsAllOf();
        
      test2.setActionUrl("TS");
        
        
      test2.setDigitTimeoutMs(1);
        
        
      test2.setFinishOnKey("TS");
      
      test2.setFlushBuffer(true);
      test2.setInitialTimeoutMs(1);
      test2.setMaxDigits(1);
      test2.setMinDigits(1);
      List<PerclCommand> testList2 = testList;
      test2.setPrompts(testList2);
      test2.setPrivacyMode(true);
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      GetDigitsAllOf test1 = new GetDigitsAllOf();
        
      test1.setActionUrl("TS");
        
        
      test1.setDigitTimeoutMs(1);
        
        
      test1.setFinishOnKey("TS");
      
      test1.setFlushBuffer(true);
      test1.setInitialTimeoutMs(1);
      test1.setMaxDigits(1);
      test1.setMinDigits(1);
      List<PerclCommand> testList = new ArrayList<PerclCommand>();
      test1.setPrompts(testList);
      test1.setPrivacyMode(true);
      GetDigitsAllOf test2 = new GetDigitsAllOf();
        
      test2.setActionUrl("TS2");
        
        
      test2.setDigitTimeoutMs(0);
        
        
      test2.setFinishOnKey("TS2");
      
      test2.setFlushBuffer(false);
      test2.setInitialTimeoutMs(0);
      test2.setMaxDigits(0);
      test2.setMinDigits(0);
      List<PerclCommand> testList2 = null;
      test2.setPrompts(testList2);
      test2.setPrivacyMode(false);
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      GetDigitsAllOf test1 = new GetDigitsAllOf();
        
      test1.setActionUrl("TS");
        
        
      test1.setDigitTimeoutMs(1);
        
        
        test1.setFinishOnKey("TS");
      
      test1.setFlushBuffer(true);
      test1.setInitialTimeoutMs(1);
      test1.setMaxDigits(1);
      test1.setMinDigits(1);
      List<PerclCommand> testList = new ArrayList<PerclCommand>();
      test1.setPrompts(testList);
      test1.setPrivacyMode(true);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }