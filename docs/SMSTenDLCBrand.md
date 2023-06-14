

# SMSTenDLCBrand

A brand is a business identity behind the campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | ID of the account that created this Queue. |  [optional]
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Entity type behind the brand. This is the form of business establishment. | 
**cspId** | **String** | Unique identifier assigned to the csp by the registry. |  [optional] [readonly]
**brandId** | **String** | Unique identifier assigned to the brand by the registry. |  [optional] [readonly]
**firstName** | **String** | First or given name.  |  [optional]
**lastName** | **String** | Last or Surname. |  [optional]
**displayName** | **String** | Display or marketing name of the brand. | 
**companyName** | **String** | (Required for Non-profit/private/public) Legal company name. |  [optional]
**ein** | **String** | (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S. |  [optional]
**einIssuingCountry** | **String** | ISO2 2 characters country code. Example: US - United States |  [optional]
**phone** | **String** | Valid phone number in e.164 international format. | 
**street** | **String** | Street number and name. |  [optional]
**city** | **String** | City name |  [optional]
**state** | **String** | State. Must be 2 letters code for United States. |  [optional]
**postalCode** | **String** | Postal codes. Use 5 digit zipcode for United States |  [optional]
**country** | **String** | ISO2 2 characters country code. Example: US - United States | 
**email** | **String** | Valid email address of brand support contact. | 
**stockSymbol** | **String** | (Required for public company) stock symbol. |  [optional]
**stockExchange** | [**StockExchangeEnum**](#StockExchangeEnum) | (Required for public company) stock exchange. |  [optional]
**ipAddress** | **String** | IP address of the browser requesting to create brand identity. |  [optional]
**website** | **String** | Brand website URL. |  [optional]
**brandRelationship** | [**BrandRelationshipEnum**](#BrandRelationshipEnum) | Brand relationship to the CSP | 
**vertical** | **String** | Vertical or industry segment of the brand. | 
**altBusinessId** | **String** | Alternate business identifier such as DUNS, LEI, or GIIN |  [optional]
**altBusinessIdType** | [**AltBusinessIdTypeEnum**](#AltBusinessIdTypeEnum) | The type of the Alternative business identifier |  [optional]
**universalEin** | **String** | Universal EIN of Brand, Read Only. |  [optional] [readonly]
**referenceId** | **String** | Caller supplied brand reference ID. If supplied, the value must be unique across all submitted brands. Can be used to prevent duplicate brand registrations. |  [optional]
**optionalAttributes** | **Map&lt;String, Object&gt;** | Optional brand attributes. Please refer to GET /enum/optionalAttributeNames for dictionary of optional attribute names. |  [optional]
**mock** | **Boolean** | Test brand. | 
**identityStatus** | [**IdentityStatusEnum**](#IdentityStatusEnum) | TCR assessment of the brand identification status. | 
**createDate** | **OffsetDateTime** | Unix timestamp when brand was created. |  [optional]



## Enum: EntityTypeEnum

Name | Value
---- | -----
PRIVATE_PROFIT | &quot;PRIVATE_PROFIT&quot;
PUBLIC_PROFIT | &quot;PUBLIC_PROFIT&quot;
NON_PROFIT | &quot;NON_PROFIT&quot;
GOVERNMENT | &quot;GOVERNMENT&quot;
SOLE_PROPRIETOR | &quot;SOLE_PROPRIETOR&quot;



## Enum: StockExchangeEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
NASDAQ | &quot;NASDAQ&quot;
NYSE | &quot;NYSE&quot;
AMEX | &quot;AMEX&quot;
AMX | &quot;AMX&quot;
ASX | &quot;ASX&quot;
B3 | &quot;B3&quot;
BME | &quot;BME&quot;
BSE | &quot;BSE&quot;
FRA | &quot;FRA&quot;
ICEX | &quot;ICEX&quot;
JPX | &quot;JPX&quot;
JSE | &quot;JSE&quot;
KRX | &quot;KRX&quot;
LON | &quot;LON&quot;
NSE | &quot;NSE&quot;
OMX | &quot;OMX&quot;
SEHK | &quot;SEHK&quot;
SGX | &quot;SGX&quot;
SSE | &quot;SSE&quot;
STO | &quot;STO&quot;
SWX | &quot;SWX&quot;
SZSE | &quot;SZSE&quot;
TSX | &quot;TSX&quot;
TWSE | &quot;TWSE&quot;
VSE | &quot;VSE&quot;
OTHER | &quot;OTHER&quot;



## Enum: BrandRelationshipEnum

Name | Value
---- | -----
BASIC_ACCOUNT | &quot;BASIC_ACCOUNT&quot;
SMALL_ACCOUNT | &quot;SMALL_ACCOUNT&quot;
MEDIUM_ACCOUNT | &quot;MEDIUM_ACCOUNT&quot;
LARGE_ACCOUNT | &quot;LARGE_ACCOUNT&quot;
KEY_ACCOUNT | &quot;KEY_ACCOUNT&quot;



## Enum: AltBusinessIdTypeEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
DUNS | &quot;DUNS&quot;
GIIN | &quot;GIIN&quot;
LEI | &quot;LEI&quot;



## Enum: IdentityStatusEnum

Name | Value
---- | -----
SELF_DECLARED | &quot;SELF_DECLARED&quot;
UNVERIFIED | &quot;UNVERIFIED&quot;
VERIFIED | &quot;VERIFIED&quot;
VETTED_VERIFIED | &quot;VETTED_VERIFIED&quot;



