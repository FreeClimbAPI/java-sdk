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
import com.github.freeclimbapi.AddToConference;
import com.github.freeclimbapi.CreateConference;
import com.github.freeclimbapi.Dequeue;
import com.github.freeclimbapi.Enqueue;
import com.github.freeclimbapi.GetDigits;
import com.github.freeclimbapi.GetSpeech;
import com.github.freeclimbapi.Hangup;
import com.github.freeclimbapi.OutDial;
import com.github.freeclimbapi.Park;
import com.github.freeclimbapi.Pause;
import com.github.freeclimbapi.Play;
import com.github.freeclimbapi.PlayEarlyMedia;
import com.github.freeclimbapi.RecordUtterance;
import com.github.freeclimbapi.Redirect;
import com.github.freeclimbapi.Reject;
import com.github.freeclimbapi.RemoveFromConference;
import com.github.freeclimbapi.Say;
import com.github.freeclimbapi.SendDigits;
import com.github.freeclimbapi.SetListen;
import com.github.freeclimbapi.SetTalk;
import com.github.freeclimbapi.Sms;
import com.github.freeclimbapi.StartRecordCall;
import com.github.freeclimbapi.TerminateConference;
import com.github.freeclimbapi.Unpark;
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
 * An individual command used in a PerCLScript.
 */
@ApiModel(description = "An individual command used in a PerCLScript.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T13:04:20.214-05:00[America/Chicago]")
public class PerclCommand {
  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  protected String command;

  public PerclCommand() { 
    this.command = this.getClass().getSimpleName();
  }

  public PerclCommand command(String command) {
    
    this.command = command;
    return this;
  }

   /**
   * Name of PerCL Command (this is automatically derived from mapping configuration and should not be manually supplied in any arguments)
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of PerCL Command (this is automatically derived from mapping configuration and should not be manually supplied in any arguments)")

  public String getCommand() {
    return command;
  }


  public void setCommand(String command) {
    this.command = command;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerclCommand perclCommand = (PerclCommand) o;
    return Objects.equals(this.command, perclCommand.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerclCommand {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    return attributes;
  }
  public Map<String, Map<String, Object>> build() throws Exception {
    Map<String, Map<String, Object>> map = new HashMap();
    String command = this.command;
    Map<String, Object> commandValue = new HashMap<String, Object>();
    Map<String, Callable<Object>> attributeMap = this.attributeTypeMap();

    for (Map.Entry<String, Callable<Object>> entry : attributeMap.entrySet()) {
      Object value = entry.getValue().call();
      String key = entry.getKey();
      if (key != "command" && value != null) {
        if (value instanceof PerclCommand) {
          commandValue.put(key, ((PerclCommand) value).build());
        }
        else if (value.getClass().isArray()) {
          ArrayList<Object> subList = new ArrayList<Object>();
          for (Object el : subList) {
            if (el != null) {
              if (el instanceof PerclCommand) {
                subList.add(((PerclCommand) el).build());
              } else {
                subList.add(el);
              }
            }
          }
          commandValue.put(key, subList);
        }
        else {
          commandValue.put(key, value);
        }
      }
    }
    map.put(command, commandValue);
    return map;
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

