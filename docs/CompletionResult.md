

# CompletionResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response** | **String** | The generative response from the KnowledgeBase | 
**status** | **CompletionResultStatus** |  | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.CompletionResult;

String json = "{\"response\":\"string\",\"status\":\"success\"}";

// create an instance of CompletionResult from a JSON string
CompletionResult completionResult = new JSON().getGson().fromJson(json, CompletionResult.class);
```


