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
 * Model tests for ConferenceStatus
 */
 public class ConferenceStatusTest {
    
    
    
    @Test
    public void testEMPTYShouldWork() {

        ConferenceStatus test = ConferenceStatus.EMPTY;
         Assert.assertEquals(test.getClass(), ConferenceStatus.class);
    }

    @Test 
    public void testEMPTYShouldSerializeToEnum() {
    
        ConferenceStatus expectedValue = ConferenceStatus.EMPTY;
        ConferenceStatus calculatedValue = ConferenceStatus.fromValue("empty");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testEMPTYShouldDeserializeToString() {
     ConferenceStatus test = ConferenceStatus.EMPTY;
      String expectedValue = "empty";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testPOPULATEDShouldWork() {

        ConferenceStatus test = ConferenceStatus.POPULATED;
         Assert.assertEquals(test.getClass(), ConferenceStatus.class);
    }

    @Test 
    public void testPOPULATEDShouldSerializeToEnum() {
    
        ConferenceStatus expectedValue = ConferenceStatus.POPULATED;
        ConferenceStatus calculatedValue = ConferenceStatus.fromValue("populated");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testPOPULATEDShouldDeserializeToString() {
     ConferenceStatus test = ConferenceStatus.POPULATED;
      String expectedValue = "populated";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testIN_PROGRESSShouldWork() {

        ConferenceStatus test = ConferenceStatus.IN_PROGRESS;
         Assert.assertEquals(test.getClass(), ConferenceStatus.class);
    }

    @Test 
    public void testIN_PROGRESSShouldSerializeToEnum() {
    
        ConferenceStatus expectedValue = ConferenceStatus.IN_PROGRESS;
        ConferenceStatus calculatedValue = ConferenceStatus.fromValue("inProgress");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testIN_PROGRESSShouldDeserializeToString() {
     ConferenceStatus test = ConferenceStatus.IN_PROGRESS;
      String expectedValue = "inProgress";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testTERMINATEDShouldWork() {

        ConferenceStatus test = ConferenceStatus.TERMINATED;
         Assert.assertEquals(test.getClass(), ConferenceStatus.class);
    }

    @Test 
    public void testTERMINATEDShouldSerializeToEnum() {
    
        ConferenceStatus expectedValue = ConferenceStatus.TERMINATED;
        ConferenceStatus calculatedValue = ConferenceStatus.fromValue("terminated");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testTERMINATEDShouldDeserializeToString() {
     ConferenceStatus test = ConferenceStatus.TERMINATED;
      String expectedValue = "terminated";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
    
    
 }