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
 * PushToken
 */

public class PushToken {
  /**
   * type of the token: * **GCM** — Google Cloud Messaging * **APN** — Apple Push Notification * **FCM** — Firebase Cloud Messaging 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    A("a"),
    
    G("g"),
    
    F("f");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("token")
  private String token = null;

  public PushToken type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * type of the token: * **GCM** — Google Cloud Messaging * **APN** — Apple Push Notification * **FCM** — Firebase Cloud Messaging 
   * @return type
  **/
  @ApiModelProperty(example = "a", required = true, value = "type of the token: * **GCM** — Google Cloud Messaging * **APN** — Apple Push Notification * **FCM** — Firebase Cloud Messaging ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PushToken token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Push token value.
   * @return token
  **/
  @ApiModelProperty(example = "03df25c845d460bcdad7802d2vf6fc1dfde97283bf75cc993eb6dca835ea2e2", required = true, value = "Push token value.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushToken pushToken = (PushToken) o;
    return Objects.equals(this.type, pushToken.type) &&
        Objects.equals(this.token, pushToken.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushToken {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

