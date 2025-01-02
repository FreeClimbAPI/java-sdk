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
 * Model tests for AddToQueueNotificationWebhook
 */
 public class AddToQueueNotificationWebhookTest {
    
    private final AddToQueueNotificationWebhook model = new AddToQueueNotificationWebhook(
    );
    
    
    /**
     * Test the property 'requestType'
     */
    @Test
    public void requestTypeTest() {
      
    }
    /**
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {
      
      
      model.setCallId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getCallId());
      
      
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
     * Test the property 'conferenceId'
     */
    @Test
    public void conferenceIdTest() {
      
      
      model.setConferenceId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getConferenceId());
      
      
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
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      AddToQueueNotificationWebhook test1 = new AddToQueueNotificationWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
      AddToQueueNotificationWebhook test2 = new AddToQueueNotificationWebhook();
        
        
      test2.setRequestType("TS");
      
        
        
      test2.setCallId("TS");
      
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setFrom("TS");
      
        
        
      test2.setTo("TS");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS");
      
        
        
      test2.setQueueId("TS");
      

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      AddToQueueNotificationWebhook test1 = new AddToQueueNotificationWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.RINGING);
      test1.setDirection(CallDirection.OUTBOUND_API);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
      AddToQueueNotificationWebhook test2 = new AddToQueueNotificationWebhook();
        
        
      test2.setRequestType("TS2");
      
        
        
      test2.setCallId("TS2");
      
        
        
      test2.setAccountId("TS2");
      
        
        
      test2.setFrom("TS2");
      
        
        
      test2.setTo("TS2");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS2");
      
        
        
      test2.setQueueId("TS2");
      

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      AddToQueueNotificationWebhook test1 = new AddToQueueNotificationWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      AddToQueueNotificationWebhook test1 = new AddToQueueNotificationWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
      AddToQueueNotificationWebhook test2 = new AddToQueueNotificationWebhook();
        
        
      test2.setRequestType("TS");
      
        
        
      test2.setCallId("TS");
      
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setFrom("TS");
      
        
        
      test2.setTo("TS");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS");
      
        
        
      test2.setQueueId("TS");
      
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      AddToQueueNotificationWebhook test1 = new AddToQueueNotificationWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
      AddToQueueNotificationWebhook test2 = new AddToQueueNotificationWebhook();
        
        
      test2.setRequestType("TS");
      
        
        
      test2.setCallId("TS");
      
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setFrom("TS");
      
        
        
      test2.setTo("TS");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS");
      
        
        
      test2.setQueueId("TS");
      
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      AddToQueueNotificationWebhook test1 = new AddToQueueNotificationWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.RINGING);
      test1.setDirection(CallDirection.OUTBOUND_API);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
      AddToQueueNotificationWebhook test2 = new AddToQueueNotificationWebhook();
        
        
      test2.setRequestType("TS2");
      
        
        
      test2.setCallId("TS2");
      
        
        
      test2.setAccountId("TS2");
      
        
        
      test2.setFrom("TS2");
      
        
        
      test2.setTo("TS2");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS2");
      
        
        
      test2.setQueueId("TS2");
      
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      AddToQueueNotificationWebhook test1 = new AddToQueueNotificationWebhook();
        
        
        test1.setRequestType("TS");
      
        
        
        test1.setCallId("TS");
      
        
        
        test1.setAccountId("TS");
      
        
        
        test1.setFrom("TS");
      
        
        
        test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
        test1.setConferenceId("TS");
      
        
        
        test1.setQueueId("TS");
      

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void deserializeTest() {
      String json = "{ \"requestType\": \"addToQueueNotification\" }";
      AddToQueueNotificationWebhook webhookInstance = AddToQueueNotificationWebhook.deserialize(json);
      Assert.assertTrue(webhookInstance instanceof AddToQueueNotificationWebhook);
    }
    
 }