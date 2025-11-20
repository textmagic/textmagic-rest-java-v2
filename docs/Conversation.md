

# Conversation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Message type: inbound or outbound.  |  |
|**sender** | **String** | Sender phone number. |  |
|**messageTime** | **OffsetDateTime** | Time when  the message arrived at Textmagic. |  |
|**text** | **String** | Message text. |  |
|**receiver** | **String** | Receiver&#39;s phone number. |  |
|**status** | **String** | Message status (for chats outbound only). See [message delivery statuses](https://docs.textmagic.com/#section/Delivery-status-codes) for details. |  |
|**firstName** | **String** | Contact first name. |  |
|**lastName** | **String** | Contact last name. |  |
|**sessionId** | **Integer** | Session ID of a message. See [message sessions](https://docs.textmagic.com/#tag/Outbound-Message-Sessions) for details. |  |
|**initiatorId** | **Integer** | Initiator ID of a message. See [message sessions](https://docs.textmagic.com/#tag/Outbound-Message-Sessions) for details. |  [optional] |
|**messageFileId** | **Integer** | Message file id. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Message type. |  [optional] |
|**chatType** | [**ChatTypeEnum**](#ChatTypeEnum) | Chat type. |  [optional] |
|**chatId** | **Integer** | Chat id. |  [optional] |
|**isEdited** | **Boolean** |  |  [optional] |
|**errorCode** | **String** | Error code. |  [optional] |
|**files** | [**List&lt;ModelFile&gt;**](ModelFile.md) |  |  [optional] |
|**payload** | [**MessagePayload**](MessagePayload.md) |  |  [optional] |
|**avatar** | **String** |  |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| IN | &quot;in&quot; |
| OUT | &quot;out&quot; |
| O | &quot;o&quot; |
| I | &quot;i&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| IMAGE | &quot;image&quot; |
| AUDIO | &quot;audio&quot; |
| VOICE | &quot;voice&quot; |
| DOCUMENT | &quot;document&quot; |
| VIDEO | &quot;video&quot; |
| LOG | &quot;log&quot; |
| INITIAL | &quot;initial&quot; |
| NOTE | &quot;note&quot; |



## Enum: ChatTypeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| FACEBOOK_MESSENGER | &quot;facebook_messenger&quot; |
| INSTAGRAM | &quot;instagram&quot; |
| WHATSAPP_BUSINESS | &quot;whatsapp_business&quot; |
| LIVE_CHAT | &quot;live_chat&quot; |



