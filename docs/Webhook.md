

# Webhook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Type of webhook request |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.Webhook;

String json = "{\"requestType\":\"string\"}";

// create an instance of Webhook from a JSON string
Webhook webhook = new JSON().getGson().fromJson(json, Webhook.class);
```


