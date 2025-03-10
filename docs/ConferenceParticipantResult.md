

# ConferenceParticipantResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | The URI for this resource, relative to /apiserver. |  [optional]
**dateCreated** | **String** | The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**dateUpdated** | **String** | The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**revision** | **Integer** | Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated. |  [optional]
**accountId** | **String** | ID of the account that created this participant. |  [optional]
**conferenceId** | **String** | ID of the conference this participant is in. |  [optional]
**callId** | **String** | ID of the Call associated with this Participant. |  [optional]
**talk** | **Boolean** | True if this Participant has talk privileges in the Conference. False otherwise. |  [optional]
**listen** | **Boolean** | True if this Participant has listen privileges in the Conference. False otherwise. |  [optional]
**dtmfPassThrough** | **Boolean** | True if this Participant had dtmfPassThrough privileges in the Conference. False otherwise. |  [optional]
**startConfOnEnter** | **Boolean** | True if this Participant joining the Conference caused the Conference to start (status &#x3D; inProgress). False otherwise. |  [optional]



