

# Enqueue

The `Enqueue` command adds the current Call to a call Queue. If the specified Queue does not exist, it is created and then the Call is added to it. The default maximum length of the queue is 100. This can be modified using the REST API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionUrl** | **URI** | A request is made to this URL when the Call leaves the Queue, which can occur if enqueue of the Call fails or when the call is dequeued via the &#x60;Dequeue&#x60; command, the REST API (POST to Queue Member resource), or the caller hangs up. | 
**notificationUrl** | **URI** | URL to be invoked when the call enters the queue. The request to the URL contains the standard request parameters.This is a notification only; any PerCL returned will be ignored. |  [optional]
**queueId** | **String** | ID of the Queue to which to add the Call. If the Queue does not exist, it will be created. The ID must start with QU followed by 40 hex characters. | 
**waitUrl** | **URI** | A request is made to this URL when the Call leaves the Queue, which can occur if enqueue of the Call fails or when the call is dequeued via the &#x60;Dequeue&#x60; command, the REST API (POST to Queue Member resource), or the caller hangs up. | 



