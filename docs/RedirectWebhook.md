

# RedirectWebhook

The Redirect command is executing and its actionUrl is being invoked. A PerCL response is expected.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Context or reason why this request is being made. Will be redirect - The Redirect command is executing and its actionUrl is being invoked. |  [optional]
**accountId** | **String** | Account ID associated with your account. |  [optional]
**callId** | **String** | Unique identifier for this Call, generated by FreeClimb |  [optional]
**from** | **String** | Phone number of the party that initiated the Call (in E.164 format). |  [optional]
**to** | **String** | Phone number provisioned to the customer and to which this Call is directed (in E.164 format). |  [optional]
**callStatus** | **CallStatus** |  |  [optional]
**direction** | **CallDirection** |  |  [optional]
**conferenceId** | **String** | This is only populated if request pertains to a conference. Otherwise, it is set to null. |  [optional]
**queueId** | **String** | This is only populated if the request pertains to a queue. Otherwise, it is set to null. |  [optional]
**parentCallId** | **String** | ID of Call that created this leg (child call). |  [optional]



