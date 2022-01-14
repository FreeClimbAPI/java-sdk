package com.vailsys.freeclimb.api.phoneNumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.json.JSONObject;
import org.json.JSONException;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertTrue;

public class AvailablePhoneNumberTest {
    private AvailablePhoneNumber apn;
    private static String availableJson = null;

    @Given("^some JSON representing an available phone number$")
    public void setupJson() throws JSONException {
        availableJson = new JSONObject()
            .put("phoneNumber", "+18474574545")
            .put("alias", "1 (847) 457-4545")
            .put("region", "Illinois")
            .put("country", "US")
            .put("campaignId", "123")
            .put("provider", "Vail Systems")
            .put("capabilities", new JSONObject()
                .put("voice", true)
                .put("sms", true)
                .put("shortCode", true)
                .put("tollFree", true)
                .put("tenDLC", true)
            )
            .toString();
    }

    @Then("^build an availablePhoneNumber object from that JSON$")
    public void create() throws Throwable{
        apn = AvailablePhoneNumber.fromJson(availableJson);
    }

    @Then("^check the contents of the availablePhoneNumber$")
    public void checkContents(){
        PhoneNumberCapabilities capabilities = apn.getCapabilities();
        assertThat(apn.getPhoneNumber(), is("+18474574545"));
        assertThat(apn.getAlias(), is("1 (847) 457-4545"));
        assertThat(apn.getRegion(), is("Illinois"));
        assertThat(apn.getCampaignId(), is("123"));
        assertThat(apn.getProvider(), is("Vail Systems"));
        assertThat(apn.getCountry(), is("US"));
        assertThat(apn.getCapabilities(), isA(PhoneNumberCapabilities.class));

        assertThat(capabilities.voiceCapable(), is(true));
        assertThat(capabilities.smsCapable(), is(true));
        assertThat(capabilities.tollFreeCapable(), is(true));
        assertThat(capabilities.shortCodeCapable(), is(true));
        assertThat(capabilities.tenDLCCapable(), is(true));
    }

    @Then("^compare the availablePhoneNumber to equal and unequal objects$")
    public void checkEquals() throws Throwable {
        AvailablePhoneNumber that = AvailablePhoneNumber.fromJson(availableJson);
        assertTrue(apn.equals(that));
        String thatJson = new JSONObject()
            .put("phoneNumber", "+18474574545")
            .put("alias", "1 (847) 457-4545")
            .put("region", "Illinois")
            .put("country", "US")
            .put("campaignId", "123")
            .put("provider", "Vail Systems")
            .put("capabilities", new JSONObject()
                .put("voice", false)
                .put("sms", false)
                .put("shortCode", true)
                .put("tollFree", false)
                .put("tenDLC", false)
            )
            .toString();
        that = AvailablePhoneNumber.fromJson(thatJson);
        assertFalse(apn.equals(that));
    }
}
