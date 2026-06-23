

# SMSTollFreeCampaignsListResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | Total amount of requested resource. |  [optional]
**start** | **Integer** | Resource index at start of current page |  [optional]
**end** | **Integer** | Resource index at end of current page |  [optional]
**page** | **Integer** | Current page |  [optional]
**numPages** | **Integer** | Total number of pages |  [optional]
**pageSize** | **Integer** | Number of items per page |  [optional]
**nextPageUri** | **String** | Uri to retrieve the next page of items |  [optional]
**brands** | [**List&lt;SMSTollFreeCampaign&gt;**](SMSTollFreeCampaign.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.SMSTollFreeCampaignsListResult;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"brands\":[{\"accountId\":\"string\",\"campaignId\":\"string\",\"useCase\":\"string\",\"registrationStatus\":\"UNREGISTERED\",\"dateCreated\":\"string\",\"dateUpdated\":\"string\",\"revision\":0}]}";

// create an instance of SMSTollFreeCampaignsListResult from a JSON string
SMSTollFreeCampaignsListResult smSTollFreeCampaignsListResult = new JSON().getGson().fromJson(json, SMSTollFreeCampaignsListResult.class);
```


