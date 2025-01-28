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
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/** Model tests for PlayEarlyMedia */
public class PlayEarlyMediaTest {

    private final PlayEarlyMedia model = new PlayEarlyMedia();

    /** Test the property '_file' */
    @Test
    public void _fileTest() {

        model.setFile("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getFile());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        PlayEarlyMedia test1 = new PlayEarlyMedia();

        test1.setFile("TS");

        PlayEarlyMedia test2 = new PlayEarlyMedia();

        test2.setFile("TS");

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        PlayEarlyMedia test1 = new PlayEarlyMedia();

        test1.setFile("TS");

        PlayEarlyMedia test2 = new PlayEarlyMedia();

        test2.setFile("TS2");

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        PlayEarlyMedia test1 = new PlayEarlyMedia();

        test1.setFile("TS");

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        PlayEarlyMedia test1 = new PlayEarlyMedia();

        test1.setFile("TS");

        PlayEarlyMedia test2 = new PlayEarlyMedia();

        test2.setFile("TS");

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        PlayEarlyMedia test1 = new PlayEarlyMedia();

        test1.setFile("TS");

        PlayEarlyMedia test2 = new PlayEarlyMedia();

        test2.setFile("TS");

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        PlayEarlyMedia test1 = new PlayEarlyMedia();

        test1.setFile("TS");

        PlayEarlyMedia test2 = new PlayEarlyMedia();

        test2.setFile("TS2");

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        PlayEarlyMedia test1 = new PlayEarlyMedia();

        test1.setFile("TS");

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void commandTest() throws Exception {
        Assert.assertEquals("PlayEarlyMedia", model.getCommand());
    }

    @Test
    public void buildTest() throws Exception {

        model.setFile("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getFile());

        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("file"), model.getFile());
    }
}
