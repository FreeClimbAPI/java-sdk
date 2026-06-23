

# ExportResultOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **ExportOutputType** |  | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.ExportResultOutput;

String json = "{\"type\":\"csv\"}";

// create an instance of ExportResultOutput from a JSON string
ExportResultOutput exportResultOutput = new JSON().getGson().fromJson(json, ExportResultOutput.class);
```


