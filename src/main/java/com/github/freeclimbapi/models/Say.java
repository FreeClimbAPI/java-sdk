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
 * The &#x60;Say&#x60; command provides Text-To-Speech (TTS) support. It converts text to speech and then renders it in a female voice back to the caller. &#x60;Say&#x60; is useful in cases where it&#39;s difficult to pre-record a prompt for any reason. &#x60;Say&#x60; does not allow barge-in unless nested within a &#x60;GetSpeech&#x60; command. The file will always be played to completion unless nested.
 */
@ApiModel(description = "The `Say` command provides Text-To-Speech (TTS) support. It converts text to speech and then renders it in a female voice back to the caller. `Say` is useful in cases where it's difficult to pre-record a prompt for any reason. `Say` does not allow barge-in unless nested within a `GetSpeech` command. The file will always be played to completion unless nested.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Say extends PerclCommand {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LOOP = "loop";
  @SerializedName(SERIALIZED_NAME_LOOP)
  private Integer loop = 1;

  public static final String SERIALIZED_NAME_PRIVACY_MODE = "privacyMode";
  @SerializedName(SERIALIZED_NAME_PRIVACY_MODE)
  private Boolean privacyMode;

  public Say() { 
    this.command = this.getClass().getSimpleName();
  }

  public Say text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The message to be played to the caller using TTS. The size of the string is limited to 4 KB (or 4,096 bytes). An empty string will cause the command to be skipped.
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The message to be played to the caller using TTS. The size of the string is limited to 4 KB (or 4,096 bytes). An empty string will cause the command to be skipped.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Say language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language and (by implication) the locale to use. This implies the accent and pronunciations to be usde for the TTS. The complete list of valid values for the language attribute is shown below.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Language and (by implication) the locale to use. This implies the accent and pronunciations to be usde for the TTS. The complete list of valid values for the language attribute is shown below.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public Say loop(Integer loop) {
    
    this.loop = loop;
    return this;
  }

   /**
   * Number of times the text is said. Specifying &#39;0&#39; causes the &#x60;Say&#x60; action to loop until the Call is hung up.
   * @return loop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times the text is said. Specifying '0' causes the `Say` action to loop until the Call is hung up.")

  public Integer getLoop() {
    return loop;
  }


  public void setLoop(Integer loop) {
    this.loop = loop;
  }


  public Say privacyMode(Boolean privacyMode) {
    
    this.privacyMode = privacyMode;
    return this;
  }

   /**
   * Parameter &#x60;privacyMode&#x60; will not log the &#x60;text&#x60; as required by PCI compliance.
   * @return privacyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameter `privacyMode` will not log the `text` as required by PCI compliance.")

  public Boolean getPrivacyMode() {
    return privacyMode;
  }


  public void setPrivacyMode(Boolean privacyMode) {
    this.privacyMode = privacyMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Say say = (Say) o;
    return Objects.equals(this.text, say.text) &&
        Objects.equals(this.language, say.language) &&
        Objects.equals(this.loop, say.loop) &&
        Objects.equals(this.privacyMode, say.privacyMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, language, loop, privacyMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Say {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    loop: ").append(toIndentedString(loop)).append("\n");
    sb.append("    privacyMode: ").append(toIndentedString(privacyMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    attributes.put("text", () -> this.getText());
    attributes.put("language", () -> this.getLanguage());
    attributes.put("loop", () -> this.getLoop());
    attributes.put("privacyMode", () -> this.getPrivacyMode());
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

