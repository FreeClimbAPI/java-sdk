

# LogList


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
**logs** | [**List&lt;LogResult&gt;**](LogResult.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.LogList;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"logs\":[{\"timestamp\":0,\"level\":\"info\",\"requestId\":\"string\",\"accountId\":\"string\",\"callId\":\"string\",\"message\":\"string\"}]}";

// create an instance of LogList from a JSON string
LogList logList = new JSON().getGson().fromJson(json, LogList.class);
```


