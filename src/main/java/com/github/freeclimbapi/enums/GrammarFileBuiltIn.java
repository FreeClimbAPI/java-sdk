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
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.URI;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets GrammarFileBuiltIn
 */
@JsonAdapter(GrammarFileBuiltIn.Adapter.class)
public enum GrammarFileBuiltIn {
  
  ALPHNUM6("ALPHNUM6"),
  
  ANY_DIG("ANY_DIG"),
  
  DIG1("DIG1"),
  
  DIG2("DIG2"),
  
  DIG3("DIG3"),
  
  DIG4("DIG4"),
  
  DIG5("DIG5"),
  
  DIG6("DIG6"),
  
  DIG7("DIG7"),
  
  DIG8("DIG8"),
  
  DIG9("DIG9"),
  
  DIG10("DIG10"),
  
  DIG11("DIG11"),
  
  UP_TO_20_DIGIT_SEQUENCE("UP_TO_20_DIGIT_SEQUENCE"),
  
  VERSAY_YESNO("VERSAY_YESNO");

  private String value;

  GrammarFileBuiltIn(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GrammarFileBuiltIn fromValue(String value) {
    for (GrammarFileBuiltIn b : GrammarFileBuiltIn.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GrammarFileBuiltIn> {
    @Override
    public void write(final JsonWriter jsonWriter, final GrammarFileBuiltIn enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GrammarFileBuiltIn read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GrammarFileBuiltIn.fromValue(value);
    }
  }
}

