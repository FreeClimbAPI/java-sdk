

# RecordUtterance

The `RecordUtterance` command records the caller's voice and returns the URL of a file containing the audio recording. `RecordUtterance` is blocking and is a terminal command. As such, the `actionUrl` property is required, and control of the Call picks up using the PerCL returned in response to the `actionUrl`. Recording information is returned in the `actionUrl` request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionUrl** | **URI** | URL to which information on the completed recording is submitted. The PerCL received in response is then used to continue with Call processing. | 
**silenceTimeoutMs** | **Integer** | Interval of silence that should elapse before ending the recording. |  [optional]
**finishOnKey** | **String** | Key that triggers the end of the recording. any digit, &#39;#&#39;, or &#39;*&#39; |  [optional]
**maxLengthSec** | **Integer** | Maximum length for the command execution in seconds. |  [optional]
**playBeep** | **Boolean** | Indicates whether to play a beep sound before the start of the recording. If set to &#x60;false&#x60;, no beep is played. |  [optional]
**autoStart** | **Boolean** | If &#x60;false&#x60;, recording begins immediately after the RecordUtterance command is processed. If &#x60;true&#x60;, recording begins when audio is present and if audio begins before the &#x60;maxLengthSec&#x60; timeout. If no audio begins before &#x60;maxLengthSec&#x60;, no recording is generated. |  [optional]
**privacyMode** | **Boolean** | Parameter &#x60;privacyMode&#x60; will not log the &#x60;text&#x60; as required by PCI compliance. |  [optional]



