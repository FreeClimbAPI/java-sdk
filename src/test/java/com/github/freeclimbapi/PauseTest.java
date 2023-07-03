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
 * Model tests for Pause
 */
public class PauseTest {
    private final Pause model = new Pause();
    /**
     * Test the property 'command'
     */
    @Test
    public void commandTest() {

        Assert.assertEquals("Pause", model.getCommand());


    }

    /**
     * Test the property 'length'
     */
    @Test
    public void lengthTest() {

        


    }

    @Test
    public void buildTest() throws Exception {
          
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("length"), model.getLength());
    }
}
