

# TerminateConference

The `TerminateConference` command terminates an existing Conference. Any active participants are hung up on by FreeClimb. If this is not the desired behavior, use the `RemoveFromConference` command to unbridge Calls that should not be hung up. Note: The Call requesting TerminateConference must be on the same Conference for this command to execute.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.TerminateConference;

String json = "{\"command\":\"TerminateConference\"}";

// create an instance of TerminateConference from a JSON string
TerminateConference terminateConference = new JSON().getGson().fromJson(json, TerminateConference.class);
```


