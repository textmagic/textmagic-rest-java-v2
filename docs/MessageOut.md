
# MessageOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Message ID. | 
**sender** | **String** | Message sender (phone number or alphanumeric Sender ID). |  [optional]
**receiver** | **String** | Recipient&#x60;s phone number. |  [optional]
**text** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) | Delivery status of the message. See [message delivery statuses](https://docs.textmagic.com/#section/Delivery-status-codes) for details.  | 
**rejectReason** | [**RejectReasonEnum**](#RejectReasonEnum) | Rejection reason. |  [optional]
**contactId** | **Integer** | Recipient contact ID. | 
**sessionId** | **Integer** | Message Session ID of a message. | 
**messageTime** | [**OffsetDateTime**](OffsetDateTime.md) | Sending time. | 
**avatar** | **String** |  | 
**deleted** | **Boolean** | Indicates that the message has been deleted. |  [optional]
**charset** | **String** | Message charset. Could be: *   **ISO-8859-1** for plaintext SMS; *   **UTF-16BE** for Unicode SMS.  | 
**charsetLabel** | **String** | Human-readable message charset label. Could be: *   **ISO-8859-1** for plaintext SMS; *   **UTF-16BE** for Unicode SMS; *   **Voice** for voice services (Text-to-Speech or Voice Broadcast) messages.  | 
**firstName** | **String** | Contact first name. Could be substituted from your [Contacts](https://docs.textmagic.com/#tag/Contacts) (even if you submitted the phone number instead of the contact ID).  | 
**lastName** | **String** | Contact last name. | 
**country** | **String** | The 2-letter ISO country code of the recipient&#39;s phone number.  | 
**phone** | **String** | Receipent&#x60;s phone number. |  [optional]
**price** | **Float** | Message price. |  [optional]
**partsCount** | **Integer** | Message parts (multiples of 160 characters) count. | 
**fromEmail** | **String** | The user email which this message came from. For Email2SMS and Distribution Lists the messages, it is an original email address - in other cases, it is an account email address. |  [optional]
**fromNumber** | **String** | The Phone number used to send the SMS. |  [optional]
**senderSource** | [**MessageOutSenderSource**](MessageOutSenderSource.md) |  |  [optional]
**session** | [**MessageOutSession**](MessageOutSession.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
Q | &quot;q&quot;
S | &quot;s&quot;
E | &quot;e&quot;
R | &quot;r&quot;
A | &quot;a&quot;
D | &quot;d&quot;
B | &quot;b&quot;
F | &quot;f&quot;
U | &quot;u&quot;
J | &quot;j&quot;
I | &quot;i&quot;
P | &quot;p&quot;
H | &quot;h&quot;


<a name="RejectReasonEnum"></a>
## Enum: RejectReasonEnum
Name | Value
---- | -----
A | &quot;a&quot;
F | &quot;f&quot;
L | &quot;l&quot;
C | &quot;c&quot;
U | &quot;u&quot;
B | &quot;b&quot;
S | &quot;s&quot;
M | &quot;m&quot;
N | &quot;n&quot;
I | &quot;i&quot;
IF | &quot;if&quot;
D | &quot;d&quot;
T | &quot;t&quot;
E | &quot;e&quot;
H | &quot;h&quot;
K | &quot;k&quot;
R | &quot;r&quot;
G | &quot;g&quot;
J | &quot;j&quot;
W | &quot;w&quot;
V | &quot;v&quot;
Q | &quot;q&quot;
X | &quot;x&quot;
O | &quot;o&quot;
P | &quot;p&quot;



