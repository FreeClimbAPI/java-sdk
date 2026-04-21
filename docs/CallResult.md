

# CallResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | The URI for this resource, relative to /apiserver. |  [optional]
**dateCreated** | **String** | The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**dateUpdated** | **String** | The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**revision** | **Integer** | Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated. |  [optional]
**dateCreatedISO** | **OffsetDateTime** | The date that this resource was created in ISO 8601 format (e.g., 2022-01-01T00:00:00.000Z). |  [optional]
**dateUpdatedISO** | **OffsetDateTime** | The date that this resource was last updated in ISO 8601 format (e.g., 2022-01-01T00:00:00.000Z). |  [optional]
**callId** | **String** | String that uniquely identifies this Call resource. |  [optional]
**parentCallId** | **String** | ID of the Call that created this leg (child Call). |  [optional]
**accountId** | **String** | ID of the account that owns this Call. |  [optional]
**from** | **String** | Phone number that initiated this Call. |  [optional]
**to** | **String** | Phone number that received this Call. |  [optional]
**phoneNumberId** | **String** | If the Call was inbound, this is the ID of the IncomingPhoneNumber that received the Call (DNIS). If the Call was outbound, this is the ID of the phone number from which the Call was placed (ANI). |  [optional]
**status** | **CallStatus** |  |  [optional]
**startTime** | **String** | Start time of the Call (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call has not yet been dialed. |  [optional]
**startTimeISO** | **OffsetDateTime** | Start time of the Call in ISO 8601 format (e.g., 2022-01-01T00:00:00.000Z). Empty if the Call has not yet been dialed. |  [optional]
**connectTime** | **String** | Time the Call was answered (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call has not yet been dialed. |  [optional]
**connectTimeISO** | **OffsetDateTime** | Time the Call was answered in ISO 8601 format (e.g., 2022-01-01T00:00:00.000Z). Empty if the Call has not yet been dialed. |  [optional]
**endTime** | **String** | End time of the Call (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). Empty if the Call did not complete successfully. |  [optional]
**endTimeISO** | **OffsetDateTime** | End time of the Call in ISO 8601 format (e.g., 2022-01-01T00:00:00.000Z). Empty if the Call did not complete successfully. |  [optional]
**duration** | **Integer** | Total length of the Call in seconds. Measures time between startTime and endTime. This value is empty for busy, failed, unanswered or ongoing Calls. |  [optional]
**connectDuration** | **Integer** | Length of time that the Call was connected in seconds. Measures time between connectTime and endTime. This value is empty for busy, failed, unanswered or ongoing Calls. |  [optional]
**audioStreamDuration** | **Integer** | Length of time that the Call used the audio stream in seconds. This value is empty or zero when the Call did not use the audio stream. |  [optional]
**direction** | **CallDirection** |  |  [optional]
**answeredBy** | **AnsweredBy** |  |  [optional]
**callerName** | **String** | The caller ID name (CNAM) for this Call. Empty if unavailable. |  [optional]
**webRTC** | **Boolean** | Indicates whether this Call was initiated via WebRTC. |  [optional]
**subresourceUris** | [**CallResultAllOfSubresourceUris**](CallResultAllOfSubresourceUris.md) |  |  [optional]
**applicationId** | **String** | ApplicationId associated with the Call. |  [optional]



