

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



