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
 * Model tests for QueueResult
 */
 public class QueueResultTest {
    private final QueueResult model = new QueueResult();

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
     * Test the property 'queueId'
     */
    @Test
    public void queueIdTest() {
      
        
        model.setQueueId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getQueueId());
        
        
        
        
        
      
  
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
     * Test the property 'maxSize'
     */
    @Test
    public void maxSizeTest() {
      
        
        
        
        
        
      
  
      model.setMaxSize(1);
      Assert.assertEquals(1, (int) model.getMaxSize());
  }

    /**
     * Test the property 'currentSize'
     */
    @Test
    public void currentSizeTest() {
      
        
        
        
        
        
      
  
      model.setCurrentSize(1);
      Assert.assertEquals(1, (int) model.getCurrentSize());
  }

    /**
     * Test the property 'averageQueueRemovalTime'
     */
    @Test
    public void averageQueueRemovalTimeTest() {
      
        
        
        
        
        
      
  
      model.setAverageQueueRemovalTime(1);
      Assert.assertEquals(1, (int) model.getAverageQueueRemovalTime());
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
      QueueResult test1 = new QueueResult();
        test1.setUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateCreated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateUpdated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setRevision(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setQueueId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCurrentSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAverageQueueRemovalTime(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        
        
        
        
        
        
        
      QueueResult test2 = new QueueResult();
        test2.setUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDateCreated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDateUpdated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setRevision(1);
        
        
        
        
        
        
        
        
        
        
        
        test2.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setQueueId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setCurrentSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAverageQueueRemovalTime(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Object testObject2 = testObject;
        test2.setSubresourceUris(testObject2);
        
        
        
        
        
        
        
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      QueueResult test1 = new QueueResult();
        test1.setUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateCreated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateUpdated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setRevision(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setQueueId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCurrentSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAverageQueueRemovalTime(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        
        
        
        
        
        
        
      QueueResult test2 = new QueueResult();
        test2.setUri("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDateCreated("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDateUpdated("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setRevision(0);
        
        
        
        
        
        
        
        
        
        
        
        test2.setAccountId("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setQueueId("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAlias("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setMaxSize(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setCurrentSize(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAverageQueueRemovalTime(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Object testObject2 = new Object();
        test2.setSubresourceUris(testObject2);
        
        
        
        
        
        
        

      Assert.assertFalse(test1.equals(test2));
    }

    /**
     * Test the method 'hashEquals'
     */

     @Test
    public void hashEqualsTest() {
      QueueResult test1 = new QueueResult();
        test1.setUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateCreated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateUpdated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setRevision(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setQueueId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCurrentSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAverageQueueRemovalTime(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        
        
        
        
        
        
        
       QueueResult test2 = new QueueResult();
        test2.setUri("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDateCreated("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDateUpdated("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setRevision(0);
        
        
        
        
        
        
        
        
        
        
        
        test2.setAccountId("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setQueueId("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAlias("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setMaxSize(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setCurrentSize(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAverageQueueRemovalTime(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Object testObject2 = new Object();
        test2.setSubresourceUris(testObject2);
        
        
        
        
        
        
        

        int hashCode1 = test1.hashCode();
        int hashCode2 = test2.hashCode();

      Assert.assertEquals(hashCode1, hashCode2);
     }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      QueueResult test1 = new QueueResult();
        test1.setUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateCreated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateUpdated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setRevision(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setQueueId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCurrentSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAverageQueueRemovalTime(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
      QueueResult test1 = new QueueResult();
        test1.setUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateCreated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateUpdated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setRevision(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setQueueId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCurrentSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAverageQueueRemovalTime(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        
        
        
        
        
        
        
      QueueResult test2 = new QueueResult();
        test2.setUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDateCreated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setDateUpdated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setRevision(1);
        
        
        
        
        
        
        
        
        
        
        
        test2.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setQueueId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setCurrentSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setAverageQueueRemovalTime(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Object testObject2 = new Object();
        test2.setSubresourceUris(testObject2);
        
        
        
        
        
        
        
        
       String toString1 = test1.toString();
       String toString2 = test2.toString();
        
        Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      QueueResult test1 = new QueueResult();
        test1.setUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateCreated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setDateUpdated("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setRevision(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setAccountId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setQueueId("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setCurrentSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setAverageQueueRemovalTime(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Object testObject = new Object();
        test1.setSubresourceUris(testObject);
        
        
        
        
        
        
        

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }