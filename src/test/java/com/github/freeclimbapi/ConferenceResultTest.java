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

import com.github.freeclimbapi.ConferenceResultAllOf;
import com.github.freeclimbapi.MutableResourceModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Model tests for ConferenceResult
 */
public class ConferenceResultTest {
    private final ConferenceResult model = new ConferenceResult();
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
     * Test the property 'conferenceId'
     */
    @Test
    public void conferenceIdTest() {

        model.setConferenceId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getConferenceId());
        
        
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
     * Test the property 'alias'
     */
    @Test
    public void aliasTest() {

        model.setAlias("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAlias());
        
        
    }

    /**
     * Test the property 'playBeep'
     */
    @Test
    public void playBeepTest() {

        
    }

    /**
     * Test the property 'record'
     */
    @Test
    public void recordTest() {
        model.setRecord(false);
        Assert.assertEquals(false, model.getRecord());
        
        
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {

        
    }

    /**
     * Test the property 'waitUrl'
     */
    @Test
    public void waitUrlTest() {

        model.setWaitUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getWaitUrl());
        
        
    }

    /**
     * Test the property 'actionUrl'
     */
    @Test
    public void actionUrlTest() {

        model.setActionUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getActionUrl());
        
        
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
     * Test the property 'subresourceUris'
     */
    @Test
    public void subresourceUrisTest() {

        
    }

}