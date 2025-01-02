

# RecordWebhook

The RecordUtterance command has completed and its actionUrl is being invoked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | The context or reason why this request is being made. Will be record - The RecordUtterance command has completed and its actionUrl is being invoked. |  [optional]
**accountId** | **String** | Account ID associated with your account. |  [optional]
**callId** | **String** | Unique identifier for this Call, generated by FreeClimb |  [optional]
**from** | **String** | Phone number of the party that initiated the Call (in E.164 format). |  [optional]
**to** | **String** | Phone number provisioned to the customer and to which this Call is directed (in E.164 format). |  [optional]
**callStatus** | **CallStatus** |  |  [optional]
**direction** | **CallDirection** |  |  [optional]
**conferenceId** | **String** | This is only populated if request pertains to a conference. Otherwise, it is set to null. |  [optional]
**queueId** | **String** | This is only populated if the request pertains to a queue. Otherwise, it is set to null. |  [optional]
**recordingId** | **String** | ID of the recording. |  [optional]
**recordingUrl** | **URI** | URL of the recorded audio file. This URL can be used as is in a Play command to play the recording (no authentication needed). It can also be used to download a recording file via the REST API. |  [optional]
**recordingSize** | **String** | Size of the recording in bytes |  [optional]
**recordingFormat** | **String** | File type of the recording (audio/wav) |  [optional]
**recordingDurationSec** | **Integer** | Duration of the recorded audio rounded up to the nearest second (in seconds) |  [optional]
**termReason** | **RecordUtteranceTermReason** |  |  [optional]
**parentCallId** | **String** | ID of Call that created this leg (child call). |  [optional]
**privacyMode** | **Boolean** | If true then it indicates the recording will only be available for download for two minutes prior to it being deleted. This is to minimize risk of anyone else getting access to the url and attempting to access it. |  [optional]


