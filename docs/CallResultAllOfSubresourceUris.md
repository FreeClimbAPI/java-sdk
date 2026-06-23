

# CallResultAllOfSubresourceUris

The list of subresources for this Call. These include things like logs and recordings associated with the Call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logs** | **String** | The URI for the logs associated with this Call. |  [optional]
**recordings** | **String** | The URI for the recordings associated with this Call. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.CallResultAllOfSubresourceUris;

String json = "{\"logs\":\"string\",\"recordings\":\"string\"}";

// create an instance of CallResultAllOfSubresourceUris from a JSON string
CallResultAllOfSubresourceUris callResultAllOfSubresourceUris = new JSON().getGson().fromJson(json, CallResultAllOfSubresourceUris.class);
```


