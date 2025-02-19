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
import java.math.BigDecimal;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/** Model tests for MessageResult */
public class MessageResultTest {

    private final MessageResult model = new MessageResult();

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

    /** Test the property 'accountId' */
    @Test
    public void accountIdTest() {

        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
    }

    /** Test the property 'messageId' */
    @Test
    public void messageIdTest() {

        model.setMessageId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getMessageId());
    }

    /** Test the property 'status' */
    @Test
    public void statusTest() {
        model.setStatus(MessageStatus.NEW);
        Assert.assertEquals(model.getStatus(), MessageStatus.NEW);
        model.setStatus(MessageStatus.QUEUED);
        Assert.assertEquals(model.getStatus(), MessageStatus.QUEUED);
        model.setStatus(MessageStatus.REJECTED);
        Assert.assertEquals(model.getStatus(), MessageStatus.REJECTED);
        model.setStatus(MessageStatus.SENDING);
        Assert.assertEquals(model.getStatus(), MessageStatus.SENDING);
        model.setStatus(MessageStatus.SENT);
        Assert.assertEquals(model.getStatus(), MessageStatus.SENT);
        model.setStatus(MessageStatus.FAILED);
        Assert.assertEquals(model.getStatus(), MessageStatus.FAILED);
        model.setStatus(MessageStatus.RECEIVED);
        Assert.assertEquals(model.getStatus(), MessageStatus.RECEIVED);
        model.setStatus(MessageStatus.UNDELIVERED);
        Assert.assertEquals(model.getStatus(), MessageStatus.UNDELIVERED);
        model.setStatus(MessageStatus.EXPIRED);
        Assert.assertEquals(model.getStatus(), MessageStatus.EXPIRED);
        model.setStatus(MessageStatus.DELETED);
        Assert.assertEquals(model.getStatus(), MessageStatus.DELETED);
        model.setStatus(MessageStatus.UNKNOWN);
        Assert.assertEquals(model.getStatus(), MessageStatus.UNKNOWN);
    }

    /** Test the property 'from' */
    @Test
    public void fromTest() {

        model.setFrom("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getFrom());
    }

    /** Test the property 'to' */
    @Test
    public void toTest() {

        model.setTo("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getTo());
    }

    /** Test the property 'text' */
    @Test
    public void textTest() {

        model.setText("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getText());
    }

    /** Test the property 'direction' */
    @Test
    public void directionTest() {

        model.setDirection("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDirection());
    }

    /** Test the property 'notificationUrl' */
    @Test
    public void notificationUrlTest() {

        try {
            URI uri = new URI("TEST_STRING");
            model.setNotificationUrl(uri);
            Assert.assertEquals(uri, model.getNotificationUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** Test the property 'brandId' */
    @Test
    public void brandIdTest() {

        model.setBrandId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getBrandId());
    }

    /** Test the property 'campaignId' */
    @Test
    public void campaignIdTest() {

        model.setCampaignId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCampaignId());
    }

    /** Test the property 'segmentCount' */
    @Test
    public void segmentCountTest() {

        model.setSegmentCount(new BigDecimal(1.0));
        Assert.assertEquals(new BigDecimal(1.0), model.getSegmentCount());
    }

    /** Test the property 'mediaUrls' */
    @Test
    public void mediaUrlsTest() {

        List<URI> testList = new ArrayList<URI>();
        model.setMediaUrls(testList);
        Assert.assertEquals(testList, model.getMediaUrls());
    }

    /** Test the property 'tfn' */
    @Test
    public void tfnTest() {

        TFN object = new TFN();
        model.setTfn(object);
        Assert.assertEquals(object.getClass(), TFN.class);
    }

    /** Test the property 'phoneNumberId' */
    @Test
    public void phoneNumberIdTest() {

        model.setPhoneNumberId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getPhoneNumberId());
    }

    /** Test the property 'applicationId' */
    @Test
    public void applicationIdTest() {

        model.setApplicationId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getApplicationId());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        MessageResult test1 = new MessageResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setAccountId("TS");

        test1.setMessageId("TS");

        test1.setStatus(MessageStatus.NEW);

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setText("TS");

        test1.setDirection("TS");

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setNotificationUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test1.setBrandId("TS");

        test1.setCampaignId("TS");

        List<URI> testList = new ArrayList<URI>();
        test1.setMediaUrls(testList);

        TFN testTFNObject = new TFN();
        test1.setTfn(testTFNObject);

        test1.setPhoneNumberId("TS");

        test1.setApplicationId("TS");

        MessageResult test2 = new MessageResult();

        test2.setUri("TS");

        test2.setDateCreated("TS");

        test2.setDateUpdated("TS");

        test2.setRevision(1);

        test2.setAccountId("TS");

        test2.setMessageId("TS");

        test2.setStatus(MessageStatus.NEW);

        test2.setFrom("TS");

        test2.setTo("TS");

        test2.setText("TS");

        test2.setDirection("TS");

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setNotificationUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test2.setBrandId("TS");

        test2.setCampaignId("TS");

        List<URI> testList2 = testList;
        test2.setMediaUrls(testList2);

        TFN testTFNObject2 = testTFNObject;
        test2.setTfn(testTFNObject2);

        test2.setPhoneNumberId("TS");

        test2.setApplicationId("TS");

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        MessageResult test1 = new MessageResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setAccountId("TS");

        test1.setMessageId("TS");

        test1.setStatus(MessageStatus.QUEUED);

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setText("TS");

        test1.setDirection("TS");

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setNotificationUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test1.setBrandId("TS");

        test1.setCampaignId("TS");

        List<URI> testList = new ArrayList<URI>();
        test1.setMediaUrls(testList);

        TFN testTFNObject = new TFN();
        test1.setTfn(testTFNObject);

        test1.setPhoneNumberId("TS");

        test1.setApplicationId("TS");

        MessageResult test2 = new MessageResult();

        test2.setUri("TS2");

        test2.setDateCreated("TS2");

        test2.setDateUpdated("TS2");

        test2.setRevision(0);

        test2.setAccountId("TS2");

        test2.setMessageId("TS2");

        test2.setStatus(MessageStatus.NEW);

        test2.setFrom("TS2");

        test2.setTo("TS2");

        test2.setText("TS2");

        test2.setDirection("TS2");

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setNotificationUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test2.setBrandId("TS2");

        test2.setCampaignId("TS2");

        List<URI> testList2 = null;
        test2.setMediaUrls(testList2);

        TFN testTFNObject2 = new TFN();
        test2.setTfn(testTFNObject2);

        test2.setPhoneNumberId("TS2");

        test2.setApplicationId("TS2");

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        MessageResult test1 = new MessageResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setAccountId("TS");

        test1.setMessageId("TS");

        test1.setStatus(MessageStatus.NEW);

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setText("TS");

        test1.setDirection("TS");

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setNotificationUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test1.setBrandId("TS");

        test1.setCampaignId("TS");

        List<URI> testList = new ArrayList<URI>();
        test1.setMediaUrls(testList);

        TFN testTFNObject = new TFN();
        test1.setTfn(testTFNObject);

        test1.setPhoneNumberId("TS");

        test1.setApplicationId("TS");

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        MessageResult test1 = new MessageResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setAccountId("TS");

        test1.setMessageId("TS");

        test1.setStatus(MessageStatus.NEW);

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setText("TS");

        test1.setDirection("TS");

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setNotificationUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test1.setBrandId("TS");

        test1.setCampaignId("TS");

        List<URI> testList = new ArrayList<URI>();
        test1.setMediaUrls(testList);

        TFN testTFNObject = new TFN();
        test1.setTfn(testTFNObject);

        test1.setPhoneNumberId("TS");

        test1.setApplicationId("TS");

        MessageResult test2 = new MessageResult();

        test2.setUri("TS");

        test2.setDateCreated("TS");

        test2.setDateUpdated("TS");

        test2.setRevision(1);

        test2.setAccountId("TS");

        test2.setMessageId("TS");

        test2.setStatus(MessageStatus.NEW);

        test2.setFrom("TS");

        test2.setTo("TS");

        test2.setText("TS");

        test2.setDirection("TS");

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setNotificationUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test2.setBrandId("TS");

        test2.setCampaignId("TS");

        List<URI> testList2 = testList;
        test2.setMediaUrls(testList2);

        TFN testTFNObject2 = testTFNObject;
        test2.setTfn(testTFNObject2);

        test2.setPhoneNumberId("TS");

        test2.setApplicationId("TS");

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        MessageResult test1 = new MessageResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setAccountId("TS");

        test1.setMessageId("TS");

        test1.setStatus(MessageStatus.NEW);

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setText("TS");

        test1.setDirection("TS");

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setNotificationUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test1.setBrandId("TS");

        test1.setCampaignId("TS");

        List<URI> testList = new ArrayList<URI>();
        test1.setMediaUrls(testList);

        TFN testTFNObject = new TFN();
        test1.setTfn(testTFNObject);

        test1.setPhoneNumberId("TS");

        test1.setApplicationId("TS");

        MessageResult test2 = new MessageResult();

        test2.setUri("TS");

        test2.setDateCreated("TS");

        test2.setDateUpdated("TS");

        test2.setRevision(1);

        test2.setAccountId("TS");

        test2.setMessageId("TS");

        test2.setStatus(MessageStatus.NEW);

        test2.setFrom("TS");

        test2.setTo("TS");

        test2.setText("TS");

        test2.setDirection("TS");

        try {
            URI uri2 = new URI("TEST_STRING");
            test2.setNotificationUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test2.setBrandId("TS");

        test2.setCampaignId("TS");

        List<URI> testList2 = testList;
        test2.setMediaUrls(testList2);

        TFN testTFNObject2 = testTFNObject;
        test2.setTfn(testTFNObject2);

        test2.setPhoneNumberId("TS");

        test2.setApplicationId("TS");

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        MessageResult test1 = new MessageResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setAccountId("TS");

        test1.setMessageId("TS");

        test1.setStatus(MessageStatus.QUEUED);

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setText("TS");

        test1.setDirection("TS");

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setNotificationUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test1.setBrandId("TS");

        test1.setCampaignId("TS");

        List<URI> testList = new ArrayList<URI>();
        test1.setMediaUrls(testList);

        TFN testTFNObject = new TFN();
        test1.setTfn(testTFNObject);

        test1.setPhoneNumberId("TS");

        test1.setApplicationId("TS");

        MessageResult test2 = new MessageResult();

        test2.setUri("TS2");

        test2.setDateCreated("TS2");

        test2.setDateUpdated("TS2");

        test2.setRevision(0);

        test2.setAccountId("TS2");

        test2.setMessageId("TS2");

        test2.setStatus(MessageStatus.NEW);

        test2.setFrom("TS2");

        test2.setTo("TS2");

        test2.setText("TS2");

        test2.setDirection("TS2");

        try {
            URI uri2 = new URI("TEST_STRING2");
            test2.setNotificationUrl(uri2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test2.setBrandId("TS2");

        test2.setCampaignId("TS2");

        List<URI> testList2 = null;
        test2.setMediaUrls(testList2);

        TFN testTFNObject2 = new TFN();
        test2.setTfn(testTFNObject2);

        test2.setPhoneNumberId("TS2");

        test2.setApplicationId("TS2");

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        MessageResult test1 = new MessageResult();

        test1.setUri("TS");

        test1.setDateCreated("TS");

        test1.setDateUpdated("TS");

        test1.setRevision(1);

        test1.setAccountId("TS");

        test1.setMessageId("TS");

        test1.setStatus(MessageStatus.NEW);

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setText("TS");

        test1.setDirection("TS");

        try {
            URI uri1 = new URI("TEST_STRING");
            test1.setNotificationUrl(uri1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

        test1.setBrandId("TS");

        test1.setCampaignId("TS");

        List<URI> testList = new ArrayList<URI>();
        test1.setMediaUrls(testList);

        TFN testTFNObject = new TFN();
        test1.setTfn(testTFNObject);

        test1.setPhoneNumberId("TS");

        test1.setApplicationId("TS");

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }
}
