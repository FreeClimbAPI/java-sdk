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
 * Model tests for PerclScript
 */
public class PerclScriptTest {
    private final PerclScript model = new PerclScript();
    /**
     * Test the property 'commands'
     */
    @Test
    public void commandsTest() {

        


    }

    @Test
    public void toJsonTest() throws Exception {
        Say say = new Say().text("Hello FreeClimb");
        model.addCommand(say);
        String json = model.toJson();
        JSON jsonWriter = new JSON();
        Map<String, Map<String, Object>> result = new HashMap<String, Map<String, Object>>();
        Map<String, Object> subresult = new HashMap<String, Object>();
        List<Map<String, Map<String, Object>>> listResult = new ArrayList<Map<String, Map<String, Object>>>();
        subresult.put("loop", 1);
        subresult.put("text", "Hello FreeClimb");
        result.put("Say", subresult);
        listResult.add(result);

        Assert.assertEquals(json, jsonWriter.serialize(listResult));
    }
}
