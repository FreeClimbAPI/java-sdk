

# OutDialApiConnectWebhook

An outbound call initiated by the REST API has connected and the callConnectUrl specified in the API request is being invoked. A PerCL response is expected if the call was successfully connected (with status of inProgress).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Context or reason why this request is being made. Will be outDialApiConnect - An outbound call spawned by the REST API has connected and the callConnectUrl specified in the API request is being invoked. |  [optional]
**accountId** | **String** | Account ID associated with your account. |  [optional]
**callId** | **String** | Unique identifier for this Call, generated by FreeClimb |  [optional]
**from** | **String** | Phone number of the party that initiated the Call (in E.164 format). |  [optional]
**to** | **String** | Phone number or SIP URL of the party that is receiving the call (phone number in E.164 format). |  [optional]
**callStatus** | **CallStatus** |  |  [optional]
**direction** | **CallDirection** |  |  [optional]
**conferenceId** | **String** | This is only populated if request pertains to a conference. Otherwise, it is set to null. |  [optional]
**queueId** | **String** | This is only populated if the request pertains to a queue. Otherwise, it is set to null. |  [optional]
**parentCallId** | **String** | ID of the Call that created this leg (child call). |  [optional]


