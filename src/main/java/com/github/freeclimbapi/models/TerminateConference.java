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

import com.github.freeclimbapi.enums.*;
import io.swagger.annotations.ApiModel;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * The &#x60;TerminateConference&#x60; command terminates an existing Conference. Any active
 * participants are hung up on by FreeClimb. If this is not the desired behavior, use the
 * &#x60;RemoveFromConference&#x60; command to unbridge Calls that should not be hung up. Note: The
 * Call requesting TerminateConference must be on the same Conference for this command to execute.
 */
@ApiModel(
        description =
                "The `TerminateConference` command terminates an existing Conference. Any active"
                    + " participants are hung up on by FreeClimb. If this is not the desired"
                    + " behavior, use the `RemoveFromConference` command to unbridge Calls that"
                    + " should not be hung up. Note: The Call requesting TerminateConference must"
                    + " be on the same Conference for this command to execute.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TerminateConference extends PerclCommand {
    public static String getDiscriminatorValue() {
        return null;
    }

    public TerminateConference() {
        this.command = this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TerminateConference {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public Map<String, Callable<Object>> attributeTypeMap() {
        Map<String, Callable<Object>> attributes = new HashMap();
        return attributes;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
