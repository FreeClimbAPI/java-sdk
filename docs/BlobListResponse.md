

# BlobListResponse


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
**blobs** | [**List&lt;BlobResult&gt;**](BlobResult.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.BlobListResponse;

String json = "{\"total\":0,\"start\":0,\"end\":0,\"page\":0,\"numPages\":0,\"pageSize\":0,\"nextPageUri\":\"string\",\"blobs\":[{\"blobId\":\"BL0123456789abcdefABCDEF0123456789abcdef02\",\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef01\",\"alias\":\"string\",\"revision\":0,\"dateCreated\":\"2022-01-01T00:00:00Z\",\"dateUpdated\":\"2022-01-01T00:00:00Z\",\"expiresAt\":\"2022-01-01T00:00:00Z\"}]}";

// create an instance of BlobListResponse from a JSON string
BlobListResponse blobListResponse = new JSON().getGson().fromJson(json, BlobListResponse.class);
```


