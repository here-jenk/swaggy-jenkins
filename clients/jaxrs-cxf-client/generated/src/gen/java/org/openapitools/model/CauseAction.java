package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CauseUserIdCause;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CauseAction  {
  
  @ApiModelProperty(value = "")
  private String propertyClass;

  @ApiModelProperty(value = "")
  private List<CauseUserIdCause> causes = null;
 /**
   * Get propertyClass
   * @return propertyClass
  **/
  @JsonProperty("_class")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public CauseAction propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

 /**
   * Get causes
   * @return causes
  **/
  @JsonProperty("causes")
  public List<CauseUserIdCause> getCauses() {
    return causes;
  }

  public void setCauses(List<CauseUserIdCause> causes) {
    this.causes = causes;
  }

  public CauseAction causes(List<CauseUserIdCause> causes) {
    this.causes = causes;
    return this;
  }

  public CauseAction addCausesItem(CauseUserIdCause causesItem) {
    this.causes.add(causesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CauseAction {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
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

