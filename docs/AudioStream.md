

# AudioStream

The `AudioStream` command transfers control of the call to a gRPC session.  Upon completion of the gRPC session, if the actionUrl is specified, control can be returned to percl usage or the call will simply be hung up if the actionUrl is not specified.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **URI** | The gRPC server location that will receive the grpc stream as a uri and must be port 80 or 443. | 
**actionUrl** | **URI** | A request is made to this URL when the gRPC session is concluded. The PerCL script returned in response to the actionUrl will be executed on the call. |  [optional]
**contentType** | **String** | The type and sample rate of the audio being received over the channel must match the environmental sample rate. |  [optional]
**metaData** | **List&lt;String&gt;** | An arbitrary array of strings passed through FC to the GRPC server can be used to pass state or other information about the call. |  [optional]
**privacyMode** | **Boolean** | Enables audio redaction with full call recording while gRPC session is running and blocks logging of any DTMFs received by FreeClimb. |  [optional]



