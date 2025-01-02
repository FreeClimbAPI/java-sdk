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
 * Model tests for TranscribeReason
 */
 public class TranscribeReasonTest {
    
    
    
    @Test
    public void testINTERNAL_ERRORShouldWork() {

        TranscribeReason test = TranscribeReason.INTERNAL_ERROR;
         Assert.assertEquals(test.getClass(), TranscribeReason.class);
    }

    @Test 
    public void testINTERNAL_ERRORShouldSerializeToEnum() {
    
        TranscribeReason expectedValue = TranscribeReason.INTERNAL_ERROR;
        TranscribeReason calculatedValue = TranscribeReason.fromValue("internalError");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testINTERNAL_ERRORShouldDeserializeToString() {
     TranscribeReason test = TranscribeReason.INTERNAL_ERROR;
      String expectedValue = "internalError";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testHANGUPShouldWork() {

        TranscribeReason test = TranscribeReason.HANGUP;
         Assert.assertEquals(test.getClass(), TranscribeReason.class);
    }

    @Test 
    public void testHANGUPShouldSerializeToEnum() {
    
        TranscribeReason expectedValue = TranscribeReason.HANGUP;
        TranscribeReason calculatedValue = TranscribeReason.fromValue("hangup");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testHANGUPShouldDeserializeToString() {
     TranscribeReason test = TranscribeReason.HANGUP;
      String expectedValue = "hangup";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testMAX_LENGTHShouldWork() {

        TranscribeReason test = TranscribeReason.MAX_LENGTH;
         Assert.assertEquals(test.getClass(), TranscribeReason.class);
    }

    @Test 
    public void testMAX_LENGTHShouldSerializeToEnum() {
    
        TranscribeReason expectedValue = TranscribeReason.MAX_LENGTH;
        TranscribeReason calculatedValue = TranscribeReason.fromValue("maxLength");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testMAX_LENGTHShouldDeserializeToString() {
     TranscribeReason test = TranscribeReason.MAX_LENGTH;
      String expectedValue = "maxLength";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testDIGITShouldWork() {

        TranscribeReason test = TranscribeReason.DIGIT;
         Assert.assertEquals(test.getClass(), TranscribeReason.class);
    }

    @Test 
    public void testDIGITShouldSerializeToEnum() {
    
        TranscribeReason expectedValue = TranscribeReason.DIGIT;
        TranscribeReason calculatedValue = TranscribeReason.fromValue("digit");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIGITShouldDeserializeToString() {
     TranscribeReason test = TranscribeReason.DIGIT;
      String expectedValue = "digit";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testNO_INPUTShouldWork() {

        TranscribeReason test = TranscribeReason.NO_INPUT;
         Assert.assertEquals(test.getClass(), TranscribeReason.class);
    }

    @Test 
    public void testNO_INPUTShouldSerializeToEnum() {
    
        TranscribeReason expectedValue = TranscribeReason.NO_INPUT;
        TranscribeReason calculatedValue = TranscribeReason.fromValue("noInput");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testNO_INPUTShouldDeserializeToString() {
     TranscribeReason test = TranscribeReason.NO_INPUT;
      String expectedValue = "noInput";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
    
    
 }