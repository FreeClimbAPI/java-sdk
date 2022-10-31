

# AccountResultAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | String that uniquely identifies this account resource. |  [optional]
**apiKey** | **String** | The API key assigned to this account. This key must be kept a secret by the customer. |  [optional]
**alias** | **String** | A description for this account. |  [optional]
**label** | **String** | A string that identifies a category or group to which the account belongs. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of this account. It is one of: trial or full. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of this account. It is one of: active, suspended, or closed. |  [optional]
**subresourceUris** | **Object** | The list of subresources for this account. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TRIAL | &quot;trial&quot;
FULL | &quot;full&quot;



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
SUSPENDED | &quot;suspended&quot;
CLOSED | &quot;closed&quot;



