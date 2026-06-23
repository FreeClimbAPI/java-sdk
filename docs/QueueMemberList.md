

# QueueMemberList


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
**queueMembers** | [**List&lt;QueueMember&gt;**](QueueMember.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.QueueMemberList;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"queueMembers\":[{\"uri\":\"string\",\"callId\":\"string\",\"waitTime\":0,\"position\":0,\"dateEnqueued\":\"string\"}]}";

// create an instance of QueueMemberList from a JSON string
QueueMemberList queueMemberList = new JSON().getGson().fromJson(json, QueueMemberList.class);
```


