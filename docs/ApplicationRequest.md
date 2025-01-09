

# ApplicationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | A human readable description of the application, with maximum length 64 characters. |  [optional]
**voiceUrl** | **URI** | The URL that FreeClimb will request when an inbound call arrives on a phone number assigned to this application. Used only for inbound calls. |  [optional]
**voiceFallbackUrl** | **URI** | The URL that FreeClimb will request if it times out waiting for a response from the voiceUrl. Used for inbound calls only. Note: A PerCL response is expected to control the inbound call. |  [optional]
**callConnectUrl** | **URI** | The URL that FreeClimb will request when an outbound call request is complete. Used for outbound calls only.  Note: A PerCL response is expected if the outbound call is connected (status&#x3D;InProgress) to control the call. |  [optional]
**statusCallbackUrl** | **URI** | The URL that FreeClimb will request to pass call status (such as call ended) to the application.  Note: This is a notification only; any PerCL returned will be ignored. |  [optional]
**smsUrl** | **URI** | The URL that FreeClimb will request when a phone number assigned to this application receives an incoming SMS message. Used for inbound SMS only.  Note: Any PerCL returned will be ignored. |  [optional]
**smsFallbackUrl** | **URI** | The URL that FreeClimb will request if it times out waiting for a response from the smsUrl. Used for inbound SMS only.  Note: Any PerCL returned will be ignored. |  [optional]



