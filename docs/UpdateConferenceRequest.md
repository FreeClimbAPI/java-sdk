

# UpdateConferenceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | Description for this conference. Maximum 64 characters. |  [optional]
**playBeep** | **PlayBeep** |  |  [optional]
**status** | **UpdateConferenceRequestStatus** |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.UpdateConferenceRequest;

String json = "{\"alias\":\"Customer Conference\",\"playBeep\":\"always\",\"status\":\"empty\"}";

// create an instance of UpdateConferenceRequest from a JSON string
UpdateConferenceRequest updateConferenceRequest = new JSON().getGson().fromJson(json, UpdateConferenceRequest.class);
```


