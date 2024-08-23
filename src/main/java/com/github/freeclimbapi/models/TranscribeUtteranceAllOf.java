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
 * The &#x60;TranscribeUtterance&#x60; command transcribes the caller’s voice and returns transcription of the audio and optionally returns the recording of the audio transcribed.  &#x60;TranscribeUtterance&#x60; is blocking and is a terminal command. As such, the actionUrl property is required, and control of the Call picks up using the &#x60;PerCL&#x60; returned in response of the &#x60;actionUrl&#x60;. Recording and Transcription information is returned in the actionUrl request. If the reason this command ended was due to the call hanging up, any PerCL returned will not execute.
 */
@ApiModel(description = "The `TranscribeUtterance` command transcribes the caller’s voice and returns transcription of the audio and optionally returns the recording of the audio transcribed.  `TranscribeUtterance` is blocking and is a terminal command. As such, the actionUrl property is required, and control of the Call picks up using the `PerCL` returned in response of the `actionUrl`. Recording and Transcription information is returned in the actionUrl request. If the reason this command ended was due to the call hanging up, any PerCL returned will not execute.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranscribeUtteranceAllOf {
  public static final String SERIALIZED_NAME_ACTION_URL = "actionUrl";
  @SerializedName(SERIALIZED_NAME_ACTION_URL)
  private String actionUrl;

  public static final String SERIALIZED_NAME_PLAY_BEEP = "playBeep";
  @SerializedName(SERIALIZED_NAME_PLAY_BEEP)
  private Boolean playBeep = false;

  public static final String SERIALIZED_NAME_RECORD = "record";
  @SerializedName(SERIALIZED_NAME_RECORD)
  private TranscribeUtteranceAllOfRecord record;

  public static final String SERIALIZED_NAME_PRIVACY_FOR_LOGGING = "privacyForLogging";
  @SerializedName(SERIALIZED_NAME_PRIVACY_FOR_LOGGING)
  private Boolean privacyForLogging = false;

  public static final String SERIALIZED_NAME_PRIVACY_FOR_RECORDING = "privacyForRecording";
  @SerializedName(SERIALIZED_NAME_PRIVACY_FOR_RECORDING)
  private Boolean privacyForRecording = false;

  public static final String SERIALIZED_NAME_PROMPTS = "prompts";
  @SerializedName(SERIALIZED_NAME_PROMPTS)
  private List<Object> prompts = null;

  public TranscribeUtteranceAllOf() { 
  }

  public TranscribeUtteranceAllOf actionUrl(String actionUrl) {
    
    this.actionUrl = actionUrl;
    return this;
  }

   /**
   * Get actionUrl
   * @return actionUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getActionUrl() {
    return actionUrl;
  }


  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public TranscribeUtteranceAllOf playBeep(Boolean playBeep) {
    
    this.playBeep = playBeep;
    return this;
  }

   /**
   * Get playBeep
   * @return playBeep
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPlayBeep() {
    return playBeep;
  }


  public void setPlayBeep(Boolean playBeep) {
    this.playBeep = playBeep;
  }


  public TranscribeUtteranceAllOf record(TranscribeUtteranceAllOfRecord record) {
    
    this.record = record;
    return this;
  }

   /**
   * Get record
   * @return record
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TranscribeUtteranceAllOfRecord getRecord() {
    return record;
  }


  public void setRecord(TranscribeUtteranceAllOfRecord record) {
    this.record = record;
  }


  public TranscribeUtteranceAllOf privacyForLogging(Boolean privacyForLogging) {
    
    this.privacyForLogging = privacyForLogging;
    return this;
  }

   /**
   * Get privacyForLogging
   * @return privacyForLogging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPrivacyForLogging() {
    return privacyForLogging;
  }


  public void setPrivacyForLogging(Boolean privacyForLogging) {
    this.privacyForLogging = privacyForLogging;
  }


  public TranscribeUtteranceAllOf privacyForRecording(Boolean privacyForRecording) {
    
    this.privacyForRecording = privacyForRecording;
    return this;
  }

   /**
   * Get privacyForRecording
   * @return privacyForRecording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPrivacyForRecording() {
    return privacyForRecording;
  }


  public void setPrivacyForRecording(Boolean privacyForRecording) {
    this.privacyForRecording = privacyForRecording;
  }


  public TranscribeUtteranceAllOf prompts(List<Object> prompts) {
    
    this.prompts = prompts;
    return this;
  }

  public TranscribeUtteranceAllOf addPromptsItem(Object promptsItem) {
    if (this.prompts == null) {
      this.prompts = new ArrayList<Object>();
    }
    this.prompts.add(promptsItem);
    return this;
  }

   /**
   * Get prompts
   * @return prompts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getPrompts() {
    return prompts;
  }


  public void setPrompts(List<Object> prompts) {
    this.prompts = prompts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscribeUtteranceAllOf transcribeUtteranceAllOf = (TranscribeUtteranceAllOf) o;
    return Objects.equals(this.actionUrl, transcribeUtteranceAllOf.actionUrl) &&
        Objects.equals(this.playBeep, transcribeUtteranceAllOf.playBeep) &&
        Objects.equals(this.record, transcribeUtteranceAllOf.record) &&
        Objects.equals(this.privacyForLogging, transcribeUtteranceAllOf.privacyForLogging) &&
        Objects.equals(this.privacyForRecording, transcribeUtteranceAllOf.privacyForRecording) &&
        Objects.equals(this.prompts, transcribeUtteranceAllOf.prompts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUrl, playBeep, record, privacyForLogging, privacyForRecording, prompts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscribeUtteranceAllOf {\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    playBeep: ").append(toIndentedString(playBeep)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    privacyForLogging: ").append(toIndentedString(privacyForLogging)).append("\n");
    sb.append("    privacyForRecording: ").append(toIndentedString(privacyForRecording)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
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
