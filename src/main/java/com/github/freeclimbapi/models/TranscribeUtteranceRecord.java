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

/** TranscribeUtteranceRecord */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranscribeUtteranceRecord {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_SAVE_RECORDING = "saveRecording";

    @SerializedName(SERIALIZED_NAME_SAVE_RECORDING)
    private Boolean saveRecording = false;

    public static final String SERIALIZED_NAME_MAX_LENGTH_SEC = "maxLengthSec";

    @SerializedName(SERIALIZED_NAME_MAX_LENGTH_SEC)
    private Integer maxLengthSec = 60;

    public static final String SERIALIZED_NAME_RCRD_TERMINATION_SILENCE_TIME_MS =
            "rcrdTerminationSilenceTimeMs";

    @SerializedName(SERIALIZED_NAME_RCRD_TERMINATION_SILENCE_TIME_MS)
    private Integer rcrdTerminationSilenceTimeMs;

    public TranscribeUtteranceRecord() {}

    public TranscribeUtteranceRecord saveRecording(Boolean saveRecording) {

        this.saveRecording = saveRecording;
        return this;
    }

    /**
     * Get saveRecording
     *
     * @return saveRecording
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSaveRecording() {
        return saveRecording;
    }

    public void setSaveRecording(Boolean saveRecording) {
        this.saveRecording = saveRecording;
    }

    public TranscribeUtteranceRecord maxLengthSec(Integer maxLengthSec) {

        this.maxLengthSec = maxLengthSec;
        return this;
    }

    /**
     * Get maxLengthSec minimum: 1 maximum: 60
     *
     * @return maxLengthSec
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxLengthSec() {
        return maxLengthSec;
    }

    public void setMaxLengthSec(Integer maxLengthSec) {
        this.maxLengthSec = maxLengthSec;
    }

    public TranscribeUtteranceRecord rcrdTerminationSilenceTimeMs(
            Integer rcrdTerminationSilenceTimeMs) {

        this.rcrdTerminationSilenceTimeMs = rcrdTerminationSilenceTimeMs;
        return this;
    }

    /**
     * Get rcrdTerminationSilenceTimeMs minimum: 1 maximum: 3000
     *
     * @return rcrdTerminationSilenceTimeMs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRcrdTerminationSilenceTimeMs() {
        return rcrdTerminationSilenceTimeMs;
    }

    public void setRcrdTerminationSilenceTimeMs(Integer rcrdTerminationSilenceTimeMs) {
        this.rcrdTerminationSilenceTimeMs = rcrdTerminationSilenceTimeMs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TranscribeUtteranceRecord transcribeUtteranceRecord = (TranscribeUtteranceRecord) o;
        return Objects.equals(this.saveRecording, transcribeUtteranceRecord.saveRecording)
                && Objects.equals(this.maxLengthSec, transcribeUtteranceRecord.maxLengthSec)
                && Objects.equals(
                        this.rcrdTerminationSilenceTimeMs,
                        transcribeUtteranceRecord.rcrdTerminationSilenceTimeMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saveRecording, maxLengthSec, rcrdTerminationSilenceTimeMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscribeUtteranceRecord {\n");
        sb.append("    saveRecording: ").append(toIndentedString(saveRecording)).append("\n");
        sb.append("    maxLengthSec: ").append(toIndentedString(maxLengthSec)).append("\n");
        sb.append("    rcrdTerminationSilenceTimeMs: ")
                .append(toIndentedString(rcrdTerminationSilenceTimeMs))
                .append("\n");
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
