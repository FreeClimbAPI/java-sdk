

# TFN

TollFree Campaign details for this number

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **String** | alphanumeric identifier for the TollFree campaign associated with this number | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.TFN;

String json = "{\"campaignId\":\"string\"}";

// create an instance of TFN from a JSON string
TFN TFN = new JSON().getGson().fromJson(json, TFN.class);
```


