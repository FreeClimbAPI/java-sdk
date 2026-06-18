

# QueueList


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
**queues** | [**List&lt;QueueResult&gt;**](QueueResult.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.QueueList;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"queues\":[{\"uri\":\"string\",\"dateCreated\":\"string\",\"dateUpdated\":\"string\",\"revision\":0,\"accountId\":\"string\",\"queueId\":\"string\",\"alias\":\"string\",\"maxSize\":0,\"currentSize\":0,\"averageQueueRemovalTime\":0,\"averageWaitTime\":0}]}";

// create an instance of QueueList from a JSON string
QueueList queueList = new JSON().getGson().fromJson(json, QueueList.class);
```


