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


package com.github.freeclimbapi;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * QueueMember
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T13:04:20.214-05:00[America/Chicago]")
public class QueueMember {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_WAIT_TIME = "waitTime";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME)
  private Integer waitTime;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_DATE_ENQUEUED = "dateEnqueued";
  @SerializedName(SERIALIZED_NAME_DATE_ENQUEUED)
  private String dateEnqueued;

  public QueueMember() { 
  }

  public QueueMember uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URI for this Queue Member resource, relative to the API base URL.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI for this Queue Member resource, relative to the API base URL.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public QueueMember callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * ID of the Call associated with this Queue Member.
   * @return callId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the Call associated with this Queue Member.")

  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public QueueMember waitTime(Integer waitTime) {
    
    this.waitTime = waitTime;
    return this;
  }

   /**
   * Number of seconds the Member has been in the queue.
   * @return waitTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of seconds the Member has been in the queue.")

  public Integer getWaitTime() {
    return waitTime;
  }


  public void setWaitTime(Integer waitTime) {
    this.waitTime = waitTime;
  }


  public QueueMember position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Member&#39;s current position in the Queue, 1 indexed.
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Member's current position in the Queue, 1 indexed.")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  public QueueMember dateEnqueued(String dateEnqueued) {
    
    this.dateEnqueued = dateEnqueued;
    return this;
  }

   /**
   * Date that the Member was enqueued (GMT), given in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).
   * @return dateEnqueued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date that the Member was enqueued (GMT), given in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT).")

  public String getDateEnqueued() {
    return dateEnqueued;
  }


  public void setDateEnqueued(String dateEnqueued) {
    this.dateEnqueued = dateEnqueued;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueMember queueMember = (QueueMember) o;
    return Objects.equals(this.uri, queueMember.uri) &&
        Objects.equals(this.callId, queueMember.callId) &&
        Objects.equals(this.waitTime, queueMember.waitTime) &&
        Objects.equals(this.position, queueMember.position) &&
        Objects.equals(this.dateEnqueued, queueMember.dateEnqueued);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, callId, waitTime, position, dateEnqueued);
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
    sb.append("class QueueMember {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    dateEnqueued: ").append(toIndentedString(dateEnqueued)).append("\n");
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

