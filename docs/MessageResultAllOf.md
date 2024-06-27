

# MessageResultAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | String that uniquely identifies this account resource. |  [optional]
**messageId** | **String** | String that uniquely identifies this message resource |  [optional]
**status** | **MessageStatus** |  |  [optional]
**from** | **String** | Phone number in E.164 format that sent the message. |  [optional]
**to** | **String** | Phone number in E.164 format that received the message. |  [optional]
**text** | **String** | Message contents |  [optional]
**direction** | **String** | Noting whether the message was inbound or outbound |  [optional]
**notificationUrl** | **String** | URL invoked when message sent |  [optional]
**brandId** | **String** | The unique identifier for the brand associated with the message |  [optional]
**campaignId** | **String** | The unique identifier for the campaign associated with the message |  [optional]
**segmentCount** | **BigDecimal** | The number of segments into which the message was split |  [optional]
**mediaUrls** | **List&lt;URI&gt;** | an array of HTTP URLs which were attached this this message |  [optional]



