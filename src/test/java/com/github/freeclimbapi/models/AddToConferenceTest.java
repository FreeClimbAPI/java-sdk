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
 * Model tests for AddToConference
 */
 public class AddToConferenceTest {
    
    private final AddToConference model = new AddToConference(
    );
    
    
    /**
     * Test the property 'allowCallControl'
     */
    @Test
    public void allowCallControlTest() {
      model.setAllowCallControl(false);
      Assert.assertEquals(false, model.getAllowCallControl());       
      
    }
    /**
     * Test the property 'callControlSequence'
     */
    @Test
    public void callControlSequenceTest() {
      
      
      model.setCallControlSequence("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getCallControlSequence());
      
      
    }
    /**
     * Test the property 'callControlUrl'
     */
    @Test
    public void callControlUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setCallControlUrl(uri);
        Assert.assertEquals(uri, model.getCallControlUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    /**
     * Test the property 'conferenceId'
     */
    @Test
    public void conferenceIdTest() {
      
      
      model.setConferenceId("TEST_STRING");
      Assert.assertEquals("TEST_STRING", model.getConferenceId());
      
      
    }
    /**
     * Test the property 'leaveConferenceUrl'
     */
    @Test
    public void leaveConferenceUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setLeaveConferenceUrl(uri);
        Assert.assertEquals(uri, model.getLeaveConferenceUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    /**
     * Test the property 'listen'
     */
    @Test
    public void listenTest() {
      model.setListen(false);
      Assert.assertEquals(false, model.getListen());       
      
    }
    /**
     * Test the property 'notificationUrl'
     */
    @Test
    public void notificationUrlTest() {
      
      
      try {
        URI uri = new URI("TEST_STRING");
        model.setNotificationUrl(uri);
        Assert.assertEquals(uri, model.getNotificationUrl());
      } catch (Exception e) {
        e.printStackTrace();
      }
      
    }
    /**
     * Test the property 'startConfOnEnter'
     */
    @Test
    public void startConfOnEnterTest() {
      model.setStartConfOnEnter(false);
      Assert.assertEquals(false, model.getStartConfOnEnter());       
      
    }
    /**
     * Test the property 'talk'
     */
    @Test
    public void talkTest() {
      model.setTalk(false);
      Assert.assertEquals(false, model.getTalk());       
      
    }
    /**
     * Test the property 'dtmfPassThrough'
     */
    @Test
    public void dtmfPassThroughTest() {
      model.setDtmfPassThrough(false);
      Assert.assertEquals(false, model.getDtmfPassThrough());       
      
    }

      /**
     * Test the method 'equalsTrue'
     */

     @Test
    public void equalsTrueTest() {
      AddToConference test1 = new AddToConference();
      test1.setAllowCallControl(true);
        
        
      test1.setCallControlSequence("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallControlUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setConferenceId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setLeaveConferenceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setListen(true);
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setNotificationUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setStartConfOnEnter(true);
      test1.setTalk(true);
      test1.setDtmfPassThrough(true);
      AddToConference test2 = new AddToConference();
      test2.setAllowCallControl(true);
        
        
      test2.setCallControlSequence("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setCallControlUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setConferenceId("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setLeaveConferenceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setListen(true);
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setNotificationUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setStartConfOnEnter(true);
      test2.setTalk(true);
      test2.setDtmfPassThrough(true);

      Assert.assertTrue(test1.equals(test2));
    }

    /**
     * Test the method 'equalsFalse'
     */

     @Test
    public void equalsFalseTest() {
      AddToConference test1 = new AddToConference();
      test1.setAllowCallControl(true);
        
        
      test1.setCallControlSequence("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallControlUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setConferenceId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setLeaveConferenceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setListen(true);
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setNotificationUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setStartConfOnEnter(true);
      test1.setTalk(true);
      test1.setDtmfPassThrough(true);
      AddToConference test2 = new AddToConference();
      test2.setAllowCallControl(false);
        
        
      test2.setCallControlSequence("TS2");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setCallControlUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setConferenceId("TS2");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setLeaveConferenceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setListen(false);
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setNotificationUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setStartConfOnEnter(false);
      test2.setTalk(false);
      test2.setDtmfPassThrough(false);

      Assert.assertFalse(test1.equals(test2));
    }
    
    /**
     * Test the method 'hashCodeType'
     */

     @Test
    public void hashCodeTypeTest() {
      AddToConference test1 = new AddToConference();
      test1.setAllowCallControl(true);
        
        
      test1.setCallControlSequence("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallControlUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setConferenceId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setLeaveConferenceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setListen(true);
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setNotificationUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setStartConfOnEnter(true);
      test1.setTalk(true);
      test1.setDtmfPassThrough(true);
      
      int hashCode1 = test1.hashCode();
      Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /**
     * Test the method 'toStringEquals'
     */

     @Test
    public void toStringEqualsTest() {
      AddToConference test1 = new AddToConference();
      test1.setAllowCallControl(true);
        
        
      test1.setCallControlSequence("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallControlUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setConferenceId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setLeaveConferenceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setListen(true);
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setNotificationUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setStartConfOnEnter(true);
      test1.setTalk(true);
      test1.setDtmfPassThrough(true);
      AddToConference test2 = new AddToConference();
      test2.setAllowCallControl(true);
        
        
      test2.setCallControlSequence("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setCallControlUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setConferenceId("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setLeaveConferenceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setListen(true);
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setNotificationUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setStartConfOnEnter(true);
      test2.setTalk(true);
      test2.setDtmfPassThrough(true);
        
      String toString1 = test1.toString();
      String toString2 = test2.toString();
      Assert.assertEquals(toString1, toString2);
    }

    /**
     * Test the method 'hashCodeEqualsTrue'
     */

    @Test
    public void hashCodeEqualsTrueTest() {
      AddToConference test1 = new AddToConference();
      test1.setAllowCallControl(true);
        
        
      test1.setCallControlSequence("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallControlUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setConferenceId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setLeaveConferenceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setListen(true);
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setNotificationUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setStartConfOnEnter(true);
      test1.setTalk(true);
      test1.setDtmfPassThrough(true);
      AddToConference test2 = new AddToConference();
      test2.setAllowCallControl(true);
        
        
      test2.setCallControlSequence("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setCallControlUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setConferenceId("TS");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setLeaveConferenceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setListen(true);
        
        
         try {
          URI uri2 = new URI("TEST_STRING");
          test2.setNotificationUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setStartConfOnEnter(true);
      test2.setTalk(true);
      test2.setDtmfPassThrough(true);
      Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /**
     * Test the method 'hashCodeEqualsFalse'
     */

    @Test
    public void hashCodeEqualsFalseTest() {
      AddToConference test1 = new AddToConference();
      test1.setAllowCallControl(true);
        
        
      test1.setCallControlSequence("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallControlUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test1.setConferenceId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setLeaveConferenceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setListen(true);
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setNotificationUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setStartConfOnEnter(true);
      test1.setTalk(true);
      test1.setDtmfPassThrough(true);
      AddToConference test2 = new AddToConference();
      test2.setAllowCallControl(false);
        
        
      test2.setCallControlSequence("TS2");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setCallControlUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
      test2.setConferenceId("TS2");
      
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setLeaveConferenceUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setListen(false);
        
        
         try {
          URI uri2 = new URI("TEST_STRING2");
          test2.setNotificationUrl(uri2);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test2.setStartConfOnEnter(false);
      test2.setTalk(false);
      test2.setDtmfPassThrough(false);
      Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

     /**
     * Test the method 'toStringType'
     */

     @Test
    public void toStringTypeTest() {
      AddToConference test1 = new AddToConference();
      test1.setAllowCallControl(true);
        
        
        test1.setCallControlSequence("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setCallControlUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
        
        
        test1.setConferenceId("TS");
      
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setLeaveConferenceUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setListen(true);
        
        
         try {
          URI uri1 = new URI("TEST_STRING");
          test1.setNotificationUrl(uri1);
        } catch (Exception e) {
          e.printStackTrace();
        };
      test1.setStartConfOnEnter(true);
      test1.setTalk(true);
      test1.setDtmfPassThrough(true);

      String toString1 = test1.toString();
      Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void commandTest() throws Exception {
      Assert.assertEquals("AddToConference", model.getCommand());
    }

    @Test
    public void buildTest() throws Exception {
        model.setAllowCallControl(false);
        
        
        model.setCallControlSequence("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallControlSequence());
        
        
        
        try {
          URI uri = new URI("TEST_STRING");
          model.setCallControlUrl(uri);
          Assert.assertEquals(uri, model.getCallControlUrl());
        } catch (Exception e) {
          e.printStackTrace();
        }
        
        
        model.setConferenceId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getConferenceId());
        
        
        
        try {
          URI uri = new URI("TEST_STRING");
          model.setLeaveConferenceUrl(uri);
          Assert.assertEquals(uri, model.getLeaveConferenceUrl());
        } catch (Exception e) {
          e.printStackTrace();
        }
        model.setListen(false);
        
        
        try {
          URI uri = new URI("TEST_STRING");
          model.setNotificationUrl(uri);
          Assert.assertEquals(uri, model.getNotificationUrl());
        } catch (Exception e) {
          e.printStackTrace();
        }
        model.setStartConfOnEnter(false);
        model.setTalk(false);
        model.setDtmfPassThrough(false);
        Map<String, Map<String, Object>> build = model.build();
        Map<String, Object> attributes = build.get(model.getCommand());
        Assert.assertEquals(attributes.get("allowCallControl"), model.getAllowCallControl());
        Assert.assertEquals(attributes.get("callControlSequence"), model.getCallControlSequence());
        Assert.assertEquals(attributes.get("callControlUrl"), model.getCallControlUrl());
        Assert.assertEquals(attributes.get("conferenceId"), model.getConferenceId());
        Assert.assertEquals(attributes.get("leaveConferenceUrl"), model.getLeaveConferenceUrl());
        Assert.assertEquals(attributes.get("listen"), model.getListen());
        Assert.assertEquals(attributes.get("notificationUrl"), model.getNotificationUrl());
        Assert.assertEquals(attributes.get("startConfOnEnter"), model.getStartConfOnEnter());
        Assert.assertEquals(attributes.get("talk"), model.getTalk());
        Assert.assertEquals(attributes.get("dtmfPassThrough"), model.getDtmfPassThrough());
        
    }
    
 }