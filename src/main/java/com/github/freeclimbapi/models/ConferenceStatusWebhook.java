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

import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.enums.*;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.*;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The context or reason why this request is being made. Will be conferenceStatus - A
 * Conference&#39;s status changed and its statusCallbackUrl is being invoked.
 */
@ApiModel(
        description =
                "The context or reason why this request is being made. Will be conferenceStatus - A"
                    + " Conference's status changed and its statusCallbackUrl is being invoked.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConferenceStatusWebhook extends Webhook {
    public static ConferenceStatusWebhook deserialize(String payload) {
        return (ConferenceStatusWebhook) (new JSON().getGson().fromJson(payload, Webhook.class));
    }

    public static String getDiscriminatorValue() {
        return "conferenceStatus";
    }

    public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";

    @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
    protected String requestType;

    public static final String SERIALIZED_NAME_CALL_ID = "callId";

    @SerializedName(SERIALIZED_NAME_CALL_ID)
    private String callId;

    public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_FROM = "from";

    @SerializedName(SERIALIZED_NAME_FROM)
    private String from;

    public static final String SERIALIZED_NAME_TO = "to";

    @SerializedName(SERIALIZED_NAME_TO)
    private String to;

    public static final String SERIALIZED_NAME_CALL_STATUS = "callStatus";

    @SerializedName(SERIALIZED_NAME_CALL_STATUS)
    private CallStatus callStatus;

    public static final String SERIALIZED_NAME_DIRECTION = "direction";

    @SerializedName(SERIALIZED_NAME_DIRECTION)
    private CallDirection direction;

    public static final String SERIALIZED_NAME_CONFERENCE_ID = "conferenceId";

    @SerializedName(SERIALIZED_NAME_CONFERENCE_ID)
    private String conferenceId;

    public static final String SERIALIZED_NAME_QUEUE_ID = "queueId";

    @SerializedName(SERIALIZED_NAME_QUEUE_ID)
    private String queueId;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private ConferenceStatus status;

    public static final String SERIALIZED_NAME_RECORDING_URL = "recordingUrl";

    @SerializedName(SERIALIZED_NAME_RECORDING_URL)
    private URI recordingUrl;

    public static final String SERIALIZED_NAME_RECORDING_ID = "recordingId";

    @SerializedName(SERIALIZED_NAME_RECORDING_ID)
    private String recordingId;

    public static final String SERIALIZED_NAME_RECORDING_DURATION_SEC = "recordingDurationSec";

    @SerializedName(SERIALIZED_NAME_RECORDING_DURATION_SEC)
    private Integer recordingDurationSec;

    public ConferenceStatusWebhook() {
        this.requestType = this.getClass().getSimpleName();
    }

    public ConferenceStatusWebhook requestType(String requestType) {

        this.requestType = requestType;
        return this;
    }

    /**
     * Context or reason why this request is being made. Will be conferenceRecordingStatus - The
     * statusCallbackUrl request includes Recording information for a Conference that ended.
     *
     * @return requestType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Context or reason why this request is being made. Will be"
                            + " conferenceRecordingStatus - The statusCallbackUrl request includes"
                            + " Recording information for a Conference that ended.")
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public ConferenceStatusWebhook callId(String callId) {

        this.callId = callId;
        return this;
    }

    /**
     * Unique ID for this Call, generated by FreeClimb.
     *
     * @return callId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Unique ID for this Call, generated by FreeClimb.")
    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public ConferenceStatusWebhook accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * Account ID associated with your account.
     *
     * @return accountId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Account ID associated with your account.")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public ConferenceStatusWebhook from(String from) {

        this.from = from;
        return this;
    }

    /**
     * Phone number of the party that initiated the Call (in E.164 format).
     *
     * @return from
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value = "Phone number of the party that initiated the Call (in E.164 format).")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ConferenceStatusWebhook to(String to) {

        this.to = to;
        return this;
    }

    /**
     * Phone number provisioned to you and to which this Call is directed (in E.164 format).
     *
     * @return to
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Phone number provisioned to you and to which this Call is directed (in E.164"
                            + " format).")
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ConferenceStatusWebhook callStatus(CallStatus callStatus) {

        this.callStatus = callStatus;
        return this;
    }

    /**
     * Get callStatus
     *
     * @return callStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CallStatus getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(CallStatus callStatus) {
        this.callStatus = callStatus;
    }

    public ConferenceStatusWebhook direction(CallDirection direction) {

        this.direction = direction;
        return this;
    }

    /**
     * Get direction
     *
     * @return direction
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CallDirection getDirection() {
        return direction;
    }

    public void setDirection(CallDirection direction) {
        this.direction = direction;
    }

    public ConferenceStatusWebhook conferenceId(String conferenceId) {

        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * Unique ID of the Conference.
     *
     * @return conferenceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Unique ID of the Conference.")
    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public ConferenceStatusWebhook queueId(String queueId) {

        this.queueId = queueId;
        return this;
    }

    /**
     * This is only populated if the request pertains to a Queue. Otherwise, it is set to null.
     *
     * @return queueId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "This is only populated if the request pertains to a Queue. Otherwise, it is"
                            + " set to null.")
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public ConferenceStatusWebhook status(ConferenceStatus status) {

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
    public ConferenceStatus getStatus() {
        return status;
    }

    public void setStatus(ConferenceStatus status) {
        this.status = status;
    }

    public ConferenceStatusWebhook recordingUrl(URI recordingUrl) {

        this.recordingUrl = recordingUrl;
        return this;
    }

    /**
     * The URL of the Conference’s recorded audio. Populated only if a Recording exists and the
     * Conference was emptied. Present only if statusCallbackUrl is being invoked.
     *
     * @return recordingUrl
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "The URL of the Conference’s recorded audio. Populated only if a Recording"
                            + " exists and the Conference was emptied. Present only if"
                            + " statusCallbackUrl is being invoked.")
    public URI getRecordingUrl() {
        return recordingUrl;
    }

    public void setRecordingUrl(URI recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    public ConferenceStatusWebhook recordingId(String recordingId) {

        this.recordingId = recordingId;
        return this;
    }

    /**
     * The unique ID of the Recording from this Conference. Populated only if a Recording exists and
     * the Conference was emptied. Present only if statusCallbackUrl is being invoked.
     *
     * @return recordingId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "The unique ID of the Recording from this Conference. Populated only if a"
                            + " Recording exists and the Conference was emptied. Present only if"
                            + " statusCallbackUrl is being invoked.")
    public String getRecordingId() {
        return recordingId;
    }

    public void setRecordingId(String recordingId) {
        this.recordingId = recordingId;
    }

    public ConferenceStatusWebhook recordingDurationSec(Integer recordingDurationSec) {

        this.recordingDurationSec = recordingDurationSec;
        return this;
    }

    /**
     * The duration of the recorded audio rounded up to the nearest second (in seconds). Populated
     * only if a Recording exists and the Conference was emptied. Present only if statusCallbackUrl
     * is being invoked.
     *
     * @return recordingDurationSec
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "The duration of the recorded audio rounded up to the nearest second (in"
                        + " seconds). Populated only if a Recording exists and the Conference was"
                        + " emptied. Present only if statusCallbackUrl is being invoked.")
    public Integer getRecordingDurationSec() {
        return recordingDurationSec;
    }

    public void setRecordingDurationSec(Integer recordingDurationSec) {
        this.recordingDurationSec = recordingDurationSec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConferenceStatusWebhook conferenceStatusWebhook = (ConferenceStatusWebhook) o;
        return Objects.equals(this.requestType, conferenceStatusWebhook.requestType)
                && Objects.equals(this.callId, conferenceStatusWebhook.callId)
                && Objects.equals(this.accountId, conferenceStatusWebhook.accountId)
                && Objects.equals(this.from, conferenceStatusWebhook.from)
                && Objects.equals(this.to, conferenceStatusWebhook.to)
                && Objects.equals(this.callStatus, conferenceStatusWebhook.callStatus)
                && Objects.equals(this.direction, conferenceStatusWebhook.direction)
                && Objects.equals(this.conferenceId, conferenceStatusWebhook.conferenceId)
                && Objects.equals(this.queueId, conferenceStatusWebhook.queueId)
                && Objects.equals(this.status, conferenceStatusWebhook.status)
                && Objects.equals(this.recordingUrl, conferenceStatusWebhook.recordingUrl)
                && Objects.equals(this.recordingId, conferenceStatusWebhook.recordingId)
                && Objects.equals(
                        this.recordingDurationSec, conferenceStatusWebhook.recordingDurationSec)
                && super.equals(o);
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
        return Objects.hash(
                requestType,
                callId,
                accountId,
                from,
                to,
                callStatus,
                direction,
                conferenceId,
                queueId,
                status,
                recordingUrl,
                recordingId,
                recordingDurationSec,
                super.hashCode());
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
        sb.append("class ConferenceStatusWebhook {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    callStatus: ").append(toIndentedString(callStatus)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    recordingUrl: ").append(toIndentedString(recordingUrl)).append("\n");
        sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
        sb.append("    recordingDurationSec: ")
                .append(toIndentedString(recordingDurationSec))
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
