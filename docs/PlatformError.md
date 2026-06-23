

# PlatformError

Standard error structure returned by platform.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** |  |  [optional]
**call** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**details** | **Object** |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.PlatformError;

String json = "{\"code\":0,\"call\":\"Internal Failure\",\"url\":\"https://docs.freeclimb.com/reference/error-and-warning-dictionary#0\"}";

// create an instance of PlatformError from a JSON string
PlatformError platformError = new JSON().getGson().fromJson(json, PlatformError.class);
```


