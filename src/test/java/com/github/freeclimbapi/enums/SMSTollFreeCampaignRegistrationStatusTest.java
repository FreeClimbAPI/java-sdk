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
 * Model tests for SMSTollFreeCampaignRegistrationStatus
 */
 public class SMSTollFreeCampaignRegistrationStatusTest {
    
    
    
    @Test
    public void testUNREGISTEREDShouldWork() {

        SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.UNREGISTERED;
         Assert.assertEquals(test.getClass(), SMSTollFreeCampaignRegistrationStatus.class);
    }

    @Test 
    public void testUNREGISTEREDShouldSerializeToEnum() {
    
        SMSTollFreeCampaignRegistrationStatus expectedValue = SMSTollFreeCampaignRegistrationStatus.UNREGISTERED;
        SMSTollFreeCampaignRegistrationStatus calculatedValue = SMSTollFreeCampaignRegistrationStatus.fromValue("UNREGISTERED");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testUNREGISTEREDShouldDeserializeToString() {
     SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.UNREGISTERED;
      String expectedValue = "UNREGISTERED";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testINITIATEDShouldWork() {

        SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.INITIATED;
         Assert.assertEquals(test.getClass(), SMSTollFreeCampaignRegistrationStatus.class);
    }

    @Test 
    public void testINITIATEDShouldSerializeToEnum() {
    
        SMSTollFreeCampaignRegistrationStatus expectedValue = SMSTollFreeCampaignRegistrationStatus.INITIATED;
        SMSTollFreeCampaignRegistrationStatus calculatedValue = SMSTollFreeCampaignRegistrationStatus.fromValue("INITIATED");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testINITIATEDShouldDeserializeToString() {
     SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.INITIATED;
      String expectedValue = "INITIATED";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testPENDINGShouldWork() {

        SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.PENDING;
         Assert.assertEquals(test.getClass(), SMSTollFreeCampaignRegistrationStatus.class);
    }

    @Test 
    public void testPENDINGShouldSerializeToEnum() {
    
        SMSTollFreeCampaignRegistrationStatus expectedValue = SMSTollFreeCampaignRegistrationStatus.PENDING;
        SMSTollFreeCampaignRegistrationStatus calculatedValue = SMSTollFreeCampaignRegistrationStatus.fromValue("PENDING");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testPENDINGShouldDeserializeToString() {
     SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.PENDING;
      String expectedValue = "PENDING";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testDECLINEDShouldWork() {

        SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.DECLINED;
         Assert.assertEquals(test.getClass(), SMSTollFreeCampaignRegistrationStatus.class);
    }

    @Test 
    public void testDECLINEDShouldSerializeToEnum() {
    
        SMSTollFreeCampaignRegistrationStatus expectedValue = SMSTollFreeCampaignRegistrationStatus.DECLINED;
        SMSTollFreeCampaignRegistrationStatus calculatedValue = SMSTollFreeCampaignRegistrationStatus.fromValue("DECLINED");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDECLINEDShouldDeserializeToString() {
     SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.DECLINED;
      String expectedValue = "DECLINED";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testREGISTEREDShouldWork() {

        SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.REGISTERED;
         Assert.assertEquals(test.getClass(), SMSTollFreeCampaignRegistrationStatus.class);
    }

    @Test 
    public void testREGISTEREDShouldSerializeToEnum() {
    
        SMSTollFreeCampaignRegistrationStatus expectedValue = SMSTollFreeCampaignRegistrationStatus.REGISTERED;
        SMSTollFreeCampaignRegistrationStatus calculatedValue = SMSTollFreeCampaignRegistrationStatus.fromValue("REGISTERED");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testREGISTEREDShouldDeserializeToString() {
     SMSTollFreeCampaignRegistrationStatus test = SMSTollFreeCampaignRegistrationStatus.REGISTERED;
      String expectedValue = "REGISTERED";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
    
    
 }