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
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/** A brand is a business identity behind the campaign. */
@ApiModel(description = "A brand is a business identity behind the campaign.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SMSTenDLCBrand {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";

    @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
    private SMSTenDLCBrandEntityType entityType;

    public static final String SERIALIZED_NAME_CSP_ID = "cspId";

    @SerializedName(SERIALIZED_NAME_CSP_ID)
    private String cspId;

    public static final String SERIALIZED_NAME_BRAND_ID = "brandId";

    @SerializedName(SERIALIZED_NAME_BRAND_ID)
    private String brandId;

    public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";

    @SerializedName(SERIALIZED_NAME_FIRST_NAME)
    private String firstName;

    public static final String SERIALIZED_NAME_LAST_NAME = "lastName";

    @SerializedName(SERIALIZED_NAME_LAST_NAME)
    private String lastName;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;

    public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";

    @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
    private String companyName;

    public static final String SERIALIZED_NAME_EIN = "ein";

    @SerializedName(SERIALIZED_NAME_EIN)
    private String ein;

    public static final String SERIALIZED_NAME_EIN_ISSUING_COUNTRY = "einIssuingCountry";

    @SerializedName(SERIALIZED_NAME_EIN_ISSUING_COUNTRY)
    private String einIssuingCountry;

    public static final String SERIALIZED_NAME_PHONE = "phone";

    @SerializedName(SERIALIZED_NAME_PHONE)
    private String phone;

    public static final String SERIALIZED_NAME_STREET = "street";

    @SerializedName(SERIALIZED_NAME_STREET)
    private String street;

    public static final String SERIALIZED_NAME_CITY = "city";

    @SerializedName(SERIALIZED_NAME_CITY)
    private String city;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";

    @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
    private String postalCode;

    public static final String SERIALIZED_NAME_COUNTRY = "country";

    @SerializedName(SERIALIZED_NAME_COUNTRY)
    private String country;

    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;

    public static final String SERIALIZED_NAME_STOCK_SYMBOL = "stockSymbol";

    @SerializedName(SERIALIZED_NAME_STOCK_SYMBOL)
    private String stockSymbol;

    public static final String SERIALIZED_NAME_STOCK_EXCHANGE = "stockExchange";

    @SerializedName(SERIALIZED_NAME_STOCK_EXCHANGE)
    private SMSTenDLCBrandStockExchange stockExchange;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public static final String SERIALIZED_NAME_WEBSITE = "website";

    @SerializedName(SERIALIZED_NAME_WEBSITE)
    private String website;

    public static final String SERIALIZED_NAME_BRAND_RELATIONSHIP = "brandRelationship";

    @SerializedName(SERIALIZED_NAME_BRAND_RELATIONSHIP)
    private SMSTenDLCBrandRelationship brandRelationship;

    public static final String SERIALIZED_NAME_VERTICAL = "vertical";

    @SerializedName(SERIALIZED_NAME_VERTICAL)
    private String vertical;

    public static final String SERIALIZED_NAME_ALT_BUSINESS_ID = "altBusinessId";

    @SerializedName(SERIALIZED_NAME_ALT_BUSINESS_ID)
    private String altBusinessId;

    public static final String SERIALIZED_NAME_ALT_BUSINESS_ID_TYPE = "altBusinessIdType";

    @SerializedName(SERIALIZED_NAME_ALT_BUSINESS_ID_TYPE)
    private SMSTenDLCBrandAltBusinessIdType altBusinessIdType;

    public static final String SERIALIZED_NAME_UNIVERSAL_EIN = "universalEin";

    @SerializedName(SERIALIZED_NAME_UNIVERSAL_EIN)
    private String universalEin;

    public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";

    @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
    private String referenceId;

    public static final String SERIALIZED_NAME_OPTIONAL_ATTRIBUTES = "optionalAttributes";

    @SerializedName(SERIALIZED_NAME_OPTIONAL_ATTRIBUTES)
    private Map<String, Object> optionalAttributes = null;

    public static final String SERIALIZED_NAME_MOCK = "mock";

    @SerializedName(SERIALIZED_NAME_MOCK)
    private Boolean mock;

    public static final String SERIALIZED_NAME_IDENTITY_STATUS = "identityStatus";

    @SerializedName(SERIALIZED_NAME_IDENTITY_STATUS)
    private SMSTenDLCBrandIdentityStatus identityStatus;

    public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";

    @SerializedName(SERIALIZED_NAME_CREATE_DATE)
    private OffsetDateTime createDate;

    public SMSTenDLCBrand() {}

    public SMSTenDLCBrand(String cspId, String brandId, String universalEin) {
        this();
        this.cspId = cspId;
        this.brandId = brandId;
        this.universalEin = universalEin;
    }

    public SMSTenDLCBrand accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * ID of the account that created this Queue.
     *
     * @return accountId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of the account that created this Queue.")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public SMSTenDLCBrand entityType(SMSTenDLCBrandEntityType entityType) {

        this.entityType = entityType;
        return this;
    }

    /**
     * Get entityType
     *
     * @return entityType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SMSTenDLCBrandEntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(SMSTenDLCBrandEntityType entityType) {
        this.entityType = entityType;
    }

    /**
     * Unique identifier assigned to the csp by the registry.
     *
     * @return cspId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Unique identifier assigned to the csp by the registry.")
    public String getCspId() {
        return cspId;
    }

    private void setCspId(String cspId) {
        this.cspId = cspId;
    }

    /**
     * Unique identifier assigned to the brand by the registry.
     *
     * @return brandId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Unique identifier assigned to the brand by the registry.")
    public String getBrandId() {
        return brandId;
    }

    private void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public SMSTenDLCBrand firstName(String firstName) {

        this.firstName = firstName;
        return this;
    }

    /**
     * First or given name.
     *
     * @return firstName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(example = "John", value = "First or given name. ")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public SMSTenDLCBrand lastName(String lastName) {

        this.lastName = lastName;
        return this;
    }

    /**
     * Last or Surname.
     *
     * @return lastName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Doe", value = "Last or Surname.")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SMSTenDLCBrand displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }

    /**
     * Display or marketing name of the brand.
     *
     * @return displayName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            example = "ABC Mobile",
            required = true,
            value = "Display or marketing name of the brand.")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public SMSTenDLCBrand companyName(String companyName) {

        this.companyName = companyName;
        return this;
    }

    /**
     * (Required for Non-profit/private/public) Legal company name.
     *
     * @return companyName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            example = "ABC Inc.",
            value = "(Required for Non-profit/private/public) Legal company name.")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public SMSTenDLCBrand ein(String ein) {

        this.ein = ein;
        return this;
    }

    /**
     * (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S.
     *
     * @return ein
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            example = "111111111",
            value =
                    "(Required for Non-profit) Government assigned corporate tax ID. EIN is"
                            + " 9-digits in U.S.")
    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public SMSTenDLCBrand einIssuingCountry(String einIssuingCountry) {

        this.einIssuingCountry = einIssuingCountry;
        return this;
    }

    /**
     * ISO2 2 characters country code. Example: US - United States
     *
     * @return einIssuingCountry
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            example = "US",
            value = "ISO2 2 characters country code. Example: US - United States")
    public String getEinIssuingCountry() {
        return einIssuingCountry;
    }

    public void setEinIssuingCountry(String einIssuingCountry) {
        this.einIssuingCountry = einIssuingCountry;
    }

    public SMSTenDLCBrand phone(String phone) {

        this.phone = phone;
        return this;
    }

    /**
     * Valid phone number in e.164 international format.
     *
     * @return phone
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            example = "+12024567890",
            required = true,
            value = "Valid phone number in e.164 international format.")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public SMSTenDLCBrand street(String street) {

        this.street = street;
        return this;
    }

    /**
     * Street number and name.
     *
     * @return street
     */
    @javax.annotation.Nullable
    @ApiModelProperty(example = "123 6th Ave", value = "Street number and name.")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public SMSTenDLCBrand city(String city) {

        this.city = city;
        return this;
    }

    /**
     * City name
     *
     * @return city
     */
    @javax.annotation.Nullable
    @ApiModelProperty(example = "New York", value = "City name")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public SMSTenDLCBrand state(String state) {

        this.state = state;
        return this;
    }

    /**
     * State. Must be 2 letters code for United States.
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(example = "NY", value = "State. Must be 2 letters code for United States.")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SMSTenDLCBrand postalCode(String postalCode) {

        this.postalCode = postalCode;
        return this;
    }

    /**
     * Postal codes. Use 5 digit zipcode for United States
     *
     * @return postalCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            example = "10001",
            value = "Postal codes. Use 5 digit zipcode for United States")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public SMSTenDLCBrand country(String country) {

        this.country = country;
        return this;
    }

    /**
     * ISO2 2 characters country code. Example: US - United States
     *
     * @return country
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            example = "US",
            required = true,
            value = "ISO2 2 characters country code. Example: US - United States")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public SMSTenDLCBrand email(String email) {

        this.email = email;
        return this;
    }

    /**
     * Valid email address of brand support contact.
     *
     * @return email
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Valid email address of brand support contact.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SMSTenDLCBrand stockSymbol(String stockSymbol) {

        this.stockSymbol = stockSymbol;
        return this;
    }

    /**
     * (Required for public company) stock symbol.
     *
     * @return stockSymbol
     */
    @javax.annotation.Nullable
    @ApiModelProperty(example = "ABC", value = "(Required for public company) stock symbol.")
    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public SMSTenDLCBrand stockExchange(SMSTenDLCBrandStockExchange stockExchange) {

        this.stockExchange = stockExchange;
        return this;
    }

    /**
     * Get stockExchange
     *
     * @return stockExchange
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SMSTenDLCBrandStockExchange getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(SMSTenDLCBrandStockExchange stockExchange) {
        this.stockExchange = stockExchange;
    }

    public SMSTenDLCBrand ipAddress(String ipAddress) {

        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IP address of the browser requesting to create brand identity.
     *
     * @return ipAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "IP address of the browser requesting to create brand identity.")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public SMSTenDLCBrand website(String website) {

        this.website = website;
        return this;
    }

    /**
     * Brand website URL.
     *
     * @return website
     */
    @javax.annotation.Nullable
    @ApiModelProperty(example = "http://www.abcmobile.com", value = "Brand website URL.")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public SMSTenDLCBrand brandRelationship(SMSTenDLCBrandRelationship brandRelationship) {

        this.brandRelationship = brandRelationship;
        return this;
    }

    /**
     * Get brandRelationship
     *
     * @return brandRelationship
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SMSTenDLCBrandRelationship getBrandRelationship() {
        return brandRelationship;
    }

    public void setBrandRelationship(SMSTenDLCBrandRelationship brandRelationship) {
        this.brandRelationship = brandRelationship;
    }

    public SMSTenDLCBrand vertical(String vertical) {

        this.vertical = vertical;
        return this;
    }

    /**
     * Vertical or industry segment of the brand.
     *
     * @return vertical
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Vertical or industry segment of the brand.")
    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public SMSTenDLCBrand altBusinessId(String altBusinessId) {

        this.altBusinessId = altBusinessId;
        return this;
    }

    /**
     * Alternate business identifier such as DUNS, LEI, or GIIN
     *
     * @return altBusinessId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Alternate business identifier such as DUNS, LEI, or GIIN")
    public String getAltBusinessId() {
        return altBusinessId;
    }

    public void setAltBusinessId(String altBusinessId) {
        this.altBusinessId = altBusinessId;
    }

    public SMSTenDLCBrand altBusinessIdType(SMSTenDLCBrandAltBusinessIdType altBusinessIdType) {

        this.altBusinessIdType = altBusinessIdType;
        return this;
    }

    /**
     * Get altBusinessIdType
     *
     * @return altBusinessIdType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SMSTenDLCBrandAltBusinessIdType getAltBusinessIdType() {
        return altBusinessIdType;
    }

    public void setAltBusinessIdType(SMSTenDLCBrandAltBusinessIdType altBusinessIdType) {
        this.altBusinessIdType = altBusinessIdType;
    }

    /**
     * Universal EIN of Brand, Read Only.
     *
     * @return universalEin
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Universal EIN of Brand, Read Only.")
    public String getUniversalEin() {
        return universalEin;
    }

    private void setUniversalEin(String universalEin) {
        this.universalEin = universalEin;
    }

    public SMSTenDLCBrand referenceId(String referenceId) {

        this.referenceId = referenceId;
        return this;
    }

    /**
     * Caller supplied brand reference ID. If supplied, the value must be unique across all
     * submitted brands. Can be used to prevent duplicate brand registrations.
     *
     * @return referenceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Caller supplied brand reference ID. If supplied, the value must be unique"
                            + " across all submitted brands. Can be used to prevent duplicate brand"
                            + " registrations.")
    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public SMSTenDLCBrand optionalAttributes(Map<String, Object> optionalAttributes) {

        this.optionalAttributes = optionalAttributes;
        return this;
    }

    public SMSTenDLCBrand putoptionalAttributesItem(String key, Object optionalAttributesItem) {
        if (this.optionalAttributes == null) {
            this.optionalAttributes = new HashMap<>();
        }
        this.optionalAttributes.put(key, optionalAttributesItem);
        return this;
    }

    /**
     * Optional brand attributes. Please refer to GET /enum/optionalAttributeNames for dictionary of
     * optional attribute names.
     *
     * @return optionalAttributes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Optional brand attributes. Please refer to GET /enum/optionalAttributeNames"
                            + " for dictionary of optional attribute names.")
    public Map<String, Object> getOptionalAttributes() {
        return optionalAttributes;
    }

    public void setOptionalAttributes(Map<String, Object> optionalAttributes) {
        this.optionalAttributes = optionalAttributes;
    }

    public SMSTenDLCBrand mock(Boolean mock) {

        this.mock = mock;
        return this;
    }

    /**
     * Test brand.
     *
     * @return mock
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Test brand.")
    public Boolean getMock() {
        return mock;
    }

    public void setMock(Boolean mock) {
        this.mock = mock;
    }

    public SMSTenDLCBrand identityStatus(SMSTenDLCBrandIdentityStatus identityStatus) {

        this.identityStatus = identityStatus;
        return this;
    }

    /**
     * Get identityStatus
     *
     * @return identityStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SMSTenDLCBrandIdentityStatus getIdentityStatus() {
        return identityStatus;
    }

    public void setIdentityStatus(SMSTenDLCBrandIdentityStatus identityStatus) {
        this.identityStatus = identityStatus;
    }

    public SMSTenDLCBrand createDate(OffsetDateTime createDate) {

        this.createDate = createDate;
        return this;
    }

    /**
     * Unix timestamp when brand was created.
     *
     * @return createDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Unix timestamp when brand was created.")
    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SMSTenDLCBrand smSTenDLCBrand = (SMSTenDLCBrand) o;
        return Objects.equals(this.accountId, smSTenDLCBrand.accountId)
                && Objects.equals(this.entityType, smSTenDLCBrand.entityType)
                && Objects.equals(this.cspId, smSTenDLCBrand.cspId)
                && Objects.equals(this.brandId, smSTenDLCBrand.brandId)
                && Objects.equals(this.firstName, smSTenDLCBrand.firstName)
                && Objects.equals(this.lastName, smSTenDLCBrand.lastName)
                && Objects.equals(this.displayName, smSTenDLCBrand.displayName)
                && Objects.equals(this.companyName, smSTenDLCBrand.companyName)
                && Objects.equals(this.ein, smSTenDLCBrand.ein)
                && Objects.equals(this.einIssuingCountry, smSTenDLCBrand.einIssuingCountry)
                && Objects.equals(this.phone, smSTenDLCBrand.phone)
                && Objects.equals(this.street, smSTenDLCBrand.street)
                && Objects.equals(this.city, smSTenDLCBrand.city)
                && Objects.equals(this.state, smSTenDLCBrand.state)
                && Objects.equals(this.postalCode, smSTenDLCBrand.postalCode)
                && Objects.equals(this.country, smSTenDLCBrand.country)
                && Objects.equals(this.email, smSTenDLCBrand.email)
                && Objects.equals(this.stockSymbol, smSTenDLCBrand.stockSymbol)
                && Objects.equals(this.stockExchange, smSTenDLCBrand.stockExchange)
                && Objects.equals(this.ipAddress, smSTenDLCBrand.ipAddress)
                && Objects.equals(this.website, smSTenDLCBrand.website)
                && Objects.equals(this.brandRelationship, smSTenDLCBrand.brandRelationship)
                && Objects.equals(this.vertical, smSTenDLCBrand.vertical)
                && Objects.equals(this.altBusinessId, smSTenDLCBrand.altBusinessId)
                && Objects.equals(this.altBusinessIdType, smSTenDLCBrand.altBusinessIdType)
                && Objects.equals(this.universalEin, smSTenDLCBrand.universalEin)
                && Objects.equals(this.referenceId, smSTenDLCBrand.referenceId)
                && Objects.equals(this.optionalAttributes, smSTenDLCBrand.optionalAttributes)
                && Objects.equals(this.mock, smSTenDLCBrand.mock)
                && Objects.equals(this.identityStatus, smSTenDLCBrand.identityStatus)
                && Objects.equals(this.createDate, smSTenDLCBrand.createDate);
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
                accountId,
                entityType,
                cspId,
                brandId,
                firstName,
                lastName,
                displayName,
                companyName,
                ein,
                einIssuingCountry,
                phone,
                street,
                city,
                state,
                postalCode,
                country,
                email,
                stockSymbol,
                stockExchange,
                ipAddress,
                website,
                brandRelationship,
                vertical,
                altBusinessId,
                altBusinessIdType,
                universalEin,
                referenceId,
                optionalAttributes,
                mock,
                identityStatus,
                createDate);
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
        sb.append("class SMSTenDLCBrand {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    cspId: ").append(toIndentedString(cspId)).append("\n");
        sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
        sb.append("    einIssuingCountry: ")
                .append(toIndentedString(einIssuingCountry))
                .append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    street: ").append(toIndentedString(street)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    stockSymbol: ").append(toIndentedString(stockSymbol)).append("\n");
        sb.append("    stockExchange: ").append(toIndentedString(stockExchange)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    website: ").append(toIndentedString(website)).append("\n");
        sb.append("    brandRelationship: ")
                .append(toIndentedString(brandRelationship))
                .append("\n");
        sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
        sb.append("    altBusinessId: ").append(toIndentedString(altBusinessId)).append("\n");
        sb.append("    altBusinessIdType: ")
                .append(toIndentedString(altBusinessIdType))
                .append("\n");
        sb.append("    universalEin: ").append(toIndentedString(universalEin)).append("\n");
        sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
        sb.append("    optionalAttributes: ")
                .append(toIndentedString(optionalAttributes))
                .append("\n");
        sb.append("    mock: ").append(toIndentedString(mock)).append("\n");
        sb.append("    identityStatus: ").append(toIndentedString(identityStatus)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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
