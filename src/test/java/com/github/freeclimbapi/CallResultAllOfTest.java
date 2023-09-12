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
 * Model tests for CallResultAllOf
 */
 public class CallResultAllOfTest {
    private final CallResultAllOf model = new CallResultAllOf();

    /**
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {
      model.setCallId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getCallId());
      
    }

    /**
     * Test the property 'parentCallId'
     */
    @Test
    public void parentCallIdTest() {
      model.setParentCallId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getParentCallId());
      
    }

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
      model.setAccountId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getAccountId());
      
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
     * Test the property 'phoneNumberId'
     */
    @Test
    public void phoneNumberIdTest() {
      model.setPhoneNumberId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getPhoneNumberId());
      
    }

    /**
     * Test the property 'callStatus'
     */
    @Test
    public void callStatusTest() {
      model.setCallStatus(CallStatus.QUEUED);
      Assert.assertEquals(model.getCallStatus(),CallStatus.QUEUED);
      model.setCallStatus(CallStatus.RINGING);
      Assert.assertEquals(model.getCallStatus(),CallStatus.RINGING);
      model.setCallStatus(CallStatus.IN_PROGRESS);
      Assert.assertEquals(model.getCallStatus(),CallStatus.IN_PROGRESS);
      model.setCallStatus(CallStatus.CANCELED);
      Assert.assertEquals(model.getCallStatus(),CallStatus.CANCELED);
      model.setCallStatus(CallStatus.COMPLETED);
      Assert.assertEquals(model.getCallStatus(),CallStatus.COMPLETED);
      model.setCallStatus(CallStatus.FAILED);
      Assert.assertEquals(model.getCallStatus(),CallStatus.FAILED);
      model.setCallStatus(CallStatus.BUSY);
      Assert.assertEquals(model.getCallStatus(),CallStatus.BUSY);
      model.setCallStatus(CallStatus.NO_ANSWER);
      Assert.assertEquals(model.getCallStatus(),CallStatus.NO_ANSWER);
      
    }

    /**
     * Test the property 'startTime'
     */
    @Test
    public void startTimeTest() {
      model.setStartTime("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getStartTime());
      
    }

    /**
     * Test the property 'connectTime'
     */
    @Test
    public void connectTimeTest() {
      model.setConnectTime("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getConnectTime());
      
    }

    /**
     * Test the property 'endTime'
     */
    @Test
    public void endTimeTest() {
      model.setEndTime("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getEndTime());
      
    }

    /**
     * Test the property 'duration'
     */
    @Test
    public void durationTest() {
      
      model.setDuration(1);
      Assert.assertEquals(1, (int) model.getDuration());
    }

    /**
     * Test the property 'connectDuration'
     */
    @Test
    public void connectDurationTest() {
      
      model.setConnectDuration(1);
      Assert.assertEquals(1, (int) model.getConnectDuration());
    }

    /**
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {
      model.setDirection(CallDirection.INBOUND);
      Assert.assertEquals(model.getDirection(),CallDirection.INBOUND);
      model.setDirection(CallDirection.OUTBOUND_API);
      Assert.assertEquals(model.getDirection(),CallDirection.OUTBOUND_API);
      model.setDirection(CallDirection.OUTBOUND_DIAL);
      Assert.assertEquals(model.getDirection(),CallDirection.OUTBOUND_DIAL);
      
    }

    /**
     * Test the property 'answeredBy'
     */
    @Test
    public void answeredByTest() {
      model.setAnsweredBy(AnsweredBy.HUMAN);
      Assert.assertEquals(model.getAnsweredBy(),AnsweredBy.HUMAN);
      model.setAnsweredBy(AnsweredBy.MACHINE);
      Assert.assertEquals(model.getAnsweredBy(),AnsweredBy.MACHINE);
      
    }

    /**
     * Test the property 'subresourceUris'
     */
    @Test
    public void subresourceUrisTest() {
      Object testObject = new Object();
      model.setSubresourceUris(testObject);
      Assert.assertEquals(testObject, model.getSubresourceUris());
      
    }

      /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      CallResultAllOf test1 = new CallResultAllOf();
      test1.setCallId("TS");
      test1.setParentCallId("TS");
      test1.setAccountId("TS");
      test1.setFrom("TS");
      test1.setTo("TS");
      test1.setPhoneNumberId("TS");
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setStartTime("TS");
      test1.setConnectTime("TS");
      test1.setEndTime("TS");
      test1.setDuration(1);
      test1.setConnectDuration(1);
      test1.setDirection(CallDirection.INBOUND);
      test1.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      CallResultAllOf test2 = new CallResultAllOf();
      test2.setCallId("TS");
      test2.setParentCallId("TS");
      test2.setAccountId("TS");
      test2.setFrom("TS");
      test2.setTo("TS");
      test2.setPhoneNumberId("TS");
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setStartTime("TS");
      test2.setConnectTime("TS");
      test2.setEndTime("TS");
      test2.setDuration(1);
      test2.setConnectDuration(1);
      test2.setDirection(CallDirection.INBOUND);
      test2.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject2 = testObject;
      test2.setSubresourceUris(testObject2);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      CallResultAllOf test1 = new CallResultAllOf();
      test1.setCallId("TS");
      test1.setParentCallId("TS");
      test1.setAccountId("TS");
      test1.setFrom("TS");
      test1.setTo("TS");
      test1.setPhoneNumberId("TS");
      test1.setCallStatus(CallStatus.RINGING);
      test1.setStartTime("TS");
      test1.setConnectTime("TS");
      test1.setEndTime("TS");
      test1.setDuration(1);
      test1.setConnectDuration(1);
      test1.setDirection(CallDirection.OUTBOUND_API);
      test1.setAnsweredBy(AnsweredBy.MACHINE);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      CallResultAllOf test2 = new CallResultAllOf();
      test2.setCallId("tS");
      test2.setParentCallId("tS");
      test2.setAccountId("tS");
      test2.setFrom("tS");
      test2.setTo("tS");
      test2.setPhoneNumberId("tS");
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setStartTime("tS");
      test2.setConnectTime("tS");
      test2.setEndTime("tS");
      test2.setDuration(0);
      test2.setConnectDuration(0);
      test2.setDirection(CallDirection.INBOUND);
      test2.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject2 = new Object();
      test2.setSubresourceUris(testObject2);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      CallResultAllOf test1 = new CallResultAllOf();
      test1.setCallId("TS");
      test1.setParentCallId("TS");
      test1.setAccountId("TS");
      test1.setFrom("TS");
      test1.setTo("TS");
      test1.setPhoneNumberId("TS");
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setStartTime("TS");
      test1.setConnectTime("TS");
      test1.setEndTime("TS");
      test1.setDuration(1);
      test1.setConnectDuration(1);
      test1.setDirection(CallDirection.INBOUND);
      test1.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      CallResultAllOf test1 = new CallResultAllOf();
      test1.setCallId("TS");
      test1.setParentCallId("TS");
      test1.setAccountId("TS");
      test1.setFrom("TS");
      test1.setTo("TS");
      test1.setPhoneNumberId("TS");
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setStartTime("TS");
      test1.setConnectTime("TS");
      test1.setEndTime("TS");
      test1.setDuration(1);
      test1.setConnectDuration(1);
      test1.setDirection(CallDirection.INBOUND);
      test1.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      CallResultAllOf test2 = new CallResultAllOf();
      test2.setCallId("TS");
      test2.setParentCallId("TS");
      test2.setAccountId("TS");
      test2.setFrom("TS");
      test2.setTo("TS");
      test2.setPhoneNumberId("TS");
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setStartTime("TS");
      test2.setConnectTime("TS");
      test2.setEndTime("TS");
      test2.setDuration(1);
      test2.setConnectDuration(1);
      test2.setDirection(CallDirection.INBOUND);
      test2.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject2 = testObject;
      test2.setSubresourceUris(testObject2);
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      CallResultAllOf test1 = new CallResultAllOf();
      test1.setCallId("TS");
      test1.setParentCallId("TS");
      test1.setAccountId("TS");
      test1.setFrom("TS");
      test1.setTo("TS");
      test1.setPhoneNumberId("TS");
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setStartTime("TS");
      test1.setConnectTime("TS");
      test1.setEndTime("TS");
      test1.setDuration(1);
      test1.setConnectDuration(1);
      test1.setDirection(CallDirection.INBOUND);
      test1.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      CallResultAllOf test2 = new CallResultAllOf();
      test2.setCallId("TS");
      test2.setParentCallId("TS");
      test2.setAccountId("TS");
      test2.setFrom("TS");
      test2.setTo("TS");
      test2.setPhoneNumberId("TS");
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setStartTime("TS");
      test2.setConnectTime("TS");
      test2.setEndTime("TS");
      test2.setDuration(1);
      test2.setConnectDuration(1);
      test2.setDirection(CallDirection.INBOUND);
      test2.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject2 = testObject;
      test2.setSubresourceUris(testObject2);
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      CallResultAllOf test1 = new CallResultAllOf();
      test1.setCallId("TS");
      test1.setParentCallId("TS");
      test1.setAccountId("TS");
      test1.setFrom("TS");
      test1.setTo("TS");
      test1.setPhoneNumberId("TS");
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setStartTime("TS");
      test1.setConnectTime("TS");
      test1.setEndTime("TS");
      test1.setDuration(1);
      test1.setConnectDuration(1);
      test1.setDirection(CallDirection.INBOUND);
      test1.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      CallResultAllOf test2 = new CallResultAllOf();
      test2.setCallId("tS");
      test2.setParentCallId("tS");
      test2.setAccountId("tS");
      test2.setFrom("tS");
      test2.setTo("tS");
      test2.setPhoneNumberId("tS");
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setStartTime("tS");
      test2.setConnectTime("tS");
      test2.setEndTime("tS");
      test2.setDuration(0);
      test2.setConnectDuration(0);
      test2.setDirection(CallDirection.INBOUND);
      test2.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject2 = new Object();
      test2.setSubresourceUris(testObject2);
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      CallResultAllOf test1 = new CallResultAllOf();
      test1.setCallId("TS");
      test1.setParentCallId("TS");
      test1.setAccountId("TS");
      test1.setFrom("TS");
      test1.setTo("TS");
      test1.setPhoneNumberId("TS");
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setStartTime("TS");
      test1.setConnectTime("TS");
      test1.setEndTime("TS");
      test1.setDuration(1);
      test1.setConnectDuration(1);
      test1.setDirection(CallDirection.INBOUND);
      test1.setAnsweredBy(AnsweredBy.HUMAN);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }