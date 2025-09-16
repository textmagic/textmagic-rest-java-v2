
# CreateEmailCampaignResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique campaign ID. | 
**status** | [**StatusEnum**](#StatusEnum) | Current campaign status. | 
**emailSenderId** | **Integer** | Email sender ID used for this campaign. |  [optional]
**startAt** | [**OffsetDateTime**](OffsetDateTime.md) | Campaign start timestamp. | 
**createdBy** | [**UserPersonalInfo**](UserPersonalInfo.md) |  | 
**fromName** | **String** | Sender name displayed in recipient&#39;s inbox. |  [optional]
**fromEmail** | **String** | Sender email address. | 
**replyToEmail** | **String** | Reply-to email address. | 
**subject** | **String** | Email subject line. | 
**html** | **String** | HTML email content. | 
**cost** | **Float** | Total campaign cost. | 
**totals** | [**EmailCampaignStatisticTotals**](EmailCampaignStatisticTotals.md) |  | 
**outboundEmail** | [**OutboundEmailResponse**](OutboundEmailResponse.md) |  |  [optional]
**failedReason** | [**FailedReasonEnum**](#FailedReasonEnum) | Reason for campaign failure if applicable. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
IDLE | &quot;idle&quot;
SENT | &quot;sent&quot;
IN_PROGRESS | &quot;in_progress&quot;
FAILED | &quot;failed&quot;
DELIVERED | &quot;delivered&quot;
REJECTED | &quot;rejected&quot;
ERROR | &quot;error&quot;
SCHEDULEDERROR | &quot;scheduledError&quot;


<a name="FailedReasonEnum"></a>
## Enum: FailedReasonEnum
Name | Value
---- | -----
LOWBALANCE | &quot;lowBalance&quot;
NORECIPIENTS | &quot;noRecipients&quot;
NOEMAILSENDER | &quot;noEmailSender&quot;
UNHANDLED | &quot;unhandled&quot;



