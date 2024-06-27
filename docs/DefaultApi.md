# DefaultApi

All URIs are relative to *https://www.freeclimb.com/apiserver*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buyAPhoneNumber**](DefaultApi.md#buyAPhoneNumber) | **POST** /Accounts/{accountId}/IncomingPhoneNumbers | Buy a Phone Number
[**createAConference**](DefaultApi.md#createAConference) | **POST** /Accounts/{accountId}/Conferences | Create a Conference
[**createAQueue**](DefaultApi.md#createAQueue) | **POST** /Accounts/{accountId}/Queues | Create a Queue
[**createAnApplication**](DefaultApi.md#createAnApplication) | **POST** /Accounts/{accountId}/Applications | Create an application
[**deleteARecording**](DefaultApi.md#deleteARecording) | **DELETE** /Accounts/{accountId}/Recordings/{recordingId} | Delete a Recording
[**deleteAnApplication**](DefaultApi.md#deleteAnApplication) | **DELETE** /Accounts/{accountId}/Applications/{applicationId} | Delete an application
[**deleteAnIncomingNumber**](DefaultApi.md#deleteAnIncomingNumber) | **DELETE** /Accounts/{accountId}/IncomingPhoneNumbers/{phoneNumberId} | Delete an Incoming Number
[**dequeueAMember**](DefaultApi.md#dequeueAMember) | **POST** /Accounts/{accountId}/Queues/{queueId}/Members/{callId} | Dequeue a Member
[**dequeueHeadMember**](DefaultApi.md#dequeueHeadMember) | **POST** /Accounts/{accountId}/Queues/{queueId}/Members/Front | Dequeue Head Member
[**downloadARecordingFile**](DefaultApi.md#downloadARecordingFile) | **GET** /Accounts/{accountId}/Recordings/{recordingId}/Download | Download a Recording File
[**filterLogs**](DefaultApi.md#filterLogs) | **POST** /Accounts/{accountId}/Logs | Filter Logs
[**getACall**](DefaultApi.md#getACall) | **GET** /Accounts/{accountId}/Calls/{callId} | Get a Call
[**getAConference**](DefaultApi.md#getAConference) | **GET** /Accounts/{accountId}/Conferences/{conferenceId} | Get a Conference
[**getAMember**](DefaultApi.md#getAMember) | **GET** /Accounts/{accountId}/Queues/{queueId}/Members/{callId} | Get a Member
[**getAParticipant**](DefaultApi.md#getAParticipant) | **GET** /Accounts/{accountId}/Conferences/{conferenceId}/Participants/{callId} | Get a Participant
[**getAQueue**](DefaultApi.md#getAQueue) | **GET** /Accounts/{accountId}/Queues/{queueId} | Get a Queue
[**getARecording**](DefaultApi.md#getARecording) | **GET** /Accounts/{accountId}/Recordings/{recordingId} | Get a Recording
[**getAnAccount**](DefaultApi.md#getAnAccount) | **GET** /Accounts/{accountId} | Get an Account
[**getAnApplication**](DefaultApi.md#getAnApplication) | **GET** /Accounts/{accountId}/Applications/{applicationId} | Get an Application
[**getAnIncomingNumber**](DefaultApi.md#getAnIncomingNumber) | **GET** /Accounts/{accountId}/IncomingPhoneNumbers/{phoneNumberId} | Get an Incoming Number
[**getAnSmsMessage**](DefaultApi.md#getAnSmsMessage) | **GET** /Accounts/{accountId}/Messages/{messageId} | Get an SMS Message
[**getHeadMember**](DefaultApi.md#getHeadMember) | **GET** /Accounts/{accountId}/Queues/{queueId}/Members/Front | Get Head Member
[**getTenDLCSmsBrand**](DefaultApi.md#getTenDLCSmsBrand) | **GET** /Accounts/{accountId}/Messages/10DLC/Brands/{brandId} | Get a 10DLC SMS Brand
[**getTenDLCSmsBrands**](DefaultApi.md#getTenDLCSmsBrands) | **GET** /Accounts/{accountId}/Messages/10DLC/Brands | Get list of SMS 10DLC Brands
[**getTenDLCSmsCampaign**](DefaultApi.md#getTenDLCSmsCampaign) | **GET** /Accounts/{accountId}/Messages/10DLC/Campaigns/{campaignId} | Get a 10DLC SMS Campaign
[**getTenDLCSmsCampaigns**](DefaultApi.md#getTenDLCSmsCampaigns) | **GET** /Accounts/{accountId}/Messages/10DLC/Campaigns | Get list of SMS 10DLC Campaigns
[**getTenDLCSmsPartnerCampaign**](DefaultApi.md#getTenDLCSmsPartnerCampaign) | **GET** /Accounts/{accountId}/Messages/10DLC/PartnerCampaigns/{campaignId} | Get a 10DLC SMS Partner Campaign
[**getTenDLCSmsPartnerCampaigns**](DefaultApi.md#getTenDLCSmsPartnerCampaigns) | **GET** /Accounts/{accountId}/Messages/10DLC/PartnerCampaigns | Get list of SMS 10DLC Partner Campaigns
[**getTollFreeSmsCampaign**](DefaultApi.md#getTollFreeSmsCampaign) | **GET** /Accounts/{accountId}/Messages/TollFree/Campaigns/{campaignId} | Get a TollFree SMS Campaign
[**getTollFreeSmsCampaigns**](DefaultApi.md#getTollFreeSmsCampaigns) | **GET** /Accounts/{accountId}/Messages/TollFree/Campaigns | Get list of TollFree Campaigns
[**listActiveQueues**](DefaultApi.md#listActiveQueues) | **GET** /Accounts/{accountId}/Queues | List Active Queues
[**listAllAccountLogs**](DefaultApi.md#listAllAccountLogs) | **GET** /Accounts/{accountId}/Logs | List All Account Logs
[**listApplications**](DefaultApi.md#listApplications) | **GET** /Accounts/{accountId}/Applications | List applications
[**listAvailableNumbers**](DefaultApi.md#listAvailableNumbers) | **GET** /AvailablePhoneNumbers | List available numbers
[**listCallLogs**](DefaultApi.md#listCallLogs) | **GET** /Accounts/{accountId}/Calls/{callId}/Logs | List Call Logs
[**listCallRecordings**](DefaultApi.md#listCallRecordings) | **GET** /Accounts/{accountId}/Calls/{callId}/Recordings | List Call Recordings
[**listCalls**](DefaultApi.md#listCalls) | **GET** /Accounts/{accountId}/Calls | List Calls
[**listConferenceRecordings**](DefaultApi.md#listConferenceRecordings) | **GET** /Accounts/{accountId}/Conferences/{conferenceId}/Recordings | List Conference Recordings
[**listConferences**](DefaultApi.md#listConferences) | **GET** /Accounts/{accountId}/Conferences | List Conferences
[**listIncomingNumbers**](DefaultApi.md#listIncomingNumbers) | **GET** /Accounts/{accountId}/IncomingPhoneNumbers | List Incoming Numbers
[**listMembers**](DefaultApi.md#listMembers) | **GET** /Accounts/{accountId}/Queues/{queueId}/Members | List Members
[**listParticipants**](DefaultApi.md#listParticipants) | **GET** /Accounts/{accountId}/Conferences/{conferenceId}/Participants | List Participants
[**listRecordings**](DefaultApi.md#listRecordings) | **GET** /Accounts/{accountId}/Recordings | List Recordings
[**listSmsMessages**](DefaultApi.md#listSmsMessages) | **GET** /Accounts/{accountId}/Messages | List SMS Messages
[**makeACall**](DefaultApi.md#makeACall) | **POST** /Accounts/{accountId}/Calls | Make a Call
[**makeAWebrtcJwt**](DefaultApi.md#makeAWebrtcJwt) | **POST** /Accounts/{accountId}/Calls/WebRTC/Token | Make a JWT for WebRTC calling
[**removeAParticipant**](DefaultApi.md#removeAParticipant) | **DELETE** /Accounts/{accountId}/Conferences/{conferenceId}/Participants/{callId} | Remove a Participant
[**sendAnSmsMessage**](DefaultApi.md#sendAnSmsMessage) | **POST** /Accounts/{accountId}/Messages | Send an SMS Message
[**streamARecordingFile**](DefaultApi.md#streamARecordingFile) | **GET** /Accounts/{accountId}/Recordings/{recordingId}/Stream | Stream a Recording File
[**updateAConference**](DefaultApi.md#updateAConference) | **POST** /Accounts/{accountId}/Conferences/{conferenceId} | Update a Conference
[**updateALiveCall**](DefaultApi.md#updateALiveCall) | **POST** /Accounts/{accountId}/Calls/{callId} | Update a Live Call
[**updateAParticipant**](DefaultApi.md#updateAParticipant) | **POST** /Accounts/{accountId}/Conferences/{conferenceId}/Participants/{callId} | Update a Participant
[**updateAQueue**](DefaultApi.md#updateAQueue) | **POST** /Accounts/{accountId}/Queues/{queueId} | Update a Queue
[**updateAnAccount**](DefaultApi.md#updateAnAccount) | **POST** /Accounts/{accountId} | Manage an account
[**updateAnApplication**](DefaultApi.md#updateAnApplication) | **POST** /Accounts/{accountId}/Applications/{applicationId} | Update an application
[**updateAnIncomingNumber**](DefaultApi.md#updateAnIncomingNumber) | **POST** /Accounts/{accountId}/IncomingPhoneNumbers/{phoneNumberId} | Update an Incoming Number


<a name="buyAPhoneNumber"></a>
# **buyAPhoneNumber**
> IncomingNumberResult buyAPhoneNumber(buyIncomingNumberRequest)

Buy a Phone Number

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    BuyIncomingNumberRequest buyIncomingNumberRequest = new BuyIncomingNumberRequest(); // BuyIncomingNumberRequest | Incoming Number transaction details
    
    try {
      IncomingNumberResult result = apiInstance.buyAPhoneNumber(buyIncomingNumberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#buyAPhoneNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyIncomingNumberRequest** | [**BuyIncomingNumberRequest**](BuyIncomingNumberRequest.md)| Incoming Number transaction details |


### Return type

[**IncomingNumberResult**](IncomingNumberResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Incoming Number transaction |  -  |

<a name="createAConference"></a>
# **createAConference**
> ConferenceResult createAConference(createConferenceRequest)

Create a Conference

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    CreateConferenceRequest createConferenceRequest = new CreateConferenceRequest(); // CreateConferenceRequest | Conference to create
    
    try {
      ConferenceResult result = apiInstance.createAConference(createConferenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createAConference");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createConferenceRequest** | [**CreateConferenceRequest**](CreateConferenceRequest.md)| Conference to create | [optional]


### Return type

[**ConferenceResult**](ConferenceResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Details of created conference |  -  |

<a name="createAQueue"></a>
# **createAQueue**
> QueueResult createAQueue(queueRequest)

Create a Queue

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    QueueRequest queueRequest = new QueueRequest(); // QueueRequest | Queue details used to create a queue
    
    try {
      QueueResult result = apiInstance.createAQueue(queueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createAQueue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueRequest** | [**QueueRequest**](QueueRequest.md)| Queue details used to create a queue | [optional]


### Return type

[**QueueResult**](QueueResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfuly created queue |  -  |

<a name="createAnApplication"></a>
# **createAnApplication**
> ApplicationResult createAnApplication(applicationRequest)

Create an application

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    ApplicationRequest applicationRequest = new ApplicationRequest(); // ApplicationRequest | Application Details
    
    try {
      ApplicationResult result = apiInstance.createAnApplication(applicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createAnApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationRequest** | [**ApplicationRequest**](ApplicationRequest.md)| Application Details | [optional]


### Return type

[**ApplicationResult**](ApplicationResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Application successfuly created |  -  |

<a name="deleteARecording"></a>
# **deleteARecording**
> deleteARecording(recordingId)

Delete a Recording

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String recordingId = "recordingId_example"; // String | String that uniquely identifies this recording resource.
    
    try {
      apiInstance.deleteARecording(recordingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteARecording");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingId** | **String**| String that uniquely identifies this recording resource. |


### Return type

null (empty response body)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Recording Deleted |  -  |

<a name="deleteAnApplication"></a>
# **deleteAnApplication**
> deleteAnApplication(applicationId)

Delete an application

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String applicationId = "applicationId_example"; // String | String that uniquely identifies this application resource.
    
    try {
      apiInstance.deleteAnApplication(applicationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteAnApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| String that uniquely identifies this application resource. |


### Return type

null (empty response body)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful application deletion |  -  |

<a name="deleteAnIncomingNumber"></a>
# **deleteAnIncomingNumber**
> deleteAnIncomingNumber(phoneNumberId)

Delete an Incoming Number

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String phoneNumberId = "phoneNumberId_example"; // String | String that uniquely identifies this phone number resource.
    
    try {
      apiInstance.deleteAnIncomingNumber(phoneNumberId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteAnIncomingNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumberId** | **String**| String that uniquely identifies this phone number resource. |


### Return type

null (empty response body)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful Incoming Number deletion. |  -  |

<a name="dequeueAMember"></a>
# **dequeueAMember**
> QueueMember dequeueAMember(queueId, callId)

Dequeue a Member

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String queueId = "queueId_example"; // String | String that uniquely identifies the Queue that the Member belongs to.
    
    String callId = "callId_example"; // String | ID if the Call that the Member belongs to
    
    try {
      QueueMember result = apiInstance.dequeueAMember(queueId, callId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#dequeueAMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| String that uniquely identifies the Queue that the Member belongs to. |
 **callId** | **String**| ID if the Call that the Member belongs to |


### Return type

[**QueueMember**](QueueMember.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted dequeue request |  -  |

<a name="dequeueHeadMember"></a>
# **dequeueHeadMember**
> QueueMember dequeueHeadMember(queueId)

Dequeue Head Member

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String queueId = "queueId_example"; // String | String that uniquely identifies this queue resource.
    
    try {
      QueueMember result = apiInstance.dequeueHeadMember(queueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#dequeueHeadMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| String that uniquely identifies this queue resource. |


### Return type

[**QueueMember**](QueueMember.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted dequeue request |  -  |

<a name="downloadARecordingFile"></a>
# **downloadARecordingFile**
> File downloadARecordingFile(recordingId)

Download a Recording File

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String recordingId = "recordingId_example"; // String | String that uniquely identifies this recording resource.
    
    try {
      File result = apiInstance.downloadARecordingFile(recordingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#downloadARecordingFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingId** | **String**| String that uniquely identifies this recording resource. |


### Return type

[**File**](File.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: audio/x-wav

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download a Recording file represented with audio/x-wav mime-type |  -  |

<a name="filterLogs"></a>
# **filterLogs**
> LogList filterLogs(filterLogsRequest)

Filter Logs

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    FilterLogsRequest filterLogsRequest = new FilterLogsRequest(); // FilterLogsRequest | Filter logs request paramters
    
    try {
      LogList result = apiInstance.filterLogs(filterLogsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#filterLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterLogsRequest** | [**FilterLogsRequest**](FilterLogsRequest.md)| Filter logs request paramters |


### Return type

[**LogList**](LogList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved log list |  -  |

<a name="getACall"></a>
# **getACall**
> CallResult getACall(callId)

Get a Call

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String callId = "callId_example"; // String | String that uniquely identifies this call resource.
    
    try {
      CallResult result = apiInstance.getACall(callId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getACall");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| String that uniquely identifies this call resource. |


### Return type

[**CallResult**](CallResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Call Resource |  -  |

<a name="getAConference"></a>
# **getAConference**
> ConferenceResult getAConference(conferenceId)

Get a Conference

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String conferenceId = "conferenceId_example"; // String | A string that uniquely identifies this conference resource.
    
    try {
      ConferenceResult result = apiInstance.getAConference(conferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAConference");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceId** | **String**| A string that uniquely identifies this conference resource. |


### Return type

[**ConferenceResult**](ConferenceResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved conference |  -  |

<a name="getAMember"></a>
# **getAMember**
> QueueMember getAMember(queueId, callId)

Get a Member

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String queueId = "queueId_example"; // String | String that uniquely identifies the Queue that the Member belongs to.
    
    String callId = "callId_example"; // String | ID of the Call that the Member belongs to
    
    try {
      QueueMember result = apiInstance.getAMember(queueId, callId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| String that uniquely identifies the Queue that the Member belongs to. |
 **callId** | **String**| ID of the Call that the Member belongs to |


### Return type

[**QueueMember**](QueueMember.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved a queue member |  -  |

<a name="getAParticipant"></a>
# **getAParticipant**
> ConferenceParticipantResult getAParticipant(conferenceId, callId)

Get a Participant

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String conferenceId = "conferenceId_example"; // String | ID of the conference this participant is in.
    
    String callId = "callId_example"; // String | ID of the Call associated with this participant.
    
    try {
      ConferenceParticipantResult result = apiInstance.getAParticipant(conferenceId, callId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAParticipant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceId** | **String**| ID of the conference this participant is in. |
 **callId** | **String**| ID of the Call associated with this participant. |


### Return type

[**ConferenceParticipantResult**](ConferenceParticipantResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved conference participant |  -  |

<a name="getAQueue"></a>
# **getAQueue**
> QueueResult getAQueue(queueId)

Get a Queue

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String queueId = "queueId_example"; // String | A string that uniquely identifies this queue resource.
    
    try {
      QueueResult result = apiInstance.getAQueue(queueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAQueue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| A string that uniquely identifies this queue resource. |


### Return type

[**QueueResult**](QueueResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved queue |  -  |

<a name="getARecording"></a>
# **getARecording**
> RecordingResult getARecording(recordingId)

Get a Recording

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String recordingId = "recordingId_example"; // String | String that uniquely identifies this recording resource.
    
    try {
      RecordingResult result = apiInstance.getARecording(recordingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getARecording");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingId** | **String**| String that uniquely identifies this recording resource. |


### Return type

[**RecordingResult**](RecordingResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="getAnAccount"></a>
# **getAnAccount**
> AccountResult getAnAccount()

Get an Account

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    try {
      AccountResult result = apiInstance.getAnAccount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAnAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters



### Return type

[**AccountResult**](AccountResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Account Details |  -  |

<a name="getAnApplication"></a>
# **getAnApplication**
> ApplicationResult getAnApplication(applicationId)

Get an Application

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String applicationId = "applicationId_example"; // String | A string that uniquely identifies this application resource.
    
    try {
      ApplicationResult result = apiInstance.getAnApplication(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAnApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| A string that uniquely identifies this application resource. |


### Return type

[**ApplicationResult**](ApplicationResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Application Details |  -  |

<a name="getAnIncomingNumber"></a>
# **getAnIncomingNumber**
> IncomingNumberResult getAnIncomingNumber(phoneNumberId)

Get an Incoming Number

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String phoneNumberId = "phoneNumberId_example"; // String | String that uniquely identifies this phone number resource.
    
    try {
      IncomingNumberResult result = apiInstance.getAnIncomingNumber(phoneNumberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAnIncomingNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumberId** | **String**| String that uniquely identifies this phone number resource. |


### Return type

[**IncomingNumberResult**](IncomingNumberResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Incoming Phone Number result. |  -  |

<a name="getAnSmsMessage"></a>
# **getAnSmsMessage**
> MessageResult getAnSmsMessage(messageId)

Get an SMS Message

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String messageId = "messageId_example"; // String | String that uniquely identifies this Message resource.
    
    try {
      MessageResult result = apiInstance.getAnSmsMessage(messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAnSmsMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| String that uniquely identifies this Message resource. |


### Return type

[**MessageResult**](MessageResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The specific SMS message that’s been processed by FreeClimb |  -  |

<a name="getHeadMember"></a>
# **getHeadMember**
> QueueMember getHeadMember(queueId)

Get Head Member

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String queueId = "queueId_example"; // String | String that uniquely identifies the Queue that the Member belongs to.
    
    try {
      QueueMember result = apiInstance.getHeadMember(queueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getHeadMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| String that uniquely identifies the Queue that the Member belongs to. |


### Return type

[**QueueMember**](QueueMember.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved queue member |  -  |

<a name="getTenDLCSmsBrand"></a>
# **getTenDLCSmsBrand**
> SMSTenDLCBrand getTenDLCSmsBrand(brandId)

Get a 10DLC SMS Brand

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String brandId = "brandId_example"; // String | String that uniquely identifies this brand resource.
    
    try {
      SMSTenDLCBrand result = apiInstance.getTenDLCSmsBrand(brandId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTenDLCSmsBrand");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **String**| String that uniquely identifies this brand resource. |


### Return type

[**SMSTenDLCBrand**](SMSTenDLCBrand.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The specific SMS 10DLC Brand that’s been processed by FreeClimb |  -  |

<a name="getTenDLCSmsBrands"></a>
# **getTenDLCSmsBrands**
> SMSTenDLCBrandsListResult getTenDLCSmsBrands()

Get list of SMS 10DLC Brands

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    try {
      SMSTenDLCBrandsListResult result = apiInstance.getTenDLCSmsBrands();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTenDLCSmsBrands");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters



### Return type

[**SMSTenDLCBrandsListResult**](SMSTenDLCBrandsListResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list SMS 10DLC brands |  -  |

<a name="getTenDLCSmsCampaign"></a>
# **getTenDLCSmsCampaign**
> SMSTenDLCCampaign getTenDLCSmsCampaign(campaignId)

Get a 10DLC SMS Campaign

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String campaignId = "campaignId_example"; // String | String that uniquely identifies this campaign resource.
    
    try {
      SMSTenDLCCampaign result = apiInstance.getTenDLCSmsCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTenDLCSmsCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| String that uniquely identifies this campaign resource. |


### Return type

[**SMSTenDLCCampaign**](SMSTenDLCCampaign.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The specific SMS 10DLC Campaign that’s been processed by FreeClimb |  -  |

<a name="getTenDLCSmsCampaigns"></a>
# **getTenDLCSmsCampaigns**
> SMSTenDLCCampaignsListResult getTenDLCSmsCampaigns(brandId)

Get list of SMS 10DLC Campaigns

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String brandId = "brandId_example"; // String | The unique identifier for a brand
    
    try {
      SMSTenDLCCampaignsListResult result = apiInstance.getTenDLCSmsCampaigns(brandId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTenDLCSmsCampaigns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **String**| The unique identifier for a brand | [optional]


### Return type

[**SMSTenDLCCampaignsListResult**](SMSTenDLCCampaignsListResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list SMS 10DLC campaigns |  -  |

<a name="getTenDLCSmsPartnerCampaign"></a>
# **getTenDLCSmsPartnerCampaign**
> SMSTenDLCPartnerCampaign getTenDLCSmsPartnerCampaign(campaignId)

Get a 10DLC SMS Partner Campaign

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String campaignId = "campaignId_example"; // String | String that uniquely identifies this campaign resource.
    
    try {
      SMSTenDLCPartnerCampaign result = apiInstance.getTenDLCSmsPartnerCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTenDLCSmsPartnerCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| String that uniquely identifies this campaign resource. |


### Return type

[**SMSTenDLCPartnerCampaign**](SMSTenDLCPartnerCampaign.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The specific SMS 10DLC Partner Campaign that’s been processed by FreeClimb |  -  |

<a name="getTenDLCSmsPartnerCampaigns"></a>
# **getTenDLCSmsPartnerCampaigns**
> SMSTenDLCPartnerCampaignsListResult getTenDLCSmsPartnerCampaigns(brandId)

Get list of SMS 10DLC Partner Campaigns

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String brandId = "brandId_example"; // String | The unique identifier for a brand
    
    try {
      SMSTenDLCPartnerCampaignsListResult result = apiInstance.getTenDLCSmsPartnerCampaigns(brandId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTenDLCSmsPartnerCampaigns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandId** | **String**| The unique identifier for a brand | [optional]


### Return type

[**SMSTenDLCPartnerCampaignsListResult**](SMSTenDLCPartnerCampaignsListResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list SMS 10DLC partner campaigns |  -  |

<a name="getTollFreeSmsCampaign"></a>
# **getTollFreeSmsCampaign**
> SMSTollFreeCampaign getTollFreeSmsCampaign(campaignId)

Get a TollFree SMS Campaign

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String campaignId = "campaignId_example"; // String | String that uniquely identifies this TollFree Campaign resource.
    
    try {
      SMSTollFreeCampaign result = apiInstance.getTollFreeSmsCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTollFreeSmsCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| String that uniquely identifies this TollFree Campaign resource. |


### Return type

[**SMSTollFreeCampaign**](SMSTollFreeCampaign.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The specific SMS TollFree Campaign that’s been processed by FreeClimb |  -  |

<a name="getTollFreeSmsCampaigns"></a>
# **getTollFreeSmsCampaigns**
> SMSTollFreeCampaignsListResult getTollFreeSmsCampaigns()

Get list of TollFree Campaigns

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    try {
      SMSTollFreeCampaignsListResult result = apiInstance.getTollFreeSmsCampaigns();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTollFreeSmsCampaigns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters



### Return type

[**SMSTollFreeCampaignsListResult**](SMSTollFreeCampaignsListResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list toll-free campaigns |  -  |

<a name="listActiveQueues"></a>
# **listActiveQueues**
> QueueList listActiveQueues(alias)

List Active Queues

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String alias = "alias_example"; // String | Return only the Queue resources with aliases that exactly match this name.
    
    try {
      QueueList result = apiInstance.listActiveQueues(alias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listActiveQueues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**| Return only the Queue resources with aliases that exactly match this name. | [optional]


### Return type

[**QueueList**](QueueList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfuly retrieved queue list |  -  |

<a name="listAllAccountLogs"></a>
# **listAllAccountLogs**
> LogList listAllAccountLogs()

List All Account Logs

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    try {
      LogList result = apiInstance.listAllAccountLogs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listAllAccountLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters



### Return type

[**LogList**](LogList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved log list |  -  |

<a name="listApplications"></a>
# **listApplications**
> ApplicationList listApplications(alias)

List applications

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String alias = "alias_example"; // String | Return only applications with aliases that exactly match this value.
    
    try {
      ApplicationList result = apiInstance.listApplications(alias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listApplications");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**| Return only applications with aliases that exactly match this value. | [optional]


### Return type

[**ApplicationList**](ApplicationList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Applications |  -  |

<a name="listAvailableNumbers"></a>
# **listAvailableNumbers**
> AvailableNumberList listAvailableNumbers(phoneNumber, region, country, voiceEnabled, smsEnabled, capabilitiesVoice, capabilitiesSms, capabilitiesTollFree, capabilitiesTenDLC, capabilitiesShortCode)

List available numbers

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String phoneNumber = "phoneNumber_example"; // String | PCRE-compatible regular expression to filter against `phoneNumber` field, which is in E.164 format.
    
    String region = "region_example"; // String | State or province of this phone number.
    
    String country = "country_example"; // String | Country of this phone number.
    
    Boolean voiceEnabled = true; // Boolean | Indicates whether the phone number can handle Calls. Typically set to true for all numbers.
    
    Boolean smsEnabled = true; // Boolean | Indication of whether the phone number can handle sending and receiving SMS messages. Typically set to true for all numbers.
    
    Boolean capabilitiesVoice = true; // Boolean | 
    
    Boolean capabilitiesSms = true; // Boolean | 
    
    Boolean capabilitiesTollFree = true; // Boolean | 
    
    Boolean capabilitiesTenDLC = true; // Boolean | 
    
    Boolean capabilitiesShortCode = true; // Boolean | 
    
    try {
      AvailableNumberList result = apiInstance.listAvailableNumbers(phoneNumber, region, country, voiceEnabled, smsEnabled, capabilitiesVoice, capabilitiesSms, capabilitiesTollFree, capabilitiesTenDLC, capabilitiesShortCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listAvailableNumbers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| PCRE-compatible regular expression to filter against &#x60;phoneNumber&#x60; field, which is in E.164 format. | [optional]
 **region** | **String**| State or province of this phone number. | [optional]
 **country** | **String**| Country of this phone number. | [optional]
 **voiceEnabled** | **Boolean**| Indicates whether the phone number can handle Calls. Typically set to true for all numbers. | [optional] [default to true]
 **smsEnabled** | **Boolean**| Indication of whether the phone number can handle sending and receiving SMS messages. Typically set to true for all numbers. | [optional] [default to true]
 **capabilitiesVoice** | **Boolean**|  | [optional]
 **capabilitiesSms** | **Boolean**|  | [optional]
 **capabilitiesTollFree** | **Boolean**|  | [optional]
 **capabilitiesTenDLC** | **Boolean**|  | [optional]
 **capabilitiesShortCode** | **Boolean**|  | [optional]


### Return type

[**AvailableNumberList**](AvailableNumberList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Available Numbers List |  -  |

<a name="listCallLogs"></a>
# **listCallLogs**
> LogList listCallLogs(callId)

List Call Logs

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String callId = "callId_example"; // String | String that uniquely identifies this call resource.
    
    try {
      LogList result = apiInstance.listCallLogs(callId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCallLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| String that uniquely identifies this call resource. |


### Return type

[**LogList**](LogList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Logs for this call |  -  |

<a name="listCallRecordings"></a>
# **listCallRecordings**
> RecordingList listCallRecordings(callId, dateCreated)

List Call Recordings

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String callId = "callId_example"; // String | String that uniquely identifies this call resource.
    
    String dateCreated = "dateCreated_example"; // String | Only show recordings created on the specified date, in the form *YYYY-MM-DD*.
    
    try {
      RecordingList result = apiInstance.listCallRecordings(callId, dateCreated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCallRecordings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| String that uniquely identifies this call resource. |
 **dateCreated** | **String**| Only show recordings created on the specified date, in the form *YYYY-MM-DD*. | [optional]


### Return type

[**RecordingList**](RecordingList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of recordings for a call |  -  |

<a name="listCalls"></a>
# **listCalls**
> CallList listCalls(active, to, from, status, startTime, endTime, parentCallId, applicationId)

List Calls

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    Boolean active = false; // Boolean | If active is set to true then all calls of the nature queued, ringing, inProgress are returned in the query.
    
    String to = "to_example"; // String | Only show Calls to this phone number.
    
    String from = "from_example"; // String | Only show Calls from this phone number.
    
    CallStatus status = CallStatus.fromValue("queued"); // CallStatus | Only show Calls currently in this status. May be `queued`, `ringing`, `inProgress`, `canceled`, `completed`, `failed`, `busy`, or `noAnswer`.
    
    String startTime = "startTime_example"; // String | Only show Calls that started at or after this time, given as YYYY-MM-DD hh:mm:ss.
    
    String endTime = "endTime_example"; // String | Only show Calls that ended at or before this time, given as YYYY-MM- DD hh:mm:ss.
    
    String parentCallId = "parentCallId_example"; // String | Only show Calls spawned by the call with this ID.
    
    List<String> applicationId = Arrays.asList(); // List<String> | Only show calls belonging to the given applicationId. This parameter can be repeated to return calls from multiple Applications.
    
    try {
      CallList result = apiInstance.listCalls(active, to, from, status, startTime, endTime, parentCallId, applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCalls");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **active** | **Boolean**| If active is set to true then all calls of the nature queued, ringing, inProgress are returned in the query. | [optional] [default to false]
 **to** | **String**| Only show Calls to this phone number. | [optional]
 **from** | **String**| Only show Calls from this phone number. | [optional]
 **status** | [**CallStatus**](.md)| Only show Calls currently in this status. May be &#x60;queued&#x60;, &#x60;ringing&#x60;, &#x60;inProgress&#x60;, &#x60;canceled&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;busy&#x60;, or &#x60;noAnswer&#x60;. | [optional] [enum: queued, ringing, inProgress, canceled, completed, failed, busy, noAnswer]
 **startTime** | **String**| Only show Calls that started at or after this time, given as YYYY-MM-DD hh:mm:ss. | [optional]
 **endTime** | **String**| Only show Calls that ended at or before this time, given as YYYY-MM- DD hh:mm:ss. | [optional]
 **parentCallId** | **String**| Only show Calls spawned by the call with this ID. | [optional]
 **applicationId** | [**List&lt;String&gt;**](String.md)| Only show calls belonging to the given applicationId. This parameter can be repeated to return calls from multiple Applications. | [optional]


### Return type

[**CallList**](CallList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieved call list |  -  |

<a name="listConferenceRecordings"></a>
# **listConferenceRecordings**
> RecordingList listConferenceRecordings(callId, conferenceId, dateCreated)

List Conference Recordings

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String callId = "callId_example"; // String | Show only Recordings made during the Call with this ID.
    
    String conferenceId = "conferenceId_example"; // String | Show only Recordings made during the conference with this ID.
    
    String dateCreated = "dateCreated_example"; // String | Only show Recordings created on this date, formatted as *YYYY-MM-DD*.
    
    try {
      RecordingList result = apiInstance.listConferenceRecordings(callId, conferenceId, dateCreated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listConferenceRecordings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| Show only Recordings made during the Call with this ID. | [optional]
 **conferenceId** | **String**| Show only Recordings made during the conference with this ID. | [optional]
 **dateCreated** | **String**| Only show Recordings created on this date, formatted as *YYYY-MM-DD*. | [optional]


### Return type

[**RecordingList**](RecordingList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Recordings |  -  |

<a name="listConferences"></a>
# **listConferences**
> ConferenceList listConferences(status, alias, dateCreated, dateUpdated)

List Conferences

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String status = "status_example"; // String | Only show conferences that currently have the specified status. Valid values: `empty`, `populated`, `inProgress`, or `terminated`.
    
    String alias = "alias_example"; // String | List Conferences whose alias exactly matches this string.
    
    String dateCreated = "dateCreated_example"; // String | Only show Conferences that were created on the specified date, in the form *YYYY-MM-DD*.
    
    String dateUpdated = "dateUpdated_example"; // String | Only show Conferences that were last updated on the specified date, in the form *YYYY-MM-DD*.
    
    try {
      ConferenceList result = apiInstance.listConferences(status, alias, dateCreated, dateUpdated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listConferences");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| Only show conferences that currently have the specified status. Valid values: &#x60;empty&#x60;, &#x60;populated&#x60;, &#x60;inProgress&#x60;, or &#x60;terminated&#x60;. | [optional]
 **alias** | **String**| List Conferences whose alias exactly matches this string. | [optional]
 **dateCreated** | **String**| Only show Conferences that were created on the specified date, in the form *YYYY-MM-DD*. | [optional]
 **dateUpdated** | **String**| Only show Conferences that were last updated on the specified date, in the form *YYYY-MM-DD*. | [optional]


### Return type

[**ConferenceList**](ConferenceList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Conferences |  -  |

<a name="listIncomingNumbers"></a>
# **listIncomingNumbers**
> IncomingNumberList listIncomingNumbers(phoneNumber, alias, region, country, applicationId, hasApplication, voiceEnabled, smsEnabled, hasCampaign, capabilitiesVoice, capabilitiesSms, capabilitiesTollFree, capabilitiesTenDLC, capabilitiesShortCode, tfnCampaignId, offnet)

List Incoming Numbers

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String phoneNumber = "phoneNumber_example"; // String | Only show incoming phone number resources that match this PCRE-compatible regular expression.
    
    String alias = "alias_example"; // String | Only show incoming phone numbers with aliases that exactly match this value.
    
    String region = "region_example"; // String | State or province of this phone number.
    
    String country = "country_example"; // String | Country of this phone number.
    
    String applicationId = "applicationId_example"; // String | ID of the Application that FreeClimb should contact if a Call or SMS arrives for this phone number or a Call from this number is placed. An incoming phone number is not useful until associated with an applicationId.
    
    Boolean hasApplication = false; // Boolean | Indication of whether the phone number has an application linked to it.
    
    Boolean voiceEnabled = true; // Boolean | Indicates whether the phone number can handle Calls. Typically set to true for all numbers.
    
    Boolean smsEnabled = true; // Boolean | Indication of whether the phone number can handle sending and receiving SMS messages. Typically set to true for all numbers.
    
    Boolean hasCampaign = true; // Boolean | Indication of whether the phone number has a campaign associated with it
    
    Boolean capabilitiesVoice = true; // Boolean | 
    
    Boolean capabilitiesSms = true; // Boolean | 
    
    Boolean capabilitiesTollFree = true; // Boolean | 
    
    Boolean capabilitiesTenDLC = true; // Boolean | 
    
    Boolean capabilitiesShortCode = true; // Boolean | 
    
    String tfnCampaignId = "tfnCampaignId_example"; // String | Only show incoming phone number resources that have been assigned to the provided TFNCampaign ID.
    
    Boolean offnet = true; // Boolean | Indication of whether the phone number was registered as an offnet number. This field will be rendered only for requests to the IncomingPhone number resource.
    
    try {
      IncomingNumberList result = apiInstance.listIncomingNumbers(phoneNumber, alias, region, country, applicationId, hasApplication, voiceEnabled, smsEnabled, hasCampaign, capabilitiesVoice, capabilitiesSms, capabilitiesTollFree, capabilitiesTenDLC, capabilitiesShortCode, tfnCampaignId, offnet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listIncomingNumbers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| Only show incoming phone number resources that match this PCRE-compatible regular expression. | [optional]
 **alias** | **String**| Only show incoming phone numbers with aliases that exactly match this value. | [optional]
 **region** | **String**| State or province of this phone number. | [optional]
 **country** | **String**| Country of this phone number. | [optional]
 **applicationId** | **String**| ID of the Application that FreeClimb should contact if a Call or SMS arrives for this phone number or a Call from this number is placed. An incoming phone number is not useful until associated with an applicationId. | [optional]
 **hasApplication** | **Boolean**| Indication of whether the phone number has an application linked to it. | [optional] [default to false]
 **voiceEnabled** | **Boolean**| Indicates whether the phone number can handle Calls. Typically set to true for all numbers. | [optional] [default to true]
 **smsEnabled** | **Boolean**| Indication of whether the phone number can handle sending and receiving SMS messages. Typically set to true for all numbers. | [optional] [default to true]
 **hasCampaign** | **Boolean**| Indication of whether the phone number has a campaign associated with it | [optional]
 **capabilitiesVoice** | **Boolean**|  | [optional]
 **capabilitiesSms** | **Boolean**|  | [optional]
 **capabilitiesTollFree** | **Boolean**|  | [optional]
 **capabilitiesTenDLC** | **Boolean**|  | [optional]
 **capabilitiesShortCode** | **Boolean**|  | [optional]
 **tfnCampaignId** | **String**| Only show incoming phone number resources that have been assigned to the provided TFNCampaign ID. | [optional]
 **offnet** | **Boolean**| Indication of whether the phone number was registered as an offnet number. This field will be rendered only for requests to the IncomingPhone number resource. | [optional]


### Return type

[**IncomingNumberList**](IncomingNumberList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Incoming Phone Numbers |  -  |

<a name="listMembers"></a>
# **listMembers**
> QueueMemberList listMembers(queueId)

List Members

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String queueId = "queueId_example"; // String | String that uniquely identifies the Queue that the Member belongs to.
    
    try {
      QueueMemberList result = apiInstance.listMembers(queueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listMembers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| String that uniquely identifies the Queue that the Member belongs to. |


### Return type

[**QueueMemberList**](QueueMemberList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved queue member list |  -  |

<a name="listParticipants"></a>
# **listParticipants**
> ConferenceParticipantList listParticipants(conferenceId, talk, listen)

List Participants

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String conferenceId = "conferenceId_example"; // String | ID of the conference this participant is in.
    
    Boolean talk = true; // Boolean | Only show Participants with the talk privilege.
    
    Boolean listen = true; // Boolean | Only show Participants with the listen privilege.
    
    try {
      ConferenceParticipantList result = apiInstance.listParticipants(conferenceId, talk, listen);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listParticipants");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceId** | **String**| ID of the conference this participant is in. |
 **talk** | **Boolean**| Only show Participants with the talk privilege. | [optional]
 **listen** | **Boolean**| Only show Participants with the listen privilege. | [optional]


### Return type

[**ConferenceParticipantList**](ConferenceParticipantList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved conference participant list |  -  |

<a name="listRecordings"></a>
# **listRecordings**
> RecordingList listRecordings(callId, conferenceId, dateCreated)

List Recordings

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String callId = "callId_example"; // String | Show only Recordings made during the Call with this ID.
    
    String conferenceId = "conferenceId_example"; // String | Show only Recordings made during the conference with this ID.
    
    String dateCreated = "dateCreated_example"; // String | Only show Recordings created on this date, formatted as *YYYY-MM-DD*.
    
    try {
      RecordingList result = apiInstance.listRecordings(callId, conferenceId, dateCreated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listRecordings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| Show only Recordings made during the Call with this ID. | [optional]
 **conferenceId** | **String**| Show only Recordings made during the conference with this ID. | [optional]
 **dateCreated** | **String**| Only show Recordings created on this date, formatted as *YYYY-MM-DD*. | [optional]


### Return type

[**RecordingList**](RecordingList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Recordings |  -  |

<a name="listSmsMessages"></a>
# **listSmsMessages**
> MessagesList listSmsMessages(to, from, beginTime, endTime, direction, campaignId, brandId, is10DLC)

List SMS Messages

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String to = "to_example"; // String | Only show Messages to this phone number.
    
    String from = "from_example"; // String | Only show Messages from this phone number.
    
    String beginTime = "beginTime_example"; // String | Only show Messages sent at or after this time (GMT), given as *YYYY-MM-DD hh:mm:ss*.
    
    String endTime = "endTime_example"; // String | Only show messages sent at or before this time (GMT), given as *YYYY-MM-DD hh:mm*..
    
    MessageDirection direction = MessageDirection.fromValue("inbound"); // MessageDirection | Either `inbound` or `outbound`. Only show Messages that were either *sent from* or *received by* FreeClimb.
    
    String campaignId = "campaignId_example"; // String | Only show messages associated with this campaign ID.
    
    String brandId = "brandId_example"; // String | Only show messages associated with this brand ID
    
    Boolean is10DLC = true; // Boolean | Only show messages that were sent as part of a 10DLC campaign.
    
    try {
      MessagesList result = apiInstance.listSmsMessages(to, from, beginTime, endTime, direction, campaignId, brandId, is10DLC);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listSmsMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **String**| Only show Messages to this phone number. | [optional]
 **from** | **String**| Only show Messages from this phone number. | [optional]
 **beginTime** | **String**| Only show Messages sent at or after this time (GMT), given as *YYYY-MM-DD hh:mm:ss*. | [optional]
 **endTime** | **String**| Only show messages sent at or before this time (GMT), given as *YYYY-MM-DD hh:mm*.. | [optional]
 **direction** | [**MessageDirection**](.md)| Either &#x60;inbound&#x60; or &#x60;outbound&#x60;. Only show Messages that were either *sent from* or *received by* FreeClimb. | [optional] [enum: inbound, outbound]
 **campaignId** | **String**| Only show messages associated with this campaign ID. | [optional]
 **brandId** | **String**| Only show messages associated with this brand ID | [optional]
 **is10DLC** | **Boolean**| Only show messages that were sent as part of a 10DLC campaign. | [optional]


### Return type

[**MessagesList**](MessagesList.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of messages |  -  |

<a name="makeACall"></a>
# **makeACall**
> CallResult makeACall(makeCallRequest)

Make a Call

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    MakeCallRequest makeCallRequest = new MakeCallRequest(); // MakeCallRequest | Call details for making a call
    
    try {
      CallResult result = apiInstance.makeACall(makeCallRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#makeACall");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **makeCallRequest** | [**MakeCallRequest**](MakeCallRequest.md)| Call details for making a call | [optional]


### Return type

[**CallResult**](CallResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Call that was created |  -  |

<a name="makeAWebrtcJwt"></a>
# **makeAWebrtcJwt**
> String makeAWebrtcJwt(inlineObject)

Make a JWT for WebRTC calling

Make a JWT for WebRTC calling

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    
    try {
      String result = apiInstance.makeAWebrtcJwt(inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#makeAWebrtcJwt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |


### Return type

**String**

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The created JWT |  -  |

<a name="removeAParticipant"></a>
# **removeAParticipant**
> removeAParticipant(conferenceId, callId)

Remove a Participant

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String conferenceId = "conferenceId_example"; // String | ID of the conference this participant is in.
    
    String callId = "callId_example"; // String | ID of the Call associated with this participant.
    
    try {
      apiInstance.removeAParticipant(conferenceId, callId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#removeAParticipant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceId** | **String**| ID of the conference this participant is in. |
 **callId** | **String**| ID of the Call associated with this participant. |


### Return type

null (empty response body)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully deleted conference participant |  -  |

<a name="sendAnSmsMessage"></a>
# **sendAnSmsMessage**
> MessageResult sendAnSmsMessage(messageRequest)

Send an SMS Message

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    MessageRequest messageRequest = new MessageRequest(); // MessageRequest | Details to create a message
    
    try {
      MessageResult result = apiInstance.sendAnSmsMessage(messageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#sendAnSmsMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageRequest** | [**MessageRequest**](MessageRequest.md)| Details to create a message |


### Return type

[**MessageResult**](MessageResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | The message has been accepted. |  -  |

<a name="streamARecordingFile"></a>
# **streamARecordingFile**
> File streamARecordingFile(recordingId)

Stream a Recording File

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String recordingId = "recordingId_example"; // String | String that uniquely identifies this recording resource.
    
    try {
      File result = apiInstance.streamARecordingFile(recordingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#streamARecordingFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingId** | **String**| String that uniquely identifies this recording resource. |


### Return type

[**File**](File.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: audio/x-wav

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Streaming a Recording represented with audio/x-wav mime-type |  -  |

<a name="updateAConference"></a>
# **updateAConference**
> ConferenceResult updateAConference(conferenceId, updateConferenceRequest)

Update a Conference

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String conferenceId = "conferenceId_example"; // String | String that uniquely identifies this conference resource.
    
    UpdateConferenceRequest updateConferenceRequest = new UpdateConferenceRequest(); // UpdateConferenceRequest | Conference Details to update
    
    try {
      ConferenceResult result = apiInstance.updateAConference(conferenceId, updateConferenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateAConference");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceId** | **String**| String that uniquely identifies this conference resource. |
 **updateConferenceRequest** | [**UpdateConferenceRequest**](UpdateConferenceRequest.md)| Conference Details to update | [optional]


### Return type

[**ConferenceResult**](ConferenceResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Conference Details to Update |  -  |

<a name="updateALiveCall"></a>
# **updateALiveCall**
> updateALiveCall(callId, updateCallRequest)

Update a Live Call

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String callId = "callId_example"; // String | String that uniquely identifies this call resource.
    
    UpdateCallRequest updateCallRequest = new UpdateCallRequest(); // UpdateCallRequest | Call details to update
    
    try {
      apiInstance.updateALiveCall(callId, updateCallRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateALiveCall");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callId** | **String**| String that uniquely identifies this call resource. |
 **updateCallRequest** | [**UpdateCallRequest**](UpdateCallRequest.md)| Call details to update |


### Return type

null (empty response body)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Successfully queued call |  -  |

<a name="updateAParticipant"></a>
# **updateAParticipant**
> ConferenceParticipantResult updateAParticipant(conferenceId, callId, updateConferenceParticipantRequest)

Update a Participant

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String conferenceId = "conferenceId_example"; // String | ID of the conference this participant is in.
    
    String callId = "callId_example"; // String | ID of the Call associated with this participant.
    
    UpdateConferenceParticipantRequest updateConferenceParticipantRequest = new UpdateConferenceParticipantRequest(); // UpdateConferenceParticipantRequest | Conference participant details to update
    
    try {
      ConferenceParticipantResult result = apiInstance.updateAParticipant(conferenceId, callId, updateConferenceParticipantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateAParticipant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conferenceId** | **String**| ID of the conference this participant is in. |
 **callId** | **String**| ID of the Call associated with this participant. |
 **updateConferenceParticipantRequest** | [**UpdateConferenceParticipantRequest**](UpdateConferenceParticipantRequest.md)| Conference participant details to update | [optional]


### Return type

[**ConferenceParticipantResult**](ConferenceParticipantResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved conference participant |  -  |

<a name="updateAQueue"></a>
# **updateAQueue**
> QueueResult updateAQueue(queueId, queueRequest)

Update a Queue

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String queueId = "queueId_example"; // String | A string that uniquely identifies this Queue resource.
    
    QueueRequest queueRequest = new QueueRequest(); // QueueRequest | Queue Details to update
    
    try {
      QueueResult result = apiInstance.updateAQueue(queueId, queueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateAQueue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueId** | **String**| A string that uniquely identifies this Queue resource. |
 **queueRequest** | [**QueueRequest**](QueueRequest.md)| Queue Details to update | [optional]


### Return type

[**QueueResult**](QueueResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated queue |  -  |

<a name="updateAnAccount"></a>
# **updateAnAccount**
> updateAnAccount(accountRequest)

Manage an account

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    AccountRequest accountRequest = new AccountRequest(); // AccountRequest | Account details to update
    
    try {
      apiInstance.updateAnAccount(accountRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateAnAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountRequest** | [**AccountRequest**](AccountRequest.md)| Account details to update | [optional]


### Return type

null (empty response body)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful Account update |  -  |

<a name="updateAnApplication"></a>
# **updateAnApplication**
> ApplicationResult updateAnApplication(applicationId, applicationRequest)

Update an application

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String applicationId = "applicationId_example"; // String | A string that uniquely identifies this application resource.
    
    ApplicationRequest applicationRequest = new ApplicationRequest(); // ApplicationRequest | Application details to update.
    
    try {
      ApplicationResult result = apiInstance.updateAnApplication(applicationId, applicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateAnApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| A string that uniquely identifies this application resource. |
 **applicationRequest** | [**ApplicationRequest**](ApplicationRequest.md)| Application details to update. | [optional]


### Return type

[**ApplicationResult**](ApplicationResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update Application |  -  |

<a name="updateAnIncomingNumber"></a>
# **updateAnIncomingNumber**
> IncomingNumberResult updateAnIncomingNumber(phoneNumberId, incomingNumberRequest)

Update an Incoming Number

### Example
```java
// Import classes:
import com.github.freeclimbapi.ApiClient;
import com.github.freeclimbapi.ApiException;
import com.github.freeclimbapi.Configuration;
import com.github.freeclimbapi.auth.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.DefaultApi;

public class Example {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.freeclimb.com/apiserver");
    defaultClient.setAccountId("YOUR_ACCOUNT_ID");
    defaultClient.setApiKey("YOUR_API_KEY");
    
    
    DefaultApi apiInstance = new DefaultApi(defaultClient);
    
    String phoneNumberId = "phoneNumberId_example"; // String | String that uniquely identifies this phone number resource.
    
    IncomingNumberRequest incomingNumberRequest = new IncomingNumberRequest(); // IncomingNumberRequest | Incoming Number details to update
    
    try {
      IncomingNumberResult result = apiInstance.updateAnIncomingNumber(phoneNumberId, incomingNumberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateAnIncomingNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumberId** | **String**| String that uniquely identifies this phone number resource. |
 **incomingNumberRequest** | [**IncomingNumberRequest**](IncomingNumberRequest.md)| Incoming Number details to update | [optional]


### Return type

[**IncomingNumberResult**](IncomingNumberResult.md)

### Authorization

[fc](../README.md#fc)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated Incoming Phone Number |  -  |

