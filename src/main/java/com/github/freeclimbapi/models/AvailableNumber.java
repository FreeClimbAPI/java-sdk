/*
 * FreeClimb API
 * FreeClimb is a cloud-based application programming interface (API) that puts the power of the Vail platform in your hands. FreeClimb simplifies the process of creating applications that can use a full range of telephony features without requiring specialized or on-site telephony equipment. Using the FreeClimb REST API to write applications is easy! You have the option to use the language of your choice or hit the API directly. Your application can execute a command by issuing a RESTful request to the FreeClimb API. The base URL to send HTTP requests to the FreeClimb REST API is: /apiserver. FreeClimb authenticates and processes your request.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@freeclimb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.freeclimbapi.models;

import java.util.Objects;
import java.util.Arrays;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import java.io.IOException;
import java.util.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.math.BigDecimal;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.utils.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * AvailableNumber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AvailableNumber {
  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private Capabilities capabilities;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_VOICE_ENABLED = "voiceEnabled";
  @SerializedName(SERIALIZED_NAME_VOICE_ENABLED)
  private Boolean voiceEnabled;

  public static final String SERIALIZED_NAME_SMS_ENABLED = "smsEnabled";
  @SerializedName(SERIALIZED_NAME_SMS_ENABLED)
  private Boolean smsEnabled;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public AvailableNumber() { 
  }

  public AvailableNumber capabilities(Capabilities capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Capabilities getCapabilities() {
    return capabilities;
  }


  public void setCapabilities(Capabilities capabilities) {
    this.capabilities = capabilities;
  }


  public AvailableNumber campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The campaign ID generated by the campaign registry
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The campaign ID generated by the campaign registry")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public AvailableNumber phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number, in E.164 format (+ country code and phone number: +18003608245).
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number, in E.164 format (+ country code and phone number: +18003608245).")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public AvailableNumber voiceEnabled(Boolean voiceEnabled) {
    
    this.voiceEnabled = voiceEnabled;
    return this;
  }

   /**
   * Typically set to true for all numbers.
   * @return voiceEnabled
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typically set to true for all numbers.")

  public Boolean getVoiceEnabled() {
    return voiceEnabled;
  }


  public void setVoiceEnabled(Boolean voiceEnabled) {
    this.voiceEnabled = voiceEnabled;
  }


  public AvailableNumber smsEnabled(Boolean smsEnabled) {
    
    this.smsEnabled = smsEnabled;
    return this;
  }

   /**
   * Indicates whether the phone number can send and receive SMS messages.
   * @return smsEnabled
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the phone number can send and receive SMS messages.")

  public Boolean getSmsEnabled() {
    return smsEnabled;
  }


  public void setSmsEnabled(Boolean smsEnabled) {
    this.smsEnabled = smsEnabled;
  }


  public AvailableNumber region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The state or province of this phone number.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state or province of this phone number.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public AvailableNumber country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country of this phone number.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country of this phone number.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableNumber availableNumber = (AvailableNumber) o;
    return Objects.equals(this.capabilities, availableNumber.capabilities) &&
        Objects.equals(this.campaignId, availableNumber.campaignId) &&
        Objects.equals(this.phoneNumber, availableNumber.phoneNumber) &&
        Objects.equals(this.voiceEnabled, availableNumber.voiceEnabled) &&
        Objects.equals(this.smsEnabled, availableNumber.smsEnabled) &&
        Objects.equals(this.region, availableNumber.region) &&
        Objects.equals(this.country, availableNumber.country);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, campaignId, phoneNumber, voiceEnabled, smsEnabled, region, country);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableNumber {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    voiceEnabled: ").append(toIndentedString(voiceEnabled)).append("\n");
    sb.append("    smsEnabled: ").append(toIndentedString(smsEnabled)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }


  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

