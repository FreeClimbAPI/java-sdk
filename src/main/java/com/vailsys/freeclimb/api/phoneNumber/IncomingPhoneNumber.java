package com.vailsys.freeclimb.api.phoneNumber;

import com.google.gson.JsonSyntaxException;
import com.vailsys.freeclimb.api.FreeClimbJSONException;

import static com.vailsys.freeclimb.json.FreeClimbGson.gson;

/**
 * This class represents a FreeClimb IncomingPhoneNumber instance.
 * IncomingPhoneNumber objects are created by the SDK whenever an incoming phone
 * number instance would be returned by the API; these primarily come from a
 * {@link com.vailsys.freeclimb.api.phoneNumber.IncomingPhoneNumberRequester}
 * inside a {@link com.vailsys.freeclimb.api.FreeClimbClient} instance.<br>
 * <br>
 * IncomingPhoneNumbers are immutable
 */
public class IncomingPhoneNumber extends PhoneNumber {
    /**
     * The campaignId of this phone number.
     */
    private String campaignId;
    /**
     * The provider of this phone number.
     */
    private String provider;
    /**
     * The capabilities of this phone number.
     */
    private PhoneNumberCapabilities capabilities;
    /**
     * The phoneNumberId for this incoming phone number instance.
     */
    private String phoneNumberId;
    /**
     * The accountId of the account that owns this incoming phone number.
     */
    private String accountId;
    /**
     * The applicationId this incoming phone number is assigned to, if any.
     */
    private String applicationId;
    /**
     * The region of this incoming phone number.
     */
    private String region;
    /**
     * The country of this incoming phone number.
     */
    private String country;

    /**
     * Converts the provided JSON string into an Incoming Phone Number object.
     *
     * @param json A JSON string representing a FreeClimb IncomingPhoneNumber
     *             instance.
     * @return An IncomingPhoneNumber object equivalent to the JSON string passed
     *         in.
     * @throws FreeClimbJSONException when the JSON is invalid.
     */
    public static IncomingPhoneNumber fromJson(String json) throws FreeClimbJSONException {
        try {
            return gson.fromJson(json, IncomingPhoneNumber.class);
        } catch (JsonSyntaxException jse) {
            throw new FreeClimbJSONException(jse);
        }
    }

    /**
     * Retrieve the phoneNumberId for this incoming phone number from the object.
     *
     * @return The phoneNumberId for this incoming phone number
     */
    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * Retrieve the accountId for this incoming phone number from the object.
     *
     * @return The accountId for this incoming phone number.
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Retrieve the applicationId for this incoming phone number from the object.
     *
     * @return The applicationId for this incoming phone number.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Retrieve the region for this incoming phone number from the object.
     *
     * @return The region for this incoming phone number.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Retrieve the country for this incoming phone number from the object.
     *
     * @return The country for this incoming phone number.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Retrieve the capabilities of the phone number.
     * 
     * @return The capabilities of this AvailablePhoneNumber.
     */
    public PhoneNumberCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Retrieve the campaignId of the phone number.
     * 
     * @return The campaignId of this AvailablePhoneNumber.
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Retrieve the provider of the phone number.
     * 
     * @return The provider of this AvailablePhoneNumber.
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Check if this incoming phone number equals another. This is done by comparing
     * all fields in the incoming phone numbers for equality.
     *
     * @param that The IncomingPhoneNumber object for comparison.
     * @return {@code true} if incoming phone numbers are equal, {@code false}
     *         otherwise.
     */
    public boolean equals(IncomingPhoneNumber that) {
        boolean result = super.equals(that);

        if (this.getPhoneNumberId() != null) {
            result = result && that.getPhoneNumberId().equals(this.getPhoneNumberId());
        } else {
            result = result && that.getPhoneNumberId() == null;
        }

        if (this.getAccountId() != null) {
            result = result && that.getAccountId().equals(this.getAccountId());
        } else {
            result = result && that.getAccountId() == null;
        }

        if (this.getApplicationId() != null) {
            result = result && that.getApplicationId().equals(this.getApplicationId());
        } else {
            result = result && that.getApplicationId() == null;
        }

        if (this.getRegion() != null) {
            result = result && that.getRegion().equals(this.getRegion());
        } else {
            result = result && that.getRegion() == null;
        }

        if (this.getCountry() != null) {
            result = result && that.getCountry().equals(this.getCountry());
        } else {
            result = result && that.getCountry() == null;
        }

        if (this.getProvider() != null) {
            result = result && that.getProvider().equals(this.getProvider());
        } else {
            result = result && that.getProvider() == null;
        }
        if (this.getCampaignId() != null) {
            result = result && that.getCampaignId().equals(this.getCampaignId());
        } else {
            result = result && that.getCampaignId() == null;
        }
        if (this.getCapabilities() != null) {
            result = result && that.getCapabilities().equals(this.getCapabilities());
        } else {
            result = result && that.getCapabilities() == null;
        }

        return result;
    }
}
