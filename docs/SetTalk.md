

# SetTalk

The `SetTalk` command enables or disables the talk privilege for this Conference Participant. If 'true', no audio from that Participant is shared with the other Participants of the Conference.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**talk** | **Boolean** | Specifying &#x60;false&#x60; mutes the Participant. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.SetTalk;

String json = "{\"command\":\"SetTalk\",\"talk\":false}";

// create an instance of SetTalk from a JSON string
SetTalk setTalk = new JSON().getGson().fromJson(json, SetTalk.class);
```


