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
 * Model tests for MessageStatus
 */
 public class MessageStatusTest {
  @Test
    public void testNEWShouldWork() {

        MessageStatus test = MessageStatus.NEW;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testNEWShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.NEW;
        MessageStatus calculatedValue = MessageStatus.fromValue("new");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testNEWShouldDeserializeToString() {
     MessageStatus test = MessageStatus.NEW;
      String expectedValue = "new";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testQUEUEDShouldWork() {

        MessageStatus test = MessageStatus.QUEUED;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testQUEUEDShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.QUEUED;
        MessageStatus calculatedValue = MessageStatus.fromValue("queued");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testQUEUEDShouldDeserializeToString() {
     MessageStatus test = MessageStatus.QUEUED;
      String expectedValue = "queued";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testREJECTEDShouldWork() {

        MessageStatus test = MessageStatus.REJECTED;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testREJECTEDShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.REJECTED;
        MessageStatus calculatedValue = MessageStatus.fromValue("rejected");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testREJECTEDShouldDeserializeToString() {
     MessageStatus test = MessageStatus.REJECTED;
      String expectedValue = "rejected";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testSENDINGShouldWork() {

        MessageStatus test = MessageStatus.SENDING;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testSENDINGShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.SENDING;
        MessageStatus calculatedValue = MessageStatus.fromValue("sending");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSENDINGShouldDeserializeToString() {
     MessageStatus test = MessageStatus.SENDING;
      String expectedValue = "sending";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testSENTShouldWork() {

        MessageStatus test = MessageStatus.SENT;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testSENTShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.SENT;
        MessageStatus calculatedValue = MessageStatus.fromValue("sent");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSENTShouldDeserializeToString() {
     MessageStatus test = MessageStatus.SENT;
      String expectedValue = "sent";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testFAILEDShouldWork() {

        MessageStatus test = MessageStatus.FAILED;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testFAILEDShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.FAILED;
        MessageStatus calculatedValue = MessageStatus.fromValue("failed");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testFAILEDShouldDeserializeToString() {
     MessageStatus test = MessageStatus.FAILED;
      String expectedValue = "failed";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testRECEIVEDShouldWork() {

        MessageStatus test = MessageStatus.RECEIVED;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testRECEIVEDShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.RECEIVED;
        MessageStatus calculatedValue = MessageStatus.fromValue("received");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testRECEIVEDShouldDeserializeToString() {
     MessageStatus test = MessageStatus.RECEIVED;
      String expectedValue = "received";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testUNDELIVEREDShouldWork() {

        MessageStatus test = MessageStatus.UNDELIVERED;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testUNDELIVEREDShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.UNDELIVERED;
        MessageStatus calculatedValue = MessageStatus.fromValue("undelivered");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testUNDELIVEREDShouldDeserializeToString() {
     MessageStatus test = MessageStatus.UNDELIVERED;
      String expectedValue = "undelivered";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testEXPIREDShouldWork() {

        MessageStatus test = MessageStatus.EXPIRED;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testEXPIREDShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.EXPIRED;
        MessageStatus calculatedValue = MessageStatus.fromValue("expired");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testEXPIREDShouldDeserializeToString() {
     MessageStatus test = MessageStatus.EXPIRED;
      String expectedValue = "expired";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testDELETEDShouldWork() {

        MessageStatus test = MessageStatus.DELETED;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testDELETEDShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.DELETED;
        MessageStatus calculatedValue = MessageStatus.fromValue("deleted");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDELETEDShouldDeserializeToString() {
     MessageStatus test = MessageStatus.DELETED;
      String expectedValue = "deleted";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
      @Test
    public void testUNKNOWNShouldWork() {

        MessageStatus test = MessageStatus.UNKNOWN;
         Assert.assertEquals(test.getClass(), MessageStatus.class);
    }

    @Test 
    public void testUNKNOWNShouldSerializeToEnum() {
    
        MessageStatus expectedValue = MessageStatus.UNKNOWN;
        MessageStatus calculatedValue = MessageStatus.fromValue("unknown");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testUNKNOWNShouldDeserializeToString() {
     MessageStatus test = MessageStatus.UNKNOWN;
      String expectedValue = "unknown";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
    
 }