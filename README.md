# freeclimb-java-client

FreeClimb API

- API version: 1.0.0

FreeClimb is a cloud-based application programming interface (API) that puts the power of the Vail platform in your hands. FreeClimb simplifies the process of creating applications that can use a full range of telephony features without requiring specialized or on-site telephony equipment. Using the FreeClimb REST API to write applications is easy! You have the option to use the language of your choice or hit the API directly. Your application can execute a command by issuing a RESTful request to the FreeClimb API. The base URL to send HTTP requests to the FreeClimb REST API is: /apiserver. FreeClimb authenticates and processes your request.

For more information, please visit [https://www.freeclimb.com/support/](https://www.freeclimb.com/support/)

_Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)_

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.github.freeclimbapi</groupId>
  <artifactId>freeclimb-java-client</artifactId>
  <version>5.5.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'freeclimb-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'freeclimb-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.github.freeclimbapi:freeclimb-java-client:5.5.1"
     implementation("com.squareup.okhttp3:okhttp:4.9.3")
     implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/freeclimb-java-client-5.5.1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

    // Configure API client
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

## Using PerCL

The Performance Command Language (PerCL) defines a set of instructions, written in JSON format, that express telephony actions to be performed in response to an event on the FreeClimb platform. FreeClimb communicates with the application server when events associated with the application occur, so the webserver can instruct FreeClimb how to handle such events using PerCL scripts.
PerCL commands are a part of the model schema and can be serialized into JSON like so:

```typescript
import com.github.freeclimbapi.*;
public class Example {
  public static void main(String[] args) {
    Say say = new Say().text("Hello FreeClimb!");
    Play play = new Play().file("Example File");
    GetDigits getDigits = new GetDigits().actionUrl("Example Action URL").addPromptsItem(say).addPromptsItem(play);
    PerclScript script = new PerclScript().addCommand(getDigits);
    JSON jsonObj = script.build(); // builds the list of PerclCommands needed for the response
    // or
    String jsonStr = script.toJson(); // similar to .build() but returns the serialized string for you.
  }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://www.freeclimb.com/apiserver*

| Class        | Method                                                                              | HTTP request                                                                      | Description                             |
| ------------ | ----------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------- |
| _DefaultApi_ | [**buyAPhoneNumber**](docs/DefaultApi.md#buyAPhoneNumber)                           | **POST** /Accounts/{accountId}/IncomingPhoneNumbers                               | Buy a Phone Number                      |
| _DefaultApi_ | [**createAConference**](docs/DefaultApi.md#createAConference)                       | **POST** /Accounts/{accountId}/Conferences                                        | Create a Conference                     |
| _DefaultApi_ | [**createAQueue**](docs/DefaultApi.md#createAQueue)                                 | **POST** /Accounts/{accountId}/Queues                                             | Create a Queue                          |
| _DefaultApi_ | [**createAnApplication**](docs/DefaultApi.md#createAnApplication)                   | **POST** /Accounts/{accountId}/Applications                                       | Create an application                   |
| _DefaultApi_ | [**deleteARecording**](docs/DefaultApi.md#deleteARecording)                         | **DELETE** /Accounts/{accountId}/Recordings/{recordingId}                         | Delete a Recording                      |
| _DefaultApi_ | [**deleteAnApplication**](docs/DefaultApi.md#deleteAnApplication)                   | **DELETE** /Accounts/{accountId}/Applications/{applicationId}                     | Delete an application                   |
| _DefaultApi_ | [**deleteAnIncomingNumber**](docs/DefaultApi.md#deleteAnIncomingNumber)             | **DELETE** /Accounts/{accountId}/IncomingPhoneNumbers/{phoneNumberId}             | Delete an Incoming Number               |
| _DefaultApi_ | [**dequeueAMember**](docs/DefaultApi.md#dequeueAMember)                             | **POST** /Accounts/{accountId}/Queues/{queueId}/Members/{callId}                  | Dequeue a Member                        |
| _DefaultApi_ | [**dequeueHeadMember**](docs/DefaultApi.md#dequeueHeadMember)                       | **POST** /Accounts/{accountId}/Queues/{queueId}/Members/Front                     | Dequeue Head Member                     |
| _DefaultApi_ | [**downloadARecordingFile**](docs/DefaultApi.md#downloadARecordingFile)             | **GET** /Accounts/{accountId}/Recordings/{recordingId}/Download                   | Download a Recording File               |
| _DefaultApi_ | [**filterLogs**](docs/DefaultApi.md#filterLogs)                                     | **POST** /Accounts/{accountId}/Logs                                               | Filter Logs                             |
| _DefaultApi_ | [**getACall**](docs/DefaultApi.md#getACall)                                         | **GET** /Accounts/{accountId}/Calls/{callId}                                      | Get a Call                              |
| _DefaultApi_ | [**getAConference**](docs/DefaultApi.md#getAConference)                             | **GET** /Accounts/{accountId}/Conferences/{conferenceId}                          | Get a Conference                        |
| _DefaultApi_ | [**getAMember**](docs/DefaultApi.md#getAMember)                                     | **GET** /Accounts/{accountId}/Queues/{queueId}/Members/{callId}                   | Get a Member                            |
| _DefaultApi_ | [**getAParticipant**](docs/DefaultApi.md#getAParticipant)                           | **GET** /Accounts/{accountId}/Conferences/{conferenceId}/Participants/{callId}    | Get a Participant                       |
| _DefaultApi_ | [**getAQueue**](docs/DefaultApi.md#getAQueue)                                       | **GET** /Accounts/{accountId}/Queues/{queueId}                                    | Get a Queue                             |
| _DefaultApi_ | [**getARecording**](docs/DefaultApi.md#getARecording)                               | **GET** /Accounts/{accountId}/Recordings/{recordingId}                            | Get a Recording                         |
| _DefaultApi_ | [**getAnAccount**](docs/DefaultApi.md#getAnAccount)                                 | **GET** /Accounts/{accountId}                                                     | Get an Account                          |
| _DefaultApi_ | [**getAnApplication**](docs/DefaultApi.md#getAnApplication)                         | **GET** /Accounts/{accountId}/Applications/{applicationId}                        | Get an Application                      |
| _DefaultApi_ | [**getAnIncomingNumber**](docs/DefaultApi.md#getAnIncomingNumber)                   | **GET** /Accounts/{accountId}/IncomingPhoneNumbers/{phoneNumberId}                | Get an Incoming Number                  |
| _DefaultApi_ | [**getAnSmsMessage**](docs/DefaultApi.md#getAnSmsMessage)                           | **GET** /Accounts/{accountId}/Messages/{messageId}                                | Get an SMS Message                      |
| _DefaultApi_ | [**getHeadMember**](docs/DefaultApi.md#getHeadMember)                               | **GET** /Accounts/{accountId}/Queues/{queueId}/Members/Front                      | Get Head Member                         |
| _DefaultApi_ | [**getTenDLCSmsBrand**](docs/DefaultApi.md#getTenDLCSmsBrand)                       | **GET** /Accounts/{accountId}/Messages/10DLC/Brands/{brandId}                     | Get a 10DLC SMS Brand                   |
| _DefaultApi_ | [**getTenDLCSmsBrands**](docs/DefaultApi.md#getTenDLCSmsBrands)                     | **GET** /Accounts/{accountId}/Messages/10DLC/Brands                               | Get list of SMS 10DLC Brands            |
| _DefaultApi_ | [**getTenDLCSmsCampaign**](docs/DefaultApi.md#getTenDLCSmsCampaign)                 | **GET** /Accounts/{accountId}/Messages/10DLC/Campaigns/{campaignId}               | Get a 10DLC SMS Campaign                |
| _DefaultApi_ | [**getTenDLCSmsCampaigns**](docs/DefaultApi.md#getTenDLCSmsCampaigns)               | **GET** /Accounts/{accountId}/Messages/10DLC/Campaigns                            | Get list of SMS 10DLC Campaigns         |
| _DefaultApi_ | [**getTenDLCSmsPartnerCampaign**](docs/DefaultApi.md#getTenDLCSmsPartnerCampaign)   | **GET** /Accounts/{accountId}/Messages/10DLC/PartnerCampaigns/{campaignId}        | Get a 10DLC SMS Partner Campaign        |
| _DefaultApi_ | [**getTenDLCSmsPartnerCampaigns**](docs/DefaultApi.md#getTenDLCSmsPartnerCampaigns) | **GET** /Accounts/{accountId}/Messages/10DLC/PartnerCampaigns                     | Get list of SMS 10DLC Partner Campaigns |
| _DefaultApi_ | [**listActiveQueues**](docs/DefaultApi.md#listActiveQueues)                         | **GET** /Accounts/{accountId}/Queues                                              | List Active Queues                      |
| _DefaultApi_ | [**listAllAccountLogs**](docs/DefaultApi.md#listAllAccountLogs)                     | **GET** /Accounts/{accountId}/Logs                                                | List All Account Logs                   |
| _DefaultApi_ | [**listApplications**](docs/DefaultApi.md#listApplications)                         | **GET** /Accounts/{accountId}/Applications                                        | List applications                       |
| _DefaultApi_ | [**listAvailableNumbers**](docs/DefaultApi.md#listAvailableNumbers)                 | **GET** /AvailablePhoneNumbers                                                    | List available numbers                  |
| _DefaultApi_ | [**listCallLogs**](docs/DefaultApi.md#listCallLogs)                                 | **GET** /Accounts/{accountId}/Calls/{callId}/Logs                                 | List Call Logs                          |
| _DefaultApi_ | [**listCallRecordings**](docs/DefaultApi.md#listCallRecordings)                     | **GET** /Accounts/{accountId}/Calls/{callId}/Recordings                           | List Call Recordings                    |
| _DefaultApi_ | [**listCalls**](docs/DefaultApi.md#listCalls)                                       | **GET** /Accounts/{accountId}/Calls                                               | List Calls                              |
| _DefaultApi_ | [**listConferences**](docs/DefaultApi.md#listConferences)                           | **GET** /Accounts/{accountId}/Conferences                                         | List Conferences                        |
| _DefaultApi_ | [**listIncomingNumbers**](docs/DefaultApi.md#listIncomingNumbers)                   | **GET** /Accounts/{accountId}/IncomingPhoneNumbers                                | List Incoming Numbers                   |
| _DefaultApi_ | [**listMembers**](docs/DefaultApi.md#listMembers)                                   | **GET** /Accounts/{accountId}/Queues/{queueId}/Members                            | List Members                            |
| _DefaultApi_ | [**listParticipants**](docs/DefaultApi.md#listParticipants)                         | **GET** /Accounts/{accountId}/Conferences/{conferenceId}/Participants             | List Participants                       |
| _DefaultApi_ | [**listRecordings**](docs/DefaultApi.md#listRecordings)                             | **GET** /Accounts/{accountId}/Recordings                                          | List Recordings                         |
| _DefaultApi_ | [**listSmsMessages**](docs/DefaultApi.md#listSmsMessages)                           | **GET** /Accounts/{accountId}/Messages                                            | List SMS Messages                       |
| _DefaultApi_ | [**makeACall**](docs/DefaultApi.md#makeACall)                                       | **POST** /Accounts/{accountId}/Calls                                              | Make a Call                             |
| _DefaultApi_ | [**removeAParticipant**](docs/DefaultApi.md#removeAParticipant)                     | **DELETE** /Accounts/{accountId}/Conferences/{conferenceId}/Participants/{callId} | Remove a Participant                    |
| _DefaultApi_ | [**sendAnSmsMessage**](docs/DefaultApi.md#sendAnSmsMessage)                         | **POST** /Accounts/{accountId}/Messages                                           | Send an SMS Message                     |
| _DefaultApi_ | [**streamARecordingFile**](docs/DefaultApi.md#streamARecordingFile)                 | **GET** /Accounts/{accountId}/Recordings/{recordingId}/Stream                     | Stream a Recording File                 |
| _DefaultApi_ | [**updateAConference**](docs/DefaultApi.md#updateAConference)                       | **POST** /Accounts/{accountId}/Conferences/{conferenceId}                         | Update a Conference                     |
| _DefaultApi_ | [**updateALiveCall**](docs/DefaultApi.md#updateALiveCall)                           | **POST** /Accounts/{accountId}/Calls/{callId}                                     | Update a Live Call                      |
| _DefaultApi_ | [**updateAParticipant**](docs/DefaultApi.md#updateAParticipant)                     | **POST** /Accounts/{accountId}/Conferences/{conferenceId}/Participants/{callId}   | Update a Participant                    |
| _DefaultApi_ | [**updateAQueue**](docs/DefaultApi.md#updateAQueue)                                 | **POST** /Accounts/{accountId}/Queues/{queueId}                                   | Update a Queue                          |
| _DefaultApi_ | [**updateAnAccount**](docs/DefaultApi.md#updateAnAccount)                           | **POST** /Accounts/{accountId}                                                    | Manage an account                       |
| _DefaultApi_ | [**updateAnApplication**](docs/DefaultApi.md#updateAnApplication)                   | **POST** /Accounts/{accountId}/Applications/{applicationId}                       | Update an application                   |
| _DefaultApi_ | [**updateAnIncomingNumber**](docs/DefaultApi.md#updateAnIncomingNumber)             | **POST** /Accounts/{accountId}/IncomingPhoneNumbers/{phoneNumberId}               | Update an Incoming Number               |

## Documentation for Models

- [AccountRequest](docs/AccountRequest.md)
- [AccountResult](docs/AccountResult.md)
- [AccountResultAllOf](docs/AccountResultAllOf.md)
- [AccountStatus](docs/AccountStatus.md)
- [AccountType](docs/AccountType.md)
- [AddToConference](docs/AddToConference.md)
- [AddToConferenceAllOf](docs/AddToConferenceAllOf.md)
- [AnsweredBy](docs/AnsweredBy.md)
- [ApplicationList](docs/ApplicationList.md)
- [ApplicationListAllOf](docs/ApplicationListAllOf.md)
- [ApplicationRequest](docs/ApplicationRequest.md)
- [ApplicationResult](docs/ApplicationResult.md)
- [ApplicationResultAllOf](docs/ApplicationResultAllOf.md)
- [AvailableNumber](docs/AvailableNumber.md)
- [AvailableNumberList](docs/AvailableNumberList.md)
- [AvailableNumberListAllOf](docs/AvailableNumberListAllOf.md)
- [BuyIncomingNumberRequest](docs/BuyIncomingNumberRequest.md)
- [CallDirection](docs/CallDirection.md)
- [CallList](docs/CallList.md)
- [CallListAllOf](docs/CallListAllOf.md)
- [CallResult](docs/CallResult.md)
- [CallResultAllOf](docs/CallResultAllOf.md)
- [CallStatus](docs/CallStatus.md)
- [Capabilities](docs/Capabilities.md)
- [ConferenceList](docs/ConferenceList.md)
- [ConferenceListAllOf](docs/ConferenceListAllOf.md)
- [ConferenceParticipantList](docs/ConferenceParticipantList.md)
- [ConferenceParticipantListAllOf](docs/ConferenceParticipantListAllOf.md)
- [ConferenceParticipantResult](docs/ConferenceParticipantResult.md)
- [ConferenceParticipantResultAllOf](docs/ConferenceParticipantResultAllOf.md)
- [ConferenceResult](docs/ConferenceResult.md)
- [ConferenceResultAllOf](docs/ConferenceResultAllOf.md)
- [ConferenceStatus](docs/ConferenceStatus.md)
- [CreateConference](docs/CreateConference.md)
- [CreateConferenceAllOf](docs/CreateConferenceAllOf.md)
- [CreateConferenceRequest](docs/CreateConferenceRequest.md)
- [Dequeue](docs/Dequeue.md)
- [Enqueue](docs/Enqueue.md)
- [EnqueueAllOf](docs/EnqueueAllOf.md)
- [FilterLogsRequest](docs/FilterLogsRequest.md)
- [GetDigits](docs/GetDigits.md)
- [GetDigitsAllOf](docs/GetDigitsAllOf.md)
- [GetSpeech](docs/GetSpeech.md)
- [GetSpeechAllOf](docs/GetSpeechAllOf.md)
- [GetSpeechReason](docs/GetSpeechReason.md)
- [GrammarFileBuiltIn](docs/GrammarFileBuiltIn.md)
- [GrammarType](docs/GrammarType.md)
- [Hangup](docs/Hangup.md)
- [HangupAllOf](docs/HangupAllOf.md)
- [IfMachine](docs/IfMachine.md)
- [IncomingNumberList](docs/IncomingNumberList.md)
- [IncomingNumberListAllOf](docs/IncomingNumberListAllOf.md)
- [IncomingNumberRequest](docs/IncomingNumberRequest.md)
- [IncomingNumberResult](docs/IncomingNumberResult.md)
- [IncomingNumberResultAllOf](docs/IncomingNumberResultAllOf.md)
- [Language](docs/Language.md)
- [LogLevel](docs/LogLevel.md)
- [LogList](docs/LogList.md)
- [LogListAllOf](docs/LogListAllOf.md)
- [LogResult](docs/LogResult.md)
- [MachineType](docs/MachineType.md)
- [MakeCallRequest](docs/MakeCallRequest.md)
- [MessageDirection](docs/MessageDirection.md)
- [MessageRequest](docs/MessageRequest.md)
- [MessageRequestAllOf](docs/MessageRequestAllOf.md)
- [MessageResult](docs/MessageResult.md)
- [MessageResultAllOf](docs/MessageResultAllOf.md)
- [MessageStatus](docs/MessageStatus.md)
- [MessagesList](docs/MessagesList.md)
- [MessagesListAllOf](docs/MessagesListAllOf.md)
- [MutableResourceModel](docs/MutableResourceModel.md)
- [OutDial](docs/OutDial.md)
- [OutDialAllOf](docs/OutDialAllOf.md)
- [PaginationModel](docs/PaginationModel.md)
- [Park](docs/Park.md)
- [ParkAllOf](docs/ParkAllOf.md)
- [Pause](docs/Pause.md)
- [PauseAllOf](docs/PauseAllOf.md)
- [PerclCommand](docs/PerclCommand.md)
- [PerclScript](docs/PerclScript.md)
- [Play](docs/Play.md)
- [PlayAllOf](docs/PlayAllOf.md)
- [PlayBeep](docs/PlayBeep.md)
- [PlayEarlyMedia](docs/PlayEarlyMedia.md)
- [PlayEarlyMediaAllOf](docs/PlayEarlyMediaAllOf.md)
- [QueueList](docs/QueueList.md)
- [QueueListAllOf](docs/QueueListAllOf.md)
- [QueueMember](docs/QueueMember.md)
- [QueueMemberList](docs/QueueMemberList.md)
- [QueueMemberListAllOf](docs/QueueMemberListAllOf.md)
- [QueueRequest](docs/QueueRequest.md)
- [QueueResult](docs/QueueResult.md)
- [QueueResultAllOf](docs/QueueResultAllOf.md)
- [QueueResultStatus](docs/QueueResultStatus.md)
- [RecordUtterance](docs/RecordUtterance.md)
- [RecordUtteranceAllOf](docs/RecordUtteranceAllOf.md)
- [RecordUtteranceTermReason](docs/RecordUtteranceTermReason.md)
- [RecordingList](docs/RecordingList.md)
- [RecordingListAllOf](docs/RecordingListAllOf.md)
- [RecordingResult](docs/RecordingResult.md)
- [RecordingResultAllOf](docs/RecordingResultAllOf.md)
- [Redirect](docs/Redirect.md)
- [RedirectAllOf](docs/RedirectAllOf.md)
- [Reject](docs/Reject.md)
- [RejectAllOf](docs/RejectAllOf.md)
- [RemoveFromConference](docs/RemoveFromConference.md)
- [RemoveFromConferenceAllOf](docs/RemoveFromConferenceAllOf.md)
- [RequestType](docs/RequestType.md)
- [SMSTenDLCBrand](docs/SMSTenDLCBrand.md)
- [SMSTenDLCBrandsListResult](docs/SMSTenDLCBrandsListResult.md)
- [SMSTenDLCBrandsListResultAllOf](docs/SMSTenDLCBrandsListResultAllOf.md)
- [SMSTenDLCCampaign](docs/SMSTenDLCCampaign.md)
- [SMSTenDLCCampaignsListResult](docs/SMSTenDLCCampaignsListResult.md)
- [SMSTenDLCCampaignsListResultAllOf](docs/SMSTenDLCCampaignsListResultAllOf.md)
- [SMSTenDLCPartnerCampaign](docs/SMSTenDLCPartnerCampaign.md)
- [SMSTenDLCPartnerCampaignBrand](docs/SMSTenDLCPartnerCampaignBrand.md)
- [SMSTenDLCPartnerCampaignsListResult](docs/SMSTenDLCPartnerCampaignsListResult.md)
- [SMSTenDLCPartnerCampaignsListResultAllOf](docs/SMSTenDLCPartnerCampaignsListResultAllOf.md)
- [Say](docs/Say.md)
- [SayAllOf](docs/SayAllOf.md)
- [SendDigits](docs/SendDigits.md)
- [SendDigitsAllOf](docs/SendDigitsAllOf.md)
- [SetListen](docs/SetListen.md)
- [SetListenAllOf](docs/SetListenAllOf.md)
- [SetTalk](docs/SetTalk.md)
- [SetTalkAllOf](docs/SetTalkAllOf.md)
- [Sms](docs/Sms.md)
- [SmsAllOf](docs/SmsAllOf.md)
- [StartRecordCall](docs/StartRecordCall.md)
- [TerminateConference](docs/TerminateConference.md)
- [TerminateConferenceAllOf](docs/TerminateConferenceAllOf.md)
- [TranscribeUtterance](docs/TranscribeUtterance.md)
- [TranscribeUtteranceRecord](docs/TranscribeUtteranceRecord.md)
- [Unpark](docs/Unpark.md)
- [UpdateCallRequest](docs/UpdateCallRequest.md)
- [UpdateCallRequestStatus](docs/UpdateCallRequestStatus.md)
- [UpdateConferenceParticipantRequest](docs/UpdateConferenceParticipantRequest.md)
- [UpdateConferenceRequest](docs/UpdateConferenceRequest.md)
- [UpdateConferenceRequestStatus](docs/UpdateConferenceRequestStatus.md)

## Documentation for Authorization

Authentication schemes defined for the API:

### fc

- **Type**: HTTP basic authentication

<a name="documentation-for-verify-request-signature"></a>

## Documentation for verifying request signature

- To verify the request signature, we will need to use the verifyRequestSignature method within the Request Verifier class

  RequestVerifier.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance)

  This is a method that you can call directly from the request verifier class, it will throw exceptions depending on whether all parts of the request signature is valid otherwise it will throw a specific error message depending on which request signature part is causing issues

  This method requires a requestBody of type String, a requestHeader of type String, a signingSecret of type String, and a tolerance value of type Integer

  Example code down below

  ```java
    package com.github.freeclimbapi;

    import com.github.freeclimbapi.utils.*;
    import java.security.NoSuchAlgorithmException;
    import java.security.InvalidKeyException;

    public class Example {
        public void verifyRequestSignatureExample() throws NoSuchAlgorithmException, InvalidKeyException {
            String requestBody = "{\"accountId\":\"AC1334ffb694cd8d969f51cddf5f7c9b478546d50c\",\"callId\":\"CAccb0b00506553cda09b51c5477f672a49e0b2213\",\"callStatus\":\"ringing\",\"conferenceId\":null,\"direction\":\"inbound\",\"from\":\"+13121000109\",\"parentCallId\":null,\"queueId\":null,\"requestType\":\"inboundCall\",\"to\":\"+13121000096\"}";
            String signingSecret = "sigsec_ead6d3b6904196c60835d039e91b3341c77a7793";
            String requestHeader = "t=1679944186,v1=c3957749baf61df4b1506802579cc69a74c77a1ae21447b930e5a704f9ec4120,v1=1ba18712726898fbbe48cd862dd096a709f7ad761a5bab14bda9ac24d963a6a8";
            Integer tolerance = 5 * 60;
            RequestVerifier.verifyRequestSignature(requestBody, requestHeader, signingSecret, tolerance);
        }
     }
  ```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@freeclimb.com
