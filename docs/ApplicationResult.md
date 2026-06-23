

# ApplicationResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uri** | **String** | The URI for this resource, relative to /apiserver. |  [optional]
**dateCreated** | **String** | The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**dateUpdated** | **String** | The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009 20:45:30 GMT). |  [optional]
**revision** | **Integer** | Revision count for the resource. This count is set to 1 on creation and is incremented every time it is updated. |  [optional]
**accountId** | **String** | ID of the account that owns this phone number. |  [optional]
**applicationId** | **String** | ID of the Application that FreeClimb should contact if a Call or SMS arrives for this phone number or a Call from this number is placed. An incoming phone number is not useful until associated with an applicationId. |  [optional]
**alias** | **String** | Description for this phone number. Typically the conventionally-formatted version of the phone number. |  [optional]
**voiceUrl** | **URI** | The URL FreeClimb will request when a phone number assigned to this Application receives a Call. Used for inbound calls only. |  [optional]
**voiceFallbackUrl** | **URI** | The URL that FreeClimb will request if it times out waiting for a response from the voiceUrl. Used for inbound calls only. |  [optional]
**callConnectUrl** | **URI** | The URL to which FreeClimb will make a POST request informing the result of the outbound Call request. The status property of the request message specifies if the Call was connected or not. |  [optional]
**statusCallbackUrl** | **URI** | A URL to which FreeClimb will make a POST request when the Call ends to notify this app. |  [optional]
**smsUrl** | **URI** | The URL FreeClimb will request when a phone number assigned to this Application receives an incoming SMS message. Used for inbound SMS only. |  [optional]
**smsFallbackUrl** | **URI** | The URL that FreeClimb will request if it times out waiting for a response from the smsUrl. Used for inbound SMS only. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.ApplicationResult;

String json = "{\"uri\":\"string\",\"dateCreated\":\"string\",\"dateUpdated\":\"string\",\"revision\":0,\"accountId\":\"string\",\"applicationId\":\"string\",\"alias\":\"string\",\"voiceUrl\":\"https://www.example.com\",\"voiceFallbackUrl\":\"https://www.example.com\",\"callConnectUrl\":\"https://www.example.com\",\"statusCallbackUrl\":\"https://www.example.com\",\"smsUrl\":\"https://www.example.com\",\"smsFallbackUrl\":\"https://www.example.com\"}";

// create an instance of ApplicationResult from a JSON string
ApplicationResult applicationResult = new JSON().getGson().fromJson(json, ApplicationResult.class);
```


