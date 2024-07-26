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
 * TranscribeUtterance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranscribeUtterance extends PerclCommand {
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

  public TranscribeUtterance() { 
    this.command = this.getClass().getSimpleName();
  }

  public TranscribeUtterance actionUrl(String actionUrl) {
    
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


  public TranscribeUtterance playBeep(Boolean playBeep) {
    
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


  public TranscribeUtterance record(TranscribeUtteranceAllOfRecord record) {
    
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


  public TranscribeUtterance privacyForLogging(Boolean privacyForLogging) {
    
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


  public TranscribeUtterance privacyForRecording(Boolean privacyForRecording) {
    
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


  public TranscribeUtterance prompts(List<Object> prompts) {
    
    this.prompts = prompts;
    return this;
  }

  public TranscribeUtterance addPromptsItem(Object promptsItem) {
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
    TranscribeUtterance transcribeUtterance = (TranscribeUtterance) o;
    return Objects.equals(this.actionUrl, transcribeUtterance.actionUrl) &&
        Objects.equals(this.playBeep, transcribeUtterance.playBeep) &&
        Objects.equals(this.record, transcribeUtterance.record) &&
        Objects.equals(this.privacyForLogging, transcribeUtterance.privacyForLogging) &&
        Objects.equals(this.privacyForRecording, transcribeUtterance.privacyForRecording) &&
        Objects.equals(this.prompts, transcribeUtterance.prompts) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUrl, playBeep, record, privacyForLogging, privacyForRecording, prompts, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscribeUtterance {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    playBeep: ").append(toIndentedString(playBeep)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    privacyForLogging: ").append(toIndentedString(privacyForLogging)).append("\n");
    sb.append("    privacyForRecording: ").append(toIndentedString(privacyForRecording)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    attributes.put("actionUrl", () -> this.getActionUrl());
    attributes.put("playBeep", () -> this.getPlayBeep());
    attributes.put("record", () -> this.getRecord());
    attributes.put("privacyForLogging", () -> this.getPrivacyForLogging());
    attributes.put("privacyForRecording", () -> this.getPrivacyForRecording());
    attributes.put("prompts", () -> this.getPrompts());
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

