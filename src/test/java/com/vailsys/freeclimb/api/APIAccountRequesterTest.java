package com.vailsys.freeclimb.api;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class APIAccountRequesterTest {

    private APIAccountRequester req;

    @Given("^an accountId of (.*) and an apiKey of (.*) to make a APIAccountRequester$")
    public void construct(String id, String token){
        req = new APIAccountRequester(id, token);
    }

    @Then("^stored in the APIAccountRequester should be the accountId (.*) and the apiKey (.*)$")
    public void assertCreds(String id, String token){
        assertThat(req.getCredentialAccountId(), is(id));
        assertThat(req.getCredentialApiKey(), is(token));
    }

    @Then("^the APIAccountRequester rootPath should be (.*)$")
    public void assertPath(String path){
        assertThat(req.rootPath, is(path));
    }
}
