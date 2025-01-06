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

/** Model tests for QueueResultStatus */
public class QueueResultStatusTest {

    @Test
    public void testQUEUE_FULLShouldWork() {

        QueueResultStatus test = QueueResultStatus.QUEUE_FULL;
        Assert.assertEquals(test.getClass(), QueueResultStatus.class);
    }

    @Test
    public void testQUEUE_FULLShouldSerializeToEnum() {

        QueueResultStatus expectedValue = QueueResultStatus.QUEUE_FULL;
        QueueResultStatus calculatedValue = QueueResultStatus.fromValue("queueFull");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testQUEUE_FULLShouldDeserializeToString() {
        QueueResultStatus test = QueueResultStatus.QUEUE_FULL;
        String expectedValue = "queueFull";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDEQUEUEDShouldWork() {

        QueueResultStatus test = QueueResultStatus.DEQUEUED;
        Assert.assertEquals(test.getClass(), QueueResultStatus.class);
    }

    @Test
    public void testDEQUEUEDShouldSerializeToEnum() {

        QueueResultStatus expectedValue = QueueResultStatus.DEQUEUED;
        QueueResultStatus calculatedValue = QueueResultStatus.fromValue("dequeued");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDEQUEUEDShouldDeserializeToString() {
        QueueResultStatus test = QueueResultStatus.DEQUEUED;
        String expectedValue = "dequeued";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testHANGUPShouldWork() {

        QueueResultStatus test = QueueResultStatus.HANGUP;
        Assert.assertEquals(test.getClass(), QueueResultStatus.class);
    }

    @Test
    public void testHANGUPShouldSerializeToEnum() {

        QueueResultStatus expectedValue = QueueResultStatus.HANGUP;
        QueueResultStatus calculatedValue = QueueResultStatus.fromValue("hangup");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testHANGUPShouldDeserializeToString() {
        QueueResultStatus test = QueueResultStatus.HANGUP;
        String expectedValue = "hangup";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSYSTEM_ERRORShouldWork() {

        QueueResultStatus test = QueueResultStatus.SYSTEM_ERROR;
        Assert.assertEquals(test.getClass(), QueueResultStatus.class);
    }

    @Test
    public void testSYSTEM_ERRORShouldSerializeToEnum() {

        QueueResultStatus expectedValue = QueueResultStatus.SYSTEM_ERROR;
        QueueResultStatus calculatedValue = QueueResultStatus.fromValue("systemError");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSYSTEM_ERRORShouldDeserializeToString() {
        QueueResultStatus test = QueueResultStatus.SYSTEM_ERROR;
        String expectedValue = "systemError";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }
}
