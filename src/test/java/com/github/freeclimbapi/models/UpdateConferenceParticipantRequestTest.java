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

/** Model tests for UpdateConferenceParticipantRequest */
public class UpdateConferenceParticipantRequestTest {

    private final UpdateConferenceParticipantRequest model =
            new UpdateConferenceParticipantRequest();

    /** Test the property 'talk' */
    @Test
    public void talkTest() {
        model.setTalk(false);
        Assert.assertEquals(false, model.getTalk());
    }

    /** Test the property 'listen' */
    @Test
    public void listenTest() {
        model.setListen(false);
        Assert.assertEquals(false, model.getListen());
    }

    /** Test the property 'dtmfPassThrough' */
    @Test
    public void dtmfPassThroughTest() {
        model.setDtmfPassThrough(false);
        Assert.assertEquals(false, model.getDtmfPassThrough());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        UpdateConferenceParticipantRequest test1 = new UpdateConferenceParticipantRequest();
        test1.setTalk(true);

        test1.setListen(true);

        test1.setDtmfPassThrough(true);

        UpdateConferenceParticipantRequest test2 = new UpdateConferenceParticipantRequest();
        test2.setTalk(true);

        test2.setListen(true);

        test2.setDtmfPassThrough(true);

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        UpdateConferenceParticipantRequest test1 = new UpdateConferenceParticipantRequest();
        test1.setTalk(true);

        test1.setListen(true);

        test1.setDtmfPassThrough(true);

        UpdateConferenceParticipantRequest test2 = new UpdateConferenceParticipantRequest();
        test2.setTalk(false);

        test2.setListen(false);

        test2.setDtmfPassThrough(false);

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        UpdateConferenceParticipantRequest test1 = new UpdateConferenceParticipantRequest();
        test1.setTalk(true);

        test1.setListen(true);

        test1.setDtmfPassThrough(true);

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        UpdateConferenceParticipantRequest test1 = new UpdateConferenceParticipantRequest();
        test1.setTalk(true);

        test1.setListen(true);

        test1.setDtmfPassThrough(true);

        UpdateConferenceParticipantRequest test2 = new UpdateConferenceParticipantRequest();
        test2.setTalk(true);

        test2.setListen(true);

        test2.setDtmfPassThrough(true);

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        UpdateConferenceParticipantRequest test1 = new UpdateConferenceParticipantRequest();
        test1.setTalk(true);

        test1.setListen(true);

        test1.setDtmfPassThrough(true);

        UpdateConferenceParticipantRequest test2 = new UpdateConferenceParticipantRequest();
        test2.setTalk(true);

        test2.setListen(true);

        test2.setDtmfPassThrough(true);

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        UpdateConferenceParticipantRequest test1 = new UpdateConferenceParticipantRequest();
        test1.setTalk(true);

        test1.setListen(true);

        test1.setDtmfPassThrough(true);

        UpdateConferenceParticipantRequest test2 = new UpdateConferenceParticipantRequest();
        test2.setTalk(false);

        test2.setListen(false);

        test2.setDtmfPassThrough(false);

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        UpdateConferenceParticipantRequest test1 = new UpdateConferenceParticipantRequest();
        test1.setTalk(true);

        test1.setListen(true);

        test1.setDtmfPassThrough(true);

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }
}
