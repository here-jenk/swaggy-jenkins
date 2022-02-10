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
import org.openapitools.model.StringParameterValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * StringParameterDefinition
 */
@JsonPropertyOrder({
  StringParameterDefinition.JSON_PROPERTY_PROPERTY_CLASS,
  StringParameterDefinition.JSON_PROPERTY_DEFAULT_PARAMETER_VALUE,
  StringParameterDefinition.JSON_PROPERTY_DESCRIPTION,
  StringParameterDefinition.JSON_PROPERTY_NAME,
  StringParameterDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-02-10T09:47:07.448540Z[Etc/UTC]")
public class StringParameterDefinition   {
  public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
  @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
  private String propertyClass;

  public static final String JSON_PROPERTY_DEFAULT_PARAMETER_VALUE = "defaultParameterValue";
  @JsonProperty(JSON_PROPERTY_DEFAULT_PARAMETER_VALUE)
  private StringParameterValue defaultParameterValue;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public StringParameterDefinition propertyClass(String propertyClass) {
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

  public StringParameterDefinition defaultParameterValue(StringParameterValue defaultParameterValue) {
    this.defaultParameterValue = defaultParameterValue;
    return this;
  }

  /**
   * Get defaultParameterValue
   * @return defaultParameterValue
   **/
  @JsonProperty(value = "defaultParameterValue")
  @ApiModelProperty(value = "")
  @Valid 
  public StringParameterValue getDefaultParameterValue() {
    return defaultParameterValue;
  }

  public void setDefaultParameterValue(StringParameterValue defaultParameterValue) {
    this.defaultParameterValue = defaultParameterValue;
  }

  public StringParameterDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @JsonProperty(value = "description")
  @ApiModelProperty(value = "")
  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StringParameterDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(value = "")
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StringParameterDefinition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(value = "")
  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringParameterDefinition stringParameterDefinition = (StringParameterDefinition) o;
    return Objects.equals(this.propertyClass, stringParameterDefinition.propertyClass) &&
        Objects.equals(this.defaultParameterValue, stringParameterDefinition.defaultParameterValue) &&
        Objects.equals(this.description, stringParameterDefinition.description) &&
        Objects.equals(this.name, stringParameterDefinition.name) &&
        Objects.equals(this.type, stringParameterDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, defaultParameterValue, description, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringParameterDefinition {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    defaultParameterValue: ").append(toIndentedString(defaultParameterValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

