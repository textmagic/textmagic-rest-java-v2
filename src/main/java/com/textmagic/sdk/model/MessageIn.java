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
 * MessageIn
 */

public class MessageIn {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("receiver")
  private String receiver = null;

  @SerializedName("messageTime")
  private OffsetDateTime messageTime = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("contactId")
  private Integer contactId = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("avatar")
  private String avatar = null;

  public MessageIn id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the inbound message.
   * @return id
  **/
  @ApiModelProperty(example = "1782832", required = true, value = "The ID of the inbound message.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MessageIn sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * The sender’s phone number.
   * @return sender
  **/
  @ApiModelProperty(example = "447860021130", required = true, value = "The sender’s phone number.")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public MessageIn receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * The receiver’s phone number (i.e. your dedicated or shared reply number).
   * @return receiver
  **/
  @ApiModelProperty(example = "447624800500", required = true, value = "The receiver’s phone number (i.e. your dedicated or shared reply number).")
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public MessageIn messageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
    return this;
  }

   /**
   * The time when the message reached the TextMagic API endpoint.
   * @return messageTime
  **/
  @ApiModelProperty(example = "2012-11-28T18:38:28+0000", required = true, value = "The time when the message reached the TextMagic API endpoint.")
  public OffsetDateTime getMessageTime() {
    return messageTime;
  }

  public void setMessageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
  }

  public MessageIn text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text from the received message.
   * @return text
  **/
  @ApiModelProperty(example = "I Love TextMagic!", required = true, value = "The text from the received message.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageIn contactId(Integer contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Sender contact ID.
   * @return contactId
  **/
  @ApiModelProperty(example = "1", value = "Sender contact ID.")
  public Integer getContactId() {
    return contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  public MessageIn firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Sender contact first name.
   * @return firstName
  **/
  @ApiModelProperty(example = "Charles", value = "Sender contact first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public MessageIn lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Sender contact last name.
   * @return lastName
  **/
  @ApiModelProperty(example = "Conway", value = "Sender contact last name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public MessageIn avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @ApiModelProperty(example = "avatars/dummy_avatar.png", required = true, value = "")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageIn messageIn = (MessageIn) o;
    return Objects.equals(this.id, messageIn.id) &&
        Objects.equals(this.sender, messageIn.sender) &&
        Objects.equals(this.receiver, messageIn.receiver) &&
        Objects.equals(this.messageTime, messageIn.messageTime) &&
        Objects.equals(this.text, messageIn.text) &&
        Objects.equals(this.contactId, messageIn.contactId) &&
        Objects.equals(this.firstName, messageIn.firstName) &&
        Objects.equals(this.lastName, messageIn.lastName) &&
        Objects.equals(this.avatar, messageIn.avatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sender, receiver, messageTime, text, contactId, firstName, lastName, avatar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageIn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
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

