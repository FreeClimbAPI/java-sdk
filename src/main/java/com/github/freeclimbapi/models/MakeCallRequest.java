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
import java.net.URI;
import java.util.*;
import java.util.Objects;

/** MakeCallRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MakeCallRequest {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_FROM = "from";

    @SerializedName(SERIALIZED_NAME_FROM)
    private String from;

    public static final String SERIALIZED_NAME_TO = "to";

    @SerializedName(SERIALIZED_NAME_TO)
    private String to;

    public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";

    @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
    private String applicationId;

    public static final String SERIALIZED_NAME_SEND_DIGITS = "sendDigits";

    @SerializedName(SERIALIZED_NAME_SEND_DIGITS)
    private String sendDigits;

    public static final String SERIALIZED_NAME_IF_MACHINE = "ifMachine";

    @SerializedName(SERIALIZED_NAME_IF_MACHINE)
    private String ifMachine;

    public static final String SERIALIZED_NAME_IF_MACHINE_URL = "ifMachineUrl";

    @SerializedName(SERIALIZED_NAME_IF_MACHINE_URL)
    private URI ifMachineUrl;

    public static final String SERIALIZED_NAME_TIMEOUT = "timeout";

    @SerializedName(SERIALIZED_NAME_TIMEOUT)
    private Integer timeout = 30;

    public static final String SERIALIZED_NAME_PARENT_CALL_ID = "parentCallId";

    @SerializedName(SERIALIZED_NAME_PARENT_CALL_ID)
    private String parentCallId;

    public static final String SERIALIZED_NAME_PRIVACY_MODE = "privacyMode";

    @SerializedName(SERIALIZED_NAME_PRIVACY_MODE)
    private Boolean privacyMode;

    public static final String SERIALIZED_NAME_CALL_CONNECT_URL = "callConnectUrl";

    @SerializedName(SERIALIZED_NAME_CALL_CONNECT_URL)
    private URI callConnectUrl;

    public MakeCallRequest() {}

    public MakeCallRequest from(String from) {

        this.from = from;
        return this;
    }

    /**
     * Phone number to use as the caller ID. This can be: (a) The To or From number provided in
     * FreeClimb&#39;s initial request to your app or (b) Any incoming phone number you have
     * purchased from FreeClimb.
     *
     * @return from
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value =
                    "Phone number to use as the caller ID. This can be: (a) The To or From number"
                        + " provided in FreeClimb's initial request to your app or (b) Any incoming"
                        + " phone number you have purchased from FreeClimb.")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public MakeCallRequest to(String to) {

        this.to = to;
        return this;
    }

    /**
     * Phone number to place the Call to.
     *
     * @return to
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Phone number to place the Call to.")
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public MakeCallRequest applicationId(String applicationId) {

        this.applicationId = applicationId;
        return this;
    }

    /**
     * Required if no &#x60;parentCallId&#x60; or &#x60;callConnectUrl&#x60; has been provided. ID
     * of the application FreeClimb should use to handle this phone call. FreeClimb will use the
     * &#x60;callConnectUrl&#x60; and &#x60;statusCallbackUrl&#x60; set on the application unless
     * the &#x60;callConnectUrl&#x60; attribute is also provided with the request. In this case, the
     * URL specified in that &#x60;callConnectUrl&#x60; attribute will be used as a replacement of
     * the &#x60;callConnectUrl&#x60; originally assigned in the application. If the
     * &#x60;callConnectUrl&#x60; is not set as either an attribute of the request or as part of the
     * specified application, an error will be provided. The application’s voiceUrl parameter is not
     * used for outbound calls.
     *
     * @return applicationId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Required if no `parentCallId` or `callConnectUrl` has been provided. ID of the"
                        + " application FreeClimb should use to handle this phone call. FreeClimb"
                        + " will use the `callConnectUrl` and `statusCallbackUrl` set on the"
                        + " application unless the `callConnectUrl` attribute is also provided with"
                        + " the request. In this case, the URL specified in that `callConnectUrl`"
                        + " attribute will be used as a replacement of the `callConnectUrl`"
                        + " originally assigned in the application. If the `callConnectUrl` is not"
                        + " set as either an attribute of the request or as part of the specified"
                        + " application, an error will be provided. The application’s voiceUrl"
                        + " parameter is not used for outbound calls.")
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public MakeCallRequest sendDigits(String sendDigits) {

        this.sendDigits = sendDigits;
        return this;
    }

    /**
     * String of digits to dial after connecting to the number. It can include digits
     * &#x60;0-9&#x60;, &#x60;*&#x60;, and &#x60;#&#x60;, and allows embedding a pause between the
     * output of individual digits. The default pause is 500 milliseconds. So, a string such as
     * *1234#* will be played in 2 seconds because of the 4 standard pauses implied within the
     * string. A custom pause is specified by including a positive integer wrapped in curly braces:
     * {n}. For more information, see **sendDigits examples** below.
     *
     * @return sendDigits
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "String of digits to dial after connecting to the number. It can include digits"
                        + " `0-9`, `*`, and `#`, and allows embedding a pause between the output of"
                        + " individual digits. The default pause is 500 milliseconds. So, a string"
                        + " such as *1234#* will be played in 2 seconds because of the 4 standard"
                        + " pauses implied within the string. A custom pause is specified by"
                        + " including a positive integer wrapped in curly braces: {n}. For more"
                        + " information, see **sendDigits examples** below.")
    public String getSendDigits() {
        return sendDigits;
    }

    public void setSendDigits(String sendDigits) {
        this.sendDigits = sendDigits;
    }

    public MakeCallRequest ifMachine(String ifMachine) {

        this.ifMachine = ifMachine;
        return this;
    }

    /**
     * Specifies how FreeClimb should handle this Call if an answering machine answers it.
     *
     * @return ifMachine
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Specifies how FreeClimb should handle this Call if an answering machine"
                            + " answers it.")
    public String getIfMachine() {
        return ifMachine;
    }

    public void setIfMachine(String ifMachine) {
        this.ifMachine = ifMachine;
    }

    public MakeCallRequest ifMachineUrl(URI ifMachineUrl) {

        this.ifMachineUrl = ifMachineUrl;
        return this;
    }

    /**
     * This attribute specifies a URL to which FreeClimb will make a POST request when an answering
     * machine or a fax machine is detected. This URL is required if the ifMachine flag is set to
     * redirect. When ifMachine is set to hangup, ifMachineUrl must not be included in the request.
     * For more information, see **ifMachineUrl example** below.
     *
     * @return ifMachineUrl
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "This attribute specifies a URL to which FreeClimb will make a POST request"
                        + " when an answering machine or a fax machine is detected. This URL is"
                        + " required if the ifMachine flag is set to redirect. When ifMachine is"
                        + " set to hangup, ifMachineUrl must not be included in the request. For"
                        + " more information, see **ifMachineUrl example** below.")
    public URI getIfMachineUrl() {
        return ifMachineUrl;
    }

    public void setIfMachineUrl(URI ifMachineUrl) {
        this.ifMachineUrl = ifMachineUrl;
    }

    public MakeCallRequest timeout(Integer timeout) {

        this.timeout = timeout;
        return this;
    }

    /**
     * Number of seconds that FreeClimb should allow the phone to ring before assuming there is no
     * answer. Default is 30 seconds. Maximum allowed ring-time is determined by the target
     * phone&#39;s provider. Note that most providers limit ring-time to 120 seconds.
     *
     * @return timeout
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Number of seconds that FreeClimb should allow the phone to ring before"
                        + " assuming there is no answer. Default is 30 seconds. Maximum allowed"
                        + " ring-time is determined by the target phone's provider. Note that most"
                        + " providers limit ring-time to 120 seconds.")
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public MakeCallRequest parentCallId(String parentCallId) {

        this.parentCallId = parentCallId;
        return this;
    }

    /**
     * Required if no &#x60;applicationId&#x60; or &#x60;callConnectUrl&#x60; has been provided. The
     * ID of the parent Call in the case that this new Call is meant to be treated as a child of an
     * existing Call. This attribute should be included when possible to reduce latency when adding
     * child calls to Conferences containing the parent Call. A call can only be used as a parent
     * once the call is in progress or as an inbound call that is still ringing. An outbound call is
     * considered to be in progress once the &#x60;outdialConnect&#x60; or
     * &#x60;outdialApiConnect&#x60; webhook is invoked. An inbound call is ringing when the inbound
     * webhook is invoked. If a &#x60;callConnectUrl&#x60; attribute is also included with the
     * &#x60;parentCallId&#x60; in the request, this URL will be used as a replacement of the
     * &#x60;callConnectUrl&#x60; originally assigned in the parent call.
     *
     * @return parentCallId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Required if no `applicationId` or `callConnectUrl` has been provided. The ID"
                        + " of the parent Call in the case that this new Call is meant to be"
                        + " treated as a child of an existing Call. This attribute should be"
                        + " included when possible to reduce latency when adding child calls to"
                        + " Conferences containing the parent Call. A call can only be used as a"
                        + " parent once the call is in progress or as an inbound call that is still"
                        + " ringing. An outbound call is considered to be in progress once the"
                        + " `outdialConnect` or `outdialApiConnect` webhook is invoked. An inbound"
                        + " call is ringing when the inbound webhook is invoked. If a"
                        + " `callConnectUrl` attribute is also included with the `parentCallId` in"
                        + " the request, this URL will be used as a replacement of the"
                        + " `callConnectUrl` originally assigned in the parent call.")
    public String getParentCallId() {
        return parentCallId;
    }

    public void setParentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
    }

    public MakeCallRequest privacyMode(Boolean privacyMode) {

        this.privacyMode = privacyMode;
        return this;
    }

    /**
     * Activate privacy mode in order to obscure log data that can potentially expose private
     * information.
     *
     * @return privacyMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Activate privacy mode in order to obscure log data that can potentially expose"
                            + " private information.")
    public Boolean getPrivacyMode() {
        return privacyMode;
    }

    public void setPrivacyMode(Boolean privacyMode) {
        this.privacyMode = privacyMode;
    }

    public MakeCallRequest callConnectUrl(URI callConnectUrl) {

        this.callConnectUrl = callConnectUrl;
        return this;
    }

    /**
     * The URL that FreeClimb should use to handle this phone call. If an applicationId or
     * parentCallId have already been provided, this callConnectUrl attribute will be used as a
     * replacement of the callConnectUrl originally assigned in the application or parent call.
     *
     * @return callConnectUrl
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "The URL that FreeClimb should use to handle this phone call. If an"
                        + " applicationId or parentCallId have already been provided, this"
                        + " callConnectUrl attribute will be used as a replacement of the"
                        + " callConnectUrl originally assigned in the application or parent call.")
    public URI getCallConnectUrl() {
        return callConnectUrl;
    }

    public void setCallConnectUrl(URI callConnectUrl) {
        this.callConnectUrl = callConnectUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MakeCallRequest makeCallRequest = (MakeCallRequest) o;
        return Objects.equals(this.from, makeCallRequest.from)
                && Objects.equals(this.to, makeCallRequest.to)
                && Objects.equals(this.applicationId, makeCallRequest.applicationId)
                && Objects.equals(this.sendDigits, makeCallRequest.sendDigits)
                && Objects.equals(this.ifMachine, makeCallRequest.ifMachine)
                && Objects.equals(this.ifMachineUrl, makeCallRequest.ifMachineUrl)
                && Objects.equals(this.timeout, makeCallRequest.timeout)
                && Objects.equals(this.parentCallId, makeCallRequest.parentCallId)
                && Objects.equals(this.privacyMode, makeCallRequest.privacyMode)
                && Objects.equals(this.callConnectUrl, makeCallRequest.callConnectUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from,
                to,
                applicationId,
                sendDigits,
                ifMachine,
                ifMachineUrl,
                timeout,
                parentCallId,
                privacyMode,
                callConnectUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MakeCallRequest {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    sendDigits: ").append(toIndentedString(sendDigits)).append("\n");
        sb.append("    ifMachine: ").append(toIndentedString(ifMachine)).append("\n");
        sb.append("    ifMachineUrl: ").append(toIndentedString(ifMachineUrl)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    parentCallId: ").append(toIndentedString(parentCallId)).append("\n");
        sb.append("    privacyMode: ").append(toIndentedString(privacyMode)).append("\n");
        sb.append("    callConnectUrl: ").append(toIndentedString(callConnectUrl)).append("\n");
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
