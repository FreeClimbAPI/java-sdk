

# Sms

The `Sms` command can be used to send an SMS message to a phone number during a phone call. International SMS is disabled by default.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to** | **String** | E.164 representation of the phone number to which the message will be sent. Must be within FreeClimb&#39;s service area and E.164 formatting (e.g., +18003608245). | 
**from** | **String** | E.164 representation of the phone number to use as the sender. This must be an incoming phone number you have purchased from FreeClimb. | 
**text** | **String** | Text contained in the message (maximum 160 characters). | 
**notificationUrl** | **URI** | When the message changes status, this URL will be invoked using HTTP POST with the messageStatus parameters. This is a notification only; any PerCL returned will be ignored. |  [optional]



