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
 * CreateTemplateInputObject
 */

public class CreateTemplateInputObject {
  @SerializedName("name")
  private String name = null;

  @SerializedName("content")
  private String content = null;

  public CreateTemplateInputObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Template name.
   * @return name
  **/
  @ApiModelProperty(example = "New template name", required = true, value = "Template name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateTemplateInputObject content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Template text. May contain tags inside braces. See [Get timezones](http://docs.textmagictesting.com/#section/Custom-fields-list-(Merge-tags)).
   * @return content
  **/
  @ApiModelProperty(example = "New template content", required = true, value = "Template text. May contain tags inside braces. See [Get timezones](http://docs.textmagictesting.com/#section/Custom-fields-list-(Merge-tags)).")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTemplateInputObject createTemplateInputObject = (CreateTemplateInputObject) o;
    return Objects.equals(this.name, createTemplateInputObject.name) &&
        Objects.equals(this.content, createTemplateInputObject.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTemplateInputObject {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

