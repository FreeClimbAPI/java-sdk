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
 * Model tests for SMSTenDLCBrandStockExchange
 */
 public class SMSTenDLCBrandStockExchangeTest {
    
    
    
    @Test
    public void testNONEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.NONE;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testNONEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.NONE;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("NONE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testNONEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.NONE;
      String expectedValue = "NONE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testNASDAQShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.NASDAQ;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testNASDAQShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.NASDAQ;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("NASDAQ");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testNASDAQShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.NASDAQ;
      String expectedValue = "NASDAQ";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testNYSEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.NYSE;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testNYSEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.NYSE;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("NYSE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testNYSEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.NYSE;
      String expectedValue = "NYSE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testAMEXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.AMEX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testAMEXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.AMEX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("AMEX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testAMEXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.AMEX;
      String expectedValue = "AMEX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testAMXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.AMX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testAMXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.AMX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("AMX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testAMXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.AMX;
      String expectedValue = "AMX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testASXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.ASX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testASXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.ASX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("ASX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testASXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.ASX;
      String expectedValue = "ASX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testB3ShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.B3;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testB3ShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.B3;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("B3");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testB3ShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.B3;
      String expectedValue = "B3";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testBMEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.BME;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testBMEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.BME;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("BME");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testBMEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.BME;
      String expectedValue = "BME";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testBSEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.BSE;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testBSEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.BSE;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("BSE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testBSEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.BSE;
      String expectedValue = "BSE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testFRAShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.FRA;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testFRAShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.FRA;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("FRA");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testFRAShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.FRA;
      String expectedValue = "FRA";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testICEXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.ICEX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testICEXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.ICEX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("ICEX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testICEXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.ICEX;
      String expectedValue = "ICEX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testJPXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.JPX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testJPXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.JPX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("JPX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testJPXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.JPX;
      String expectedValue = "JPX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testJSEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.JSE;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testJSEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.JSE;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("JSE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testJSEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.JSE;
      String expectedValue = "JSE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testKRXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.KRX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testKRXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.KRX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("KRX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testKRXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.KRX;
      String expectedValue = "KRX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testLONShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.LON;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testLONShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.LON;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("LON");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testLONShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.LON;
      String expectedValue = "LON";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testNSEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.NSE;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testNSEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.NSE;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("NSE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testNSEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.NSE;
      String expectedValue = "NSE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testOMXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.OMX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testOMXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.OMX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("OMX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testOMXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.OMX;
      String expectedValue = "OMX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testSEHKShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SEHK;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testSEHKShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.SEHK;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("SEHK");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSEHKShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SEHK;
      String expectedValue = "SEHK";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testSGXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SGX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testSGXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.SGX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("SGX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSGXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SGX;
      String expectedValue = "SGX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testSSEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SSE;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testSSEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.SSE;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("SSE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSSEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SSE;
      String expectedValue = "SSE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testSTOShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.STO;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testSTOShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.STO;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("STO");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSTOShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.STO;
      String expectedValue = "STO";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testSWXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SWX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testSWXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.SWX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("SWX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSWXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SWX;
      String expectedValue = "SWX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testSZSEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SZSE;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testSZSEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.SZSE;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("SZSE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSZSEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.SZSE;
      String expectedValue = "SZSE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testTSXShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.TSX;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testTSXShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.TSX;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("TSX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testTSXShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.TSX;
      String expectedValue = "TSX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testTWSEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.TWSE;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testTWSEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.TWSE;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("TWSE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testTWSEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.TWSE;
      String expectedValue = "TWSE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testVSEShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.VSE;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testVSEShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.VSE;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("VSE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testVSEShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.VSE;
      String expectedValue = "VSE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testOTHERShouldWork() {

        SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.OTHER;
         Assert.assertEquals(test.getClass(), SMSTenDLCBrandStockExchange.class);
    }

    @Test 
    public void testOTHERShouldSerializeToEnum() {
    
        SMSTenDLCBrandStockExchange expectedValue = SMSTenDLCBrandStockExchange.OTHER;
        SMSTenDLCBrandStockExchange calculatedValue = SMSTenDLCBrandStockExchange.fromValue("OTHER");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testOTHERShouldDeserializeToString() {
     SMSTenDLCBrandStockExchange test = SMSTenDLCBrandStockExchange.OTHER;
      String expectedValue = "OTHER";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
    
    
 }