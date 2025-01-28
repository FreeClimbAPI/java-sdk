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

/** The RecordUtterance command has completed and its actionUrl is being invoked. */
@ApiModel(
        description =
                "The RecordUtterance command has completed and its actionUrl is being invoked.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecordWebhook extends Webhook {
    public static RecordWebhook deserialize(String payload) {
        return (RecordWebhook) (new JSON().getGson().fromJson(payload, Webhook.class));
    }

    public static String getDiscriminatorValue() {
        return "record";
    }

    public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";

    @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
    protected String requestType;

    public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_CALL_ID = "callId";

    @SerializedName(SERIALIZED_NAME_CALL_ID)
    private String callId;

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

    public static final String SERIALIZED_NAME_RECORDING_ID = "recordingId";

    @SerializedName(SERIALIZED_NAME_RECORDING_ID)
    private String recordingId;

    public static final String SERIALIZED_NAME_RECORDING_URL = "recordingUrl";

    @SerializedName(SERIALIZED_NAME_RECORDING_URL)
    private URI recordingUrl;

    public static final String SERIALIZED_NAME_RECORDING_SIZE = "recordingSize";

    @SerializedName(SERIALIZED_NAME_RECORDING_SIZE)
    private String recordingSize;

    public static final String SERIALIZED_NAME_RECORDING_FORMAT = "recordingFormat";

    @SerializedName(SERIALIZED_NAME_RECORDING_FORMAT)
    private String recordingFormat;

    public static final String SERIALIZED_NAME_RECORDING_DURATION_SEC = "recordingDurationSec";

    @SerializedName(SERIALIZED_NAME_RECORDING_DURATION_SEC)
    private Integer recordingDurationSec;

    public static final String SERIALIZED_NAME_TERM_REASON = "termReason";

    @SerializedName(SERIALIZED_NAME_TERM_REASON)
    private RecordUtteranceTermReason termReason;

    public static final String SERIALIZED_NAME_PARENT_CALL_ID = "parentCallId";

    @SerializedName(SERIALIZED_NAME_PARENT_CALL_ID)
    private String parentCallId;

    public static final String SERIALIZED_NAME_PRIVACY_MODE = "privacyMode";

    @SerializedName(SERIALIZED_NAME_PRIVACY_MODE)
    private Boolean privacyMode;

    public RecordWebhook() {
        this.requestType = this.getClass().getSimpleName();
    }

    public RecordWebhook requestType(String requestType) {

        this.requestType = requestType;
        return this;
    }

    /**
     * The context or reason why this request is being made. Will be record - The RecordUtterance
     * command has completed and its actionUrl is being invoked.
     *
     * @return requestType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "The context or reason why this request is being made. Will be record - The"
                            + " RecordUtterance command has completed and its actionUrl is being"
                            + " invoked.")
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public RecordWebhook accountId(String accountId) {

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

    public RecordWebhook callId(String callId) {

        this.callId = callId;
        return this;
    }

    /**
     * Unique identifier for this Call, generated by FreeClimb
     *
     * @return callId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Unique identifier for this Call, generated by FreeClimb")
    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public RecordWebhook from(String from) {

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

    public RecordWebhook to(String to) {

        this.to = to;
        return this;
    }

    /**
     * Phone number provisioned to the customer and to which this Call is directed (in E.164
     * format).
     *
     * @return to
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Phone number provisioned to the customer and to which this Call is directed"
                            + " (in E.164 format).")
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public RecordWebhook callStatus(CallStatus callStatus) {

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

    public RecordWebhook direction(CallDirection direction) {

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

    public RecordWebhook conferenceId(String conferenceId) {

        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * This is only populated if request pertains to a conference. Otherwise, it is set to null.
     *
     * @return conferenceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "This is only populated if request pertains to a conference. Otherwise, it is"
                            + " set to null.")
    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public RecordWebhook queueId(String queueId) {

        this.queueId = queueId;
        return this;
    }

    /**
     * This is only populated if the request pertains to a queue. Otherwise, it is set to null.
     *
     * @return queueId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "This is only populated if the request pertains to a queue. Otherwise, it is"
                            + " set to null.")
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public RecordWebhook recordingId(String recordingId) {

        this.recordingId = recordingId;
        return this;
    }

    /**
     * ID of the recording.
     *
     * @return recordingId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of the recording.")
    public String getRecordingId() {
        return recordingId;
    }

    public void setRecordingId(String recordingId) {
        this.recordingId = recordingId;
    }

    public RecordWebhook recordingUrl(URI recordingUrl) {

        this.recordingUrl = recordingUrl;
        return this;
    }

    /**
     * URL of the recorded audio file. This URL can be used as is in a Play command to play the
     * recording (no authentication needed). It can also be used to download a recording file via
     * the REST API.
     *
     * @return recordingUrl
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "URL of the recorded audio file. This URL can be used as is in a Play command"
                        + " to play the recording (no authentication needed). It can also be used"
                        + " to download a recording file via the REST API.")
    public URI getRecordingUrl() {
        return recordingUrl;
    }

    public void setRecordingUrl(URI recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    public RecordWebhook recordingSize(String recordingSize) {

        this.recordingSize = recordingSize;
        return this;
    }

    /**
     * Size of the recording in bytes
     *
     * @return recordingSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Size of the recording in bytes")
    public String getRecordingSize() {
        return recordingSize;
    }

    public void setRecordingSize(String recordingSize) {
        this.recordingSize = recordingSize;
    }

    public RecordWebhook recordingFormat(String recordingFormat) {

        this.recordingFormat = recordingFormat;
        return this;
    }

    /**
     * File type of the recording (audio/wav)
     *
     * @return recordingFormat
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "File type of the recording (audio/wav)")
    public String getRecordingFormat() {
        return recordingFormat;
    }

    public void setRecordingFormat(String recordingFormat) {
        this.recordingFormat = recordingFormat;
    }

    public RecordWebhook recordingDurationSec(Integer recordingDurationSec) {

        this.recordingDurationSec = recordingDurationSec;
        return this;
    }

    /**
     * Duration of the recorded audio rounded up to the nearest second (in seconds)
     *
     * @return recordingDurationSec
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value = "Duration of the recorded audio rounded up to the nearest second (in seconds)")
    public Integer getRecordingDurationSec() {
        return recordingDurationSec;
    }

    public void setRecordingDurationSec(Integer recordingDurationSec) {
        this.recordingDurationSec = recordingDurationSec;
    }

    public RecordWebhook termReason(RecordUtteranceTermReason termReason) {

        this.termReason = termReason;
        return this;
    }

    /**
     * Get termReason
     *
     * @return termReason
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public RecordUtteranceTermReason getTermReason() {
        return termReason;
    }

    public void setTermReason(RecordUtteranceTermReason termReason) {
        this.termReason = termReason;
    }

    public RecordWebhook parentCallId(String parentCallId) {

        this.parentCallId = parentCallId;
        return this;
    }

    /**
     * ID of Call that created this leg (child call).
     *
     * @return parentCallId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of Call that created this leg (child call).")
    public String getParentCallId() {
        return parentCallId;
    }

    public void setParentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
    }

    public RecordWebhook privacyMode(Boolean privacyMode) {

        this.privacyMode = privacyMode;
        return this;
    }

    /**
     * If true then it indicates the recording will only be available for download for two minutes
     * prior to it being deleted. This is to minimize risk of anyone else getting access to the url
     * and attempting to access it.
     *
     * @return privacyMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "If true then it indicates the recording will only be available for download"
                        + " for two minutes prior to it being deleted. This is to minimize risk of"
                        + " anyone else getting access to the url and attempting to access it.")
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
        RecordWebhook recordWebhook = (RecordWebhook) o;
        return Objects.equals(this.requestType, recordWebhook.requestType)
                && Objects.equals(this.accountId, recordWebhook.accountId)
                && Objects.equals(this.callId, recordWebhook.callId)
                && Objects.equals(this.from, recordWebhook.from)
                && Objects.equals(this.to, recordWebhook.to)
                && Objects.equals(this.callStatus, recordWebhook.callStatus)
                && Objects.equals(this.direction, recordWebhook.direction)
                && Objects.equals(this.conferenceId, recordWebhook.conferenceId)
                && Objects.equals(this.queueId, recordWebhook.queueId)
                && Objects.equals(this.recordingId, recordWebhook.recordingId)
                && Objects.equals(this.recordingUrl, recordWebhook.recordingUrl)
                && Objects.equals(this.recordingSize, recordWebhook.recordingSize)
                && Objects.equals(this.recordingFormat, recordWebhook.recordingFormat)
                && Objects.equals(this.recordingDurationSec, recordWebhook.recordingDurationSec)
                && Objects.equals(this.termReason, recordWebhook.termReason)
                && Objects.equals(this.parentCallId, recordWebhook.parentCallId)
                && Objects.equals(this.privacyMode, recordWebhook.privacyMode)
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
                accountId,
                callId,
                from,
                to,
                callStatus,
                direction,
                conferenceId,
                queueId,
                recordingId,
                recordingUrl,
                recordingSize,
                recordingFormat,
                recordingDurationSec,
                termReason,
                parentCallId,
                privacyMode,
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
        sb.append("class RecordWebhook {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    callStatus: ").append(toIndentedString(callStatus)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
        sb.append("    recordingUrl: ").append(toIndentedString(recordingUrl)).append("\n");
        sb.append("    recordingSize: ").append(toIndentedString(recordingSize)).append("\n");
        sb.append("    recordingFormat: ").append(toIndentedString(recordingFormat)).append("\n");
        sb.append("    recordingDurationSec: ")
                .append(toIndentedString(recordingDurationSec))
                .append("\n");
        sb.append("    termReason: ").append(toIndentedString(termReason)).append("\n");
        sb.append("    parentCallId: ").append(toIndentedString(parentCallId)).append("\n");
        sb.append("    privacyMode: ").append(toIndentedString(privacyMode)).append("\n");
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
