

# SetListen

The `SetListen` command enables or disables the listen privilege for this Conference Participant. The Participant can hear what the other participants are saying only if this privilege is enabled.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**listen** | **Boolean** | Specifying &#x60;false&#x60; will silence the Conference for this Participant. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.SetListen;

String json = "{\"command\":\"SetListen\",\"listen\":false}";

// create an instance of SetListen from a JSON string
SetListen setListen = new JSON().getGson().fromJson(json, SetListen.class);
```


