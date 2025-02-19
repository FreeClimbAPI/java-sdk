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

/** Model tests for QueueMember */
public class QueueMemberTest {

    private final QueueMember model = new QueueMember();

    /** Test the property 'uri' */
    @Test
    public void uriTest() {

        model.setUri("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getUri());
    }

    /** Test the property 'callId' */
    @Test
    public void callIdTest() {

        model.setCallId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallId());
    }

    /** Test the property 'waitTime' */
    @Test
    public void waitTimeTest() {

        model.setWaitTime(1);
        Assert.assertEquals(1, (int) model.getWaitTime());
    }

    /** Test the property 'position' */
    @Test
    public void positionTest() {

        model.setPosition(1);
        Assert.assertEquals(1, (int) model.getPosition());
    }

    /** Test the property 'dateEnqueued' */
    @Test
    public void dateEnqueuedTest() {

        model.setDateEnqueued("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDateEnqueued());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        QueueMember test1 = new QueueMember();

        test1.setUri("TS");

        test1.setCallId("TS");

        test1.setWaitTime(1);

        test1.setPosition(1);

        test1.setDateEnqueued("TS");

        QueueMember test2 = new QueueMember();

        test2.setUri("TS");

        test2.setCallId("TS");

        test2.setWaitTime(1);

        test2.setPosition(1);

        test2.setDateEnqueued("TS");

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        QueueMember test1 = new QueueMember();

        test1.setUri("TS");

        test1.setCallId("TS");

        test1.setWaitTime(1);

        test1.setPosition(1);

        test1.setDateEnqueued("TS");

        QueueMember test2 = new QueueMember();

        test2.setUri("TS2");

        test2.setCallId("TS2");

        test2.setWaitTime(0);

        test2.setPosition(0);

        test2.setDateEnqueued("TS2");

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        QueueMember test1 = new QueueMember();

        test1.setUri("TS");

        test1.setCallId("TS");

        test1.setWaitTime(1);

        test1.setPosition(1);

        test1.setDateEnqueued("TS");

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        QueueMember test1 = new QueueMember();

        test1.setUri("TS");

        test1.setCallId("TS");

        test1.setWaitTime(1);

        test1.setPosition(1);

        test1.setDateEnqueued("TS");

        QueueMember test2 = new QueueMember();

        test2.setUri("TS");

        test2.setCallId("TS");

        test2.setWaitTime(1);

        test2.setPosition(1);

        test2.setDateEnqueued("TS");

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        QueueMember test1 = new QueueMember();

        test1.setUri("TS");

        test1.setCallId("TS");

        test1.setWaitTime(1);

        test1.setPosition(1);

        test1.setDateEnqueued("TS");

        QueueMember test2 = new QueueMember();

        test2.setUri("TS");

        test2.setCallId("TS");

        test2.setWaitTime(1);

        test2.setPosition(1);

        test2.setDateEnqueued("TS");

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        QueueMember test1 = new QueueMember();

        test1.setUri("TS");

        test1.setCallId("TS");

        test1.setWaitTime(1);

        test1.setPosition(1);

        test1.setDateEnqueued("TS");

        QueueMember test2 = new QueueMember();

        test2.setUri("TS2");

        test2.setCallId("TS2");

        test2.setWaitTime(0);

        test2.setPosition(0);

        test2.setDateEnqueued("TS2");

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        QueueMember test1 = new QueueMember();

        test1.setUri("TS");

        test1.setCallId("TS");

        test1.setWaitTime(1);

        test1.setPosition(1);

        test1.setDateEnqueued("TS");

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }
}
