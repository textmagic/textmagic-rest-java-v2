

# OutboundEmailResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Outbound email ID. |  |
|**sendTime** | **OffsetDateTime** | Email send timestamp. |  |
|**fromName** | **String** | Sender name. |  [optional] |
|**fromEmail** | **String** | Sender email address. |  |
|**replyToEmail** | **String** | Reply-to email address. |  |
|**recipientFullName** | **String** | Recipient&#39;s full name. |  [optional] |
|**recipientEmail** | **String** | Recipient&#39;s email address. |  [optional] |
|**emailSubject** | **String** | Email subject line. |  |
|**emailContent** | **String** | HTML email content. |  |
|**source** | [**SourceEnum**](#SourceEnum) | Source of the outbound email. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current email status. |  |
|**cost** | **Float** | Cost of sending this email. |  |
|**statusReason** | **String** | Detailed status reason. |  [optional] |
|**contactId** | **Integer** | Associated contact ID. |  [optional] |
|**initiatorId** | **Integer** | ID of user who initiated the email. |  |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| EMAIL_CAMPAIGN | &quot;emailCampaign&quot; |
| TICKET | &quot;ticket&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SENT | &quot;sent&quot; |
| DELIVERED | &quot;delivered&quot; |
| REJECTED | &quot;rejected&quot; |
| FAILED | &quot;failed&quot; |
| OPENED | &quot;opened&quot; |
| CLICKED | &quot;clicked&quot; |
| UNSUBSCRIBED | &quot;unsubscribed&quot; |
| SPAM | &quot;spam&quot; |



