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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.math.BigDecimal;
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
/**
 * Model tests for IncomingNumberResult
 */
public class IncomingNumberResultTest {
    private final IncomingNumberResult model = new IncomingNumberResult();
    /**
     * Test the property 'uri'
     */
    @Test
    public void uriTest() {

        model.setUri("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getUri());
        
        
    }

    /**
     * Test the property 'dateCreated'
     */
    @Test
    public void dateCreatedTest() {

        model.setDateCreated("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDateCreated());
        
        
    }

    /**
     * Test the property 'dateUpdated'
     */
    @Test
    public void dateUpdatedTest() {

        model.setDateUpdated("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDateUpdated());
        
        
    }

    /**
     * Test the property 'revision'
     */
    @Test
    public void revisionTest() {

        
    }

    /**
     * Test the property 'capabilities'
     */
    @Test
    public void capabilitiesTest() {

        
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
     * Test the property 'phoneNumberId'
     */
    @Test
    public void phoneNumberIdTest() {

        model.setPhoneNumberId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getPhoneNumberId());
        
        
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
     * Test the property 'applicationId'
     */
    @Test
    public void applicationIdTest() {

        model.setApplicationId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getApplicationId());
        
        
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
     * Test the property 'alias'
     */
    @Test
    public void aliasTest() {

        model.setAlias("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAlias());
        
        
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
     * Test the property 'offnet'
     */
    @Test
    public void offnetTest() {
        model.setOffnet(false);
        Assert.assertEquals(false, model.getOffnet());
        
        
    }

}
