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
 * SendDigitsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SendDigitsAllOf {
  public static final String SERIALIZED_NAME_DIGITS = "digits";
  @SerializedName(SERIALIZED_NAME_DIGITS)
  private String digits;

  public static final String SERIALIZED_NAME_PAUSE_MS = "pauseMs";
  @SerializedName(SERIALIZED_NAME_PAUSE_MS)
  private Integer pauseMs;

  public static final String SERIALIZED_NAME_PRIVACY_MODE = "privacyMode";
  @SerializedName(SERIALIZED_NAME_PRIVACY_MODE)
  private Boolean privacyMode;

  public SendDigitsAllOf() { 
  }

  public SendDigitsAllOf digits(String digits) {
    
    this.digits = digits;
    return this;
  }

   /**
   * String containing the digits to be played. The string cannot be empty and can include any digit, plus &#x60;#&#x60;, or &#x60;*&#x60;, and allows embedding specification for delay or pause between the output of individual digits.
   * @return digits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "String containing the digits to be played. The string cannot be empty and can include any digit, plus `#`, or `*`, and allows embedding specification for delay or pause between the output of individual digits.")

  public String getDigits() {
    return digits;
  }


  public void setDigits(String digits) {
    this.digits = digits;
  }


  public SendDigitsAllOf pauseMs(Integer pauseMs) {
    
    this.pauseMs = pauseMs;
    return this;
  }

   /**
   * Pause between digits in milliseconds. Valid values are 100-1000 milliseconds and will be adjusted by FreeClimb to satisfy the constraint.
   * @return pauseMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pause between digits in milliseconds. Valid values are 100-1000 milliseconds and will be adjusted by FreeClimb to satisfy the constraint.")

  public Integer getPauseMs() {
    return pauseMs;
  }


  public void setPauseMs(Integer pauseMs) {
    this.pauseMs = pauseMs;
  }


  public SendDigitsAllOf privacyMode(Boolean privacyMode) {
    
    this.privacyMode = privacyMode;
    return this;
  }

   /**
   * Parameter &#x60;privacyMode&#x60; will not log the &#x60;text&#x60; as required by PCI compliance.
   * @return privacyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameter `privacyMode` will not log the `text` as required by PCI compliance.")

  public Boolean getPrivacyMode() {
    return privacyMode;
  }


  public void setPrivacyMode(Boolean privacyMode) {
    this.privacyMode = privacyMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendDigitsAllOf sendDigitsAllOf = (SendDigitsAllOf) o;
    return Objects.equals(this.digits, sendDigitsAllOf.digits) &&
        Objects.equals(this.pauseMs, sendDigitsAllOf.pauseMs) &&
        Objects.equals(this.privacyMode, sendDigitsAllOf.privacyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digits, pauseMs, privacyMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendDigitsAllOf {\n");
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
    sb.append("    pauseMs: ").append(toIndentedString(pauseMs)).append("\n");
    sb.append("    privacyMode: ").append(toIndentedString(privacyMode)).append("\n");
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

