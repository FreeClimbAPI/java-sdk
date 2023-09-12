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
 * Model tests for TranscribeUtterance
 */
public class TranscribeUtteranceTest {
  private final TranscribeUtterance model = new TranscribeUtterance();

  /**
   * Test the property 'actionUrl'
   */
  @Test
  public void actionUrlTest() {
    model.setActionUrl("TEST_STRING");
    Assert.assertEquals("TEST_STRING", model.getActionUrl());

  }

  /**
   * Test the property 'playBeep'
   */
  @Test
  public void playBeepTest() {
    model.setPlayBeep(false);
    Assert.assertEquals(false, model.getPlayBeep());

  }

  /**
   * Test the property 'record'
   */
  @Test
  public void recordTest() {
    TranscribeUtteranceRecord record = new TranscribeUtteranceRecord();
    model.setRecord(record);
    Assert.assertEquals(model.getRecord().getClass(), TranscribeUtteranceRecord.class);
  }

  /**
   * Test the property 'privacyForLogging'
   */
  @Test
  public void privacyForLoggingTest() {
    model.setPrivacyForLogging(false);
    Assert.assertEquals(false, model.getPrivacyForLogging());

  }

  /**
   * Test the property 'privacyForRecording'
   */
  @Test
  public void privacyForRecordingTest() {
    model.setPrivacyForRecording(false);
    Assert.assertEquals(false, model.getPrivacyForRecording());

  }

  /**
   * Test the property 'prompts'
   */
  @Test
  public void promptsTest() {
    Object[] testArray = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList = Arrays.asList(testArray);
    model.setPrompts(testList);
    Assert.assertEquals(testList, model.getPrompts());

  }

  /**
   * Test the method 'equalsTrue'
   */

  @Test
  public void equalsTrueTest() {
    TranscribeUtterance test1 = new TranscribeUtterance();
    test1.setActionUrl("TS");
    test1.setPlayBeep(true);
    TranscribeUtteranceRecord record = new TranscribeUtteranceRecord();
    record.saveRecording(false);
    record.setMaxLengthSec(1);
    record.setRcrdTerminationSilenceTimeMs(1);
    test1.setRecord(record);
    test1.setPrivacyForLogging(true);
    test1.setPrivacyForRecording(true);
    Object[] testArray = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList = Arrays.asList(testArray);
    test1.setPrompts(testList);
    TranscribeUtterance test2 = new TranscribeUtterance();
    test2.setActionUrl("TS");
    test2.setPlayBeep(true);
    TranscribeUtteranceRecord record2 = new TranscribeUtteranceRecord();
    record2.saveRecording(false);
    record2.setMaxLengthSec(1);
    record2.setRcrdTerminationSilenceTimeMs(1);
    test2.setRecord(record2);
    test2.setPrivacyForLogging(true);
    test2.setPrivacyForRecording(true);
    Object[] testArray2 = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList2 = Arrays.asList(testArray2);
    test2.setPrompts(testList2);

    Assert.assertTrue(test1.equals(test2));
  }

  /**
   * Test the method 'equalsFalse'
   */

  @Test
  public void equalsFalseTest() {
    TranscribeUtterance test1 = new TranscribeUtterance();
    test1.setActionUrl("TS");
    test1.setPlayBeep(true);
    TranscribeUtteranceRecord record = new TranscribeUtteranceRecord();
    record.saveRecording(false);
    record.setMaxLengthSec(2);
    record.setRcrdTerminationSilenceTimeMs(2);
    test1.setRecord(record);
    test1.setPrivacyForLogging(true);
    test1.setPrivacyForRecording(true);
    Object[] testArray = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList = Arrays.asList(testArray);
    test1.setPrompts(testList);
    TranscribeUtterance test2 = new TranscribeUtterance();
    test2.setActionUrl("tS");
    test2.setPlayBeep(false);
    TranscribeUtteranceRecord record2 = new TranscribeUtteranceRecord();
    record2.saveRecording(false);
    record2.setMaxLengthSec(1);
    record2.setRcrdTerminationSilenceTimeMs(1);
    test2.setRecord(record2);
    test2.setPrivacyForLogging(false);
    test2.setPrivacyForRecording(false);
    Object[] testArray2 = { "ElementFour", "ElementFive", "ElementSix" };
    List<Object> testList2 = Arrays.asList(testArray2);
    test2.setPrompts(testList2);

    Assert.assertFalse(test1.equals(test2));
  }

  /**
   * Test the method 'hashCodeType'
   */

  @Test
  public void hashCodeTypeTest() {
    TranscribeUtterance test1 = new TranscribeUtterance();
    test1.setActionUrl("TS");
    test1.setPlayBeep(true);

    test1.setPrivacyForLogging(true);
    test1.setPrivacyForRecording(true);
    Object[] testArray = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList = Arrays.asList(testArray);
    test1.setPrompts(testList);

    int hashCode1 = test1.hashCode();
    Assert.assertTrue(Integer.class.isInstance(hashCode1));
  }

  /**
   * Test the method 'toStringEquals'
   */

  @Test
  public void toStringEqualsTest() {
    TranscribeUtterance test1 = new TranscribeUtterance();
    test1.setActionUrl("TS");
    test1.setPlayBeep(true);
    TranscribeUtteranceRecord record = new TranscribeUtteranceRecord();
    record.saveRecording(false);
    record.setMaxLengthSec(1);
    record.setRcrdTerminationSilenceTimeMs(1);
    test1.setRecord(record);
    test1.setPrivacyForLogging(true);
    test1.setPrivacyForRecording(true);
    Object[] testArray = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList = Arrays.asList(testArray);
    test1.setPrompts(testList);
    TranscribeUtterance test2 = new TranscribeUtterance();
    test2.setActionUrl("TS");
    test2.setPlayBeep(true);
    TranscribeUtteranceRecord record2 = new TranscribeUtteranceRecord();
    record2.saveRecording(false);
    record2.setMaxLengthSec(1);
    record2.setRcrdTerminationSilenceTimeMs(1);
    test2.setRecord(record2);
    test2.setPrivacyForLogging(true);
    test2.setPrivacyForRecording(true);
    Object[] testArray2 = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList2 = Arrays.asList(testArray2);
    test2.setPrompts(testList2);

    String toString1 = test1.toString();
    String toString2 = test2.toString();
    Assert.assertEquals(toString1, toString2);
  }

  /**
   * Test the method 'hashCodeEqualsTrue'
   */

  @Test
  public void hashCodeEqualsTrueTest() {
    TranscribeUtterance test1 = new TranscribeUtterance();
    test1.setActionUrl("TS");
    test1.setPlayBeep(true);
    test1.setPrivacyForLogging(true);
    test1.setPrivacyForRecording(true);
    Object[] testArray = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList = Arrays.asList(testArray);
    test1.setPrompts(testList);
    TranscribeUtterance test2 = new TranscribeUtterance();
    test2.setActionUrl("TS");
    test2.setPlayBeep(true);
    test2.setPrivacyForLogging(true);
    test2.setPrivacyForRecording(true);
    Object[] testArray2 = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList2 = Arrays.asList(testArray2);
    test2.setPrompts(testList2);
    Assert.assertEquals(test1.hashCode(), test2.hashCode());
  }

  /**
   * Test the method 'hashCodeEqualsFalse'
   */

  @Test
  public void hashCodeEqualsFalseTest() {
    TranscribeUtterance test1 = new TranscribeUtterance();
    test1.setActionUrl("TS");
    test1.setPlayBeep(true);
    test1.setPrivacyForLogging(true);
    test1.setPrivacyForRecording(true);
    Object[] testArray = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList = Arrays.asList(testArray);
    test1.setPrompts(testList);
    TranscribeUtterance test2 = new TranscribeUtterance();
    test2.setActionUrl("tS");
    test2.setPlayBeep(false);
    test2.setPrivacyForLogging(false);
    test2.setPrivacyForRecording(false);
    Object[] testArray2 = { "ElementFour", "ElementFive", "ElementSix" };
    List<Object> testList2 = Arrays.asList(testArray2);
    test1.setPrompts(testList2);
    Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
  }

  /**
   * Test the method 'toStringType'
   */

  @Test
  public void toStringTypeTest() {
    TranscribeUtterance test1 = new TranscribeUtterance();
    test1.setActionUrl("TS");
    test1.setPlayBeep(true);
    TranscribeUtteranceRecord record = new TranscribeUtteranceRecord();
    record.saveRecording(false);
    record.setMaxLengthSec(1);
    record.setRcrdTerminationSilenceTimeMs(1);
    test1.setRecord(record);
    test1.setPrivacyForLogging(true);
    test1.setPrivacyForRecording(true);
    Object[] testArray = { "ElementOne", "ElementTwo", "ElementThree" };
    List<Object> testList = Arrays.asList(testArray);
    test1.setPrompts(testList);

    String toString1 = test1.toString();
    Assert.assertTrue(String.class.isInstance(toString1));
  }

  @Test
  public void commandTest() throws Exception {
    Assert.assertEquals("TranscribeUtterance", model.getCommand());
  }

  @Test
  public void buildTest() throws Exception {
    model.setActionUrl("TEST_STRING");
    model.setPlayBeep(false);
    TranscribeUtteranceRecord record = new TranscribeUtteranceRecord();
    record.saveRecording(false);
    record.setMaxLengthSec(1);
    record.setRcrdTerminationSilenceTimeMs(1);
    model.setRecord(record);
    model.setPrivacyForLogging(false);
    model.setPrivacyForRecording(false);
    Map<String, Map<String, Object>> build = model.build();
    Map<String, Object> attributes = build.get(model.getCommand());
    Assert.assertEquals(attributes.get("actionUrl"), model.getActionUrl());
    Assert.assertEquals(attributes.get("playBeep"), model.getPlayBeep());
    Assert.assertEquals(attributes.get("record"), model.getRecord());
    Assert.assertEquals(attributes.get("privacyForLogging"), model.getPrivacyForLogging());
    Assert.assertEquals(attributes.get("privacyForRecording"), model.getPrivacyForRecording());
    Assert.assertEquals(attributes.get("prompts"), model.getPrompts());
  }
}