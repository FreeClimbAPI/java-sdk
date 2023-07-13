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
 * Model tests for LogResult
 */
 public class LogResultTest {
    private final LogResult model = new LogResult();

    /**
     * Test the property 'timestamp'
     */
    @Test
    public void timestampTest() {
      
        

        
        
        
        

      
  
      model.setTimestamp(1);
      Assert.assertEquals(1, (int) model.getTimestamp());

  }


    /**
     * Test the property 'level'
     */
    @Test
    public void levelTest() {
      
      model.setLevel(LogLevel.INFO);
      Assert.assertEquals(model.getLevel(),LogLevel.INFO);
      model.setLevel(LogLevel.WARNING);
      Assert.assertEquals(model.getLevel(),LogLevel.WARNING);
      model.setLevel(LogLevel.ERROR);
      Assert.assertEquals(model.getLevel(),LogLevel.ERROR);
  

  }


    /**
     * Test the property 'requestId'
     */
    @Test
    public void requestIdTest() {
      
        
        model.setRequestId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getRequestId());
        

        
        
        
        

      
  

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
     * Test the property 'message'
     */
    @Test
    public void messageTest() {
      
        
        model.setMessage("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getMessage());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
      
        

        
        
        
        
          Object testObject = new Object();
          model.setMetadata(testObject);
          Assert.assertEquals(testObject, model.getMetadata());
        

      
  

  }





 }