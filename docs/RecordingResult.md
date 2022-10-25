

# RecordingResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | The URI for this resource, relative to /apiserver. |  [optional]
**dateCreated** | **String** | The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**dateUpdated** | **String** | The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**revision** | **Integer** | Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated. |  [optional]
**recordingId** | **String** | String that uniquely identifies this recording resource. |  [optional]
**accountId** | **String** | ID of the account that created this recording. |  [optional]
**callId** | **String** | ID of the Call that was recorded. If a Conference was recorded, this value is empty and the conferenceId property is populated. |  [optional]
**durationSec** | **Integer** | Length of the recording in seconds. |  [optional]
**conferenceId** | **String** | ID of the Conference that was recorded. If a Call was recorded, this value is empty and the callId property is populated. |  [optional]



