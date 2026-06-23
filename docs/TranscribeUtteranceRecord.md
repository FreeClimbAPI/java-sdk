

# TranscribeUtteranceRecord


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**saveRecording** | **Boolean** |  |  [optional]
**maxLengthSec** | **Integer** |  |  [optional]
**rcrdTerminationSilenceTimeMs** | **Integer** |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.TranscribeUtteranceRecord;

String json = "{\"saveRecording\":false,\"maxLengthSec\":60,\"rcrdTerminationSilenceTimeMs\":0}";

// create an instance of TranscribeUtteranceRecord from a JSON string
TranscribeUtteranceRecord transcribeUtteranceRecord = new JSON().getGson().fromJson(json, TranscribeUtteranceRecord.class);
```


