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

/** Model tests for ConferenceResult */
public class ConferenceResultTest {

    private final ConferenceResult model = new ConferenceResult();

    /** Test the property 'uri' */
    @Test
    public void uriTest() {

        model.setUri("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getUri());
    }

    /** Test the property 'dateCreated' */
    @Test
    public void dateCreatedTest() {

        model.setDateCreated("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDateCreated());
    }

    /** Test the property 'dateUpdated' */
    @Test
    public void dateUpdatedTest() {

        model.setDateUpdated("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDateUpdated());
    }

    /** Test the property 'revision' */
    @Test
    public void revisionTest() {

        model.setRevision(1);
        Assert.assertEquals(1, (int) model.getRevision());
    }

    /** Test the property 'conferenceId' */
    @Test
    public void conferenceIdTest() {

        model.setConferenceId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getConferenceId());
    }

    /** Test the property 'accountId' */
    @Test
    public void accountIdTest() {

        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
    }

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

    /** Test the property 'status' */
    @Test
    public void statusTest() {
        model.setStatus(ConferenceStatus.EMPTY);
        Assert.assertEquals(model.getStatus(), ConferenceStatus.EMPTY);
        model.setStatus(ConferenceStatus.POPULATED);
        Assert.assertEquals(model.getStatus(), ConferenceStatus.POPULATED);
        model.setStatus(ConferenceStatus.IN_PROGRESS);
        Assert.assertEquals(model.getStatus(), ConferenceStatus.IN_PROGRESS);
        model.setStatus(ConferenceStatus.TERMINATED);
        Assert.assertEquals(model.getStatus(), ConferenceStatus.TERMINATED);
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

    /** Test the property 'actionUrl' */
    @Test
    public void actionUrlTest() {

        try {
            URI uri = new URI("TEST_STRING");
            model.setActionUrl(uri);
            Assert.assertEquals(uri, model.getActionUrl());
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

    /** Test the property 'subresourceUris' */
    @Test
    public void subresourceUrisTest() {
        Object testObject = new Object();
        model.setSubresourceUris(testObject);
        Assert.assertEquals(testObject, model.getSubresourceUris());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        ConferenceResult test1 = new ConferenceResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setConferenceId("TS");

        test1.setAccountId("TS");

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);
        test1.setRecord(true);
        test1.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setActionUrl(uri1);
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
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        ConferenceResult test2 = new ConferenceResult();

        test2.setUri("TS");

        test2.setDateCreated("TS");

        test2.setDateUpdated("TS");

        test2.setRevision(1);

        test2.setConferenceId("TS");

        test2.setAccountId("TS");

        test2.setAlias("TS");

        test2.setPlayBeep(PlayBeep.ALWAYS);
        test2.setRecord(true);
        test2.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setActionUrl(uri2);
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
        Object testObject2 = testObject;
        test2.setSubresourceUris(testObject2);

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        ConferenceResult test1 = new ConferenceResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setConferenceId("TS");

        test1.setAccountId("TS");

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.NEVER);
        test1.setRecord(true);
        test1.setStatus(ConferenceStatus.POPULATED);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setActionUrl(uri1);
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
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        ConferenceResult test2 = new ConferenceResult();

        test2.setUri("TS2");

        test2.setDateCreated("TS2");

        test2.setDateUpdated("TS2");

        test2.setRevision(0);

        test2.setConferenceId("TS2");

        test2.setAccountId("TS2");

        test2.setAlias("TS2");

        test2.setPlayBeep(PlayBeep.ALWAYS);
        test2.setRecord(false);
        test2.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setActionUrl(uri2);
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
        Object testObject2 = new Object();
        test2.setSubresourceUris(testObject2);

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        ConferenceResult test1 = new ConferenceResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setConferenceId("TS");

        test1.setAccountId("TS");

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);
        test1.setRecord(true);
        test1.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setActionUrl(uri1);
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
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        ConferenceResult test1 = new ConferenceResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setConferenceId("TS");

        test1.setAccountId("TS");

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);
        test1.setRecord(true);
        test1.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setActionUrl(uri1);
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
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        ConferenceResult test2 = new ConferenceResult();

        test2.setUri("TS");

        test2.setDateCreated("TS");

        test2.setDateUpdated("TS");

        test2.setRevision(1);

        test2.setConferenceId("TS");

        test2.setAccountId("TS");

        test2.setAlias("TS");

        test2.setPlayBeep(PlayBeep.ALWAYS);
        test2.setRecord(true);
        test2.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setActionUrl(uri2);
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
        Object testObject2 = testObject;
        test2.setSubresourceUris(testObject2);

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        ConferenceResult test1 = new ConferenceResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setConferenceId("TS");

        test1.setAccountId("TS");

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);
        test1.setRecord(true);
        test1.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setActionUrl(uri1);
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
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        ConferenceResult test2 = new ConferenceResult();

        test2.setUri("TS");

        test2.setDateCreated("TS");

        test2.setDateUpdated("TS");

        test2.setRevision(1);

        test2.setConferenceId("TS");

        test2.setAccountId("TS");

        test2.setAlias("TS");

        test2.setPlayBeep(PlayBeep.ALWAYS);
        test2.setRecord(true);
        test2.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setActionUrl(uri2);
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
        Object testObject2 = testObject;
        test2.setSubresourceUris(testObject2);
        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        ConferenceResult test1 = new ConferenceResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setConferenceId("TS");

        test1.setAccountId("TS");

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.NEVER);
        test1.setRecord(true);
        test1.setStatus(ConferenceStatus.POPULATED);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setActionUrl(uri1);
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
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        ConferenceResult test2 = new ConferenceResult();

        test2.setUri("TS2");

        test2.setDateCreated("TS2");

        test2.setDateUpdated("TS2");

        test2.setRevision(0);

        test2.setConferenceId("TS2");

        test2.setAccountId("TS2");

        test2.setAlias("TS2");

        test2.setPlayBeep(PlayBeep.ALWAYS);
        test2.setRecord(false);
        test2.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setWaitUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setActionUrl(uri2);
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
        Object testObject2 = new Object();
        test2.setSubresourceUris(testObject2);
        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        ConferenceResult test1 = new ConferenceResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setConferenceId("TS");

        test1.setAccountId("TS");

        test1.setAlias("TS");

        test1.setPlayBeep(PlayBeep.ALWAYS);
        test1.setRecord(true);
        test1.setStatus(ConferenceStatus.EMPTY);

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setWaitUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setActionUrl(uri1);
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
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }
}
