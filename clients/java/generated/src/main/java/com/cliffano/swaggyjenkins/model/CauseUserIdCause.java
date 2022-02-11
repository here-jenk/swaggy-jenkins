/*
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cliffano.swaggyjenkins.model;

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
 * CauseUserIdCause
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T12:41:01.332558Z[Etc/UTC]")
public class CauseUserIdCause {
  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "shortDescription";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  private String shortDescription;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public CauseUserIdCause() { 
  }

  public CauseUserIdCause propertyClass(String propertyClass) {
    
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyClass() {
    return propertyClass;
  }


  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  public CauseUserIdCause shortDescription(String shortDescription) {
    
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShortDescription() {
    return shortDescription;
  }


  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public CauseUserIdCause userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public CauseUserIdCause userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CauseUserIdCause causeUserIdCause = (CauseUserIdCause) o;
    return Objects.equals(this.propertyClass, causeUserIdCause.propertyClass) &&
        Objects.equals(this.shortDescription, causeUserIdCause.shortDescription) &&
        Objects.equals(this.userId, causeUserIdCause.userId) &&
        Objects.equals(this.userName, causeUserIdCause.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, shortDescription, userId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CauseUserIdCause {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

