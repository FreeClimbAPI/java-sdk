

# Capabilities

Details for which features this number may be used.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice** | **Boolean** | Indicates whether a number can be used for voice calls. Replaces voiceEnabled. | 
**sms** | **Boolean** | Indicates whether a number can be used SMS messaging. Replaces smsEnabled. | 
**tollFree** | **Boolean** | Indicates that a number is toll-free and will make toll-free calls, and when enabled, toll-free messages. | 
**tenDLC** | **Boolean** | Indicates that a number, if sms is true, will be used for 10DLC messaging | 
**shortCode** | **Boolean** | Indicates that a number is a short code and can be used for short code messaging | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.Capabilities;

String json = "{\"voice\":false,\"sms\":false,\"tollFree\":false,\"tenDLC\":false,\"shortCode\":false}";

// create an instance of Capabilities from a JSON string
Capabilities capabilities = new JSON().getGson().fromJson(json, Capabilities.class);
```


