

# AddToConference

The `AddToConference` command adds a Participant to a Conference. Two Call legs can be bridged together by creating a Conference and adding both Call legs to it via `AddToConference`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowCallControl** | **Boolean** | If &#x60;true&#x60;, Call control will be enabled for this Participant&#39;s Call leg. |  [optional]
**callControlSequence** | **String** | Defines a sequence of digits that, when entered by this caller, invokes the &#x60;callControlUrl&#x60;. Only digits plus &#39;*&#39;, and &#39;#&#39; may be used. |  [optional]
**callControlUrl** | **String** | URL to be invoked when this Participant enters the digit sequence defined in the &#x60;callControlSequence&#x60; attribute. |  [optional]
**conferenceId** | **String** | ID of the Conference to which to add the Participant (Call leg). Conference must exist or an error will result. | 
**leaveConferenceUrl** | **String** | URL to be invoked when the Participant leaves the Conference.  |  [optional]
**listen** | **Boolean** | If &#x60;true&#x60;, the Participant joins the Conference with listen privileges. This may be modified later via the REST API or &#x60;SetListen&#x60; PerCL command. |  [optional]
**notificationUrl** | **String** | When the Participant enters the Conference, this URL will be invoked using an HTTP POST request with the standard request parameters. |  [optional]
**startConfOnEnter** | **Boolean** | Flag that indicates whether a Conference starts upon entry of this particular Participant. This is usually set to &#x60;true&#x60; for moderators and &#x60;false&#x60; for all other Participants. |  [optional]
**talk** | **Boolean** | If &#x60;true&#x60;, the Participant joins the Conference with talk privileges. This may be modified later via the REST API or &#x60;SetTalk&#x60; PerCL command.  |  [optional]



