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
 * The &#x60;SetTalk&#x60; command enables or disables the talk privilege for a Participant in a Conference provided both calls are in the same conference. If &#39;true&#39;, no audio from that Participant is shared with the other Participants of the Conference.
 */
@ApiModel(description = "The `SetTalk` command enables or disables the talk privilege for a Participant in a Conference provided both calls are in the same conference. If 'true', no audio from that Participant is shared with the other Participants of the Conference.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetTalk extends PerclCommand {
  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  private String callId;

  public static final String SERIALIZED_NAME_TALK = "talk";
  @SerializedName(SERIALIZED_NAME_TALK)
  private Boolean talk;

  public SetTalk() { 
    this.command = this.getClass().getSimpleName();
  }

  public SetTalk callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * ID of the call leg that is to be muted or unmuted. The Call must be in a Conference or an error will be triggered.
   * @return callId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of the call leg that is to be muted or unmuted. The Call must be in a Conference or an error will be triggered.")

  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public SetTalk talk(Boolean talk) {
    
    this.talk = talk;
    return this;
  }

   /**
   * Specifying &#x60;false&#x60; mutes the Participant.
   * @return talk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifying `false` mutes the Participant.")

  public Boolean getTalk() {
    return talk;
  }


  public void setTalk(Boolean talk) {
    this.talk = talk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetTalk setTalk = (SetTalk) o;
    return Objects.equals(this.callId, setTalk.callId) &&
        Objects.equals(this.talk, setTalk.talk) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callId, talk, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetTalk {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    talk: ").append(toIndentedString(talk)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    attributes.put("callId", () -> this.getCallId());
    attributes.put("talk", () -> this.getTalk());
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

