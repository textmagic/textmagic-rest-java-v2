# TextMagicApi

All URIs are relative to *https://rest.textmagic.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignContactsToList**](TextMagicApi.md#assignContactsToList) | **PUT** /api/v2/lists/{id}/contacts | Assign contacts to a list |
| [**blockContact**](TextMagicApi.md#blockContact) | **POST** /api/v2/contacts/block | Block a contact by phone number |
| [**buyDedicatedNumber**](TextMagicApi.md#buyDedicatedNumber) | **POST** /api/v2/numbers | Buy a dedicated number |
| [**clearAndAssignContactsToList**](TextMagicApi.md#clearAndAssignContactsToList) | **POST** /api/v2/lists/{id}/contacts | Reset list members to the specified contacts |
| [**closeChatsBulk**](TextMagicApi.md#closeChatsBulk) | **POST** /api/v2/chats/close/bulk | Close chats (bulk) |
| [**closeReadChats**](TextMagicApi.md#closeReadChats) | **POST** /api/v2/chats/close/read | Close read chats |
| [**createContact**](TextMagicApi.md#createContact) | **POST** /api/v2/contacts/normalized | Add a new contact |
| [**createContactNote**](TextMagicApi.md#createContactNote) | **POST** /api/v2/contacts/{id}/notes | Create a new contact note |
| [**createCustomField**](TextMagicApi.md#createCustomField) | **POST** /api/v2/customfields | Add a new custom field |
| [**createEmailCampaign**](TextMagicApi.md#createEmailCampaign) | **POST** /api/v2/email-campaigns | Send email campaign |
| [**createList**](TextMagicApi.md#createList) | **POST** /api/v2/lists | Create a new list |
| [**createTag**](TextMagicApi.md#createTag) | **POST** /api/v2/tags | Create tag |
| [**createTemplate**](TextMagicApi.md#createTemplate) | **POST** /api/v2/templates | Create a template |
| [**deleteAllContacts**](TextMagicApi.md#deleteAllContacts) | **DELETE** /api/v2/contact/all | Delete contacts (bulk) |
| [**deleteAllOutboundMessages**](TextMagicApi.md#deleteAllOutboundMessages) | **DELETE** /api/v2/message/all | Delete all messages |
| [**deleteAvatar**](TextMagicApi.md#deleteAvatar) | **DELETE** /api/v2/user/avatar | Delete an avatar |
| [**deleteChatMessages**](TextMagicApi.md#deleteChatMessages) | **POST** /api/v2/chats/{id}/messages/delete | Delete chat messages by ID(s) |
| [**deleteChatsBulk**](TextMagicApi.md#deleteChatsBulk) | **POST** /api/v2/chats/delete | Delete chats (bulk) |
| [**deleteContact**](TextMagicApi.md#deleteContact) | **DELETE** /api/v2/contacts/{id} | Delete a contact |
| [**deleteContactAvatar**](TextMagicApi.md#deleteContactAvatar) | **DELETE** /api/v2/contacts/{id}/avatar | Delete an avatar |
| [**deleteContactNote**](TextMagicApi.md#deleteContactNote) | **DELETE** /api/v2/notes/{id} | Delete a contact note |
| [**deleteContactNotesBulk**](TextMagicApi.md#deleteContactNotesBulk) | **POST** /api/v2/contacts/{id}/notes/delete | Delete contact notes (bulk) |
| [**deleteContactsByIds**](TextMagicApi.md#deleteContactsByIds) | **POST** /api/v2/contacts/delete | Delete contacts by IDs (bulk) |
| [**deleteContactsFromList**](TextMagicApi.md#deleteContactsFromList) | **DELETE** /api/v2/lists/{id}/contacts | Unassign contacts from a list |
| [**deleteCustomField**](TextMagicApi.md#deleteCustomField) | **DELETE** /api/v2/customfields/{id} | Delete a custom field |
| [**deleteDedicatedNumber**](TextMagicApi.md#deleteDedicatedNumber) | **DELETE** /api/v2/numbers/{id} | Cancel a dedicated number subscription |
| [**deleteInboundMessage**](TextMagicApi.md#deleteInboundMessage) | **DELETE** /api/v2/replies/{id} | Delete a single inbound message |
| [**deleteInboundMessagesBulk**](TextMagicApi.md#deleteInboundMessagesBulk) | **POST** /api/v2/replies/delete | Delete inbound messages (bulk) |
| [**deleteList**](TextMagicApi.md#deleteList) | **DELETE** /api/v2/lists/{id} | Delete a list |
| [**deleteListAvatar**](TextMagicApi.md#deleteListAvatar) | **DELETE** /api/v2/lists/{id}/avatar | Delete an avatar for a list |
| [**deleteListContactsBulk**](TextMagicApi.md#deleteListContactsBulk) | **POST** /api/v2/lists/{id}/contacts/delete | Delete contacts from a list (bulk) |
| [**deleteListsBulk**](TextMagicApi.md#deleteListsBulk) | **POST** /api/v2/lists/delete | Delete lists (bulk) |
| [**deleteMessageSession**](TextMagicApi.md#deleteMessageSession) | **DELETE** /api/v2/sessions/{id} | Delete a session |
| [**deleteMessageSessionsBulk**](TextMagicApi.md#deleteMessageSessionsBulk) | **POST** /api/v2/sessions/delete | Delete sessions (bulk) |
| [**deleteOutboundMessage**](TextMagicApi.md#deleteOutboundMessage) | **DELETE** /api/v2/messages/{id} | Delete message |
| [**deleteOutboundMessagesBulk**](TextMagicApi.md#deleteOutboundMessagesBulk) | **POST** /api/v2/messages/delete | Delete messages (bulk) |
| [**deleteScheduledMessage**](TextMagicApi.md#deleteScheduledMessage) | **DELETE** /api/v2/schedules/{id} | Delete a single scheduled message |
| [**deleteScheduledMessagesBulk**](TextMagicApi.md#deleteScheduledMessagesBulk) | **POST** /api/v2/schedules/delete | Delete scheduled messages (bulk) |
| [**deleteSenderId**](TextMagicApi.md#deleteSenderId) | **DELETE** /api/v2/senderids/{id} | Delete a Sender ID |
| [**deleteTemplate**](TextMagicApi.md#deleteTemplate) | **DELETE** /api/v2/templates/{id} | Delete a template |
| [**deleteTemplatesBulk**](TextMagicApi.md#deleteTemplatesBulk) | **POST** /api/v2/templates/delete | Delete templates (bulk) |
| [**doCarrierLookup**](TextMagicApi.md#doCarrierLookup) | **GET** /api/v2/lookups/{phone} | Carrier Lookup |
| [**doEmailLookup**](TextMagicApi.md#doEmailLookup) | **GET** /api/v2/email-lookups/{email} | Email Lookup |
| [**getAllBulkSessions**](TextMagicApi.md#getAllBulkSessions) | **GET** /api/v2/bulks | Get all bulk sessions |
| [**getAllChats**](TextMagicApi.md#getAllChats) | **GET** /api/v2/chats | Get all chats |
| [**getAllInboundMessages**](TextMagicApi.md#getAllInboundMessages) | **GET** /api/v2/replies | Get all inbound messages |
| [**getAllMessageSessions**](TextMagicApi.md#getAllMessageSessions) | **GET** /api/v2/sessions | Get all sessions |
| [**getAllOutboundMessages**](TextMagicApi.md#getAllOutboundMessages) | **GET** /api/v2/messages | Get all messages |
| [**getAllScheduledMessages**](TextMagicApi.md#getAllScheduledMessages) | **GET** /api/v2/schedules | Get all scheduled messages |
| [**getAllTemplates**](TextMagicApi.md#getAllTemplates) | **GET** /api/v2/templates | Get all templates |
| [**getAvailableDedicatedNumbers**](TextMagicApi.md#getAvailableDedicatedNumbers) | **GET** /api/v2/numbers/available | Find dedicated numbers available for purchase |
| [**getAvailableSenderSettingOptions**](TextMagicApi.md#getAvailableSenderSettingOptions) | **GET** /api/v2/sources | Get available sender settings |
| [**getBalanceNotificationOptions**](TextMagicApi.md#getBalanceNotificationOptions) | **GET** /api/v2/user/notification/balance/bundles | Returns the list of available balance options which can be used as a bound to determine when to send email to user with low balance notification. See https://my.textmagic.com/online/account/notifications/balance |
| [**getBalanceNotificationSettings**](TextMagicApi.md#getBalanceNotificationSettings) | **GET** /api/v2/user/notification/balance | Get balance notification settings |
| [**getBlockedContacts**](TextMagicApi.md#getBlockedContacts) | **GET** /api/v2/contacts/block/list | Get blocked contacts |
| [**getBulkSession**](TextMagicApi.md#getBulkSession) | **GET** /api/v2/bulks/{id} | Get bulk session status |
| [**getCallbackSettings**](TextMagicApi.md#getCallbackSettings) | **GET** /api/v2/callback/settings | Fetch callback URL settings |
| [**getChat**](TextMagicApi.md#getChat) | **GET** /api/v2/chats/{id} | Get a single chat |
| [**getChatByPhone**](TextMagicApi.md#getChatByPhone) | **GET** /api/v2/chats/{phone}/by/phone | Find chats by phone |
| [**getChatMessages**](TextMagicApi.md#getChatMessages) | **GET** /api/v2/chats/{id}/message | Get chat messages |
| [**getContact**](TextMagicApi.md#getContact) | **GET** /api/v2/contacts/{id} | Get the details of a specific contact |
| [**getContactByPhone**](TextMagicApi.md#getContactByPhone) | **GET** /api/v2/contacts/phone/{phone} | Get the details of a specific contact by phone number |
| [**getContactIfBlocked**](TextMagicApi.md#getContactIfBlocked) | **GET** /api/v2/contacts/block/phone | Check if a phone number is blocked |
| [**getContactImportSessionProgress**](TextMagicApi.md#getContactImportSessionProgress) | **GET** /api/v2/contacts/import/progress/{id} | Check import progress |
| [**getContactNote**](TextMagicApi.md#getContactNote) | **GET** /api/v2/notes/{id} | Get a contact note |
| [**getContactNotes**](TextMagicApi.md#getContactNotes) | **GET** /api/v2/contacts/{id}/notes | Fetch notes assigned to a given contact |
| [**getContacts**](TextMagicApi.md#getContacts) | **GET** /api/v2/contacts | Get all contacts |
| [**getContactsAutocomplete**](TextMagicApi.md#getContactsAutocomplete) | **GET** /api/v2/contacts/autocomplete | Get contacts autocomplete suggestions |
| [**getContactsByListId**](TextMagicApi.md#getContactsByListId) | **GET** /api/v2/lists/{id}/contacts | Get all contacts in a list |
| [**getCountries**](TextMagicApi.md#getCountries) | **GET** /api/v2/countries | Get countries |
| [**getCurrentUser**](TextMagicApi.md#getCurrentUser) | **GET** /api/v2/user | Get current account information |
| [**getCustomField**](TextMagicApi.md#getCustomField) | **GET** /api/v2/customfields/{id} | Get the details of a specific custom field |
| [**getCustomFields**](TextMagicApi.md#getCustomFields) | **GET** /api/v2/customfields | Get all custom fields |
| [**getDedicatedNumber**](TextMagicApi.md#getDedicatedNumber) | **GET** /api/v2/numbers/{id} | Get the details of a specific dedicated number |
| [**getEmailSenders**](TextMagicApi.md#getEmailSenders) | **GET** /api/v2/email-campaigns/email-senders | Get list of email senders |
| [**getFavorites**](TextMagicApi.md#getFavorites) | **GET** /api/v2/contacts/favorite | Get favorite contacts and lists |
| [**getInboundMessage**](TextMagicApi.md#getInboundMessage) | **GET** /api/v2/replies/{id} | Get a single inbound message |
| [**getInboundMessagesNotificationSettings**](TextMagicApi.md#getInboundMessagesNotificationSettings) | **GET** /api/v2/user/notification/inbound | Get inbound messages notification settings |
| [**getInvoices**](TextMagicApi.md#getInvoices) | **GET** /api/v2/invoices | Get all invoices |
| [**getList**](TextMagicApi.md#getList) | **GET** /api/v2/lists/{id} | Get the details of a specific list |
| [**getListContactsIds**](TextMagicApi.md#getListContactsIds) | **GET** /api/v2/lists/{id}/contacts/ids | Get all contact IDs in a list |
| [**getLists**](TextMagicApi.md#getLists) | **GET** /api/v2/lists | Get all lists |
| [**getListsOfContact**](TextMagicApi.md#getListsOfContact) | **GET** /api/v2/contacts/{id}/lists | Get a contact&#39;s lists |
| [**getMessagePreview**](TextMagicApi.md#getMessagePreview) | **GET** /api/v2/messages/preview | Preview message |
| [**getMessagePrice**](TextMagicApi.md#getMessagePrice) | **GET** /api/v2/messages/price/normalized | Check message price |
| [**getMessageSession**](TextMagicApi.md#getMessageSession) | **GET** /api/v2/sessions/{id} | Get a session&#x60;s details |
| [**getMessageSessionStat**](TextMagicApi.md#getMessageSessionStat) | **GET** /api/v2/sessions/{id}/stat | Get a session&#x60;s statistics |
| [**getMessagesBySessionId**](TextMagicApi.md#getMessagesBySessionId) | **GET** /api/v2/sessions/{id}/messages | Get a session&#x60;s messages |
| [**getMessagingCounters**](TextMagicApi.md#getMessagingCounters) | **GET** /api/v2/stats/messaging/data | Get sent/received messages counters values |
| [**getMessagingStat**](TextMagicApi.md#getMessagingStat) | **GET** /api/v2/stats/messaging | Get messaging statistics |
| [**getOutboundMessage**](TextMagicApi.md#getOutboundMessage) | **GET** /api/v2/messages/{id} | Get a single message |
| [**getOutboundMessagesHistory**](TextMagicApi.md#getOutboundMessagesHistory) | **GET** /api/v2/history | Get history |
| [**getScheduledMessage**](TextMagicApi.md#getScheduledMessage) | **GET** /api/v2/schedules/{id} | Get a single scheduled message |
| [**getSenderId**](TextMagicApi.md#getSenderId) | **GET** /api/v2/senderids/{id} | Get the details of a specific Sender ID |
| [**getSenderIds**](TextMagicApi.md#getSenderIds) | **GET** /api/v2/senderids | Get all your approved Sender IDs |
| [**getSenderSettings**](TextMagicApi.md#getSenderSettings) | **GET** /api/v2/sender/settings/normalized | Get current sender settings |
| [**getSpendingStat**](TextMagicApi.md#getSpendingStat) | **GET** /api/v2/stats/spending | Get spending statistics |
| [**getTemplate**](TextMagicApi.md#getTemplate) | **GET** /api/v2/templates/{id} | Get a template&#x60;s details |
| [**getTimezones**](TextMagicApi.md#getTimezones) | **GET** /api/v2/timezones | Get timezones |
| [**getUnreadMessagesTotal**](TextMagicApi.md#getUnreadMessagesTotal) | **GET** /api/v2/chats/unread/count | Get unread messages number |
| [**getUnsubscribedContact**](TextMagicApi.md#getUnsubscribedContact) | **GET** /api/v2/unsubscribers/{id} | Get the details of a specific unsubscribed contact |
| [**getUnsubscribers**](TextMagicApi.md#getUnsubscribers) | **GET** /api/v2/unsubscribers | Get all unsubscribed contacts |
| [**getUserDedicatedNumbers**](TextMagicApi.md#getUserDedicatedNumbers) | **GET** /api/v2/numbers | Get all your dedicated numbers |
| [**importContacts**](TextMagicApi.md#importContacts) | **POST** /api/v2/contacts/import/normalized | Import contacts |
| [**markChatsReadBulk**](TextMagicApi.md#markChatsReadBulk) | **POST** /api/v2/chats/read/bulk | Mark chats as read (bulk) |
| [**markChatsUnreadBulk**](TextMagicApi.md#markChatsUnreadBulk) | **POST** /api/v2/chats/unread/bulk | Mark chats as unread (bulk) |
| [**muteChat**](TextMagicApi.md#muteChat) | **POST** /api/v2/chats/mute | Mute chat sounds |
| [**muteChatsBulk**](TextMagicApi.md#muteChatsBulk) | **POST** /api/v2/chats/mute/bulk | Mute chats (bulk) |
| [**ping**](TextMagicApi.md#ping) | **GET** /api/v2/ping | Ping |
| [**reopenChatsBulk**](TextMagicApi.md#reopenChatsBulk) | **POST** /api/v2/chats/reopen/bulk | Reopen chats (bulk) |
| [**requestSenderId**](TextMagicApi.md#requestSenderId) | **POST** /api/v2/senderids | Apply for a new Sender ID |
| [**scheduleEmailCampaign**](TextMagicApi.md#scheduleEmailCampaign) | **POST** /api/v2/email-campaigns/schedule | Schedule new email campaign |
| [**searchChats**](TextMagicApi.md#searchChats) | **GET** /api/v2/chats/search | Find chats by message text |
| [**searchChatsByIds**](TextMagicApi.md#searchChatsByIds) | **GET** /api/v2/chats/search/ids | Find chats (bulk) |
| [**searchChatsByReceipent**](TextMagicApi.md#searchChatsByReceipent) | **GET** /api/v2/chats/search/recipients | Find chats by recipient |
| [**searchContacts**](TextMagicApi.md#searchContacts) | **GET** /api/v2/contacts/search | Find contacts by given criteria |
| [**searchInboundMessages**](TextMagicApi.md#searchInboundMessages) | **GET** /api/v2/replies/search | Find inbound messages |
| [**searchLists**](TextMagicApi.md#searchLists) | **GET** /api/v2/lists/search | Find lists by given criteria |
| [**searchOutboundMessages**](TextMagicApi.md#searchOutboundMessages) | **GET** /api/v2/messages/search | Find messages |
| [**searchScheduledMessages**](TextMagicApi.md#searchScheduledMessages) | **GET** /api/v2/schedules/search | Find scheduled messages |
| [**searchTemplates**](TextMagicApi.md#searchTemplates) | **GET** /api/v2/templates/search | Find templates by criteria |
| [**sendMessage**](TextMagicApi.md#sendMessage) | **POST** /api/v2/messages | Send message |
| [**setChatStatus**](TextMagicApi.md#setChatStatus) | **POST** /api/v2/chats/status | Change chat status |
| [**unblockContact**](TextMagicApi.md#unblockContact) | **POST** /api/v2/contacts/unblock | Unblock a contact by phone number |
| [**unblockContactsBulk**](TextMagicApi.md#unblockContactsBulk) | **POST** /api/v2/contacts/unblock/bulk | Unblock contacts (bulk) |
| [**unmuteChatsBulk**](TextMagicApi.md#unmuteChatsBulk) | **POST** /api/v2/chats/unmute/bulk | Unmute chats (bulk) |
| [**unsubscribeContact**](TextMagicApi.md#unsubscribeContact) | **POST** /api/v2/unsubscribers | Manually unsubscribe a contact |
| [**updateBalanceNotificationSettings**](TextMagicApi.md#updateBalanceNotificationSettings) | **PUT** /api/v2/user/notification/balance | Update balance notification settings |
| [**updateCallbackSettings**](TextMagicApi.md#updateCallbackSettings) | **PUT** /api/v2/callback/settings | Update callback URL settings |
| [**updateChatDesktopNotificationSettings**](TextMagicApi.md#updateChatDesktopNotificationSettings) | **PUT** /api/v2/user/desktop/notification | Update chat desktop notification settings |
| [**updateContact**](TextMagicApi.md#updateContact) | **PUT** /api/v2/contacts/{id}/normalized | Edit a contact |
| [**updateContactNote**](TextMagicApi.md#updateContactNote) | **PUT** /api/v2/notes/{id} | Update a contact note |
| [**updateCurrentUser**](TextMagicApi.md#updateCurrentUser) | **PUT** /api/v2/user | Edit current account info |
| [**updateCustomField**](TextMagicApi.md#updateCustomField) | **PUT** /api/v2/customfields/{id} | Edit a custom field |
| [**updateCustomFieldValue**](TextMagicApi.md#updateCustomFieldValue) | **PUT** /api/v2/customfields/{id}/update | Edit the custom field value of a specified contact |
| [**updateInboundMessagesNotificationSettings**](TextMagicApi.md#updateInboundMessagesNotificationSettings) | **PUT** /api/v2/user/notification/inbound | Update inbound messages notification settings |
| [**updateList**](TextMagicApi.md#updateList) | **PUT** /api/v2/lists/{id} | Edit a list |
| [**updateSenderSetting**](TextMagicApi.md#updateSenderSetting) | **PUT** /api/v2/sender/settings | Change sender settings |
| [**updateTemplate**](TextMagicApi.md#updateTemplate) | **PUT** /api/v2/templates/{id} | Update a template |
| [**uploadAvatar**](TextMagicApi.md#uploadAvatar) | **POST** /api/v2/user/avatar | Upload an avatar |
| [**uploadContactAvatar**](TextMagicApi.md#uploadContactAvatar) | **POST** /api/v2/contacts/{id}/avatar | Upload an avatar |
| [**uploadListAvatar**](TextMagicApi.md#uploadListAvatar) | **POST** /api/v2/lists/{id}/avatar | Add an avatar for a list |
| [**uploadMessageAttachment**](TextMagicApi.md#uploadMessageAttachment) | **POST** /api/v2/messages/attachment | Upload message attachment |
| [**uploadMessageMMSAttachment**](TextMagicApi.md#uploadMessageMMSAttachment) | **POST** /api/v2/messages/mms/attachment | Upload message mms attachment |


<a id="assignContactsToList"></a>
# **assignContactsToList**
> ResourceLinkResponse assignContactsToList(id, assignContactsToListInputObject)

Assign contacts to a list

&gt; Unlike all other PUT requests, this command does not need old contact IDs to be submitted. For example, if you have a list with contacts 150, 151 and 152 and you want to add contact ID 153, you only need to submit 153 as a parameter of PUT /api/v2/lists/{id}/contacts. 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    AssignContactsToListRequest assignContactsToListInputObject = new AssignContactsToListRequest(); // AssignContactsToListRequest | 
    try {
      ResourceLinkResponse result = apiInstance.assignContactsToList(id, assignContactsToListInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#assignContactsToList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **assignContactsToListInputObject** | [**AssignContactsToListRequest**](AssignContactsToListRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to edit a list shared to the current user. |  -  |
| **404** | Request data not found. |  -  |

<a id="blockContact"></a>
# **blockContact**
> ResourceLinkResponse blockContact(blockContactInputObject)

Block a contact by phone number

Block a contact from inbound and outbound communication by phone number.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    BlockContactRequest blockContactInputObject = new BlockContactRequest(); // BlockContactRequest | 
    try {
      ResourceLinkResponse result = apiInstance.blockContact(blockContactInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#blockContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blockContactInputObject** | [**BlockContactRequest**](BlockContactRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when updated with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="buyDedicatedNumber"></a>
# **buyDedicatedNumber**
> buyDedicatedNumber(buyDedicatedNumberInputObject)

Buy a dedicated number

To buy a dedicated number, you first need to find an available number matching your criteria using the &#x60;/api/v2/numbers/available&#x60; command described above.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    BuyDedicatedNumberRequest buyDedicatedNumberInputObject = new BuyDedicatedNumberRequest(); // BuyDedicatedNumberRequest | 
    try {
      apiInstance.buyDedicatedNumber(buyDedicatedNumberInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#buyDedicatedNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **buyDedicatedNumberInputObject** | [**BuyDedicatedNumberRequest**](BuyDedicatedNumberRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Number has been bought with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="clearAndAssignContactsToList"></a>
# **clearAndAssignContactsToList**
> ResourceLinkResponse clearAndAssignContactsToList(id, clearAndAssignContactsToListInputObject)

Reset list members to the specified contacts

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    ClearAndAssignContactsToListRequest clearAndAssignContactsToListInputObject = new ClearAndAssignContactsToListRequest(); // ClearAndAssignContactsToListRequest | 
    try {
      ResourceLinkResponse result = apiInstance.clearAndAssignContactsToList(id, clearAndAssignContactsToListInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#clearAndAssignContactsToList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **clearAndAssignContactsToListInputObject** | [**ClearAndAssignContactsToListRequest**](ClearAndAssignContactsToListRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to edit a list shared to the current user. |  -  |
| **404** | Request data not found. |  -  |

<a id="closeChatsBulk"></a>
# **closeChatsBulk**
> closeChatsBulk(closeChatsBulkInputObject)

Close chats (bulk)

Close chats by chat IDs or close all chats

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    MarkChatsUnreadBulkRequest closeChatsBulkInputObject = new MarkChatsUnreadBulkRequest(); // MarkChatsUnreadBulkRequest | 
    try {
      apiInstance.closeChatsBulk(closeChatsBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#closeChatsBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **closeChatsBulkInputObject** | [**MarkChatsUnreadBulkRequest**](MarkChatsUnreadBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="closeReadChats"></a>
# **closeReadChats**
> closeReadChats()

Close read chats

Close all chats that have no unread messages.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      apiInstance.closeReadChats();
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#closeReadChats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="createContact"></a>
# **createContact**
> ResourceLinkResponse createContact(createContactInputObject)

Add a new contact

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    CreateContactRequest createContactInputObject = new CreateContactRequest(); // CreateContactRequest | 
    try {
      ResourceLinkResponse result = apiInstance.createContact(createContactInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#createContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createContactInputObject** | [**CreateContactRequest**](CreateContactRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Contact has been created with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="createContactNote"></a>
# **createContactNote**
> ResourceLinkResponse createContactNote(id, createContactNoteInputObject)

Create a new contact note

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    CreateContactNoteRequest createContactNoteInputObject = new CreateContactNoteRequest(); // CreateContactNoteRequest | 
    try {
      ResourceLinkResponse result = apiInstance.createContactNote(id, createContactNoteInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#createContactNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **createContactNoteInputObject** | [**CreateContactNoteRequest**](CreateContactNoteRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when created with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="createCustomField"></a>
# **createCustomField**
> ResourceLinkResponse createCustomField(createCustomFieldInputObject)

Add a new custom field

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    CreateCustomFieldRequest createCustomFieldInputObject = new CreateCustomFieldRequest(); // CreateCustomFieldRequest | 
    try {
      ResourceLinkResponse result = apiInstance.createCustomField(createCustomFieldInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#createCustomField");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createCustomFieldInputObject** | [**CreateCustomFieldRequest**](CreateCustomFieldRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Contact has been created with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="createEmailCampaign"></a>
# **createEmailCampaign**
> CreateEmailCampaignResponse createEmailCampaign(createEmailCampaignInputObject)

Send email campaign

Creates a new email campaign and sends it to the specified recipients.  This endpoint allows you to create and immediately send an email marketing campaign to your contacts, groups, or direct email addresses. The campaign will be processed asynchronously, and you&#39;ll receive a campaign object with tracking information.  ## Request Requirements  - **Email Sender ID**: Must be a valid, configured email sender from your account - **Recipients**: At least one recipient type must be specified (contacts, groups, or emails) - **Content**: Subject and HTML message content are required - **Balance**: Sufficient account balance for the estimated campaign cost  ## Recipient Types  You can target multiple recipient types in a single campaign:  - **Contact IDs**: Send to specific contacts from your contact list - **Group IDs**: Send to all contacts within specified groups   - **Direct Emails**: Send to email addresses not in your contact list  ## Content Guidelines  - **Subject**: Maximum 998 characters, should be engaging and relevant - **Message**: HTML content supported, including images, links, and formatting - **From Name**: Optional custom sender name (max 500 characters) - **Reply-To**: Optional custom reply-to email address  ## Cost and Balance  The API automatically calculates campaign costs based on: - Total number of unique recipients across all specified groups, contacts, and emails - Your account&#39;s email pricing tier - Any additional features or premium content  If your account balance is insufficient, the request will be rejected with a low balance error.  ## Response Information  Successful campaigns return: - Campaign ID for tracking and analytics - Current campaign status and progress - Cost breakdown and recipient counts - Sender information and content preview - Statistical totals and engagement metrics  ## Error Scenarios  Common error conditions include: - **Validation Errors**: Invalid email addresses, missing required fields, or content that exceeds limits - **Insufficient Balance**: Account balance too low for campaign cost - **Invalid Recipients**: Non-existent contact/group IDs or invalid email formats - **Sender Configuration**: Invalid or unconfigured email sender ID - **No Recipients**: All recipient arrays are empty or invalid 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    CreateEmailCampaignRequest createEmailCampaignInputObject = new CreateEmailCampaignRequest(); // CreateEmailCampaignRequest | 
    try {
      CreateEmailCampaignResponse result = apiInstance.createEmailCampaign(createEmailCampaignInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#createEmailCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEmailCampaignInputObject** | [**CreateEmailCampaignRequest**](CreateEmailCampaignRequest.md)|  | |

### Return type

[**CreateEmailCampaignResponse**](CreateEmailCampaignResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Email campaign created successfully. |  -  |
| **400** | Bad request - validation errors or insufficient balance. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Forbidden - insufficient permissions (requires ComposeEmail access). |  -  |

<a id="createList"></a>
# **createList**
> ResourceLinkResponse createList(createListInputObject)

Create a new list

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    CreateListRequest createListInputObject = new CreateListRequest(); // CreateListRequest | 
    try {
      ResourceLinkResponse result = apiInstance.createList(createListInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#createList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createListInputObject** | [**CreateListRequest**](CreateListRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="createTag"></a>
# **createTag**
> CreateTagResponse createTag(createTagInputObject)

Create tag

Creates a new tag for organizing and categorizing contacts.  This endpoint allows you to create a custom tag that can be used to segment and organize your contact database. Tags provide a flexible way to categorize contacts for better contact management.  ## Request Requirements  - **Title**: Required field, must be between 1 and 50 characters - **Uniqueness**: Tag titles must be unique within your account - **Authentication**: Valid API credentials required  ## Common Use Cases  Create tags for various organizational purposes:  - **Customer Types**: \&quot;VIP Customer\&quot;, \&quot;New Lead\&quot;, \&quot;Active Subscriber\&quot; - **Geographic Segments**: \&quot;North Region\&quot;, \&quot;Europe\&quot;, \&quot;Local Customers\&quot; - **Engagement Levels**: \&quot;Highly Engaged\&quot;, \&quot;Inactive\&quot;, \&quot;Recent Purchase\&quot; - **Campaign Categories**: \&quot;Summer Promotion\&quot;, \&quot;Newsletter Subscriber\&quot;, \&quot;Event Attendee\&quot; - **Custom Segments**: Any custom categorization that fits your business needs  ## Response Information  Successful tag creation returns: - **Tag ID**: Unique identifier for the newly created tag - **Title**: The tag name as provided in the request  Use the returned tag ID to assign this tag to contacts or reference it in other API operations.  ## Error Scenarios  Common error conditions include: - **Validation Errors**: Title exceeds 50 characters or is empty - **Duplicate Tag**: A tag with the same title already exists in your account - **Authentication Errors**: Invalid or missing API credentials  ## Next Steps  After creating a tag: 1. Use the tag ID to assign it to contacts via contact management endpoints 2. Reference the tag when filtering contacts 3. Manage and update tags through other Tags API endpoints 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    CreateTagRequest createTagInputObject = new CreateTagRequest(); // CreateTagRequest | 
    try {
      CreateTagResponse result = apiInstance.createTag(createTagInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#createTag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createTagInputObject** | [**CreateTagRequest**](CreateTagRequest.md)|  | |

### Return type

[**CreateTagResponse**](CreateTagResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Tag created successfully. |  -  |
| **400** | Bad request - validation errors (e.g. invalid title format or tag already exists). |  -  |
| **401** | Unauthorized request. |  -  |

<a id="createTemplate"></a>
# **createTemplate**
> ResourceLinkResponse createTemplate(createTemplateInputObject)

Create a template

There are times when creating a new template makes sense (such as when targeting specific clients or improving your business strategies).  You can create new SMS templates for marketing purposes or SMS templates for business campaigns. 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    CreateTemplateRequest createTemplateInputObject = new CreateTemplateRequest(); // CreateTemplateRequest | 
    try {
      ResourceLinkResponse result = apiInstance.createTemplate(createTemplateInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#createTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createTemplateInputObject** | [**CreateTemplateRequest**](CreateTemplateRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Returned when the form has errors. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="deleteAllContacts"></a>
# **deleteAllContacts**
> deleteAllContacts()

Delete contacts (bulk)

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      apiInstance.deleteAllContacts();
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteAllContacts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |

<a id="deleteAllOutboundMessages"></a>
# **deleteAllOutboundMessages**
> deleteAllOutboundMessages()

Delete all messages

Delete all messages.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      apiInstance.deleteAllOutboundMessages();
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteAllOutboundMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="deleteAvatar"></a>
# **deleteAvatar**
> deleteAvatar()

Delete an avatar

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      apiInstance.deleteAvatar();
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteAvatar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Avatar deleted with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="deleteChatMessages"></a>
# **deleteChatMessages**
> deleteChatMessages(id, deleteChatMessagesBulkInputObject)

Delete chat messages by ID(s)

Delete messages from chat by given message IDs.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    DeleteChatMessagesRequest deleteChatMessagesBulkInputObject = new DeleteChatMessagesRequest(); // DeleteChatMessagesRequest | 
    try {
      apiInstance.deleteChatMessages(id, deleteChatMessagesBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteChatMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **deleteChatMessagesBulkInputObject** | [**DeleteChatMessagesRequest**](DeleteChatMessagesRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="deleteChatsBulk"></a>
# **deleteChatsBulk**
> deleteChatsBulk(deleteChatsBulkInputObject)

Delete chats (bulk)

Delete chats by given IDs or delete all chats.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    DeleteChatsBulkRequest deleteChatsBulkInputObject = new DeleteChatsBulkRequest(); // DeleteChatsBulkRequest | 
    try {
      apiInstance.deleteChatsBulk(deleteChatsBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteChatsBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteChatsBulkInputObject** | [**DeleteChatsBulkRequest**](DeleteChatsBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="deleteContact"></a>
# **deleteContact**
> deleteContact(id)

Delete a contact

&gt; This command removes your contact completely. If it was assigned or saved to a shared list, it will disappear from there too. If you only need to remove a contact from selected lists, use the Contact assignment command in the Lists section instead, rather than deleting the contact. 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteContact(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to delete a contact shared to a current user. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteContactAvatar"></a>
# **deleteContactAvatar**
> deleteContactAvatar(id)

Delete an avatar

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteContactAvatar(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteContactAvatar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to delete a contact shared to a current user. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteContactNote"></a>
# **deleteContactNote**
> deleteContactNote(id)

Delete a contact note

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteContactNote(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteContactNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteContactNotesBulk"></a>
# **deleteContactNotesBulk**
> deleteContactNotesBulk(id, deleteContactNotesBulkInputObject)

Delete contact notes (bulk)

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    DeleteContactNotesBulkRequest deleteContactNotesBulkInputObject = new DeleteContactNotesBulkRequest(); // DeleteContactNotesBulkRequest | 
    try {
      apiInstance.deleteContactNotesBulk(id, deleteContactNotesBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteContactNotesBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **deleteContactNotesBulkInputObject** | [**DeleteContactNotesBulkRequest**](DeleteContactNotesBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteContactsByIds"></a>
# **deleteContactsByIds**
> deleteContactsByIds(deleteContactsByIdsInputObject)

Delete contacts by IDs (bulk)

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    DeleteContactsByIdsRequest deleteContactsByIdsInputObject = new DeleteContactsByIdsRequest(); // DeleteContactsByIdsRequest | 
    try {
      apiInstance.deleteContactsByIds(deleteContactsByIdsInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteContactsByIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteContactsByIdsInputObject** | [**DeleteContactsByIdsRequest**](DeleteContactsByIdsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteContactsFromList"></a>
# **deleteContactsFromList**
> deleteContactsFromList(id, deleteContacsFromListObject)

Unassign contacts from a list

&gt; When you remove contacts from a specific list, they will be deleted permanently, unless they are first saved in another list. 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    DeleteContactsFromListRequest deleteContacsFromListObject = new DeleteContactsFromListRequest(); // DeleteContactsFromListRequest | 
    try {
      apiInstance.deleteContactsFromList(id, deleteContacsFromListObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteContactsFromList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **deleteContacsFromListObject** | [**DeleteContactsFromListRequest**](DeleteContactsFromListRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to edit a list shared to the current user. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteCustomField"></a>
# **deleteCustomField**
> deleteCustomField(id)

Delete a custom field

&gt; When a custom field is deleted, all the information that was added to contacts under this custom field will also be lost. 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteCustomField(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteCustomField");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned when deleted with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteDedicatedNumber"></a>
# **deleteDedicatedNumber**
> deleteDedicatedNumber(id)

Cancel a dedicated number subscription

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteDedicatedNumber(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteDedicatedNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The Dedicated number has been deleted with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteInboundMessage"></a>
# **deleteInboundMessage**
> deleteInboundMessage(id)

Delete a single inbound message

&gt; Note: deleted inbound messages will disappear from TextMagic Online, chats, and any other place they are referenced.  So, be careful! 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | The unique numeric ID for the inbound message.
    try {
      apiInstance.deleteInboundMessage(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteInboundMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The unique numeric ID for the inbound message. | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteInboundMessagesBulk"></a>
# **deleteInboundMessagesBulk**
> deleteInboundMessagesBulk(deleteInboundMessagesBulkInputObject)

Delete inbound messages (bulk)

&gt; Note: deleted inbound messages will disappear from TextMagic Online, chats, and any other place they are referenced.  So, be careful! 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    DeleteListsBulkRequest deleteInboundMessagesBulkInputObject = new DeleteListsBulkRequest(); // DeleteListsBulkRequest | 
    try {
      apiInstance.deleteInboundMessagesBulk(deleteInboundMessagesBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteInboundMessagesBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteInboundMessagesBulkInputObject** | [**DeleteListsBulkRequest**](DeleteListsBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteList"></a>
# **deleteList**
> deleteList(id)

Delete a list

This command has no parameters. If successful, this command will return the standard delete response (204 No Content); otherwise, a standard error response will be returned.  When you delete a list, the contacts in it are deleted as well, unless they were saved in another list.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteList(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Returned when trying to remove a list associated with a signup form. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to remove a list shared to you. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteListAvatar"></a>
# **deleteListAvatar**
> deleteListAvatar(id)

Delete an avatar for a list

Delete an avatar for a list

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteListAvatar(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteListAvatar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Avatar has been deleted with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to edit a list shared to the current user. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteListContactsBulk"></a>
# **deleteListContactsBulk**
> deleteListContactsBulk(id, deleteListContactsBulkInputObject)

Delete contacts from a list (bulk)

Delete contacts from a list (bulk)

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    UnblockContactsBulkRequest deleteListContactsBulkInputObject = new UnblockContactsBulkRequest(); // UnblockContactsBulkRequest | 
    try {
      apiInstance.deleteListContactsBulk(id, deleteListContactsBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteListContactsBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **deleteListContactsBulkInputObject** | [**UnblockContactsBulkRequest**](UnblockContactsBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteListsBulk"></a>
# **deleteListsBulk**
> deleteListsBulk(deleteListsBulkInputObject)

Delete lists (bulk)

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    DeleteListsBulkRequest deleteListsBulkInputObject = new DeleteListsBulkRequest(); // DeleteListsBulkRequest | 
    try {
      apiInstance.deleteListsBulk(deleteListsBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteListsBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteListsBulkInputObject** | [**DeleteListsBulkRequest**](DeleteListsBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteMessageSession"></a>
# **deleteMessageSession**
> deleteMessageSession(id)

Delete a session

Delete a message session, together with all nested messages. &gt; You will not be refunded for any deleted sent sessions. 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteMessageSession(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteMessageSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteMessageSessionsBulk"></a>
# **deleteMessageSessionsBulk**
> deleteMessageSessionsBulk(deleteMessageSessionsBulkInputObject)

Delete sessions (bulk)

Delete message sessions, together with all nested messages, by given ID(s) or delete all message sessions.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    DeleteListsBulkRequest deleteMessageSessionsBulkInputObject = new DeleteListsBulkRequest(); // DeleteListsBulkRequest | 
    try {
      apiInstance.deleteMessageSessionsBulk(deleteMessageSessionsBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteMessageSessionsBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteMessageSessionsBulkInputObject** | [**DeleteListsBulkRequest**](DeleteListsBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="deleteOutboundMessage"></a>
# **deleteOutboundMessage**
> deleteOutboundMessage(id)

Delete message

Delete a single message.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteOutboundMessage(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteOutboundMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteOutboundMessagesBulk"></a>
# **deleteOutboundMessagesBulk**
> deleteOutboundMessagesBulk(deleteOutboundMessagesBulkInputObject)

Delete messages (bulk)

Delete outbound messages by the given ID(s) or delete all outbound messages.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    DeleteOutboundMessagesBulkRequest deleteOutboundMessagesBulkInputObject = new DeleteOutboundMessagesBulkRequest(); // DeleteOutboundMessagesBulkRequest | 
    try {
      apiInstance.deleteOutboundMessagesBulk(deleteOutboundMessagesBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteOutboundMessagesBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteOutboundMessagesBulkInputObject** | [**DeleteOutboundMessagesBulkRequest**](DeleteOutboundMessagesBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="deleteScheduledMessage"></a>
# **deleteScheduledMessage**
> deleteScheduledMessage(id)

Delete a single scheduled message

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteScheduledMessage(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteScheduledMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteScheduledMessagesBulk"></a>
# **deleteScheduledMessagesBulk**
> deleteScheduledMessagesBulk(deleteScheduledMessagesBulkInputObject)

Delete scheduled messages (bulk)

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    DeleteScheduledMessagesBulkRequest deleteScheduledMessagesBulkInputObject = new DeleteScheduledMessagesBulkRequest(); // DeleteScheduledMessagesBulkRequest | 
    try {
      apiInstance.deleteScheduledMessagesBulk(deleteScheduledMessagesBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteScheduledMessagesBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteScheduledMessagesBulkInputObject** | [**DeleteScheduledMessagesBulkRequest**](DeleteScheduledMessagesBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteSenderId"></a>
# **deleteSenderId**
> deleteSenderId(id)

Delete a Sender ID

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteSenderId(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteSenderId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful delete chat. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(id)

Delete a template

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      apiInstance.deleteTemplate(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="deleteTemplatesBulk"></a>
# **deleteTemplatesBulk**
> deleteTemplatesBulk(deleteTemplatesBulkInputObject)

Delete templates (bulk)

Delete templates by given IDs or delete all templates.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    DeleteContactNotesBulkRequest deleteTemplatesBulkInputObject = new DeleteContactNotesBulkRequest(); // DeleteContactNotesBulkRequest | 
    try {
      apiInstance.deleteTemplatesBulk(deleteTemplatesBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#deleteTemplatesBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteTemplatesBulkInputObject** | [**DeleteContactNotesBulkRequest**](DeleteContactNotesBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="doCarrierLookup"></a>
# **doCarrierLookup**
> DoCarrierLookupResponse doCarrierLookup(phone, country)

Carrier Lookup

This API call allows you to retrieve additional information about a phone number: region-specific phone number formatting, carrier, phone type (landline/mobile) and country information.  &gt; Numbers must be checked one by one. You cannot check multiple numbers in one request.   

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String phone = "447860021130"; // String | Phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164) or in [National format](https://en.wikipedia.org/wiki/National_conventions_for_writing_telephone_numbers). 
    String country = "GB"; // String | This option must be specified only if the phone number is in a **[National format](https://en.wikipedia.org/wiki/National_conventions_for_writing_telephone_numbers)**. 
    try {
      DoCarrierLookupResponse result = apiInstance.doCarrierLookup(phone, country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#doCarrierLookup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **phone** | **String**| Phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164) or in [National format](https://en.wikipedia.org/wiki/National_conventions_for_writing_telephone_numbers).  | |
| **country** | **String**| This option must be specified only if the phone number is in a **[National format](https://en.wikipedia.org/wiki/National_conventions_for_writing_telephone_numbers)**.  | [optional] |

### Return type

[**DoCarrierLookupResponse**](DoCarrierLookupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **429** | Returned when the number of queries per second is too high. |  -  |

<a id="doEmailLookup"></a>
# **doEmailLookup**
> DoEmailLookupResponse doEmailLookup(email)

Email Lookup

To get more details about an email address or to check whether it is a valid email or not, you can use the Email Lookup command. To upload and check emails in bulk, please use our [Web app](https://my.textmagic.com/online/email-lookup/).  This API call allows you to retrieve additional information about an email address, such as mailbox detection, syntax checks, DNS validation, deliverability status, and many more helpful values (see the table below).  &gt; Emails must be checked one by one. You cannot check multiple emails in one request. To upload and check emails in bulk, please use our [Web app](https://my.textmagic.com/online/email-lookup/).

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String email = "john@sample.com"; // String | Email address.
    try {
      DoEmailLookupResponse result = apiInstance.doEmailLookup(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#doEmailLookup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**| Email address. | |

### Return type

[**DoEmailLookupResponse**](DoEmailLookupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getAllBulkSessions"></a>
# **getAllBulkSessions**
> GetAllBulkSessionsPaginatedResponse getAllBulkSessions(page, limit)

Get all bulk sessions

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    try {
      GetAllBulkSessionsPaginatedResponse result = apiInstance.getAllBulkSessions(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getAllBulkSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |

### Return type

[**GetAllBulkSessionsPaginatedResponse**](GetAllBulkSessionsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getAllChats"></a>
# **getAllChats**
> GetAllChatsPaginatedResponse getAllChats(status, page, limit, orderBy, voice, flat)

Get all chats

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String status = "a"; // String | Fetch only (a)ctive, (c)losed or (d)eleted chats.
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    Integer voice = 0; // Integer | Fetch results with voice calls.
    Integer flat = 0; // Integer | Should additional contact info be included?
    try {
      GetAllChatsPaginatedResponse result = apiInstance.getAllChats(status, page, limit, orderBy, voice, flat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getAllChats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | **String**| Fetch only (a)ctive, (c)losed or (d)eleted chats. | [optional] [enum: a, c, d] |
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, unread, messageTime] |
| **voice** | **Integer**| Fetch results with voice calls. | [optional] [default to 0] [enum: 0, 1] |
| **flat** | **Integer**| Should additional contact info be included? | [optional] [default to 0] [enum: 0, 1] |

### Return type

[**GetAllChatsPaginatedResponse**](GetAllChatsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getAllInboundMessages"></a>
# **getAllInboundMessages**
> GetAllInboundMessagesPaginatedResponse getAllInboundMessages(page, limit, orderBy, direction)

Get all inbound messages

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    try {
      GetAllInboundMessagesPaginatedResponse result = apiInstance.getAllInboundMessages(page, limit, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getAllInboundMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, sender, receiver, messageTime, firstName, lastName] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**GetAllInboundMessagesPaginatedResponse**](GetAllInboundMessagesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getAllMessageSessions"></a>
# **getAllMessageSessions**
> GetAllMessageSessionsPaginatedResponse getAllMessageSessions(page, limit)

Get all sessions

Get all message sending sessions. &gt; This list contains all of your sessions, including those which were sent but not via API 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    try {
      GetAllMessageSessionsPaginatedResponse result = apiInstance.getAllMessageSessions(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getAllMessageSessions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |

### Return type

[**GetAllMessageSessionsPaginatedResponse**](GetAllMessageSessionsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getAllOutboundMessages"></a>
# **getAllOutboundMessages**
> GetAllOutboundMessagesPaginatedResponse getAllOutboundMessages(page, limit, lastId)

Get all messages

Get all user oubound messages.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    Integer lastId = 56; // Integer | Filter results by ID, selecting all values lesser than the specified ID. Note that the \\'page\\' parameter is ignored when \\'lastId\\' is specified.
    try {
      GetAllOutboundMessagesPaginatedResponse result = apiInstance.getAllOutboundMessages(page, limit, lastId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getAllOutboundMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **lastId** | **Integer**| Filter results by ID, selecting all values lesser than the specified ID. Note that the \\&#39;page\\&#39; parameter is ignored when \\&#39;lastId\\&#39; is specified. | [optional] |

### Return type

[**GetAllOutboundMessagesPaginatedResponse**](GetAllOutboundMessagesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getAllScheduledMessages"></a>
# **getAllScheduledMessages**
> GetAllScheduledMessagesPaginatedResponse getAllScheduledMessages(page, limit, status, orderBy, direction)

Get all scheduled messages

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String status = "a"; // String | Fetch schedules with a specific status: a - actual, c - completed, x - all.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    try {
      GetAllScheduledMessagesPaginatedResponse result = apiInstance.getAllScheduledMessages(page, limit, status, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getAllScheduledMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **status** | **String**| Fetch schedules with a specific status: a - actual, c - completed, x - all. | [optional] [default to x] [enum: a, c, x] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, nextSend, lastSend] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**GetAllScheduledMessagesPaginatedResponse**](GetAllScheduledMessagesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getAllTemplates"></a>
# **getAllTemplates**
> GetAllTemplatesPaginatedResponse getAllTemplates(page, limit)

Get all templates

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    try {
      GetAllTemplatesPaginatedResponse result = apiInstance.getAllTemplates(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getAllTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] |
| **limit** | **Integer**| The number of results per page. | [optional] |

### Return type

[**GetAllTemplatesPaginatedResponse**](GetAllTemplatesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getAvailableDedicatedNumbers"></a>
# **getAvailableDedicatedNumbers**
> GetAvailableDedicatedNumbersResponse getAvailableDedicatedNumbers(country, prefix, tollfree)

Find dedicated numbers available for purchase

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String country = "GB"; // String | The 2-letter dedicated number country ISO code.
    Integer prefix = 447155; // Integer | Desired number prefix. Should include the country code (i.e. 447 for UK phone number format). Leave blank to get all the available numbers for the specified country.
    Integer tollfree = 0; // Integer | Should we show only tollfree numbers (tollfree available only for US).
    try {
      GetAvailableDedicatedNumbersResponse result = apiInstance.getAvailableDedicatedNumbers(country, prefix, tollfree);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getAvailableDedicatedNumbers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **country** | **String**| The 2-letter dedicated number country ISO code. | |
| **prefix** | **Integer**| Desired number prefix. Should include the country code (i.e. 447 for UK phone number format). Leave blank to get all the available numbers for the specified country. | [optional] |
| **tollfree** | **Integer**| Should we show only tollfree numbers (tollfree available only for US). | [optional] [default to 0] [enum: 0, 1] |

### Return type

[**GetAvailableDedicatedNumbersResponse**](GetAvailableDedicatedNumbersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of available to buy dedicated numbers. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getAvailableSenderSettingOptions"></a>
# **getAvailableSenderSettingOptions**
> GetAvailableSenderSettingOptionsResponse getAvailableSenderSettingOptions(country)

Get available sender settings

Get all available sender setting options which can be used in the \&quot;from\&quot; parameter of the POST messages method.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String country = "US"; // String | The 2-letter ISO country ID. If not specified, it returns all the available sender settings.
    try {
      GetAvailableSenderSettingOptionsResponse result = apiInstance.getAvailableSenderSettingOptions(country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getAvailableSenderSettingOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **country** | **String**| The 2-letter ISO country ID. If not specified, it returns all the available sender settings. | [optional] |

### Return type

[**GetAvailableSenderSettingOptionsResponse**](GetAvailableSenderSettingOptionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available sender setting options returned with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getBalanceNotificationOptions"></a>
# **getBalanceNotificationOptions**
> GetBalanceNotificationOptionsResponse getBalanceNotificationOptions()

Returns the list of available balance options which can be used as a bound to determine when to send email to user with low balance notification. See https://my.textmagic.com/online/account/notifications/balance

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      GetBalanceNotificationOptionsResponse result = apiInstance.getBalanceNotificationOptions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getBalanceNotificationOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBalanceNotificationOptionsResponse**](GetBalanceNotificationOptionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when the list of available balance options have been received with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getBalanceNotificationSettings"></a>
# **getBalanceNotificationSettings**
> GetBalanceNotificationSettingsResponse getBalanceNotificationSettings()

Get balance notification settings

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      GetBalanceNotificationSettingsResponse result = apiInstance.getBalanceNotificationSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getBalanceNotificationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBalanceNotificationSettingsResponse**](GetBalanceNotificationSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getBlockedContacts"></a>
# **getBlockedContacts**
> GetBlockedContactsPaginatedResponse getBlockedContacts(page, limit, query, orderBy, direction)

Get blocked contacts

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String query = "query_example"; // String | Find blocked contacts by specified search query.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    try {
      GetBlockedContactsPaginatedResponse result = apiInstance.getBlockedContacts(page, limit, query, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getBlockedContacts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **query** | **String**| Find blocked contacts by specified search query. | [optional] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, firstName, lastName] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**GetBlockedContactsPaginatedResponse**](GetBlockedContactsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getBulkSession"></a>
# **getBulkSession**
> BulkSession getBulkSession(id)

Get bulk session status

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      BulkSession result = apiInstance.getBulkSession(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getBulkSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**BulkSession**](BulkSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getCallbackSettings"></a>
# **getCallbackSettings**
> GetCallbackSettingsResponse getCallbackSettings()

Fetch callback URL settings

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      GetCallbackSettingsResponse result = apiInstance.getCallbackSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getCallbackSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCallbackSettingsResponse**](GetCallbackSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Callback settings has been returned with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getChat"></a>
# **getChat**
> Chat getChat(id)

Get a single chat

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      Chat result = apiInstance.getChat(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getChat");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**Chat**](Chat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found |  -  |

<a id="getChatByPhone"></a>
# **getChatByPhone**
> Chat getChatByPhone(phone, upsert, reopen)

Find chats by phone

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String phone = "447860021130"; // String | 
    Integer upsert = 0; // Integer | Create a new chat if not found.
    Integer reopen = 0; // Integer | Reopen chat if found or do not change status.
    try {
      Chat result = apiInstance.getChatByPhone(phone, upsert, reopen);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getChatByPhone");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **phone** | **String**|  | |
| **upsert** | **Integer**| Create a new chat if not found. | [optional] [default to 0] [enum: 0, 1] |
| **reopen** | **Integer**| Reopen chat if found or do not change status. | [optional] [default to 0] [enum: 0, 1] |

### Return type

[**Chat**](Chat.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getChatMessages"></a>
# **getChatMessages**
> GetChatMessagesPaginatedResponse getChatMessages(id, page, limit, query, start, end, direction, voice, includeNotes)

Get chat messages

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String query = "query_example"; // String | Find messages by specified search query.
    String start = "start_example"; // String | Return messages since specified timestamp only. Required when `end` parameter specified.
    String end = "end_example"; // String | Return messages up to specified timestamp only. Required when `start` parameter specified.
    String direction = "asc"; // String | Order direction. Default is desc.
    Integer voice = 0; // Integer | Fetch results with voice calls.
    Integer includeNotes = 0; // Integer | Fetch results with messenger notes.
    try {
      GetChatMessagesPaginatedResponse result = apiInstance.getChatMessages(id, page, limit, query, start, end, direction, voice, includeNotes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getChatMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **query** | **String**| Find messages by specified search query. | [optional] |
| **start** | **String**| Return messages since specified timestamp only. Required when &#x60;end&#x60; parameter specified. | [optional] |
| **end** | **String**| Return messages up to specified timestamp only. Required when &#x60;start&#x60; parameter specified. | [optional] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |
| **voice** | **Integer**| Fetch results with voice calls. | [optional] [default to 0] [enum: 0, 1] |
| **includeNotes** | **Integer**| Fetch results with messenger notes. | [optional] [default to 0] [enum: 0, 1] |

### Return type

[**GetChatMessagesPaginatedResponse**](GetChatMessagesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Returned when invalid phone number specified. |  -  |

<a id="getContact"></a>
# **getContact**
> Contact getContact(id)

Get the details of a specific contact

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | Contact ID.
    try {
      Contact result = apiInstance.getContact(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| Contact ID. | |

### Return type

[**Contact**](Contact.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contact data received with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getContactByPhone"></a>
# **getContactByPhone**
> Contact getContactByPhone(phone)

Get the details of a specific contact by phone number

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String phone = "447860021130"; // String | 
    try {
      Contact result = apiInstance.getContactByPhone(phone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getContactByPhone");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **phone** | **String**|  | |

### Return type

[**Contact**](Contact.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contact data has been returned with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getContactIfBlocked"></a>
# **getContactIfBlocked**
> Contact getContactIfBlocked(phone)

Check if a phone number is blocked

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String phone = "447860021130"; // String | Phone number to check.
    try {
      Contact result = apiInstance.getContactIfBlocked(phone);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getContactIfBlocked");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **phone** | **String**| Phone number to check. | |

### Return type

[**Contact**](Contact.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when contact is blocked. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | When the contact is not blocked. |  -  |

<a id="getContactImportSessionProgress"></a>
# **getContactImportSessionProgress**
> GetContactImportSessionProgressResponse getContactImportSessionProgress(id)

Check import progress

Get contact import session progress.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      GetContactImportSessionProgressResponse result = apiInstance.getContactImportSessionProgress(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getContactImportSessionProgress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**GetContactImportSessionProgressResponse**](GetContactImportSessionProgressResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getContactNote"></a>
# **getContactNote**
> ContactNote getContactNote(id)

Get a contact note

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      ContactNote result = apiInstance.getContactNote(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getContactNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**ContactNote**](ContactNote.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getContactNotes"></a>
# **getContactNotes**
> GetContactNotesPaginatedResponse getContactNotes(id, page, limit)

Fetch notes assigned to a given contact

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    try {
      GetContactNotesPaginatedResponse result = apiInstance.getContactNotes(id, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getContactNotes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |

### Return type

[**GetContactNotesPaginatedResponse**](GetContactNotesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getContacts"></a>
# **getContacts**
> GetContactsPaginatedResponse getContacts(page, limit, shared, orderBy, direction)

Get all contacts

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    Integer shared = 0; // Integer | Should shared contacts be included?
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    try {
      GetContactsPaginatedResponse result = apiInstance.getContacts(page, limit, shared, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getContacts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **shared** | **Integer**| Should shared contacts be included? | [optional] [default to 0] [enum: 0, 1] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, firstName, lastName] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**GetContactsPaginatedResponse**](GetContactsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested contacts have been returned with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getContactsAutocomplete"></a>
# **getContactsAutocomplete**
> List&lt;GetContactsAutocompleteResponseItem&gt; getContactsAutocomplete(query, limit, lists)

Get contacts autocomplete suggestions

Get contacts autocomplete suggestions by given search terms.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String query = "A"; // String | Find recipients by specified search query.
    Integer limit = 10; // Integer | The number of results per page.
    Integer lists = 0; // Integer | Should lists be returned or not?
    try {
      List<GetContactsAutocompleteResponseItem> result = apiInstance.getContactsAutocomplete(query, limit, lists);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getContactsAutocomplete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| Find recipients by specified search query. | |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **lists** | **Integer**| Should lists be returned or not? | [optional] [default to 0] [enum: 0, 1] |

### Return type

[**List&lt;GetContactsAutocompleteResponseItem&gt;**](GetContactsAutocompleteResponseItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Autocomplete data has been returned with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getContactsByListId"></a>
# **getContactsByListId**
> GetContactsByListIdPaginatedResponse getContactsByListId(id, page, limit, orderBy, direction)

Get all contacts in a list

A useful synonym for the \&quot;contacts/search\&quot; command with the provided \&quot;listId\&quot; parameter.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | Given group ID.
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    try {
      GetContactsByListIdPaginatedResponse result = apiInstance.getContactsByListId(id, page, limit, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getContactsByListId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| Given group ID. | |
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, firstName, lastName] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**GetContactsByListIdPaginatedResponse**](GetContactsByListIdPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getCountries"></a>
# **getCountries**
> List&lt;Country&gt; getCountries()

Get countries

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      List<Country> result = apiInstance.getCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getCountries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Country&gt;**](Country.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getCurrentUser"></a>
# **getCurrentUser**
> User getCurrentUser()

Get current account information

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      User result = apiInstance.getCurrentUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getCurrentUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getCustomField"></a>
# **getCustomField**
> UserCustomField getCustomField(id)

Get the details of a specific custom field

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      UserCustomField result = apiInstance.getCustomField(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getCustomField");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**UserCustomField**](UserCustomField.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getCustomFields"></a>
# **getCustomFields**
> GetCustomFieldsPaginatedResponse getCustomFields(page, limit)

Get all custom fields

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    try {
      GetCustomFieldsPaginatedResponse result = apiInstance.getCustomFields(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getCustomFields");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |

### Return type

[**GetCustomFieldsPaginatedResponse**](GetCustomFieldsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested custom fields have been returned with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getDedicatedNumber"></a>
# **getDedicatedNumber**
> UsersInbound getDedicatedNumber(id)

Get the details of a specific dedicated number

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      UsersInbound result = apiInstance.getDedicatedNumber(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getDedicatedNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**UsersInbound**](UsersInbound.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested dedicated number data returned with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getEmailSenders"></a>
# **getEmailSenders**
> GetEmailSendersResponse getEmailSenders(domainId)

Get list of email senders

Retrieves a list of configured email senders available for creating email campaigns.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer domainId = 56; // Integer | Filter email senders by specific domain ID.
    try {
      GetEmailSendersResponse result = apiInstance.getEmailSenders(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getEmailSenders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **Integer**| Filter email senders by specific domain ID. | [optional] |

### Return type

[**GetEmailSendersResponse**](GetEmailSendersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Email senders retrieved successfully. |  -  |
| **400** | Bad request - invalid query parameters. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getFavorites"></a>
# **getFavorites**
> GetFavoritesPaginatedResponse getFavorites(page, limit, query)

Get favorite contacts and lists

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String query = "A"; // String | Find contacts or lists by specified search query.
    try {
      GetFavoritesPaginatedResponse result = apiInstance.getFavorites(page, limit, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getFavorites");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **query** | **String**| Find contacts or lists by specified search query. | [optional] |

### Return type

[**GetFavoritesPaginatedResponse**](GetFavoritesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Favorite entities have been returned with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getInboundMessage"></a>
# **getInboundMessage**
> MessageIn getInboundMessage(id)

Get a single inbound message

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1782832; // Integer | The unique numeric ID for the inbound message.
    try {
      MessageIn result = apiInstance.getInboundMessage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getInboundMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| The unique numeric ID for the inbound message. | |

### Return type

[**MessageIn**](MessageIn.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getInboundMessagesNotificationSettings"></a>
# **getInboundMessagesNotificationSettings**
> GetInboundMessagesNotificationSettingsResponse getInboundMessagesNotificationSettings()

Get inbound messages notification settings

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      GetInboundMessagesNotificationSettingsResponse result = apiInstance.getInboundMessagesNotificationSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getInboundMessagesNotificationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInboundMessagesNotificationSettingsResponse**](GetInboundMessagesNotificationSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getInvoices"></a>
# **getInvoices**
> GetInvoicesPaginatedResponse getInvoices(page, limit)

Get all invoices

With the TextMagic API, you can check the invoices and transactions for your account.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    try {
      GetInvoicesPaginatedResponse result = apiInstance.getInvoices(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getInvoices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |

### Return type

[**GetInvoicesPaginatedResponse**](GetInvoicesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when the current user is not allowed to manage invoices. |  -  |

<a id="getList"></a>
# **getList**
> ModelList getList(id)

Get the details of a specific list

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      ModelList result = apiInstance.getList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**ModelList**](ModelList.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getListContactsIds"></a>
# **getListContactsIds**
> List&lt;Integer&gt; getListContactsIds(id)

Get all contact IDs in a list

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      List<Integer> result = apiInstance.getListContactsIds(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getListContactsIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

**List&lt;Integer&gt;**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getLists"></a>
# **getLists**
> GetListsPaginatedResponse getLists(page, limit, orderBy, direction, favoriteOnly, onlyMine)

Get all lists

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | The current fetched page.
    Integer limit = 10; // Integer | The number of results per page.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    Integer favoriteOnly = 0; // Integer | Return only favorited lists.
    Integer onlyMine = 0; // Integer | Return only current user lists.
    try {
      GetListsPaginatedResponse result = apiInstance.getLists(page, limit, orderBy, direction, favoriteOnly, onlyMine);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getLists");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| The current fetched page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, firstName, lastName] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |
| **favoriteOnly** | **Integer**| Return only favorited lists. | [optional] [default to 0] [enum: 0, 1] |
| **onlyMine** | **Integer**| Return only current user lists. | [optional] [default to 0] [enum: 0, 1] |

### Return type

[**GetListsPaginatedResponse**](GetListsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getListsOfContact"></a>
# **getListsOfContact**
> GetListsOfContactPaginatedResponse getListsOfContact(id, page, limit)

Get a contact&#39;s lists

Get all the lists in which a contact is included.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    try {
      GetListsOfContactPaginatedResponse result = apiInstance.getListsOfContact(id, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getListsOfContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |

### Return type

[**GetListsOfContactPaginatedResponse**](GetListsOfContactPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getMessagePreview"></a>
# **getMessagePreview**
> GetMessagePreviewResponse getMessagePreview(text, templateId, sendingTime, sendingDateTime, sendingTimezone, contacts, lists, phones, cutExtra, partsCount, referenceId, from, rule, createChat, tts, local, localCountry)

Preview message

Get a messages preview (with dynamic fields merged) of up to 100 messages per session. 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String text = "Test message test"; // String | Message text. Required if **template_id** is not set.
    Integer templateId = 1; // Integer | Template used instead of message text. Required if **text** is not set.
    Integer sendingTime = 1565606455; // Integer | DEPRECATED, consider using sendingDateTime and sendingTimezone parameters instead: Optional (required with rrule set). Message sending time is in unix timestamp format. Default is now.
    String sendingDateTime = "2020-05-27 13:02:33"; // String | Sending time is in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to the sendingTimezone.
    String sendingTimezone = "America/Buenos_Aires"; // String | The ID or ISO-name of the timezone used for sending when the sendingDateTime parameter is set, e.g. if you specify sendingDateTime = \\\"2016-05-27 13:02:33\\\" and sendingTimezone = \\\"America/Buenos_Aires\\\", your message will be sent on May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is the account timezone.
    String contacts = "1,2,3,4"; // String | Comma-separated array of contact resources id message will be sent to.
    String lists = "1,2,3,4"; // String | Comma-separated array of list resources id message will be sent to.
    String phones = "447860021130,447860021131"; // String | Comma-separated array of E.164 phone numbers message will be sent to.
    Integer cutExtra = 0; // Integer | Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead.
    Integer partsCount = 6; // Integer | Maximum message parts count (Textmagic allows sending of 1 to 6 message parts).
    Integer referenceId = 1; // Integer | Custom message reference id which can be used in your application infrastructure.
    String from = "Test Sender ID"; // String | One of the allowed Sender ID (phone number or alphanumeric sender ID). If the specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery. See [Get timezones](https://docs.textmagic.com/#tag/Sender-IDs).
    String rule = "FREQ=YEARLY;BYMONTH=1;BYMONTHDAY=1;COUNT=1"; // String | An iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as the start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details.
    Integer createChat = 0; // Integer | Should the sending method try to create new Chat(if not exist) with specified recipients?
    Integer tts = 0; // Integer | Send Text-to-Speech message.
    Integer local = 0; // Integer | Treat phone numbers passed in the \\'phones\\' field as local.
    String localCountry = "US"; // String | The 2-letter ISO country code for local phone numbers, used when \\'local\\' is set to true. Default is the account country.
    try {
      GetMessagePreviewResponse result = apiInstance.getMessagePreview(text, templateId, sendingTime, sendingDateTime, sendingTimezone, contacts, lists, phones, cutExtra, partsCount, referenceId, from, rule, createChat, tts, local, localCountry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getMessagePreview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **text** | **String**| Message text. Required if **template_id** is not set. | [optional] |
| **templateId** | **Integer**| Template used instead of message text. Required if **text** is not set. | [optional] |
| **sendingTime** | **Integer**| DEPRECATED, consider using sendingDateTime and sendingTimezone parameters instead: Optional (required with rrule set). Message sending time is in unix timestamp format. Default is now. | [optional] |
| **sendingDateTime** | **String**| Sending time is in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to the sendingTimezone. | [optional] |
| **sendingTimezone** | **String**| The ID or ISO-name of the timezone used for sending when the sendingDateTime parameter is set, e.g. if you specify sendingDateTime &#x3D; \\\&quot;2016-05-27 13:02:33\\\&quot; and sendingTimezone &#x3D; \\\&quot;America/Buenos_Aires\\\&quot;, your message will be sent on May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is the account timezone. | [optional] |
| **contacts** | **String**| Comma-separated array of contact resources id message will be sent to. | [optional] |
| **lists** | **String**| Comma-separated array of list resources id message will be sent to. | [optional] |
| **phones** | **String**| Comma-separated array of E.164 phone numbers message will be sent to. | [optional] |
| **cutExtra** | **Integer**| Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead. | [optional] [default to 0] [enum: 0, 1] |
| **partsCount** | **Integer**| Maximum message parts count (Textmagic allows sending of 1 to 6 message parts). | [optional] [default to 6] |
| **referenceId** | **Integer**| Custom message reference id which can be used in your application infrastructure. | [optional] |
| **from** | **String**| One of the allowed Sender ID (phone number or alphanumeric sender ID). If the specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery. See [Get timezones](https://docs.textmagic.com/#tag/Sender-IDs). | [optional] |
| **rule** | **String**| An iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as the start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details. | [optional] |
| **createChat** | **Integer**| Should the sending method try to create new Chat(if not exist) with specified recipients? | [optional] [default to 0] [enum: 0, 1] |
| **tts** | **Integer**| Send Text-to-Speech message. | [optional] [default to 0] [enum: 0, 1] |
| **local** | **Integer**| Treat phone numbers passed in the \\&#39;phones\\&#39; field as local. | [optional] [default to 0] [enum: 0, 1] |
| **localCountry** | **String**| The 2-letter ISO country code for local phone numbers, used when \\&#39;local\\&#39; is set to true. Default is the account country. | [optional] |

### Return type

[**GetMessagePreviewResponse**](GetMessagePreviewResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getMessagePrice"></a>
# **getMessagePrice**
> GetMessagePriceResponse getMessagePrice(includeBlocked, text, templateId, sendingTime, sendingDateTime, sendingTimezone, contacts, lists, phones, cutExtra, partsCount, referenceId, from, rule, createChat, tts, local, localCountry)

Check message price

Check pricing for a new outbound message.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer includeBlocked = 0; // Integer | Should we show the pricing for blocked contacts?
    String text = "Test message test"; // String | Message text. Required if the **template_id** is not set.
    Integer templateId = 1; // Integer | Template used instead of message text. Required if the **text** is not set.
    Integer sendingTime = 1565606455; // Integer | DEPRECATED, consider using the sendingDateTime and sendingTimezone parameters instead: optional (required with rrule set). Message sending time is in unix timestamp format. Default is now.
    String sendingDateTime = "2020-05-27 13:02:33"; // String | Sending time is in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to the sendingTimezone.
    String sendingTimezone = "America/Buenos_Aires"; // String | The ID or ISO-name of the timezone used for sending when sendingDateTime parameter is set, e.g. if you specify sendingDateTime = \\\"2016-05-27 13:02:33\\\" and sendingTimezone = \\\"America/Buenos_Aires\\\", your message will be sent on May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is the account timezone.
    String contacts = "1,2,3,4"; // String | Comma-separated array of contact resources id message will be sent to.
    String lists = "1,2,3,4"; // String | Comma-separated array of list resources id message will be sent to.
    String phones = "447860021130,447860021131"; // String | Comma-separated array of E.164 phone numbers message will be sent to.
    Integer cutExtra = 0; // Integer | Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead.
    Integer partsCount = 6; // Integer | Maximum message parts count (Textmagic allows sending 1 to 6 message parts).
    Integer referenceId = 1; // Integer | Custom message reference id which can be used in your application infrastructure.
    String from = "Test Sender ID"; // String | One of the allowed Sender ID (phone number or alphanumeric sender ID). If the specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery. See [Get timezones](https://docs.textmagic.com/#tag/Sender-IDs).
    String rule = "FREQ=YEARLY;BYMONTH=1;BYMONTHDAY=1;COUNT=1"; // String | An iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as the start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details.
    Integer createChat = 0; // Integer | Should the sending method try to create new Chat (if not exist) with specified recipients?
    Integer tts = 0; // Integer | Send a Text-to-Speech message.
    Integer local = 0; // Integer | Treat phone numbers passed in the \\'phones\\' field as local.
    String localCountry = "US"; // String | The 2-letter ISO country code for local phone numbers, used when \\'local\\' is set to true. Default is the account country.
    try {
      GetMessagePriceResponse result = apiInstance.getMessagePrice(includeBlocked, text, templateId, sendingTime, sendingDateTime, sendingTimezone, contacts, lists, phones, cutExtra, partsCount, referenceId, from, rule, createChat, tts, local, localCountry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getMessagePrice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeBlocked** | **Integer**| Should we show the pricing for blocked contacts? | [optional] [default to 0] [enum: 0, 1] |
| **text** | **String**| Message text. Required if the **template_id** is not set. | [optional] |
| **templateId** | **Integer**| Template used instead of message text. Required if the **text** is not set. | [optional] |
| **sendingTime** | **Integer**| DEPRECATED, consider using the sendingDateTime and sendingTimezone parameters instead: optional (required with rrule set). Message sending time is in unix timestamp format. Default is now. | [optional] |
| **sendingDateTime** | **String**| Sending time is in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to the sendingTimezone. | [optional] |
| **sendingTimezone** | **String**| The ID or ISO-name of the timezone used for sending when sendingDateTime parameter is set, e.g. if you specify sendingDateTime &#x3D; \\\&quot;2016-05-27 13:02:33\\\&quot; and sendingTimezone &#x3D; \\\&quot;America/Buenos_Aires\\\&quot;, your message will be sent on May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is the account timezone. | [optional] |
| **contacts** | **String**| Comma-separated array of contact resources id message will be sent to. | [optional] |
| **lists** | **String**| Comma-separated array of list resources id message will be sent to. | [optional] |
| **phones** | **String**| Comma-separated array of E.164 phone numbers message will be sent to. | [optional] |
| **cutExtra** | **Integer**| Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead. | [optional] [default to 0] [enum: 0, 1] |
| **partsCount** | **Integer**| Maximum message parts count (Textmagic allows sending 1 to 6 message parts). | [optional] [default to 6] |
| **referenceId** | **Integer**| Custom message reference id which can be used in your application infrastructure. | [optional] |
| **from** | **String**| One of the allowed Sender ID (phone number or alphanumeric sender ID). If the specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery. See [Get timezones](https://docs.textmagic.com/#tag/Sender-IDs). | [optional] |
| **rule** | **String**| An iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as the start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details. | [optional] |
| **createChat** | **Integer**| Should the sending method try to create new Chat (if not exist) with specified recipients? | [optional] [default to 0] [enum: 0, 1] |
| **tts** | **Integer**| Send a Text-to-Speech message. | [optional] [default to 0] [enum: 0, 1] |
| **local** | **Integer**| Treat phone numbers passed in the \\&#39;phones\\&#39; field as local. | [optional] [default to 0] [enum: 0, 1] |
| **localCountry** | **String**| The 2-letter ISO country code for local phone numbers, used when \\&#39;local\\&#39; is set to true. Default is the account country. | [optional] |

### Return type

[**GetMessagePriceResponse**](GetMessagePriceResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getMessageSession"></a>
# **getMessageSession**
> MessageSession getMessageSession(id)

Get a session&#x60;s details

Get a specific session’s details.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | Session ID.
    try {
      MessageSession result = apiInstance.getMessageSession(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getMessageSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| Session ID. | |

### Return type

[**MessageSession**](MessageSession.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getMessageSessionStat"></a>
# **getMessageSessionStat**
> GetMessageSessionStatResponse getMessageSessionStat(id, includeDeleted)

Get a session&#x60;s statistics

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    Integer includeDeleted = 0; // Integer | Search also in deleted messages.
    try {
      GetMessageSessionStatResponse result = apiInstance.getMessageSessionStat(id, includeDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getMessageSessionStat");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **includeDeleted** | **Integer**| Search also in deleted messages. | [optional] [default to 0] [enum: 0, 1] |

### Return type

[**GetMessageSessionStatResponse**](GetMessageSessionStatResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getMessagesBySessionId"></a>
# **getMessagesBySessionId**
> GetMessagesBySessionIdPaginatedResponse getMessagesBySessionId(id, page, limit, statuses, includeDeleted)

Get a session&#x60;s messages

A useful synonym for the \&quot;messages/search\&quot; command with the provided \&quot;sessionId\&quot; parameter.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String statuses = "q"; // String | Find messages by status.
    Integer includeDeleted = 0; // Integer | Search also in deleted messages.
    try {
      GetMessagesBySessionIdPaginatedResponse result = apiInstance.getMessagesBySessionId(id, page, limit, statuses, includeDeleted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getMessagesBySessionId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **statuses** | **String**| Find messages by status. | [optional] [enum: q, s, e, r, a, d, b, f, u, j, i, p, h] |
| **includeDeleted** | **Integer**| Search also in deleted messages. | [optional] [default to 0] [enum: 0, 1] |

### Return type

[**GetMessagesBySessionIdPaginatedResponse**](GetMessagesBySessionIdPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getMessagingCounters"></a>
# **getMessagingCounters**
> GetMessagingCountersResponse getMessagingCounters()

Get sent/received messages counters values

Get total contacts, sent messages and received messages counters values.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      GetMessagingCountersResponse result = apiInstance.getMessagingCounters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getMessagingCounters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMessagingCountersResponse**](GetMessagingCountersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getMessagingStat"></a>
# **getMessagingStat**
> List&lt;MessagingStatItem&gt; getMessagingStat(by, start, end)

Get messaging statistics

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String by = "off"; // String | *   **off** - to get total values per specified time interval; *   **day** - to show values grouped by day; *   **month** - to show values grouped by month; *   **year** - to show values grouped by year. 
    Integer start = 1430438400; // Integer | Time period start in [UNIX timestamp](https://en.wikipedia.org/wiki/Unix_time) format. The default is 7 days prior. 
    Integer end = 1431648000; // Integer | Time period start in [UNIX timestamp](https://en.wikipedia.org/wiki/Unix_time) format. The default is today. 
    try {
      List<MessagingStatItem> result = apiInstance.getMessagingStat(by, start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getMessagingStat");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **by** | **String**| *   **off** - to get total values per specified time interval; *   **day** - to show values grouped by day; *   **month** - to show values grouped by month; *   **year** - to show values grouped by year.  | [optional] [default to off] [enum: off, day, month, year] |
| **start** | **Integer**| Time period start in [UNIX timestamp](https://en.wikipedia.org/wiki/Unix_time) format. The default is 7 days prior.  | [optional] |
| **end** | **Integer**| Time period start in [UNIX timestamp](https://en.wikipedia.org/wiki/Unix_time) format. The default is today.  | [optional] |

### Return type

[**List&lt;MessagingStatItem&gt;**](MessagingStatItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getOutboundMessage"></a>
# **getOutboundMessage**
> MessageOut getOutboundMessage(id)

Get a single message

Get a single outgoing message.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      MessageOut result = apiInstance.getOutboundMessage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getOutboundMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getOutboundMessagesHistory"></a>
# **getOutboundMessagesHistory**
> GetOutboundMessagesHistoryPaginatedResponse getOutboundMessagesHistory(limit, lastId, query, orderBy, direction)

Get history

Get the outbound messages history.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer limit = 10; // Integer | The number of results per page.
    Integer lastId = 56; // Integer | Filter results by ID, selecting all values lesser than the specified ID.
    String query = "query_example"; // String | Find message by specified search query.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    try {
      GetOutboundMessagesHistoryPaginatedResponse result = apiInstance.getOutboundMessagesHistory(limit, lastId, query, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getOutboundMessagesHistory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **lastId** | **Integer**| Filter results by ID, selecting all values lesser than the specified ID. | [optional] |
| **query** | **String**| Find message by specified search query. | [optional] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, phone, sender, firstName, lastName, messageTime] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**GetOutboundMessagesHistoryPaginatedResponse**](GetOutboundMessagesHistoryPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getScheduledMessage"></a>
# **getScheduledMessage**
> MessagesIcs getScheduledMessage(id)

Get a single scheduled message

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      MessagesIcs result = apiInstance.getScheduledMessage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getScheduledMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**MessagesIcs**](MessagesIcs.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getSenderId"></a>
# **getSenderId**
> SenderId getSenderId(id)

Get the details of a specific Sender ID

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      SenderId result = apiInstance.getSenderId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getSenderId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**SenderId**](SenderId.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sender ID data returned with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getSenderIds"></a>
# **getSenderIds**
> GetSenderIdsPaginatedResponse getSenderIds(page, limit)

Get all your approved Sender IDs

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    try {
      GetSenderIdsPaginatedResponse result = apiInstance.getSenderIds(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getSenderIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |

### Return type

[**GetSenderIdsPaginatedResponse**](GetSenderIdsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sender IDs of the current user returned with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getSenderSettings"></a>
# **getSenderSettings**
> GetSenderSettingsResponse getSenderSettings(country)

Get current sender settings

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String country = "US"; // String | Return sender settings enabled for sending to a specified country. Should be 2 upper-case characters.
    try {
      GetSenderSettingsResponse result = apiInstance.getSenderSettings(country);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getSenderSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **country** | **String**| Return sender settings enabled for sending to a specified country. Should be 2 upper-case characters. | [optional] |

### Return type

[**GetSenderSettingsResponse**](GetSenderSettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sender settings returned with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getSpendingStat"></a>
# **getSpendingStat**
> GetSpendingStatPaginatedResponse getSpendingStat(page, limit, start, end)

Get spending statistics

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String start = "2018-11-11 11:11"; // String | Time period start in [UNIX timestamp](https://en.wikipedia.org/wiki/Unix_time) format. The default is 7 days prior. 
    String end = "2019-11-11 11:11"; // String | Time period start in [UNIX timestamp](https://en.wikipedia.org/wiki/Unix_time) format. The default is today. 
    try {
      GetSpendingStatPaginatedResponse result = apiInstance.getSpendingStat(page, limit, start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getSpendingStat");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **start** | **String**| Time period start in [UNIX timestamp](https://en.wikipedia.org/wiki/Unix_time) format. The default is 7 days prior.  | [optional] |
| **end** | **String**| Time period start in [UNIX timestamp](https://en.wikipedia.org/wiki/Unix_time) format. The default is today.  | [optional] |

### Return type

[**GetSpendingStatPaginatedResponse**](GetSpendingStatPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getTemplate"></a>
# **getTemplate**
> MessageTemplate getTemplate(id)

Get a template&#x60;s details

Get a single template.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      MessageTemplate result = apiInstance.getTemplate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getTimezones"></a>
# **getTimezones**
> Object getTimezones(full)

Get timezones

Return all available timezone IDs

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer full = 0; // Integer | Return full info about timezones in array (0 or 1). Default is 0.
    try {
      Object result = apiInstance.getTimezones(full);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getTimezones");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **full** | **Integer**| Return full info about timezones in array (0 or 1). Default is 0. | [optional] [default to 0] [enum: 0, 1] |

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getUnreadMessagesTotal"></a>
# **getUnreadMessagesTotal**
> GetUnreadMessagesTotalResponse getUnreadMessagesTotal()

Get unread messages number

Get the total amount of unread messages in the current user chats.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      GetUnreadMessagesTotalResponse result = apiInstance.getUnreadMessagesTotal();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getUnreadMessagesTotal");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUnreadMessagesTotalResponse**](GetUnreadMessagesTotalResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getUnsubscribedContact"></a>
# **getUnsubscribedContact**
> UnsubscribedContact getUnsubscribedContact(id)

Get the details of a specific unsubscribed contact

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      UnsubscribedContact result = apiInstance.getUnsubscribedContact(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getUnsubscribedContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**UnsubscribedContact**](UnsubscribedContact.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="getUnsubscribers"></a>
# **getUnsubscribers**
> GetUnsubscribersPaginatedResponse getUnsubscribers(page, limit)

Get all unsubscribed contacts

When one of your message recipients sends a request with one of the [STOP-words](https://www.textmagic.com/sms-stop-command/), they will be immediately opted-out of your send lists and their contact status will change to an unsubscribed contact. To retrieve information on all contacts who have unsubscribed status, use: 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    try {
      GetUnsubscribersPaginatedResponse result = apiInstance.getUnsubscribers(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getUnsubscribers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |

### Return type

[**GetUnsubscribersPaginatedResponse**](GetUnsubscribersPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="getUserDedicatedNumbers"></a>
# **getUserDedicatedNumbers**
> GetUserDedicatedNumbersPaginatedResponse getUserDedicatedNumbers(page, limit, surveyId)

Get all your dedicated numbers

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    Integer surveyId = 56; // Integer | Fetch only those numbers that are ready for the survey.
    try {
      GetUserDedicatedNumbersPaginatedResponse result = apiInstance.getUserDedicatedNumbers(page, limit, surveyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#getUserDedicatedNumbers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **surveyId** | **Integer**| Fetch only those numbers that are ready for the survey. | [optional] |

### Return type

[**GetUserDedicatedNumbersPaginatedResponse**](GetUserDedicatedNumbersPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested data returned with success. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="importContacts"></a>
# **importContacts**
> ResourceLinkResponse importContacts(column, _file, listId, listName)

Import contacts

Import contacts from the CSV, XLS or XLSX file.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    String column = "0:firstName;1:lastName;3:phone;4:email"; // String | Import file column mapping. The string must contain sub-strings of mapping in format `columnNumber:field` glued by `;`. For example: `0:firstName;1:lastName;3:phone;4:email` where the value before `:` is a number of the column in the file, and the value after `:` is a field of the newly created contact or the ID of a custom field. Numbers of columns begin from zero. Allowed built-in contact fields are: `firstName`, `lastName`, `phone`, `email`. Existing of `phone` mapping is required. 
    File _file = new File("/path/to/file"); // File | File containing contacts in csv or xls(x) formats.
    Integer listId = 443; // Integer | List that ID contacts will be imported to. Ignored if `listName` is specified. 
    String listName = "A new list"; // String | List name. This list will be created during import. If such name is already taken, an ordinal (1, 2, ...) will be added to the end. Ignored if `listId` is specified. 
    try {
      ResourceLinkResponse result = apiInstance.importContacts(column, _file, listId, listName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#importContacts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **column** | **String**| Import file column mapping. The string must contain sub-strings of mapping in format &#x60;columnNumber:field&#x60; glued by &#x60;;&#x60;. For example: &#x60;0:firstName;1:lastName;3:phone;4:email&#x60; where the value before &#x60;:&#x60; is a number of the column in the file, and the value after &#x60;:&#x60; is a field of the newly created contact or the ID of a custom field. Numbers of columns begin from zero. Allowed built-in contact fields are: &#x60;firstName&#x60;, &#x60;lastName&#x60;, &#x60;phone&#x60;, &#x60;email&#x60;. Existing of &#x60;phone&#x60; mapping is required.  | |
| **_file** | **File**| File containing contacts in csv or xls(x) formats. | |
| **listId** | **Integer**| List that ID contacts will be imported to. Ignored if &#x60;listName&#x60; is specified.  | [optional] |
| **listName** | **String**| List name. This list will be created during import. If such name is already taken, an ordinal (1, 2, ...) will be added to the end. Ignored if &#x60;listId&#x60; is specified.  | [optional] |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="markChatsReadBulk"></a>
# **markChatsReadBulk**
> markChatsReadBulk(markChatsReadBulkInputObject)

Mark chats as read (bulk)

Mark several chats as read by chat IDs or mark all chats as read

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    MarkChatsUnreadBulkRequest markChatsReadBulkInputObject = new MarkChatsUnreadBulkRequest(); // MarkChatsUnreadBulkRequest | 
    try {
      apiInstance.markChatsReadBulk(markChatsReadBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#markChatsReadBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **markChatsReadBulkInputObject** | [**MarkChatsUnreadBulkRequest**](MarkChatsUnreadBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="markChatsUnreadBulk"></a>
# **markChatsUnreadBulk**
> markChatsUnreadBulk(markChatsUnreadBulkInputObject)

Mark chats as unread (bulk)

Mark several chats as UNread by chat IDs or mark all chats as UNread

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    MarkChatsUnreadBulkRequest markChatsUnreadBulkInputObject = new MarkChatsUnreadBulkRequest(); // MarkChatsUnreadBulkRequest | 
    try {
      apiInstance.markChatsUnreadBulk(markChatsUnreadBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#markChatsUnreadBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **markChatsUnreadBulkInputObject** | [**MarkChatsUnreadBulkRequest**](MarkChatsUnreadBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="muteChat"></a>
# **muteChat**
> ResourceLinkResponse muteChat(muteChatInputObject)

Mute chat sounds

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    MuteChatRequest muteChatInputObject = new MuteChatRequest(); // MuteChatRequest | 
    try {
      ResourceLinkResponse result = apiInstance.muteChat(muteChatInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#muteChat");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **muteChatInputObject** | [**MuteChatRequest**](MuteChatRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="muteChatsBulk"></a>
# **muteChatsBulk**
> muteChatsBulk(muteChatsBulkInputObject)

Mute chats (bulk)

Mute several chats by chat ids or mute all chats.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    MuteChatsBulkRequest muteChatsBulkInputObject = new MuteChatsBulkRequest(); // MuteChatsBulkRequest | 
    try {
      apiInstance.muteChatsBulk(muteChatsBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#muteChatsBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **muteChatsBulkInputObject** | [**MuteChatsBulkRequest**](MuteChatsBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="ping"></a>
# **ping**
> PingResponse ping()

Ping

Make a simple ping request.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    try {
      PingResponse result = apiInstance.ping();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#ping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PingResponse**](PingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="reopenChatsBulk"></a>
# **reopenChatsBulk**
> reopenChatsBulk(reopenChatsBulkInputObject)

Reopen chats (bulk)

Reopen chats by chat IDs or reopen all chats

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    MarkChatsUnreadBulkRequest reopenChatsBulkInputObject = new MarkChatsUnreadBulkRequest(); // MarkChatsUnreadBulkRequest | 
    try {
      apiInstance.reopenChatsBulk(reopenChatsBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#reopenChatsBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reopenChatsBulkInputObject** | [**MarkChatsUnreadBulkRequest**](MarkChatsUnreadBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="requestSenderId"></a>
# **requestSenderId**
> ResourceLinkResponse requestSenderId(requestSenderIdInputObject)

Apply for a new Sender ID

&gt; Sender IDs are shared among all of your sub-accounts.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    RequestSenderIdRequest requestSenderIdInputObject = new RequestSenderIdRequest(); // RequestSenderIdRequest | 
    try {
      ResourceLinkResponse result = apiInstance.requestSenderId(requestSenderIdInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#requestSenderId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestSenderIdInputObject** | [**RequestSenderIdRequest**](RequestSenderIdRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Sender ID request has been created with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="scheduleEmailCampaign"></a>
# **scheduleEmailCampaign**
> ScheduleEmailCampaignResponse scheduleEmailCampaign(scheduleEmailCampaignInputObject)

Schedule new email campaign

Creates a new scheduled email campaign that will be sent at a specified time or according to a recurring schedule.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    ScheduleEmailCampaignRequest scheduleEmailCampaignInputObject = new ScheduleEmailCampaignRequest(); // ScheduleEmailCampaignRequest | 
    try {
      ScheduleEmailCampaignResponse result = apiInstance.scheduleEmailCampaign(scheduleEmailCampaignInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#scheduleEmailCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scheduleEmailCampaignInputObject** | [**ScheduleEmailCampaignRequest**](ScheduleEmailCampaignRequest.md)|  | |

### Return type

[**ScheduleEmailCampaignResponse**](ScheduleEmailCampaignResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Email campaign scheduled successfully. |  -  |
| **400** | Bad request - validation errors, invalid schedule, or insufficient balance. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Forbidden - insufficient permissions (requires ComposeEmail access). |  -  |

<a id="searchChats"></a>
# **searchChats**
> SearchChatsPaginatedResponse searchChats(page, limit, query)

Find chats by message text

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String query = "query_example"; // String | Find chats by specified search query.
    try {
      SearchChatsPaginatedResponse result = apiInstance.searchChats(page, limit, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#searchChats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **query** | **String**| Find chats by specified search query. | [optional] |

### Return type

[**SearchChatsPaginatedResponse**](SearchChatsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="searchChatsByIds"></a>
# **searchChatsByIds**
> SearchChatsByIdsPaginatedResponse searchChatsByIds(page, limit, ids)

Find chats (bulk)

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String ids = "ids_example"; // String | Find chats by ID(s).
    try {
      SearchChatsByIdsPaginatedResponse result = apiInstance.searchChatsByIds(page, limit, ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#searchChatsByIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **ids** | **String**| Find chats by ID(s). | [optional] |

### Return type

[**SearchChatsByIdsPaginatedResponse**](SearchChatsByIdsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="searchChatsByReceipent"></a>
# **searchChatsByReceipent**
> SearchChatsByReceipentPaginatedResponse searchChatsByReceipent(page, limit, query, orderBy)

Find chats by recipient

Find chats by recipient (contact, list name or phone number).

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String query = "query_example"; // String | Find chats by specified search query.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    try {
      SearchChatsByReceipentPaginatedResponse result = apiInstance.searchChatsByReceipent(page, limit, query, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#searchChatsByReceipent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **query** | **String**| Find chats by specified search query. | [optional] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, unread, messageTime] |

### Return type

[**SearchChatsByReceipentPaginatedResponse**](SearchChatsByReceipentPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="searchContacts"></a>
# **searchContacts**
> SearchContactsPaginatedResponse searchContacts(page, limit, shared, ids, listId, includeBlocked, query, local, exactMatch, country, orderBy, direction)

Find contacts by given criteria

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    Integer shared = 0; // Integer | Should shared contacts be included?
    String ids = "ids_example"; // String | Find contacts by IDs.
    Integer listId = 56; // Integer | Find contacts by List ID.
    Integer includeBlocked = 0; // Integer | Should blocked contacts be included?
    String query = "query_example"; // String | Find contacts by specified search query.
    Integer local = 0; // Integer | Treat phone number passed in the \"query\" field as local. Default is 0.
    Integer exactMatch = 0; // Integer | Return only exactly matching contacts. Default is 0.
    String country = "country_example"; // String | The 2-letter ISO country code for local phone numbers, used when \"local\" is set to true. Default is the account country.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    try {
      SearchContactsPaginatedResponse result = apiInstance.searchContacts(page, limit, shared, ids, listId, includeBlocked, query, local, exactMatch, country, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#searchContacts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **shared** | **Integer**| Should shared contacts be included? | [optional] [default to 0] [enum: 0, 1] |
| **ids** | **String**| Find contacts by IDs. | [optional] |
| **listId** | **Integer**| Find contacts by List ID. | [optional] |
| **includeBlocked** | **Integer**| Should blocked contacts be included? | [optional] [enum: 0, 1] |
| **query** | **String**| Find contacts by specified search query. | [optional] |
| **local** | **Integer**| Treat phone number passed in the \&quot;query\&quot; field as local. Default is 0. | [optional] [default to 0] [enum: 0, 1] |
| **exactMatch** | **Integer**| Return only exactly matching contacts. Default is 0. | [optional] [default to 0] [enum: 0, 1] |
| **country** | **String**| The 2-letter ISO country code for local phone numbers, used when \&quot;local\&quot; is set to true. Default is the account country. | [optional] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, firstName, lastName] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**SearchContactsPaginatedResponse**](SearchContactsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Found contacts have been returned with success. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="searchInboundMessages"></a>
# **searchInboundMessages**
> SearchInboundMessagesPaginatedResponse searchInboundMessages(page, limit, ids, query, orderBy, direction, expand)

Find inbound messages

Find inbound messages by given parameters.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String ids = "ids_example"; // String | Find message by ID(s).
    String query = "query_example"; // String | Find recipients by specified search query.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    Integer expand = 0; // Integer | Expand by adding firstName, lastName and contactId.
    try {
      SearchInboundMessagesPaginatedResponse result = apiInstance.searchInboundMessages(page, limit, ids, query, orderBy, direction, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#searchInboundMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **ids** | **String**| Find message by ID(s). | [optional] |
| **query** | **String**| Find recipients by specified search query. | [optional] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, sender, receiver, messageTime, firstName, lastName] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |
| **expand** | **Integer**| Expand by adding firstName, lastName and contactId. | [optional] [default to 0] [enum: 0, 1] |

### Return type

[**SearchInboundMessagesPaginatedResponse**](SearchInboundMessagesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="searchLists"></a>
# **searchLists**
> SearchListsPaginatedResponse searchLists(page, limit, ids, query, onlyMine, onlyDefault, orderBy, direction)

Find lists by given criteria

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String ids = "1,2,3,4"; // String | Find lists by IDs.
    String query = "A"; // String | Find lists by specified search query.
    Integer onlyMine = 0; // Integer | Return only current user lists.
    Integer onlyDefault = 0; // Integer | Return only default lists.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    try {
      SearchListsPaginatedResponse result = apiInstance.searchLists(page, limit, ids, query, onlyMine, onlyDefault, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#searchLists");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **ids** | **String**| Find lists by IDs. | [optional] |
| **query** | **String**| Find lists by specified search query. | [optional] |
| **onlyMine** | **Integer**| Return only current user lists. | [optional] [default to 0] [enum: 0, 1] |
| **onlyDefault** | **Integer**| Return only default lists. | [optional] [default to 0] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, firstName, lastName] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**SearchListsPaginatedResponse**](SearchListsPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="searchOutboundMessages"></a>
# **searchOutboundMessages**
> SearchOutboundMessagesPaginatedResponse searchOutboundMessages(page, limit, lastId, ids, sessionId, statuses, includeDeleted, query)

Find messages

Find outbound messages by given parameters.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    Integer lastId = 56; // Integer | Filter results by ID, selecting all values lesser than the specified ID. Note that the \\'page\\' parameter is ignored when \\'lastId\\' is specified.
    String ids = "ids_example"; // String | Find message by ID(s).
    Integer sessionId = 56; // Integer | Find messages by session ID.
    String statuses = "q"; // String | Find messages by status.
    Integer includeDeleted = 0; // Integer | Search also in deleted messages.
    String query = "query_example"; // String | Find messages by specified search query.
    try {
      SearchOutboundMessagesPaginatedResponse result = apiInstance.searchOutboundMessages(page, limit, lastId, ids, sessionId, statuses, includeDeleted, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#searchOutboundMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **lastId** | **Integer**| Filter results by ID, selecting all values lesser than the specified ID. Note that the \\&#39;page\\&#39; parameter is ignored when \\&#39;lastId\\&#39; is specified. | [optional] |
| **ids** | **String**| Find message by ID(s). | [optional] |
| **sessionId** | **Integer**| Find messages by session ID. | [optional] |
| **statuses** | **String**| Find messages by status. | [optional] [enum: q, s, e, r, a, d, b, f, u, j, i, p, h] |
| **includeDeleted** | **Integer**| Search also in deleted messages. | [optional] [default to 0] [enum: 0, 1] |
| **query** | **String**| Find messages by specified search query. | [optional] |

### Return type

[**SearchOutboundMessagesPaginatedResponse**](SearchOutboundMessagesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="searchScheduledMessages"></a>
# **searchScheduledMessages**
> SearchScheduledMessagesPaginatedResponse searchScheduledMessages(page, limit, query, ids, status, orderBy, direction)

Find scheduled messages

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String query = "query_example"; // String | Find messages by specified search query.
    String ids = "ids_example"; // String | Find schedules by ID(s).
    String status = "x"; // String | Fetch schedules with a specific status: a - actual, c - completed, x - all.
    String orderBy = "id"; // String | Order results by some field. Default is id.
    String direction = "asc"; // String | Order direction. Default is desc.
    try {
      SearchScheduledMessagesPaginatedResponse result = apiInstance.searchScheduledMessages(page, limit, query, ids, status, orderBy, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#searchScheduledMessages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **query** | **String**| Find messages by specified search query. | [optional] |
| **ids** | **String**| Find schedules by ID(s). | [optional] |
| **status** | **String**| Fetch schedules with a specific status: a - actual, c - completed, x - all. | [optional] [default to x] [enum: x, a, c] |
| **orderBy** | **String**| Order results by some field. Default is id. | [optional] [default to id] [enum: id, nextSend, lastSend] |
| **direction** | **String**| Order direction. Default is desc. | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**SearchScheduledMessagesPaginatedResponse**](SearchScheduledMessagesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="searchTemplates"></a>
# **searchTemplates**
> SearchTemplatesPaginatedResponse searchTemplates(page, limit, ids, name, content)

Find templates by criteria

Find user templates by given parameters.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer page = 1; // Integer | Fetch specified results page.
    Integer limit = 10; // Integer | The number of results per page.
    String ids = "ids_example"; // String | Find template by ID(s).
    String name = "name_example"; // String | Find template by name.
    String content = "content_example"; // String | Find template by content.
    try {
      SearchTemplatesPaginatedResponse result = apiInstance.searchTemplates(page, limit, ids, name, content);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#searchTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Fetch specified results page. | [optional] [default to 1] |
| **limit** | **Integer**| The number of results per page. | [optional] [default to 10] |
| **ids** | **String**| Find template by ID(s). | [optional] |
| **name** | **String**| Find template by name. | [optional] |
| **content** | **String**| Find template by content. | [optional] |

### Return type

[**SearchTemplatesPaginatedResponse**](SearchTemplatesPaginatedResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned when successful. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="sendMessage"></a>
# **sendMessage**
> SendMessageResponse sendMessage(sendMessageInputObject)

Send message

This is the main entrypoint to send messages. See the examples above for the reference.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    SendMessageRequest sendMessageInputObject = new SendMessageRequest(); // SendMessageRequest | 
    try {
      SendMessageResponse result = apiInstance.sendMessage(sendMessageInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#sendMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sendMessageInputObject** | [**SendMessageRequest**](SendMessageRequest.md)|  | |

### Return type

[**SendMessageResponse**](SendMessageResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **202** | Returned when a bulk session has been created. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="setChatStatus"></a>
# **setChatStatus**
> ResourceLinkResponse setChatStatus(setChatStatusInputObject)

Change chat status

Set the status of the chat given by ID.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    SetChatStatusRequest setChatStatusInputObject = new SetChatStatusRequest(); // SetChatStatusRequest | 
    try {
      ResourceLinkResponse result = apiInstance.setChatStatus(setChatStatusInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#setChatStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **setChatStatusInputObject** | [**SetChatStatusRequest**](SetChatStatusRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="unblockContact"></a>
# **unblockContact**
> unblockContact(unblockContactInputObject)

Unblock a contact by phone number

Unblock a contact by phone number

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    BlockContactRequest unblockContactInputObject = new BlockContactRequest(); // BlockContactRequest | 
    try {
      apiInstance.unblockContact(unblockContactInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#unblockContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **unblockContactInputObject** | [**BlockContactRequest**](BlockContactRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="unblockContactsBulk"></a>
# **unblockContactsBulk**
> unblockContactsBulk(unblockContactsBulkInputObject)

Unblock contacts (bulk)

Unblock several contacts by blocked contact IDs or unblock all contacts.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    UnblockContactsBulkRequest unblockContactsBulkInputObject = new UnblockContactsBulkRequest(); // UnblockContactsBulkRequest | 
    try {
      apiInstance.unblockContactsBulk(unblockContactsBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#unblockContactsBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **unblockContactsBulkInputObject** | [**UnblockContactsBulkRequest**](UnblockContactsBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="unmuteChatsBulk"></a>
# **unmuteChatsBulk**
> unmuteChatsBulk(unmuteChatsBulkInputObject)

Unmute chats (bulk)

Unmute several chats by chat ids or unmute all chats.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    UnmuteChatsBulkRequest unmuteChatsBulkInputObject = new UnmuteChatsBulkRequest(); // UnmuteChatsBulkRequest | 
    try {
      apiInstance.unmuteChatsBulk(unmuteChatsBulkInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#unmuteChatsBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **unmuteChatsBulkInputObject** | [**UnmuteChatsBulkRequest**](UnmuteChatsBulkRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="unsubscribeContact"></a>
# **unsubscribeContact**
> ResourceLinkResponse unsubscribeContact(unsubscribeContactInputObject)

Manually unsubscribe a contact

&gt; Please note, if you unsubscribe a contact, this action cannot be reversed. 

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    UnsubscribeContactRequest unsubscribeContactInputObject = new UnsubscribeContactRequest(); // UnsubscribeContactRequest | 
    try {
      ResourceLinkResponse result = apiInstance.unsubscribeContact(unsubscribeContactInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#unsubscribeContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **unsubscribeContactInputObject** | [**UnsubscribeContactRequest**](UnsubscribeContactRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when updated with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="updateBalanceNotificationSettings"></a>
# **updateBalanceNotificationSettings**
> updateBalanceNotificationSettings(updateBalanceNotificationSettingsInputObject)

Update balance notification settings

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    UpdateBalanceNotificationSettingsRequest updateBalanceNotificationSettingsInputObject = new UpdateBalanceNotificationSettingsRequest(); // UpdateBalanceNotificationSettingsRequest | 
    try {
      apiInstance.updateBalanceNotificationSettings(updateBalanceNotificationSettingsInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateBalanceNotificationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateBalanceNotificationSettingsInputObject** | [**UpdateBalanceNotificationSettingsRequest**](UpdateBalanceNotificationSettingsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="updateCallbackSettings"></a>
# **updateCallbackSettings**
> updateCallbackSettings(updateCallbackSettingsInputObject)

Update callback URL settings

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    UpdateCallbackSettingsRequest updateCallbackSettingsInputObject = new UpdateCallbackSettingsRequest(); // UpdateCallbackSettingsRequest | 
    try {
      apiInstance.updateCallbackSettings(updateCallbackSettingsInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateCallbackSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateCallbackSettingsInputObject** | [**UpdateCallbackSettingsRequest**](UpdateCallbackSettingsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="updateChatDesktopNotificationSettings"></a>
# **updateChatDesktopNotificationSettings**
> updateChatDesktopNotificationSettings(updateChatDesktopNotificationSettingsInputObject)

Update chat desktop notification settings

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    UpdateChatDesktopNotificationSettingsRequest updateChatDesktopNotificationSettingsInputObject = new UpdateChatDesktopNotificationSettingsRequest(); // UpdateChatDesktopNotificationSettingsRequest | 
    try {
      apiInstance.updateChatDesktopNotificationSettings(updateChatDesktopNotificationSettingsInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateChatDesktopNotificationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateChatDesktopNotificationSettingsInputObject** | [**UpdateChatDesktopNotificationSettingsRequest**](UpdateChatDesktopNotificationSettingsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="updateContact"></a>
# **updateContact**
> ResourceLinkResponse updateContact(id, updateContactInputObject)

Edit a contact

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    UpdateContactRequest updateContactInputObject = new UpdateContactRequest(); // UpdateContactRequest | 
    try {
      ResourceLinkResponse result = apiInstance.updateContact(id, updateContactInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateContact");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **updateContactInputObject** | [**UpdateContactRequest**](UpdateContactRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The contact has been created with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="updateContactNote"></a>
# **updateContactNote**
> ResourceLinkResponse updateContactNote(id, updateContactNoteInputObject)

Update a contact note

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    UpdateContactNoteRequest updateContactNoteInputObject = new UpdateContactNoteRequest(); // UpdateContactNoteRequest | 
    try {
      ResourceLinkResponse result = apiInstance.updateContactNote(id, updateContactNoteInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateContactNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **updateContactNoteInputObject** | [**UpdateContactNoteRequest**](UpdateContactNoteRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to edit a contact note shared to a current user. |  -  |
| **404** | Request data not found. |  -  |

<a id="updateCurrentUser"></a>
# **updateCurrentUser**
> UpdateCurrentUserResponse updateCurrentUser(updateCurrentUserInputObject)

Edit current account info

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    UpdateCurrentUserRequest updateCurrentUserInputObject = new UpdateCurrentUserRequest(); // UpdateCurrentUserRequest | 
    try {
      UpdateCurrentUserResponse result = apiInstance.updateCurrentUser(updateCurrentUserInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateCurrentUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateCurrentUserInputObject** | [**UpdateCurrentUserRequest**](UpdateCurrentUserRequest.md)|  | |

### Return type

[**UpdateCurrentUserResponse**](UpdateCurrentUserResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Updated with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="updateCustomField"></a>
# **updateCustomField**
> ResourceLinkResponse updateCustomField(id, updateCustomFieldInputObject)

Edit a custom field

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    CreateCustomFieldRequest updateCustomFieldInputObject = new CreateCustomFieldRequest(); // CreateCustomFieldRequest | 
    try {
      ResourceLinkResponse result = apiInstance.updateCustomField(id, updateCustomFieldInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateCustomField");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **updateCustomFieldInputObject** | [**CreateCustomFieldRequest**](CreateCustomFieldRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when updated with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found |  -  |

<a id="updateCustomFieldValue"></a>
# **updateCustomFieldValue**
> ResourceLinkResponse updateCustomFieldValue(id, updateCustomFieldValueInputObject)

Edit the custom field value of a specified contact

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 554; // Integer | 
    UpdateCustomFieldValueRequest updateCustomFieldValueInputObject = new UpdateCustomFieldValueRequest(); // UpdateCustomFieldValueRequest | 
    try {
      ResourceLinkResponse result = apiInstance.updateCustomFieldValue(id, updateCustomFieldValueInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateCustomFieldValue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **updateCustomFieldValueInputObject** | [**UpdateCustomFieldValueRequest**](UpdateCustomFieldValueRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when updated with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="updateInboundMessagesNotificationSettings"></a>
# **updateInboundMessagesNotificationSettings**
> updateInboundMessagesNotificationSettings(updateInboundMessagesNotificationSettingsInputObject)

Update inbound messages notification settings

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    UpdateInboundMessagesNotificationSettingsRequest updateInboundMessagesNotificationSettingsInputObject = new UpdateInboundMessagesNotificationSettingsRequest(); // UpdateInboundMessagesNotificationSettingsRequest | 
    try {
      apiInstance.updateInboundMessagesNotificationSettings(updateInboundMessagesNotificationSettingsInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateInboundMessagesNotificationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateInboundMessagesNotificationSettingsInputObject** | [**UpdateInboundMessagesNotificationSettingsRequest**](UpdateInboundMessagesNotificationSettingsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request executed with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="updateList"></a>
# **updateList**
> ResourceLinkResponse updateList(id, updateListObject)

Edit a list

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    UpdateListRequest updateListObject = new UpdateListRequest(); // UpdateListRequest | 
    try {
      ResourceLinkResponse result = apiInstance.updateList(id, updateListObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **updateListObject** | [**UpdateListRequest**](UpdateListRequest.md)|  | [optional] |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Returned when the form has errors. |  -  |
| **403** | Returned when trying to edit a list shared to a current user. |  -  |
| **404** | Returned when no list found. |  -  |

<a id="updateSenderSetting"></a>
# **updateSenderSetting**
> updateSenderSetting(updateSenderSettingInputObject)

Change sender settings

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    UpdateSenderSettingRequest updateSenderSettingInputObject = new UpdateSenderSettingRequest(); // UpdateSenderSettingRequest | 
    try {
      apiInstance.updateSenderSetting(updateSenderSettingInputObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateSenderSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateSenderSettingInputObject** | [**UpdateSenderSettingRequest**](UpdateSenderSettingRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Sender settings have been updated with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="updateTemplate"></a>
# **updateTemplate**
> ResourceLinkResponse updateTemplate(id, updateTemplateInputObject)

Update a template

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    CreateTemplateRequest updateTemplateInputObject = new CreateTemplateRequest(); // CreateTemplateRequest | 
    try {
      ResourceLinkResponse result = apiInstance.updateTemplate(id, updateTemplateInputObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#updateTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **updateTemplateInputObject** | [**CreateTemplateRequest**](CreateTemplateRequest.md)|  | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Returned when the form has errors. |  -  |
| **401** | Unauthorized request. |  -  |
| **404** | Request data not found. |  -  |

<a id="uploadAvatar"></a>
# **uploadAvatar**
> uploadAvatar(image)

Upload an avatar

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    File image = new File("/path/to/file"); // File | User avatar. Should be a PNG or JPG file not more than 10 MB.
    try {
      apiInstance.uploadAvatar(image);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#uploadAvatar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **image** | **File**| User avatar. Should be a PNG or JPG file not more than 10 MB. | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="uploadContactAvatar"></a>
# **uploadContactAvatar**
> ResourceLinkResponse uploadContactAvatar(id, image)

Upload an avatar

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    File image = new File("/path/to/file"); // File | Contact avatar. Should be a PNG or JPG file not more than 10 MB.
    try {
      ResourceLinkResponse result = apiInstance.uploadContactAvatar(id, image);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#uploadContactAvatar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **image** | **File**| Contact avatar. Should be a PNG or JPG file not more than 10 MB. | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned when successful. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to edit a contact shared to a current user. |  -  |
| **404** | Request data not found. |  -  |

<a id="uploadListAvatar"></a>
# **uploadListAvatar**
> ResourceLinkResponse uploadListAvatar(id, image)

Add an avatar for a list

Add an avatar for a list

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    Integer id = 1; // Integer | 
    File image = new File("/path/to/file"); // File | List avatar. Should be a PNG or JPG file not more than 10 MB.
    try {
      ResourceLinkResponse result = apiInstance.uploadListAvatar(id, image);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#uploadListAvatar");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **image** | **File**| List avatar. Should be a PNG or JPG file not more than 10 MB. | |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Avatar uploaded with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |
| **403** | Returned when trying to edit a list shared to the current user. |  -  |
| **404** | Request data not found. |  -  |

<a id="uploadMessageAttachment"></a>
# **uploadMessageAttachment**
> UploadMessageAttachmentResponse uploadMessageAttachment(_file)

Upload message attachment

Upload a new file to insert it as a link.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    File _file = new File("/path/to/file"); // File | Attachment. Supports .jpg, .gif, .png, .pdf, .txt, .csv, .doc, .docx, .xls, .xlsx, .ppt, .pptx & .vcf file formats.
    try {
      UploadMessageAttachmentResponse result = apiInstance.uploadMessageAttachment(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#uploadMessageAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File**| Attachment. Supports .jpg, .gif, .png, .pdf, .txt, .csv, .doc, .docx, .xls, .xlsx, .ppt, .pptx &amp; .vcf file formats. | |

### Return type

[**UploadMessageAttachmentResponse**](UploadMessageAttachmentResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File uploaded with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

<a id="uploadMessageMMSAttachment"></a>
# **uploadMessageMMSAttachment**
> UploadMessageAttachmentResponse uploadMessageMMSAttachment(_file)

Upload message mms attachment

Upload a new file to mms.

### Example
```java
// Import classes:
import com.textmagic.sdk.ApiClient;
import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.Configuration;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.models.*;
import com.textmagic.sdk.api.TextMagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.textmagic.com");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TextMagicApi apiInstance = new TextMagicApi(defaultClient);
    File _file = new File("/path/to/file"); // File | Attachment. Supports .jpg, .gif, .png, .pdf, .txt, .csv, .doc, .docx, .xls, .xlsx, .ppt, .pptx & .vcf file formats.
    try {
      UploadMessageAttachmentResponse result = apiInstance.uploadMessageMMSAttachment(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextMagicApi#uploadMessageMMSAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File**| Attachment. Supports .jpg, .gif, .png, .pdf, .txt, .csv, .doc, .docx, .xls, .xlsx, .ppt, .pptx &amp; .vcf file formats. | |

### Return type

[**UploadMessageAttachmentResponse**](UploadMessageAttachmentResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File uploaded with success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized request. |  -  |

