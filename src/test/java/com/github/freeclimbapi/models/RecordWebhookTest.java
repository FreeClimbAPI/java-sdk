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
 * Model tests for RecordWebhook
 */
 public class RecordWebhookTest {
    
    private final RecordWebhook model = new RecordWebhook(
    );
    
    
    /**
     * Test the property 'requestType'
     */
    @Test
    public void requestTypeTest() {
      
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
     * Test the property 'callId'
     */
    @Test
    public void callIdTest() {
      
      
      model.setCallId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getCallId());
      
      
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
     * Test the property 'recordingId'
     */
    @Test
    public void recordingIdTest() {
      
      
      model.setRecordingId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getRecordingId());
      
      
    }
    /**
     * Test the property 'recordingUrl'
     */
    @Test
    public void recordingUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setRecordingUrl(uri);
        Assert.assertEquals(uri, model.getRecordingUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    /**
     * Test the property 'recordingSize'
     */
    @Test
    public void recordingSizeTest() {
      
      
      model.setRecordingSize("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getRecordingSize());
      
      
    }
    /**
     * Test the property 'recordingFormat'
     */
    @Test
    public void recordingFormatTest() {
      
      
      model.setRecordingFormat("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getRecordingFormat());
      
      
    }
    /**
     * Test the property 'recordingDurationSec'
     */
    @Test
    public void recordingDurationSecTest() {
      
      model.setRecordingDurationSec(1);
      Assert.assertEquals(1, (int) model.getRecordingDurationSec());
    }
    /**
     * Test the property 'termReason'
     */
    @Test
    public void termReasonTest() {
      model.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
      Assert.assertEquals(model.getTermReason(),RecordUtteranceTermReason.FINISH_KEY);
      model.setTermReason(RecordUtteranceTermReason.TIMEOUT);
      Assert.assertEquals(model.getTermReason(),RecordUtteranceTermReason.TIMEOUT);
      model.setTermReason(RecordUtteranceTermReason.HANGUP);
      Assert.assertEquals(model.getTermReason(),RecordUtteranceTermReason.HANGUP);
      model.setTermReason(RecordUtteranceTermReason.MAX_LENGTH);
      Assert.assertEquals(model.getTermReason(),RecordUtteranceTermReason.MAX_LENGTH);
      
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
      RecordWebhook test1 = new RecordWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
        
        
      test1.setRecordingId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setRecordingUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setRecordingSize("TS");
      
        
        
      test1.setRecordingFormat("TS");
      
      test1.setRecordingDurationSec(1);
      test1.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
      test1.setParentCallId("TS");
      
      test1.setPrivacyMode(true);
      RecordWebhook test2 = new RecordWebhook();
        
        
      test2.setRequestType("TS");
      
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setCallId("TS");
      
        
        
      test2.setFrom("TS");
      
        
        
      test2.setTo("TS");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS");
      
        
        
      test2.setQueueId("TS");
      
        
        
      test2.setRecordingId("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setRecordingUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setRecordingSize("TS");
      
        
        
      test2.setRecordingFormat("TS");
      
      test2.setRecordingDurationSec(1);
      test2.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
      test2.setParentCallId("TS");
      
      test2.setPrivacyMode(true);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      RecordWebhook test1 = new RecordWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.RINGING);
      test1.setDirection(CallDirection.OUTBOUND_API);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
        
        
      test1.setRecordingId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setRecordingUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setRecordingSize("TS");
      
        
        
      test1.setRecordingFormat("TS");
      
      test1.setRecordingDurationSec(1);
      test1.setTermReason(RecordUtteranceTermReason.TIMEOUT);
        
        
      test1.setParentCallId("TS");
      
      test1.setPrivacyMode(true);
      RecordWebhook test2 = new RecordWebhook();
        
        
      test2.setRequestType("TS2");
      
        
        
      test2.setAccountId("TS2");
      
        
        
      test2.setCallId("TS2");
      
        
        
      test2.setFrom("TS2");
      
        
        
      test2.setTo("TS2");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS2");
      
        
        
      test2.setQueueId("TS2");
      
        
        
      test2.setRecordingId("TS2");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setRecordingUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setRecordingSize("TS2");
      
        
        
      test2.setRecordingFormat("TS2");
      
      test2.setRecordingDurationSec(0);
      test2.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
      test2.setParentCallId("TS2");
      
      test2.setPrivacyMode(false);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      RecordWebhook test1 = new RecordWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
        
        
      test1.setRecordingId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setRecordingUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setRecordingSize("TS");
      
        
        
      test1.setRecordingFormat("TS");
      
      test1.setRecordingDurationSec(1);
      test1.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
      test1.setParentCallId("TS");
      
      test1.setPrivacyMode(true);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      RecordWebhook test1 = new RecordWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
        
        
      test1.setRecordingId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setRecordingUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setRecordingSize("TS");
      
        
        
      test1.setRecordingFormat("TS");
      
      test1.setRecordingDurationSec(1);
      test1.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
      test1.setParentCallId("TS");
      
      test1.setPrivacyMode(true);
      RecordWebhook test2 = new RecordWebhook();
        
        
      test2.setRequestType("TS");
      
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setCallId("TS");
      
        
        
      test2.setFrom("TS");
      
        
        
      test2.setTo("TS");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS");
      
        
        
      test2.setQueueId("TS");
      
        
        
      test2.setRecordingId("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setRecordingUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setRecordingSize("TS");
      
        
        
      test2.setRecordingFormat("TS");
      
      test2.setRecordingDurationSec(1);
      test2.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
      test2.setParentCallId("TS");
      
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
      RecordWebhook test1 = new RecordWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
        
        
      test1.setRecordingId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setRecordingUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setRecordingSize("TS");
      
        
        
      test1.setRecordingFormat("TS");
      
      test1.setRecordingDurationSec(1);
      test1.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
      test1.setParentCallId("TS");
      
      test1.setPrivacyMode(true);
      RecordWebhook test2 = new RecordWebhook();
        
        
      test2.setRequestType("TS");
      
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setCallId("TS");
      
        
        
      test2.setFrom("TS");
      
        
        
      test2.setTo("TS");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS");
      
        
        
      test2.setQueueId("TS");
      
        
        
      test2.setRecordingId("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setRecordingUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setRecordingSize("TS");
      
        
        
      test2.setRecordingFormat("TS");
      
      test2.setRecordingDurationSec(1);
      test2.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
      test2.setParentCallId("TS");
      
      test2.setPrivacyMode(true);
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      RecordWebhook test1 = new RecordWebhook();
        
        
      test1.setRequestType("TS");
      
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setCallId("TS");
      
        
        
      test1.setFrom("TS");
      
        
        
      test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.RINGING);
      test1.setDirection(CallDirection.OUTBOUND_API);
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setQueueId("TS");
      
        
        
      test1.setRecordingId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setRecordingUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setRecordingSize("TS");
      
        
        
      test1.setRecordingFormat("TS");
      
      test1.setRecordingDurationSec(1);
      test1.setTermReason(RecordUtteranceTermReason.TIMEOUT);
        
        
      test1.setParentCallId("TS");
      
      test1.setPrivacyMode(true);
      RecordWebhook test2 = new RecordWebhook();
        
        
      test2.setRequestType("TS2");
      
        
        
      test2.setAccountId("TS2");
      
        
        
      test2.setCallId("TS2");
      
        
        
      test2.setFrom("TS2");
      
        
        
      test2.setTo("TS2");
      
      test2.setCallStatus(CallStatus.QUEUED);
      test2.setDirection(CallDirection.INBOUND);
        
        
      test2.setConferenceId("TS2");
      
        
        
      test2.setQueueId("TS2");
      
        
        
      test2.setRecordingId("TS2");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setRecordingUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setRecordingSize("TS2");
      
        
        
      test2.setRecordingFormat("TS2");
      
      test2.setRecordingDurationSec(0);
      test2.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
      test2.setParentCallId("TS2");
      
      test2.setPrivacyMode(false);
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      RecordWebhook test1 = new RecordWebhook();
        
        
        test1.setRequestType("TS");
      
        
        
        test1.setAccountId("TS");
      
        
        
        test1.setCallId("TS");
      
        
        
        test1.setFrom("TS");
      
        
        
        test1.setTo("TS");
      
      test1.setCallStatus(CallStatus.QUEUED);
      test1.setDirection(CallDirection.INBOUND);
        
        
        test1.setConferenceId("TS");
      
        
        
        test1.setQueueId("TS");
      
        
        
        test1.setRecordingId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setRecordingUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
        test1.setRecordingSize("TS");
      
        
        
        test1.setRecordingFormat("TS");
      
      test1.setRecordingDurationSec(1);
      test1.setTermReason(RecordUtteranceTermReason.FINISH_KEY);
        
        
        test1.setParentCallId("TS");
      
      test1.setPrivacyMode(true);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void deserializeTest() {
      String json = "{ \"requestType\": \"record\" }";
      RecordWebhook webhookInstance = RecordWebhook.deserialize(json);
      Assert.assertTrue(webhookInstance instanceof RecordWebhook);
    }
    
 }