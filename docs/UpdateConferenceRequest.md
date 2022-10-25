

# UpdateConferenceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | Description for this conference. Maximum 64 characters. |  [optional]
**playBeep** | [**PlayBeepEnum**](#PlayBeepEnum) | Controls when a beep is played. Valid values: &#x60;always&#x60;, &#x60;never&#x60;, &#x60;entryOnly&#x60;, &#x60;exitOnly&#x60;. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | New status of the conference. Valid values: &#x60;empty&#x60; or &#x60;terminated&#x60;. For more information, see **Status Parameter** below.** |  [optional]



## Enum: PlayBeepEnum

Name | Value
---- | -----
ALWAYS | &quot;always&quot;
NEVER | &quot;never&quot;
ENTRY_ONLY | &quot;entryOnly&quot;
EXIT_ONLY | &quot;exitOnly&quot;



## Enum: StatusEnum

Name | Value
---- | -----
EMPTY | &quot;empty&quot;
TERMINATED | &quot;terminated&quot;



