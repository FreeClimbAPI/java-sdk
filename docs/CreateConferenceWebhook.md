

# CreateConferenceWebhook

A Conference has been created and its statusCallbackUrl or actionUrl is being invoked. A PerCL response is expected if the actionUrl is being invoked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Context or reason why this request is being made. Will be createConference - A Conference has been created and its statusCallbackUrl or actionUrl is being invoked. |  [optional]
**callId** | **String** | Unique ID for this Call, generated by FreeClimb. |  [optional]
**accountId** | **String** | Account ID associated with your account. |  [optional]
**from** | **String** | Phone number of the party that initiated the Call (in E.164 format). |  [optional]
**to** | **String** | Phone number provisioned to you and to which this Call is directed (in E.164 format). |  [optional]
**callStatus** | **CallStatus** |  |  [optional]
**direction** | **CallDirection** |  |  [optional]
**conferenceId** | **String** | Unique ID of the Conference. |  [optional]
**queueId** | **String** | This is only populated if the request pertains to a Queue. Otherwise, it is set to null. |  [optional]
**status** | **ConferenceStatus** |  |  [optional]
**recordingUrl** | **URI** | The URL of the Conference’s recorded audio. Populated only if a Recording exists and the Conference was emptied. Present only if statusCallbackUrl is being invoked. |  [optional]
**recordingId** | **String** | The unique ID of the Recording from this Conference. Populated only if a Recording exists and the Conference was emptied. Present only if statusCallbackUrl is being invoked. |  [optional]
**recordingDurationSec** | **Integer** | The duration of the recorded audio rounded up to the nearest second (in seconds). Populated only if a Recording exists and the Conference was emptied. Present only if statusCallbackUrl is being invoked. |  [optional]


