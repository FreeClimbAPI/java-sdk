

# ExportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceType** | **ExportResourceType** |  | 
**format** | **List&lt;String&gt;** |  |  [optional]
**output** | [**ExportRequestOutput**](ExportRequestOutput.md) |  | 
**query** | **Object** |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.ExportRequest;

String json = "{\"resourceType\":\"Messages\",\"format\":[\"messageId\",\"dateUpdated\",\"status\"],\"output\":{\"type\":\"csv\"},\"query\":{\"direction\":\"inbound\"}}";

// create an instance of ExportRequest from a JSON string
ExportRequest exportRequest = new JSON().getGson().fromJson(json, ExportRequest.class);
```


