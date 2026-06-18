

# AccountRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | Description for this account. |  [optional]
**label** | **String** | Group to which this account belongs. |  [optional]


## Example

```java
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.models.AccountRequest;

String json = "{\"alias\":\"My Account\",\"label\":\"My Label\"}";

// create an instance of AccountRequest from a JSON string
AccountRequest accountRequest = new JSON().getGson().fromJson(json, AccountRequest.class);
```


