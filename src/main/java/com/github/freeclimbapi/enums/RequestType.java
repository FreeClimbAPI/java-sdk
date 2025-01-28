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

package com.github.freeclimbapi.enums;

import java.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.math.BigDecimal;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.JSON;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets RequestType
 */
@JsonAdapter(RequestType.Adapter.class)
public enum RequestType {
  
  INBOUND_CALL("inboundCall"),
  
  RECORD("record"),
  
  GET_DIGITS("getDigits"),
  
  GET_SPEECH("getSpeech"),
  
  REDIRECT("redirect"),
  
  PAUSE("pause"),
  
  OUT_DIAL_START("outDialStart"),
  
  OUT_DIAL_CONNECT("outDialConnect"),
  
  OUT_DIAL_API_CONNECT("outDialApiConnect"),
  
  MACHINE_DETECTED("machineDetected"),
  
  DEQUEUE("dequeue"),
  
  QUEUE_WAIT("queueWait"),
  
  ADD_TO_QUEUE_NOTIFICATION("addToQueueNotification"),
  
  REMOVE_FROM_QUEUE_NOTIFICATION("removeFromQueueNotification"),
  
  CALL_STATUS("callStatus"),
  
  CREATE_CONFERENCE("createConference"),
  
  CONFERENCE_STATUS("conferenceStatus"),
  
  LEAVE_CONFERENCE("leaveConference"),
  
  ADD_TO_CONFERENCE_NOTIFICATION("addToConferenceNotification"),
  
  CONFERENCE_RECORDING_STATUS("conferenceRecordingStatus"),
  
  CONFERENCE_CALL_CONTROL("conferenceCallControl"),
  
  MESSAGE_DELIVERY("messageDelivery"),
  
  MESSAGE_STATUS("messageStatus");

  private String value;

  RequestType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RequestType fromValue(String value) {
    for (RequestType b : RequestType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RequestType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RequestType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RequestType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RequestType.fromValue(value);
    }
  }
}

