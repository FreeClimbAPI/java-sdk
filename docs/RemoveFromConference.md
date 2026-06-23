

# RemoveFromConference

The `RemoveFromConference` command removes a Participant from a Conference but does not hang up. Instead, the Call is simply unbridged and what happens next with the Call is determined by the PerCL returned in response to the `leaveConferenceUrl` attribute.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.RemoveFromConference;

String json = "{\"command\":\"RemoveFromConference\"}";

// create an instance of RemoveFromConference from a JSON string
RemoveFromConference removeFromConference = new JSON().getGson().fromJson(json, RemoveFromConference.class);
```


