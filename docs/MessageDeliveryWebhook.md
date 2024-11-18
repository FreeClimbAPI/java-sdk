

# MessageDeliveryWebhook

An SMS has been received by the platform and is being delivered to the smsUrl of the customer application that is associated with the destination number. A PerCL response will be ignored.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Value will be messageDelivery - An SMS message has been received by the platform and is being delivered to the customer application associated with the destination number. |  [optional]
**accountId** | **String** | Account ID associated with your account. |  [optional]
**from** | **String** | Phone number of the party that initiated the Call (in E.164 format). |  [optional]
**to** | **String** | Phone number provisioned to you and to which this Call is directed (in E.164 format). |  [optional]
**text** | **String** | Body of the SMS message. |  [optional]
**direction** | **String** | Value will be inbound to indicate the receipt of a message into the FreeClimb platform. |  [optional]
**applicationId** | **String** | ID of the application to which the destination number is assigned. |  [optional]
**status** | **String** | Value will be received to indicate that the platform has successfully received the incoming message. |  [optional]
**phoneNumberId** | **String** | ID of the destination phone number. |  [optional]
**uri** | **String** | The URI for this resource, relative to the API base URL |  [optional]



