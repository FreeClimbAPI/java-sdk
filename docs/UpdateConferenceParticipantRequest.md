

# UpdateConferenceParticipantRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**talk** | **Boolean** | (Optional) Default is &#x60;true&#x60;. Setting to &#x60;false&#x60; mutes the Participant. FreeClimb returns an error and ignores any other value. |  [optional]
**listen** | **Boolean** | (Optional) Default is &#x60;true&#x60;. Setting to &#x60;false&#x60; silences the Conference for this Participant. FreeClimb returns an error and ignores any other value. |  [optional]
**dtmfPassThrough** | **Boolean** | (Optional) Default is &#x60;true&#x60;. Setting to &#x60;false&#x60; mutes dtmf audio for this Participant. FreeClimb returns an error and ignores any other value. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.UpdateConferenceParticipantRequest;

String json = "{\"talk\":true,\"listen\":true,\"dtmfPassThrough\":true}";

// create an instance of UpdateConferenceParticipantRequest from a JSON string
UpdateConferenceParticipantRequest updateConferenceParticipantRequest = new JSON().getGson().fromJson(json, UpdateConferenceParticipantRequest.class);
```


