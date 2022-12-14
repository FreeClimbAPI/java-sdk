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
 * A PerCL script to be returned to the FreeClimb servers in FreeClimb applications
 */
@ApiModel(description = "A PerCL script to be returned to the FreeClimb servers in FreeClimb applications")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PerclScript {
  public static final String SERIALIZED_NAME_COMMANDS = "commands";
  @SerializedName(SERIALIZED_NAME_COMMANDS)
  private List<PerclCommand> commands = null;

  public PerclScript() { 
  }

  public PerclScript commands(List<PerclCommand> commands) {
    
    this.commands = commands;
    return this;
  }

  public PerclScript addCommandsItem(PerclCommand commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<PerclCommand>();
    }
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * A JSON array of PerCL commands
   * @return commands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON array of PerCL commands")

  public List<PerclCommand> getCommands() {
    return commands;
  }


  public void setCommands(List<PerclCommand> commands) {
    this.commands = commands;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerclScript perclScript = (PerclScript) o;
    return Objects.equals(this.commands, perclScript.commands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerclScript {\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public PerclScript addCommand(PerclCommand command) {
    return this.addCommandsItem(command);
  }
  public List<Map<String, Map<String, Object>>> build() throws Exception {
    List<Map<String,Map<String,Object>>> result = new ArrayList();
    if (this.commands != null) {
      for (PerclCommand command : this.commands) {
        result.add(command.build());
      }
    }
    return result;
  }
  public String toJson() throws Exception {
    JSON json = new JSON();
    return json.serialize(this.build());
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

