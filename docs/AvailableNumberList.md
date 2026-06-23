

# AvailableNumberList


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
**availablePhoneNumbers** | [**List&lt;AvailableNumber&gt;**](AvailableNumber.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.AvailableNumberList;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"availablePhoneNumbers\":[{\"capabilities\":{\"voice\":false,\"sms\":false,\"tollFree\":false,\"tenDLC\":false,\"shortCode\":false},\"campaignId\":\"string\",\"phoneNumber\":\"string\",\"alias\":\"string\",\"region\":\"string\",\"country\":\"string\"}]}";

// create an instance of AvailableNumberList from a JSON string
AvailableNumberList availableNumberList = new JSON().getGson().fromJson(json, AvailableNumberList.class);
```


