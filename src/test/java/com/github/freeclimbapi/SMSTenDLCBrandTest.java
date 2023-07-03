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
import java.net.URI;
import java.net.URISyntaxException;
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
/**
 * Model tests for SMSTenDLCBrand
 */
public class SMSTenDLCBrandTest {
    private final SMSTenDLCBrand model = new SMSTenDLCBrand();
    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {

        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
        
        


    }

    /**
     * Test the property 'entityType'
     */
    @Test
    public void entityTypeTest() {

        


    }

    /**
     * Test the property 'cspId'
     */
    @Test
    public void cspIdTest() {

        model.setCspId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCspId());
        
        


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
     * Test the property 'ein'
     */
    @Test
    public void einTest() {

        model.setEin("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getEin());
        
        


    }

    /**
     * Test the property 'einIssuingCountry'
     */
    @Test
    public void einIssuingCountryTest() {

        model.setEinIssuingCountry("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getEinIssuingCountry());
        
        


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
     * Test the property 'street'
     */
    @Test
    public void streetTest() {

        model.setStreet("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getStreet());
        
        


    }

    /**
     * Test the property 'city'
     */
    @Test
    public void cityTest() {

        model.setCity("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCity());
        
        


    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {

        model.setState("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getState());
        
        


    }

    /**
     * Test the property 'postalCode'
     */
    @Test
    public void postalCodeTest() {

        model.setPostalCode("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getPostalCode());
        
        


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
     * Test the property 'email'
     */
    @Test
    public void emailTest() {

        model.setEmail("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getEmail());
        
        


    }

    /**
     * Test the property 'stockSymbol'
     */
    @Test
    public void stockSymbolTest() {

        model.setStockSymbol("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getStockSymbol());
        
        


    }

    /**
     * Test the property 'stockExchange'
     */
    @Test
    public void stockExchangeTest() {

        


    }

    /**
     * Test the property 'ipAddress'
     */
    @Test
    public void ipAddressTest() {

        model.setIpAddress("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getIpAddress());
        
        


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
     * Test the property 'brandRelationship'
     */
    @Test
    public void brandRelationshipTest() {

        


    }

    /**
     * Test the property 'vertical'
     */
    @Test
    public void verticalTest() {

        model.setVertical("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getVertical());
        
        


    }

    /**
     * Test the property 'altBusinessId'
     */
    @Test
    public void altBusinessIdTest() {

        model.setAltBusinessId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAltBusinessId());
        
        


    }

    /**
     * Test the property 'altBusinessIdType'
     */
    @Test
    public void altBusinessIdTypeTest() {

        


    }

    /**
     * Test the property 'universalEin'
     */
    @Test
    public void universalEinTest() {

        model.setUniversalEin("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getUniversalEin());
        
        


    }

    /**
     * Test the property 'referenceId'
     */
    @Test
    public void referenceIdTest() {

        model.setReferenceId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getReferenceId());
        
        


    }

    /**
     * Test the property 'optionalAttributes'
     */
    @Test
    public void optionalAttributesTest() {

        


    }

    /**
     * Test the property 'mock'
     */
    @Test
    public void mockTest() {
        model.setMock(false);
        Assert.assertEquals(false, model.getMock());
        
        


    }

    /**
     * Test the property 'identityStatus'
     */
    @Test
    public void identityStatusTest() {

        


    }

    /**
     * Test the property 'createDate'
     */
    @Test
    public void createDateTest() {

        


    }

}
