

# MessageResultAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | String that uniquely identifies this account resource. |  [optional]
**messageId** | **String** | String that uniquely identifies this message resource |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Indicates the state of the message through the message lifecycle including: new, queued, rejected, sending, sent, failed, received, undelivered, expired, deleted, and unknown |  [optional]
**from** | **String** | Phone number in E.164 format that sent the message. |  [optional]
**to** | **String** | Phone number in E.164 format that received the message. |  [optional]
**text** | **String** | Message contents |  [optional]
**direction** | **String** | Noting whether the message was inbound or outbound |  [optional]
**notificationUrl** | **String** | URL invoked when message sent |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
NEW | &quot;new&quot;
QUEUED | &quot;queued&quot;
REJECTED | &quot;rejected&quot;
SENDING | &quot;sending&quot;
SENT | &quot;sent&quot;
FAILED | &quot;failed&quot;
RECEIVED | &quot;received&quot;
UNDELIVERED | &quot;undelivered&quot;
EXPIRED | &quot;expired&quot;
DELETED | &quot;deleted&quot;
UNKNOWN | &quot;unknown&quot;



