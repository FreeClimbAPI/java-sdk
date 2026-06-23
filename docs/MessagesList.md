

# MessagesList


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
**messages** | [**List&lt;MessageResult&gt;**](MessageResult.md) | Array of messages |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.MessagesList;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"messages\":[{\"uri\":\"string\",\"dateCreated\":\"string\",\"dateUpdated\":\"string\",\"revision\":0,\"accountId\":\"string\",\"messageId\":\"string\",\"status\":\"new\",\"from\":\"string\",\"to\":\"string\",\"text\":\"string\",\"direction\":\"string\",\"notificationUrl\":\"https://www.example.com\",\"brandId\":\"string\",\"campaignId\":\"string\",\"segmentCount\":0,\"mediaUrls\":[\"https://www.example.com\"],\"tfn\":{\"campaignId\":\"string\"},\"phoneNumberId\":\"string\",\"applicationId\":\"string\"}]}";

// create an instance of MessagesList from a JSON string
MessagesList messagesList = new JSON().getGson().fromJson(json, MessagesList.class);
```


