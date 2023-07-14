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
 * Model tests for SMSTenDLCPartnerCampaignBrand
 */
 public class SMSTenDLCPartnerCampaignBrandTest {
    private final SMSTenDLCPartnerCampaignBrand model = new SMSTenDLCPartnerCampaignBrand();

    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
      
        
        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'brandId'
     */
    @Test
    public void brandIdTest() {
      
        
        model.setBrandId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getBrandId());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'firstName'
     */
    @Test
    public void firstNameTest() {
      
        
        model.setFirstName("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getFirstName());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'lastName'
     */
    @Test
    public void lastNameTest() {
      
        
        model.setLastName("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getLastName());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'displayName'
     */
    @Test
    public void displayNameTest() {
      
        
        model.setDisplayName("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDisplayName());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'companyName'
     */
    @Test
    public void companyNameTest() {
      
        
        model.setCompanyName("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCompanyName());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'phone'
     */
    @Test
    public void phoneTest() {
      
        
        model.setPhone("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getPhone());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
      
        
        model.setEmail("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getEmail());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'website'
     */
    @Test
    public void websiteTest() {
      
        
        model.setWebsite("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getWebsite());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'optionalAttributes'
     */
    @Test
    public void optionalAttributesTest() {
      
        
        
        
        
        
      
  
    Map<String, Object> testMap = new HashMap();
    model.setOptionalAttributes(testMap);
    Assert.assertEquals(testMap, model.getOptionalAttributes()); 
  }

    /**
     * Test the property 'evpVettingScore'
     */
    @Test
    public void evpVettingScoreTest() {
      
        
        
        
        
        
      
  
      model.setEvpVettingScore(1);
      Assert.assertEquals(1, (int) model.getEvpVettingScore());
  }

  /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      SMSTenDLCPartnerCampaignBrand test1 = new SMSTenDLCPartnerCampaignBrand();
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setBrandId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setFirstName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLastName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDisplayName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCompanyName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPhone("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEmail("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWebsite("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap = new HashMap();test1.setOptionalAttributes(testMap);
        
        
        
        
        
        
        
        
        test1.setEvpVettingScore(1);
        
        
        
        
        
        
        
        
        
        
        
      SMSTenDLCPartnerCampaignBrand test2 = new SMSTenDLCPartnerCampaignBrand();
        test2.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setBrandId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setFirstName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLastName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDisplayName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setCompanyName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPhone("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setEmail("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setWebsite("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap2 = new HashMap();test2.setOptionalAttributes(testMap2);
        
        
        
        
        
        
        
        
        test2.setEvpVettingScore(1);
        
        
        
        
        
        
        
        
        
        
        
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      SMSTenDLCPartnerCampaignBrand test1 = new SMSTenDLCPartnerCampaignBrand();
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setBrandId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setFirstName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLastName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDisplayName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCompanyName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPhone("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEmail("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWebsite("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap = new HashMap();test1.setOptionalAttributes(testMap);
        
        
        
        
        
        
        
        
        test1.setEvpVettingScore(1);
        
        
        
        
        
        
        
        
        
        
        
      SMSTenDLCPartnerCampaignBrand test2 = new SMSTenDLCPartnerCampaignBrand();
        test2.setAccountId("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setBrandId("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setFirstName("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLastName("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDisplayName("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setCompanyName("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPhone("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setEmail("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setWebsite("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap2 = new HashMap();test2.setOptionalAttributes(testMap2);
        
        
        
        
        
        
        
        
        test2.setEvpVettingScore(0);
        
        
        
        
        
        
        
        
        
        
        

      Assert.assertFalse(test1.equals(test2));
    }

    /**
     * Test the method 'hashEquals'
     */

     @Test
    public void hashEqualsTest() {
      SMSTenDLCPartnerCampaignBrand test1 = new SMSTenDLCPartnerCampaignBrand();
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setBrandId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setFirstName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLastName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDisplayName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCompanyName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPhone("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEmail("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWebsite("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap = new HashMap();test1.setOptionalAttributes(testMap);
        
        
        
        
        
        
        
        
        test1.setEvpVettingScore(1);
        
        
        
        
        
        
        
        
        
        
        
       SMSTenDLCPartnerCampaignBrand test2 = new SMSTenDLCPartnerCampaignBrand();
        test2.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setBrandId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setFirstName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLastName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDisplayName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setCompanyName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPhone("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setEmail("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setWebsite("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap2 = new HashMap();test2.setOptionalAttributes(testMap2);
        
        
        
        
        
        
        
        
        test2.setEvpVettingScore(1);
        
        
        
        
        
        
        
        
        
        
        

        int hashCode1 = test1.hashCode();
        int hashCode2 = test2.hashCode();

      Assert.assertEquals(hashCode1, hashCode2);
     }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      SMSTenDLCPartnerCampaignBrand test1 = new SMSTenDLCPartnerCampaignBrand();
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setBrandId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setFirstName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLastName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDisplayName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCompanyName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPhone("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEmail("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWebsite("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap = new HashMap();test1.setOptionalAttributes(testMap);
        
        
        
        
        
        
        
        
        test1.setEvpVettingScore(1);
        
        
        
        
        
        
        
        
        
        
        
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      SMSTenDLCPartnerCampaignBrand test1 = new SMSTenDLCPartnerCampaignBrand();
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setBrandId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setFirstName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLastName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDisplayName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCompanyName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPhone("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEmail("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWebsite("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap = new HashMap();test1.setOptionalAttributes(testMap);
        
        
        
        
        
        
        
        
        test1.setEvpVettingScore(1);
        
        
        
        
        
        
        
        
        
        
        
      SMSTenDLCPartnerCampaignBrand test2 = new SMSTenDLCPartnerCampaignBrand();
        test2.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setBrandId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setFirstName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setLastName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDisplayName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setCompanyName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPhone("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setEmail("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setWebsite("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap2 = new HashMap();test2.setOptionalAttributes(testMap2);
        
        
        
        
        
        
        
        
        test2.setEvpVettingScore(1);
        
        
        
        
        
        
        
        
        
        
        
        
       String toString1 = test1.toString();
       String toString2 = test2.toString();
        
        Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      SMSTenDLCPartnerCampaignBrand test1 = new SMSTenDLCPartnerCampaignBrand();
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setBrandId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setFirstName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setLastName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDisplayName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCompanyName("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPhone("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEmail("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setWebsite("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Map<String, Object> testMap = new HashMap();test1.setOptionalAttributes(testMap);
        
        
        
        
        
        
        
        
        test1.setEvpVettingScore(1);
        
        
        
        
        
        
        
        
        
        
        

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }