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
import org.threeten.bp.OffsetDateTime;

/**
 * MessagingStatItem
 */

public class MessagingStatItem {
  @SerializedName("replyRate")
  private Float replyRate = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("deliveryRate")
  private Float deliveryRate = null;

  @SerializedName("costs")
  private Float costs = null;

  @SerializedName("messagesReceived")
  private Integer messagesReceived = null;

  @SerializedName("messagesSentDelivered")
  private Integer messagesSentDelivered = null;

  @SerializedName("messagesSentAccepted")
  private Integer messagesSentAccepted = null;

  @SerializedName("messagesSentBuffered")
  private Integer messagesSentBuffered = null;

  @SerializedName("messagesSentFailed")
  private Integer messagesSentFailed = null;

  @SerializedName("messagesSentRejected")
  private Integer messagesSentRejected = null;

  @SerializedName("messagesSentParts")
  private Integer messagesSentParts = null;

  public MessagingStatItem replyRate(Float replyRate) {
    this.replyRate = replyRate;
    return this;
  }

   /**
   * The number of incoming messages divided by the number of total messages.
   * @return replyRate
  **/
  @ApiModelProperty(example = "0.32", required = true, value = "The number of incoming messages divided by the number of total messages.")
  public Float getReplyRate() {
    return replyRate;
  }

  public void setReplyRate(Float replyRate) {
    this.replyRate = replyRate;
  }

  public MessagingStatItem date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Time interval start: empty if the **by** parameter was set to **off**. 
   * @return date
  **/
  @ApiModelProperty(example = "2014-09-19T00:00:00+0000", required = true, value = "Time interval start: empty if the **by** parameter was set to **off**. ")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public MessagingStatItem deliveryRate(Float deliveryRate) {
    this.deliveryRate = deliveryRate;
    return this;
  }

   /**
   * Message delivery rate:the number of delivered messages divided by the number of total messages.
   * @return deliveryRate
  **/
  @ApiModelProperty(example = "0.95", required = true, value = "Message delivery rate:the number of delivered messages divided by the number of total messages.")
  public Float getDeliveryRate() {
    return deliveryRate;
  }

  public void setDeliveryRate(Float deliveryRate) {
    this.deliveryRate = deliveryRate;
  }

  public MessagingStatItem costs(Float costs) {
    this.costs = costs;
    return this;
  }

   /**
   * Cost for sent messages during this period. The costs are in the [Account](https://docs.textmagic.com/#tag/User) currency. 
   * @return costs
  **/
  @ApiModelProperty(example = "30.15", required = true, value = "Cost for sent messages during this period. The costs are in the [Account](https://docs.textmagic.com/#tag/User) currency. ")
  public Float getCosts() {
    return costs;
  }

  public void setCosts(Float costs) {
    this.costs = costs;
  }

  public MessagingStatItem messagesReceived(Integer messagesReceived) {
    this.messagesReceived = messagesReceived;
    return this;
  }

   /**
   * Total received messages count.
   * @return messagesReceived
  **/
  @ApiModelProperty(example = "1085", required = true, value = "Total received messages count.")
  public Integer getMessagesReceived() {
    return messagesReceived;
  }

  public void setMessagesReceived(Integer messagesReceived) {
    this.messagesReceived = messagesReceived;
  }

  public MessagingStatItem messagesSentDelivered(Integer messagesSentDelivered) {
    this.messagesSentDelivered = messagesSentDelivered;
    return this;
  }

   /**
   * Delivered messages count. As messages are retried for up to 48 hours, this value could change.
   * @return messagesSentDelivered
  **/
  @ApiModelProperty(example = "11893", required = true, value = "Delivered messages count. As messages are retried for up to 48 hours, this value could change.")
  public Integer getMessagesSentDelivered() {
    return messagesSentDelivered;
  }

  public void setMessagesSentDelivered(Integer messagesSentDelivered) {
    this.messagesSentDelivered = messagesSentDelivered;
  }

  public MessagingStatItem messagesSentAccepted(Integer messagesSentAccepted) {
    this.messagesSentAccepted = messagesSentAccepted;
    return this;
  }

   /**
   * Messages accepted for delivery (in queue) but not yet delivered.
   * @return messagesSentAccepted
  **/
  @ApiModelProperty(example = "2", required = true, value = "Messages accepted for delivery (in queue) but not yet delivered.")
  public Integer getMessagesSentAccepted() {
    return messagesSentAccepted;
  }

  public void setMessagesSentAccepted(Integer messagesSentAccepted) {
    this.messagesSentAccepted = messagesSentAccepted;
  }

  public MessagingStatItem messagesSentBuffered(Integer messagesSentBuffered) {
    this.messagesSentBuffered = messagesSentBuffered;
    return this;
  }

   /**
   * Messages buffered by endpoint cell phone operators.
   * @return messagesSentBuffered
  **/
  @ApiModelProperty(example = "0", required = true, value = "Messages buffered by endpoint cell phone operators.")
  public Integer getMessagesSentBuffered() {
    return messagesSentBuffered;
  }

  public void setMessagesSentBuffered(Integer messagesSentBuffered) {
    this.messagesSentBuffered = messagesSentBuffered;
  }

  public MessagingStatItem messagesSentFailed(Integer messagesSentFailed) {
    this.messagesSentFailed = messagesSentFailed;
    return this;
  }

   /**
   * Messages that have failed for whatever reason, e.g. the destination phone was switched off for 48 hours or the recipient&#39;s phone account is out of service.
   * @return messagesSentFailed
  **/
  @ApiModelProperty(example = "3", required = true, value = "Messages that have failed for whatever reason, e.g. the destination phone was switched off for 48 hours or the recipient's phone account is out of service.")
  public Integer getMessagesSentFailed() {
    return messagesSentFailed;
  }

  public void setMessagesSentFailed(Integer messagesSentFailed) {
    this.messagesSentFailed = messagesSentFailed;
  }

  public MessagingStatItem messagesSentRejected(Integer messagesSentRejected) {
    this.messagesSentRejected = messagesSentRejected;
    return this;
  }

   /**
   * Messages that were rejected: invalid Sender ID used (e.g. you cannot use the Sender ID or your own mobile number when sending to the United States and Canada.) 
   * @return messagesSentRejected
  **/
  @ApiModelProperty(example = "50", required = true, value = "Messages that were rejected: invalid Sender ID used (e.g. you cannot use the Sender ID or your own mobile number when sending to the United States and Canada.) ")
  public Integer getMessagesSentRejected() {
    return messagesSentRejected;
  }

  public void setMessagesSentRejected(Integer messagesSentRejected) {
    this.messagesSentRejected = messagesSentRejected;
  }

  public MessagingStatItem messagesSentParts(Integer messagesSentParts) {
    this.messagesSentParts = messagesSentParts;
    return this;
  }

   /**
   * Total sent messages **parts** count. Note that this is not equal to the sent messages count, because one message could consist of 1 to 6 parts and users are charged per part, not per message.
   * @return messagesSentParts
  **/
  @ApiModelProperty(example = "15080", required = true, value = "Total sent messages **parts** count. Note that this is not equal to the sent messages count, because one message could consist of 1 to 6 parts and users are charged per part, not per message.")
  public Integer getMessagesSentParts() {
    return messagesSentParts;
  }

  public void setMessagesSentParts(Integer messagesSentParts) {
    this.messagesSentParts = messagesSentParts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingStatItem messagingStatItem = (MessagingStatItem) o;
    return Objects.equals(this.replyRate, messagingStatItem.replyRate) &&
        Objects.equals(this.date, messagingStatItem.date) &&
        Objects.equals(this.deliveryRate, messagingStatItem.deliveryRate) &&
        Objects.equals(this.costs, messagingStatItem.costs) &&
        Objects.equals(this.messagesReceived, messagingStatItem.messagesReceived) &&
        Objects.equals(this.messagesSentDelivered, messagingStatItem.messagesSentDelivered) &&
        Objects.equals(this.messagesSentAccepted, messagingStatItem.messagesSentAccepted) &&
        Objects.equals(this.messagesSentBuffered, messagingStatItem.messagesSentBuffered) &&
        Objects.equals(this.messagesSentFailed, messagingStatItem.messagesSentFailed) &&
        Objects.equals(this.messagesSentRejected, messagingStatItem.messagesSentRejected) &&
        Objects.equals(this.messagesSentParts, messagingStatItem.messagesSentParts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyRate, date, deliveryRate, costs, messagesReceived, messagesSentDelivered, messagesSentAccepted, messagesSentBuffered, messagesSentFailed, messagesSentRejected, messagesSentParts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingStatItem {\n");
    
    sb.append("    replyRate: ").append(toIndentedString(replyRate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deliveryRate: ").append(toIndentedString(deliveryRate)).append("\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    messagesReceived: ").append(toIndentedString(messagesReceived)).append("\n");
    sb.append("    messagesSentDelivered: ").append(toIndentedString(messagesSentDelivered)).append("\n");
    sb.append("    messagesSentAccepted: ").append(toIndentedString(messagesSentAccepted)).append("\n");
    sb.append("    messagesSentBuffered: ").append(toIndentedString(messagesSentBuffered)).append("\n");
    sb.append("    messagesSentFailed: ").append(toIndentedString(messagesSentFailed)).append("\n");
    sb.append("    messagesSentRejected: ").append(toIndentedString(messagesSentRejected)).append("\n");
    sb.append("    messagesSentParts: ").append(toIndentedString(messagesSentParts)).append("\n");
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

