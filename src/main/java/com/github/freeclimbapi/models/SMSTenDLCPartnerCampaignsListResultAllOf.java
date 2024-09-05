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
import com.github.freeclimbapi.utils.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * SMSTenDLCPartnerCampaignsListResultAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SMSTenDLCPartnerCampaignsListResultAllOf {
  public static final String SERIALIZED_NAME_PARTNER_CAMPAIGNS = "partnerCampaigns";
  @SerializedName(SERIALIZED_NAME_PARTNER_CAMPAIGNS)
  private List<SMSTenDLCPartnerCampaign> partnerCampaigns = null;

  public SMSTenDLCPartnerCampaignsListResultAllOf() { 
  }

  public SMSTenDLCPartnerCampaignsListResultAllOf partnerCampaigns(List<SMSTenDLCPartnerCampaign> partnerCampaigns) {
    
    this.partnerCampaigns = partnerCampaigns;
    return this;
  }

  public SMSTenDLCPartnerCampaignsListResultAllOf addPartnerCampaignsItem(SMSTenDLCPartnerCampaign partnerCampaignsItem) {
    if (this.partnerCampaigns == null) {
      this.partnerCampaigns = new ArrayList<SMSTenDLCPartnerCampaign>();
    }
    this.partnerCampaigns.add(partnerCampaignsItem);
    return this;
  }

   /**
   * Get partnerCampaigns
   * @return partnerCampaigns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SMSTenDLCPartnerCampaign> getPartnerCampaigns() {
    return partnerCampaigns;
  }


  public void setPartnerCampaigns(List<SMSTenDLCPartnerCampaign> partnerCampaigns) {
    this.partnerCampaigns = partnerCampaigns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSTenDLCPartnerCampaignsListResultAllOf smSTenDLCPartnerCampaignsListResultAllOf = (SMSTenDLCPartnerCampaignsListResultAllOf) o;
    return Objects.equals(this.partnerCampaigns, smSTenDLCPartnerCampaignsListResultAllOf.partnerCampaigns);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerCampaigns);
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
    sb.append("class SMSTenDLCPartnerCampaignsListResultAllOf {\n");
    sb.append("    partnerCampaigns: ").append(toIndentedString(partnerCampaigns)).append("\n");
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

