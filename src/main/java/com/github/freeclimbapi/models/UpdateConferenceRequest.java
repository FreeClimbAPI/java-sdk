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

/** UpdateConferenceRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateConferenceRequest {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_ALIAS = "alias";

    @SerializedName(SERIALIZED_NAME_ALIAS)
    private String alias;

    public static final String SERIALIZED_NAME_PLAY_BEEP = "playBeep";

    @SerializedName(SERIALIZED_NAME_PLAY_BEEP)
    private PlayBeep playBeep;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private UpdateConferenceRequestStatus status;

    public UpdateConferenceRequest() {}

    public UpdateConferenceRequest alias(String alias) {

        this.alias = alias;
        return this;
    }

    /**
     * Description for this conference. Maximum 64 characters.
     *
     * @return alias
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Description for this conference. Maximum 64 characters.")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public UpdateConferenceRequest playBeep(PlayBeep playBeep) {

        this.playBeep = playBeep;
        return this;
    }

    /**
     * Get playBeep
     *
     * @return playBeep
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PlayBeep getPlayBeep() {
        return playBeep;
    }

    public void setPlayBeep(PlayBeep playBeep) {
        this.playBeep = playBeep;
    }

    public UpdateConferenceRequest status(UpdateConferenceRequestStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UpdateConferenceRequestStatus getStatus() {
        return status;
    }

    public void setStatus(UpdateConferenceRequestStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateConferenceRequest updateConferenceRequest = (UpdateConferenceRequest) o;
        return Objects.equals(this.alias, updateConferenceRequest.alias)
                && Objects.equals(this.playBeep, updateConferenceRequest.playBeep)
                && Objects.equals(this.status, updateConferenceRequest.status);
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
        return Objects.hash(alias, playBeep, status);
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
        sb.append("class UpdateConferenceRequest {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    playBeep: ").append(toIndentedString(playBeep)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
