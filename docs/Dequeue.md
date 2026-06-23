

# Dequeue

The `Dequeue` command transfers control of a Call that is in a Queue so that the waiting caller exits the Queue. Execution continues with the first command in the PerCL script returned by the `actionUrl` specified in the `Enqueue` command.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.Dequeue;

String json = "{\"command\":\"Dequeue\"}";

// create an instance of Dequeue from a JSON string
Dequeue dequeue = new JSON().getGson().fromJson(json, Dequeue.class);
```


