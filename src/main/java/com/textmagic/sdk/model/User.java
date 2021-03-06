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
import com.textmagic.sdk.model.Country;
import com.textmagic.sdk.model.Currency;
import com.textmagic.sdk.model.Timezone;
import com.textmagic.sdk.model.UserImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * User
 */

public class User {
  @SerializedName("id")
  private Integer id = null;

  /**
   * User&#39;s preferred format of time display: * *12h* - AM/PM format; * *24h* - 24-hour clock format. 
   */
  @JsonAdapter(DisplayTimeFormatEnum.Adapter.class)
  public enum DisplayTimeFormatEnum {
    _12H("12h"),
    
    _24H("24h");

    private String value;

    DisplayTimeFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayTimeFormatEnum fromValue(String text) {
      for (DisplayTimeFormatEnum b : DisplayTimeFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisplayTimeFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayTimeFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayTimeFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DisplayTimeFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("displayTimeFormat")
  private DisplayTimeFormatEnum displayTimeFormat = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  /**
   * Current account status: * **A** for Active; * **T** for Trial. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    A("A"),
    
    T("T");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("balance")
  private BigDecimal balance = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("currency")
  private Currency currency = null;

  @SerializedName("country")
  private Country country = null;

  @SerializedName("timezone")
  private Timezone timezone = null;

  /**
   * Type of account: * **P** for Parent User; * **A** for Administrator Sub-Account; * **U** for Regular User. 
   */
  @JsonAdapter(SubaccountTypeEnum.Adapter.class)
  public enum SubaccountTypeEnum {
    P("P"),
    
    A("A"),
    
    U("U");

    private String value;

    SubaccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubaccountTypeEnum fromValue(String text) {
      for (SubaccountTypeEnum b : SubaccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubaccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubaccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubaccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubaccountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("subaccountType")
  private SubaccountTypeEnum subaccountType = null;

  @SerializedName("emailAccepted")
  private Boolean emailAccepted = null;

  @SerializedName("phoneAccepted")
  private Boolean phoneAccepted = null;

  @SerializedName("avatar")
  private UserImage avatar = null;

  public User id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * User ID.
   * @return id
  **/
  @ApiModelProperty(example = "305", required = true, value = "User ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User displayTimeFormat(DisplayTimeFormatEnum displayTimeFormat) {
    this.displayTimeFormat = displayTimeFormat;
    return this;
  }

   /**
   * User&#39;s preferred format of time display: * *12h* - AM/PM format; * *24h* - 24-hour clock format. 
   * @return displayTimeFormat
  **/
  @ApiModelProperty(example = "24h", value = "User's preferred format of time display: * *12h* - AM/PM format; * *24h* - 24-hour clock format. ")
  public DisplayTimeFormatEnum getDisplayTimeFormat() {
    return displayTimeFormat;
  }

  public void setDisplayTimeFormat(DisplayTimeFormatEnum displayTimeFormat) {
    this.displayTimeFormat = displayTimeFormat;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username.
   * @return username
  **/
  @ApiModelProperty(example = "charles.conway", required = true, value = "Username.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Account first name.
   * @return firstName
  **/
  @ApiModelProperty(example = "Charles", required = true, value = "Account first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Account last name.
   * @return lastName
  **/
  @ApiModelProperty(example = "Conway", required = true, value = "Account last name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User email address.
   * @return email
  **/
  @ApiModelProperty(example = "charles@example.com", required = true, value = "User email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Current account status: * **A** for Active; * **T** for Trial. 
   * @return status
  **/
  @ApiModelProperty(example = "A", required = true, value = "Current account status: * **A** for Active; * **T** for Trial. ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public User balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Account balance (in account currency).
   * @return balance
  **/
  @ApiModelProperty(example = "208.64", required = true, value = "Account balance (in account currency).")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * User&#39;s phone number.
   * @return phone
  **/
  @ApiModelProperty(example = "447860021130", required = true, value = "User's phone number.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Account company name.
   * @return company
  **/
  @ApiModelProperty(example = "Example Ltd.", required = true, value = "Account company name.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public User currency(Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public User country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public User timezone(Timezone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(required = true, value = "")
  public Timezone getTimezone() {
    return timezone;
  }

  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }

  public User subaccountType(SubaccountTypeEnum subaccountType) {
    this.subaccountType = subaccountType;
    return this;
  }

   /**
   * Type of account: * **P** for Parent User; * **A** for Administrator Sub-Account; * **U** for Regular User. 
   * @return subaccountType
  **/
  @ApiModelProperty(example = "P", required = true, value = "Type of account: * **P** for Parent User; * **A** for Administrator Sub-Account; * **U** for Regular User. ")
  public SubaccountTypeEnum getSubaccountType() {
    return subaccountType;
  }

  public void setSubaccountType(SubaccountTypeEnum subaccountType) {
    this.subaccountType = subaccountType;
  }

  public User emailAccepted(Boolean emailAccepted) {
    this.emailAccepted = emailAccepted;
    return this;
  }

   /**
   * Does the account have a confirmed email?
   * @return emailAccepted
  **/
  @ApiModelProperty(example = "true", required = true, value = "Does the account have a confirmed email?")
  public Boolean isEmailAccepted() {
    return emailAccepted;
  }

  public void setEmailAccepted(Boolean emailAccepted) {
    this.emailAccepted = emailAccepted;
  }

  public User phoneAccepted(Boolean phoneAccepted) {
    this.phoneAccepted = phoneAccepted;
    return this;
  }

   /**
   * Does the account have a confirmed phone number?
   * @return phoneAccepted
  **/
  @ApiModelProperty(example = "true", required = true, value = "Does the account have a confirmed phone number?")
  public Boolean isPhoneAccepted() {
    return phoneAccepted;
  }

  public void setPhoneAccepted(Boolean phoneAccepted) {
    this.phoneAccepted = phoneAccepted;
  }

  public User avatar(UserImage avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @ApiModelProperty(required = true, value = "")
  public UserImage getAvatar() {
    return avatar;
  }

  public void setAvatar(UserImage avatar) {
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
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.displayTimeFormat, user.displayTimeFormat) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.balance, user.balance) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.company, user.company) &&
        Objects.equals(this.currency, user.currency) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.timezone, user.timezone) &&
        Objects.equals(this.subaccountType, user.subaccountType) &&
        Objects.equals(this.emailAccepted, user.emailAccepted) &&
        Objects.equals(this.phoneAccepted, user.phoneAccepted) &&
        Objects.equals(this.avatar, user.avatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayTimeFormat, username, firstName, lastName, email, status, balance, phone, company, currency, country, timezone, subaccountType, emailAccepted, phoneAccepted, avatar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayTimeFormat: ").append(toIndentedString(displayTimeFormat)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    subaccountType: ").append(toIndentedString(subaccountType)).append("\n");
    sb.append("    emailAccepted: ").append(toIndentedString(emailAccepted)).append("\n");
    sb.append("    phoneAccepted: ").append(toIndentedString(phoneAccepted)).append("\n");
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

