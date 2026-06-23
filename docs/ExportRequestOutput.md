

# ExportRequestOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **ExportOutputType** |  | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.ExportRequestOutput;

String json = "{\"type\":\"csv\"}";

// create an instance of ExportRequestOutput from a JSON string
ExportRequestOutput exportRequestOutput = new JSON().getGson().fromJson(json, ExportRequestOutput.class);
```


