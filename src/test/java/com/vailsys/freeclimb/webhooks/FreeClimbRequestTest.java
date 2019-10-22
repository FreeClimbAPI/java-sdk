package com.vailsys.freeclimb.webhooks;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

public class FreeClimbRequestTest {
	private FreeClimbRequest pr;

	@Given("^Given Some JSON create a FreeClimbRequest$")
	public void createFreeClimbRequest() throws Throwable {
		this.pr = FreeClimbRequest.fromJson(
				"{ \"accountId\": \"ACae05391ecca1352e9108d545482a1e6f384e7a49\", \"from\": \"+17083168669\", \"requestId\": \"RQ0c74d2e880709c85e8a4e3093b85b910eee4110b\", \"requestType\": \"inboundCall\", \"to\": \"+12248806211\" }");
	}

	@Then("^verify the FreeClimbRequest contents$")
	public void verifyContents() {
		assertThat(this.pr.getAccountId(), is("ACae05391ecca1352e9108d545482a1e6f384e7a49"));
		assertThat(this.pr.getFrom(), is("+17083168669"));
		assertThat(this.pr.getRequestId(), is("RQ0c74d2e880709c85e8a4e3093b85b910eee4110b"));
		assertThat(this.pr.getRequestType(), is(RequestType.INBOUNDCALL));
		assertThat(this.pr.getTo(), is("+12248806211"));
	}
}
