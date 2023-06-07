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

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * SMSTenDLCPartnerCampaignBrand
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SMSTenDLCPartnerCampaignBrand {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_OPTIONAL_ATTRIBUTES = "optionalAttributes";
  @SerializedName(SERIALIZED_NAME_OPTIONAL_ATTRIBUTES)
  private Map<String, Object> optionalAttributes = null;

  public static final String SERIALIZED_NAME_EVP_VETTING_SCORE = "evpVettingScore";
  @SerializedName(SERIALIZED_NAME_EVP_VETTING_SCORE)
  private Integer evpVettingScore;

  public SMSTenDLCPartnerCampaignBrand() {
  }

  public SMSTenDLCPartnerCampaignBrand(
      String brandId) {
    this();
    this.brandId = brandId;
  }

  public SMSTenDLCPartnerCampaignBrand accountId(String accountId) {

    this.accountId = accountId;
    return this;
  }

  /**
   * ID of the account that created this Queue.
   * 
   * @return accountId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the account that created this Queue.")

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Unique identifier assigned to the brand by the registry.
   * 
   * @return brandId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier assigned to the brand by the registry.")

  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public SMSTenDLCPartnerCampaignBrand firstName(String firstName) {

    this.firstName = firstName;
    return this;
  }

  /**
   * First or given name.
   * 
   * @return firstName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "First or given name. ")

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SMSTenDLCPartnerCampaignBrand lastName(String lastName) {

    this.lastName = lastName;
    return this;
  }

  /**
   * Last or Surname.
   * 
   * @return lastName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "Last or Surname.")

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public SMSTenDLCPartnerCampaignBrand displayName(String displayName) {

    this.displayName = displayName;
    return this;
  }

  /**
   * Display or marketing name of the brand.
   * 
   * @return displayName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABC Mobile", value = "Display or marketing name of the brand.")

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SMSTenDLCPartnerCampaignBrand companyName(String companyName) {

    this.companyName = companyName;
    return this;
  }

  /**
   * (Required for Non-profit/private/public) Legal company name.
   * 
   * @return companyName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABC Inc.", value = "(Required for Non-profit/private/public) Legal company name.")

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public SMSTenDLCPartnerCampaignBrand phone(String phone) {

    this.phone = phone;
    return this;
  }

  /**
   * Valid phone number in e.164 international format.
   * 
   * @return phone
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+12024567890", required = true, value = "Valid phone number in e.164 international format.")

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public SMSTenDLCPartnerCampaignBrand email(String email) {

    this.email = email;
    return this;
  }

  /**
   * Valid email address of brand support contact.
   * 
   * @return email
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Valid email address of brand support contact.")

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SMSTenDLCPartnerCampaignBrand website(String website) {

    this.website = website;
    return this;
  }

  /**
   * Brand website URL.
   * 
   * @return website
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.abcmobile.com", value = "Brand website URL.")

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public SMSTenDLCPartnerCampaignBrand optionalAttributes(Map<String, Object> optionalAttributes) {

    this.optionalAttributes = optionalAttributes;
    return this;
  }

  public SMSTenDLCPartnerCampaignBrand putOptionalAttributesItem(String key, Object optionalAttributesItem) {
    if (this.optionalAttributes == null) {
      this.optionalAttributes = new HashMap<String, Object>();
    }
    this.optionalAttributes.put(key, optionalAttributesItem);
    return this;
  }

  /**
   * Optional brand attributes. Please refer to GET /enum/optionalAttributeNames
   * for dictionary of optional attribute names.
   * 
   * @return optionalAttributes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional brand attributes. Please refer to GET /enum/optionalAttributeNames for dictionary of optional attribute names.")

  public Map<String, Object> getOptionalAttributes() {
    return optionalAttributes;
  }

  public void setOptionalAttributes(Map<String, Object> optionalAttributes) {
    this.optionalAttributes = optionalAttributes;
  }

  public SMSTenDLCPartnerCampaignBrand evpVettingScore(Integer evpVettingScore) {

    this.evpVettingScore = evpVettingScore;
    return this;
  }

  /**
   * External vetting score.
   * 
   * @return evpVettingScore
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External vetting score.")

  public Integer getEvpVettingScore() {
    return evpVettingScore;
  }

  public void setEvpVettingScore(Integer evpVettingScore) {
    this.evpVettingScore = evpVettingScore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSTenDLCPartnerCampaignBrand smSTenDLCPartnerCampaignBrand = (SMSTenDLCPartnerCampaignBrand) o;
    return Objects.equals(this.accountId, smSTenDLCPartnerCampaignBrand.accountId) &&
        Objects.equals(this.brandId, smSTenDLCPartnerCampaignBrand.brandId) &&
        Objects.equals(this.firstName, smSTenDLCPartnerCampaignBrand.firstName) &&
        Objects.equals(this.lastName, smSTenDLCPartnerCampaignBrand.lastName) &&
        Objects.equals(this.displayName, smSTenDLCPartnerCampaignBrand.displayName) &&
        Objects.equals(this.companyName, smSTenDLCPartnerCampaignBrand.companyName) &&
        Objects.equals(this.phone, smSTenDLCPartnerCampaignBrand.phone) &&
        Objects.equals(this.email, smSTenDLCPartnerCampaignBrand.email) &&
        Objects.equals(this.website, smSTenDLCPartnerCampaignBrand.website) &&
        Objects.equals(this.optionalAttributes, smSTenDLCPartnerCampaignBrand.optionalAttributes) &&
        Objects.equals(this.evpVettingScore, smSTenDLCPartnerCampaignBrand.evpVettingScore);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, brandId, firstName, lastName, displayName, companyName, phone, email, website,
        optionalAttributes, evpVettingScore);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSTenDLCPartnerCampaignBrand {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    optionalAttributes: ").append(toIndentedString(optionalAttributes)).append("\n");
    sb.append("    evpVettingScore: ").append(toIndentedString(evpVettingScore)).append("\n");
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
