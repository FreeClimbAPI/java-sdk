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
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/** Model tests for SMSTenDLCCampaign */
public class SMSTenDLCCampaignTest {

    private final SMSTenDLCCampaign model = new SMSTenDLCCampaign();

    /** Test the property 'accountId' */
    @Test
    public void accountIdTest() {

        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
    }

    /** Test the property 'campaignId' */
    @Test
    public void campaignIdTest() {

        model.setCampaignId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCampaignId());
    }

    /** Test the property 'cspId' */
    @Test
    public void cspIdTest() {

        model.setCspId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCspId());
    }

    /** Test the property 'resellerId' */
    @Test
    public void resellerIdTest() {

        model.setResellerId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getResellerId());
    }

    /** Test the property 'status' */
    @Test
    public void statusTest() {
        model.setStatus(SMSTenDLCCampaignStatus.ACTIVE);
        Assert.assertEquals(model.getStatus(), SMSTenDLCCampaignStatus.ACTIVE);
        model.setStatus(SMSTenDLCCampaignStatus.EXPIRED);
        Assert.assertEquals(model.getStatus(), SMSTenDLCCampaignStatus.EXPIRED);
    }

    /** Test the property 'createDate' */
    @Test
    public void createDateTest() {
        model.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));
        Assert.assertEquals(OffsetDateTime.parse("2022-07-05T15:17:05Z"), model.getCreateDate());
    }

    /** Test the property 'autoRenewal' */
    @Test
    public void autoRenewalTest() {
        model.setAutoRenewal(false);
        Assert.assertEquals(false, model.getAutoRenewal());
    }

    /** Test the property 'billedDate' */
    @Test
    public void billedDateTest() {
        model.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));
        Assert.assertEquals(OffsetDateTime.parse("2022-07-05T15:17:05Z"), model.getBilledDate());
    }

    /** Test the property 'brandId' */
    @Test
    public void brandIdTest() {

        model.setBrandId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getBrandId());
    }

    /** Test the property 'usecase' */
    @Test
    public void usecaseTest() {

        model.setUsecase("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getUsecase());
    }

    /** Test the property 'subUsecases' */
    @Test
    public void subUsecasesTest() {

        Set<String> testSet = new HashSet<String>();
        model.setSubUsecases(testSet);
        Assert.assertEquals(testSet, model.getSubUsecases());
    }

    /** Test the property 'description' */
    @Test
    public void descriptionTest() {

        model.setDescription("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getDescription());
    }

    /** Test the property 'embeddedLink' */
    @Test
    public void embeddedLinkTest() {
        model.setEmbeddedLink(false);
        Assert.assertEquals(false, model.getEmbeddedLink());
    }

    /** Test the property 'embeddedPhone' */
    @Test
    public void embeddedPhoneTest() {
        model.setEmbeddedPhone(false);
        Assert.assertEquals(false, model.getEmbeddedPhone());
    }

    /** Test the property 'affiliateMarketing' */
    @Test
    public void affiliateMarketingTest() {
        model.setAffiliateMarketing(false);
        Assert.assertEquals(false, model.getAffiliateMarketing());
    }

    /** Test the property 'numberPool' */
    @Test
    public void numberPoolTest() {
        model.setNumberPool(false);
        Assert.assertEquals(false, model.getNumberPool());
    }

    /** Test the property 'ageGated' */
    @Test
    public void ageGatedTest() {
        model.setAgeGated(false);
        Assert.assertEquals(false, model.getAgeGated());
    }

    /** Test the property 'directLending' */
    @Test
    public void directLendingTest() {
        model.setDirectLending(false);
        Assert.assertEquals(false, model.getDirectLending());
    }

    /** Test the property 'subscriberOptin' */
    @Test
    public void subscriberOptinTest() {
        model.setSubscriberOptin(false);
        Assert.assertEquals(false, model.getSubscriberOptin());
    }

    /** Test the property 'subscriberOptout' */
    @Test
    public void subscriberOptoutTest() {
        model.setSubscriberOptout(false);
        Assert.assertEquals(false, model.getSubscriberOptout());
    }

    /** Test the property 'subscriberHelp' */
    @Test
    public void subscriberHelpTest() {
        model.setSubscriberHelp(false);
        Assert.assertEquals(false, model.getSubscriberHelp());
    }

    /** Test the property 'sample1' */
    @Test
    public void sample1Test() {

        model.setSample1("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getSample1());
    }

    /** Test the property 'sample2' */
    @Test
    public void sample2Test() {

        model.setSample2("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getSample2());
    }

    /** Test the property 'sample3' */
    @Test
    public void sample3Test() {

        model.setSample3("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getSample3());
    }

    /** Test the property 'sample4' */
    @Test
    public void sample4Test() {

        model.setSample4("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getSample4());
    }

    /** Test the property 'sample5' */
    @Test
    public void sample5Test() {

        model.setSample5("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getSample5());
    }

    /** Test the property 'messageFlow' */
    @Test
    public void messageFlowTest() {

        model.setMessageFlow("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getMessageFlow());
    }

    /** Test the property 'helpMessage' */
    @Test
    public void helpMessageTest() {

        model.setHelpMessage("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getHelpMessage());
    }

    /** Test the property 'optinKeywords' */
    @Test
    public void optinKeywordsTest() {

        model.setOptinKeywords("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getOptinKeywords());
    }

    /** Test the property 'optoutKeywords' */
    @Test
    public void optoutKeywordsTest() {

        model.setOptoutKeywords("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getOptoutKeywords());
    }

    /** Test the property 'helpKeywords' */
    @Test
    public void helpKeywordsTest() {

        model.setHelpKeywords("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getHelpKeywords());
    }

    /** Test the property 'optinMessage' */
    @Test
    public void optinMessageTest() {

        model.setOptinMessage("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getOptinMessage());
    }

    /** Test the property 'optoutMessage' */
    @Test
    public void optoutMessageTest() {

        model.setOptoutMessage("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getOptoutMessage());
    }

    /** Test the property 'referenceId' */
    @Test
    public void referenceIdTest() {

        model.setReferenceId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getReferenceId());
    }

    /** Test the property 'mock' */
    @Test
    public void mockTest() {
        model.setMock(false);
        Assert.assertEquals(false, model.getMock());
    }

    /** Test the property 'nextRenewalOrExpirationDate' */
    @Test
    public void nextRenewalOrExpirationDateTest() {
        model.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));
        Assert.assertEquals(LocalDate.parse("2000-01-01"), model.getNextRenewalOrExpirationDate());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        SMSTenDLCCampaign test1 = new SMSTenDLCCampaign();

        test1.setAccountId("TS");

        test1.setCampaignId("TS");

        test1.setCspId("TS");

        test1.setResellerId("TS");

        test1.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setAutoRenewal(true);

        test1.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setBrandId("TS");

        test1.setUsecase("TS");

        Set<String> testSet = new HashSet<String>();
        test1.setSubUsecases(testSet);

        test1.setDescription("TS");

        test1.setEmbeddedLink(true);

        test1.setEmbeddedPhone(true);

        test1.setAffiliateMarketing(true);

        test1.setNumberPool(true);

        test1.setAgeGated(true);

        test1.setDirectLending(true);

        test1.setSubscriberOptin(true);

        test1.setSubscriberOptout(true);

        test1.setSubscriberHelp(true);

        test1.setSample1("TS");

        test1.setSample2("TS");

        test1.setSample3("TS");

        test1.setSample4("TS");

        test1.setSample5("TS");

        test1.setMessageFlow("TS");

        test1.setHelpMessage("TS");

        test1.setOptinKeywords("TS");

        test1.setOptoutKeywords("TS");

        test1.setHelpKeywords("TS");

        test1.setOptinMessage("TS");

        test1.setOptoutMessage("TS");

        test1.setReferenceId("TS");

        test1.setMock(true);

        test1.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        SMSTenDLCCampaign test2 = new SMSTenDLCCampaign();

        test2.setAccountId("TS");

        test2.setCampaignId("TS");

        test2.setCspId("TS");

        test2.setResellerId("TS");

        test2.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test2.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test2.setAutoRenewal(true);

        test2.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test2.setBrandId("TS");

        test2.setUsecase("TS");

        Set<String> testSet2 = testSet;
        test2.setSubUsecases(testSet2);

        test2.setDescription("TS");

        test2.setEmbeddedLink(true);

        test2.setEmbeddedPhone(true);

        test2.setAffiliateMarketing(true);

        test2.setNumberPool(true);

        test2.setAgeGated(true);

        test2.setDirectLending(true);

        test2.setSubscriberOptin(true);

        test2.setSubscriberOptout(true);

        test2.setSubscriberHelp(true);

        test2.setSample1("TS");

        test2.setSample2("TS");

        test2.setSample3("TS");

        test2.setSample4("TS");

        test2.setSample5("TS");

        test2.setMessageFlow("TS");

        test2.setHelpMessage("TS");

        test2.setOptinKeywords("TS");

        test2.setOptoutKeywords("TS");

        test2.setHelpKeywords("TS");

        test2.setOptinMessage("TS");

        test2.setOptoutMessage("TS");

        test2.setReferenceId("TS");

        test2.setMock(true);

        test2.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        SMSTenDLCCampaign test1 = new SMSTenDLCCampaign();

        test1.setAccountId("TS");

        test1.setCampaignId("TS");

        test1.setCspId("TS");

        test1.setResellerId("TS");

        test1.setStatus(SMSTenDLCCampaignStatus.EXPIRED);

        test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setAutoRenewal(true);

        test1.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setBrandId("TS");

        test1.setUsecase("TS");

        Set<String> testSet = new HashSet<String>();
        test1.setSubUsecases(testSet);

        test1.setDescription("TS");

        test1.setEmbeddedLink(true);

        test1.setEmbeddedPhone(true);

        test1.setAffiliateMarketing(true);

        test1.setNumberPool(true);

        test1.setAgeGated(true);

        test1.setDirectLending(true);

        test1.setSubscriberOptin(true);

        test1.setSubscriberOptout(true);

        test1.setSubscriberHelp(true);

        test1.setSample1("TS");

        test1.setSample2("TS");

        test1.setSample3("TS");

        test1.setSample4("TS");

        test1.setSample5("TS");

        test1.setMessageFlow("TS");

        test1.setHelpMessage("TS");

        test1.setOptinKeywords("TS");

        test1.setOptoutKeywords("TS");

        test1.setHelpKeywords("TS");

        test1.setOptinMessage("TS");

        test1.setOptoutMessage("TS");

        test1.setReferenceId("TS");

        test1.setMock(true);

        test1.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        SMSTenDLCCampaign test2 = new SMSTenDLCCampaign();

        test2.setAccountId("TS2");

        test2.setCampaignId("TS2");

        test2.setCspId("TS2");

        test2.setResellerId("TS2");

        test2.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test2.setCreateDate(OffsetDateTime.parse("2024-07-05T15:17:05Z"));

        test2.setAutoRenewal(false);

        test2.setBilledDate(OffsetDateTime.parse("2024-07-05T15:17:05Z"));

        test2.setBrandId("TS2");

        test2.setUsecase("TS2");

        Set<String> testSet2 = new HashSet<String>();
        test2.setSubUsecases(testSet2);

        test2.setDescription("TS2");

        test2.setEmbeddedLink(false);

        test2.setEmbeddedPhone(false);

        test2.setAffiliateMarketing(false);

        test2.setNumberPool(false);

        test2.setAgeGated(false);

        test2.setDirectLending(false);

        test2.setSubscriberOptin(false);

        test2.setSubscriberOptout(false);

        test2.setSubscriberHelp(false);

        test2.setSample1("TS2");

        test2.setSample2("TS2");

        test2.setSample3("TS2");

        test2.setSample4("TS2");

        test2.setSample5("TS2");

        test2.setMessageFlow("TS2");

        test2.setHelpMessage("TS2");

        test2.setOptinKeywords("TS2");

        test2.setOptoutKeywords("TS2");

        test2.setHelpKeywords("TS2");

        test2.setOptinMessage("TS2");

        test2.setOptoutMessage("TS2");

        test2.setReferenceId("TS2");

        test2.setMock(false);

        test2.setNextRenewalOrExpirationDate(LocalDate.parse("2001-01-01"));

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        SMSTenDLCCampaign test1 = new SMSTenDLCCampaign();

        test1.setAccountId("TS");

        test1.setCampaignId("TS");

        test1.setCspId("TS");

        test1.setResellerId("TS");

        test1.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setAutoRenewal(true);

        test1.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setBrandId("TS");

        test1.setUsecase("TS");

        Set<String> testSet = new HashSet<String>();
        test1.setSubUsecases(testSet);

        test1.setDescription("TS");

        test1.setEmbeddedLink(true);

        test1.setEmbeddedPhone(true);

        test1.setAffiliateMarketing(true);

        test1.setNumberPool(true);

        test1.setAgeGated(true);

        test1.setDirectLending(true);

        test1.setSubscriberOptin(true);

        test1.setSubscriberOptout(true);

        test1.setSubscriberHelp(true);

        test1.setSample1("TS");

        test1.setSample2("TS");

        test1.setSample3("TS");

        test1.setSample4("TS");

        test1.setSample5("TS");

        test1.setMessageFlow("TS");

        test1.setHelpMessage("TS");

        test1.setOptinKeywords("TS");

        test1.setOptoutKeywords("TS");

        test1.setHelpKeywords("TS");

        test1.setOptinMessage("TS");

        test1.setOptoutMessage("TS");

        test1.setReferenceId("TS");

        test1.setMock(true);

        test1.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        SMSTenDLCCampaign test1 = new SMSTenDLCCampaign();

        test1.setAccountId("TS");

        test1.setCampaignId("TS");

        test1.setCspId("TS");

        test1.setResellerId("TS");

        test1.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setAutoRenewal(true);

        test1.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setBrandId("TS");

        test1.setUsecase("TS");

        Set<String> testSet = new HashSet<String>();
        test1.setSubUsecases(testSet);

        test1.setDescription("TS");

        test1.setEmbeddedLink(true);

        test1.setEmbeddedPhone(true);

        test1.setAffiliateMarketing(true);

        test1.setNumberPool(true);

        test1.setAgeGated(true);

        test1.setDirectLending(true);

        test1.setSubscriberOptin(true);

        test1.setSubscriberOptout(true);

        test1.setSubscriberHelp(true);

        test1.setSample1("TS");

        test1.setSample2("TS");

        test1.setSample3("TS");

        test1.setSample4("TS");

        test1.setSample5("TS");

        test1.setMessageFlow("TS");

        test1.setHelpMessage("TS");

        test1.setOptinKeywords("TS");

        test1.setOptoutKeywords("TS");

        test1.setHelpKeywords("TS");

        test1.setOptinMessage("TS");

        test1.setOptoutMessage("TS");

        test1.setReferenceId("TS");

        test1.setMock(true);

        test1.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        SMSTenDLCCampaign test2 = new SMSTenDLCCampaign();

        test2.setAccountId("TS");

        test2.setCampaignId("TS");

        test2.setCspId("TS");

        test2.setResellerId("TS");

        test2.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test2.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test2.setAutoRenewal(true);

        test2.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test2.setBrandId("TS");

        test2.setUsecase("TS");

        Set<String> testSet2 = testSet;
        test2.setSubUsecases(testSet2);

        test2.setDescription("TS");

        test2.setEmbeddedLink(true);

        test2.setEmbeddedPhone(true);

        test2.setAffiliateMarketing(true);

        test2.setNumberPool(true);

        test2.setAgeGated(true);

        test2.setDirectLending(true);

        test2.setSubscriberOptin(true);

        test2.setSubscriberOptout(true);

        test2.setSubscriberHelp(true);

        test2.setSample1("TS");

        test2.setSample2("TS");

        test2.setSample3("TS");

        test2.setSample4("TS");

        test2.setSample5("TS");

        test2.setMessageFlow("TS");

        test2.setHelpMessage("TS");

        test2.setOptinKeywords("TS");

        test2.setOptoutKeywords("TS");

        test2.setHelpKeywords("TS");

        test2.setOptinMessage("TS");

        test2.setOptoutMessage("TS");

        test2.setReferenceId("TS");

        test2.setMock(true);

        test2.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        SMSTenDLCCampaign test1 = new SMSTenDLCCampaign();

        test1.setAccountId("TS");

        test1.setCampaignId("TS");

        test1.setCspId("TS");

        test1.setResellerId("TS");

        test1.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setAutoRenewal(true);

        test1.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setBrandId("TS");

        test1.setUsecase("TS");

        Set<String> testSet = new HashSet<String>();
        test1.setSubUsecases(testSet);

        test1.setDescription("TS");

        test1.setEmbeddedLink(true);

        test1.setEmbeddedPhone(true);

        test1.setAffiliateMarketing(true);

        test1.setNumberPool(true);

        test1.setAgeGated(true);

        test1.setDirectLending(true);

        test1.setSubscriberOptin(true);

        test1.setSubscriberOptout(true);

        test1.setSubscriberHelp(true);

        test1.setSample1("TS");

        test1.setSample2("TS");

        test1.setSample3("TS");

        test1.setSample4("TS");

        test1.setSample5("TS");

        test1.setMessageFlow("TS");

        test1.setHelpMessage("TS");

        test1.setOptinKeywords("TS");

        test1.setOptoutKeywords("TS");

        test1.setHelpKeywords("TS");

        test1.setOptinMessage("TS");

        test1.setOptoutMessage("TS");

        test1.setReferenceId("TS");

        test1.setMock(true);

        test1.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        SMSTenDLCCampaign test2 = new SMSTenDLCCampaign();

        test2.setAccountId("TS");

        test2.setCampaignId("TS");

        test2.setCspId("TS");

        test2.setResellerId("TS");

        test2.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test2.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test2.setAutoRenewal(true);

        test2.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test2.setBrandId("TS");

        test2.setUsecase("TS");

        Set<String> testSet2 = testSet;
        test2.setSubUsecases(testSet2);

        test2.setDescription("TS");

        test2.setEmbeddedLink(true);

        test2.setEmbeddedPhone(true);

        test2.setAffiliateMarketing(true);

        test2.setNumberPool(true);

        test2.setAgeGated(true);

        test2.setDirectLending(true);

        test2.setSubscriberOptin(true);

        test2.setSubscriberOptout(true);

        test2.setSubscriberHelp(true);

        test2.setSample1("TS");

        test2.setSample2("TS");

        test2.setSample3("TS");

        test2.setSample4("TS");

        test2.setSample5("TS");

        test2.setMessageFlow("TS");

        test2.setHelpMessage("TS");

        test2.setOptinKeywords("TS");

        test2.setOptoutKeywords("TS");

        test2.setHelpKeywords("TS");

        test2.setOptinMessage("TS");

        test2.setOptoutMessage("TS");

        test2.setReferenceId("TS");

        test2.setMock(true);

        test2.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        SMSTenDLCCampaign test1 = new SMSTenDLCCampaign();

        test1.setAccountId("TS");

        test1.setCampaignId("TS");

        test1.setCspId("TS");

        test1.setResellerId("TS");

        test1.setStatus(SMSTenDLCCampaignStatus.EXPIRED);

        test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setAutoRenewal(true);

        test1.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setBrandId("TS");

        test1.setUsecase("TS");

        Set<String> testSet = new HashSet<String>();
        test1.setSubUsecases(testSet);

        test1.setDescription("TS");

        test1.setEmbeddedLink(true);

        test1.setEmbeddedPhone(true);

        test1.setAffiliateMarketing(true);

        test1.setNumberPool(true);

        test1.setAgeGated(true);

        test1.setDirectLending(true);

        test1.setSubscriberOptin(true);

        test1.setSubscriberOptout(true);

        test1.setSubscriberHelp(true);

        test1.setSample1("TS");

        test1.setSample2("TS");

        test1.setSample3("TS");

        test1.setSample4("TS");

        test1.setSample5("TS");

        test1.setMessageFlow("TS");

        test1.setHelpMessage("TS");

        test1.setOptinKeywords("TS");

        test1.setOptoutKeywords("TS");

        test1.setHelpKeywords("TS");

        test1.setOptinMessage("TS");

        test1.setOptoutMessage("TS");

        test1.setReferenceId("TS");

        test1.setMock(true);

        test1.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        SMSTenDLCCampaign test2 = new SMSTenDLCCampaign();

        test2.setAccountId("TS2");

        test2.setCampaignId("TS2");

        test2.setCspId("TS2");

        test2.setResellerId("TS2");

        test2.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test2.setCreateDate(OffsetDateTime.parse("2024-07-05T15:17:05Z"));

        test2.setAutoRenewal(false);

        test2.setBilledDate(OffsetDateTime.parse("2024-07-05T15:17:05Z"));

        test2.setBrandId("TS2");

        test2.setUsecase("TS2");

        Set<String> testSet2 = new HashSet<String>();
        test2.setSubUsecases(testSet2);

        test2.setDescription("TS2");

        test2.setEmbeddedLink(false);

        test2.setEmbeddedPhone(false);

        test2.setAffiliateMarketing(false);

        test2.setNumberPool(false);

        test2.setAgeGated(false);

        test2.setDirectLending(false);

        test2.setSubscriberOptin(false);

        test2.setSubscriberOptout(false);

        test2.setSubscriberHelp(false);

        test2.setSample1("TS2");

        test2.setSample2("TS2");

        test2.setSample3("TS2");

        test2.setSample4("TS2");

        test2.setSample5("TS2");

        test2.setMessageFlow("TS2");

        test2.setHelpMessage("TS2");

        test2.setOptinKeywords("TS2");

        test2.setOptoutKeywords("TS2");

        test2.setHelpKeywords("TS2");

        test2.setOptinMessage("TS2");

        test2.setOptoutMessage("TS2");

        test2.setReferenceId("TS2");

        test2.setMock(false);

        test2.setNextRenewalOrExpirationDate(LocalDate.parse("2001-01-01"));

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        SMSTenDLCCampaign test1 = new SMSTenDLCCampaign();

        test1.setAccountId("TS");

        test1.setCampaignId("TS");

        test1.setCspId("TS");

        test1.setResellerId("TS");

        test1.setStatus(SMSTenDLCCampaignStatus.ACTIVE);

        test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setAutoRenewal(true);

        test1.setBilledDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

        test1.setBrandId("TS");

        test1.setUsecase("TS");

        Set<String> testSet = new HashSet<String>();
        test1.setSubUsecases(testSet);

        test1.setDescription("TS");

        test1.setEmbeddedLink(true);

        test1.setEmbeddedPhone(true);

        test1.setAffiliateMarketing(true);

        test1.setNumberPool(true);

        test1.setAgeGated(true);

        test1.setDirectLending(true);

        test1.setSubscriberOptin(true);

        test1.setSubscriberOptout(true);

        test1.setSubscriberHelp(true);

        test1.setSample1("TS");

        test1.setSample2("TS");

        test1.setSample3("TS");

        test1.setSample4("TS");

        test1.setSample5("TS");

        test1.setMessageFlow("TS");

        test1.setHelpMessage("TS");

        test1.setOptinKeywords("TS");

        test1.setOptoutKeywords("TS");

        test1.setHelpKeywords("TS");

        test1.setOptinMessage("TS");

        test1.setOptoutMessage("TS");

        test1.setReferenceId("TS");

        test1.setMock(true);

        test1.setNextRenewalOrExpirationDate(LocalDate.parse("2000-01-01"));

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }
}
