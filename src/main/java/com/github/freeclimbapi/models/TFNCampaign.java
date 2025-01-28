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

/** TFNCampaign */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TFNCampaign {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";

    @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
    private String campaignId;

    public static final String SERIALIZED_NAME_USE_CASE = "useCase";

    @SerializedName(SERIALIZED_NAME_USE_CASE)
    private String useCase;

    public static final String SERIALIZED_NAME_REGISTRATION_STATUS = "registrationStatus";

    @SerializedName(SERIALIZED_NAME_REGISTRATION_STATUS)
    private SMSTollFreeCampaignRegistrationStatus registrationStatus;

    public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";

    @SerializedName(SERIALIZED_NAME_DATE_CREATED)
    private String dateCreated;

    public static final String SERIALIZED_NAME_DATE_UPDATED = "dateUpdated";

    @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
    private String dateUpdated;

    public static final String SERIALIZED_NAME_DATE_CREATED_I_S_O = "dateCreatedISO";

    @SerializedName(SERIALIZED_NAME_DATE_CREATED_I_S_O)
    private String dateCreatedISO;

    public static final String SERIALIZED_NAME_DATE_UPDATED_I_S_O = "dateUpdatedISO";

    @SerializedName(SERIALIZED_NAME_DATE_UPDATED_I_S_O)
    private String dateUpdatedISO;

    public static final String SERIALIZED_NAME_REVISION = "revision";

    @SerializedName(SERIALIZED_NAME_REVISION)
    private Integer revision;

    public TFNCampaign() {}

    public TFNCampaign accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * ID of the account that created this participant.
     *
     * @return accountId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(required = true, value = "ID of the account that created this participant.")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public TFNCampaign campaignId(String campaignId) {

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

    public TFNCampaign useCase(String useCase) {

        this.useCase = useCase;
        return this;
    }

    /**
     * Get useCase
     *
     * @return useCase
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    public TFNCampaign registrationStatus(
            SMSTollFreeCampaignRegistrationStatus registrationStatus) {

        this.registrationStatus = registrationStatus;
        return this;
    }

    /**
     * Get registrationStatus
     *
     * @return registrationStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SMSTollFreeCampaignRegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(SMSTollFreeCampaignRegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public TFNCampaign dateCreated(String dateCreated) {

        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * Get dateCreated
     *
     * @return dateCreated
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public TFNCampaign dateUpdated(String dateUpdated) {

        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * Get dateUpdated
     *
     * @return dateUpdated
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public TFNCampaign dateCreatedISO(String dateCreatedISO) {

        this.dateCreatedISO = dateCreatedISO;
        return this;
    }

    /**
     * Get dateCreatedISO
     *
     * @return dateCreatedISO
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDateCreatedISO() {
        return dateCreatedISO;
    }

    public void setDateCreatedISO(String dateCreatedISO) {
        this.dateCreatedISO = dateCreatedISO;
    }

    public TFNCampaign dateUpdatedISO(String dateUpdatedISO) {

        this.dateUpdatedISO = dateUpdatedISO;
        return this;
    }

    /**
     * Get dateUpdatedISO
     *
     * @return dateUpdatedISO
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDateUpdatedISO() {
        return dateUpdatedISO;
    }

    public void setDateUpdatedISO(String dateUpdatedISO) {
        this.dateUpdatedISO = dateUpdatedISO;
    }

    public TFNCampaign revision(Integer revision) {

        this.revision = revision;
        return this;
    }

    /**
     * Get revision
     *
     * @return revision
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TFNCampaign tfNCampaign = (TFNCampaign) o;
        return Objects.equals(this.accountId, tfNCampaign.accountId)
                && Objects.equals(this.campaignId, tfNCampaign.campaignId)
                && Objects.equals(this.useCase, tfNCampaign.useCase)
                && Objects.equals(this.registrationStatus, tfNCampaign.registrationStatus)
                && Objects.equals(this.dateCreated, tfNCampaign.dateCreated)
                && Objects.equals(this.dateUpdated, tfNCampaign.dateUpdated)
                && Objects.equals(this.dateCreatedISO, tfNCampaign.dateCreatedISO)
                && Objects.equals(this.dateUpdatedISO, tfNCampaign.dateUpdatedISO)
                && Objects.equals(this.revision, tfNCampaign.revision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accountId,
                campaignId,
                useCase,
                registrationStatus,
                dateCreated,
                dateUpdated,
                dateCreatedISO,
                dateUpdatedISO,
                revision);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TFNCampaign {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
        sb.append("    registrationStatus: ")
                .append(toIndentedString(registrationStatus))
                .append("\n");
        sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
        sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
        sb.append("    dateCreatedISO: ").append(toIndentedString(dateCreatedISO)).append("\n");
        sb.append("    dateUpdatedISO: ").append(toIndentedString(dateUpdatedISO)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
