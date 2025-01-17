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

import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

/** Model tests for CallDirection */
public class CallDirectionTest {

    @Test
    public void testINBOUNDShouldWork() {

        CallDirection test = CallDirection.INBOUND;
        Assert.assertEquals(test.getClass(), CallDirection.class);
    }

    @Test
    public void testINBOUNDShouldSerializeToEnum() {

        CallDirection expectedValue = CallDirection.INBOUND;
        CallDirection calculatedValue = CallDirection.fromValue("inbound");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testINBOUNDShouldDeserializeToString() {
        CallDirection test = CallDirection.INBOUND;
        String expectedValue = "inbound";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testOUTBOUND_APIShouldWork() {

        CallDirection test = CallDirection.OUTBOUND_API;
        Assert.assertEquals(test.getClass(), CallDirection.class);
    }

    @Test
    public void testOUTBOUND_APIShouldSerializeToEnum() {

        CallDirection expectedValue = CallDirection.OUTBOUND_API;
        CallDirection calculatedValue = CallDirection.fromValue("outboundAPI");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testOUTBOUND_APIShouldDeserializeToString() {
        CallDirection test = CallDirection.OUTBOUND_API;
        String expectedValue = "outboundAPI";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testOUTBOUND_DIALShouldWork() {

        CallDirection test = CallDirection.OUTBOUND_DIAL;
        Assert.assertEquals(test.getClass(), CallDirection.class);
    }

    @Test
    public void testOUTBOUND_DIALShouldSerializeToEnum() {

        CallDirection expectedValue = CallDirection.OUTBOUND_DIAL;
        CallDirection calculatedValue = CallDirection.fromValue("outboundDial");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testOUTBOUND_DIALShouldDeserializeToString() {
        CallDirection test = CallDirection.OUTBOUND_DIAL;
        String expectedValue = "outboundDial";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }
}
