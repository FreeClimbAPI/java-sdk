

# RecordingResultAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordingId** | **String** | String that uniquely identifies this recording resource. |  [optional]
**accountId** | **String** | ID of the account that created this recording. |  [optional]
**callId** | **String** | ID of the Call that was recorded. If a Conference was recorded, this value is empty and the conferenceId property is populated. |  [optional]
**durationSec** | **Integer** | Length of the recording in seconds. |  [optional]
**conferenceId** | **String** | ID of the Conference that was recorded. If a Call was recorded, this value is empty and the callId property is populated. |  [optional]



