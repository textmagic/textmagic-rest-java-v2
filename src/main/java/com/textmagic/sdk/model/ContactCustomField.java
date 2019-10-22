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
import com.textmagic.sdk.model.UserCustomField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContactCustomField
 */

public class ContactCustomField {
  @SerializedName("value")
  private String value = null;

  @SerializedName("userCustomField")
  private UserCustomField userCustomField = null;

  public ContactCustomField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ContactCustomField userCustomField(UserCustomField userCustomField) {
    this.userCustomField = userCustomField;
    return this;
  }

   /**
   * Get userCustomField
   * @return userCustomField
  **/
  @ApiModelProperty(value = "")
  public UserCustomField getUserCustomField() {
    return userCustomField;
  }

  public void setUserCustomField(UserCustomField userCustomField) {
    this.userCustomField = userCustomField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactCustomField contactCustomField = (ContactCustomField) o;
    return Objects.equals(this.value, contactCustomField.value) &&
        Objects.equals(this.userCustomField, contactCustomField.userCustomField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, userCustomField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactCustomField {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    userCustomField: ").append(toIndentedString(userCustomField)).append("\n");
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

