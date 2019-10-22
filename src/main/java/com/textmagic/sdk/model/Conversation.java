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
 * Conversation
 */

public class Conversation {
  @SerializedName("id")
  private Integer id = null;

  /**
   * Message type: inbound or outbound. 
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    IN("in"),
    
    OUT("out"),
    
    O("o"),
    
    I("i");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("messageTime")
  private OffsetDateTime messageTime = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("receiver")
  private String receiver = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("sessionId")
  private Integer sessionId = null;

  public Conversation id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Conversation direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Message type: inbound or outbound. 
   * @return direction
  **/
  @ApiModelProperty(example = "in", required = true, value = "Message type: inbound or outbound. ")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public Conversation sender(String sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Sender phone number.
   * @return sender
  **/
  @ApiModelProperty(example = "447860021130", required = true, value = "Sender phone number.")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public Conversation messageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
    return this;
  }

   /**
   * Time when message arrived at TextMagic.
   * @return messageTime
  **/
  @ApiModelProperty(example = "2012-11-28T18:38:28+0000", required = true, value = "Time when message arrived at TextMagic.")
  public OffsetDateTime getMessageTime() {
    return messageTime;
  }

  public void setMessageTime(OffsetDateTime messageTime) {
    this.messageTime = messageTime;
  }

  public Conversation text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Message text.
   * @return text
  **/
  @ApiModelProperty(example = "This is a sample message", required = true, value = "Message text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Conversation receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Receiver phone number.
   * @return receiver
  **/
  @ApiModelProperty(example = "447624800500", required = true, value = "Receiver phone number.")
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public Conversation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Message status (for chats outbound only). See [message delivery statuses](http://docs.textmagictesting.com/#section/Delivery-status-codes) for details.
   * @return status
  **/
  @ApiModelProperty(example = "d", required = true, value = "Message status (for chats outbound only). See [message delivery statuses](http://docs.textmagictesting.com/#section/Delivery-status-codes) for details.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Conversation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Contact first name.
   * @return firstName
  **/
  @ApiModelProperty(example = "Charles", required = true, value = "Contact first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Conversation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Contact last name.
   * @return lastName
  **/
  @ApiModelProperty(example = "Conway", required = true, value = "Contact last name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Conversation sessionId(Integer sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Session ID of a message. See [message sessions](http://docs.textmagictesting.com/#tag/Outbound-Message-Sessions) for details.
   * @return sessionId
  **/
  @ApiModelProperty(required = true, value = "Session ID of a message. See [message sessions](http://docs.textmagictesting.com/#tag/Outbound-Message-Sessions) for details.")
  public Integer getSessionId() {
    return sessionId;
  }

  public void setSessionId(Integer sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.id, conversation.id) &&
        Objects.equals(this.direction, conversation.direction) &&
        Objects.equals(this.sender, conversation.sender) &&
        Objects.equals(this.messageTime, conversation.messageTime) &&
        Objects.equals(this.text, conversation.text) &&
        Objects.equals(this.receiver, conversation.receiver) &&
        Objects.equals(this.status, conversation.status) &&
        Objects.equals(this.firstName, conversation.firstName) &&
        Objects.equals(this.lastName, conversation.lastName) &&
        Objects.equals(this.sessionId, conversation.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, direction, sender, messageTime, text, receiver, status, firstName, lastName, sessionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

