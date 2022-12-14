

# ConferenceResultAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conferenceId** | **String** | A string that uniquely identifies this Conference resource. |  [optional]
**accountId** | **String** | ID of the account that created this Conference. |  [optional]
**alias** | **String** | A description for this Conference. |  [optional]
**playBeep** | **PlayBeep** |  |  [optional]
**record** | **Boolean** | Flag indicating whether recording is enabled for this Conference. |  [optional]
**status** | **ConferenceStatus** |  |  [optional]
**waitUrl** | **String** | URL referencing the audio file to be used as default wait music for the Conference when it is in the populated state. |  [optional]
**actionUrl** | **String** | URL invoked once the Conference is successfully created. |  [optional]
**statusCallbackUrl** | **String** | URL to inform that the Conference status has changed. |  [optional]
**subresourceUris** | **Object** | The list of subresources for this Conference. This includes participants and/or recordings. |  [optional]



