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
 * Model tests for AccountResult
 */
 public class AccountResultTest {
    
    private final AccountResult model = new AccountResult(
    );
    
    
    /**
     * Test the property 'uri'
     */
    @Test
    public void uriTest() {
      
      
      model.setUri("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getUri());
      
      
    }
    /**
     * Test the property 'dateCreated'
     */
    @Test
    public void dateCreatedTest() {
      
      
      model.setDateCreated("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getDateCreated());
      
      
    }
    /**
     * Test the property 'dateUpdated'
     */
    @Test
    public void dateUpdatedTest() {
      
      
      model.setDateUpdated("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getDateUpdated());
      
      
    }
    /**
     * Test the property 'revision'
     */
    @Test
    public void revisionTest() {
      
      model.setRevision(1);
      Assert.assertEquals(1, (int) model.getRevision());
    }
    /**
     * Test the property 'accountId'
     */
    @Test
    public void accountIdTest() {
      
      
      model.setAccountId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getAccountId());
      
      
    }
    /**
     * Test the property 'apiKey'
     */
    @Test
    public void apiKeyTest() {
      
      
      model.setApiKey("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getApiKey());
      
      
    }
    /**
     * Test the property 'alias'
     */
    @Test
    public void aliasTest() {
      
      
      model.setAlias("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getAlias());
      
      
    }
    /**
     * Test the property 'label'
     */
    @Test
    public void labelTest() {
      
      
      model.setLabel("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getLabel());
      
      
    }
    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
      model.setType(AccountType.TRIAL);
      Assert.assertEquals(model.getType(),AccountType.TRIAL);
      model.setType(AccountType.FULL);
      Assert.assertEquals(model.getType(),AccountType.FULL);
      
    }
    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
      model.setStatus(AccountStatus.CLOSED);
      Assert.assertEquals(model.getStatus(),AccountStatus.CLOSED);
      model.setStatus(AccountStatus.SUSPENDED);
      Assert.assertEquals(model.getStatus(),AccountStatus.SUSPENDED);
      model.setStatus(AccountStatus.ACTIVE);
      Assert.assertEquals(model.getStatus(),AccountStatus.ACTIVE);
      
    }
    /**
     * Test the property 'subresourceUris'
     */
    @Test
    public void subresourceUrisTest() {
      Object testObject = new Object();
      model.setSubresourceUris(testObject);
      Assert.assertEquals(testObject, model.getSubresourceUris());
      
    }

      /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      AccountResult test1 = new AccountResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setApiKey("TS");
      
        
        
      test1.setAlias("TS");
      
        
        
      test1.setLabel("TS");
      
      test1.setType(AccountType.TRIAL);
      test1.setStatus(AccountStatus.CLOSED);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      AccountResult test2 = new AccountResult();
        
        
      test2.setUri("TS");
      
        
        
      test2.setDateCreated("TS");
      
        
        
      test2.setDateUpdated("TS");
      
      test2.setRevision(1);
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setApiKey("TS");
      
        
        
      test2.setAlias("TS");
      
        
        
      test2.setLabel("TS");
      
      test2.setType(AccountType.TRIAL);
      test2.setStatus(AccountStatus.CLOSED);
      Object testObject2 = testObject;
      test2.setSubresourceUris(testObject2);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      AccountResult test1 = new AccountResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setApiKey("TS");
      
        
        
      test1.setAlias("TS");
      
        
        
      test1.setLabel("TS");
      
      test1.setType(AccountType.FULL);
      test1.setStatus(AccountStatus.SUSPENDED);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      AccountResult test2 = new AccountResult();
        
        
      test2.setUri("TS2");
      
        
        
      test2.setDateCreated("TS2");
      
        
        
      test2.setDateUpdated("TS2");
      
      test2.setRevision(0);
        
        
      test2.setAccountId("TS2");
      
        
        
      test2.setApiKey("TS2");
      
        
        
      test2.setAlias("TS2");
      
        
        
      test2.setLabel("TS2");
      
      test2.setType(AccountType.TRIAL);
      test2.setStatus(AccountStatus.CLOSED);
      Object testObject2 = new Object();
      test2.setSubresourceUris(testObject2);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      AccountResult test1 = new AccountResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setApiKey("TS");
      
        
        
      test1.setAlias("TS");
      
        
        
      test1.setLabel("TS");
      
      test1.setType(AccountType.TRIAL);
      test1.setStatus(AccountStatus.CLOSED);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      AccountResult test1 = new AccountResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setApiKey("TS");
      
        
        
      test1.setAlias("TS");
      
        
        
      test1.setLabel("TS");
      
      test1.setType(AccountType.TRIAL);
      test1.setStatus(AccountStatus.CLOSED);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      AccountResult test2 = new AccountResult();
        
        
      test2.setUri("TS");
      
        
        
      test2.setDateCreated("TS");
      
        
        
      test2.setDateUpdated("TS");
      
      test2.setRevision(1);
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setApiKey("TS");
      
        
        
      test2.setAlias("TS");
      
        
        
      test2.setLabel("TS");
      
      test2.setType(AccountType.TRIAL);
      test2.setStatus(AccountStatus.CLOSED);
      Object testObject2 = testObject;
      test2.setSubresourceUris(testObject2);
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      AccountResult test1 = new AccountResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setApiKey("TS");
      
        
        
      test1.setAlias("TS");
      
        
        
      test1.setLabel("TS");
      
      test1.setType(AccountType.TRIAL);
      test1.setStatus(AccountStatus.CLOSED);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      AccountResult test2 = new AccountResult();
        
        
      test2.setUri("TS");
      
        
        
      test2.setDateCreated("TS");
      
        
        
      test2.setDateUpdated("TS");
      
      test2.setRevision(1);
        
        
      test2.setAccountId("TS");
      
        
        
      test2.setApiKey("TS");
      
        
        
      test2.setAlias("TS");
      
        
        
      test2.setLabel("TS");
      
      test2.setType(AccountType.TRIAL);
      test2.setStatus(AccountStatus.CLOSED);
      Object testObject2 = testObject;
      test2.setSubresourceUris(testObject2);
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      AccountResult test1 = new AccountResult();
        
        
      test1.setUri("TS");
      
        
        
      test1.setDateCreated("TS");
      
        
        
      test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
      test1.setAccountId("TS");
      
        
        
      test1.setApiKey("TS");
      
        
        
      test1.setAlias("TS");
      
        
        
      test1.setLabel("TS");
      
      test1.setType(AccountType.FULL);
      test1.setStatus(AccountStatus.SUSPENDED);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);
      AccountResult test2 = new AccountResult();
        
        
      test2.setUri("TS2");
      
        
        
      test2.setDateCreated("TS2");
      
        
        
      test2.setDateUpdated("TS2");
      
      test2.setRevision(0);
        
        
      test2.setAccountId("TS2");
      
        
        
      test2.setApiKey("TS2");
      
        
        
      test2.setAlias("TS2");
      
        
        
      test2.setLabel("TS2");
      
      test2.setType(AccountType.TRIAL);
      test2.setStatus(AccountStatus.CLOSED);
      Object testObject2 = new Object();
      test2.setSubresourceUris(testObject2);
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      AccountResult test1 = new AccountResult();
        
        
        test1.setUri("TS");
      
        
        
        test1.setDateCreated("TS");
      
        
        
        test1.setDateUpdated("TS");
      
      test1.setRevision(1);
        
        
        test1.setAccountId("TS");
      
        
        
        test1.setApiKey("TS");
      
        
        
        test1.setAlias("TS");
      
        
        
        test1.setLabel("TS");
      
      test1.setType(AccountType.TRIAL);
      test1.setStatus(AccountStatus.CLOSED);
      Object testObject = new Object();
      test1.setSubresourceUris(testObject);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    
 }