

# UpdateCallRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Either &#x60;canceled&#x60; or &#x60;completed&#x60;.  Specifying &#x60;canceled&#x60; attempts to hang up calls that are queued without affecting calls already in progress. Specifying &#x60;completed&#x60; attempts to hang up a call already in progress. | 



## Enum: StatusEnum

Name | Value
---- | -----
CANCELED | &quot;canceled&quot;
COMPLETED | &quot;completed&quot;



