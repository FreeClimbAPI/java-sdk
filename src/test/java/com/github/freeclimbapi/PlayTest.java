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
 * Model tests for Play
 */
 public class PlayTest {
    private final Play model = new Play();

    /**
     * Test the property '_file'
     */
    @Test
    public void _fileTest() {
      model.setFile("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getFile());
      
    }

    /**
     * Test the property 'loop'
     */
    @Test
    public void loopTest() {
      
      model.setLoop(1);
      Assert.assertEquals(1, (int) model.getLoop());
    }

    /**
     * Test the property 'privacyMode'
     */
    @Test
    public void privacyModeTest() {
      model.setPrivacyMode(false);
      Assert.assertEquals(false, model.getPrivacyMode());       
      
    }

      /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      Play test1 = new Play();
      test1.setFile("TS");
      test1.setLoop(1);
      test1.setPrivacyMode(true);
      Play test2 = new Play();
      test2.setFile("TS");
      test2.setLoop(1);
      test2.setPrivacyMode(true);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      Play test1 = new Play();
      test1.setFile("TS");
      test1.setLoop(1);
      test1.setPrivacyMode(true);
      Play test2 = new Play();
      test2.setFile("tS");
      test2.setLoop(0);
      test2.setPrivacyMode(false);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      Play test1 = new Play();
      test1.setFile("TS");
      test1.setLoop(1);
      test1.setPrivacyMode(true);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      Play test1 = new Play();
      test1.setFile("TS");
      test1.setLoop(1);
      test1.setPrivacyMode(true);
      Play test2 = new Play();
      test2.setFile("TS");
      test2.setLoop(1);
      test2.setPrivacyMode(true);
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      Play test1 = new Play();
      test1.setFile("TS");
      test1.setLoop(1);
      test1.setPrivacyMode(true);
      Play test2 = new Play();
      test2.setFile("TS");
      test2.setLoop(1);
      test2.setPrivacyMode(true);
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      Play test1 = new Play();
      test1.setFile("TS");
      test1.setLoop(1);
      test1.setPrivacyMode(true);
      Play test2 = new Play();
      test2.setFile("tS");
      test2.setLoop(0);
      test2.setPrivacyMode(false);
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      Play test1 = new Play();
      test1.setFile("TS");
      test1.setLoop(1);
      test1.setPrivacyMode(true);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void commandTest() throws Exception {
      Assert.assertEquals("Play", model.getCommand());
    }

    @Test
    public void buildTest() throws Exception {
        model.setFile("TEST_STRING");
        model.setPrivacyMode(false);
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("_file"), model.getFile());
        Assert.assertEquals(attributes.get("loop"), model.getLoop());
        Assert.assertEquals(attributes.get("privacyMode"), model.getPrivacyMode());
    }
 }