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

import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

/** Model tests for GetSpeechWebhook */
public class GetSpeechWebhookTest {

    private final GetSpeechWebhook model = new GetSpeechWebhook();

    /** Test the property 'requestType' */
    @Test
    public void requestTypeTest() {}

    /** Test the property 'callId' */
    @Test
    public void callIdTest() {

        model.setCallId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCallId());
    }

    /** Test the property 'accountId' */
    @Test
    public void accountIdTest() {

        model.setAccountId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getAccountId());
    }

    /** Test the property 'from' */
    @Test
    public void fromTest() {

        model.setFrom("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getFrom());
    }

    /** Test the property 'to' */
    @Test
    public void toTest() {

        model.setTo("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getTo());
    }

    /** Test the property 'callStatus' */
    @Test
    public void callStatusTest() {
        model.setCallStatus(CallStatus.QUEUED);
        Assert.assertEquals(model.getCallStatus(), CallStatus.QUEUED);
        model.setCallStatus(CallStatus.RINGING);
        Assert.assertEquals(model.getCallStatus(), CallStatus.RINGING);
        model.setCallStatus(CallStatus.IN_PROGRESS);
        Assert.assertEquals(model.getCallStatus(), CallStatus.IN_PROGRESS);
        model.setCallStatus(CallStatus.CANCELED);
        Assert.assertEquals(model.getCallStatus(), CallStatus.CANCELED);
        model.setCallStatus(CallStatus.COMPLETED);
        Assert.assertEquals(model.getCallStatus(), CallStatus.COMPLETED);
        model.setCallStatus(CallStatus.FAILED);
        Assert.assertEquals(model.getCallStatus(), CallStatus.FAILED);
        model.setCallStatus(CallStatus.BUSY);
        Assert.assertEquals(model.getCallStatus(), CallStatus.BUSY);
        model.setCallStatus(CallStatus.NO_ANSWER);
        Assert.assertEquals(model.getCallStatus(), CallStatus.NO_ANSWER);
    }

    /** Test the property 'direction' */
    @Test
    public void directionTest() {
        model.setDirection(CallDirection.INBOUND);
        Assert.assertEquals(model.getDirection(), CallDirection.INBOUND);
        model.setDirection(CallDirection.OUTBOUND_API);
        Assert.assertEquals(model.getDirection(), CallDirection.OUTBOUND_API);
        model.setDirection(CallDirection.OUTBOUND_DIAL);
        Assert.assertEquals(model.getDirection(), CallDirection.OUTBOUND_DIAL);
    }

    /** Test the property 'conferenceId' */
    @Test
    public void conferenceIdTest() {

        model.setConferenceId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getConferenceId());
    }

    /** Test the property 'queueId' */
    @Test
    public void queueIdTest() {

        model.setQueueId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getQueueId());
    }

    /** Test the property 'reason' */
    @Test
    public void reasonTest() {
        model.setReason(GetSpeechReason.ERROR);
        Assert.assertEquals(model.getReason(), GetSpeechReason.ERROR);
        model.setReason(GetSpeechReason.HANGUP);
        Assert.assertEquals(model.getReason(), GetSpeechReason.HANGUP);
        model.setReason(GetSpeechReason.DIGIT);
        Assert.assertEquals(model.getReason(), GetSpeechReason.DIGIT);
        model.setReason(GetSpeechReason.NO_INPUT);
        Assert.assertEquals(model.getReason(), GetSpeechReason.NO_INPUT);
        model.setReason(GetSpeechReason.NO_MATCH);
        Assert.assertEquals(model.getReason(), GetSpeechReason.NO_MATCH);
        model.setReason(GetSpeechReason.RECOGNITION);
        Assert.assertEquals(model.getReason(), GetSpeechReason.RECOGNITION);
    }

    /** Test the property 'recognitionResult' */
    @Test
    public void recognitionResultTest() {

        model.setRecognitionResult("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getRecognitionResult());
    }

    /** Test the property 'confidence' */
    @Test
    public void confidenceTest() {

        model.setConfidence(1);
        Assert.assertEquals(1, (int) model.getConfidence());
    }

    /** Test the property 'parentCallId' */
    @Test
    public void parentCallIdTest() {

        model.setParentCallId("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getParentCallId());
    }

    /** Test the property 'completionReason' */
    @Test
    public void completionReasonTest() {

        model.setCompletionReason("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCompletionReason());
    }

    /** Test the property 'completionCause' */
    @Test
    public void completionCauseTest() {

        model.setCompletionCause("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getCompletionCause());
    }

    /** Test the property 'mrcpCode' */
    @Test
    public void mrcpCodeTest() {

        model.setMrcpCode(1);
        Assert.assertEquals(1, (int) model.getMrcpCode());
    }

    /** Test the property 'mrcpDiagnostic' */
    @Test
    public void mrcpDiagnosticTest() {

        model.setMrcpDiagnostic("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getMrcpDiagnostic());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        GetSpeechWebhook test1 = new GetSpeechWebhook();

        test1.setRequestType("TS");

        test1.setCallId("TS");

        test1.setAccountId("TS");

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setCallStatus(CallStatus.QUEUED);
        test1.setDirection(CallDirection.INBOUND);

        test1.setConferenceId("TS");

        test1.setQueueId("TS");

        test1.setReason(GetSpeechReason.ERROR);

        test1.setRecognitionResult("TS");

        test1.setConfidence(1);

        test1.setParentCallId("TS");

        test1.setCompletionReason("TS");

        test1.setCompletionCause("TS");

        test1.setMrcpCode(1);

        test1.setMrcpDiagnostic("TS");

        GetSpeechWebhook test2 = new GetSpeechWebhook();

        test2.setRequestType("TS");

        test2.setCallId("TS");

        test2.setAccountId("TS");

        test2.setFrom("TS");

        test2.setTo("TS");

        test2.setCallStatus(CallStatus.QUEUED);
        test2.setDirection(CallDirection.INBOUND);

        test2.setConferenceId("TS");

        test2.setQueueId("TS");

        test2.setReason(GetSpeechReason.ERROR);

        test2.setRecognitionResult("TS");

        test2.setConfidence(1);

        test2.setParentCallId("TS");

        test2.setCompletionReason("TS");

        test2.setCompletionCause("TS");

        test2.setMrcpCode(1);

        test2.setMrcpDiagnostic("TS");

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        GetSpeechWebhook test1 = new GetSpeechWebhook();

        test1.setRequestType("TS");

        test1.setCallId("TS");

        test1.setAccountId("TS");

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setCallStatus(CallStatus.RINGING);
        test1.setDirection(CallDirection.OUTBOUND_API);

        test1.setConferenceId("TS");

        test1.setQueueId("TS");

        test1.setReason(GetSpeechReason.HANGUP);

        test1.setRecognitionResult("TS");

        test1.setConfidence(1);

        test1.setParentCallId("TS");

        test1.setCompletionReason("TS");

        test1.setCompletionCause("TS");

        test1.setMrcpCode(1);

        test1.setMrcpDiagnostic("TS");

        GetSpeechWebhook test2 = new GetSpeechWebhook();

        test2.setRequestType("TS2");

        test2.setCallId("TS2");

        test2.setAccountId("TS2");

        test2.setFrom("TS2");

        test2.setTo("TS2");

        test2.setCallStatus(CallStatus.QUEUED);
        test2.setDirection(CallDirection.INBOUND);

        test2.setConferenceId("TS2");

        test2.setQueueId("TS2");

        test2.setReason(GetSpeechReason.ERROR);

        test2.setRecognitionResult("TS2");

        test2.setConfidence(0);

        test2.setParentCallId("TS2");

        test2.setCompletionReason("TS2");

        test2.setCompletionCause("TS2");

        test2.setMrcpCode(0);

        test2.setMrcpDiagnostic("TS2");

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        GetSpeechWebhook test1 = new GetSpeechWebhook();

        test1.setRequestType("TS");

        test1.setCallId("TS");

        test1.setAccountId("TS");

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setCallStatus(CallStatus.QUEUED);
        test1.setDirection(CallDirection.INBOUND);

        test1.setConferenceId("TS");

        test1.setQueueId("TS");

        test1.setReason(GetSpeechReason.ERROR);

        test1.setRecognitionResult("TS");

        test1.setConfidence(1);

        test1.setParentCallId("TS");

        test1.setCompletionReason("TS");

        test1.setCompletionCause("TS");

        test1.setMrcpCode(1);

        test1.setMrcpDiagnostic("TS");

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        GetSpeechWebhook test1 = new GetSpeechWebhook();

        test1.setRequestType("TS");

        test1.setCallId("TS");

        test1.setAccountId("TS");

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setCallStatus(CallStatus.QUEUED);
        test1.setDirection(CallDirection.INBOUND);

        test1.setConferenceId("TS");

        test1.setQueueId("TS");

        test1.setReason(GetSpeechReason.ERROR);

        test1.setRecognitionResult("TS");

        test1.setConfidence(1);

        test1.setParentCallId("TS");

        test1.setCompletionReason("TS");

        test1.setCompletionCause("TS");

        test1.setMrcpCode(1);

        test1.setMrcpDiagnostic("TS");

        GetSpeechWebhook test2 = new GetSpeechWebhook();

        test2.setRequestType("TS");

        test2.setCallId("TS");

        test2.setAccountId("TS");

        test2.setFrom("TS");

        test2.setTo("TS");

        test2.setCallStatus(CallStatus.QUEUED);
        test2.setDirection(CallDirection.INBOUND);

        test2.setConferenceId("TS");

        test2.setQueueId("TS");

        test2.setReason(GetSpeechReason.ERROR);

        test2.setRecognitionResult("TS");

        test2.setConfidence(1);

        test2.setParentCallId("TS");

        test2.setCompletionReason("TS");

        test2.setCompletionCause("TS");

        test2.setMrcpCode(1);

        test2.setMrcpDiagnostic("TS");

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        GetSpeechWebhook test1 = new GetSpeechWebhook();

        test1.setRequestType("TS");

        test1.setCallId("TS");

        test1.setAccountId("TS");

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setCallStatus(CallStatus.QUEUED);
        test1.setDirection(CallDirection.INBOUND);

        test1.setConferenceId("TS");

        test1.setQueueId("TS");

        test1.setReason(GetSpeechReason.ERROR);

        test1.setRecognitionResult("TS");

        test1.setConfidence(1);

        test1.setParentCallId("TS");

        test1.setCompletionReason("TS");

        test1.setCompletionCause("TS");

        test1.setMrcpCode(1);

        test1.setMrcpDiagnostic("TS");

        GetSpeechWebhook test2 = new GetSpeechWebhook();

        test2.setRequestType("TS");

        test2.setCallId("TS");

        test2.setAccountId("TS");

        test2.setFrom("TS");

        test2.setTo("TS");

        test2.setCallStatus(CallStatus.QUEUED);
        test2.setDirection(CallDirection.INBOUND);

        test2.setConferenceId("TS");

        test2.setQueueId("TS");

        test2.setReason(GetSpeechReason.ERROR);

        test2.setRecognitionResult("TS");

        test2.setConfidence(1);

        test2.setParentCallId("TS");

        test2.setCompletionReason("TS");

        test2.setCompletionCause("TS");

        test2.setMrcpCode(1);

        test2.setMrcpDiagnostic("TS");

        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        GetSpeechWebhook test1 = new GetSpeechWebhook();

        test1.setRequestType("TS");

        test1.setCallId("TS");

        test1.setAccountId("TS");

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setCallStatus(CallStatus.RINGING);
        test1.setDirection(CallDirection.OUTBOUND_API);

        test1.setConferenceId("TS");

        test1.setQueueId("TS");

        test1.setReason(GetSpeechReason.HANGUP);

        test1.setRecognitionResult("TS");

        test1.setConfidence(1);

        test1.setParentCallId("TS");

        test1.setCompletionReason("TS");

        test1.setCompletionCause("TS");

        test1.setMrcpCode(1);

        test1.setMrcpDiagnostic("TS");

        GetSpeechWebhook test2 = new GetSpeechWebhook();

        test2.setRequestType("TS2");

        test2.setCallId("TS2");

        test2.setAccountId("TS2");

        test2.setFrom("TS2");

        test2.setTo("TS2");

        test2.setCallStatus(CallStatus.QUEUED);
        test2.setDirection(CallDirection.INBOUND);

        test2.setConferenceId("TS2");

        test2.setQueueId("TS2");

        test2.setReason(GetSpeechReason.ERROR);

        test2.setRecognitionResult("TS2");

        test2.setConfidence(0);

        test2.setParentCallId("TS2");

        test2.setCompletionReason("TS2");

        test2.setCompletionCause("TS2");

        test2.setMrcpCode(0);

        test2.setMrcpDiagnostic("TS2");

        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        GetSpeechWebhook test1 = new GetSpeechWebhook();

        test1.setRequestType("TS");

        test1.setCallId("TS");

        test1.setAccountId("TS");

        test1.setFrom("TS");

        test1.setTo("TS");

        test1.setCallStatus(CallStatus.QUEUED);
        test1.setDirection(CallDirection.INBOUND);

        test1.setConferenceId("TS");

        test1.setQueueId("TS");

        test1.setReason(GetSpeechReason.ERROR);

        test1.setRecognitionResult("TS");

        test1.setConfidence(1);

        test1.setParentCallId("TS");

        test1.setCompletionReason("TS");

        test1.setCompletionCause("TS");

        test1.setMrcpCode(1);

        test1.setMrcpDiagnostic("TS");

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }

    @Test
    public void deserializeTest() {
        String json = "{ \"requestType\": \"getSpeech\" }";
        GetSpeechWebhook webhookInstance = GetSpeechWebhook.deserialize(json);
        Assert.assertTrue(webhookInstance instanceof GetSpeechWebhook);
    }
}
