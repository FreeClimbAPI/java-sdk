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
 * Model tests for Language
 */
 public class LanguageTest {
    
    
    
    @Test
    public void testCATALANShouldWork() {

        Language test = Language.CATALAN;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testCATALANShouldSerializeToEnum() {
    
        Language expectedValue = Language.CATALAN;
        Language calculatedValue = Language.fromValue("ca-ES");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testCATALANShouldDeserializeToString() {
     Language test = Language.CATALAN;
      String expectedValue = "ca-ES";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testDANISHShouldWork() {

        Language test = Language.DANISH;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testDANISHShouldSerializeToEnum() {
    
        Language expectedValue = Language.DANISH;
        Language calculatedValue = Language.fromValue("da-DK");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDANISHShouldDeserializeToString() {
     Language test = Language.DANISH;
      String expectedValue = "da-DK";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testGERMANShouldWork() {

        Language test = Language.GERMAN;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testGERMANShouldSerializeToEnum() {
    
        Language expectedValue = Language.GERMAN;
        Language calculatedValue = Language.fromValue("de-DE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testGERMANShouldDeserializeToString() {
     Language test = Language.GERMAN;
      String expectedValue = "de-DE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testENGLISH_AUShouldWork() {

        Language test = Language.ENGLISH_AU;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testENGLISH_AUShouldSerializeToEnum() {
    
        Language expectedValue = Language.ENGLISH_AU;
        Language calculatedValue = Language.fromValue("en-AU");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testENGLISH_AUShouldDeserializeToString() {
     Language test = Language.ENGLISH_AU;
      String expectedValue = "en-AU";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testENGLISH_CAShouldWork() {

        Language test = Language.ENGLISH_CA;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testENGLISH_CAShouldSerializeToEnum() {
    
        Language expectedValue = Language.ENGLISH_CA;
        Language calculatedValue = Language.fromValue("en-CA");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testENGLISH_CAShouldDeserializeToString() {
     Language test = Language.ENGLISH_CA;
      String expectedValue = "en-CA";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testENGLISH_UKShouldWork() {

        Language test = Language.ENGLISH_UK;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testENGLISH_UKShouldSerializeToEnum() {
    
        Language expectedValue = Language.ENGLISH_UK;
        Language calculatedValue = Language.fromValue("en-GB");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testENGLISH_UKShouldDeserializeToString() {
     Language test = Language.ENGLISH_UK;
      String expectedValue = "en-GB";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testENGLISH_INShouldWork() {

        Language test = Language.ENGLISH_IN;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testENGLISH_INShouldSerializeToEnum() {
    
        Language expectedValue = Language.ENGLISH_IN;
        Language calculatedValue = Language.fromValue("en-IN");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testENGLISH_INShouldDeserializeToString() {
     Language test = Language.ENGLISH_IN;
      String expectedValue = "en-IN";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testENGLISH_USShouldWork() {

        Language test = Language.ENGLISH_US;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testENGLISH_USShouldSerializeToEnum() {
    
        Language expectedValue = Language.ENGLISH_US;
        Language calculatedValue = Language.fromValue("en-US");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testENGLISH_USShouldDeserializeToString() {
     Language test = Language.ENGLISH_US;
      String expectedValue = "en-US";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testENGLISH_ESShouldWork() {

        Language test = Language.ENGLISH_ES;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testENGLISH_ESShouldSerializeToEnum() {
    
        Language expectedValue = Language.ENGLISH_ES;
        Language calculatedValue = Language.fromValue("es-ES");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testENGLISH_ESShouldDeserializeToString() {
     Language test = Language.ENGLISH_ES;
      String expectedValue = "es-ES";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testENGLISH_MXShouldWork() {

        Language test = Language.ENGLISH_MX;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testENGLISH_MXShouldSerializeToEnum() {
    
        Language expectedValue = Language.ENGLISH_MX;
        Language calculatedValue = Language.fromValue("es-MX");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testENGLISH_MXShouldDeserializeToString() {
     Language test = Language.ENGLISH_MX;
      String expectedValue = "es-MX";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testFINNISHShouldWork() {

        Language test = Language.FINNISH;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testFINNISHShouldSerializeToEnum() {
    
        Language expectedValue = Language.FINNISH;
        Language calculatedValue = Language.fromValue("fi-FI");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testFINNISHShouldDeserializeToString() {
     Language test = Language.FINNISH;
      String expectedValue = "fi-FI";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testFRENCH_CAShouldWork() {

        Language test = Language.FRENCH_CA;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testFRENCH_CAShouldSerializeToEnum() {
    
        Language expectedValue = Language.FRENCH_CA;
        Language calculatedValue = Language.fromValue("fr-CA");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testFRENCH_CAShouldDeserializeToString() {
     Language test = Language.FRENCH_CA;
      String expectedValue = "fr-CA";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testFRENCH_FRShouldWork() {

        Language test = Language.FRENCH_FR;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testFRENCH_FRShouldSerializeToEnum() {
    
        Language expectedValue = Language.FRENCH_FR;
        Language calculatedValue = Language.fromValue("fr-FR");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testFRENCH_FRShouldDeserializeToString() {
     Language test = Language.FRENCH_FR;
      String expectedValue = "fr-FR";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testITALIANShouldWork() {

        Language test = Language.ITALIAN;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testITALIANShouldSerializeToEnum() {
    
        Language expectedValue = Language.ITALIAN;
        Language calculatedValue = Language.fromValue("it-IT");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testITALIANShouldDeserializeToString() {
     Language test = Language.ITALIAN;
      String expectedValue = "it-IT";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testJAPANESEShouldWork() {

        Language test = Language.JAPANESE;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testJAPANESEShouldSerializeToEnum() {
    
        Language expectedValue = Language.JAPANESE;
        Language calculatedValue = Language.fromValue("ja-JP");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testJAPANESEShouldDeserializeToString() {
     Language test = Language.JAPANESE;
      String expectedValue = "ja-JP";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testKOREANShouldWork() {

        Language test = Language.KOREAN;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testKOREANShouldSerializeToEnum() {
    
        Language expectedValue = Language.KOREAN;
        Language calculatedValue = Language.fromValue("ko-KR");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testKOREANShouldDeserializeToString() {
     Language test = Language.KOREAN;
      String expectedValue = "ko-KR";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testNORWEGIANShouldWork() {

        Language test = Language.NORWEGIAN;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testNORWEGIANShouldSerializeToEnum() {
    
        Language expectedValue = Language.NORWEGIAN;
        Language calculatedValue = Language.fromValue("nb-NO");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testNORWEGIANShouldDeserializeToString() {
     Language test = Language.NORWEGIAN;
      String expectedValue = "nb-NO";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testDUTCHShouldWork() {

        Language test = Language.DUTCH;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testDUTCHShouldSerializeToEnum() {
    
        Language expectedValue = Language.DUTCH;
        Language calculatedValue = Language.fromValue("nl-NL");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDUTCHShouldDeserializeToString() {
     Language test = Language.DUTCH;
      String expectedValue = "nl-NL";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testPOLISHShouldWork() {

        Language test = Language.POLISH;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testPOLISHShouldSerializeToEnum() {
    
        Language expectedValue = Language.POLISH;
        Language calculatedValue = Language.fromValue("pl-PL");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testPOLISHShouldDeserializeToString() {
     Language test = Language.POLISH;
      String expectedValue = "pl-PL";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testPORTUGESE_BRShouldWork() {

        Language test = Language.PORTUGESE_BR;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testPORTUGESE_BRShouldSerializeToEnum() {
    
        Language expectedValue = Language.PORTUGESE_BR;
        Language calculatedValue = Language.fromValue("pt-BR");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testPORTUGESE_BRShouldDeserializeToString() {
     Language test = Language.PORTUGESE_BR;
      String expectedValue = "pt-BR";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testPORTUGESE_PTShouldWork() {

        Language test = Language.PORTUGESE_PT;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testPORTUGESE_PTShouldSerializeToEnum() {
    
        Language expectedValue = Language.PORTUGESE_PT;
        Language calculatedValue = Language.fromValue("pt-PT");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testPORTUGESE_PTShouldDeserializeToString() {
     Language test = Language.PORTUGESE_PT;
      String expectedValue = "pt-PT";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testRUSSIANShouldWork() {

        Language test = Language.RUSSIAN;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testRUSSIANShouldSerializeToEnum() {
    
        Language expectedValue = Language.RUSSIAN;
        Language calculatedValue = Language.fromValue("ru-RU");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testRUSSIANShouldDeserializeToString() {
     Language test = Language.RUSSIAN;
      String expectedValue = "ru-RU";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testSWEDISHShouldWork() {

        Language test = Language.SWEDISH;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testSWEDISHShouldSerializeToEnum() {
    
        Language expectedValue = Language.SWEDISH;
        Language calculatedValue = Language.fromValue("sv-SE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testSWEDISHShouldDeserializeToString() {
     Language test = Language.SWEDISH;
      String expectedValue = "sv-SE";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testCHINESE_CNShouldWork() {

        Language test = Language.CHINESE_CN;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testCHINESE_CNShouldSerializeToEnum() {
    
        Language expectedValue = Language.CHINESE_CN;
        Language calculatedValue = Language.fromValue("zh-CN");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testCHINESE_CNShouldDeserializeToString() {
     Language test = Language.CHINESE_CN;
      String expectedValue = "zh-CN";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testCHINESE_HKShouldWork() {

        Language test = Language.CHINESE_HK;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testCHINESE_HKShouldSerializeToEnum() {
    
        Language expectedValue = Language.CHINESE_HK;
        Language calculatedValue = Language.fromValue("zh-HK");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testCHINESE_HKShouldDeserializeToString() {
     Language test = Language.CHINESE_HK;
      String expectedValue = "zh-HK";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
        @Test
    public void testCHINESE_TWShouldWork() {

        Language test = Language.CHINESE_TW;
         Assert.assertEquals(test.getClass(), Language.class);
    }

    @Test 
    public void testCHINESE_TWShouldSerializeToEnum() {
    
        Language expectedValue = Language.CHINESE_TW;
        Language calculatedValue = Language.fromValue("zh-TW");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testCHINESE_TWShouldDeserializeToString() {
     Language test = Language.CHINESE_TW;
      String expectedValue = "zh-TW";
      String calculatedValue = test.toString();
      Assert.assertEquals(expectedValue, calculatedValue);
    }
    
    
 }