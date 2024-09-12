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

import java.util.Objects;
import java.util.Arrays;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import java.io.IOException;
import java.util.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.math.BigDecimal;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.JSON;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * SMSTenDLCCampaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SMSTenDLCCampaign {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_CSP_ID = "cspId";
  @SerializedName(SERIALIZED_NAME_CSP_ID)
  private String cspId;

  public static final String SERIALIZED_NAME_RESELLER_ID = "resellerId";
  @SerializedName(SERIALIZED_NAME_RESELLER_ID)
  private String resellerId;

  /**
   * Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign defaults to ACTIVE status. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_AUTO_RENEWAL = "autoRenewal";
  @SerializedName(SERIALIZED_NAME_AUTO_RENEWAL)
  private Boolean autoRenewal;

  public static final String SERIALIZED_NAME_BILLED_DATE = "billedDate";
  @SerializedName(SERIALIZED_NAME_BILLED_DATE)
  private OffsetDateTime billedDate;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_USECASE = "usecase";
  @SerializedName(SERIALIZED_NAME_USECASE)
  private String usecase;

  public static final String SERIALIZED_NAME_SUB_USECASES = "subUsecases";
  @SerializedName(SERIALIZED_NAME_SUB_USECASES)
  private Set<String> subUsecases = new LinkedHashSet<String>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EMBEDDED_LINK = "embeddedLink";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_LINK)
  private Boolean embeddedLink = false;

  public static final String SERIALIZED_NAME_EMBEDDED_PHONE = "embeddedPhone";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_PHONE)
  private Boolean embeddedPhone = false;

  public static final String SERIALIZED_NAME_AFFILIATE_MARKETING = "affiliateMarketing";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_MARKETING)
  private Boolean affiliateMarketing;

  public static final String SERIALIZED_NAME_NUMBER_POOL = "numberPool";
  @SerializedName(SERIALIZED_NAME_NUMBER_POOL)
  private Boolean numberPool = false;

  public static final String SERIALIZED_NAME_AGE_GATED = "ageGated";
  @SerializedName(SERIALIZED_NAME_AGE_GATED)
  private Boolean ageGated;

  public static final String SERIALIZED_NAME_DIRECT_LENDING = "directLending";
  @SerializedName(SERIALIZED_NAME_DIRECT_LENDING)
  private Boolean directLending;

  public static final String SERIALIZED_NAME_SUBSCRIBER_OPTIN = "subscriberOptin";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_OPTIN)
  private Boolean subscriberOptin = false;

  public static final String SERIALIZED_NAME_SUBSCRIBER_OPTOUT = "subscriberOptout";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_OPTOUT)
  private Boolean subscriberOptout = false;

  public static final String SERIALIZED_NAME_SUBSCRIBER_HELP = "subscriberHelp";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_HELP)
  private Boolean subscriberHelp = false;

  public static final String SERIALIZED_NAME_SAMPLE1 = "sample1";
  @SerializedName(SERIALIZED_NAME_SAMPLE1)
  private String sample1;

  public static final String SERIALIZED_NAME_SAMPLE2 = "sample2";
  @SerializedName(SERIALIZED_NAME_SAMPLE2)
  private String sample2;

  public static final String SERIALIZED_NAME_SAMPLE3 = "sample3";
  @SerializedName(SERIALIZED_NAME_SAMPLE3)
  private String sample3;

  public static final String SERIALIZED_NAME_SAMPLE4 = "sample4";
  @SerializedName(SERIALIZED_NAME_SAMPLE4)
  private String sample4;

  public static final String SERIALIZED_NAME_SAMPLE5 = "sample5";
  @SerializedName(SERIALIZED_NAME_SAMPLE5)
  private String sample5;

  public static final String SERIALIZED_NAME_MESSAGE_FLOW = "messageFlow";
  @SerializedName(SERIALIZED_NAME_MESSAGE_FLOW)
  private String messageFlow;

  public static final String SERIALIZED_NAME_HELP_MESSAGE = "helpMessage";
  @SerializedName(SERIALIZED_NAME_HELP_MESSAGE)
  private String helpMessage;

  public static final String SERIALIZED_NAME_OPTIN_KEYWORDS = "optinKeywords";
  @SerializedName(SERIALIZED_NAME_OPTIN_KEYWORDS)
  private String optinKeywords;

  public static final String SERIALIZED_NAME_OPTOUT_KEYWORDS = "optoutKeywords";
  @SerializedName(SERIALIZED_NAME_OPTOUT_KEYWORDS)
  private String optoutKeywords;

  public static final String SERIALIZED_NAME_HELP_KEYWORDS = "helpKeywords";
  @SerializedName(SERIALIZED_NAME_HELP_KEYWORDS)
  private String helpKeywords;

  public static final String SERIALIZED_NAME_OPTIN_MESSAGE = "optinMessage";
  @SerializedName(SERIALIZED_NAME_OPTIN_MESSAGE)
  private String optinMessage;

  public static final String SERIALIZED_NAME_OPTOUT_MESSAGE = "optoutMessage";
  @SerializedName(SERIALIZED_NAME_OPTOUT_MESSAGE)
  private String optoutMessage;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_MOCK = "mock";
  @SerializedName(SERIALIZED_NAME_MOCK)
  private Boolean mock;

  public static final String SERIALIZED_NAME_NEXT_RENEWAL_OR_EXPIRATION_DATE = "nextRenewalOrExpirationDate";
  @SerializedName(SERIALIZED_NAME_NEXT_RENEWAL_OR_EXPIRATION_DATE)
  private LocalDate nextRenewalOrExpirationDate;

  public SMSTenDLCCampaign() { 
  }

  public SMSTenDLCCampaign accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * ID of the account that created this Queue.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the account that created this Queue.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SMSTenDLCCampaign campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Alphanumeric identifier assigned by the registry for a campaign. This identifier is required by the NetNumber OSR SMS enabling process of 10DLC.
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Alphanumeric identifier assigned by the registry for a campaign. This identifier is required by the NetNumber OSR SMS enabling process of 10DLC.")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public SMSTenDLCCampaign cspId(String cspId) {
    
    this.cspId = cspId;
    return this;
  }

   /**
   * Alphanumeric identifier of the CSP associated with this campaign.
   * @return cspId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Alphanumeric identifier of the CSP associated with this campaign.")

  public String getCspId() {
    return cspId;
  }


  public void setCspId(String cspId) {
    this.cspId = cspId;
  }


  public SMSTenDLCCampaign resellerId(String resellerId) {
    
    this.resellerId = resellerId;
    return this;
  }

   /**
   * Alphanumeric identifier of the reseller that you want to associate with this campaign.
   * @return resellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alphanumeric identifier of the reseller that you want to associate with this campaign.")

  public String getResellerId() {
    return resellerId;
  }


  public void setResellerId(String resellerId) {
    this.resellerId = resellerId;
  }


  public SMSTenDLCCampaign status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign defaults to ACTIVE status. 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign defaults to ACTIVE status. ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SMSTenDLCCampaign createDate(OffsetDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Unix timestamp when campaign was created.
   * @return createDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp when campaign was created.")

  public OffsetDateTime getCreateDate() {
    return createDate;
  }


  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public SMSTenDLCCampaign autoRenewal(Boolean autoRenewal) {
    
    this.autoRenewal = autoRenewal;
    return this;
  }

   /**
   * Campaign subscription auto-renewal status.
   * @return autoRenewal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Campaign subscription auto-renewal status.")

  public Boolean getAutoRenewal() {
    return autoRenewal;
  }


  public void setAutoRenewal(Boolean autoRenewal) {
    this.autoRenewal = autoRenewal;
  }


  public SMSTenDLCCampaign billedDate(OffsetDateTime billedDate) {
    
    this.billedDate = billedDate;
    return this;
  }

   /**
   * Campaign recent billed date.
   * @return billedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Campaign recent billed date.")

  public OffsetDateTime getBilledDate() {
    return billedDate;
  }


  public void setBilledDate(OffsetDateTime billedDate) {
    this.billedDate = billedDate;
  }


  public SMSTenDLCCampaign brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * Alphanumeric identifier of the brand associated with this campaign.
   * @return brandId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Alphanumeric identifier of the brand associated with this campaign.")

  public String getBrandId() {
    return brandId;
  }


  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public SMSTenDLCCampaign usecase(String usecase) {
    
    this.usecase = usecase;
    return this;
  }

   /**
   * Campaign usecase. Must be of defined valid types. Use &#x60;/registry/enum/usecase&#x60; operation to retrieve usecases available for given brand.
   * @return usecase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Campaign usecase. Must be of defined valid types. Use `/registry/enum/usecase` operation to retrieve usecases available for given brand.")

  public String getUsecase() {
    return usecase;
  }


  public void setUsecase(String usecase) {
    this.usecase = usecase;
  }


  public SMSTenDLCCampaign subUsecases(Set<String> subUsecases) {
    
    this.subUsecases = subUsecases;
    return this;
  }

  public SMSTenDLCCampaign addSubUsecasesItem(String subUsecasesItem) {
    this.subUsecases.add(subUsecasesItem);
    return this;
  }

   /**
   * Campaign sub-usecases. Must be of defined valid sub-usecase types. Use &#x60;/registry/enum/usecase&#x60; operation to retrieve list of valid sub-usecases
   * @return subUsecases
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Campaign sub-usecases. Must be of defined valid sub-usecase types. Use `/registry/enum/usecase` operation to retrieve list of valid sub-usecases")

  public Set<String> getSubUsecases() {
    return subUsecases;
  }


  public void setSubUsecases(Set<String> subUsecases) {
    this.subUsecases = subUsecases;
  }


  public SMSTenDLCCampaign description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Summary description of this campaign.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Summary description of this campaign.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SMSTenDLCCampaign embeddedLink(Boolean embeddedLink) {
    
    this.embeddedLink = embeddedLink;
    return this;
  }

   /**
   * Does message generated by the campaign include URL link in SMS?
   * @return embeddedLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does message generated by the campaign include URL link in SMS?")

  public Boolean getEmbeddedLink() {
    return embeddedLink;
  }


  public void setEmbeddedLink(Boolean embeddedLink) {
    this.embeddedLink = embeddedLink;
  }


  public SMSTenDLCCampaign embeddedPhone(Boolean embeddedPhone) {
    
    this.embeddedPhone = embeddedPhone;
    return this;
  }

   /**
   * Does message generated by the campaign include phone number in SMS?
   * @return embeddedPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does message generated by the campaign include phone number in SMS?")

  public Boolean getEmbeddedPhone() {
    return embeddedPhone;
  }


  public void setEmbeddedPhone(Boolean embeddedPhone) {
    this.embeddedPhone = embeddedPhone;
  }


  public SMSTenDLCCampaign affiliateMarketing(Boolean affiliateMarketing) {
    
    this.affiliateMarketing = affiliateMarketing;
    return this;
  }

   /**
   * Does message content controlled by affiliate marketing other than the brand?
   * @return affiliateMarketing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does message content controlled by affiliate marketing other than the brand?")

  public Boolean getAffiliateMarketing() {
    return affiliateMarketing;
  }


  public void setAffiliateMarketing(Boolean affiliateMarketing) {
    this.affiliateMarketing = affiliateMarketing;
  }


  public SMSTenDLCCampaign numberPool(Boolean numberPool) {
    
    this.numberPool = numberPool;
    return this;
  }

   /**
   * Does campaign utilize pool of phone nubers?
   * @return numberPool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does campaign utilize pool of phone nubers?")

  public Boolean getNumberPool() {
    return numberPool;
  }


  public void setNumberPool(Boolean numberPool) {
    this.numberPool = numberPool;
  }


  public SMSTenDLCCampaign ageGated(Boolean ageGated) {
    
    this.ageGated = ageGated;
    return this;
  }

   /**
   * Age gated content in campaign.
   * @return ageGated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Age gated content in campaign.")

  public Boolean getAgeGated() {
    return ageGated;
  }


  public void setAgeGated(Boolean ageGated) {
    this.ageGated = ageGated;
  }


  public SMSTenDLCCampaign directLending(Boolean directLending) {
    
    this.directLending = directLending;
    return this;
  }

   /**
   * Get directLending
   * @return directLending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDirectLending() {
    return directLending;
  }


  public void setDirectLending(Boolean directLending) {
    this.directLending = directLending;
  }


  public SMSTenDLCCampaign subscriberOptin(Boolean subscriberOptin) {
    
    this.subscriberOptin = subscriberOptin;
    return this;
  }

   /**
   * Does campaign require subscriber to opt-in before SMS is sent to subscriber?
   * @return subscriberOptin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does campaign require subscriber to opt-in before SMS is sent to subscriber?")

  public Boolean getSubscriberOptin() {
    return subscriberOptin;
  }


  public void setSubscriberOptin(Boolean subscriberOptin) {
    this.subscriberOptin = subscriberOptin;
  }


  public SMSTenDLCCampaign subscriberOptout(Boolean subscriberOptout) {
    
    this.subscriberOptout = subscriberOptout;
    return this;
  }

   /**
   * Does campaign support subscriber opt-out keyword(s)?
   * @return subscriberOptout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does campaign support subscriber opt-out keyword(s)?")

  public Boolean getSubscriberOptout() {
    return subscriberOptout;
  }


  public void setSubscriberOptout(Boolean subscriberOptout) {
    this.subscriberOptout = subscriberOptout;
  }


  public SMSTenDLCCampaign subscriberHelp(Boolean subscriberHelp) {
    
    this.subscriberHelp = subscriberHelp;
    return this;
  }

   /**
   * Does campaign responds to help keyword(s)?
   * @return subscriberHelp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does campaign responds to help keyword(s)?")

  public Boolean getSubscriberHelp() {
    return subscriberHelp;
  }


  public void setSubscriberHelp(Boolean subscriberHelp) {
    this.subscriberHelp = subscriberHelp;
  }


  public SMSTenDLCCampaign sample1(String sample1) {
    
    this.sample1 = sample1;
    return this;
  }

   /**
   * Message sample. Some campaign tiers require 1 or more message samples.
   * @return sample1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message sample. Some campaign tiers require 1 or more message samples.")

  public String getSample1() {
    return sample1;
  }


  public void setSample1(String sample1) {
    this.sample1 = sample1;
  }


  public SMSTenDLCCampaign sample2(String sample2) {
    
    this.sample2 = sample2;
    return this;
  }

   /**
   * Message sample. Some campaign tiers require 2 or more message samples.
   * @return sample2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message sample. Some campaign tiers require 2 or more message samples.")

  public String getSample2() {
    return sample2;
  }


  public void setSample2(String sample2) {
    this.sample2 = sample2;
  }


  public SMSTenDLCCampaign sample3(String sample3) {
    
    this.sample3 = sample3;
    return this;
  }

   /**
   * Message sample. Some campaign tiers require 3 or more message samples.
   * @return sample3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message sample. Some campaign tiers require 3 or more message samples.")

  public String getSample3() {
    return sample3;
  }


  public void setSample3(String sample3) {
    this.sample3 = sample3;
  }


  public SMSTenDLCCampaign sample4(String sample4) {
    
    this.sample4 = sample4;
    return this;
  }

   /**
   * Message sample. Some campaign tiers require 4 or more message samples.
   * @return sample4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message sample. Some campaign tiers require 4 or more message samples.")

  public String getSample4() {
    return sample4;
  }


  public void setSample4(String sample4) {
    this.sample4 = sample4;
  }


  public SMSTenDLCCampaign sample5(String sample5) {
    
    this.sample5 = sample5;
    return this;
  }

   /**
   * Message sample. Some campaign tiers require 5 or more message samples.
   * @return sample5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message sample. Some campaign tiers require 5 or more message samples.")

  public String getSample5() {
    return sample5;
  }


  public void setSample5(String sample5) {
    this.sample5 = sample5;
  }


  public SMSTenDLCCampaign messageFlow(String messageFlow) {
    
    this.messageFlow = messageFlow;
    return this;
  }

   /**
   * Message flow description.
   * @return messageFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message flow description.")

  public String getMessageFlow() {
    return messageFlow;
  }


  public void setMessageFlow(String messageFlow) {
    this.messageFlow = messageFlow;
  }


  public SMSTenDLCCampaign helpMessage(String helpMessage) {
    
    this.helpMessage = helpMessage;
    return this;
  }

   /**
   * Help message of the campaign.
   * @return helpMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Help message of the campaign.")

  public String getHelpMessage() {
    return helpMessage;
  }


  public void setHelpMessage(String helpMessage) {
    this.helpMessage = helpMessage;
  }


  public SMSTenDLCCampaign optinKeywords(String optinKeywords) {
    
    this.optinKeywords = optinKeywords;
    return this;
  }

   /**
   * Subscriber opt-in keywords. Multiple keywords are comma separated without space.
   * @return optinKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subscriber opt-in keywords. Multiple keywords are comma separated without space.")

  public String getOptinKeywords() {
    return optinKeywords;
  }


  public void setOptinKeywords(String optinKeywords) {
    this.optinKeywords = optinKeywords;
  }


  public SMSTenDLCCampaign optoutKeywords(String optoutKeywords) {
    
    this.optoutKeywords = optoutKeywords;
    return this;
  }

   /**
   * Subscriber opt-out keywords. Multiple keywords are comma separated without space.
   * @return optoutKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subscriber opt-out keywords. Multiple keywords are comma separated without space.")

  public String getOptoutKeywords() {
    return optoutKeywords;
  }


  public void setOptoutKeywords(String optoutKeywords) {
    this.optoutKeywords = optoutKeywords;
  }


  public SMSTenDLCCampaign helpKeywords(String helpKeywords) {
    
    this.helpKeywords = helpKeywords;
    return this;
  }

   /**
   * Subscriber help keywords. Multiple keywords are comma separated without space.
   * @return helpKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subscriber help keywords. Multiple keywords are comma separated without space.")

  public String getHelpKeywords() {
    return helpKeywords;
  }


  public void setHelpKeywords(String helpKeywords) {
    this.helpKeywords = helpKeywords;
  }


  public SMSTenDLCCampaign optinMessage(String optinMessage) {
    
    this.optinMessage = optinMessage;
    return this;
  }

   /**
   * Subscriber opt-in message.
   * @return optinMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subscriber opt-in message.")

  public String getOptinMessage() {
    return optinMessage;
  }


  public void setOptinMessage(String optinMessage) {
    this.optinMessage = optinMessage;
  }


  public SMSTenDLCCampaign optoutMessage(String optoutMessage) {
    
    this.optoutMessage = optoutMessage;
    return this;
  }

   /**
   * Subscriber opt-out message.
   * @return optoutMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subscriber opt-out message.")

  public String getOptoutMessage() {
    return optoutMessage;
  }


  public void setOptoutMessage(String optoutMessage) {
    this.optoutMessage = optoutMessage;
  }


  public SMSTenDLCCampaign referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Caller supplied campaign reference ID. If supplied, the value must be unique across all submitted campaigns. Can be used to prevent duplicate campaign registrations.
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Caller supplied campaign reference ID. If supplied, the value must be unique across all submitted campaigns. Can be used to prevent duplicate campaign registrations.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public SMSTenDLCCampaign mock(Boolean mock) {
    
    this.mock = mock;
    return this;
  }

   /**
   * Campaign created from mock brand. Mocked campaign cannot be shared with an upstream CNP.
   * @return mock
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Campaign created from mock brand. Mocked campaign cannot be shared with an upstream CNP.")

  public Boolean getMock() {
    return mock;
  }


  public void setMock(Boolean mock) {
    this.mock = mock;
  }


  public SMSTenDLCCampaign nextRenewalOrExpirationDate(LocalDate nextRenewalOrExpirationDate) {
    
    this.nextRenewalOrExpirationDate = nextRenewalOrExpirationDate;
    return this;
  }

   /**
   * When the campaign would be due for its next renew/bill date.
   * @return nextRenewalOrExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Dec 31 18:00:00 CST 1999", value = "When the campaign would be due for its next renew/bill date.")

  public LocalDate getNextRenewalOrExpirationDate() {
    return nextRenewalOrExpirationDate;
  }


  public void setNextRenewalOrExpirationDate(LocalDate nextRenewalOrExpirationDate) {
    this.nextRenewalOrExpirationDate = nextRenewalOrExpirationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSTenDLCCampaign smSTenDLCCampaign = (SMSTenDLCCampaign) o;
    return Objects.equals(this.accountId, smSTenDLCCampaign.accountId) &&
        Objects.equals(this.campaignId, smSTenDLCCampaign.campaignId) &&
        Objects.equals(this.cspId, smSTenDLCCampaign.cspId) &&
        Objects.equals(this.resellerId, smSTenDLCCampaign.resellerId) &&
        Objects.equals(this.status, smSTenDLCCampaign.status) &&
        Objects.equals(this.createDate, smSTenDLCCampaign.createDate) &&
        Objects.equals(this.autoRenewal, smSTenDLCCampaign.autoRenewal) &&
        Objects.equals(this.billedDate, smSTenDLCCampaign.billedDate) &&
        Objects.equals(this.brandId, smSTenDLCCampaign.brandId) &&
        Objects.equals(this.usecase, smSTenDLCCampaign.usecase) &&
        Objects.equals(this.subUsecases, smSTenDLCCampaign.subUsecases) &&
        Objects.equals(this.description, smSTenDLCCampaign.description) &&
        Objects.equals(this.embeddedLink, smSTenDLCCampaign.embeddedLink) &&
        Objects.equals(this.embeddedPhone, smSTenDLCCampaign.embeddedPhone) &&
        Objects.equals(this.affiliateMarketing, smSTenDLCCampaign.affiliateMarketing) &&
        Objects.equals(this.numberPool, smSTenDLCCampaign.numberPool) &&
        Objects.equals(this.ageGated, smSTenDLCCampaign.ageGated) &&
        Objects.equals(this.directLending, smSTenDLCCampaign.directLending) &&
        Objects.equals(this.subscriberOptin, smSTenDLCCampaign.subscriberOptin) &&
        Objects.equals(this.subscriberOptout, smSTenDLCCampaign.subscriberOptout) &&
        Objects.equals(this.subscriberHelp, smSTenDLCCampaign.subscriberHelp) &&
        Objects.equals(this.sample1, smSTenDLCCampaign.sample1) &&
        Objects.equals(this.sample2, smSTenDLCCampaign.sample2) &&
        Objects.equals(this.sample3, smSTenDLCCampaign.sample3) &&
        Objects.equals(this.sample4, smSTenDLCCampaign.sample4) &&
        Objects.equals(this.sample5, smSTenDLCCampaign.sample5) &&
        Objects.equals(this.messageFlow, smSTenDLCCampaign.messageFlow) &&
        Objects.equals(this.helpMessage, smSTenDLCCampaign.helpMessage) &&
        Objects.equals(this.optinKeywords, smSTenDLCCampaign.optinKeywords) &&
        Objects.equals(this.optoutKeywords, smSTenDLCCampaign.optoutKeywords) &&
        Objects.equals(this.helpKeywords, smSTenDLCCampaign.helpKeywords) &&
        Objects.equals(this.optinMessage, smSTenDLCCampaign.optinMessage) &&
        Objects.equals(this.optoutMessage, smSTenDLCCampaign.optoutMessage) &&
        Objects.equals(this.referenceId, smSTenDLCCampaign.referenceId) &&
        Objects.equals(this.mock, smSTenDLCCampaign.mock) &&
        Objects.equals(this.nextRenewalOrExpirationDate, smSTenDLCCampaign.nextRenewalOrExpirationDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, cspId, resellerId, status, createDate, autoRenewal, billedDate, brandId, usecase, subUsecases, description, embeddedLink, embeddedPhone, affiliateMarketing, numberPool, ageGated, directLending, subscriberOptin, subscriberOptout, subscriberHelp, sample1, sample2, sample3, sample4, sample5, messageFlow, helpMessage, optinKeywords, optoutKeywords, helpKeywords, optinMessage, optoutMessage, referenceId, mock, nextRenewalOrExpirationDate);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSTenDLCCampaign {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    cspId: ").append(toIndentedString(cspId)).append("\n");
    sb.append("    resellerId: ").append(toIndentedString(resellerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    autoRenewal: ").append(toIndentedString(autoRenewal)).append("\n");
    sb.append("    billedDate: ").append(toIndentedString(billedDate)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    usecase: ").append(toIndentedString(usecase)).append("\n");
    sb.append("    subUsecases: ").append(toIndentedString(subUsecases)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    embeddedLink: ").append(toIndentedString(embeddedLink)).append("\n");
    sb.append("    embeddedPhone: ").append(toIndentedString(embeddedPhone)).append("\n");
    sb.append("    affiliateMarketing: ").append(toIndentedString(affiliateMarketing)).append("\n");
    sb.append("    numberPool: ").append(toIndentedString(numberPool)).append("\n");
    sb.append("    ageGated: ").append(toIndentedString(ageGated)).append("\n");
    sb.append("    directLending: ").append(toIndentedString(directLending)).append("\n");
    sb.append("    subscriberOptin: ").append(toIndentedString(subscriberOptin)).append("\n");
    sb.append("    subscriberOptout: ").append(toIndentedString(subscriberOptout)).append("\n");
    sb.append("    subscriberHelp: ").append(toIndentedString(subscriberHelp)).append("\n");
    sb.append("    sample1: ").append(toIndentedString(sample1)).append("\n");
    sb.append("    sample2: ").append(toIndentedString(sample2)).append("\n");
    sb.append("    sample3: ").append(toIndentedString(sample3)).append("\n");
    sb.append("    sample4: ").append(toIndentedString(sample4)).append("\n");
    sb.append("    sample5: ").append(toIndentedString(sample5)).append("\n");
    sb.append("    messageFlow: ").append(toIndentedString(messageFlow)).append("\n");
    sb.append("    helpMessage: ").append(toIndentedString(helpMessage)).append("\n");
    sb.append("    optinKeywords: ").append(toIndentedString(optinKeywords)).append("\n");
    sb.append("    optoutKeywords: ").append(toIndentedString(optoutKeywords)).append("\n");
    sb.append("    helpKeywords: ").append(toIndentedString(helpKeywords)).append("\n");
    sb.append("    optinMessage: ").append(toIndentedString(optinMessage)).append("\n");
    sb.append("    optoutMessage: ").append(toIndentedString(optoutMessage)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    mock: ").append(toIndentedString(mock)).append("\n");
    sb.append("    nextRenewalOrExpirationDate: ").append(toIndentedString(nextRenewalOrExpirationDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }


  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

