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
 * Model tests for SmsAllOf
 */
 public class SmsAllOfTest {
    private final SmsAllOf model = new SmsAllOf();

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {
      model.setTo("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getTo());
      
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
     * Test the property 'text'
     */
    @Test
    public void textTest() {
      model.setText("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getText());
      
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
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      SmsAllOf test1 = new SmsAllOf();
      test1.setTo("TS");
      test1.setFrom("TS");
      test1.setText("TS");
      test1.setNotificationUrl("TS");
      SmsAllOf test2 = new SmsAllOf();
      test2.setTo("TS");
      test2.setFrom("TS");
      test2.setText("TS");
      test2.setNotificationUrl("TS");

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      SmsAllOf test1 = new SmsAllOf();
      test1.setTo("TS");
      test1.setFrom("TS");
      test1.setText("TS");
      test1.setNotificationUrl("TS");
      SmsAllOf test2 = new SmsAllOf();
      test2.setTo("tS");
      test2.setFrom("tS");
      test2.setText("tS");
      test2.setNotificationUrl("tS");

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      SmsAllOf test1 = new SmsAllOf();
      test1.setTo("TS");
      test1.setFrom("TS");
      test1.setText("TS");
      test1.setNotificationUrl("TS");
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      SmsAllOf test1 = new SmsAllOf();
      test1.setTo("TS");
      test1.setFrom("TS");
      test1.setText("TS");
      test1.setNotificationUrl("TS");
      SmsAllOf test2 = new SmsAllOf();
      test2.setTo("TS");
      test2.setFrom("TS");
      test2.setText("TS");
      test2.setNotificationUrl("TS");
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      SmsAllOf test1 = new SmsAllOf();
      test1.setTo("TS");
      test1.setFrom("TS");
      test1.setText("TS");
      test1.setNotificationUrl("TS");

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }