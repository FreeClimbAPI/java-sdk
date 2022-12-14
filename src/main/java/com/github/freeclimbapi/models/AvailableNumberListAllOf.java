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
 * AvailableNumberListAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AvailableNumberListAllOf {
  public static final String SERIALIZED_NAME_AVAILABLE_PHONE_NUMBERS = "availablePhoneNumbers";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_PHONE_NUMBERS)
  private List<AvailableNumber> availablePhoneNumbers = null;

  public AvailableNumberListAllOf() { 
  }

  public AvailableNumberListAllOf availablePhoneNumbers(List<AvailableNumber> availablePhoneNumbers) {
    
    this.availablePhoneNumbers = availablePhoneNumbers;
    return this;
  }

  public AvailableNumberListAllOf addAvailablePhoneNumbersItem(AvailableNumber availablePhoneNumbersItem) {
    if (this.availablePhoneNumbers == null) {
      this.availablePhoneNumbers = new ArrayList<AvailableNumber>();
    }
    this.availablePhoneNumbers.add(availablePhoneNumbersItem);
    return this;
  }

   /**
   * Get availablePhoneNumbers
   * @return availablePhoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AvailableNumber> getAvailablePhoneNumbers() {
    return availablePhoneNumbers;
  }


  public void setAvailablePhoneNumbers(List<AvailableNumber> availablePhoneNumbers) {
    this.availablePhoneNumbers = availablePhoneNumbers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableNumberListAllOf availableNumberListAllOf = (AvailableNumberListAllOf) o;
    return Objects.equals(this.availablePhoneNumbers, availableNumberListAllOf.availablePhoneNumbers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePhoneNumbers);
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
    sb.append("class AvailableNumberListAllOf {\n");
    sb.append("    availablePhoneNumbers: ").append(toIndentedString(availablePhoneNumbers)).append("\n");
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

