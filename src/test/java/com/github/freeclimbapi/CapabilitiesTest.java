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
 * Model tests for Capabilities
 */
public class CapabilitiesTest {
    private final Capabilities model = new Capabilities();
    /**
     * Test the property 'voice'
     */
    @Test
    public void voiceTest() {
        model.setVoice(false);
        Assert.assertEquals(false, model.getVoice());
        
        


    }

    /**
     * Test the property 'sms'
     */
    @Test
    public void smsTest() {
        model.setSms(false);
        Assert.assertEquals(false, model.getSms());
        
        


    }

    /**
     * Test the property 'tollFree'
     */
    @Test
    public void tollFreeTest() {
        model.setTollFree(false);
        Assert.assertEquals(false, model.getTollFree());
        
        


    }

    /**
     * Test the property 'tenDLC'
     */
    @Test
    public void tenDLCTest() {
        model.setTenDLC(false);
        Assert.assertEquals(false, model.getTenDLC());
        
        


    }

    /**
     * Test the property 'shortCode'
     */
    @Test
    public void shortCodeTest() {
        model.setShortCode(false);
        Assert.assertEquals(false, model.getShortCode());
        
        


    }

}
