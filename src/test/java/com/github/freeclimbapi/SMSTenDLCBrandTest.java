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

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDate;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;

/**
 * Model tests for SMSTenDLCBrand
 */
public class SMSTenDLCBrandTest {
  private final SMSTenDLCBrand model = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");

  /**
   * Test the property 'accountId'
   */
  @Test
  public void accountIdTest() {
    model.setAccountId("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getAccountId());

  }

  /**
   * Test the property 'entityType'
   */
  @Test
  public void entityTypeTest() {

    model.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    Assert.assertEquals(model.getEntityType(), SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);

    model.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PUBLIC_PROFIT);
    Assert.assertEquals(model.getEntityType(), SMSTenDLCBrand.EntityTypeEnum.PUBLIC_PROFIT);

    model.setEntityType(SMSTenDLCBrand.EntityTypeEnum.NON_PROFIT);
    Assert.assertEquals(model.getEntityType(), SMSTenDLCBrand.EntityTypeEnum.NON_PROFIT);

    model.setEntityType(SMSTenDLCBrand.EntityTypeEnum.GOVERNMENT);
    Assert.assertEquals(model.getEntityType(), SMSTenDLCBrand.EntityTypeEnum.GOVERNMENT);

    model.setEntityType(SMSTenDLCBrand.EntityTypeEnum.SOLE_PROPRIETOR);
    Assert.assertEquals(model.getEntityType(), SMSTenDLCBrand.EntityTypeEnum.SOLE_PROPRIETOR);

  }

  /**
   * Test the property 'cspId'
   */
  @Test
  public void cspIdTest() {

    Assert.assertEquals("TEST_STRING", model.getCspId());

  }

  /**
   * Test the property 'brandId'
   */
  @Test
  public void brandIdTest() {

    Assert.assertEquals("TEST_STRING", model.getBrandId());

  }

  /**
   * Test the property 'firstName'
   */
  @Test
  public void firstNameTest() {
    model.setFirstName("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getFirstName());

  }

  /**
   * Test the property 'lastName'
   */
  @Test
  public void lastNameTest() {
    model.setLastName("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getLastName());

  }

  /**
   * Test the property 'displayName'
   */
  @Test
  public void displayNameTest() {
    model.setDisplayName("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getDisplayName());

  }

  /**
   * Test the property 'companyName'
   */
  @Test
  public void companyNameTest() {
    model.setCompanyName("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getCompanyName());

  }

  /**
   * Test the property 'ein'
   */
  @Test
  public void einTest() {
    model.setEin("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getEin());

  }

  /**
   * Test the property 'einIssuingCountry'
   */
  @Test
  public void einIssuingCountryTest() {
    model.setEinIssuingCountry("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getEinIssuingCountry());

  }

  /**
   * Test the property 'phone'
   */
  @Test
  public void phoneTest() {
    model.setPhone("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getPhone());

  }

  /**
   * Test the property 'street'
   */
  @Test
  public void streetTest() {
    model.setStreet("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getStreet());

  }

  /**
   * Test the property 'city'
   */
  @Test
  public void cityTest() {
    model.setCity("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getCity());

  }

  /**
   * Test the property 'state'
   */
  @Test
  public void stateTest() {
    model.setState("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getState());

  }

  /**
   * Test the property 'postalCode'
   */
  @Test
  public void postalCodeTest() {
    model.setPostalCode("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getPostalCode());

  }

  /**
   * Test the property 'country'
   */
  @Test
  public void countryTest() {
    model.setCountry("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getCountry());

  }

  /**
   * Test the property 'email'
   */
  @Test
  public void emailTest() {
    model.setEmail("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getEmail());

  }

  /**
   * Test the property 'stockSymbol'
   */
  @Test
  public void stockSymbolTest() {
    model.setStockSymbol("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getStockSymbol());

  }

  /**
   * Test the property 'stockExchange'
   */
  @Test
  public void stockExchangeTest() {

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.NONE);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NASDAQ);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.NASDAQ);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NYSE);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.NYSE);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.AMEX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.AMEX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.AMX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.AMX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.ASX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.ASX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.B3);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.B3);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.BME);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.BME);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.BSE);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.BSE);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.FRA);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.FRA);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.ICEX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.ICEX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.JPX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.JPX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.JSE);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.JSE);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.KRX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.KRX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.LON);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.LON);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NSE);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.NSE);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.OMX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.OMX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.SEHK);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.SEHK);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.SGX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.SGX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.SSE);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.SSE);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.STO);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.STO);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.SWX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.SWX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.SZSE);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.SZSE);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.TSX);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.TSX);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.TWSE);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.TWSE);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.VSE);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.VSE);

    model.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.OTHER);
    Assert.assertEquals(model.getStockExchange(), SMSTenDLCBrand.StockExchangeEnum.OTHER);

  }

  /**
   * Test the property 'ipAddress'
   */
  @Test
  public void ipAddressTest() {
    model.setIpAddress("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getIpAddress());

  }

  /**
   * Test the property 'website'
   */
  @Test
  public void websiteTest() {
    model.setWebsite("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getWebsite());

  }

  /**
   * Test the property 'brandRelationship'
   */
  @Test
  public void brandRelationshipTest() {

    model.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    Assert.assertEquals(model.getBrandRelationship(), SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);

    model.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.SMALL_ACCOUNT);
    Assert.assertEquals(model.getBrandRelationship(), SMSTenDLCBrand.BrandRelationshipEnum.SMALL_ACCOUNT);

    model.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.MEDIUM_ACCOUNT);
    Assert.assertEquals(model.getBrandRelationship(), SMSTenDLCBrand.BrandRelationshipEnum.MEDIUM_ACCOUNT);

    model.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.LARGE_ACCOUNT);
    Assert.assertEquals(model.getBrandRelationship(), SMSTenDLCBrand.BrandRelationshipEnum.LARGE_ACCOUNT);

    model.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.KEY_ACCOUNT);
    Assert.assertEquals(model.getBrandRelationship(), SMSTenDLCBrand.BrandRelationshipEnum.KEY_ACCOUNT);

  }

  /**
   * Test the property 'vertical'
   */
  @Test
  public void verticalTest() {
    model.setVertical("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getVertical());

  }

  /**
   * Test the property 'altBusinessId'
   */
  @Test
  public void altBusinessIdTest() {
    model.setAltBusinessId("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getAltBusinessId());

  }

  /**
   * Test the property 'altBusinessIdType'
   */
  @Test
  public void altBusinessIdTypeTest() {

    model.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    Assert.assertEquals(model.getAltBusinessIdType(), SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);

    model.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.DUNS);
    Assert.assertEquals(model.getAltBusinessIdType(), SMSTenDLCBrand.AltBusinessIdTypeEnum.DUNS);

    model.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.GIIN);
    Assert.assertEquals(model.getAltBusinessIdType(), SMSTenDLCBrand.AltBusinessIdTypeEnum.GIIN);

    model.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.LEI);
    Assert.assertEquals(model.getAltBusinessIdType(), SMSTenDLCBrand.AltBusinessIdTypeEnum.LEI);

  }

  /**
   * Test the property 'universalEin'
   */
  @Test
  public void universalEinTest() {

    Assert.assertEquals("TEST_STRING", model.getUniversalEin());

  }

  /**
   * Test the property 'referenceId'
   */
  @Test
  public void referenceIdTest() {
    model.setReferenceId("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getReferenceId());

  }

  /**
   * Test the property 'optionalAttributes'
   */
  @Test
  public void optionalAttributesTest() {

    Map<String, Object> testMap = new HashMap();
    model.setOptionalAttributes(testMap);
    Assert.assertEquals(testMap, model.getOptionalAttributes());
  }

  /**
   * Test the property 'mock'
   */
  @Test
  public void mockTest() {
    model.setMock(false);
    Assert.assertEquals(false, model.getMock());

  }

  /**
   * Test the property 'identityStatus'
   */
  @Test
  public void identityStatusTest() {

    model.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    Assert.assertEquals(model.getIdentityStatus(), SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);

    model.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.UNVERIFIED);
    Assert.assertEquals(model.getIdentityStatus(), SMSTenDLCBrand.IdentityStatusEnum.UNVERIFIED);

    model.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.VERIFIED);
    Assert.assertEquals(model.getIdentityStatus(), SMSTenDLCBrand.IdentityStatusEnum.VERIFIED);

    model.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.VETTED_VERIFIED);
    Assert.assertEquals(model.getIdentityStatus(), SMSTenDLCBrand.IdentityStatusEnum.VETTED_VERIFIED);

  }

  /**
   * Test the property 'createDate'
   */
  @Test
  public void createDateTest() {
    model.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));
    Assert.assertEquals(OffsetDateTime.parse("2022-07-05T15:17:05Z"), model.getCreateDate());

  }

  /**
   * Test the method 'equalsTrue'
   */

  @Test
  public void equalsTrueTest() {
    SMSTenDLCBrand test1 = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");
    test1.setAccountId("TS");
    test1.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test1.setFirstName("TS");
    test1.setLastName("TS");
    test1.setDisplayName("TS");
    test1.setCompanyName("TS");
    test1.setEin("TS");
    test1.setEinIssuingCountry("TS");
    test1.setPhone("TS");
    test1.setStreet("TS");
    test1.setCity("TS");
    test1.setState("TS");
    test1.setPostalCode("TS");
    test1.setCountry("TS");
    test1.setEmail("TS");
    test1.setStockSymbol("TS");
    test1.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test1.setIpAddress("TS");
    test1.setWebsite("TS");
    test1.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test1.setVertical("TS");
    test1.setAltBusinessId("TS");
    test1.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test1.setReferenceId("TS");
    Map<String, Object> testMap = new HashMap();
    test1.setOptionalAttributes(testMap);
    test1.setMock(true);
    test1.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));
    SMSTenDLCBrand test2 = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");
    test2.setAccountId("TS");
    test2.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test2.setFirstName("TS");
    test2.setLastName("TS");
    test2.setDisplayName("TS");
    test2.setCompanyName("TS");
    test2.setEin("TS");
    test2.setEinIssuingCountry("TS");
    test2.setPhone("TS");
    test2.setStreet("TS");
    test2.setCity("TS");
    test2.setState("TS");
    test2.setPostalCode("TS");
    test2.setCountry("TS");
    test2.setEmail("TS");
    test2.setStockSymbol("TS");
    test2.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test2.setIpAddress("TS");
    test2.setWebsite("TS");
    test2.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test2.setVertical("TS");
    test2.setAltBusinessId("TS");
    test2.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test2.setReferenceId("TS");
    Map<String, Object> testMap2 = testMap;
    test2.setOptionalAttributes(testMap);
    test2.setMock(true);
    test2.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test2.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

    Assert.assertTrue(test1.equals(test2));
  }

  /**
   * Test the method 'equalsFalse'
   */

  @Test
  public void equalsFalseTest() {
    SMSTenDLCBrand test1 = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");
    test1.setAccountId("TS");
    test1.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test1.setFirstName("TS");
    test1.setLastName("TS");
    test1.setDisplayName("TS");
    test1.setCompanyName("TS");
    test1.setEin("TS");
    test1.setEinIssuingCountry("TS");
    test1.setPhone("TS");
    test1.setStreet("TS");
    test1.setCity("TS");
    test1.setState("TS");
    test1.setPostalCode("TS");
    test1.setCountry("TS");
    test1.setEmail("TS");
    test1.setStockSymbol("TS");
    test1.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test1.setIpAddress("TS");
    test1.setWebsite("TS");
    test1.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test1.setVertical("TS");
    test1.setAltBusinessId("TS");
    test1.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test1.setReferenceId("TS");
    Map<String, Object> testMap = new HashMap();
    test1.setOptionalAttributes(testMap);
    test1.setMock(true);
    test1.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));
    SMSTenDLCBrand test2 = new SMSTenDLCBrand("tS", "tS", "tS");
    test2.setAccountId("tS");
    test2.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test2.setFirstName("tS");
    test2.setLastName("tS");
    test2.setDisplayName("tS");
    test2.setCompanyName("tS");
    test2.setEin("tS");
    test2.setEinIssuingCountry("tS");
    test2.setPhone("tS");
    test2.setStreet("tS");
    test2.setCity("tS");
    test2.setState("tS");
    test2.setPostalCode("tS");
    test2.setCountry("tS");
    test2.setEmail("tS");
    test2.setStockSymbol("tS");
    test2.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test2.setIpAddress("tS");
    test2.setWebsite("tS");
    test2.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test2.setVertical("tS");
    test2.setAltBusinessId("tS");
    test2.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test2.setReferenceId("tS");
    Map<String, Object> testMap2 = new HashMap();
    test2.setOptionalAttributes(testMap2);
    test2.setMock(false);
    test2.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test2.setCreateDate(OffsetDateTime.parse("2024-07-05T15:17:05Z"));

    Assert.assertFalse(test1.equals(test2));
  }

  /**
   * Test the method 'hashCodeType'
   */

  @Test
  public void hashCodeTypeTest() {
    SMSTenDLCBrand test1 = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");
    test1.setAccountId("TS");
    test1.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test1.setFirstName("TS");
    test1.setLastName("TS");
    test1.setDisplayName("TS");
    test1.setCompanyName("TS");
    test1.setEin("TS");
    test1.setEinIssuingCountry("TS");
    test1.setPhone("TS");
    test1.setStreet("TS");
    test1.setCity("TS");
    test1.setState("TS");
    test1.setPostalCode("TS");
    test1.setCountry("TS");
    test1.setEmail("TS");
    test1.setStockSymbol("TS");
    test1.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test1.setIpAddress("TS");
    test1.setWebsite("TS");
    test1.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test1.setVertical("TS");
    test1.setAltBusinessId("TS");
    test1.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test1.setReferenceId("TS");
    Map<String, Object> testMap = new HashMap();
    test1.setOptionalAttributes(testMap);
    test1.setMock(true);
    test1.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

    int hashCode1 = test1.hashCode();
    Assert.assertTrue(Integer.class.isInstance(hashCode1));
  }

  /**
   * Test the method 'toStringEquals'
   */

  @Test
  public void toStringEqualsTest() {
    SMSTenDLCBrand test1 = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");
    test1.setAccountId("TS");
    test1.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test1.setFirstName("TS");
    test1.setLastName("TS");
    test1.setDisplayName("TS");
    test1.setCompanyName("TS");
    test1.setEin("TS");
    test1.setEinIssuingCountry("TS");
    test1.setPhone("TS");
    test1.setStreet("TS");
    test1.setCity("TS");
    test1.setState("TS");
    test1.setPostalCode("TS");
    test1.setCountry("TS");
    test1.setEmail("TS");
    test1.setStockSymbol("TS");
    test1.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test1.setIpAddress("TS");
    test1.setWebsite("TS");
    test1.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test1.setVertical("TS");
    test1.setAltBusinessId("TS");
    test1.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test1.setReferenceId("TS");
    Map<String, Object> testMap = new HashMap();
    test1.setOptionalAttributes(testMap);
    test1.setMock(true);
    test1.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));
    SMSTenDLCBrand test2 = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");
    test2.setAccountId("TS");
    test2.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test2.setFirstName("TS");
    test2.setLastName("TS");
    test2.setDisplayName("TS");
    test2.setCompanyName("TS");
    test2.setEin("TS");
    test2.setEinIssuingCountry("TS");
    test2.setPhone("TS");
    test2.setStreet("TS");
    test2.setCity("TS");
    test2.setState("TS");
    test2.setPostalCode("TS");
    test2.setCountry("TS");
    test2.setEmail("TS");
    test2.setStockSymbol("TS");
    test2.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test2.setIpAddress("TS");
    test2.setWebsite("TS");
    test2.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test2.setVertical("TS");
    test2.setAltBusinessId("TS");
    test2.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test2.setReferenceId("TS");
    Map<String, Object> testMap2 = testMap;
    test2.setOptionalAttributes(testMap2);
    test2.setMock(true);
    test2.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test2.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

    String toString1 = test1.toString();
    String toString2 = test2.toString();
    Assert.assertEquals(toString1, toString2);
  }

  /**
   * Test the method 'hashCodeEquals'
   */

  @Test
  public void hashCodeEqualsTest() {
    SMSTenDLCBrand test1 = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");
    test1.setAccountId("TS");
    test1.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test1.setFirstName("TS");
    test1.setLastName("TS");
    test1.setDisplayName("TS");
    test1.setCompanyName("TS");
    test1.setEin("TS");
    test1.setEinIssuingCountry("TS");
    test1.setPhone("TS");
    test1.setStreet("TS");
    test1.setCity("TS");
    test1.setState("TS");
    test1.setPostalCode("TS");
    test1.setCountry("TS");
    test1.setEmail("TS");
    test1.setStockSymbol("TS");
    test1.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test1.setIpAddress("TS");
    test1.setWebsite("TS");
    test1.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test1.setVertical("TS");
    test1.setAltBusinessId("TS");
    test1.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test1.setReferenceId("TS");
    Map<String, Object> testMap = new HashMap();
    test1.setOptionalAttributes(testMap);
    test1.setMock(true);
    test1.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));
    SMSTenDLCBrand test2 = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");
    test2.setAccountId("TS");
    test2.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test2.setFirstName("TS");
    test2.setLastName("TS");
    test2.setDisplayName("TS");
    test2.setCompanyName("TS");
    test2.setEin("TS");
    test2.setEinIssuingCountry("TS");
    test2.setPhone("TS");
    test2.setStreet("TS");
    test2.setCity("TS");
    test2.setState("TS");
    test2.setPostalCode("TS");
    test2.setCountry("TS");
    test2.setEmail("TS");
    test2.setStockSymbol("TS");
    test2.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test2.setIpAddress("TS");
    test2.setWebsite("TS");
    test2.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test2.setVertical("TS");
    test2.setAltBusinessId("TS");
    test2.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test2.setReferenceId("TS");
    Map<String, Object> testMap2 = testMap;
    test2.setOptionalAttributes(testMap2);
    test2.setMock(true);
    test2.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test2.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));
    Assert.assertEquals(test1.hashCode(), test2.hashCode());
  }

  /**
   * Test the method 'toStringType'
   */

  @Test
  public void toStringTypeTest() {
    SMSTenDLCBrand test1 = new SMSTenDLCBrand("TEST_STRING", "TEST_STRING", "TEST_STRING");
    test1.setAccountId("TS");
    test1.setEntityType(SMSTenDLCBrand.EntityTypeEnum.PRIVATE_PROFIT);
    test1.setFirstName("TS");
    test1.setLastName("TS");
    test1.setDisplayName("TS");
    test1.setCompanyName("TS");
    test1.setEin("TS");
    test1.setEinIssuingCountry("TS");
    test1.setPhone("TS");
    test1.setStreet("TS");
    test1.setCity("TS");
    test1.setState("TS");
    test1.setPostalCode("TS");
    test1.setCountry("TS");
    test1.setEmail("TS");
    test1.setStockSymbol("TS");
    test1.setStockExchange(SMSTenDLCBrand.StockExchangeEnum.NONE);
    test1.setIpAddress("TS");
    test1.setWebsite("TS");
    test1.setBrandRelationship(SMSTenDLCBrand.BrandRelationshipEnum.BASIC_ACCOUNT);
    test1.setVertical("TS");
    test1.setAltBusinessId("TS");
    test1.setAltBusinessIdType(SMSTenDLCBrand.AltBusinessIdTypeEnum.NONE);
    test1.setReferenceId("TS");
    Map<String, Object> testMap = new HashMap();
    test1.setOptionalAttributes(testMap);
    test1.setMock(true);
    test1.setIdentityStatus(SMSTenDLCBrand.IdentityStatusEnum.SELF_DECLARED);
    test1.setCreateDate(OffsetDateTime.parse("2022-07-05T15:17:05Z"));

    String toString1 = test1.toString();
    Assert.assertTrue(String.class.isInstance(toString1));
  }

}