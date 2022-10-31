

# Unpark

The `Unpark` command resumes a parked call.  Execution continues with the first command in the PerCL scripted returned by the actionUrl specified in the Park command as long as the call is still in progress.  If the call is no longer in progress, any returned PerCL will not be executed. Unpark is a terminal command -- any commands following it in the same script are not executed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------



