package com.vailsys.freeclimb.api.call;

import java.util.HashMap;

import com.vailsys.freeclimb.api.APIAccountRequester;
import com.vailsys.freeclimb.api.FreeClimbException;
import com.vailsys.freeclimb.api.FreeClimbJSONException;
import static com.vailsys.freeclimb.json.FreeClimbGson.gson;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

/**
 * This class represents the set of wrappers around the FreeClimb Calls API. It
 * provides methods to handle all the operations supported by the FreeClimb
 * Calls API.
 */
public class CallsRequester extends APIAccountRequester {
	private static final String pathHead = "Calls";
	/** The default path for the Calls endpoint. */
	private final String path;
	/** The accountId for the acting account. */
	private final String actingAccountId;

	/**
	 * Creates a CallsRequester. For most SDK users CallsRequesters will be created
	 * automatically by the {@link com.vailsys.freeclimb.api.FreeClimbClient} but is
	 * available for more advanced users who only require the features in this
	 * specific requester and not the rest of the features of the
	 * {@link com.vailsys.freeclimb.api.FreeClimbClient}.
	 *
	 * @param credAccountId   The accountId to use as authentication credentials in
	 *                        the HTTP Basic Auth header for requests made by this
	 *                        requester.
	 * @param credApiKey   The apiKey to use as authentication credentials in
	 *                        the HTTP Basic Auth header for requests made by this
	 *                        requester.
	 * @param actingAccountId The accountId to act as. This can be the same as the
	 *                        {@code credAccountId} or the accountId of a subaccount
	 *                        of the {@code credAccountId}.
	 * @throws FreeClimbException when the request fails or the JSON is invalid.
	 */
	public CallsRequester(String credAccountId, String credApiKey, String actingAccountId)
			throws FreeClimbException {
		super(credAccountId, credApiKey);
		this.actingAccountId = actingAccountId;
		this.path = APIAccountRequester.constructPath(APIAccountRequester.rootPath, this.actingAccountId, pathHead);
	}

	/**
	 * Retrieve the {@code actingAccountId}.
	 *
	 * @return The {@code actingAccountId}
	 */
	public String getActingAccountId() {
		return this.actingAccountId;
	}

	/**
	 * Retrieve the {@code path} value generated by the CallsRequester. This is the
	 * URL path used in requests to FreeClimb.
	 *
	 * @return The {@code path}
	 */
	protected String getPath() {
		return this.path;
	}

	private String createCallPath(String callId) {
		return APIAccountRequester.constructPath(this.path, callId);
	}

	/**
	 * Allows developers using the SDK to change which instance of the FreeClimb API
	 * that the CallsRequester points to.
	 *
	 * @param newUrl The new URL to use in place of the default
	 *               APIRequester.FREECLIMB_URL
	 */
	public void setFreeClimbUrl(String newUrl) {
		super.setFreeClimbUrl(newUrl);
	}

	/**
	 * Create a new call through the FreeClimb API using a registered FreeClimb
	 * application. This function wraps an HTTP POST request to the FreeClimb API's
	 * /Account/$accountId/Calls endpoint. This places a new call from the
	 * {@code actingAccountId} to the number provided from the number provided.
	 *
	 * @param to            The number to call out to (DNIS). This can be any valid
	 *                      phone number formatted in E.164 format.
	 * @param from          The number to call from (ANI). This must be a number
	 *                      purchase from FreeClimb or a verified phone number owned
	 *                      by the user.
	 *
	 * @return The {@link com.vailsys.freeclimb.api.call.Call} object returned by
	 *         FreeClimb that represents the call that was created.
	 * @throws FreeClimbException when the request fails or the JSON is invalid.
	 */
	public Call create(String to, String from) throws FreeClimbException {
		return this.create(to, from, (CallOptions) null);
	}

	/**
	 * Create a new call through the FreeClimb API using a registered FreeClimb
	 * application. This function wraps an HTTP POST request to the FreeClimb API's
	 * /Account/$accountId/Calls endpoint. This places a new call from the
	 * {@code actingAccountId} to the number provided from the number provided.
	 *
	 * @param to            The number to call out to (DNIS). This can be any valid
	 *                      phone number formatted in E.164 format.
	 * @param from          The number to call from (ANI). This must be a number
	 *                      purchase from FreeClimb or a verified phone number owned
	 *                      by the user.
	 * @param callOptions   Optional arguments that can be provided when creating a
	 *                      call. See FreeClimb documentation for details.
	 *
	 * @return The {@link com.vailsys.freeclimb.api.call.Call} object returned by
	 *         FreeClimb that represents the call that was created.
	 *
	 * @see com.vailsys.freeclimb.api.call.CallOptions
	 * @throws FreeClimbException when the request fails or the JSON is invalid.
	 */
	public Call create(String to, String from, CallOptions callOptions)
			throws FreeClimbException {
		try {
			return Call.fromJson(
					this.POST(this.path, new CreateCallRequest(to, from, callOptions).toJson()));
		} catch (JsonIOException jioe) {
			throw new FreeClimbJSONException(jioe);
		}
	}

	/**
	 * Retrieve a list of calls associated with the {@code actingAccountId}. This
	 * wraps a HTTP GET request to the FreeClimb API's /Accounts/$accountId/Calls
	 * endpoint. This will retrieve all calls for the acting account.
	 *
	 * @return An in-language representation of FreeClimb's paginated list response.
	 *         This will be a paginated list of call instances as returned by the
	 *         FreeClimb API.
	 *
	 * @see com.vailsys.freeclimb.api.call.Call
	 * @throws FreeClimbException when the request fails or the JSON is invalid.
	 */
	public CallList get() throws FreeClimbException {
		return new CallList(this.getCredentialAccountId(), this.getCredentialApiKey(), this.GET(this.path));
	}

	/**
	 * Retrieve a list of calls associated with the {@code actingAccountId}. This
	 * wraps a HTTP GET request to the FreeClimb API's /Accounts/$accountId/Calls
	 * endpoint. This will retrieve all calls for the acting account.
	 *
	 * @param filters An object containing a number of possible ways to filter the
	 *                calls returned by FreeClimb.
	 *
	 * @return An in-language representation of FreeClimb's paginated list response.
	 *         This will be a paginated list of call instances as returned by the
	 *         FreeClimb API.
	 *
	 * @see com.vailsys.freeclimb.api.call.CallsSearchFilters
	 * @throws FreeClimbException when the request fails or the JSON is invalid.
	 */
	public CallList get(CallsSearchFilters filters) throws FreeClimbException {
		HashMap<String, String> filtersMap;

		try {
			filtersMap = gson.fromJson(gson.toJson(filters), APIAccountRequester.GETMapType);
		} catch (JsonSyntaxException jse) {
			throw new FreeClimbJSONException(jse);
		}

		return new CallList(this.getCredentialAccountId(), this.getCredentialApiKey(),
				this.GET(this.path, filtersMap));
	}

	/**
	 * Retrieve a single call from FreeClimb.
	 *
	 * @param callId The {@code callId} of the desired call.
	 *
	 * @return The call matching the {@code callId} provided.
	 * @throws FreeClimbException when the request fails or the JSON is invalid.
	 */
	public Call get(String callId) throws FreeClimbException {
		return Call.fromJson(this.GET(this.createCallPath(callId)));
	}

	/**
	 * Update the existing call associated with the {@code callId}. This wraps an
	 * HTTP POST request to the FreeClimb API's /Accounts/$accountId/Calls/$callId
	 * endpoint.
	 *
	 * @param callId  The {@code callId} of the desired call.
	 * @param updates The {@code CallUpdateOptions} to change in the target call.
	 * @see com.vailsys.freeclimb.api.call.CallsUpdateOptions
	 *
	 * @throws FreeClimbException when the request fails or the JSON is invalid.
	 */
	public void update(String callId, CallsUpdateOptions updates) throws FreeClimbException {
		this.POST(this.createCallPath(callId), gson.toJson(updates));
	}
}
