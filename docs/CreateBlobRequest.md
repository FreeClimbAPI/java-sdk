

# CreateBlobRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | Custom identifier for this blob that is unique for the owning account. It will be set to the blobId by default if not provided. |  [optional]
**expiresAt** | **String** | An RFC3339 timestamp with millisecond resolution. This timestamp defines the time at which this blob will delete itself. It must not be more than 48 hours in the future and will default to 9 hours in the future if not provided. |  [optional]
**blob** | **Object** |  | 



