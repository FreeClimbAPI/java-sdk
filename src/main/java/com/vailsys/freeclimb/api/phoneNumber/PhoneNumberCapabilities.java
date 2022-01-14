package com.vailsys.freeclimb.api.phoneNumber;

public class PhoneNumberCapabilities {
    /**
     * Is voice enabled for this phone number.
     */
    private Boolean voice;
    /**
     * Is sms enabled for this phone number.
     */
    private Boolean sms;
    /**
     * Is tollFree enabled for this phone number.
     */
    private Boolean tollFree;
    /**
     * Is tenDLC enabled for this phone number.
     */
    private Boolean tenDLC;
    /**
     * Is shortCode enabled for this phone number.
     */
    private Boolean shortCode;

    /**
     * Is this phone number capable of voice communication.
     *
     * @return Whether this phone number is capable of voice communication.
     */
    public Boolean voiceCapable() {
        return voice != null && voice;
    }
    /**
     * Is this phone number capable of sms communication.
     *
     * @return Whether this phone number is capable of sms communication.
     */
    public Boolean smsCapable() {
        return sms != null && sms;
    }
    /**
     * Is this phone number capable of toll-free communication.
     *
     * @return Whether this phone number is capable of toll-free communication.
     */
    public Boolean tollFreeCapable() {
        return tollFree != null && tollFree;
    }
    /**
     * Is this phone number capable of 10DLC communication.
     *
     * @return Whether this phone number is capable of 10DLC communication.
     */
    public Boolean tenDLCCapable() {
        return tenDLC != null && tenDLC;
    }
    /**
     * Is this phone number capable of short-code communication.
     *
     * @return Whether this phone number is capable of short-code communication.
     */
    public Boolean shortCodeCapable() {
        return shortCode != null && shortCode;
    }

    public boolean equals(PhoneNumberCapabilities that) {
        Boolean result = true;
        result = result && this.voiceCapable().equals(that.voiceCapable());
        result = result && this.smsCapable().equals(that.smsCapable());
        result = result && this.tollFreeCapable().equals(that.tollFreeCapable());
        result = result && this.tenDLCCapable().equals(that.tenDLCCapable());
        result = result && this.shortCodeCapable().equals(that.shortCodeCapable());
        return result;
    }
}
