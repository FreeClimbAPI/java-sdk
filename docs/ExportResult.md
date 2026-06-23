

# ExportResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | String that uniquely identifies this account resource. | 
**uri** | **String** |  | 
**dateCreated** | **String** |  | 
**dateUpdated** | **String** |  | 
**revision** | **Integer** |  | 
**exportId** | **String** | String that uniquely identifies this export resource | 
**status** | **ExportStatus** |  | 
**size** | **Integer** |  | 
**resourceType** | **ExportResourceType** |  | 
**query** | **Object** | Query params used to filter exported documents | 
**format** | **List&lt;String&gt;** | Desired fields of exported documents | 
**output** | [**ExportResultOutput**](ExportResultOutput.md) |  | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.ExportResult;

String json = "{\"accountId\":\"AC0123456789abcdefABCDEF0123456789abcdef07\",\"uri\":\"/Accounts/AC0123456789abcdefABCDEF0123456789abcdef07/Exports/EX0123456789abcdefABCDEF0123456789abcdef08\",\"dateCreated\":\"Wed, 26 Jun 2024 15:45:06 UTC\",\"dateUpdated\":\"Wed, 26 Jun 2024 15:45:06 UTC\",\"revision\":1,\"exportId\":\"EX0123456789abcdefABCDEF0123456789abcdef08\",\"status\":\"completed\",\"size\":12893786,\"resourceType\":\"Messages\",\"query\":{\"direction\":\"inbound\"},\"format\":[\"messageId\",\"dateUpdated\",\"segmentCount\",\"status\"],\"output\":{\"type\":\"csv\"}}";

// create an instance of ExportResult from a JSON string
ExportResult exportResult = new JSON().getGson().fromJson(json, ExportResult.class);
```


