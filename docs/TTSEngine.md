

# TTSEngine


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **TTSEngineName** |  |  [optional]
**parameters** | **Map&lt;String, Object&gt;** | Parameters for the TTS engine. The parameters are specific to the engine and are documented in the engine&#39;s documentation. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.TTSEngine;

String json = "{\"name\":\"freeclimb.standard\"}";

// create an instance of TTSEngine from a JSON string
TTSEngine ttSEngine = new JSON().getGson().fromJson(json, TTSEngine.class);
```


