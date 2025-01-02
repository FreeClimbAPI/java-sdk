

# GetDigitsWebhook

A POST request with the following fields will be sent to the actionUrl provided in your GetDigits command.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Context or reason why this request is being made. Will be getDigits - The GetDigits command has completed and its actionUrl is being invoked. |  [optional]
**callId** | **String** | Unique ID for this Call, generated by FreeClimb. |  [optional]
**accountId** | **String** | Account ID associated with your account. |  [optional]
**from** | **String** | Phone number of the party that initiated the Call (in E.164 format). |  [optional]
**to** | **String** | Phone number provisioned to you and to which this Call is directed (in E.164 format). |  [optional]
**callStatus** | **CallStatus** |  |  [optional]
**direction** | **CallDirection** |  |  [optional]
**conferenceId** | **String** | Unique ID of the Conference. |  [optional]
**queueId** | **String** | This is only populated if the request pertains to a Queue. Otherwise, it is set to null. |  [optional]
**digits** | **String** | tring of digits entered by the Caller, excluding the terminating digit (if used). The string of digits will be replaced by &#39;xxxxx&#39; when privacyMode is set to true |  [optional]
**reason** | **GetDigitsReason** |  |  [optional]
**parentCallId** | **String** | ID of the Call that created this leg (child call). |  [optional]


