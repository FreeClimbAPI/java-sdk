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
 * Model tests for RequestType
 */
 public class RequestTypeTest {
    
    
    
    @Test
    public void testINBOUND_CALLShouldWork() {

        RequestType test = RequestType.INBOUND_CALL;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testINBOUND_CALLShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.INBOUND_CALL;
        RequestType calculatedValue = RequestType.fromValue("inboundCall");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testINBOUND_CALLShouldDeserializeToString() {
     RequestType test = RequestType.INBOUND_CALL;
      String expectedValue = "inboundCall";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testRECORDShouldWork() {

        RequestType test = RequestType.RECORD;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testRECORDShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.RECORD;
        RequestType calculatedValue = RequestType.fromValue("record");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testRECORDShouldDeserializeToString() {
     RequestType test = RequestType.RECORD;
      String expectedValue = "record";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testGET_DIGITSShouldWork() {

        RequestType test = RequestType.GET_DIGITS;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testGET_DIGITSShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.GET_DIGITS;
        RequestType calculatedValue = RequestType.fromValue("getDigits");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testGET_DIGITSShouldDeserializeToString() {
     RequestType test = RequestType.GET_DIGITS;
      String expectedValue = "getDigits";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testGET_SPEECHShouldWork() {

        RequestType test = RequestType.GET_SPEECH;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testGET_SPEECHShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.GET_SPEECH;
        RequestType calculatedValue = RequestType.fromValue("getSpeech");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testGET_SPEECHShouldDeserializeToString() {
     RequestType test = RequestType.GET_SPEECH;
      String expectedValue = "getSpeech";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testREDIRECTShouldWork() {

        RequestType test = RequestType.REDIRECT;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testREDIRECTShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.REDIRECT;
        RequestType calculatedValue = RequestType.fromValue("redirect");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testREDIRECTShouldDeserializeToString() {
     RequestType test = RequestType.REDIRECT;
      String expectedValue = "redirect";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testPAUSEShouldWork() {

        RequestType test = RequestType.PAUSE;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testPAUSEShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.PAUSE;
        RequestType calculatedValue = RequestType.fromValue("pause");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testPAUSEShouldDeserializeToString() {
     RequestType test = RequestType.PAUSE;
      String expectedValue = "pause";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testOUT_DIAL_STARTShouldWork() {

        RequestType test = RequestType.OUT_DIAL_START;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testOUT_DIAL_STARTShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.OUT_DIAL_START;
        RequestType calculatedValue = RequestType.fromValue("outDialStart");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testOUT_DIAL_STARTShouldDeserializeToString() {
     RequestType test = RequestType.OUT_DIAL_START;
      String expectedValue = "outDialStart";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testOUT_DIAL_CONNECTShouldWork() {

        RequestType test = RequestType.OUT_DIAL_CONNECT;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testOUT_DIAL_CONNECTShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.OUT_DIAL_CONNECT;
        RequestType calculatedValue = RequestType.fromValue("outDialConnect");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testOUT_DIAL_CONNECTShouldDeserializeToString() {
     RequestType test = RequestType.OUT_DIAL_CONNECT;
      String expectedValue = "outDialConnect";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testOUT_DIAL_API_CONNECTShouldWork() {

        RequestType test = RequestType.OUT_DIAL_API_CONNECT;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testOUT_DIAL_API_CONNECTShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.OUT_DIAL_API_CONNECT;
        RequestType calculatedValue = RequestType.fromValue("outDialApiConnect");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testOUT_DIAL_API_CONNECTShouldDeserializeToString() {
     RequestType test = RequestType.OUT_DIAL_API_CONNECT;
      String expectedValue = "outDialApiConnect";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testMACHINE_DETECTEDShouldWork() {

        RequestType test = RequestType.MACHINE_DETECTED;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testMACHINE_DETECTEDShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.MACHINE_DETECTED;
        RequestType calculatedValue = RequestType.fromValue("machineDetected");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testMACHINE_DETECTEDShouldDeserializeToString() {
     RequestType test = RequestType.MACHINE_DETECTED;
      String expectedValue = "machineDetected";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testDEQUEUEShouldWork() {

        RequestType test = RequestType.DEQUEUE;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testDEQUEUEShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.DEQUEUE;
        RequestType calculatedValue = RequestType.fromValue("dequeue");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDEQUEUEShouldDeserializeToString() {
     RequestType test = RequestType.DEQUEUE;
      String expectedValue = "dequeue";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testQUEUE_WAITShouldWork() {

        RequestType test = RequestType.QUEUE_WAIT;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testQUEUE_WAITShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.QUEUE_WAIT;
        RequestType calculatedValue = RequestType.fromValue("queueWait");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testQUEUE_WAITShouldDeserializeToString() {
     RequestType test = RequestType.QUEUE_WAIT;
      String expectedValue = "queueWait";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testADD_TO_QUEUE_NOTIFICATIONShouldWork() {

        RequestType test = RequestType.ADD_TO_QUEUE_NOTIFICATION;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testADD_TO_QUEUE_NOTIFICATIONShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.ADD_TO_QUEUE_NOTIFICATION;
        RequestType calculatedValue = RequestType.fromValue("addToQueueNotification");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testADD_TO_QUEUE_NOTIFICATIONShouldDeserializeToString() {
     RequestType test = RequestType.ADD_TO_QUEUE_NOTIFICATION;
      String expectedValue = "addToQueueNotification";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testREMOVE_FROM_QUEUE_NOTIFICATIONShouldWork() {

        RequestType test = RequestType.REMOVE_FROM_QUEUE_NOTIFICATION;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testREMOVE_FROM_QUEUE_NOTIFICATIONShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.REMOVE_FROM_QUEUE_NOTIFICATION;
        RequestType calculatedValue = RequestType.fromValue("removeFromQueueNotification");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testREMOVE_FROM_QUEUE_NOTIFICATIONShouldDeserializeToString() {
     RequestType test = RequestType.REMOVE_FROM_QUEUE_NOTIFICATION;
      String expectedValue = "removeFromQueueNotification";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testCALL_STATUSShouldWork() {

        RequestType test = RequestType.CALL_STATUS;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testCALL_STATUSShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.CALL_STATUS;
        RequestType calculatedValue = RequestType.fromValue("callStatus");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testCALL_STATUSShouldDeserializeToString() {
     RequestType test = RequestType.CALL_STATUS;
      String expectedValue = "callStatus";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testCREATE_CONFERENCEShouldWork() {

        RequestType test = RequestType.CREATE_CONFERENCE;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testCREATE_CONFERENCEShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.CREATE_CONFERENCE;
        RequestType calculatedValue = RequestType.fromValue("createConference");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testCREATE_CONFERENCEShouldDeserializeToString() {
     RequestType test = RequestType.CREATE_CONFERENCE;
      String expectedValue = "createConference";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testCONFERENCE_STATUSShouldWork() {

        RequestType test = RequestType.CONFERENCE_STATUS;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testCONFERENCE_STATUSShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.CONFERENCE_STATUS;
        RequestType calculatedValue = RequestType.fromValue("conferenceStatus");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testCONFERENCE_STATUSShouldDeserializeToString() {
     RequestType test = RequestType.CONFERENCE_STATUS;
      String expectedValue = "conferenceStatus";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testLEAVE_CONFERENCEShouldWork() {

        RequestType test = RequestType.LEAVE_CONFERENCE;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testLEAVE_CONFERENCEShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.LEAVE_CONFERENCE;
        RequestType calculatedValue = RequestType.fromValue("leaveConference");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testLEAVE_CONFERENCEShouldDeserializeToString() {
     RequestType test = RequestType.LEAVE_CONFERENCE;
      String expectedValue = "leaveConference";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testADD_TO_CONFERENCE_NOTIFICATIONShouldWork() {

        RequestType test = RequestType.ADD_TO_CONFERENCE_NOTIFICATION;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testADD_TO_CONFERENCE_NOTIFICATIONShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.ADD_TO_CONFERENCE_NOTIFICATION;
        RequestType calculatedValue = RequestType.fromValue("addToConferenceNotification");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testADD_TO_CONFERENCE_NOTIFICATIONShouldDeserializeToString() {
     RequestType test = RequestType.ADD_TO_CONFERENCE_NOTIFICATION;
      String expectedValue = "addToConferenceNotification";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testCONFERENCE_RECORDING_STATUSShouldWork() {

        RequestType test = RequestType.CONFERENCE_RECORDING_STATUS;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testCONFERENCE_RECORDING_STATUSShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.CONFERENCE_RECORDING_STATUS;
        RequestType calculatedValue = RequestType.fromValue("conferenceRecordingStatus");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testCONFERENCE_RECORDING_STATUSShouldDeserializeToString() {
     RequestType test = RequestType.CONFERENCE_RECORDING_STATUS;
      String expectedValue = "conferenceRecordingStatus";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testCONFERENCE_CALL_CONTROLShouldWork() {

        RequestType test = RequestType.CONFERENCE_CALL_CONTROL;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testCONFERENCE_CALL_CONTROLShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.CONFERENCE_CALL_CONTROL;
        RequestType calculatedValue = RequestType.fromValue("conferenceCallControl");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testCONFERENCE_CALL_CONTROLShouldDeserializeToString() {
     RequestType test = RequestType.CONFERENCE_CALL_CONTROL;
      String expectedValue = "conferenceCallControl";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testMESSAGE_DELIVERYShouldWork() {

        RequestType test = RequestType.MESSAGE_DELIVERY;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testMESSAGE_DELIVERYShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.MESSAGE_DELIVERY;
        RequestType calculatedValue = RequestType.fromValue("messageDelivery");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testMESSAGE_DELIVERYShouldDeserializeToString() {
     RequestType test = RequestType.MESSAGE_DELIVERY;
      String expectedValue = "messageDelivery";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testMESSAGE_STATUSShouldWork() {

        RequestType test = RequestType.MESSAGE_STATUS;
         Assert.assertEquals(test.getClass(), RequestType.class);
    }

    @Test 
    public void testMESSAGE_STATUSShouldSerializeToEnum() {
    
        RequestType expectedValue = RequestType.MESSAGE_STATUS;
        RequestType calculatedValue = RequestType.fromValue("messageStatus");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testMESSAGE_STATUSShouldDeserializeToString() {
     RequestType test = RequestType.MESSAGE_STATUS;
      String expectedValue = "messageStatus";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
    
    
 }