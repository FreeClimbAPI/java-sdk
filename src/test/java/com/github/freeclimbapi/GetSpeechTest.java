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
 * Model tests for GetSpeech
 */
 public class GetSpeechTest {
    private final GetSpeech model = new GetSpeech();

    /**
     * Test the property 'actionUrl'
     */
    @Test
    public void actionUrlTest() {
  
  try {
    URI uri = new URI("TEST_STRING");
    model.setActionUrl(uri);
    Assert.assertEquals(uri, model.getActionUrl());
  } catch (Exception e) {
     e.printStackTrace();
  }
  }

    /**
     * Test the property 'grammarType'
     */
    @Test
    public void grammarTypeTest() {
    model.setGrammarType(GrammarType.URL);
    Assert.assertEquals(model.getGrammarType(),GrammarType.URL);
    model.setGrammarType(GrammarType.BUILT_IN);
    Assert.assertEquals(model.getGrammarType(),GrammarType.BUILT_IN);
  
  }

    /**
     * Test the property 'grammarFile'
     */
    @Test
    public void grammarFileTest() {
        model.setGrammarFile("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getGrammarFile());
  
  }

    /**
     * Test the property 'grammarRule'
     */
    @Test
    public void grammarRuleTest() {
        model.setGrammarRule("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getGrammarRule());
  
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
     * Test the property 'prompts'
     */
    @Test
    public void promptsTest() {
  
  List<PerclCommand> testList = new ArrayList<PerclCommand>();
  model.setPrompts(testList);
  Assert.assertEquals(testList, model.getPrompts()); 
  }

    /**
     * Test the property 'noInputTimeoutMs'
     */
    @Test
    public void noInputTimeoutMsTest() {
  
    model.setNoInputTimeoutMs(1);
    Assert.assertEquals(1, (int) model.getNoInputTimeoutMs());
  }

    /**
     * Test the property 'recognitionTimeoutMs'
     */
    @Test
    public void recognitionTimeoutMsTest() {
  
    model.setRecognitionTimeoutMs(1);
    Assert.assertEquals(1, (int) model.getRecognitionTimeoutMs());
  }

    /**
     * Test the property 'confidenceThreshold'
     */
    @Test
    public void confidenceThresholdTest() {
        model.setConfidenceThreshold(new BigDecimal(1.0));
        Assert.assertEquals(new BigDecimal(1.0), model.getConfidenceThreshold());
  
  }

    /**
     * Test the property 'sensitivityLevel'
     */
    @Test
    public void sensitivityLevelTest() {
        model.setSensitivityLevel(new BigDecimal(1.0));
        Assert.assertEquals(new BigDecimal(1.0), model.getSensitivityLevel());
  
  }

    /**
     * Test the property 'speechCompleteTimeoutMs'
     */
    @Test
    public void speechCompleteTimeoutMsTest() {
  
    model.setSpeechCompleteTimeoutMs(1);
    Assert.assertEquals(1, (int) model.getSpeechCompleteTimeoutMs());
  }

    /**
     * Test the property 'speechIncompleteTimeoutMs'
     */
    @Test
    public void speechIncompleteTimeoutMsTest() {
  
    model.setSpeechIncompleteTimeoutMs(1);
    Assert.assertEquals(1, (int) model.getSpeechIncompleteTimeoutMs());
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
      GetSpeech test1 = new GetSpeech();
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setActionUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        test1.setGrammarType(GrammarType.URL);
        test1.setGrammarFile("TS");
        test1.setGrammarRule("TS");
        test1.setPlayBeep(true);
        List<PerclCommand> testList = new ArrayList<PerclCommand>();
        test1.setPrompts(testList);
        test1.setNoInputTimeoutMs(1);
        test1.setRecognitionTimeoutMs(1);
        test1.setSpeechCompleteTimeoutMs(1);
        test1.setSpeechIncompleteTimeoutMs(1);
        test1.setPrivacyMode(true);
      GetSpeech test2 = new GetSpeech();
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setActionUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        test2.setGrammarType(GrammarType.URL);
        test2.setGrammarFile("TS");
        test2.setGrammarRule("TS");
        test2.setPlayBeep(true);
        List<PerclCommand> testList2 = testList;
        test2.setPrompts(testList2);
        test2.setNoInputTimeoutMs(1);
        test2.setRecognitionTimeoutMs(1);
        test2.setSpeechCompleteTimeoutMs(1);
        test2.setSpeechIncompleteTimeoutMs(1);
        test2.setPrivacyMode(true);
      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      GetSpeech test1 = new GetSpeech();
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setActionUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        test1.setGrammarType(GrammarType.BUILT_IN);
        test1.setGrammarFile("TS");
        test1.setGrammarRule("TS");
        test1.setPlayBeep(true);
        List<PerclCommand> testList = new ArrayList<PerclCommand>();
        test1.setPrompts(testList);
        test1.setNoInputTimeoutMs(1);
        test1.setRecognitionTimeoutMs(1);
        test1.setSpeechCompleteTimeoutMs(1);
        test1.setSpeechIncompleteTimeoutMs(1);
        test1.setPrivacyMode(true);
      GetSpeech test2 = new GetSpeech();
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setActionUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        test2.setGrammarType(GrammarType.URL);
        test2.setGrammarFile("tS");
        test2.setGrammarRule("tS");
        test2.setPlayBeep(false);
        List<PerclCommand> testList2 = null;
        test2.setPrompts(testList2);
        test2.setNoInputTimeoutMs(0);
        test2.setRecognitionTimeoutMs(0);
        test2.setSpeechCompleteTimeoutMs(0);
        test2.setSpeechIncompleteTimeoutMs(0);
        test2.setPrivacyMode(false);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      GetSpeech test1 = new GetSpeech();
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setActionUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        test1.setGrammarType(GrammarType.URL);
        test1.setGrammarFile("TS");
        test1.setGrammarRule("TS");
        test1.setPlayBeep(true);
        List<PerclCommand> testList = new ArrayList<PerclCommand>();
        test1.setPrompts(testList);
        test1.setNoInputTimeoutMs(1);
        test1.setRecognitionTimeoutMs(1);
        test1.setSpeechCompleteTimeoutMs(1);
        test1.setSpeechIncompleteTimeoutMs(1);
        test1.setPrivacyMode(true);
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      GetSpeech test1 = new GetSpeech();
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setActionUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        test1.setGrammarType(GrammarType.URL);
        test1.setGrammarFile("TS");
        test1.setGrammarRule("TS");
        test1.setPlayBeep(true);
        List<PerclCommand> testList = new ArrayList<PerclCommand>();
        test1.setPrompts(testList);
        test1.setNoInputTimeoutMs(1);
        test1.setRecognitionTimeoutMs(1);
        test1.setSpeechCompleteTimeoutMs(1);
        test1.setSpeechIncompleteTimeoutMs(1);
        test1.setPrivacyMode(true);
      GetSpeech test2 = new GetSpeech();
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setActionUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        test2.setGrammarType(GrammarType.URL);
        test2.setGrammarFile("TS");
        test2.setGrammarRule("TS");
        test2.setPlayBeep(true);
        List<PerclCommand> testList2 = testList;
        test2.setPrompts(testList2);
        test2.setNoInputTimeoutMs(1);
        test2.setRecognitionTimeoutMs(1);
        test2.setSpeechCompleteTimeoutMs(1);
        test2.setSpeechIncompleteTimeoutMs(1);
        test2.setPrivacyMode(true);
        
       String toString1 = test1.toString();
       String toString2 = test2.toString();
       Assert.assertEquals(toString1, toString2);
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      GetSpeech test1 = new GetSpeech();
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setActionUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        test1.setGrammarType(GrammarType.URL);
        test1.setGrammarFile("TS");
        test1.setGrammarRule("TS");
        test1.setPlayBeep(true);
        List<PerclCommand> testList = new ArrayList<PerclCommand>();
        test1.setPrompts(testList);
        test1.setNoInputTimeoutMs(1);
        test1.setRecognitionTimeoutMs(1);
        test1.setSpeechCompleteTimeoutMs(1);
        test1.setSpeechIncompleteTimeoutMs(1);
        test1.setPrivacyMode(true);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void buildTest() throws Exception {
        model.setGrammarFile("TEST_STRING");
        model.setGrammarRule("TEST_STRING");
        model.setPlayBeep(false);
        model.setConfidenceThreshold(new BigDecimal(1.0));
        model.setSensitivityLevel(new BigDecimal(1.0));
        model.setPrivacyMode(false);
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("actionUrl"), model.getActionUrl());
        Assert.assertEquals(attributes.get("grammarType"), model.getGrammarType());
        Assert.assertEquals(attributes.get("grammarFile"), model.getGrammarFile());
        Assert.assertEquals(attributes.get("grammarRule"), model.getGrammarRule());
        Assert.assertEquals(attributes.get("playBeep"), model.getPlayBeep());
        Assert.assertEquals(attributes.get("prompts"), model.getPrompts());
        Assert.assertEquals(attributes.get("noInputTimeoutMs"), model.getNoInputTimeoutMs());
        Assert.assertEquals(attributes.get("recognitionTimeoutMs"), model.getRecognitionTimeoutMs());
        Assert.assertEquals(attributes.get("confidenceThreshold"), model.getConfidenceThreshold());
        Assert.assertEquals(attributes.get("sensitivityLevel"), model.getSensitivityLevel());
        Assert.assertEquals(attributes.get("speechCompleteTimeoutMs"), model.getSpeechCompleteTimeoutMs());
        Assert.assertEquals(attributes.get("speechIncompleteTimeoutMs"), model.getSpeechIncompleteTimeoutMs());
        Assert.assertEquals(attributes.get("privacyMode"), model.getPrivacyMode());
    }
 }