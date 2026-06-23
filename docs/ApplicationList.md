

# ApplicationList


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
**applications** | [**List&lt;ApplicationResult&gt;**](ApplicationResult.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.ApplicationList;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"applications\":[{\"uri\":\"string\",\"dateCreated\":\"string\",\"dateUpdated\":\"string\",\"revision\":0,\"accountId\":\"string\",\"applicationId\":\"string\",\"alias\":\"string\",\"voiceUrl\":\"https://www.example.com\",\"voiceFallbackUrl\":\"https://www.example.com\",\"callConnectUrl\":\"https://www.example.com\",\"statusCallbackUrl\":\"https://www.example.com\",\"smsUrl\":\"https://www.example.com\",\"smsFallbackUrl\":\"https://www.example.com\"}]}";

// create an instance of ApplicationList from a JSON string
ApplicationList applicationList = new JSON().getGson().fromJson(json, ApplicationList.class);
```


