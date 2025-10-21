

# SayStandard

The `Say` command provides Text-To-Speech (TTS) support using the freeclimb.standard  TTS engine. It converts text to speech and then renders it in a female voice back to the caller. `SayStandard` is useful in cases where it's difficult to pre-record a prompt for any reason. `SayStandard` does not allow barge-in unless nested within a `GetSpeech` command. The file will always be played to completion unless nested.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | The message to be played to the caller using TTS. The size of the string is limited to 4 KB (or 4,096 bytes). An empty string will cause the command to be skipped. | 
**loop** | **Integer** | Number of times the text is said. Specifying &#39;0&#39; causes the &#x60;Say&#x60; action to loop until the Call is hung up. |  [optional]
**privacyMode** | **Boolean** | Parameter &#x60;privacyMode&#x60; will not log the &#x60;text&#x60; as required by PCI compliance. |  [optional]
**engine** | [**SayStandardEngine**](SayStandardEngine.md) |  | 



