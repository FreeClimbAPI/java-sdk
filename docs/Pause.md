

# Pause

The `Pause` command halts execution of the current PerCL script for a specified number of milliseconds. If `Pause` is the first command in a PerCL document, FreeClimb will wait for the specified time to elapse before picking up the call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**length** | **Integer** | Length in milliseconds. FreeClimb will wait silently before continuing on. | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.Pause;

String json = "{\"command\":\"Pause\",\"length\":0}";

// create an instance of Pause from a JSON string
Pause pause = new JSON().getGson().fromJson(json, Pause.class);
```


