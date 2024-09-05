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
 * Indicates whether to play a beep when a Participant enters or leaves the Conference. either &#x60;always&#x60;, &#x60;never&#x60;, &#x60;entryOnly&#x60;, or &#x60;exitOnly&#x60;. Leaving this unset will make conference default to &#x60;always&#x60; 
 */
@JsonAdapter(PlayBeep.Adapter.class)
public enum PlayBeep {
  
  ALWAYS("always"),
  
  NEVER("never"),
  
  ENTRY_ONLY("entryOnly"),
  
  EXIT_ONLY("exitOnly");

  private String value;

  PlayBeep(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlayBeep fromValue(String value) {
    for (PlayBeep b : PlayBeep.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlayBeep> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlayBeep enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlayBeep read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlayBeep.fromValue(value);
    }
  }
}

