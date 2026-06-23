

# Unpark

The `Unpark` command resumes a parked call.  Execution continues with the first command in the PerCL scripted returned by the actionUrl specified in the Park command as long as the call is still in progress.  If the call is no longer in progress, any returned PerCL will not be executed. Unpark is a terminal command -- any commands following it in the same script are not executed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.Unpark;

String json = "{\"command\":\"Unpark\"}";

// create an instance of Unpark from a JSON string
Unpark unpark = new JSON().getGson().fromJson(json, Unpark.class);
```


