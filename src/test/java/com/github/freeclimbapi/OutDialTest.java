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
    private final OutDial model = new OutDial(
    );
    
    
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

      /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      OutDial test1 = new OutDial();
        
      test1.setActionUrl("TS");
        
        
        
      test1.setCallConnectUrl("TS");
        
        
        
        
      test1.setCallingNumber("TS");
      
        
        
      test1.setDestination("TS");
      
      test1.setIfMachine(IfMachine.REDIRECT);
        
        
      test1.setIfMachineUrl("TS");
      
        
        
      test1.setSendDigits("TS");
      
        
        
      test1.setStatusCallbackUrl("TS");
      
      test1.setTimeout(1);
      test1.setPrivacyMode(true);
      OutDial test2 = new OutDial();
        
      test2.setActionUrl("TS");
        
        
        
      test2.setCallConnectUrl("TS");
        
        
        
        
      test2.setCallingNumber("TS");
      
        
        
      test2.setDestination("TS");
      
      test2.setIfMachine(IfMachine.REDIRECT);
        
        
      test2.setIfMachineUrl("TS");
      
        
        
      test2.setSendDigits("TS");
      
        
        
      test2.setStatusCallbackUrl("TS");
      
      test2.setTimeout(1);
      test2.setPrivacyMode(true);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      OutDial test1 = new OutDial();
        
      test1.setActionUrl("TS");
        
        
        
      test1.setCallConnectUrl("TS");
        
        
        
        
      test1.setCallingNumber("TS");
      
        
        
      test1.setDestination("TS");
      
      test1.setIfMachine(IfMachine.HANGUP);
        
        
      test1.setIfMachineUrl("TS");
      
        
        
      test1.setSendDigits("TS");
      
        
        
      test1.setStatusCallbackUrl("TS");
      
      test1.setTimeout(1);
      test1.setPrivacyMode(true);
      OutDial test2 = new OutDial();
        
      test2.setActionUrl("TS2");
        
        
        
      test2.setCallConnectUrl("TS2");
        
        
        
        
      test2.setCallingNumber("TS2");
      
        
        
      test2.setDestination("TS2");
      
      test2.setIfMachine(IfMachine.REDIRECT);
        
        
      test2.setIfMachineUrl("TS2");
      
        
        
      test2.setSendDigits("TS2");
      
        
        
      test2.setStatusCallbackUrl("TS2");
      
      test2.setTimeout(0);
      test2.setPrivacyMode(false);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      OutDial test1 = new OutDial();
        
      test1.setActionUrl("TS");
        
        
        
      test1.setCallConnectUrl("TS");
        
        
        
        
      test1.setCallingNumber("TS");
      
        
        
      test1.setDestination("TS");
      
      test1.setIfMachine(IfMachine.REDIRECT);
        
        
      test1.setIfMachineUrl("TS");
      
        
        
      test1.setSendDigits("TS");
      
        
        
      test1.setStatusCallbackUrl("TS");
      
      test1.setTimeout(1);
      test1.setPrivacyMode(true);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      OutDial test1 = new OutDial();
        
      test1.setActionUrl("TS");
        
        
        
      test1.setCallConnectUrl("TS");
        
        
        
        
      test1.setCallingNumber("TS");
      
        
        
      test1.setDestination("TS");
      
      test1.setIfMachine(IfMachine.REDIRECT);
        
        
      test1.setIfMachineUrl("TS");
      
        
        
      test1.setSendDigits("TS");
      
        
        
      test1.setStatusCallbackUrl("TS");
      
      test1.setTimeout(1);
      test1.setPrivacyMode(true);
      OutDial test2 = new OutDial();
        
      test2.setActionUrl("TS");
        
        
        
      test2.setCallConnectUrl("TS");
        
        
        
        
      test2.setCallingNumber("TS");
      
        
        
      test2.setDestination("TS");
      
      test2.setIfMachine(IfMachine.REDIRECT);
        
        
      test2.setIfMachineUrl("TS");
      
        
        
      test2.setSendDigits("TS");
      
        
        
      test2.setStatusCallbackUrl("TS");
      
      test2.setTimeout(1);
      test2.setPrivacyMode(true);
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      OutDial test1 = new OutDial();
        
      test1.setActionUrl("TS");
        
        
        
      test1.setCallConnectUrl("TS");
        
        
        
        
      test1.setCallingNumber("TS");
      
        
        
      test1.setDestination("TS");
      
      test1.setIfMachine(IfMachine.REDIRECT);
        
        
      test1.setIfMachineUrl("TS");
      
        
        
      test1.setSendDigits("TS");
      
        
        
      test1.setStatusCallbackUrl("TS");
      
      test1.setTimeout(1);
      test1.setPrivacyMode(true);
      OutDial test2 = new OutDial();
        
      test2.setActionUrl("TS");
        
        
        
      test2.setCallConnectUrl("TS");
        
        
        
        
      test2.setCallingNumber("TS");
      
        
        
      test2.setDestination("TS");
      
      test2.setIfMachine(IfMachine.REDIRECT);
        
        
      test2.setIfMachineUrl("TS");
      
        
        
      test2.setSendDigits("TS");
      
        
        
      test2.setStatusCallbackUrl("TS");
      
      test2.setTimeout(1);
      test2.setPrivacyMode(true);
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      OutDial test1 = new OutDial();
        
      test1.setActionUrl("TS");
        
        
        
      test1.setCallConnectUrl("TS");
        
        
        
        
      test1.setCallingNumber("TS");
      
        
        
      test1.setDestination("TS");
      
      test1.setIfMachine(IfMachine.HANGUP);
        
        
      test1.setIfMachineUrl("TS");
      
        
        
      test1.setSendDigits("TS");
      
        
        
      test1.setStatusCallbackUrl("TS");
      
      test1.setTimeout(1);
      test1.setPrivacyMode(true);
      OutDial test2 = new OutDial();
        
      test2.setActionUrl("TS2");
        
        
        
      test2.setCallConnectUrl("TS2");
        
        
        
        
      test2.setCallingNumber("TS2");
      
        
        
      test2.setDestination("TS2");
      
      test2.setIfMachine(IfMachine.REDIRECT);
        
        
      test2.setIfMachineUrl("TS2");
      
        
        
      test2.setSendDigits("TS2");
      
        
        
      test2.setStatusCallbackUrl("TS2");
      
      test2.setTimeout(0);
      test2.setPrivacyMode(false);
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      OutDial test1 = new OutDial();
        
      test1.setActionUrl("TS");
        
        
        
      test1.setCallConnectUrl("TS");
        
        
        
        
        test1.setCallingNumber("TS");
      
        
        
        test1.setDestination("TS");
      
      test1.setIfMachine(IfMachine.REDIRECT);
        
        
        test1.setIfMachineUrl("TS");
      
        
        
        test1.setSendDigits("TS");
      
        
        
        test1.setStatusCallbackUrl("TS");
      
      test1.setTimeout(1);
      test1.setPrivacyMode(true);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void commandTest() throws Exception {
      Assert.assertEquals("OutDial", model.getCommand());
    }

    @Test
    public void buildTest() throws Exception {
        
        model.setActionUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getActionUrl());
        
        
        
        model.setCallConnectUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallConnectUrl());
        
        
        
        
        model.setCallingNumber("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallingNumber());
        
        
        
        model.setDestination("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDestination());
        
        
        
        model.setIfMachineUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getIfMachineUrl());
        
        
        
        model.setSendDigits("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getSendDigits());
        
        
        
        model.setStatusCallbackUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getStatusCallbackUrl());
        
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