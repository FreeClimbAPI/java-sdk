package com.vailsys.freeclimb.api.phoneNumber;

import com.vailsys.freeclimb.api.Filters;

/**
 * Represents the possible fields one can set as filters when searching for
 * incoming phone numbers.
 */
public class IncomingPhoneNumberSearchFilters extends Filters {
    /**
     * A PCRE compatible regular expression to match against the phone numbers of
     * the incoming phone number list.
     *
     */
    private String phoneNumber;
    /**
     * The alias of the incoming phone number.
     */
    private String alias;
    /**
     * ID of the application that FreeClimb should contact if a Call of SMS arrives for this phone number or a Call from this number is placed.
     */
    private String applicationId;
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
     * Indicates whether the phone number is associated with an application.
     */
    private boolean hasApplication;

    /**
     * Retrieve the value of the phone number filter.
     * 
     * @return The phone number to filter by.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the phone number filter for incoming phone numbers.
     * 
     * @param phoneNumber The phone number to filter by.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieve the value of the alias filter.
     * 
     * @return The alias of the filter.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Set the alias filter for incoming phone numbers.
     * 
     * @param alias The alias to filter by.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Retrieve the value of the applicationId filter.
     * 
     * @return The value of the applicationId filter.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Set the applicationId filter for incoming phone numbers.
     * 
     * @param applicationId The applicationId to filter by.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Retrieve the value of the country filter.
     * 
     * @return The value of the country filter.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set the country filter for incoming phone numbers.
     * 
     * @param country The country to filter by.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Retrieve the value of the region filter.
     * 
     * @return The value of the region filter.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Set the region filter for incoming phone numbers.
     * 
     * @param region The region to filter by.
     */
    public void setRegion(String region) {
        this.region = region;
    }
    /**
     * Retrieve the value of the smsEnabled filter.
     * 
     * @return The value of the smsEnabled filter.
     */
    public boolean getSmsEnabled() {
        return smsEnabled;
    }

    /**
     * Set the smsEnabled filter for incoming phone numbers.
     * 
     * @param smsEnabled The value of smsEnabled to filter by.
     */
    public void setSmsEnabled(boolean smsEnabled) {
        this.smsEnabled = smsEnabled;
    }

    /**
     * Retrieve the value of the voiceEnabled filter.
     * 
     * @return The value of the voiceEnabled filter.
     */
    public boolean getVoiceEnabled() {
        return voiceEnabled;
    }

    /**
     * Set the voiceEnabled filter for incoming phone numbers.
     * 
     * @param voiceEnabled The value of voiceEnabled to filter by.
     */
    public void setVoiceEnabled(boolean voiceEnabled) {
        this.voiceEnabled = voiceEnabled;
    }

    /**
     * Retrieve the value of the hasApplication filter.
     * 
     * @return The value of the hasApplication filter.
     */
    public boolean getHasApplication() {
        return hasApplication;
    }

    /**
     * Set the hasApplication filter for incoming phone numbers.
     * 
     * @param hasApplication The value of hasApplication to filter by.
     */
    public void setHasApplication(boolean hasApplication) {
        this.hasApplication = hasApplication;
    }
}
