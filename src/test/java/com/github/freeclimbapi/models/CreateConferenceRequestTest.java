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
import java.net.URI;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

/** Model tests for CreateConferenceRequest */
public class CreateConferenceRequestTest {

    private final CreateConferenceRequest model = new CreateConferenceRequest();

    /** Test the property 'alias' */
    @Test
    public void aliasTest() {

        model.setAlias("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAlias());
    }

    /** Test the property 'playBeep' */
    @Test
    public void playBeepTest() {
        model.setPlayBeep(PlayBeep.ALWAYS);
        Assert.assertEquals(model.getPlayBeep(), PlayBeep.ALWAYS);
        model.setPlayBeep(PlayBeep.NEVER);
        Assert.assertEquals(model.getPlayBeep(), PlayBeep.NEVER);
        model.setPlayBeep(PlayBeep.ENTRY_ONLY);
        Assert.assertEquals(model.getPlayBeep(), PlayBeep.ENTRY_ONLY);
        model.setPlayBeep(PlayBeep.EXIT_ONLY);
        Assert.assertEquals(model.getPlayBeep(), PlayBeep.EXIT_ONLY);
    }

    /** Test the property 'record' */
    @Test
    public void recordTest() {
        model.setRecord(false);
        Assert.assertEquals(false, model.getRecord());
    }

    /** Test the property 'waitUrl' */
    @Test
    public void waitUrlTest() {

        try {
            URI uri = new URI("TEST_STRING");
            model.setWaitUrl(uri);
            Assert.assertEquals(uri, model.getWaitUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** Test the property 'statusCallbackUrl' */
    @Test
    public void statusCallbackUrlTest() {

        try {
            URI uri = new URI("TEST_STRING");
            model.setStatusCallbackUrl(uri);
            Assert.assertEquals(uri, model.getStatusCallbackUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        CreateConferenceRequest test1 = new CreateConferenceRequest();

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);

        test1.setRecord(true);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        CreateConferenceRequest test2 = new CreateConferenceRequest();

        test2.setAlias("TS");

        test2.setPlayBeep(PlayBeep.ALWAYS);

        test2.setRecord(true);

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        CreateConferenceRequest test1 = new CreateConferenceRequest();

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.NEVER);

        test1.setRecord(true);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        CreateConferenceRequest test2 = new CreateConferenceRequest();

        test2.setAlias("TS2");

        test2.setPlayBeep(PlayBeep.ALWAYS);

        test2.setRecord(false);

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        CreateConferenceRequest test1 = new CreateConferenceRequest();

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);

        test1.setRecord(true);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        CreateConferenceRequest test1 = new CreateConferenceRequest();

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);

        test1.setRecord(true);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        CreateConferenceRequest test2 = new CreateConferenceRequest();

        test2.setAlias("TS");

        test2.setPlayBeep(PlayBeep.ALWAYS);

        test2.setRecord(true);

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        CreateConferenceRequest test1 = new CreateConferenceRequest();

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);

        test1.setRecord(true);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        CreateConferenceRequest test2 = new CreateConferenceRequest();

        test2.setAlias("TS");

        test2.setPlayBeep(PlayBeep.ALWAYS);

        test2.setRecord(true);

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        CreateConferenceRequest test1 = new CreateConferenceRequest();

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.NEVER);

        test1.setRecord(true);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        CreateConferenceRequest test2 = new CreateConferenceRequest();

        test2.setAlias("TS2");

        test2.setPlayBeep(PlayBeep.ALWAYS);

        test2.setRecord(false);

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        CreateConferenceRequest test1 = new CreateConferenceRequest();

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);

        test1.setRecord(true);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }
}
