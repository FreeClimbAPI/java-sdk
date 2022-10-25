

# QueueResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | The URI for this resource, relative to /apiserver. |  [optional]
**dateCreated** | **String** | The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**dateUpdated** | **String** | The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**revision** | **Integer** | Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated. |  [optional]
**accountId** | **String** | ID of the account that created this Queue. |  [optional]
**queueId** | **String** | A string that uniquely identifies this Queue resource. |  [optional]
**alias** | **String** | A description for this Queue. |  [optional]
**maxSize** | **Integer** | The maximum number of Calls permitted in the Queue. Default is 100. Maximum is 1000. |  [optional]
**currentSize** | **String** | Count of Calls currently in the Queue. |  [optional]
**averageWaitTime** | **String** | Average wait time (in seconds) of all Calls in the Queue. |  [optional]
**subresourceUris** | **Object** | List of subresources for this Queue (which includes Queue members). |  [optional]



