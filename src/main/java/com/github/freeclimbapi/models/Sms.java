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
 * The &#x60;Sms&#x60; command can be used to send an SMS message to a phone number during a phone call. International SMS is disabled by default.
 */
@ApiModel(description = "The `Sms` command can be used to send an SMS message to a phone number during a phone call. International SMS is disabled by default.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Sms extends PerclCommand {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_NOTIFICATION_URL = "notificationUrl";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_URL)
  private String notificationUrl;

  public Sms() { 
    this.command = this.getClass().getSimpleName();
  }

  public Sms to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * E.164 representation of the phone number to which the message will be sent. Must be within FreeClimb&#39;s service area and E.164 formatting (e.g., +18003608245).
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "E.164 representation of the phone number to which the message will be sent. Must be within FreeClimb's service area and E.164 formatting (e.g., +18003608245).")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public Sms from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * E.164 representation of the phone number to use as the sender. This must be an incoming phone number you have purchased from FreeClimb.
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "E.164 representation of the phone number to use as the sender. This must be an incoming phone number you have purchased from FreeClimb.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public Sms text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Text contained in the message (maximum 160 characters).
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Text contained in the message (maximum 160 characters).")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Sms notificationUrl(String notificationUrl) {
    
    this.notificationUrl = notificationUrl;
    return this;
  }

   /**
   * When the message changes status, this URL will be invoked using HTTP POST with the messageStatus parameters. This is a notification only; any PerCL returned will be ignored.
   * @return notificationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the message changes status, this URL will be invoked using HTTP POST with the messageStatus parameters. This is a notification only; any PerCL returned will be ignored.")

  public String getNotificationUrl() {
    return notificationUrl;
  }


  public void setNotificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sms sms = (Sms) o;
    return Objects.equals(this.to, sms.to) &&
        Objects.equals(this.from, sms.from) &&
        Objects.equals(this.text, sms.text) &&
        Objects.equals(this.notificationUrl, sms.notificationUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, text, notificationUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sms {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    attributes.put("to", () -> this.getTo());
    attributes.put("from", () -> this.getFrom());
    attributes.put("text", () -> this.getText());
    attributes.put("notificationUrl", () -> this.getNotificationUrl());
    return attributes;
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
