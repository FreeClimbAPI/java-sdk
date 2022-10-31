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

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * TerminateConferenceAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T13:04:20.214-05:00[America/Chicago]")
public class TerminateConferenceAllOf {
  public static final String SERIALIZED_NAME_CONFERENCE_ID = "conferenceId";
  @SerializedName(SERIALIZED_NAME_CONFERENCE_ID)
  private String conferenceId;

  public TerminateConferenceAllOf() { 
  }

  public TerminateConferenceAllOf conferenceId(String conferenceId) {
    
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * ID of the conference to terminate.
   * @return conferenceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of the conference to terminate.")

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
    TerminateConferenceAllOf terminateConferenceAllOf = (TerminateConferenceAllOf) o;
    return Objects.equals(this.conferenceId, terminateConferenceAllOf.conferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conferenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminateConferenceAllOf {\n");
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

