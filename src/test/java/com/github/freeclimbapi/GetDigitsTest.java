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
 * Model tests for GetDigits
 */
 public class GetDigitsTest {
    private final GetDigits model = new GetDigits();

    /**
     * Test the property 'actionUrl'
     */
    @Test
    public void actionUrlTest() {
      
        
        model.setActionUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getActionUrl());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'digitTimeoutMs'
     */
    @Test
    public void digitTimeoutMsTest() {
      
        

        
        
        
        

      
  
      model.setDigitTimeoutMs(1);
      Assert.assertEquals(1, (int) model.getDigitTimeoutMs());

  }


    /**
     * Test the property 'finishOnKey'
     */
    @Test
    public void finishOnKeyTest() {
      
        
        model.setFinishOnKey("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getFinishOnKey());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'flushBuffer'
     */
    @Test
    public void flushBufferTest() {
      
        model.setFlushBuffer(false);
        Assert.assertEquals(false, model.getFlushBuffer());       
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'initialTimeoutMs'
     */
    @Test
    public void initialTimeoutMsTest() {
      
        
        model.setInitialTimeoutMs("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getInitialTimeoutMs());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'maxDigits'
     */
    @Test
    public void maxDigitsTest() {
      
        

        
        
        
        

      
  
      model.setMaxDigits(1);
      Assert.assertEquals(1, (int) model.getMaxDigits());

  }


    /**
     * Test the property 'minDigits'
     */
    @Test
    public void minDigitsTest() {
      
        

        
        
        
        

      
  
      model.setMinDigits(1);
      Assert.assertEquals(1, (int) model.getMinDigits());

  }


    /**
     * Test the property 'prompts'
     */
    @Test
    public void promptsTest() {
      
        

        
        
        
        

      
  
    List<PerclCommand> testList = new ArrayList<PerclCommand>();
    model.setPrompts(testList);
    Assert.assertEquals(testList, model.getPrompts()); 

  }


    /**
     * Test the property 'privacyMode'
     */
    @Test
    public void privacyModeTest() {
      
        model.setPrivacyMode(false);
        Assert.assertEquals(false, model.getPrivacyMode());       
        

        
        
        
        

      
  

  }





    @Test
    public void buildTest() throws Exception {
        
          
        model.setActionUrl("TEST_STRING");
          
        
         
         
        
         
          
        model.setFinishOnKey("TEST_STRING");
          
        
         
        model.setFlushBuffer(false);
         
        
         
          
        model.setInitialTimeoutMs("TEST_STRING");
          
        
         
         
        
         
         
        
         
         
        
         
        model.setPrivacyMode(false);
         
        
         
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("actionUrl"), model.getActionUrl());
        Assert.assertEquals(attributes.get("digitTimeoutMs"), model.getDigitTimeoutMs());
        Assert.assertEquals(attributes.get("finishOnKey"), model.getFinishOnKey());
        Assert.assertEquals(attributes.get("flushBuffer"), model.getFlushBuffer());
        Assert.assertEquals(attributes.get("initialTimeoutMs"), model.getInitialTimeoutMs());
        Assert.assertEquals(attributes.get("maxDigits"), model.getMaxDigits());
        Assert.assertEquals(attributes.get("minDigits"), model.getMinDigits());
        Assert.assertEquals(attributes.get("prompts"), model.getPrompts());
        Assert.assertEquals(attributes.get("privacyMode"), model.getPrivacyMode());

    }
 }