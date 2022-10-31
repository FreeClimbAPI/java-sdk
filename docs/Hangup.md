

# Hangup

The `Hangup` command terminates a Call. If `Hangup` is used as the first action in a PerCL response, it does not prevent FreeClimb from answering the Call and billing your account. See the `Reject` command to hang up at no charge.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | The user defined reason for the hangup. In general, applications should use a set of enumerated values that are predefined to cover all exit points of the Call flows for the given application. |  [optional]



