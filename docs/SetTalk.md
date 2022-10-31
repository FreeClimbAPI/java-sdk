

# SetTalk

The `SetTalk` command enables or disables the talk privilege for a Participant in a Conference provided both calls are in the same conference. If 'true', no audio from that Participant is shared with the other Participants of the Conference.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callId** | **String** | ID of the call leg that is to be muted or unmuted. The Call must be in a Conference or an error will be triggered. | 
**talk** | **Boolean** | Specifying &#x60;false&#x60; mutes the Participant. |  [optional]



