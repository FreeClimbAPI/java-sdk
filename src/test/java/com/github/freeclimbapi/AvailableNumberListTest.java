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
 * Model tests for AvailableNumberList
 */
 public class AvailableNumberListTest {
    private final AvailableNumberList model = new AvailableNumberList();

    /**
     * Test the property 'total'
     */
    @Test
    public void totalTest() {
      
        
        
        
        
        
      
  
      model.setTotal(1);
      Assert.assertEquals(1, (int) model.getTotal());
  }

    /**
     * Test the property 'start'
     */
    @Test
    public void startTest() {
      
        
        
        
        
        
      
  
      model.setStart(1);
      Assert.assertEquals(1, (int) model.getStart());
  }

    /**
     * Test the property 'end'
     */
    @Test
    public void endTest() {
      
        
        
        
        
        
      
  
      model.setEnd(1);
      Assert.assertEquals(1, (int) model.getEnd());
  }

    /**
     * Test the property 'page'
     */
    @Test
    public void pageTest() {
      
        
        
        
        
        
      
  
      model.setPage(1);
      Assert.assertEquals(1, (int) model.getPage());
  }

    /**
     * Test the property 'numPages'
     */
    @Test
    public void numPagesTest() {
      
        
        
        
        
        
      
  
      model.setNumPages(1);
      Assert.assertEquals(1, (int) model.getNumPages());
  }

    /**
     * Test the property 'pageSize'
     */
    @Test
    public void pageSizeTest() {
      
        
        
        
        
        
      
  
      model.setPageSize(1);
      Assert.assertEquals(1, (int) model.getPageSize());
  }

    /**
     * Test the property 'nextPageUri'
     */
    @Test
    public void nextPageUriTest() {
      
        
        model.setNextPageUri("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getNextPageUri());
        
        
        
        
        
      
  
  }

    /**
     * Test the property 'availablePhoneNumbers'
     */
    @Test
    public void availablePhoneNumbersTest() {
      
        
        
        
        
        
      
  
    List<AvailableNumber> testList = new ArrayList<AvailableNumber>();
    model.setAvailablePhoneNumbers(testList);
    Assert.assertEquals(testList, model.getAvailablePhoneNumbers()); 
  }

  /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      AvailableNumberList test1 = new AvailableNumberList();
        
        
        test1.setTotal(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStart(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEnd(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPage(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setNumPages(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPageSize(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setNextPageUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<AvailableNumber> testList = new ArrayList<AvailableNumber>();
        test1.setAvailablePhoneNumbers(testList);
        
      AvailableNumberList test2 = new AvailableNumberList();
        
        
        test2.setTotal(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setStart(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setEnd(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPage(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setNumPages(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPageSize(1);
        
        
        
        
        
        
        
        
        
        
        
        test2.setNextPageUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<AvailableNumber> testList2 = testList;
        test2.setAvailablePhoneNumbers(testList2);
        
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      AvailableNumberList test1 = new AvailableNumberList();
        
        
        test1.setTotal(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStart(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEnd(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPage(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setNumPages(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPageSize(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setNextPageUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<AvailableNumber> testList = new ArrayList<AvailableNumber>();
        test1.setAvailablePhoneNumbers(testList);
        
      AvailableNumberList test2 = new AvailableNumberList();
        
        
        test2.setTotal(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setStart(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setEnd(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPage(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setNumPages(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPageSize(0);
        
        
        
        
        
        
        
        
        
        
        
        test2.setNextPageUri("tS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<AvailableNumber> testList2 = null;
        test2.setAvailablePhoneNumbers(testList2);
        

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      AvailableNumberList test1 = new AvailableNumberList();
        
        
        test1.setTotal(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStart(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEnd(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPage(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setNumPages(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPageSize(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setNextPageUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<AvailableNumber> testList = new ArrayList<AvailableNumber>();
        test1.setAvailablePhoneNumbers(testList);
        
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      AvailableNumberList test1 = new AvailableNumberList();
        
        
        test1.setTotal(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStart(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEnd(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPage(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setNumPages(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPageSize(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setNextPageUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<AvailableNumber> testList = new ArrayList<AvailableNumber>();
        test1.setAvailablePhoneNumbers(testList);
        
      AvailableNumberList test2 = new AvailableNumberList();
        
        
        test2.setTotal(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setStart(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setEnd(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPage(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setNumPages(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test2.setPageSize(1);
        
        
        
        
        
        
        
        
        
        
        
        test2.setNextPageUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<AvailableNumber> testList2 = testList;
        test2.setAvailablePhoneNumbers(testList2);
        
        
       String toString1 = test1.toString();
       String toString2 = test2.toString();
        
        Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      AvailableNumberList test1 = new AvailableNumberList();
        
        
        test1.setTotal(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setStart(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setEnd(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPage(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setNumPages(1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        test1.setPageSize(1);
        
        
        
        
        
        
        
        
        
        
        
        test1.setNextPageUri("TS");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<AvailableNumber> testList = new ArrayList<AvailableNumber>();
        test1.setAvailablePhoneNumbers(testList);
        

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

 }