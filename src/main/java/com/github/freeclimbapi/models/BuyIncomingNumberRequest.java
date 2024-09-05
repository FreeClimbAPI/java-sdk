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
 * BuyIncomingNumberRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BuyIncomingNumberRequest {
  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public BuyIncomingNumberRequest() { 
  }

  public BuyIncomingNumberRequest phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number to purchase in E.164 format (as returned in the list of Available Phone Numbers).
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Phone number to purchase in E.164 format (as returned in the list of Available Phone Numbers).")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public BuyIncomingNumberRequest alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Description for this new incoming phone number (max 64 characters).
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description for this new incoming phone number (max 64 characters).")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public BuyIncomingNumberRequest applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * ID of the application that should handle phone calls to the number.
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the application that should handle phone calls to the number.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyIncomingNumberRequest buyIncomingNumberRequest = (BuyIncomingNumberRequest) o;
    return Objects.equals(this.phoneNumber, buyIncomingNumberRequest.phoneNumber) &&
        Objects.equals(this.alias, buyIncomingNumberRequest.alias) &&
        Objects.equals(this.applicationId, buyIncomingNumberRequest.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, alias, applicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyIncomingNumberRequest {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

