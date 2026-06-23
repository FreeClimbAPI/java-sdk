

# ConferenceList


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
**conferences** | [**List&lt;ConferenceResult&gt;**](ConferenceResult.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.ConferenceList;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"conferences\":[{\"uri\":\"string\",\"dateCreated\":\"string\",\"dateUpdated\":\"string\",\"revision\":0,\"conferenceId\":\"string\",\"accountId\":\"string\",\"alias\":\"string\",\"record\":false,\"status\":\"empty\",\"waitUrl\":\"https://www.example.com\",\"actionUrl\":\"https://www.example.com\",\"statusCallbackUrl\":\"https://www.example.com\"}]}";

// create an instance of ConferenceList from a JSON string
ConferenceList conferenceList = new JSON().getGson().fromJson(json, ConferenceList.class);
```


