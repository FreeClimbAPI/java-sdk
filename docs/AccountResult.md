

# AccountResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | The URI for this resource, relative to /apiserver. |  [optional]
**dateCreated** | **String** | The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**dateUpdated** | **String** | The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**revision** | **Integer** | Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated. |  [optional]
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



