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
 * Model tests for ConferenceParticipantResult
 */
 public class ConferenceParticipantResultTest {
    
    private final ConferenceParticipantResult model = new ConferenceParticipantResult(
    );
    
    
    /**
     * Test the property 'uri'
     */
    @Test
    public void uriTest() {
      
      
      model.setUri("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getUri());
      
      
    }
    /**
     * Test the property 'dateCreated'
     */
    @Test
    public void dateCreatedTest() {
      
      
      model.setDateCreated("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getDateCreated());
      
      
    }
    /**
     * Test the property 'dateUpdated'
     */
    @Test
    public void dateUpdatedTest() {
      
      
      model.setDateUpdated("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getDateUpdated());
      
      
    }
    /**
     * Test the property 'revision'
     */
    @Test
    public void revisionTest() {
      
      model.setRevision(1);
      Assert.assertEquals(1, (int) model.getRevision());
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
     * Test the property 'conferenceId'
     */
    @Test
    public void conferenceIdTest() {
      
      
      model.setConferenceId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getConferenceId());
      
      
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
     * Test the property 'talk'
     */
    @Test
    public void talkTest() {
      model.setTalk(false);
      Assert.assertEquals(false, model.getTalk());       
      
    }
    /**
     * Test the property 'listen'
     */
    @Test
    public void listenTest() {
      model.setListen(false);
      Assert.assertEquals(false, model.getListen());       
      
    }
    /**
     * Test the property 'dtmfPassThrough'
     */
    @Test
    public void dtmfPassThroughTest() {
      model.setDtmfPassThrough(false);
      Assert.assertEquals(false, model.getDtmfPassThrough());       
      
    }
    /**
     * Test the property 'startConfOnEnter'
     */
    @Test
    public void startConfOnEnterTest() {
      model.setStartConfOnEnter(false);
      Assert.assertEquals(false, model.getStartConfOnEnter());       
      
    }

      /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      ConferenceParticipantResult test1 = new ConferenceParticipantResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setCallId("TS");
      
      test1.setTalk(true);
      test1.setListen(true);
      test1.setDtmfPassThrough(true);
      test1.setStartConfOnEnter(true);
      ConferenceParticipantResult test2 = new ConferenceParticipantResult();
        
        
      test2.setUri("TS");
      
        
        
      test2.setDateCreated("TS");
      
        
        
      test2.setDateUpdated("TS");
      
      test2.setRevision(1);
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setConferenceId("TS");
      
        
        
      test2.setCallId("TS");
      
      test2.setTalk(true);
      test2.setListen(true);
      test2.setDtmfPassThrough(true);
      test2.setStartConfOnEnter(true);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      ConferenceParticipantResult test1 = new ConferenceParticipantResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setCallId("TS");
      
      test1.setTalk(true);
      test1.setListen(true);
      test1.setDtmfPassThrough(true);
      test1.setStartConfOnEnter(true);
      ConferenceParticipantResult test2 = new ConferenceParticipantResult();
        
        
      test2.setUri("TS2");
      
        
        
      test2.setDateCreated("TS2");
      
        
        
      test2.setDateUpdated("TS2");
      
      test2.setRevision(0);
        
        
      test2.setAccountId("TS2");
      
        
        
      test2.setConferenceId("TS2");
      
        
        
      test2.setCallId("TS2");
      
      test2.setTalk(false);
      test2.setListen(false);
      test2.setDtmfPassThrough(false);
      test2.setStartConfOnEnter(false);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      ConferenceParticipantResult test1 = new ConferenceParticipantResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setCallId("TS");
      
      test1.setTalk(true);
      test1.setListen(true);
      test1.setDtmfPassThrough(true);
      test1.setStartConfOnEnter(true);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      ConferenceParticipantResult test1 = new ConferenceParticipantResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setCallId("TS");
      
      test1.setTalk(true);
      test1.setListen(true);
      test1.setDtmfPassThrough(true);
      test1.setStartConfOnEnter(true);
      ConferenceParticipantResult test2 = new ConferenceParticipantResult();
        
        
      test2.setUri("TS");
      
        
        
      test2.setDateCreated("TS");
      
        
        
      test2.setDateUpdated("TS");
      
      test2.setRevision(1);
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setConferenceId("TS");
      
        
        
      test2.setCallId("TS");
      
      test2.setTalk(true);
      test2.setListen(true);
      test2.setDtmfPassThrough(true);
      test2.setStartConfOnEnter(true);
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      ConferenceParticipantResult test1 = new ConferenceParticipantResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setCallId("TS");
      
      test1.setTalk(true);
      test1.setListen(true);
      test1.setDtmfPassThrough(true);
      test1.setStartConfOnEnter(true);
      ConferenceParticipantResult test2 = new ConferenceParticipantResult();
        
        
      test2.setUri("TS");
      
        
        
      test2.setDateCreated("TS");
      
        
        
      test2.setDateUpdated("TS");
      
      test2.setRevision(1);
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setConferenceId("TS");
      
        
        
      test2.setCallId("TS");
      
      test2.setTalk(true);
      test2.setListen(true);
      test2.setDtmfPassThrough(true);
      test2.setStartConfOnEnter(true);
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      ConferenceParticipantResult test1 = new ConferenceParticipantResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setConferenceId("TS");
      
        
        
      test1.setCallId("TS");
      
      test1.setTalk(true);
      test1.setListen(true);
      test1.setDtmfPassThrough(true);
      test1.setStartConfOnEnter(true);
      ConferenceParticipantResult test2 = new ConferenceParticipantResult();
        
        
      test2.setUri("TS2");
      
        
        
      test2.setDateCreated("TS2");
      
        
        
      test2.setDateUpdated("TS2");
      
      test2.setRevision(0);
        
        
      test2.setAccountId("TS2");
      
        
        
      test2.setConferenceId("TS2");
      
        
        
      test2.setCallId("TS2");
      
      test2.setTalk(false);
      test2.setListen(false);
      test2.setDtmfPassThrough(false);
      test2.setStartConfOnEnter(false);
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      ConferenceParticipantResult test1 = new ConferenceParticipantResult();
        
        
        test1.setUri("TS");
      
        
        
        test1.setDateCreated("TS");
      
        
        
        test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
        test1.setAccountId("TS");
      
        
        
        test1.setConferenceId("TS");
      
        
        
        test1.setCallId("TS");
      
      test1.setTalk(true);
      test1.setListen(true);
      test1.setDtmfPassThrough(true);
      test1.setStartConfOnEnter(true);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    
 }