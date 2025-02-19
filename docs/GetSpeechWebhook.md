

# GetSpeechWebhook

The GetSpeech command has completed and its actionUrl is being invoked. A PerCL response is expected, unless reason is hangup.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestType** | **String** | Context or reason why this request is being made. Will be getSpeech - The GetSpeech command has completed and its actionUrl is being invoked. |  [optional]
**callId** | **String** | Unique ID for this Call, generated by FreeClimb. |  [optional]
**accountId** | **String** | Account ID associated with your account. |  [optional]
**from** | **String** | Phone number of the party that initiated the Call (in E.164 format). |  [optional]
**to** | **String** | Phone number provisioned to you and to which this Call is directed (in E.164 format). |  [optional]
**callStatus** | **CallStatus** |  |  [optional]
**direction** | **CallDirection** |  |  [optional]
**conferenceId** | **String** | Unique ID of the Conference. |  [optional]
**queueId** | **String** | This is only populated if the request pertains to a Queue. Otherwise, it is set to null. |  [optional]
**reason** | **GetSpeechReason** |  |  [optional]
**recognitionResult** | **String** | Semantic content (either a string if speech was recognized or a digit if a digit was input instead of speech) returned from the entry or tag that was recognized within the grammar. The content will be replaced by &#39;xxxxx&#39; when privacyMode is set to true. This field is populated only if the reason field is set to recognition or digit. |  [optional]
**confidence** | **Integer** | Level of confidence in the obtained result. This is a value in the range 0 to 100 – with 0 being total lack of confidence and 100 being absolute certainty in the recognition. This field is populated only if the reason field is set to recognition. |  [optional]
**parentCallId** | **String** | ID of the Call that created this leg (child call). |  [optional]
**completionReason** | **String** | Advanced diagnostic information if reason was error. See RFC 6787 section 9.4.12 - speech recognition. |  [optional]
**completionCause** | **String** | Advanced diagnostic information if reason was error. See RFC 6787 section 9.4.11 - speech recognition. |  [optional]
**mrcpCode** | **Integer** | Advanced diagnostic information if reason was error. See RFC 6787 section 5.4 - MRCPv2 specification. |  [optional]
**mrcpDiagnostic** | **String** | Advanced diagnostic information if reason was error. See RFC 6787 section 5.4 - MRCPv2 specification. |  [optional]



