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
 * Gets or Sets RecordUtteranceTermReason
 */
@JsonAdapter(RecordUtteranceTermReason.Adapter.class)
public enum RecordUtteranceTermReason {
  
  FINISH_KEY("finishKey"),
  
  TIMEOUT("timeout"),
  
  HANGUP("hangup"),
  
  MAX_LENGTH("maxLength");

  private String value;

  RecordUtteranceTermReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RecordUtteranceTermReason fromValue(String value) {
    for (RecordUtteranceTermReason b : RecordUtteranceTermReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RecordUtteranceTermReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final RecordUtteranceTermReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RecordUtteranceTermReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RecordUtteranceTermReason.fromValue(value);
    }
  }
}

