

# Park

The `Park` command allows a caller to be put on hold.  You can provide hold music,messages,etc until ready to resume the call. Park is a terminal command.  Actions performed on the Call while on hold are provided in a PerCL script in response to the waitUrl property. Actions performed on the Call after it has been unparked (resumed) will be provided in a PerCL script in response to the actionUrl provided. A Call can be resumed in two ways -- REST API invocation or the Unpark percl command. No actions can be nested within Park and Park cannot be nested in any other actions. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**waitUrl** | **String** | Specifies a URL pointing to a PerCL script containing actions to be executed while the caller is Parked. Once the script returned by the waitUrl runs out of commands to execute, FreeClimb will re-request the waitUrl and start over, essentially looping the script requests indefinitely. | 
**actionUrl** | **String** | A request is made to this URL when the Call is resumed, which can occur if the Call is resumed via the Unpark command, the REST API (POST to Call resource), or the caller hangs up. The PerCL script returned in response to the actionUrl will be executed on the resumed call. | 
**notificationUrl** | **String** | URL to be invoked when the Call is parked. The request to the URL contains the standard request parameters. |  [optional]



