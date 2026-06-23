

# SetDTMFPassThrough

The `SetDTMFPassThrough` command enables or disables the dtmfPassThrough privilege for this Conference Participant. If 'true', DTMFs will be passed through from this Participant to all other Participants in the Conference

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dtmfPassThrough** | **Boolean** | Specifying &#x60;false&#x60; mutes the Participant&#39;s dtmf audio. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.SetDTMFPassThrough;

String json = "{\"command\":\"SetDTMFPassThrough\",\"dtmfPassThrough\":false}";

// create an instance of SetDTMFPassThrough from a JSON string
SetDTMFPassThrough setDTMFPassThrough = new JSON().getGson().fromJson(json, SetDTMFPassThrough.class);
```


