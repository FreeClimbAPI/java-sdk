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
 * Model tests for ApplicationListAllOf
 */
 public class ApplicationListAllOfTest {
    private final ApplicationListAllOf model = new ApplicationListAllOf(
    );
    
    
    /**
     * Test the property 'applications'
     */
    @Test
    public void applicationsTest() {
      
      List<ApplicationResult> testList = new ArrayList<ApplicationResult>();
      model.setApplications(testList);
      Assert.assertEquals(testList, model.getApplications()); 
    }

      /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      ApplicationListAllOf test1 = new ApplicationListAllOf();
      List<ApplicationResult> testList = new ArrayList<ApplicationResult>();
      test1.setApplications(testList);
      ApplicationListAllOf test2 = new ApplicationListAllOf();
      List<ApplicationResult> testList2 = testList;
      test2.setApplications(testList2);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      ApplicationListAllOf test1 = new ApplicationListAllOf();
      List<ApplicationResult> testList = new ArrayList<ApplicationResult>();
      test1.setApplications(testList);
      ApplicationListAllOf test2 = new ApplicationListAllOf();
      List<ApplicationResult> testList2 = null;
      test2.setApplications(testList2);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      ApplicationListAllOf test1 = new ApplicationListAllOf();
      List<ApplicationResult> testList = new ArrayList<ApplicationResult>();
      test1.setApplications(testList);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      ApplicationListAllOf test1 = new ApplicationListAllOf();
      List<ApplicationResult> testList = new ArrayList<ApplicationResult>();
      test1.setApplications(testList);
      ApplicationListAllOf test2 = new ApplicationListAllOf();
      List<ApplicationResult> testList2 = testList;
      test2.setApplications(testList2);
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      ApplicationListAllOf test1 = new ApplicationListAllOf();
      List<ApplicationResult> testList = new ArrayList<ApplicationResult>();
      test1.setApplications(testList);
      ApplicationListAllOf test2 = new ApplicationListAllOf();
      List<ApplicationResult> testList2 = testList;
      test2.setApplications(testList2);
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      ApplicationListAllOf test1 = new ApplicationListAllOf();
      List<ApplicationResult> testList = new ArrayList<ApplicationResult>();
      test1.setApplications(testList);
      ApplicationListAllOf test2 = new ApplicationListAllOf();
      List<ApplicationResult> testList2 = null;
      test2.setApplications(testList2);
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      ApplicationListAllOf test1 = new ApplicationListAllOf();
      List<ApplicationResult> testList = new ArrayList<ApplicationResult>();
      test1.setApplications(testList);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }