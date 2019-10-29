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
 * CheckPhoneVerificationCodeInputObject
 */

public class CheckPhoneVerificationCodeInputObject {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("verifyId")
  private String verifyId = null;

  public CheckPhoneVerificationCodeInputObject code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Verification code received by the user and entered into the form field.
   * @return code
  **/
  @ApiModelProperty(example = "1234", value = "Verification code received by the user and entered into the form field.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CheckPhoneVerificationCodeInputObject verifyId(String verifyId) {
    this.verifyId = verifyId;
    return this;
  }

   /**
   * VerifyId from Step 1 to match both requests together.
   * @return verifyId
  **/
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "VerifyId from Step 1 to match both requests together.")
  public String getVerifyId() {
    return verifyId;
  }

  public void setVerifyId(String verifyId) {
    this.verifyId = verifyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPhoneVerificationCodeInputObject checkPhoneVerificationCodeInputObject = (CheckPhoneVerificationCodeInputObject) o;
    return Objects.equals(this.code, checkPhoneVerificationCodeInputObject.code) &&
        Objects.equals(this.verifyId, checkPhoneVerificationCodeInputObject.verifyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, verifyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPhoneVerificationCodeInputObject {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    verifyId: ").append(toIndentedString(verifyId)).append("\n");
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

