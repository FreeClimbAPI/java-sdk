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
 * Model tests for SMSTenDLCBrandIdentityStatus
 */
 public class SMSTenDLCBrandIdentityStatusTest {
    
    
    
    @Test
    public void testSELF_DECLAREDShouldWork() {

        SMSTenDLCBrandIdentityStatus test = SMSTenDLCBrandIdentityStatus.SELF_DECLARED;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandIdentityStatus.class);
    }

    @Test 
    public void testSELF_DECLAREDShouldSerializeToEnum() {
    
        SMSTenDLCBrandIdentityStatus expectedValue = SMSTenDLCBrandIdentityStatus.SELF_DECLARED;
        SMSTenDLCBrandIdentityStatus calculatedValue = SMSTenDLCBrandIdentityStatus.fromValue("SELF_DECLARED");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSELF_DECLAREDShouldDeserializeToString() {
     SMSTenDLCBrandIdentityStatus test = SMSTenDLCBrandIdentityStatus.SELF_DECLARED;
      String expectedValue = "SELF_DECLARED";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testUNVERIFIEDShouldWork() {

        SMSTenDLCBrandIdentityStatus test = SMSTenDLCBrandIdentityStatus.UNVERIFIED;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandIdentityStatus.class);
    }

    @Test 
    public void testUNVERIFIEDShouldSerializeToEnum() {
    
        SMSTenDLCBrandIdentityStatus expectedValue = SMSTenDLCBrandIdentityStatus.UNVERIFIED;
        SMSTenDLCBrandIdentityStatus calculatedValue = SMSTenDLCBrandIdentityStatus.fromValue("UNVERIFIED");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testUNVERIFIEDShouldDeserializeToString() {
     SMSTenDLCBrandIdentityStatus test = SMSTenDLCBrandIdentityStatus.UNVERIFIED;
      String expectedValue = "UNVERIFIED";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testVERIFIEDShouldWork() {

        SMSTenDLCBrandIdentityStatus test = SMSTenDLCBrandIdentityStatus.VERIFIED;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandIdentityStatus.class);
    }

    @Test 
    public void testVERIFIEDShouldSerializeToEnum() {
    
        SMSTenDLCBrandIdentityStatus expectedValue = SMSTenDLCBrandIdentityStatus.VERIFIED;
        SMSTenDLCBrandIdentityStatus calculatedValue = SMSTenDLCBrandIdentityStatus.fromValue("VERIFIED");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testVERIFIEDShouldDeserializeToString() {
     SMSTenDLCBrandIdentityStatus test = SMSTenDLCBrandIdentityStatus.VERIFIED;
      String expectedValue = "VERIFIED";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testVETTED_VERIFIEDShouldWork() {

        SMSTenDLCBrandIdentityStatus test = SMSTenDLCBrandIdentityStatus.VETTED_VERIFIED;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandIdentityStatus.class);
    }

    @Test 
    public void testVETTED_VERIFIEDShouldSerializeToEnum() {
    
        SMSTenDLCBrandIdentityStatus expectedValue = SMSTenDLCBrandIdentityStatus.VETTED_VERIFIED;
        SMSTenDLCBrandIdentityStatus calculatedValue = SMSTenDLCBrandIdentityStatus.fromValue("VETTED_VERIFIED");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testVETTED_VERIFIEDShouldDeserializeToString() {
     SMSTenDLCBrandIdentityStatus test = SMSTenDLCBrandIdentityStatus.VETTED_VERIFIED;
      String expectedValue = "VETTED_VERIFIED";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
    
    
 }