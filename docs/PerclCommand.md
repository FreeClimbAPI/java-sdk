

# PerclCommand

An individual command used in a PerCLScript.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **String** | Name of PerCL Command (this is automatically derived from mapping configuration and should not be manually supplied in any arguments) |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.PerclCommand;

String json = "{\"command\":\"string\"}";

// create an instance of PerclCommand from a JSON string
PerclCommand perclCommand = new JSON().getGson().fromJson(json, PerclCommand.class);
```


