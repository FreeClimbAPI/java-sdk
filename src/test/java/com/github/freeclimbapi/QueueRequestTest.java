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
 * Model tests for QueueRequest
 */
 public class QueueRequestTest {
    private final QueueRequest model = new QueueRequest();

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
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      QueueRequest test1 = new QueueRequest();
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
      QueueRequest test2 = new QueueRequest();
        test2.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      QueueRequest test1 = new QueueRequest();
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
      QueueRequest test2 = new QueueRequest();
        test2.setAlias("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setMaxSize(0);
        
        
        
        
        
        
        
        
        
        
        

      Assert.assertFalse(test1.equals(test2));
    }

    /**
     * Test the method 'hashEquals'
     */

     @Test
    public void hashEqualsTest() {
      QueueRequest test1 = new QueueRequest();
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
       QueueRequest test2 = new QueueRequest();
        test2.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        

        int hashCode1 = test1.hashCode();
        int hashCode2 = test2.hashCode();

      Assert.assertEquals(hashCode1, hashCode2);
     }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      QueueRequest test1 = new QueueRequest();
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      QueueRequest test1 = new QueueRequest();
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
      QueueRequest test2 = new QueueRequest();
        test2.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        
        
       String toString1 = test1.toString();
       String toString2 = test2.toString();
        
        Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      QueueRequest test1 = new QueueRequest();
        test1.setAlias("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setMaxSize(1);
        
        
        
        
        
        
        
        
        
        
        

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }