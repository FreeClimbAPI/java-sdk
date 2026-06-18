

# CompletionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | Question to ask the Knowledge Base | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.CompletionRequest;

String json = "{\"query\":\"What are your business hours?\"}";

// create an instance of CompletionRequest from a JSON string
CompletionRequest completionRequest = new JSON().getGson().fromJson(json, CompletionRequest.class);
```


