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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Objects;

/** QueueRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueueRequest {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_ALIAS = "alias";

    @SerializedName(SERIALIZED_NAME_ALIAS)
    private String alias;

    public static final String SERIALIZED_NAME_MAX_SIZE = "maxSize";

    @SerializedName(SERIALIZED_NAME_MAX_SIZE)
    private Integer maxSize = 100;

    public QueueRequest() {}

    public QueueRequest alias(String alias) {

        this.alias = alias;
        return this;
    }

    /**
     * Description for this Queue. Max length is 64 characters.
     *
     * @return alias
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Description for this Queue. Max length is 64 characters.")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public QueueRequest maxSize(Integer maxSize) {

        this.maxSize = maxSize;
        return this;
    }

    /**
     * Maximum number of calls this queue can hold. Default is 100. Maximum is 1000. **Note:**
     * Reducing the maxSize of a Queue causes the Queue to reject incoming requests until it shrinks
     * below the new value of maxSize.
     *
     * @return maxSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Maximum number of calls this queue can hold. Default is 100. Maximum is 1000."
                        + " **Note:** Reducing the maxSize of a Queue causes the Queue to reject"
                        + " incoming requests until it shrinks below the new value of maxSize.")
    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueueRequest queueRequest = (QueueRequest) o;
        return Objects.equals(this.alias, queueRequest.alias)
                && Objects.equals(this.maxSize, queueRequest.maxSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, maxSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueRequest {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
        sb.append("}");
        return sb.toString();
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
