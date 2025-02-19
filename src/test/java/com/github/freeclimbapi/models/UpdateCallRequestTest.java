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

/** Model tests for UpdateCallRequest */
public class UpdateCallRequestTest {

    private final UpdateCallRequest model = new UpdateCallRequest();

    /** Test the property 'status' */
    @Test
    public void statusTest() {
        model.setStatus(UpdateCallRequestStatus.CANCELED);
        Assert.assertEquals(model.getStatus(), UpdateCallRequestStatus.CANCELED);
        model.setStatus(UpdateCallRequestStatus.COMPLETED);
        Assert.assertEquals(model.getStatus(), UpdateCallRequestStatus.COMPLETED);
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        UpdateCallRequest test1 = new UpdateCallRequest();
        test1.setStatus(UpdateCallRequestStatus.CANCELED);

        UpdateCallRequest test2 = new UpdateCallRequest();
        test2.setStatus(UpdateCallRequestStatus.CANCELED);

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        UpdateCallRequest test1 = new UpdateCallRequest();
        test1.setStatus(UpdateCallRequestStatus.COMPLETED);

        UpdateCallRequest test2 = new UpdateCallRequest();
        test2.setStatus(UpdateCallRequestStatus.CANCELED);

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        UpdateCallRequest test1 = new UpdateCallRequest();
        test1.setStatus(UpdateCallRequestStatus.CANCELED);

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        UpdateCallRequest test1 = new UpdateCallRequest();
        test1.setStatus(UpdateCallRequestStatus.CANCELED);

        UpdateCallRequest test2 = new UpdateCallRequest();
        test2.setStatus(UpdateCallRequestStatus.CANCELED);

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        UpdateCallRequest test1 = new UpdateCallRequest();
        test1.setStatus(UpdateCallRequestStatus.CANCELED);

        UpdateCallRequest test2 = new UpdateCallRequest();
        test2.setStatus(UpdateCallRequestStatus.CANCELED);

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        UpdateCallRequest test1 = new UpdateCallRequest();
        test1.setStatus(UpdateCallRequestStatus.COMPLETED);

        UpdateCallRequest test2 = new UpdateCallRequest();
        test2.setStatus(UpdateCallRequestStatus.CANCELED);

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        UpdateCallRequest test1 = new UpdateCallRequest();
        test1.setStatus(UpdateCallRequestStatus.CANCELED);

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }
}
