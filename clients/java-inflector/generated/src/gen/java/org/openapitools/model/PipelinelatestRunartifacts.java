package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2022-06-04T08:08:14.272389Z[Etc/UTC]")
public class PipelinelatestRunartifacts   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("url")
  private String url;

  @JsonProperty("_class")
  private String propertyClass;

  /**
   **/
  public PipelinelatestRunartifacts name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public PipelinelatestRunartifacts size(Integer size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  public PipelinelatestRunartifacts url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  public PipelinelatestRunartifacts propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_class")
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
    PipelinelatestRunartifacts pipelinelatestRunartifacts = (PipelinelatestRunartifacts) o;
    return Objects.equals(name, pipelinelatestRunartifacts.name) &&
        Objects.equals(size, pipelinelatestRunartifacts.size) &&
        Objects.equals(url, pipelinelatestRunartifacts.url) &&
        Objects.equals(propertyClass, pipelinelatestRunartifacts.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, url, propertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelinelatestRunartifacts {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

