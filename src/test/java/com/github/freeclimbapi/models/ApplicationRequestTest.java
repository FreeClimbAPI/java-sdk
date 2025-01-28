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
 * Model tests for ApplicationRequest
 */
 public class ApplicationRequestTest {
    
    private final ApplicationRequest model = new ApplicationRequest(
    );
    
    
    /**
     * Test the property 'alias'
     */
    @Test
    public void aliasTest() {
      
      
      model.setAlias("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getAlias());
      
      
    }
    /**
     * Test the property 'voiceUrl'
     */
    @Test
    public void voiceUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setVoiceUrl(uri);
        Assert.assertEquals(uri, model.getVoiceUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    /**
     * Test the property 'voiceFallbackUrl'
     */
    @Test
    public void voiceFallbackUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setVoiceFallbackUrl(uri);
        Assert.assertEquals(uri, model.getVoiceFallbackUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    /**
     * Test the property 'callConnectUrl'
     */
    @Test
    public void callConnectUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setCallConnectUrl(uri);
        Assert.assertEquals(uri, model.getCallConnectUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    /**
     * Test the property 'statusCallbackUrl'
     */
    @Test
    public void statusCallbackUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setStatusCallbackUrl(uri);
        Assert.assertEquals(uri, model.getStatusCallbackUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    /**
     * Test the property 'smsUrl'
     */
    @Test
    public void smsUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setSmsUrl(uri);
        Assert.assertEquals(uri, model.getSmsUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    /**
     * Test the property 'smsFallbackUrl'
     */
    @Test
    public void smsFallbackUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setSmsFallbackUrl(uri);
        Assert.assertEquals(uri, model.getSmsFallbackUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }

      /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      ApplicationRequest test1 = new ApplicationRequest();
        
        
      test1.setAlias("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallConnectUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      ApplicationRequest test2 = new ApplicationRequest();
        
        
      test2.setAlias("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setVoiceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setVoiceFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setCallConnectUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setSmsUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setSmsFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      ApplicationRequest test1 = new ApplicationRequest();
        
        
      test1.setAlias("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallConnectUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      ApplicationRequest test2 = new ApplicationRequest();
        
        
      test2.setAlias("TS2");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setVoiceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setVoiceFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setCallConnectUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setSmsUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setSmsFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      ApplicationRequest test1 = new ApplicationRequest();
        
        
      test1.setAlias("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallConnectUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      ApplicationRequest test1 = new ApplicationRequest();
        
        
      test1.setAlias("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallConnectUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      ApplicationRequest test2 = new ApplicationRequest();
        
        
      test2.setAlias("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setVoiceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setVoiceFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setCallConnectUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setSmsUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setSmsFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      ApplicationRequest test1 = new ApplicationRequest();
        
        
      test1.setAlias("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallConnectUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      ApplicationRequest test2 = new ApplicationRequest();
        
        
      test2.setAlias("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setVoiceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setVoiceFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setCallConnectUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setSmsUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setSmsFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      ApplicationRequest test1 = new ApplicationRequest();
        
        
      test1.setAlias("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallConnectUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      ApplicationRequest test2 = new ApplicationRequest();
        
        
      test2.setAlias("TS2");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setVoiceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setVoiceFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setCallConnectUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setStatusCallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setSmsUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setSmsFallbackUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      ApplicationRequest test1 = new ApplicationRequest();
        
        
        test1.setAlias("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setVoiceFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallConnectUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setStatusCallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setSmsFallbackUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    
 }