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
 * Model tests for RecordUtteranceAllOf
 */
 public class RecordUtteranceAllOfTest {
    private final RecordUtteranceAllOf model = new RecordUtteranceAllOf();

    /**
     * Test the property 'actionUrl'
     */
    @Test
    public void actionUrlTest() {
      model.setActionUrl("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getActionUrl());
      
    }

    /**
     * Test the property 'silenceTimeoutMs'
     */
    @Test
    public void silenceTimeoutMsTest() {
      
      model.setSilenceTimeoutMs(1);
      Assert.assertEquals(1, (int) model.getSilenceTimeoutMs());
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
     * Test the property 'maxLengthSec'
     */
    @Test
    public void maxLengthSecTest() {
      
      model.setMaxLengthSec(1);
      Assert.assertEquals(1, (int) model.getMaxLengthSec());
    }

    /**
     * Test the property 'playBeep'
     */
    @Test
    public void playBeepTest() {
      model.setPlayBeep(false);
      Assert.assertEquals(false, model.getPlayBeep());       
      
    }

    /**
     * Test the property 'autoStart'
     */
    @Test
    public void autoStartTest() {
      model.setAutoStart(false);
      Assert.assertEquals(false, model.getAutoStart());       
      
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
      RecordUtteranceAllOf test1 = new RecordUtteranceAllOf();
      test1.setActionUrl("TS");
      test1.setSilenceTimeoutMs(1);
      test1.setFinishOnKey("TS");
      test1.setMaxLengthSec(1);
      test1.setPlayBeep(true);
      test1.setAutoStart(true);
      test1.setPrivacyMode(true);
      RecordUtteranceAllOf test2 = new RecordUtteranceAllOf();
      test2.setActionUrl("TS");
      test2.setSilenceTimeoutMs(1);
      test2.setFinishOnKey("TS");
      test2.setMaxLengthSec(1);
      test2.setPlayBeep(true);
      test2.setAutoStart(true);
      test2.setPrivacyMode(true);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      RecordUtteranceAllOf test1 = new RecordUtteranceAllOf();
      test1.setActionUrl("TS");
      test1.setSilenceTimeoutMs(1);
      test1.setFinishOnKey("TS");
      test1.setMaxLengthSec(1);
      test1.setPlayBeep(true);
      test1.setAutoStart(true);
      test1.setPrivacyMode(true);
      RecordUtteranceAllOf test2 = new RecordUtteranceAllOf();
      test2.setActionUrl("tS");
      test2.setSilenceTimeoutMs(0);
      test2.setFinishOnKey("tS");
      test2.setMaxLengthSec(0);
      test2.setPlayBeep(false);
      test2.setAutoStart(false);
      test2.setPrivacyMode(false);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      RecordUtteranceAllOf test1 = new RecordUtteranceAllOf();
      test1.setActionUrl("TS");
      test1.setSilenceTimeoutMs(1);
      test1.setFinishOnKey("TS");
      test1.setMaxLengthSec(1);
      test1.setPlayBeep(true);
      test1.setAutoStart(true);
      test1.setPrivacyMode(true);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      RecordUtteranceAllOf test1 = new RecordUtteranceAllOf();
      test1.setActionUrl("TS");
      test1.setSilenceTimeoutMs(1);
      test1.setFinishOnKey("TS");
      test1.setMaxLengthSec(1);
      test1.setPlayBeep(true);
      test1.setAutoStart(true);
      test1.setPrivacyMode(true);
      RecordUtteranceAllOf test2 = new RecordUtteranceAllOf();
      test2.setActionUrl("TS");
      test2.setSilenceTimeoutMs(1);
      test2.setFinishOnKey("TS");
      test2.setMaxLengthSec(1);
      test2.setPlayBeep(true);
      test2.setAutoStart(true);
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
      RecordUtteranceAllOf test1 = new RecordUtteranceAllOf();
      test1.setActionUrl("TS");
      test1.setSilenceTimeoutMs(1);
      test1.setFinishOnKey("TS");
      test1.setMaxLengthSec(1);
      test1.setPlayBeep(true);
      test1.setAutoStart(true);
      test1.setPrivacyMode(true);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }