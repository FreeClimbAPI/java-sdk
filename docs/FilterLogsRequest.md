

# FilterLogsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pql** | **String** | The filter query for retrieving logs. See **Performance Query Language** below. | 


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.FilterLogsRequest;

String json = "{\"pql\":\"2020-06-22T19:42:53.376Z < timestamp < 2020-06-23T19:42:53.376Z\"}";

// create an instance of FilterLogsRequest from a JSON string
FilterLogsRequest filterLogsRequest = new JSON().getGson().fromJson(json, FilterLogsRequest.class);
```


