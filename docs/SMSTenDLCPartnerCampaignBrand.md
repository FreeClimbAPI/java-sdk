

# SMSTenDLCPartnerCampaignBrand


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | ID of the account that created this Queue. |  [optional]
**brandId** | **String** | Unique identifier assigned to the brand by the registry. |  [optional] [readonly]
**firstName** | **String** | First or given name.  |  [optional]
**lastName** | **String** | Last or Surname. |  [optional]
**displayName** | **String** | Display or marketing name of the brand. |  [optional]
**companyName** | **String** | (Required for Non-profit/private/public) Legal company name. |  [optional]
**phone** | **String** | Valid phone number in e.164 international format. | 
**email** | **String** | Valid email address of brand support contact. | 
**website** | **String** | Brand website URL. |  [optional]
**optionalAttributes** | **Map&lt;String, Object&gt;** | Optional brand attributes. Please refer to GET /enum/optionalAttributeNames for dictionary of optional attribute names. |  [optional]
**evpVettingScore** | **Integer** | External vetting score. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.SMSTenDLCPartnerCampaignBrand;

String json = "{\"accountId\":\"string\",\"brandId\":\"string\",\"firstName\":\"John\",\"lastName\":\"Doe\",\"displayName\":\"ABC Mobile\",\"companyName\":\"ABC Inc.\",\"phone\":\"+12024567890\",\"email\":\"string\",\"website\":\"http://www.abcmobile.com\",\"evpVettingScore\":0}";

// create an instance of SMSTenDLCPartnerCampaignBrand from a JSON string
SMSTenDLCPartnerCampaignBrand smSTenDLCPartnerCampaignBrand = new JSON().getGson().fromJson(json, SMSTenDLCPartnerCampaignBrand.class);
```


