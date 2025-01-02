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
 * The &#x60;Play&#x60; command plays an audio file back to the caller. The audio file may be located at any location accessible via a URL. &#x60;Play&#x60; can exist as a stand-alone command or as a nested command. It does not allow barge-in unless nested within a &#x60;GetSpeech&#x60; command. The file will always be played to completion unless nested.
 */
@ApiModel(description = "The `Play` command plays an audio file back to the caller. The audio file may be located at any location accessible via a URL. `Play` can exist as a stand-alone command or as a nested command. It does not allow barge-in unless nested within a `GetSpeech` command. The file will always be played to completion unless nested.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Play extends PerclCommand {
  public static String getDiscriminatorValue() {
    return null;
  }
  
  public static final String SERIALIZED_NAME_FILE = "file";
  
  
  @SerializedName(SERIALIZED_NAME_FILE)
  
  private String _file;

  
  public static final String SERIALIZED_NAME_LOOP = "loop";
  
  
  @SerializedName(SERIALIZED_NAME_LOOP)
  
  private Integer loop;

  
  public static final String SERIALIZED_NAME_PRIVACY_MODE = "privacyMode";
  
  
  @SerializedName(SERIALIZED_NAME_PRIVACY_MODE)
  
  private Boolean privacyMode;


  public Play() { 
    this.command = this.getClass().getSimpleName();
  }

  public Play _file(String _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * RL of the audio file to be played to the caller. The URL can be the &#x60;recordingUrl&#x60; generated from the &#x60;RecordUtterance&#x60; or &#x60;StartRecordCall&#x60; PerCL commands. 
   * @return _file
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "RL of the audio file to be played to the caller. The URL can be the `recordingUrl` generated from the `RecordUtterance` or `StartRecordCall` PerCL commands. ")

  public String getFile() {
    return _file;
  }


  public void setFile(String _file) {
    this._file = _file;
  }


  public Play loop(Integer loop) {
    
    this.loop = loop;
    return this;
  }

   /**
   * Number of times the audio file is played. Specifying &#39;0&#39; causes the Play action to loop until the Call is hung up.
   * @return loop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times the audio file is played. Specifying '0' causes the Play action to loop until the Call is hung up.")

  public Integer getLoop() {
    return loop;
  }


  public void setLoop(Integer loop) {
    this.loop = loop;
  }


  public Play privacyMode(Boolean privacyMode) {
    
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
    Play play = (Play) o;
    return Objects.equals(this._file, play._file) &&
        Objects.equals(this.loop, play.loop) &&
        Objects.equals(this.privacyMode, play.privacyMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, loop, privacyMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Play {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    loop: ").append(toIndentedString(loop)).append("\n");
    sb.append("    privacyMode: ").append(toIndentedString(privacyMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    attributes.put("_file", () -> this.getFile());
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
