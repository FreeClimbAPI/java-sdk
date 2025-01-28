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

/** MessageResultAllOfTfn */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessageResultAllOfTfn {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";

    @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
    private String campaignId;

    public MessageResultAllOfTfn() {}

    public MessageResultAllOfTfn campaignId(String campaignId) {

        this.campaignId = campaignId;
        return this;
    }

    /**
     * TFNCampaignId
     *
     * @return campaignId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            example = "cmptfn_387ec3f6e03b340553f35f29c8f118cdf3eae08a",
            required = true,
            value = "TFNCampaignId")
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageResultAllOfTfn messageResultAllOfTfn = (MessageResultAllOfTfn) o;
        return Objects.equals(this.campaignId, messageResultAllOfTfn.campaignId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageResultAllOfTfn {\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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
