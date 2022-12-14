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
 * Model tests for MessageResultAllOf
 */
public class MessageResultAllOfTest {
    private final MessageResultAllOf model = new MessageResultAllOf();
    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {

        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
        
        
    }

    /**
     * Test the property 'messageId'
     */
    @Test
    public void messageIdTest() {

        model.setMessageId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getMessageId());
        
        
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {

        
    }

    /**
     * Test the property 'from'
     */
    @Test
    public void fromTest() {

        model.setFrom("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getFrom());
        
        
    }

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {

        model.setTo("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getTo());
        
        
    }

    /**
     * Test the property 'text'
     */
    @Test
    public void textTest() {

        model.setText("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getText());
        
        
    }

    /**
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {

        model.setDirection("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDirection());
        
        
    }

    /**
     * Test the property 'notificationUrl'
     */
    @Test
    public void notificationUrlTest() {

        model.setNotificationUrl("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getNotificationUrl());
        
        
    }

}
