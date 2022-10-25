

# SetListen

The `SetListen` command enables or disables the listen privilege for a Conference Participant provided both calls are in the same conference. The Participant can hear what the other participants are saying only if this privilege is enabled.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callId** | **String** | ID of the call leg that is to be assigned the listen privilege. The Call must be in a Conference or an error will be triggered. | 
**listen** | **Boolean** | Specifying &#x60;false&#x60; will silence the Conference for this Participant. |  [optional]



