

# CreateConferenceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | A description for this Conference. Maximum 64 characters. |  [optional]
**playBeep** | **PlayBeep** |  |  [optional]
**record** | **Boolean** | Setting to &#x60;true&#x60; records the entire Conference. |  [optional]
**waitUrl** | **URI** | If specified, a URL for the audio file that provides custom hold music for the Conference when it is in the populated state. Otherwise, FreeClimb uses a system default audio file. This is always fetched using HTTP GET and is fetched just once &amp;mdash; when the Conference is created. |  [optional]
**statusCallbackUrl** | **URI** | This URL is invoked when the status of the Conference changes. For more information, see **statusCallbackUrl** (below). | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.CreateConferenceRequest;

String json = "{\"alias\":\"Customer Conference\",\"playBeep\":\"always\",\"record\":false,\"waitUrl\":\"https://www.myapp.com/waitMusic\",\"statusCallbackUrl\":\"https://www.myapp.com/conferenceStatus\"}";

// create an instance of CreateConferenceRequest from a JSON string
CreateConferenceRequest createConferenceRequest = new JSON().getGson().fromJson(json, CreateConferenceRequest.class);
```


