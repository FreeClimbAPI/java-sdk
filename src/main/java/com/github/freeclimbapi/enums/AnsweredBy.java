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
import com.github.freeclimbapi.utils.*;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * If this Call was initiated with answering machine detection, either &#x60;human&#x60; or &#x60;machine&#x60;. Empty otherwise.
 */
@JsonAdapter(AnsweredBy.Adapter.class)
public enum AnsweredBy {
  
  HUMAN("human"),
  
  MACHINE("machine");

  private String value;

  AnsweredBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AnsweredBy fromValue(String value) {
    for (AnsweredBy b : AnsweredBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AnsweredBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final AnsweredBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AnsweredBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AnsweredBy.fromValue(value);
    }
  }
}

