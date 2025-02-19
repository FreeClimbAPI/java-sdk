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

/** Model tests for CompletionRequest */
public class CompletionRequestTest {

    private final CompletionRequest model = new CompletionRequest();

    /** Test the property 'query' */
    @Test
    public void queryTest() {

        model.setQuery("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getQuery());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        CompletionRequest test1 = new CompletionRequest();

        test1.setQuery("TS");

        CompletionRequest test2 = new CompletionRequest();

        test2.setQuery("TS");

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        CompletionRequest test1 = new CompletionRequest();

        test1.setQuery("TS");

        CompletionRequest test2 = new CompletionRequest();

        test2.setQuery("TS2");

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        CompletionRequest test1 = new CompletionRequest();

        test1.setQuery("TS");

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        CompletionRequest test1 = new CompletionRequest();

        test1.setQuery("TS");

        CompletionRequest test2 = new CompletionRequest();

        test2.setQuery("TS");

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        CompletionRequest test1 = new CompletionRequest();

        test1.setQuery("TS");

        CompletionRequest test2 = new CompletionRequest();

        test2.setQuery("TS");

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        CompletionRequest test1 = new CompletionRequest();

        test1.setQuery("TS");

        CompletionRequest test2 = new CompletionRequest();

        test2.setQuery("TS2");

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        CompletionRequest test1 = new CompletionRequest();

        test1.setQuery("TS");

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }
}
