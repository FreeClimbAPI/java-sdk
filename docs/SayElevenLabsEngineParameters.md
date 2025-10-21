

# SayElevenLabsEngineParameters

The parameters to use for the TTS. The complete list of valid values for the parameters attribute is shown below.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelId** | **String** | The ID of the ElevenLabs model to use for the TTS. The complete list of valid values for the model_id attribute is shown below. |  [optional]
**voiceId** | **String** | The ID of the ElevenLabs voice to use for the TTS. The complete list of valid values for the voice_id attribute is shown below. |  [optional]
**languageCode** | **String** | The language code to use for the TTS. The complete list of valid values for the language_code attribute is shown below. |  [optional]
**voiceSettings** | [**SayElevenLabsEngineParametersVoiceSettings**](SayElevenLabsEngineParametersVoiceSettings.md) |  |  [optional]
**pronunciationDictionary** | [**List&lt;SayElevenLabsEngineParametersPronunciationDictionaryInner&gt;**](SayElevenLabsEngineParametersPronunciationDictionaryInner.md) |  |  [optional]
**seed** | **Integer** |  |  [optional]
**previousText** | **String** |  |  [optional]
**nextText** | **String** |  |  [optional]
**previousRequestIds** | **List&lt;String&gt;** |  |  [optional]
**nextRequestIds** | **List&lt;String&gt;** |  |  [optional]
**applyLanguageTextNormalization** | **Boolean** |  |  [optional]



