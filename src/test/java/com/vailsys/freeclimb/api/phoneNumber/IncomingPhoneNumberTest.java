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

public class IncomingPhoneNumberTest {
    private String json;
    private IncomingPhoneNumber number;

    @Given("^some JSON representing an incoming phone number$")
    public void createjson() throws JSONException {
        json = new JSONObject()
            .put("phoneNumber", "+12248806207")
            .put("alias", "Test Alias")
            .put("revision", 2)
            .put("dateCreated", "Mon, 07 Nov 2016 15:25:18 GMT")
            .put("dateUpdated", "Wed, 07 Dec 2016 19:38:52 GMT")
            .put("phoneNumberId", "PN8e458139313ed1fea8599e1a1d290a958d2d778e")
            .put("region", "Illinois")
            .put("country", "US")
            .put("applicationId", "AP427c0606920b5ad7cd97b51dd2196a398443cd8d")
            .put("uri", "/Accounts/AC6910fbcfaffb781e7dda33864003df692dc6c5ac/IncomingPhoneNumbers/PN8e458139313ed1fea8599e1a1d290a958d2d778e")
            .put("accountId", "AC6910fbcfaffb781e7dda33864003df692dc6c5ac")
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

    @Then("^build an IncomingPhoneNumber object from that JSON$")
    public void create() throws Throwable {
        number = IncomingPhoneNumber.fromJson(json);
    }

    @Then("^check the contents of the IncomingPhoneNumber$")
    public void checkDefault() {
        PhoneNumberCapabilities capabilities = number.getCapabilities();
        assertThat(number.getPhoneNumber(), is("+12248806207"));
        assertThat(number.getAlias(), is("Test Alias"));
        assertThat(number.getPhoneNumberId(), is("PN8e458139313ed1fea8599e1a1d290a958d2d778e"));
        assertThat(number.getRegion(), is("Illinois"));
        assertThat(number.getCountry(), is("US"));
        assertThat(number.getApplicationId(), is("AP427c0606920b5ad7cd97b51dd2196a398443cd8d"));
        assertThat(number.getAccountId(), is("AC6910fbcfaffb781e7dda33864003df692dc6c5ac"));
        assertThat(number.getCapabilities(), isA(PhoneNumberCapabilities.class));

        assertThat(capabilities.voiceCapable(), is(true));
        assertThat(capabilities.smsCapable(), is(true));
        assertThat(capabilities.tollFreeCapable(), is(true));
        assertThat(capabilities.shortCodeCapable(), is(true));
        assertThat(capabilities.tenDLCCapable(), is(true));
    }

    @Then("^compare the IncomingPhoneNumber to equal and unequal objects$")
    public void checkEquality() throws Throwable {
        assertTrue(number.equals(IncomingPhoneNumber.fromJson(json)));
        json = new JSONObject()
            .put("phoneNumber", "+12248806207")
            .put("alias", "Test Alias")
            .put("revision", 2)
            .put("dateCreated", "Mon, 07 Nov 2016 15:25:18 GMT")
            .put("dateUpdated", "Wed, 07 Dec 2016 19:38:52 GMT")
            .put("phoneNumberId", "PN8e458139313ed1fea8599e1a1d290a958d2d778e")
            .put("region", "Illinois")
            .put("country", "US")
            .put("applicationId", "AP427c0606920b5ad7cd97b51dd2196a398443cd8d")
            .put("uri", "/Accounts/AC6910fbcfaffb781e7dda33864003df692dc6c5ac/IncomingPhoneNumbers/PN8e458139313ed1fea8599e1a1d290a958d2d778e")
            .put("accountId", "AC6910fbcfaffb781e7dda33864003df692dc6c5ac")
            .put("campaignId", "123")
            .put("provider", "Vail Systems")
            .put("capabilities", new JSONObject()
                .put("voice", false)
                .put("sms", true)
                .put("shortCode", true)
                .put("tollFree", true)
                .put("tenDLC", true)
            )
            .toString();
        assertFalse(number.equals(IncomingPhoneNumber.fromJson(json)));
    }

}
