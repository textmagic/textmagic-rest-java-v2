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
 * Returned when requested entity was not found.
 */
@ApiModel(description = "Returned when requested entity was not found.")

public class NotFoundResponse {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  public NotFoundResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Error code. Meanings of error codes are similar to [HTTP response codes](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes).
   * @return code
  **/
  @ApiModelProperty(example = "404", value = "Error code. Meanings of error codes are similar to [HTTP response codes](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes).")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public NotFoundResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A Brief error message. You could display this message to your user or save it in a log.
   * @return message
  **/
  @ApiModelProperty(example = "Resource does not exist.", value = "A Brief error message. You could display this message to your user or save it in a log.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotFoundResponse notFoundResponse = (NotFoundResponse) o;
    return Objects.equals(this.code, notFoundResponse.code) &&
        Objects.equals(this.message, notFoundResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFoundResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

