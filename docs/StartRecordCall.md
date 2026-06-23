

# StartRecordCall

The `StartRecordCall` command records the current call and returns the URL of a file containing the audio recording when recording completes. `StartRecordCall` is non-blocking. After recording of the current call begins, control of the call moves to the PerCL command that follows `StartRecordCall` in the current PerCL script.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.StartRecordCall;

String json = "{\"command\":\"StartRecordCall\"}";

// create an instance of StartRecordCall from a JSON string
StartRecordCall startRecordCall = new JSON().getGson().fromJson(json, StartRecordCall.class);
```


