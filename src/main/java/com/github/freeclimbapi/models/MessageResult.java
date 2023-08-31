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
 * MessageResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessageResult {
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

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MessageStatus status;

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

  public static final String SERIALIZED_NAME_NOTIFICATION_URL = "notificationUrl";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_URL)
  private String notificationUrl;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_SEGMENT_COUNT = "segmentCount";
  @SerializedName(SERIALIZED_NAME_SEGMENT_COUNT)
  private BigDecimal segmentCount;

  public MessageResult() { 
  }

  public MessageResult uri(String uri) {
    
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


  public MessageResult dateCreated(String dateCreated) {
    
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


  public MessageResult dateUpdated(String dateUpdated) {
    
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


  public MessageResult revision(Integer revision) {
    
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


  public MessageResult accountId(String accountId) {
    
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


  public MessageResult messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * String that uniquely identifies this message resource
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String that uniquely identifies this message resource")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public MessageResult status(MessageStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MessageStatus getStatus() {
    return status;
  }


  public void setStatus(MessageStatus status) {
    this.status = status;
  }


  public MessageResult from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Phone number in E.164 format that sent the message.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number in E.164 format that sent the message.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public MessageResult to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Phone number in E.164 format that received the message.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number in E.164 format that received the message.")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public MessageResult text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Message contents
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message contents")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public MessageResult direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Noting whether the message was inbound or outbound
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Noting whether the message was inbound or outbound")

  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }


  public MessageResult notificationUrl(String notificationUrl) {
    
    this.notificationUrl = notificationUrl;
    return this;
  }

   /**
   * URL invoked when message sent
   * @return notificationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL invoked when message sent")

  public String getNotificationUrl() {
    return notificationUrl;
  }


  public void setNotificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
  }


  public MessageResult brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * The unique identifier for the brand associated with the message
   * @return brandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the brand associated with the message")

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public MessageResult campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The unique identifier for the campaign associated with the message
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the campaign associated with the message")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public MessageResult segmentCount(BigDecimal segmentCount) {
    
    this.segmentCount = segmentCount;
    return this;
  }

   /**
   * The number of segments into which the message was split
   * @return segmentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of segments into which the message was split")

  public BigDecimal getSegmentCount() {
    return segmentCount;
  }


  public void setSegmentCount(BigDecimal segmentCount) {
    this.segmentCount = segmentCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResult messageResult = (MessageResult) o;
    return Objects.equals(this.uri, messageResult.uri) &&
        Objects.equals(this.dateCreated, messageResult.dateCreated) &&
        Objects.equals(this.dateUpdated, messageResult.dateUpdated) &&
        Objects.equals(this.revision, messageResult.revision) &&
        Objects.equals(this.accountId, messageResult.accountId) &&
        Objects.equals(this.messageId, messageResult.messageId) &&
        Objects.equals(this.status, messageResult.status) &&
        Objects.equals(this.from, messageResult.from) &&
        Objects.equals(this.to, messageResult.to) &&
        Objects.equals(this.text, messageResult.text) &&
        Objects.equals(this.direction, messageResult.direction) &&
        Objects.equals(this.notificationUrl, messageResult.notificationUrl) &&
        Objects.equals(this.brandId, messageResult.brandId) &&
        Objects.equals(this.campaignId, messageResult.campaignId) &&
        Objects.equals(this.segmentCount, messageResult.segmentCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, dateCreated, dateUpdated, revision, accountId, messageId, status, from, to, text, direction, notificationUrl, brandId, campaignId, segmentCount);
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
    sb.append("class MessageResult {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    segmentCount: ").append(toIndentedString(segmentCount)).append("\n");
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

