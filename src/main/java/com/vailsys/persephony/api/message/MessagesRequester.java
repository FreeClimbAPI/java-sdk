package com.vailsys.persephony.api.message;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.vailsys.persephony.api.APIAccountRequester;
import com.vailsys.persephony.api.PersyException;
import com.vailsys.persephony.api.PersyJSONException;

import java.util.HashMap;
import java.util.Map;

import static com.vailsys.persephony.json.PersyGson.gson;

/**
 * This class represents the set of wrappers around the Persephony Messages API. It provides methods to handle all the operations supported by the Persephony Messages API.
 */
public class MessagesRequester extends APIAccountRequester {
    private static final String pathHead = "Messages";
    /**
     * The default path for the Messages endpoint.
     */
    private final String path;
    /**
     * The accountId for the acting account.
     */
    private final String actingAccountId;

    /**
     * Creates a MessagesRequester. For most SDK users MessagesRequesters will be created automatically by the {@link com.vailsys.persephony.api.PersyClient} but is available for more advanced users who only require the features in this specific requester.
     *
     * @param credAccountId   The accountId to use as authentication credentials in the HTTP basic Auth Header for requests made by this requester.
     * @param credAuthToken   The authToken to use as authentication credentials in the HTTP basic Auth Header for requests made by this requester.
     * @param actingAccountId The accountId to act as. This can be the same as {@code credAccountId} or the accountId of a subaccount of the {@code credAccountId}.
     */
    public MessagesRequester(String credAccountId, String credAuthToken, String actingAccountId) {
        super(credAccountId, credAuthToken);
        this.actingAccountId = actingAccountId;
        this.path = APIAccountRequester.constructPath(APIAccountRequester.rootPath, this.actingAccountId, pathHead);
    }

    /**
     * Retrieve the {@code path} value generated by the MessagesRequester. This is the URL path used in requests to Persephony.
     *
     * @return The {@code path}.
     */
    public String getPath() {
        return path;
    }

    /**
     * Retrieve the {@code actingAccountId}.
     *
     * @return The {@code actingAccountId}.
     */
    public String getActingAccountId() {
        return actingAccountId;
    }

    private String getMessagePath(String messageId) {
        return APIAccountRequester.constructPath(this.getPath(), messageId);
    }

    /**
     * Allows developers using the SDK to change which instance of the Persephony API tht the MessagesRequester points to.
     *
     * @param newUrl The new URL to use in place of the default APIRequester.PERSY_URL
     */
    public void setPersyUrl(String newUrl) {
        super.setPersyUrl(newUrl);
    }

    /**
     * Retrieve a single message from Persephony.
     *
     * @param messageId The {@code messageId} of the desired message.
     * @return The message matching the {@code messageId} provided.
     * @throws PersyException when the request fails or the JSON is invalid.
     */
    public Message get(String messageId) throws PersyException {
        return Message.fromJson(this.GET(this.getMessagePath(messageId)));
    }

    /**
     * Retrieve a list of Messages associated with the {@code actingAccountId}.
     * This wraps a HTTP GET request to the Persephony API's /Accounts/$accountId/Messages endpoint. This will retrieve all messages for the acting account.
     *
     * @return An in-language representation of Persephony's paginated list response. This will be a paginated list of messages as returned by the Persephony API.
     * @throws PersyException when the request fails or the JSON is invalid.
     */
    public MessageList get() throws PersyException {
        return new MessageList(this.getCredentialAccountId(), this.getCredentialAuthToken(), this.GET(this.getPath()));
    }

    /**
     * Retrieve a list of Messages associated with the {@code actingAccountId}.
     * This wraps an HTTP GET request to the Persephony API's /Accounts/$accountId/Messages endpoint. This will retrieve all messages for the acting account.
     *
     * @param filters an object containins a number of possible ways to filter the messages returned by Persephony.
     * @return An in-language representation of Persephony's paginated list response. This will be a paginated list of messages as returned by the Persephony API.
     * @throws PersyException when the request fails or the JSON is invalid.
     * @see com.vailsys.persephony.api.message.MessagesSearchFilters
     */
    public MessageList get(MessagesSearchFilters filters) throws PersyException {
        HashMap<String, String> filtersMap;

        try {
            filtersMap = gson.fromJson(gson.toJson(filters), APIAccountRequester.GETMapType);
        } catch (JsonSyntaxException jse) {
            throw new PersyJSONException(jse);
        }

        return new MessageList(this.getCredentialAccountId(), this.getCredentialAuthToken(), this.GET(this.getPath(), filtersMap));
    }

    /**
     * Send a new Message through the Persephony API.
     * This function wraps an HTTP POST request to the Persephony API's /Accounts/$accountId/Messages endpoint. This creates a new message from the {@code actingAccountId}'s account.
     *
     * @param from The phone number to use as the sender. This must be an incoming number you have purchased from Persephony.
     * @param to   The phone number to send the message to.
     * @param text The text contained in the message. (maximum 254 characters)
     * @return The {@link com.vailsys.persephony.api.message.Message} object returned by Persephony that represents the message that was sent.
     * @throws PersyException When the request fails or the JSON is invalid.
     */
    public Message create(String from, String to, String text) throws PersyException {
        return this.create(from, to, text, null);
    }

	/**
	 * Send a new Message through the Persephony API.
	 * This function wraps an HTTP POST request to the Persephony API's /Accounts/$accountId/Messages endpoint. This creates a new message from the {@code actingAccountId}'s account.
	 *
	 * @param from The phone number to use as the sender. This must be an incoming number you have purchased from Persephony.
	 * @param to   The phone number to send the message to.
	 * @param text The text contained in the message. (maximum 254 characters)
   * @param messageOptions Optional arguments that can be provided when creating
   * a message. See Persephony documentation for details.
	 * @return The {@link com.vailsys.persephony.api.message.Message} object returned by Persephony that represents the message that was sent.
	 * @throws PersyException when the request fails or the JSON is invalid.
	 */
	public Message create(String from, String to, String text, MessageOptions messageOptions) throws PersyException {
		return Message.fromJson(this.POST(this.path, new CreateMessageRequest(to, from, text, messageOptions).toJson()));
	}
}
