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
 * Model tests for MessageResultAllOf
 */
 public class MessageResultAllOfTest {
    private final MessageResultAllOf model = new MessageResultAllOf();

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
  
  }

    /**
     * Test the property 'messageId'
     */
    @Test
    public void messageIdTest() {
        model.setMessageId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getMessageId());
  
  }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
    model.setStatus(MessageStatus.NEW);
    Assert.assertEquals(model.getStatus(),MessageStatus.NEW);
    model.setStatus(MessageStatus.QUEUED);
    Assert.assertEquals(model.getStatus(),MessageStatus.QUEUED);
    model.setStatus(MessageStatus.REJECTED);
    Assert.assertEquals(model.getStatus(),MessageStatus.REJECTED);
    model.setStatus(MessageStatus.SENDING);
    Assert.assertEquals(model.getStatus(),MessageStatus.SENDING);
    model.setStatus(MessageStatus.SENT);
    Assert.assertEquals(model.getStatus(),MessageStatus.SENT);
    model.setStatus(MessageStatus.FAILED);
    Assert.assertEquals(model.getStatus(),MessageStatus.FAILED);
    model.setStatus(MessageStatus.RECEIVED);
    Assert.assertEquals(model.getStatus(),MessageStatus.RECEIVED);
    model.setStatus(MessageStatus.UNDELIVERED);
    Assert.assertEquals(model.getStatus(),MessageStatus.UNDELIVERED);
    model.setStatus(MessageStatus.EXPIRED);
    Assert.assertEquals(model.getStatus(),MessageStatus.EXPIRED);
    model.setStatus(MessageStatus.DELETED);
    Assert.assertEquals(model.getStatus(),MessageStatus.DELETED);
    model.setStatus(MessageStatus.UNKNOWN);
    Assert.assertEquals(model.getStatus(),MessageStatus.UNKNOWN);
  
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
     * Test the property 'to'
     */
    @Test
    public void toTest() {
        model.setTo("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getTo());
  
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
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {
        model.setDirection("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDirection());
  
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
      MessageResultAllOf test1 = new MessageResultAllOf();
        test1.setAccountId("TS");
        test1.setMessageId("TS");
        test1.setStatus(MessageStatus.NEW);
        test1.setFrom("TS");
        test1.setTo("TS");
        test1.setText("TS");
        test1.setDirection("TS");
        test1.setNotificationUrl("TS");
      MessageResultAllOf test2 = new MessageResultAllOf();
        test2.setAccountId("TS");
        test2.setMessageId("TS");
        test2.setStatus(MessageStatus.NEW);
        test2.setFrom("TS");
        test2.setTo("TS");
        test2.setText("TS");
        test2.setDirection("TS");
        test2.setNotificationUrl("TS");
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      MessageResultAllOf test1 = new MessageResultAllOf();
        test1.setAccountId("TS");
        test1.setMessageId("TS");
        test1.setStatus(MessageStatus.QUEUED);
        test1.setFrom("TS");
        test1.setTo("TS");
        test1.setText("TS");
        test1.setDirection("TS");
        test1.setNotificationUrl("TS");
      MessageResultAllOf test2 = new MessageResultAllOf();
        test2.setAccountId("tS");
        test2.setMessageId("tS");
        test2.setStatus(MessageStatus.NEW);
        test2.setFrom("tS");
        test2.setTo("tS");
        test2.setText("tS");
        test2.setDirection("tS");
        test2.setNotificationUrl("tS");

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      MessageResultAllOf test1 = new MessageResultAllOf();
        test1.setAccountId("TS");
        test1.setMessageId("TS");
        test1.setStatus(MessageStatus.NEW);
        test1.setFrom("TS");
        test1.setTo("TS");
        test1.setText("TS");
        test1.setDirection("TS");
        test1.setNotificationUrl("TS");
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      MessageResultAllOf test1 = new MessageResultAllOf();
        test1.setAccountId("TS");
        test1.setMessageId("TS");
        test1.setStatus(MessageStatus.NEW);
        test1.setFrom("TS");
        test1.setTo("TS");
        test1.setText("TS");
        test1.setDirection("TS");
        test1.setNotificationUrl("TS");
      MessageResultAllOf test2 = new MessageResultAllOf();
        test2.setAccountId("TS");
        test2.setMessageId("TS");
        test2.setStatus(MessageStatus.NEW);
        test2.setFrom("TS");
        test2.setTo("TS");
        test2.setText("TS");
        test2.setDirection("TS");
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
      MessageResultAllOf test1 = new MessageResultAllOf();
        test1.setAccountId("TS");
        test1.setMessageId("TS");
        test1.setStatus(MessageStatus.NEW);
        test1.setFrom("TS");
        test1.setTo("TS");
        test1.setText("TS");
        test1.setDirection("TS");
        test1.setNotificationUrl("TS");

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }