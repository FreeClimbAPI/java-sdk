

# CreateConference

The `CreateConference` command does exactly what its name implies — it creates an unpopulated Conference (one without any Participants). Once created, a Conference remains in FreeClimb until explicitly terminated by a customer. Once a Conference has been terminated, it can no longer be used.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionUrl** | **String** |  This URL is invoked once the Conference is successfully created. Actions on the Conference, such as adding Participants, can be performed via the PerCL script returned in the response.  | 
**alias** | **Boolean** | Descriptive name for the Conference.  |  [optional]
**playBeep** | **PlayBeep** |  |  [optional]
**record** | **Boolean** | When set to &#x60;true&#x60;, the entire Conference is recorded. The &#x60;statusCallbackUrl&#x60; of the Conference will receive a &#x60;conferenceRecordingEnded&#x60; Webhook when the Conference transitions from the &#x60;inProgress&#x60; to empty state. |  [optional]
**statusCallbackUrl** | **String** | This URL is invoked when the status of the Conference changes or when a recording of the Conference has become available. |  [optional]
**waitUrl** | **String** | If specified, this URL provides the custom hold music for the Conference when it is in the populated state. This attribute is always fetched using HTTP GET and is fetched just once – when the Conference is created. The URL must be an audio file that is reachable and readable by FreeClimb. |  [optional]



