package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PipelineActivityartifacts  {
  
  @ApiModelProperty(value = "")
  private String name;

  @ApiModelProperty(value = "")
  private Integer size;

  @ApiModelProperty(value = "")
  private String url;

  @ApiModelProperty(value = "")
  private String propertyClass;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public PipelineActivityartifacts name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get size
  * @return size
  */
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public PipelineActivityartifacts size(Integer size) {
    this.size = size;
    return this;
  }

 /**
  * Get url
  * @return url
  */
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public PipelineActivityartifacts url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Get propertyClass
  * @return propertyClass
  */
  @JsonProperty("_class")
  public String getPropertyClass() {
    return propertyClass;
  }

  /**
   * Sets the <code>propertyClass</code> property.
   */
 public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  /**
   * Sets the <code>propertyClass</code> property.
   */
  public PipelineActivityartifacts propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineActivityartifacts {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

