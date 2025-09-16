
# EmailSenderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique email sender identifier. | 
**domainId** | **Integer** | ID of the associated domain. | 
**email** | **String** | Email address of the sender. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the email sender was created. | 
**domainStatus** | [**DomainStatusEnum**](#DomainStatusEnum) | Current verification status of the associated domain. | 
**fromName** | **String** | Display name for the sender. |  [optional]
**replyTo** | **String** | Reply-to email address. |  [optional]


<a name="DomainStatusEnum"></a>
## Enum: DomainStatusEnum
Name | Value
---- | -----
NOT_VERIFIED | &quot;not_verified&quot;
PENDING | &quot;pending&quot;
MANUAL_REVIEW | &quot;manual_review&quot;
REJECTED | &quot;rejected&quot;
VERIFIED | &quot;verified&quot;



