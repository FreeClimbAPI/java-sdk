

# OutDialConnectWebhook

A Call generated by OutDial has connected and the callConnectUrl is being invoked. This request is made in the context of the Call leg that was generated using OutDial and not the parent (the OutDialStart webhook is invoked on the parent call to continue that call context). A PerCL response is expected if the call was successfully connected (as indicated by status of inProgress) and begins the execution context for this (child) call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Context or reason why this request is being made. Will be outDialConnect - A Call generated by OutDial has connected and the callConnectUrl is being invoked. |  [optional]
**accountId** | **String** | Account ID associated with your account. |  [optional]
**callId** | **String** | Unique identifier for this Call, generated by FreeClimb |  [optional]
**from** | **String** | Phone number of the party that initiated the Call (in E.164 format). |  [optional]
**to** | **String** | Phone number or SIP URL of the party that is receiving the call (phone number in E.164 format). |  [optional]
**callStatus** | **CallStatus** |  |  [optional]
**direction** | **CallDirection** |  |  [optional]
**conferenceId** | **String** | This is only populated if request pertains to a conference. Otherwise, it is set to null. |  [optional]
**queueId** | **String** | This is only populated if the request pertains to a queue. Otherwise, it is set to null. |  [optional]
**parentCallId** | **String** | ID of the Call that created this leg (child call). |  [optional]


