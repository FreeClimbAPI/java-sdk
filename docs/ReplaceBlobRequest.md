

# ReplaceBlobRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob** | **Object** |  | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.ReplaceBlobRequest;

String json = "{\"blob\":{\"firstName\":\"John\",\"lastName\":\"Doe\"}}";

// create an instance of ReplaceBlobRequest from a JSON string
ReplaceBlobRequest replaceBlobRequest = new JSON().getGson().fromJson(json, ReplaceBlobRequest.class);
```


