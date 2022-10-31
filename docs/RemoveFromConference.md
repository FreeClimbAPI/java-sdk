

# RemoveFromConference

The `RemoveFromConference` command removes a Participant from a Conference but does not hang up. Instead, the Call is simply unbridged and what happens next with the Call is determined by the PerCL returned in response to the `leaveConferenceUrl` attribute.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callId** | **String** | ID of the Call leg to be removed from the Conference. The Call must be in a Conference or an error will be triggered. | 



