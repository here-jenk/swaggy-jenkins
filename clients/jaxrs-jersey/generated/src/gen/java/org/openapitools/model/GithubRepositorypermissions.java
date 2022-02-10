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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * GithubRepositorypermissions
 */
@JsonPropertyOrder({
  GithubRepositorypermissions.JSON_PROPERTY_ADMIN,
  GithubRepositorypermissions.JSON_PROPERTY_PUSH,
  GithubRepositorypermissions.JSON_PROPERTY_PULL,
  GithubRepositorypermissions.JSON_PROPERTY_PROPERTY_CLASS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-02-10T09:47:07.448540Z[Etc/UTC]")
public class GithubRepositorypermissions   {
  public static final String JSON_PROPERTY_ADMIN = "admin";
  @JsonProperty(JSON_PROPERTY_ADMIN)
  private Boolean admin;

  public static final String JSON_PROPERTY_PUSH = "push";
  @JsonProperty(JSON_PROPERTY_PUSH)
  private Boolean push;

  public static final String JSON_PROPERTY_PULL = "pull";
  @JsonProperty(JSON_PROPERTY_PULL)
  private Boolean pull;

  public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
  @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
  private String propertyClass;

  public GithubRepositorypermissions admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

  /**
   * Get admin
   * @return admin
   **/
  @JsonProperty(value = "admin")
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
  @JsonProperty(value = "push")
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
  @JsonProperty(value = "pull")
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
  @JsonProperty(value = "_class")
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

