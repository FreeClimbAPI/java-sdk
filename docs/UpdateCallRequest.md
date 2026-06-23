

# UpdateCallRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **UpdateCallRequestStatus** |  | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.UpdateCallRequest;

String json = "{\"status\":\"canceled\"}";

// create an instance of UpdateCallRequest from a JSON string
UpdateCallRequest updateCallRequest = new JSON().getGson().fromJson(json, UpdateCallRequest.class);
```


