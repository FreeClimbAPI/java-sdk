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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/**
 * The &#x60;AddToConference&#x60; command adds a Participant to a Conference. Two Call legs can be
 * bridged together by creating a Conference and adding both Call legs to it via
 * &#x60;AddToConference&#x60;.
 */
@ApiModel(
        description =
                "The `AddToConference` command adds a Participant to a Conference. Two Call legs"
                    + " can be bridged together by creating a Conference and adding both Call legs"
                    + " to it via `AddToConference`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddToConference extends PerclCommand {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_ALLOW_CALL_CONTROL = "allowCallControl";

    @SerializedName(SERIALIZED_NAME_ALLOW_CALL_CONTROL)
    private Boolean allowCallControl;

    public static final String SERIALIZED_NAME_CALL_CONTROL_SEQUENCE = "callControlSequence";

    @SerializedName(SERIALIZED_NAME_CALL_CONTROL_SEQUENCE)
    private String callControlSequence;

    public static final String SERIALIZED_NAME_CALL_CONTROL_URL = "callControlUrl";

    @SerializedName(SERIALIZED_NAME_CALL_CONTROL_URL)
    private URI callControlUrl;

    public static final String SERIALIZED_NAME_CONFERENCE_ID = "conferenceId";

    @SerializedName(SERIALIZED_NAME_CONFERENCE_ID)
    private String conferenceId;

    public static final String SERIALIZED_NAME_LEAVE_CONFERENCE_URL = "leaveConferenceUrl";

    @SerializedName(SERIALIZED_NAME_LEAVE_CONFERENCE_URL)
    private URI leaveConferenceUrl;

    public static final String SERIALIZED_NAME_LISTEN = "listen";

    @SerializedName(SERIALIZED_NAME_LISTEN)
    private Boolean listen;

    public static final String SERIALIZED_NAME_NOTIFICATION_URL = "notificationUrl";

    @SerializedName(SERIALIZED_NAME_NOTIFICATION_URL)
    private URI notificationUrl;

    public static final String SERIALIZED_NAME_START_CONF_ON_ENTER = "startConfOnEnter";

    @SerializedName(SERIALIZED_NAME_START_CONF_ON_ENTER)
    private Boolean startConfOnEnter;

    public static final String SERIALIZED_NAME_TALK = "talk";

    @SerializedName(SERIALIZED_NAME_TALK)
    private Boolean talk;

    public static final String SERIALIZED_NAME_DTMF_PASS_THROUGH = "dtmfPassThrough";

    @SerializedName(SERIALIZED_NAME_DTMF_PASS_THROUGH)
    private Boolean dtmfPassThrough;

    public AddToConference() {
        this.command = this.getClass().getSimpleName();
    }

    public AddToConference allowCallControl(Boolean allowCallControl) {

        this.allowCallControl = allowCallControl;
        return this;
    }

    /**
     * If &#x60;true&#x60;, Call control will be enabled for this Participant&#39;s Call leg.
     *
     * @return allowCallControl
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value = "If `true`, Call control will be enabled for this Participant's Call leg.")
    public Boolean getAllowCallControl() {
        return allowCallControl;
    }

    public void setAllowCallControl(Boolean allowCallControl) {
        this.allowCallControl = allowCallControl;
    }

    public AddToConference callControlSequence(String callControlSequence) {

        this.callControlSequence = callControlSequence;
        return this;
    }

    /**
     * Defines a sequence of digits that, when entered by this caller, invokes the
     * &#x60;callControlUrl&#x60;. Only digits plus &#39;*&#39;, and &#39;#&#39; may be used.
     *
     * @return callControlSequence
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Defines a sequence of digits that, when entered by this caller, invokes the"
                            + " `callControlUrl`. Only digits plus '*', and '#' may be used.")
    public String getCallControlSequence() {
        return callControlSequence;
    }

    public void setCallControlSequence(String callControlSequence) {
        this.callControlSequence = callControlSequence;
    }

    public AddToConference callControlUrl(URI callControlUrl) {

        this.callControlUrl = callControlUrl;
        return this;
    }

    /**
     * URL to be invoked when this Participant enters the digit sequence defined in the
     * &#x60;callControlSequence&#x60; attribute.
     *
     * @return callControlUrl
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "URL to be invoked when this Participant enters the digit sequence defined in"
                            + " the `callControlSequence` attribute.")
    public URI getCallControlUrl() {
        return callControlUrl;
    }

    public void setCallControlUrl(URI callControlUrl) {
        this.callControlUrl = callControlUrl;
    }

    public AddToConference conferenceId(String conferenceId) {

        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * ID of the Conference to which to add the Participant (Call leg). Conference must exist or an
     * error will result.
     *
     * @return conferenceId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value =
                    "ID of the Conference to which to add the Participant (Call leg). Conference"
                            + " must exist or an error will result.")
    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public AddToConference leaveConferenceUrl(URI leaveConferenceUrl) {

        this.leaveConferenceUrl = leaveConferenceUrl;
        return this;
    }

    /**
     * URL to be invoked when the Participant leaves the Conference.
     *
     * @return leaveConferenceUrl
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "URL to be invoked when the Participant leaves the Conference. ")
    public URI getLeaveConferenceUrl() {
        return leaveConferenceUrl;
    }

    public void setLeaveConferenceUrl(URI leaveConferenceUrl) {
        this.leaveConferenceUrl = leaveConferenceUrl;
    }

    public AddToConference listen(Boolean listen) {

        this.listen = listen;
        return this;
    }

    /**
     * If &#x60;true&#x60;, the Participant joins the Conference with listen privileges. This may be
     * modified later via the REST API or &#x60;SetListen&#x60; PerCL command.
     *
     * @return listen
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "If `true`, the Participant joins the Conference with listen privileges. This"
                        + " may be modified later via the REST API or `SetListen` PerCL command.")
    public Boolean getListen() {
        return listen;
    }

    public void setListen(Boolean listen) {
        this.listen = listen;
    }

    public AddToConference notificationUrl(URI notificationUrl) {

        this.notificationUrl = notificationUrl;
        return this;
    }

    /**
     * When the Participant enters the Conference, this URL will be invoked using an HTTP POST
     * request with the standard request parameters.
     *
     * @return notificationUrl
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "When the Participant enters the Conference, this URL will be invoked using an"
                            + " HTTP POST request with the standard request parameters.")
    public URI getNotificationUrl() {
        return notificationUrl;
    }

    public void setNotificationUrl(URI notificationUrl) {
        this.notificationUrl = notificationUrl;
    }

    public AddToConference startConfOnEnter(Boolean startConfOnEnter) {

        this.startConfOnEnter = startConfOnEnter;
        return this;
    }

    /**
     * Flag that indicates whether a Conference starts upon entry of this particular Participant.
     * This is usually set to &#x60;true&#x60; for moderators and &#x60;false&#x60; for all other
     * Participants.
     *
     * @return startConfOnEnter
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Flag that indicates whether a Conference starts upon entry of this particular"
                        + " Participant. This is usually set to `true` for moderators and `false`"
                        + " for all other Participants.")
    public Boolean getStartConfOnEnter() {
        return startConfOnEnter;
    }

    public void setStartConfOnEnter(Boolean startConfOnEnter) {
        this.startConfOnEnter = startConfOnEnter;
    }

    public AddToConference talk(Boolean talk) {

        this.talk = talk;
        return this;
    }

    /**
     * If &#x60;true&#x60;, the Participant joins the Conference with talk privileges. This may be
     * modified later via the REST API or &#x60;SetTalk&#x60; PerCL command.
     *
     * @return talk
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "If `true`, the Participant joins the Conference with talk privileges. This may"
                            + " be modified later via the REST API or `SetTalk` PerCL command. ")
    public Boolean getTalk() {
        return talk;
    }

    public void setTalk(Boolean talk) {
        this.talk = talk;
    }

    public AddToConference dtmfPassThrough(Boolean dtmfPassThrough) {

        this.dtmfPassThrough = dtmfPassThrough;
        return this;
    }

    /**
     * If &#x60;true&#x60;, the Participant joins the Conference with dtmfPassThrough privileges.
     * This may be modified later via the REST API or &#x60;SetDTMFPassThrough&#x60; PerCL command.
     *
     * @return dtmfPassThrough
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "If `true`, the Participant joins the Conference with dtmfPassThrough"
                            + " privileges. This may be modified later via the REST API or"
                            + " `SetDTMFPassThrough` PerCL command. ")
    public Boolean getDtmfPassThrough() {
        return dtmfPassThrough;
    }

    public void setDtmfPassThrough(Boolean dtmfPassThrough) {
        this.dtmfPassThrough = dtmfPassThrough;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddToConference addToConference = (AddToConference) o;
        return Objects.equals(this.allowCallControl, addToConference.allowCallControl)
                && Objects.equals(this.callControlSequence, addToConference.callControlSequence)
                && Objects.equals(this.callControlUrl, addToConference.callControlUrl)
                && Objects.equals(this.conferenceId, addToConference.conferenceId)
                && Objects.equals(this.leaveConferenceUrl, addToConference.leaveConferenceUrl)
                && Objects.equals(this.listen, addToConference.listen)
                && Objects.equals(this.notificationUrl, addToConference.notificationUrl)
                && Objects.equals(this.startConfOnEnter, addToConference.startConfOnEnter)
                && Objects.equals(this.talk, addToConference.talk)
                && Objects.equals(this.dtmfPassThrough, addToConference.dtmfPassThrough)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowCallControl,
                callControlSequence,
                callControlUrl,
                conferenceId,
                leaveConferenceUrl,
                listen,
                notificationUrl,
                startConfOnEnter,
                talk,
                dtmfPassThrough,
                super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddToConference {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    allowCallControl: ").append(toIndentedString(allowCallControl)).append("\n");
        sb.append("    callControlSequence: ")
                .append(toIndentedString(callControlSequence))
                .append("\n");
        sb.append("    callControlUrl: ").append(toIndentedString(callControlUrl)).append("\n");
        sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
        sb.append("    leaveConferenceUrl: ")
                .append(toIndentedString(leaveConferenceUrl))
                .append("\n");
        sb.append("    listen: ").append(toIndentedString(listen)).append("\n");
        sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
        sb.append("    startConfOnEnter: ").append(toIndentedString(startConfOnEnter)).append("\n");
        sb.append("    talk: ").append(toIndentedString(talk)).append("\n");
        sb.append("    dtmfPassThrough: ").append(toIndentedString(dtmfPassThrough)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public Map<String, Callable<Object>> attributeTypeMap() {
        Map<String, Callable<Object>> attributes = new HashMap();
        attributes.put("allowCallControl", () -> this.getAllowCallControl());
        attributes.put("callControlSequence", () -> this.getCallControlSequence());
        attributes.put("callControlUrl", () -> this.getCallControlUrl());
        attributes.put("conferenceId", () -> this.getConferenceId());
        attributes.put("leaveConferenceUrl", () -> this.getLeaveConferenceUrl());
        attributes.put("listen", () -> this.getListen());
        attributes.put("notificationUrl", () -> this.getNotificationUrl());
        attributes.put("startConfOnEnter", () -> this.getStartConfOnEnter());
        attributes.put("talk", () -> this.getTalk());
        attributes.put("dtmfPassThrough", () -> this.getDtmfPassThrough());
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
