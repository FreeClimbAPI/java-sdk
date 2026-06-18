

# PerclScript

A PerCL script to be returned to the FreeClimb servers in FreeClimb applications

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commands** | [**List&lt;PerclCommand&gt;**](PerclCommand.md) | A JSON array of PerCL commands |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.PerclScript;

String json = "{\"commands\":[{\"command\":\"string\"}]}";

// create an instance of PerclScript from a JSON string
PerclScript perclScript = new JSON().getGson().fromJson(json, PerclScript.class);
```


