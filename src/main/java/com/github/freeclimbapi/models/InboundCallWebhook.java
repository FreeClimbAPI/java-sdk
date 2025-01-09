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
import java.util.*;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An inbound Call to a number registered on FreeClimb will trigger a request to the voiceUrl of the
 * application the number is assigned to. FreeClimb expects to receive PerCL in response to this
 * request in order to process the Call. The following parameters are sent as the POST body.
 */
@ApiModel(
        description =
                "An inbound Call to a number registered on FreeClimb will trigger a request to the"
                    + " voiceUrl of the application the number is assigned to. FreeClimb expects to"
                    + " receive PerCL in response to this request in order to process the Call. The"
                    + " following parameters are sent as the POST body.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InboundCallWebhook extends Webhook {
    public static InboundCallWebhook deserialize(String payload) {
        return (InboundCallWebhook) (new JSON().getGson().fromJson(payload, Webhook.class));
    }

    public static String getDiscriminatorValue() {
        return "inboundCall";
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

    public static final String SERIALIZED_NAME_PARENT_CALL_ID = "parentCallId";

    @SerializedName(SERIALIZED_NAME_PARENT_CALL_ID)
    private String parentCallId;

    public InboundCallWebhook() {
        this.requestType = this.getClass().getSimpleName();
    }

    public InboundCallWebhook requestType(String requestType) {

        this.requestType = requestType;
        return this;
    }

    /**
     * Context or reason why this request is being made. Will be inboundCall - An inbound call was
     * received and the voiceUrl is being invoked.
     *
     * @return requestType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Context or reason why this request is being made. Will be inboundCall - An"
                            + " inbound call was received and the voiceUrl is being invoked.")
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public InboundCallWebhook callId(String callId) {

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

    public InboundCallWebhook accountId(String accountId) {

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

    public InboundCallWebhook from(String from) {

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

    public InboundCallWebhook to(String to) {

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

    public InboundCallWebhook callStatus(CallStatus callStatus) {

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

    public InboundCallWebhook direction(CallDirection direction) {

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

    public InboundCallWebhook conferenceId(String conferenceId) {

        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * This is only populated if request pertains to a Conference. Otherwise, it is set to null.
     *
     * @return conferenceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "This is only populated if request pertains to a Conference. Otherwise, it is"
                            + " set to null.")
    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public InboundCallWebhook queueId(String queueId) {

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

    public InboundCallWebhook parentCallId(String parentCallId) {

        this.parentCallId = parentCallId;
        return this;
    }

    /**
     * Get parentCallId
     *
     * @return parentCallId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentCallId() {
        return parentCallId;
    }

    public void setParentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InboundCallWebhook inboundCallWebhook = (InboundCallWebhook) o;
        return Objects.equals(this.requestType, inboundCallWebhook.requestType)
                && Objects.equals(this.callId, inboundCallWebhook.callId)
                && Objects.equals(this.accountId, inboundCallWebhook.accountId)
                && Objects.equals(this.from, inboundCallWebhook.from)
                && Objects.equals(this.to, inboundCallWebhook.to)
                && Objects.equals(this.callStatus, inboundCallWebhook.callStatus)
                && Objects.equals(this.direction, inboundCallWebhook.direction)
                && Objects.equals(this.conferenceId, inboundCallWebhook.conferenceId)
                && Objects.equals(this.queueId, inboundCallWebhook.queueId)
                && Objects.equals(this.parentCallId, inboundCallWebhook.parentCallId)
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
                parentCallId,
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
        sb.append("class InboundCallWebhook {\n");
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
        sb.append("    parentCallId: ").append(toIndentedString(parentCallId)).append("\n");
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
