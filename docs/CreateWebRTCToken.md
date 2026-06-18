

# CreateWebRTCToken


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to** | **String** | E.164 formatted phone number to which calls using this token will be made. | 
**from** | **String** | E.164 formatted phone number owned by the reqeusting account from which calls using this token will be made. | 
**uses** | **Integer** | number of times this token may be used for a WebRTC call | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.CreateWebRTCToken;

String json = "{\"to\":\"string\",\"from\":\"string\",\"uses\":0}";

// create an instance of CreateWebRTCToken from a JSON string
CreateWebRTCToken createWebRTCToken = new JSON().getGson().fromJson(json, CreateWebRTCToken.class);
```


