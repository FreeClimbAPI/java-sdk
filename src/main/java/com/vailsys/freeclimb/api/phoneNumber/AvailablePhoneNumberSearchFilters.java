package com.vailsys.freeclimb.api.phoneNumber;

import com.vailsys.freeclimb.api.Filters;

/**
 * Represents the possible fields one can set as filters when searching for
 * available phone numbers.
 */
public class AvailablePhoneNumberSearchFilters extends Filters {
    /**
     * A regular expression to filter the phone numbers available.
     */
    private String phoneNumber;
    /**
     * Country of this phone number.
     */
    private String country;
    /**
     * State or province of this phone number.
     */
    private String region;
    /**
     * Campaign ID of the this phone number.
     */
    private String campaignId;
    /**
     * Provider of this phone number.
     */
    private String provider;
    /**
     * Capabilities of this phone number.
     */
    private PhoneNumberCapabilities capabilities;
    /**
     * Alias of this phone number.
     */
    private String alias;


    /**
     * Retrieve the value of the phoneNumber filter.
     * 
     * @return The phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the phoneNumber filter for available phone numbers that match the
     * expression.
     * 
     * @param phoneNumber The phone number to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retreive the value of the country filter.
     *
     * @return the country filter value
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set the country filter for available phone numbers.
     *
     * @param country The value of country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Retrieve the value of the region filter.
     * 
     * @return the region filter value
     */
    public String getRegion() {
        return region;
    }

    /**
     * Set the region filter for available phone numbers.
     * 
     * @param region The value of region to set
     */
    public void setRegion(String region) {
        this.region = region;
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
     * Set the capabilities filter for available phone numbers.
     * 
     * @param capabilities The value of capabilities to set
     */
    public void setCapabilities(PhoneNumberCapabilities capabilities) {
        this.capabilities = capabilities;
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
     * Set the campaignId filter for available phone numbers.
     * 
     * @param campaignId The value of campaignId to set
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
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
     * Set the provider filter for available phone numbers.
     * 
     * @param provider The value of provider to set
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * Retrieve the alias of the phone number.
     * 
     * @return The alias of this AvailablePhoneNumber.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Set the alias filter for available phone numbers.
     * 
     * @param alias The value of alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
}
