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
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** LogResult */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogResult {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";

    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    private Integer timestamp;

    public static final String SERIALIZED_NAME_LEVEL = "level";

    @SerializedName(SERIALIZED_NAME_LEVEL)
    private LogLevel level;

    public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";

    @SerializedName(SERIALIZED_NAME_REQUEST_ID)
    private String requestId;

    public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_CALL_ID = "callId";

    @SerializedName(SERIALIZED_NAME_CALL_ID)
    private String callId;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    private Object metadata;

    public LogResult() {}

    public LogResult timestamp(Integer timestamp) {

        this.timestamp = timestamp;
        return this;
    }

    /**
     * Time that the log was generated. The time is represented as microseconds since the Unix
     * Epoch.
     *
     * @return timestamp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Time that the log was generated. The time is represented as microseconds since"
                            + " the Unix Epoch.")
    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public LogResult level(LogLevel level) {

        this.level = level;
        return this;
    }

    /**
     * Get level
     *
     * @return level
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LogLevel getLevel() {
        return level;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public LogResult requestId(String requestId) {

        this.requestId = requestId;
        return this;
    }

    /**
     * ID of the request associated with the log. The requestId is propagated across all logs
     * generated by FreeClimb when processing a request.
     *
     * @return requestId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "ID of the request associated with the log. The requestId is propagated across"
                            + " all logs generated by FreeClimb when processing a request.")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public LogResult accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * ID of the account that this log was generated under.
     *
     * @return accountId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of the account that this log was generated under.")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public LogResult callId(String callId) {

        this.callId = callId;
        return this;
    }

    /**
     * ID of the Call associated with the log. Can be set to null if the log was generated without
     * regard to a specific Call.
     *
     * @return callId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "ID of the Call associated with the log. Can be set to null if the log was"
                            + " generated without regard to a specific Call.")
    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public LogResult message(String message) {

        this.message = message;
        return this;
    }

    /**
     * A simple string describing the event being logged.
     *
     * @return message
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A simple string describing the event being logged.")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogResult metadata(Object metadata) {

        this.metadata = metadata;
        return this;
    }

    /**
     * JSON document containing metadata about the event. Some log messages may include request and
     * response header content in this field.
     *
     * @return metadata
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "JSON document containing metadata about the event. Some log messages may"
                            + " include request and response header content in this field.")
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogResult logResult = (LogResult) o;
        return Objects.equals(this.timestamp, logResult.timestamp)
                && Objects.equals(this.level, logResult.level)
                && Objects.equals(this.requestId, logResult.requestId)
                && Objects.equals(this.accountId, logResult.accountId)
                && Objects.equals(this.callId, logResult.callId)
                && Objects.equals(this.message, logResult.message)
                && Objects.equals(this.metadata, logResult.metadata);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, level, requestId, accountId, callId, message, metadata);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogResult {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
