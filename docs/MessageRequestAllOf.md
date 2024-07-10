

# MessageRequestAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | Phone number to use as the sender. This must be an incoming phone number that you have purchased from FreeClimb. | 
**to** | **String** | Phone number to receive the message. Must be within FreeClimb&#39;s service area. | 
**text** | **String** | Text contained in the message (maximum 160 characters).   **Note:** For text, only ASCII characters are supported. | 
**notificationUrl** | **String** | When the Message changes status, this URL is invoked using HTTP POST with the messageStatus parameters.  **Note:** This is a notification only; any PerCL returned is ignored. |  [optional]
**mediaUrls** | **List&lt;URI&gt;** | an array of HTTP URLs which are to be used as attachments to the message. This will force the message into being an MMS message and must be done using a from number which is MMS capabile. |  [optional]



