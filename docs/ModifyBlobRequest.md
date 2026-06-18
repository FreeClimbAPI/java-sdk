

# ModifyBlobRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob** | **Object** |  | 
**alias** | **String** | Custom identifier for this blob that is unique for the owning account. It will be set to the blobId by default if not provided. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.ModifyBlobRequest;

String json = "{\"blob\":{\"firstName\":\"John\",\"lastName\":\"Doe\"},\"alias\":\"customer-profile\"}";

// create an instance of ModifyBlobRequest from a JSON string
ModifyBlobRequest modifyBlobRequest = new JSON().getGson().fromJson(json, ModifyBlobRequest.class);
```


