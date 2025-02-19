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

/** Model tests for Pause */
public class PauseTest {

    private final Pause model = new Pause();

    /** Test the property 'length' */
    @Test
    public void lengthTest() {

        model.setLength(1);
        Assert.assertEquals(1, (int) model.getLength());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        Pause test1 = new Pause();
        test1.setLength(1);

        Pause test2 = new Pause();
        test2.setLength(1);

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        Pause test1 = new Pause();
        test1.setLength(1);

        Pause test2 = new Pause();
        test2.setLength(0);

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        Pause test1 = new Pause();
        test1.setLength(1);

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        Pause test1 = new Pause();
        test1.setLength(1);

        Pause test2 = new Pause();
        test2.setLength(1);

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        Pause test1 = new Pause();
        test1.setLength(1);

        Pause test2 = new Pause();
        test2.setLength(1);

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        Pause test1 = new Pause();
        test1.setLength(1);

        Pause test2 = new Pause();
        test2.setLength(0);

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        Pause test1 = new Pause();
        test1.setLength(1);

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void commandTest() throws Exception {
        Assert.assertEquals("Pause", model.getCommand());
    }

    @Test
    public void buildTest() throws Exception {
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("length"), model.getLength());
    }
}
