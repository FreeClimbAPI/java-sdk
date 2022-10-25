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
import com.github.freeclimbapi.CallResultAllOf;
import com.github.freeclimbapi.MutableResourceModel;
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
 * CallResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T17:12:48.532-05:00[America/Chicago]")
public class CallResult {
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

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_PARENT_CALL_ID = "parentCallId";
  @SerializedName(SERIALIZED_NAME_PARENT_CALL_ID)
  private String parentCallId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_ID = "phoneNumberId";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_ID)
  private String phoneNumberId;

  /**
   * * &#x60;queued&#x60; &amp;ndash; Call is ready and waiting in line before going out. * &#x60;ringing&#x60; &amp;ndash; Call is currently ringing. * &#x60;inProgress&#x60; &amp;ndash; Call was answered and is currently in progress. * &#x60;canceled&#x60; &amp;ndash; Call was hung up while it was queued or ringing. * &#x60;completed&#x60; &amp;ndash; Call was answered and has ended normally. * &#x60;busy&#x60; &amp;ndash; Caller received a busy signal. * &#x60;failed&#x60; &amp;ndash; Call could not be completed as dialed, most likely because the phone number was non-existent. * &#x60;noAnswer&#x60; &amp;ndash; Call ended without being answered.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    QUEUED("queued"),
    
    RINGING("ringing"),
    
    IN_PROGRESS("inProgress"),
    
    CANCELED("canceled"),
    
    COMPLETED("completed"),
    
    BUSY("busy"),
    
    FAILED("failed"),
    
    NO_ANSWER("noAnswer");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_CONNECT_TIME = "connectTime";
  @SerializedName(SERIALIZED_NAME_CONNECT_TIME)
  private String connectTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_CONNECT_DURATION = "connectDuration";
  @SerializedName(SERIALIZED_NAME_CONNECT_DURATION)
  private Integer connectDuration;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private String direction;

  public static final String SERIALIZED_NAME_ANSWERED_BY = "answeredBy";
  @SerializedName(SERIALIZED_NAME_ANSWERED_BY)
  private String answeredBy;

  public static final String SERIALIZED_NAME_SUBRESOURCE_URIS = "subresourceUris";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCE_URIS)
  private Object subresourceUris;

  public CallResult() { 
  }

  public CallResult uri(String uri) {
    
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


  public CallResult dateCreated(String dateCreated) {
    
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


  public CallResult dateUpdated(String dateUpdated) {
    
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


  public CallResult revision(Integer revision) {
    
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


  public CallResult callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * String that uniquely identifies this Call resource.
   * @return callId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String that uniquely identifies this Call resource.")

  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public CallResult parentCallId(String parentCallId) {
    
    this.parentCallId = parentCallId;
    return this;
  }

   /**
   * ID of the Call that created this leg (child Call).
   * @return parentCallId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the Call that created this leg (child Call).")

  public String getParentCallId() {
    return parentCallId;
  }


  public void setParentCallId(String parentCallId) {
    this.parentCallId = parentCallId;
  }


  public CallResult accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * ID of the account that owns this Call.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the account that owns this Call.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public CallResult from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Phone number that initiated this Call.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number that initiated this Call.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public CallResult to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Phone number that received this Call.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number that received this Call.")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public CallResult phoneNumberId(String phoneNumberId) {
    
    this.phoneNumberId = phoneNumberId;
    return this;
  }

   /**
   * If the Call was inbound, this is the ID of the IncomingPhoneNumber that received the Call (DNIS). If the Call was outbound, this is the ID of the phone number from which the Call was placed (ANI).
   * @return phoneNumberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the Call was inbound, this is the ID of the IncomingPhoneNumber that received the Call (DNIS). If the Call was outbound, this is the ID of the phone number from which the Call was placed (ANI).")

  public String getPhoneNumberId() {
    return phoneNumberId;
  }


  public void setPhoneNumberId(String phoneNumberId) {
    this.phoneNumberId = phoneNumberId;
  }


  public CallResult status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * * &#x60;queued&#x60; &amp;ndash; Call is ready and waiting in line before going out. * &#x60;ringing&#x60; &amp;ndash; Call is currently ringing. * &#x60;inProgress&#x60; &amp;ndash; Call was answered and is currently in progress. * &#x60;canceled&#x60; &amp;ndash; Call was hung up while it was queued or ringing. * &#x60;completed&#x60; &amp;ndash; Call was answered and has ended normally. * &#x60;busy&#x60; &amp;ndash; Caller received a busy signal. * &#x60;failed&#x60; &amp;ndash; Call could not be completed as dialed, most likely because the phone number was non-existent. * &#x60;noAnswer&#x60; &amp;ndash; Call ended without being answered.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "* `queued` &ndash; Call is ready and waiting in line before going out. * `ringing` &ndash; Call is currently ringing. * `inProgress` &ndash; Call was answered and is currently in progress. * `canceled` &ndash; Call was hung up while it was queued or ringing. * `completed` &ndash; Call was answered and has ended normally. * `busy` &ndash; Caller received a busy signal. * `failed` &ndash; Call could not be completed as dialed, most likely because the phone number was non-existent. * `noAnswer` &ndash; Call ended without being answered.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CallResult startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time of the Call (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call has not yet been dialed.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start time of the Call (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call has not yet been dialed.")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public CallResult connectTime(String connectTime) {
    
    this.connectTime = connectTime;
    return this;
  }

   /**
   * Time the Call was answered (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call has not yet been dialed.
   * @return connectTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the Call was answered (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call has not yet been dialed.")

  public String getConnectTime() {
    return connectTime;
  }


  public void setConnectTime(String connectTime) {
    this.connectTime = connectTime;
  }


  public CallResult endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * End time of the Call (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call did not complete successfully.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End time of the Call (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call did not complete successfully.")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public CallResult duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Total length of the Call in seconds. Measures time between startTime and endTime. This value is empty for busy, failed, unanswered or ongoing Calls.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total length of the Call in seconds. Measures time between startTime and endTime. This value is empty for busy, failed, unanswered or ongoing Calls.")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public CallResult connectDuration(Integer connectDuration) {
    
    this.connectDuration = connectDuration;
    return this;
  }

   /**
   * Length of time that the Call was connected in seconds. Measures time between connectTime and endTime. This value is empty for busy, failed, unanswered or ongoing Calls.
   * @return connectDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Length of time that the Call was connected in seconds. Measures time between connectTime and endTime. This value is empty for busy, failed, unanswered or ongoing Calls.")

  public Integer getConnectDuration() {
    return connectDuration;
  }


  public void setConnectDuration(Integer connectDuration) {
    this.connectDuration = connectDuration;
  }


  public CallResult direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Direction of the Call. &#x60;inbound&#x60; for Calls into FreeClimb, &#x60;outboundAPI&#x60; for Calls initiated via the REST API,  &#x60;outboundDial&#x60; for Calls initiated by the &#x60;OutDial&#x60; PerCL command.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Direction of the Call. `inbound` for Calls into FreeClimb, `outboundAPI` for Calls initiated via the REST API,  `outboundDial` for Calls initiated by the `OutDial` PerCL command.")

  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }


  public CallResult answeredBy(String answeredBy) {
    
    this.answeredBy = answeredBy;
    return this;
  }

   /**
   * If this Call was initiated with answering machine detection, either &#x60;human&#x60; or &#x60;machine&#x60;. Empty otherwise.
   * @return answeredBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this Call was initiated with answering machine detection, either `human` or `machine`. Empty otherwise.")

  public String getAnsweredBy() {
    return answeredBy;
  }


  public void setAnsweredBy(String answeredBy) {
    this.answeredBy = answeredBy;
  }


  public CallResult subresourceUris(Object subresourceUris) {
    
    this.subresourceUris = subresourceUris;
    return this;
  }

   /**
   * The list of subresources for this Call. These include things like logs and recordings associated with the Call.
   * @return subresourceUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of subresources for this Call. These include things like logs and recordings associated with the Call.")

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
    CallResult callResult = (CallResult) o;
    return Objects.equals(this.uri, callResult.uri) &&
        Objects.equals(this.dateCreated, callResult.dateCreated) &&
        Objects.equals(this.dateUpdated, callResult.dateUpdated) &&
        Objects.equals(this.revision, callResult.revision) &&
        Objects.equals(this.callId, callResult.callId) &&
        Objects.equals(this.parentCallId, callResult.parentCallId) &&
        Objects.equals(this.accountId, callResult.accountId) &&
        Objects.equals(this.from, callResult.from) &&
        Objects.equals(this.to, callResult.to) &&
        Objects.equals(this.phoneNumberId, callResult.phoneNumberId) &&
        Objects.equals(this.status, callResult.status) &&
        Objects.equals(this.startTime, callResult.startTime) &&
        Objects.equals(this.connectTime, callResult.connectTime) &&
        Objects.equals(this.endTime, callResult.endTime) &&
        Objects.equals(this.duration, callResult.duration) &&
        Objects.equals(this.connectDuration, callResult.connectDuration) &&
        Objects.equals(this.direction, callResult.direction) &&
        Objects.equals(this.answeredBy, callResult.answeredBy) &&
        Objects.equals(this.subresourceUris, callResult.subresourceUris);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, dateCreated, dateUpdated, revision, callId, parentCallId, accountId, from, to, phoneNumberId, status, startTime, connectTime, endTime, duration, connectDuration, direction, answeredBy, subresourceUris);
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
    sb.append("class CallResult {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    parentCallId: ").append(toIndentedString(parentCallId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    phoneNumberId: ").append(toIndentedString(phoneNumberId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    connectTime: ").append(toIndentedString(connectTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    connectDuration: ").append(toIndentedString(connectDuration)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    answeredBy: ").append(toIndentedString(answeredBy)).append("\n");
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

