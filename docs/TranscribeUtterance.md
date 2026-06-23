

# TranscribeUtterance

The `TranscribeUtterance` command transcribes the caller’s voice and returns transcription of the audio and optionally returns the recording of the audio transcribed.  `TranscribeUtterance` is blocking and is a terminal command. As such, the actionUrl property is required, and control of the Call picks up using the `PerCL` returned in response of the `actionUrl`. Recording and Transcription information is returned in the actionUrl request. If the reason this command ended was due to the call hanging up, any PerCL returned will not execute.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionUrl** | **URI** |  | 
**playBeep** | **Boolean** |  |  [optional]
**record** | [**TranscribeUtteranceRecord**](TranscribeUtteranceRecord.md) |  |  [optional]
**privacyForLogging** | **Boolean** |  |  [optional]
**privacyForRecording** | **Boolean** |  |  [optional]
**prompts** | [**List&lt;PerclCommand&gt;**](PerclCommand.md) |  |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.TranscribeUtterance;

String json = "{\"command\":\"TranscribeUtterance\",\"actionUrl\":\"https://www.example.com\",\"playBeep\":false,\"record\":{\"saveRecording\":false,\"maxLengthSec\":60,\"rcrdTerminationSilenceTimeMs\":0},\"privacyForLogging\":false,\"privacyForRecording\":false,\"prompts\":[{\"command\":\"string\"}]}";

// create an instance of TranscribeUtterance from a JSON string
TranscribeUtterance transcribeUtterance = new JSON().getGson().fromJson(json, TranscribeUtterance.class);
```


