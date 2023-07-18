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
 * Model tests for AvailableNumber
 */
 public class AvailableNumberTest {
    private final AvailableNumber model = new AvailableNumber();

    /**
     * Test the property 'capabilities'
     */
    @Test
    public void capabilitiesTest() {
      Capabilities object = new Capabilities();
      model.setCapabilities(object);
      Assert.assertEquals(object.getClass(), Capabilities.class);
      
    }

    /**
     * Test the property 'campaignId'
     */
    @Test
    public void campaignIdTest() {
      model.setCampaignId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getCampaignId());
      
    }

    /**
     * Test the property 'phoneNumber'
     */
    @Test
    public void phoneNumberTest() {
      model.setPhoneNumber("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getPhoneNumber());
      
    }

    /**
     * Test the property 'voiceEnabled'
     */
    @Test
    public void voiceEnabledTest() {
      model.setVoiceEnabled(false);
      Assert.assertEquals(false, model.getVoiceEnabled());       
      
    }

    /**
     * Test the property 'smsEnabled'
     */
    @Test
    public void smsEnabledTest() {
      model.setSmsEnabled(false);
      Assert.assertEquals(false, model.getSmsEnabled());       
      
    }

    /**
     * Test the property 'region'
     */
    @Test
    public void regionTest() {
      model.setRegion("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getRegion());
      
    }

    /**
     * Test the property 'country'
     */
    @Test
    public void countryTest() {
      model.setCountry("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getCountry());
      
    }

      /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      AvailableNumber test1 = new AvailableNumber();
      Capabilities object = new Capabilities();
      test1.setCapabilities(object);
      test1.setCampaignId("TS");
      test1.setPhoneNumber("TS");
      test1.setVoiceEnabled(true);
      test1.setSmsEnabled(true);
      test1.setRegion("TS");
      test1.setCountry("TS");
      AvailableNumber test2 = new AvailableNumber();
      Capabilities object2 = object;
      test2.setCapabilities(object2);
      test2.setCampaignId("TS");
      test2.setPhoneNumber("TS");
      test2.setVoiceEnabled(true);
      test2.setSmsEnabled(true);
      test2.setRegion("TS");
      test2.setCountry("TS");

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      AvailableNumber test1 = new AvailableNumber();
        Capabilities object = new Capabilities();
      test1.setCapabilities(object);
      test1.setCampaignId("TS");
      test1.setPhoneNumber("TS");
      test1.setVoiceEnabled(true);
      test1.setSmsEnabled(true);
      test1.setRegion("TS");
      test1.setCountry("TS");
      AvailableNumber test2 = new AvailableNumber();
      Capabilities object2 = new Capabilities();
      test2.setCapabilities(object2);
      test2.setCampaignId("tS");
      test2.setPhoneNumber("tS");
      test2.setVoiceEnabled(false);
      test2.setSmsEnabled(false);
      test2.setRegion("tS");
      test2.setCountry("tS");

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      AvailableNumber test1 = new AvailableNumber();
      Capabilities object = new Capabilities();
      test1.setCapabilities(object);
      test1.setCampaignId("TS");
      test1.setPhoneNumber("TS");
      test1.setVoiceEnabled(true);
      test1.setSmsEnabled(true);
      test1.setRegion("TS");
      test1.setCountry("TS");
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      AvailableNumber test1 = new AvailableNumber();
        Capabilities object = new Capabilities();
      test1.setCapabilities(object);
      test1.setCampaignId("TS");
      test1.setPhoneNumber("TS");
      test1.setVoiceEnabled(true);
      test1.setSmsEnabled(true);
      test1.setRegion("TS");
      test1.setCountry("TS");
      AvailableNumber test2 = new AvailableNumber();
      Capabilities object2 = object;
      test2.setCapabilities(object2);
      test2.setCampaignId("TS");
      test2.setPhoneNumber("TS");
      test2.setVoiceEnabled(true);
      test2.setSmsEnabled(true);
      test2.setRegion("TS");
      test2.setCountry("TS");
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      AvailableNumber test1 = new AvailableNumber();
      Capabilities object = new Capabilities();
      test1.setCapabilities(object);
      test1.setCampaignId("TS");
      test1.setPhoneNumber("TS");
      test1.setVoiceEnabled(true);
      test1.setSmsEnabled(true);
      test1.setRegion("TS");
      test1.setCountry("TS");

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }