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
 * An SMS has been received by the platform and is being delivered to the smsUrl of the customer application that is associated with the destination number. A PerCL response will be ignored.
 */
@ApiModel(description = "An SMS has been received by the platform and is being delivered to the smsUrl of the customer application that is associated with the destination number. A PerCL response will be ignored.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessageDeliveryWebhook extends Webhook {
  public static MessageDeliveryWebhook deserialize(String payload) {
    return (MessageDeliveryWebhook)(new JSON().getGson().fromJson(payload, Webhook.class));
  }
  public static String getDiscriminatorValue() {
    return "messageDelivery";
  }
  
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  
  
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  
  protected String requestType;

  
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  
  
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  
  private String accountId;

  
  public static final String SERIALIZED_NAME_FROM = "from";
  
  
  @SerializedName(SERIALIZED_NAME_FROM)
  
  private String from;

  
  public static final String SERIALIZED_NAME_TO = "to";
  
  
  @SerializedName(SERIALIZED_NAME_TO)
  
  private String to;

  
  public static final String SERIALIZED_NAME_TEXT = "text";
  
  
  @SerializedName(SERIALIZED_NAME_TEXT)
  
  private String text;

  
  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  
  
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  
  private String direction;

  
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  
  
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  
  private String applicationId;

  
  public static final String SERIALIZED_NAME_STATUS = "status";
  
  
  @SerializedName(SERIALIZED_NAME_STATUS)
  
  private String status;

  
  public static final String SERIALIZED_NAME_PHONE_NUMBER_ID = "phoneNumberId";
  
  
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_ID)
  
  private String phoneNumberId;

  
  public static final String SERIALIZED_NAME_URI = "uri";
  
  
  @SerializedName(SERIALIZED_NAME_URI)
  
  private String uri;


  public MessageDeliveryWebhook() { 
    this.requestType = this.getClass().getSimpleName();
  }

  public MessageDeliveryWebhook requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Value will be messageDelivery - An SMS message has been received by the platform and is being delivered to the customer application associated with the destination number.
   * @return requestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value will be messageDelivery - An SMS message has been received by the platform and is being delivered to the customer application associated with the destination number.")

  public String getRequestType() {
    return requestType;
  }


  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public MessageDeliveryWebhook accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account ID associated with your account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account ID associated with your account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public MessageDeliveryWebhook from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Phone number of the party that initiated the Call (in E.164 format).
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number of the party that initiated the Call (in E.164 format).")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public MessageDeliveryWebhook to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Phone number provisioned to you and to which this Call is directed (in E.164 format).
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number provisioned to you and to which this Call is directed (in E.164 format).")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public MessageDeliveryWebhook text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Body of the SMS message.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Body of the SMS message.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public MessageDeliveryWebhook direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Value will be inbound to indicate the receipt of a message into the FreeClimb platform.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value will be inbound to indicate the receipt of a message into the FreeClimb platform.")

  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }


  public MessageDeliveryWebhook applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * ID of the application to which the destination number is assigned.
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the application to which the destination number is assigned.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public MessageDeliveryWebhook status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Value will be received to indicate that the platform has successfully received the incoming message.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value will be received to indicate that the platform has successfully received the incoming message.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public MessageDeliveryWebhook phoneNumberId(String phoneNumberId) {
    
    this.phoneNumberId = phoneNumberId;
    return this;
  }

   /**
   * ID of the destination phone number.
   * @return phoneNumberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the destination phone number.")

  public String getPhoneNumberId() {
    return phoneNumberId;
  }


  public void setPhoneNumberId(String phoneNumberId) {
    this.phoneNumberId = phoneNumberId;
  }


  public MessageDeliveryWebhook uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI for this resource, relative to the API base URL
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI for this resource, relative to the API base URL")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeliveryWebhook messageDeliveryWebhook = (MessageDeliveryWebhook) o;
    return Objects.equals(this.requestType, messageDeliveryWebhook.requestType) &&
        Objects.equals(this.accountId, messageDeliveryWebhook.accountId) &&
        Objects.equals(this.from, messageDeliveryWebhook.from) &&
        Objects.equals(this.to, messageDeliveryWebhook.to) &&
        Objects.equals(this.text, messageDeliveryWebhook.text) &&
        Objects.equals(this.direction, messageDeliveryWebhook.direction) &&
        Objects.equals(this.applicationId, messageDeliveryWebhook.applicationId) &&
        Objects.equals(this.status, messageDeliveryWebhook.status) &&
        Objects.equals(this.phoneNumberId, messageDeliveryWebhook.phoneNumberId) &&
        Objects.equals(this.uri, messageDeliveryWebhook.uri) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, accountId, from, to, text, direction, applicationId, status, phoneNumberId, uri, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeliveryWebhook {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    phoneNumberId: ").append(toIndentedString(phoneNumberId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
