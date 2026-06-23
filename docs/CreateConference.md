

# CreateConference

The `CreateConference` command does exactly what its name implies — it creates an unpopulated Conference (one without any Participants). Once created, a Conference remains in FreeClimb until explicitly terminated by a customer. Once a Conference has been terminated, it can no longer be used.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionUrl** | **URI** |  This URL is invoked once the Conference is successfully created. Actions on the Conference, such as adding Participants, can be performed via the PerCL script returned in the response.  | 
**alias** | **String** | Descriptive name for the Conference.  |  [optional]
**playBeep** | **PlayBeep** |  |  [optional]
**record** | **Boolean** | When set to &#x60;true&#x60;, the entire Conference is recorded. The &#x60;statusCallbackUrl&#x60; of the Conference will receive a &#x60;conferenceRecordingEnded&#x60; Webhook when the Conference transitions from the &#x60;inProgress&#x60; to empty state. |  [optional]
**statusCallbackUrl** | **URI** | This URL is invoked when the status of the Conference changes or when a recording of the Conference has become available. |  [optional]
**waitUrl** | **URI** | If specified, this URL provides the custom hold music for the Conference when it is in the populated state. This attribute is always fetched using HTTP GET and is fetched just once – when the Conference is created. The URL must be an audio file that is reachable and readable by FreeClimb. |  [optional]
**parentCallId** | **String** | ID of the Call that created this leg (child call). |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.CreateConference;

String json = "{\"command\":\"CreateConference\",\"actionUrl\":\"https://www.example.com\",\"alias\":\"string\",\"playBeep\":\"always\",\"record\":false,\"statusCallbackUrl\":\"https://www.example.com\",\"waitUrl\":\"https://www.example.com\",\"parentCallId\":\"string\"}";

// create an instance of CreateConference from a JSON string
CreateConference createConference = new JSON().getGson().fromJson(json, CreateConference.class);
```


