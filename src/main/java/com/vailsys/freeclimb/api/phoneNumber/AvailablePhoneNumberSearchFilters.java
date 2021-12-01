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
     * Indication of whether the phone number can handle sending and receiving SMS messages.
     */
    private boolean smsEnabled;
    /**
     * Indicates whether the phone number can handle calls.
     */
    private boolean voiceEnabled;

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
        this.country = country
    }

    /**
     * Retrieve the value of the region filter.
     * 
     * @return the region filter value
     */
    public String getRegion() {
        return region
    }

    /**
     * Set the region filter for available phone numbers.
     * 
     * @param region The value of region to set
     */
    public void setRegion(String region) {
        this.region = region
    }

    /**
     * Retrieve the value of the smsEnabled filter
     * 
     * @return the smsEnabled filter value
     */
    public boolean getSmsEnabled() {
        return smsEnabled
    }

    /**
     * Set the smsEnabled filter for available phone numbers.
     * 
     * @param smsEnabled The value of smsEnabled to set
     */
    public void setSmsEnabled(boolean smsEnabled) {
        this.smsEnabled = smsEnabled
    }

    /**
     * Retrieve the value of the voiceEnabled filter
     * 
     * @return the voiceEnabled filter value
     */
    public boolean getVoiceEnabled() {
        return voiceEnabled
    }

    /**
     * Set the voiceEnabled filter for available phone numbers.
     * 
     * @param voiceEnabled The value of voiceEnabled to set
     */
    public void setVoiceEnabled(boolean voiceEnabled) {
        this.voiceEnabled = voiceEnabled
    }
}
