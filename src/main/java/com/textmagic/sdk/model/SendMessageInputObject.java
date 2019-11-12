/*
 * TextMagic API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.textmagic.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SendMessageInputObject
 */

public class SendMessageInputObject {
  @SerializedName("text")
  private String text = null;

  @SerializedName("templateId")
  private Integer templateId = null;

  @SerializedName("sendingTime")
  private Integer sendingTime = null;

  @SerializedName("sendingDateTime")
  private String sendingDateTime = null;

  @SerializedName("sendingTimezone")
  private String sendingTimezone = null;

  @SerializedName("contacts")
  private String contacts = null;

  @SerializedName("lists")
  private String lists = null;

  @SerializedName("phones")
  private String phones = null;

  @SerializedName("cutExtra")
  private Boolean cutExtra = false;

  @SerializedName("partsCount")
  private Integer partsCount = null;

  @SerializedName("referenceId")
  private Integer referenceId = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("rrule")
  private String rrule = null;

  @SerializedName("createChat")
  private Boolean createChat = false;

  @SerializedName("tts")
  private Boolean tts = false;

  @SerializedName("local")
  private Boolean local = false;

  @SerializedName("localCountry")
  private String localCountry = null;

  public SendMessageInputObject text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Message text. Required if the **template_id** is not set.
   * @return text
  **/
  @ApiModelProperty(example = "Hello, how are you?", value = "Message text. Required if the **template_id** is not set.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SendMessageInputObject templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Template used instead of message text. Required if the **text** is not set.
   * @return templateId
  **/
  @ApiModelProperty(example = "1", value = "Template used instead of message text. Required if the **text** is not set.")
  public Integer getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }

  public SendMessageInputObject sendingTime(Integer sendingTime) {
    this.sendingTime = sendingTime;
    return this;
  }

   /**
   * DEPRECATED, consider using sendingDateTime and sendingTimezone parameters instead: Optional (required with rrule set). Message sending time in unix timestamp format. Default is now.
   * @return sendingTime
  **/
  @ApiModelProperty(example = "1565606455", value = "DEPRECATED, consider using sendingDateTime and sendingTimezone parameters instead: Optional (required with rrule set). Message sending time in unix timestamp format. Default is now.")
  public Integer getSendingTime() {
    return sendingTime;
  }

  public void setSendingTime(Integer sendingTime) {
    this.sendingTime = sendingTime;
  }

  public SendMessageInputObject sendingDateTime(String sendingDateTime) {
    this.sendingDateTime = sendingDateTime;
    return this;
  }

   /**
   * Sending time in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to **sendingTimezone**.
   * @return sendingDateTime
  **/
  @ApiModelProperty(example = "2020-05-27 13:02:33", value = "Sending time in Y-m-d H:i:s format (e.g. 2016-05-27 13:02:33). This time is relative to **sendingTimezone**.")
  public String getSendingDateTime() {
    return sendingDateTime;
  }

  public void setSendingDateTime(String sendingDateTime) {
    this.sendingDateTime = sendingDateTime;
  }

  public SendMessageInputObject sendingTimezone(String sendingTimezone) {
    this.sendingTimezone = sendingTimezone;
    return this;
  }

   /**
   * ID or ISO-name of timezone used for sending when sendingDateTime parameter is set. E.g. if you specify sendingDateTime &#x3D; \\\&quot;2016-05-27 13:02:33\\\&quot; and sendingTimezone &#x3D; \\\&quot;America/Buenos_Aires\\\&quot;, your message will be sent at May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is account timezone.
   * @return sendingTimezone
  **/
  @ApiModelProperty(example = "America/Buenos_Aires", value = "ID or ISO-name of timezone used for sending when sendingDateTime parameter is set. E.g. if you specify sendingDateTime = \\\"2016-05-27 13:02:33\\\" and sendingTimezone = \\\"America/Buenos_Aires\\\", your message will be sent at May 27, 2016 13:02:33 Buenos Aires time, or 16:02:33 UTC. Default is account timezone.")
  public String getSendingTimezone() {
    return sendingTimezone;
  }

  public void setSendingTimezone(String sendingTimezone) {
    this.sendingTimezone = sendingTimezone;
  }

  public SendMessageInputObject contacts(String contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * Comma separated array of contact resources id message will be sent to.
   * @return contacts
  **/
  @ApiModelProperty(example = "1,2,3,4", value = "Comma separated array of contact resources id message will be sent to.")
  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }

  public SendMessageInputObject lists(String lists) {
    this.lists = lists;
    return this;
  }

   /**
   * Comma separated array of list resources id message will be sent to.
   * @return lists
  **/
  @ApiModelProperty(example = "1,2,3,4", value = "Comma separated array of list resources id message will be sent to.")
  public String getLists() {
    return lists;
  }

  public void setLists(String lists) {
    this.lists = lists;
  }

  public SendMessageInputObject phones(String phones) {
    this.phones = phones;
    return this;
  }

   /**
   * Comma separated array of E.164 phone numbers message will be sent to.
   * @return phones
  **/
  @ApiModelProperty(example = "447860021130,447860021131", value = "Comma separated array of E.164 phone numbers message will be sent to.")
  public String getPhones() {
    return phones;
  }

  public void setPhones(String phones) {
    this.phones = phones;
  }

  public SendMessageInputObject cutExtra(Boolean cutExtra) {
    this.cutExtra = cutExtra;
    return this;
  }

   /**
   * Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead.
   * @return cutExtra
  **/
  @ApiModelProperty(example = "true", value = "Should sending method cut extra characters which not fit supplied partsCount or return 400 Bad request response instead.")
  public Boolean isCutExtra() {
    return cutExtra;
  }

  public void setCutExtra(Boolean cutExtra) {
    this.cutExtra = cutExtra;
  }

  public SendMessageInputObject partsCount(Integer partsCount) {
    this.partsCount = partsCount;
    return this;
  }

   /**
   * Maximum message parts count (TextMagic allows sending 1 to 6 message parts).
   * @return partsCount
  **/
  @ApiModelProperty(example = "6", value = "Maximum message parts count (TextMagic allows sending 1 to 6 message parts).")
  public Integer getPartsCount() {
    return partsCount;
  }

  public void setPartsCount(Integer partsCount) {
    this.partsCount = partsCount;
  }

  public SendMessageInputObject referenceId(Integer referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Custom message reference id which can be used in your application infrastructure.
   * @return referenceId
  **/
  @ApiModelProperty(example = "1", value = "Custom message reference id which can be used in your application infrastructure.")
  public Integer getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Integer referenceId) {
    this.referenceId = referenceId;
  }

  public SendMessageInputObject from(String from) {
    this.from = from;
    return this;
  }

   /**
   * One of allowed Sender ID (phone number or alphanumeric sender ID). If specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery. See [Get timezones](https://docs.textmagic.com/#tag/Sender-IDs).
   * @return from
  **/
  @ApiModelProperty(example = "Test sender id", value = "One of allowed Sender ID (phone number or alphanumeric sender ID). If specified Sender ID is not allowed for some destinations, a fallback default Sender ID will be used to ensure delivery. See [Get timezones](https://docs.textmagic.com/#tag/Sender-IDs).")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public SendMessageInputObject rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

   /**
   * iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details.
   * @return rrule
  **/
  @ApiModelProperty(example = "FREQ=YEARLY;BYMONTH=1;BYMONTHDAY=1;COUNT=1", value = "iCal RRULE parameter to create recurrent scheduled messages. When used, sendingTime is mandatory as start point of sending. See https://www.textmagic.com/free-tools/rrule-generator for format details.")
  public String getRrule() {
    return rrule;
  }

  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

  public SendMessageInputObject createChat(Boolean createChat) {
    this.createChat = createChat;
    return this;
  }

   /**
   * Should sending method try to create new Chat (if not exist) with specified recipients?
   * @return createChat
  **/
  @ApiModelProperty(example = "false", value = "Should sending method try to create new Chat (if not exist) with specified recipients?")
  public Boolean isCreateChat() {
    return createChat;
  }

  public void setCreateChat(Boolean createChat) {
    this.createChat = createChat;
  }

  public SendMessageInputObject tts(Boolean tts) {
    this.tts = tts;
    return this;
  }

   /**
   * Send a Text-to-Speech message.
   * @return tts
  **/
  @ApiModelProperty(example = "false", value = "Send a Text-to-Speech message.")
  public Boolean isTts() {
    return tts;
  }

  public void setTts(Boolean tts) {
    this.tts = tts;
  }

  public SendMessageInputObject local(Boolean local) {
    this.local = local;
    return this;
  }

   /**
   * Treat phone numbers passed in the \\&#39;phones\\&#39; field as local.
   * @return local
  **/
  @ApiModelProperty(example = "false", value = "Treat phone numbers passed in the \\'phones\\' field as local.")
  public Boolean isLocal() {
    return local;
  }

  public void setLocal(Boolean local) {
    this.local = local;
  }

  public SendMessageInputObject localCountry(String localCountry) {
    this.localCountry = localCountry;
    return this;
  }

   /**
   * The 2-letter ISO country code for local phone numbers, used when \\&#39;local\\&#39; is set to true. Default is the account country.
   * @return localCountry
  **/
  @ApiModelProperty(example = "US", value = "The 2-letter ISO country code for local phone numbers, used when \\'local\\' is set to true. Default is the account country.")
  public String getLocalCountry() {
    return localCountry;
  }

  public void setLocalCountry(String localCountry) {
    this.localCountry = localCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMessageInputObject sendMessageInputObject = (SendMessageInputObject) o;
    return Objects.equals(this.text, sendMessageInputObject.text) &&
        Objects.equals(this.templateId, sendMessageInputObject.templateId) &&
        Objects.equals(this.sendingTime, sendMessageInputObject.sendingTime) &&
        Objects.equals(this.sendingDateTime, sendMessageInputObject.sendingDateTime) &&
        Objects.equals(this.sendingTimezone, sendMessageInputObject.sendingTimezone) &&
        Objects.equals(this.contacts, sendMessageInputObject.contacts) &&
        Objects.equals(this.lists, sendMessageInputObject.lists) &&
        Objects.equals(this.phones, sendMessageInputObject.phones) &&
        Objects.equals(this.cutExtra, sendMessageInputObject.cutExtra) &&
        Objects.equals(this.partsCount, sendMessageInputObject.partsCount) &&
        Objects.equals(this.referenceId, sendMessageInputObject.referenceId) &&
        Objects.equals(this.from, sendMessageInputObject.from) &&
        Objects.equals(this.rrule, sendMessageInputObject.rrule) &&
        Objects.equals(this.createChat, sendMessageInputObject.createChat) &&
        Objects.equals(this.tts, sendMessageInputObject.tts) &&
        Objects.equals(this.local, sendMessageInputObject.local) &&
        Objects.equals(this.localCountry, sendMessageInputObject.localCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, templateId, sendingTime, sendingDateTime, sendingTimezone, contacts, lists, phones, cutExtra, partsCount, referenceId, from, rrule, createChat, tts, local, localCountry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageInputObject {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    sendingTime: ").append(toIndentedString(sendingTime)).append("\n");
    sb.append("    sendingDateTime: ").append(toIndentedString(sendingDateTime)).append("\n");
    sb.append("    sendingTimezone: ").append(toIndentedString(sendingTimezone)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    cutExtra: ").append(toIndentedString(cutExtra)).append("\n");
    sb.append("    partsCount: ").append(toIndentedString(partsCount)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    createChat: ").append(toIndentedString(createChat)).append("\n");
    sb.append("    tts: ").append(toIndentedString(tts)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    localCountry: ").append(toIndentedString(localCountry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

