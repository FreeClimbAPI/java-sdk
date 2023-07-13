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
 * Model tests for OutDial
 */
 public class OutDialTest {
    private final OutDial model = new OutDial();

    /**
     * Test the property 'actionUrl'
     */
    @Test
    public void actionUrlTest() {
      
        
        model.setActionUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getActionUrl());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'callConnectUrl'
     */
    @Test
    public void callConnectUrlTest() {
      
        
        model.setCallConnectUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallConnectUrl());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'callingNumber'
     */
    @Test
    public void callingNumberTest() {
      
        
        model.setCallingNumber("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallingNumber());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'destination'
     */
    @Test
    public void destinationTest() {
      
        
        model.setDestination("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDestination());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'ifMachine'
     */
    @Test
    public void ifMachineTest() {
      
      model.setIfMachine(IfMachine.REDIRECT);
      Assert.assertEquals(model.getIfMachine(),IfMachine.REDIRECT);
      model.setIfMachine(IfMachine.HANGUP);
      Assert.assertEquals(model.getIfMachine(),IfMachine.HANGUP);
  

  }


    /**
     * Test the property 'ifMachineUrl'
     */
    @Test
    public void ifMachineUrlTest() {
      
        
        model.setIfMachineUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getIfMachineUrl());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'sendDigits'
     */
    @Test
    public void sendDigitsTest() {
      
        
        model.setSendDigits("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getSendDigits());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'statusCallbackUrl'
     */
    @Test
    public void statusCallbackUrlTest() {
      
        
        model.setStatusCallbackUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getStatusCallbackUrl());
        

        
        
        
        

      
  

  }


    /**
     * Test the property 'timeout'
     */
    @Test
    public void timeoutTest() {
      
        

        
        
        
        

      
  
      model.setTimeout(1);
      Assert.assertEquals(1, (int) model.getTimeout());

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
          
        
         
          
        model.setCallConnectUrl("TEST_STRING");
          
        
         
          
        model.setCallingNumber("TEST_STRING");
          
        
         
          
        model.setDestination("TEST_STRING");
          
        
         
         
        
         
          
        model.setIfMachineUrl("TEST_STRING");
          
        
         
          
        model.setSendDigits("TEST_STRING");
          
        
         
          
        model.setStatusCallbackUrl("TEST_STRING");
          
        
         
         
        
         
        model.setPrivacyMode(false);
         
        
         
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("actionUrl"), model.getActionUrl());
        Assert.assertEquals(attributes.get("callConnectUrl"), model.getCallConnectUrl());
        Assert.assertEquals(attributes.get("callingNumber"), model.getCallingNumber());
        Assert.assertEquals(attributes.get("destination"), model.getDestination());
        Assert.assertEquals(attributes.get("ifMachine"), model.getIfMachine());
        Assert.assertEquals(attributes.get("ifMachineUrl"), model.getIfMachineUrl());
        Assert.assertEquals(attributes.get("sendDigits"), model.getSendDigits());
        Assert.assertEquals(attributes.get("statusCallbackUrl"), model.getStatusCallbackUrl());
        Assert.assertEquals(attributes.get("timeout"), model.getTimeout());
        Assert.assertEquals(attributes.get("privacyMode"), model.getPrivacyMode());

    }
 }