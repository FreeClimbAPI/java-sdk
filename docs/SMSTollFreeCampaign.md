

# SMSTollFreeCampaign


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | ID of the account that created this toll-free campaign | 
**campaignId** | **String** | Alphanumeric identifier used by the platform to identify this toll-free campaign | 
**useCase** | **String** |  | 
**registrationStatus** | [**RegistrationStatusEnum**](#RegistrationStatusEnum) | Current toll-free campaign registration status.Possible values: UNREGISTERED,INITIATED,PENDING,DECLINED,REGISTERED. A newly created campaign defaults to INITIATED status.  | 
**dateCreated** | **String** |  | 
**dateUpdated** | **String** |  | 
**revision** | **Integer** |  | 



## Enum: RegistrationStatusEnum

Name | Value
---- | -----
UNREGISTERED | &quot;UNREGISTERED&quot;
INITIATED | &quot;INITIATED&quot;
PENDING | &quot;PENDING&quot;
DECLINED | &quot;DECLINED&quot;
REGISTERED | &quot;REGISTERED&quot;



