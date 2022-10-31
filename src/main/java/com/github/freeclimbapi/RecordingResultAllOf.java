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
 * RecordingResultAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T13:04:20.214-05:00[America/Chicago]")
public class RecordingResultAllOf {
  public static final String SERIALIZED_NAME_RECORDING_ID = "recordingId";
  @SerializedName(SERIALIZED_NAME_RECORDING_ID)
  private String recordingId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_DURATION_SEC = "durationSec";
  @SerializedName(SERIALIZED_NAME_DURATION_SEC)
  private Integer durationSec;

  public static final String SERIALIZED_NAME_CONFERENCE_ID = "conferenceId";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_ID)
  private String conferenceId;

  public RecordingResultAllOf() { 
  }

  public RecordingResultAllOf recordingId(String recordingId) {
    
    this.recordingId = recordingId;
    return this;
  }

   /**
   * String that uniquely identifies this recording resource.
   * @return recordingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String that uniquely identifies this recording resource.")

  public String getRecordingId() {
    return recordingId;
  }


  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }


  public RecordingResultAllOf accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * ID of the account that created this recording.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the account that created this recording.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public RecordingResultAllOf callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * ID of the Call that was recorded. If a Conference was recorded, this value is empty and the conferenceId property is populated.
   * @return callId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the Call that was recorded. If a Conference was recorded, this value is empty and the conferenceId property is populated.")

  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public RecordingResultAllOf durationSec(Integer durationSec) {
    
    this.durationSec = durationSec;
    return this;
  }

   /**
   * Length of the recording in seconds.
   * @return durationSec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Length of the recording in seconds.")

  public Integer getDurationSec() {
    return durationSec;
  }


  public void setDurationSec(Integer durationSec) {
    this.durationSec = durationSec;
  }


  public RecordingResultAllOf conferenceId(String conferenceId) {
    
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * ID of the Conference that was recorded. If a Call was recorded, this value is empty and the callId property is populated.
   * @return conferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the Conference that was recorded. If a Call was recorded, this value is empty and the callId property is populated.")

  public String getConferenceId() {
    return conferenceId;
  }


  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingResultAllOf recordingResultAllOf = (RecordingResultAllOf) o;
    return Objects.equals(this.recordingId, recordingResultAllOf.recordingId) &&
        Objects.equals(this.accountId, recordingResultAllOf.accountId) &&
        Objects.equals(this.callId, recordingResultAllOf.callId) &&
        Objects.equals(this.durationSec, recordingResultAllOf.durationSec) &&
        Objects.equals(this.conferenceId, recordingResultAllOf.conferenceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingId, accountId, callId, durationSec, conferenceId);
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
    sb.append("class RecordingResultAllOf {\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    durationSec: ").append(toIndentedString(durationSec)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
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

