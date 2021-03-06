package com.vailsys.freeclimb.webhooks.conference;

import com.vailsys.freeclimb.api.call.CallStatus;
import com.vailsys.freeclimb.webhooks.RequestType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;

public class ConferenceCreateActionCallbackTest {
    private ConferenceCreateActionCallback ccac;
    //requestType is explicitly absent, the identifying factor is having both a callId and conferenceId.
    private static String CCAS_JSON = " { \"requestId\":\"RA1766ca5ee92fc6c528b72aff5e8b48f4e056e8\", \"callId\":\"CA12345\", \"accountId\":\"ACae05391ecca1352e9108d545482a1e6f384e7a49\", \"from\":\"+17083168669\", \"to\":\"+12248806211\",\"callStatus\":\"inProgress\", \"direction\":\"inbound\", \"conferenceId\":\"CFbde0362aef3d228b3a39baafa9e4f0204e724966\", \"queueId\":null, \"callerInfo\":null, \"parentCallId\":null, \"requestType\":\"createConference\"}";

    @Given("^a ConferenceCreateActionCallback$")
    public void newCcac() throws Throwable {
        this.ccac = ConferenceCreateActionCallback.createFromJson(CCAS_JSON);
    }

    @Then("^verify the ConferenceCreateActionCallback's contents$")
    public void verifyContents(){
        assertThat(this.ccac.getRequestType(), is(RequestType.CREATE_CONFERENCE));
        assertTrue(this.ccac.getConferenceId() != null);
        assertTrue(this.ccac.getCallId() != null);
        assertThat(this.ccac.getCallStatus(), is(CallStatus.IN_PROGRESS));
    }

}
