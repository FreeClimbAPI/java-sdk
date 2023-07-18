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
 * Model tests for Enqueue
 */
 public class EnqueueTest {
    private final Enqueue model = new Enqueue();

    /**
     * Test the property 'actionUrl'
     */
    @Test
    public void actionUrlTest() {
        model.setActionUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getActionUrl());
  
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
     * Test the property 'queueId'
     */
    @Test
    public void queueIdTest() {
        model.setQueueId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getQueueId());
  
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
      Enqueue test1 = new Enqueue();
        test1.setActionUrl("TS");
        test1.setNotificationUrl("TS");
        test1.setQueueId("TS");
        test1.setWaitUrl("TS");
      Enqueue test2 = new Enqueue();
        test2.setActionUrl("TS");
        test2.setNotificationUrl("TS");
        test2.setQueueId("TS");
        test2.setWaitUrl("TS");
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      Enqueue test1 = new Enqueue();
        test1.setActionUrl("TS");
        test1.setNotificationUrl("TS");
        test1.setQueueId("TS");
        test1.setWaitUrl("TS");
      Enqueue test2 = new Enqueue();
        test2.setActionUrl("tS");
        test2.setNotificationUrl("tS");
        test2.setQueueId("tS");
        test2.setWaitUrl("tS");

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      Enqueue test1 = new Enqueue();
        test1.setActionUrl("TS");
        test1.setNotificationUrl("TS");
        test1.setQueueId("TS");
        test1.setWaitUrl("TS");
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      Enqueue test1 = new Enqueue();
        test1.setActionUrl("TS");
        test1.setNotificationUrl("TS");
        test1.setQueueId("TS");
        test1.setWaitUrl("TS");
      Enqueue test2 = new Enqueue();
        test2.setActionUrl("TS");
        test2.setNotificationUrl("TS");
        test2.setQueueId("TS");
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
      Enqueue test1 = new Enqueue();
        test1.setActionUrl("TS");
        test1.setNotificationUrl("TS");
        test1.setQueueId("TS");
        test1.setWaitUrl("TS");

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void buildTest() throws Exception {
        model.setActionUrl("TEST_STRING");
        model.setNotificationUrl("TEST_STRING");
        model.setQueueId("TEST_STRING");
        model.setWaitUrl("TEST_STRING");
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("actionUrl"), model.getActionUrl());
        Assert.assertEquals(attributes.get("notificationUrl"), model.getNotificationUrl());
        Assert.assertEquals(attributes.get("queueId"), model.getQueueId());
        Assert.assertEquals(attributes.get("waitUrl"), model.getWaitUrl());
    }
 }