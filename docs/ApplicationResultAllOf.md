

# ApplicationResultAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | ID of the account that owns this phone number. |  [optional]
**applicationId** | **String** | ID of the Application that FreeClimb should contact if a Call or SMS arrives for this phone number or a Call from this number is placed. An incoming phone number is not useful until associated with an applicationId. |  [optional]
**alias** | **String** | Description for this phone number. Typically the conventionally-formatted version of the phone number. |  [optional]
**voiceUrl** | **String** | The URL FreeClimb will request when a phone number assigned to this Application receives a Call. Used for inbound calls only. |  [optional]
**voiceFallbackUrl** | **String** | The URL that FreeClimb will request if it times out waiting for a response from the voiceUrl. Used for inbound calls only. |  [optional]
**callConnectUrl** | **String** | The URL to which FreeClimb will make a POST request informing the result of the outbound Call request. The status property of the request message specifies if the Call was connected or not. |  [optional]
**statusCallbackUrl** | **String** | A URL to which FreeClimb will make a POST request when the Call ends to notify this app. |  [optional]
**smsUrl** | **String** | The URL FreeClimb will request when a phone number assigned to this Application receives an incoming SMS message. Used for inbound SMS only. |  [optional]
**smsFallbackUrl** | **String** | The URL that FreeClimb will request if it times out waiting for a response from the smsUrl. Used for inbound SMS only. |  [optional]



