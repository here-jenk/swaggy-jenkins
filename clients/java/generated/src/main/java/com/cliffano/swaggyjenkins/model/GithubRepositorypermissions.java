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
 * GithubRepositorypermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T09:45:11.812644Z[Etc/UTC]")
public class GithubRepositorypermissions {
  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private Boolean admin;

  public static final String SERIALIZED_NAME_PUSH = "push";
  @SerializedName(SERIALIZED_NAME_PUSH)
  private Boolean push;

  public static final String SERIALIZED_NAME_PULL = "pull";
  @SerializedName(SERIALIZED_NAME_PULL)
  private Boolean pull;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public GithubRepositorypermissions() { 
  }

  public GithubRepositorypermissions admin(Boolean admin) {
    
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAdmin() {
    return admin;
  }


  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }


  public GithubRepositorypermissions push(Boolean push) {
    
    this.push = push;
    return this;
  }

   /**
   * Get push
   * @return push
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPush() {
    return push;
  }


  public void setPush(Boolean push) {
    this.push = push;
  }


  public GithubRepositorypermissions pull(Boolean pull) {
    
    this.pull = pull;
    return this;
  }

   /**
   * Get pull
   * @return pull
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPull() {
    return pull;
  }


  public void setPull(Boolean pull) {
    this.pull = pull;
  }


  public GithubRepositorypermissions propertyClass(String propertyClass) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubRepositorypermissions githubRepositorypermissions = (GithubRepositorypermissions) o;
    return Objects.equals(this.admin, githubRepositorypermissions.admin) &&
        Objects.equals(this.push, githubRepositorypermissions.push) &&
        Objects.equals(this.pull, githubRepositorypermissions.pull) &&
        Objects.equals(this.propertyClass, githubRepositorypermissions.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, push, pull, propertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubRepositorypermissions {\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
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

