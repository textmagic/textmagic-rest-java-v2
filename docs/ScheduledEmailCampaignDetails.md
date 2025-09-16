
# ScheduledEmailCampaignDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique scheduled campaign ID. | 
**status** | [**StatusEnum**](#StatusEnum) | Current scheduled campaign status. | 
**emailSenderId** | **Integer** | Email sender ID used for this campaign. |  [optional]
**startAt** | [**OffsetDateTime**](OffsetDateTime.md) | Scheduled start timestamp (UTC). | 
**endAt** | [**OffsetDateTime**](OffsetDateTime.md) | End timestamp for recurring campaigns (UTC). |  [optional]
**nextSendAt** | [**OffsetDateTime**](OffsetDateTime.md) | Next scheduled send timestamp (UTC). |  [optional]
**createdBy** | [**UserPersonalInfo**](UserPersonalInfo.md) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Campaign creation timestamp. | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Last update timestamp. | 
**type** | [**TypeEnum**](#TypeEnum) | Campaign recurrence type. | 
**fromName** | **String** | Sender name displayed in recipient&#39;s inbox. |  [optional]
**fromEmail** | **String** | Sender email address. | 
**replyToEmail** | **String** | Reply-to email address. | 
**subject** | **String** | Email subject line. | 
**html** | **String** | HTML email content. | 
**recipientsCount** | **Integer** | Number of recipients for this campaign. | 
**sendingTimezone** | **String** | Timezone for sending the campaign. | 
**rrule** | **String** | RFC 5545 recurrence rule for recurring campaigns. |  [optional]
**occurrenceSummary** | **String** | Human-readable schedule description. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SCHEDULED | &quot;scheduled&quot;
ACTIVE | &quot;active&quot;
PAUSED | &quot;paused&quot;
COMPLETED | &quot;completed&quot;
CANCELLED | &quot;cancelled&quot;
FAILED | &quot;failed&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ONCE | &quot;once&quot;
HOURLY | &quot;hourly&quot;
DAILY | &quot;daily&quot;
WEEKLY | &quot;weekly&quot;
MONTHLY | &quot;monthly&quot;
YEARLY | &quot;yearly&quot;
FOLLOW_UP | &quot;follow-up&quot;



