

# IncomingNumberList


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
**incomingPhoneNumbers** | [**List&lt;IncomingNumberResult&gt;**](IncomingNumberResult.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.IncomingNumberList;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"incomingPhoneNumbers\":[{\"uri\":\"string\",\"dateCreated\":\"string\",\"dateUpdated\":\"string\",\"revision\":0,\"capabilities\":{\"voice\":false,\"sms\":false,\"tollFree\":false,\"tenDLC\":false,\"shortCode\":false},\"campaignId\":\"string\",\"phoneNumberId\":\"string\",\"accountId\":\"string\",\"applicationId\":\"string\",\"phoneNumber\":\"string\",\"alias\":\"string\",\"region\":\"string\",\"country\":\"string\",\"offnet\":false,\"tfn\":{\"campaignId\":\"string\"}}]}";

// create an instance of IncomingNumberList from a JSON string
IncomingNumberList incomingNumberList = new JSON().getGson().fromJson(json, IncomingNumberList.class);
```


