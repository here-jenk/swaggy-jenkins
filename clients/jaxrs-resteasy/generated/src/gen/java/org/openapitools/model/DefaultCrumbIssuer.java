package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-06-04T08:09:04.819692Z[Etc/UTC]")
public class DefaultCrumbIssuer   {
  
  private String propertyClass;
  private String crumb;
  private String crumbRequestField;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("_class")
  public String getPropertyClass() {
    return propertyClass;
  }
  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("crumb")
  public String getCrumb() {
    return crumb;
  }
  public void setCrumb(String crumb) {
    this.crumb = crumb;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("crumbRequestField")
  public String getCrumbRequestField() {
    return crumbRequestField;
  }
  public void setCrumbRequestField(String crumbRequestField) {
    this.crumbRequestField = crumbRequestField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultCrumbIssuer defaultCrumbIssuer = (DefaultCrumbIssuer) o;
    return Objects.equals(propertyClass, defaultCrumbIssuer.propertyClass) &&
        Objects.equals(crumb, defaultCrumbIssuer.crumb) &&
        Objects.equals(crumbRequestField, defaultCrumbIssuer.crumbRequestField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, crumb, crumbRequestField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultCrumbIssuer {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    crumb: ").append(toIndentedString(crumb)).append("\n");
    sb.append("    crumbRequestField: ").append(toIndentedString(crumbRequestField)).append("\n");
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

