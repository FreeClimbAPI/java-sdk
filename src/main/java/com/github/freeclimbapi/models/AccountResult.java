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

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * AccountResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountResult {
  public static String getDiscriminatorValue() {
    return null;
  }
  
  public static final String SERIALIZED_NAME_URI = "uri";
  
  
  @SerializedName(SERIALIZED_NAME_URI)
  
  private String uri;

  
  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  
  
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  
  private String dateCreated;

  
  public static final String SERIALIZED_NAME_DATE_UPDATED = "dateUpdated";
  
  
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  
  private String dateUpdated;

  
  public static final String SERIALIZED_NAME_REVISION = "revision";
  
  
  @SerializedName(SERIALIZED_NAME_REVISION)
  
  private Integer revision;

  
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  
  
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  
  private String accountId;

  
  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  
  
  @SerializedName(SERIALIZED_NAME_API_KEY)
  
  private String apiKey;

  
  public static final String SERIALIZED_NAME_ALIAS = "alias";
  
  
  @SerializedName(SERIALIZED_NAME_ALIAS)
  
  private String alias;

  
  public static final String SERIALIZED_NAME_LABEL = "label";
  
  
  @SerializedName(SERIALIZED_NAME_LABEL)
  
  private String label;

  
  public static final String SERIALIZED_NAME_TYPE = "type";
  
  
  @SerializedName(SERIALIZED_NAME_TYPE)
  
  private AccountType type;

  
  public static final String SERIALIZED_NAME_STATUS = "status";
  
  
  @SerializedName(SERIALIZED_NAME_STATUS)
  
  private AccountStatus status;

  
  public static final String SERIALIZED_NAME_SUBRESOURCE_URIS = "subresourceUris";
  
  
  @SerializedName(SERIALIZED_NAME_SUBRESOURCE_URIS)
  
  private Object subresourceUris;


  public AccountResult() { 
  }

  public AccountResult uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI for this resource, relative to /apiserver.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI for this resource, relative to /apiserver.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public AccountResult dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public AccountResult dateUpdated(String dateUpdated) {
    
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).
   * @return dateUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).")

  public String getDateUpdated() {
    return dateUpdated;
  }


  public void setDateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  public AccountResult revision(Integer revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated.
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated.")

  public Integer getRevision() {
    return revision;
  }


  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  public AccountResult accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * String that uniquely identifies this account resource.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String that uniquely identifies this account resource.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AccountResult apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The API key assigned to this account. This key must be kept a secret by the customer.
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API key assigned to this account. This key must be kept a secret by the customer.")

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public AccountResult alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * A description for this account.
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for this account.")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public AccountResult label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * A string that identifies a category or group to which the account belongs.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string that identifies a category or group to which the account belongs.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public AccountResult type(AccountType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountType getType() {
    return type;
  }


  public void setType(AccountType type) {
    this.type = type;
  }


  public AccountResult status(AccountStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountStatus getStatus() {
    return status;
  }


  public void setStatus(AccountStatus status) {
    this.status = status;
  }


  public AccountResult subresourceUris(Object subresourceUris) {
    
    this.subresourceUris = subresourceUris;
    return this;
  }

   /**
   * The list of subresources for this account.
   * @return subresourceUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of subresources for this account.")

  public Object getSubresourceUris() {
    return subresourceUris;
  }


  public void setSubresourceUris(Object subresourceUris) {
    this.subresourceUris = subresourceUris;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountResult accountResult = (AccountResult) o;
    return Objects.equals(this.uri, accountResult.uri) &&
        Objects.equals(this.dateCreated, accountResult.dateCreated) &&
        Objects.equals(this.dateUpdated, accountResult.dateUpdated) &&
        Objects.equals(this.revision, accountResult.revision) &&
        Objects.equals(this.accountId, accountResult.accountId) &&
        Objects.equals(this.apiKey, accountResult.apiKey) &&
        Objects.equals(this.alias, accountResult.alias) &&
        Objects.equals(this.label, accountResult.label) &&
        Objects.equals(this.type, accountResult.type) &&
        Objects.equals(this.status, accountResult.status) &&
        Objects.equals(this.subresourceUris, accountResult.subresourceUris);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, dateCreated, dateUpdated, revision, accountId, apiKey, alias, label, type, status, subresourceUris);
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
    sb.append("class AccountResult {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subresourceUris: ").append(toIndentedString(subresourceUris)).append("\n");
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
