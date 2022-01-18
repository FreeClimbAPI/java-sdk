package com.vailsys.freeclimb.api.phoneNumber;

import com.google.gson.JsonSyntaxException;
import com.vailsys.freeclimb.api.FreeClimbJSONException;

import static com.vailsys.freeclimb.json.FreeClimbGson.gson;

/**
 * This class represents a FreeClimb AvailablePhoneNumber instance.
 * AvailablePhoneNumber objects are created by the SDK whenever an
 * availablephonenumber instance would be returned by the API; these primarily
 * come from a
 * {@link com.vailsys.freeclimb.api.phoneNumber.AvailablePhoneNumberRequester}
 * inside a {@link com.vailsys.freeclimb.api.FreeClimbClient} instance.<br>
 * <br>
 * AvailablePhoneNumbers are immutable and intended only to be used to read
 * information returned from the API in a language accessible way.
 *
 * @see com.vailsys.freeclimb.api.phoneNumber.AvailablePhoneNumberRequester
 * @see com.vailsys.freeclimb.api.FreeClimbClient
 */
public class AvailablePhoneNumber extends PhoneNumber {
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
     * The region of this phone number.
     */
    private String region;
    /**
     * The country of this phone number.
     */
    private String country;

    /**
     * Converts the provided JSON string into an AvailablePhoneNumber object.
     *
     * @param json A JSON string representing an AvailablePhoneNumber instance.
     * @return An AvailablePhoneNumber object equivalent to the JSON string passed
     *         in.
     * @throws FreeClimbJSONException when the JSON is not valid.
     */
    public static AvailablePhoneNumber fromJson(String json) throws FreeClimbJSONException {
        try {
            return gson.fromJson(json, AvailablePhoneNumber.class);
        } catch (JsonSyntaxException jse) {
            throw new FreeClimbJSONException(jse);
        }
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
     * Retrieve the region of the phone number.
     *
     * @return The region of this AvailablePhoneNumber.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Retrieve the country of the phone number.
     *
     * @return The country of this AvailablePhoneNumber.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Check if this AvailablePhoneNumber equals another. This is done by comparing
     * all fields in the AvailablePhoneNumber for equality.
     *
     * @param that The AvailablePhoneNumber object for comparison.
     * @return {@code true} if available phone numbers are equals, {@code false}
     *         otherwise.
     */
    public boolean equals(AvailablePhoneNumber that) {
        boolean result = super.equals(that);
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

        return result;
    }
}
