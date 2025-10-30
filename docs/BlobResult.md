

# BlobResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blobId** | **String** | Identifier which can be used to reference this blob in future interations. |  [optional]
**accountId** | **String** |  |  [optional]
**alias** | **String** | Custom identifier for this blob that is unique for the owning account. It will be set to the blobId by default if not provided in the creation request. |  [optional]
**revision** | **Integer** |  |  [optional]
**dateCreated** | **OffsetDateTime** | An RFC3339 timestamp with millisecond resolution. It represents the time this blob was created. |  [optional]
**dateUpdated** | **OffsetDateTime** | An RFC3339 timestamp with millisecond resolution. It represents the time this blob was last modified, which at creation will always equal dateCreated. |  [optional]
**expiresAt** | **OffsetDateTime** | An RFC3339 timestamp with millisecond resolution. It represents the time at which this blob will expire and self delete. |  [optional]
**blob** | **Object** | Blob content |  [optional]



