

# SMSTenDLCBrand

A brand is a business identity behind the campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | ID of the account that created this Queue. |  [optional]
**entityType** | **SMSTenDLCBrandEntityType** |  | 
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
**stockExchange** | **SMSTenDLCBrandStockExchange** |  |  [optional]
**ipAddress** | **String** | IP address of the browser requesting to create brand identity. |  [optional]
**website** | **String** | Brand website URL. |  [optional]
**brandRelationship** | **SMSTenDLCBrandRelationship** |  | 
**vertical** | **String** | Vertical or industry segment of the brand. | 
**altBusinessId** | **String** | Alternate business identifier such as DUNS, LEI, or GIIN |  [optional]
**altBusinessIdType** | **SMSTenDLCBrandAltBusinessIdType** |  |  [optional]
**universalEin** | **String** | Universal EIN of Brand, Read Only. |  [optional] [readonly]
**referenceId** | **String** | Caller supplied brand reference ID. If supplied, the value must be unique across all submitted brands. Can be used to prevent duplicate brand registrations. |  [optional]
**optionalAttributes** | **Map&lt;String, Object&gt;** | Optional brand attributes. Please refer to GET /enum/optionalAttributeNames for dictionary of optional attribute names. |  [optional]
**mock** | **Boolean** | Test brand. | 
**identityStatus** | **SMSTenDLCBrandIdentityStatus** |  | 
**createDate** | **OffsetDateTime** | Unix timestamp when brand was created. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.SMSTenDLCBrand;

String json = "{\"mock\":true,\"optionalAttributes\":{},\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef06\",\"brandId\":\"BVCEBIJ\",\"cspId\":\"SKGC6G0\",\"firstName\":\"\",\"lastName\":\"\",\"displayName\":\"FreeClimb LLC(mock)\",\"companyName\":\"FreeClimb LLC\",\"ein\":\"843793747\",\"einIssuingCountry\":\"US\",\"phone\":\"+18475722071\",\"street\":\"570 Lake Cook Rd Ste 400\",\"city\":\"Deerfield\",\"state\":\"IL\",\"postalCode\":\"60015\",\"country\":\"US\",\"email\":\"bmabry@vailsys.com\",\"stockSymbol\":\"\",\"stockExchange\":\"NASDAQ\",\"ipAddress\":\"127.0.0.1\",\"website\":\"https://www.freeclimb.com/\",\"vertical\":\"TECHNOLOGY\",\"universalEin\":\"US_843793747\",\"referenceId\":\"ACdeadbeef\",\"entityType\":\"PRIVATE_PROFIT\",\"brandRelationship\":\"SMALL_ACCOUNT\",\"identityStatus\":\"VERIFIED\",\"createDate\":\"2022-07-01T20:29:23Z\"}";

// create an instance of SMSTenDLCBrand from a JSON string
SMSTenDLCBrand smSTenDLCBrand = new JSON().getGson().fromJson(json, SMSTenDLCBrand.class);
```


