

# TFNCampaign


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | ID of the account that created this participant. | 
**campaignId** | **String** | TFNCampaignId | 
**useCase** | **String** |  | 
**registrationStatus** | **SMSTollFreeCampaignRegistrationStatus** |  | 
**dateCreated** | **String** |  | 
**dateUpdated** | **String** |  | 
**dateCreatedISO** | **String** |  | 
**dateUpdatedISO** | **String** |  | 
**revision** | **Integer** |  | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.TFNCampaign;

String json = "{\"accountId\":\"string\",\"campaignId\":\"cmptfn_387ec3f6e03b340553f35f29c8f118cdf3eae08a\",\"useCase\":\"string\",\"registrationStatus\":\"UNREGISTERED\",\"dateCreated\":\"string\",\"dateUpdated\":\"string\",\"dateCreatedISO\":\"string\",\"dateUpdatedISO\":\"string\",\"revision\":0}";

// create an instance of TFNCampaign from a JSON string
TFNCampaign tfNCampaign = new JSON().getGson().fromJson(json, TFNCampaign.class);
```


