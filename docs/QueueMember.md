

# QueueMember


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | URI for this Queue Member resource, relative to the API base URL. |  [optional]
**callId** | **String** | ID of the Call associated with this Queue Member. |  [optional]
**waitTime** | **Integer** | Number of seconds the Member has been in the queue. |  [optional]
**position** | **Integer** | Member&#39;s current position in the Queue, 1 indexed. |  [optional]
**dateEnqueued** | **String** | Date that the Member was enqueued (GMT), given in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.QueueMember;

String json = "{\"uri\":\"string\",\"callId\":\"string\",\"waitTime\":0,\"position\":0,\"dateEnqueued\":\"string\"}";

// create an instance of QueueMember from a JSON string
QueueMember queueMember = new JSON().getGson().fromJson(json, QueueMember.class);
```


