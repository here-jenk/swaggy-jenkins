package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineRunNodeedges;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PipelineRunNode  {
  
  @ApiModelProperty(value = "")
  private String propertyClass;

  @ApiModelProperty(value = "")
  private String displayName;

  @ApiModelProperty(value = "")
  private Integer durationInMillis;

  @ApiModelProperty(value = "")
  @Valid
  private List<PipelineRunNodeedges> edges = null;

  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String result;

  @ApiModelProperty(value = "")
  private String startTime;

  @ApiModelProperty(value = "")
  private String state;
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
  public PipelineRunNode propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

 /**
  * Get displayName
  * @return displayName
  */
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Sets the <code>displayName</code> property.
   */
 public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Sets the <code>displayName</code> property.
   */
  public PipelineRunNode displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

 /**
  * Get durationInMillis
  * @return durationInMillis
  */
  @JsonProperty("durationInMillis")
  public Integer getDurationInMillis() {
    return durationInMillis;
  }

  /**
   * Sets the <code>durationInMillis</code> property.
   */
 public void setDurationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
  }

  /**
   * Sets the <code>durationInMillis</code> property.
   */
  public PipelineRunNode durationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
  }

 /**
  * Get edges
  * @return edges
  */
  @JsonProperty("edges")
  public List<PipelineRunNodeedges> getEdges() {
    return edges;
  }

  /**
   * Sets the <code>edges</code> property.
   */
 public void setEdges(List<PipelineRunNodeedges> edges) {
    this.edges = edges;
  }

  /**
   * Sets the <code>edges</code> property.
   */
  public PipelineRunNode edges(List<PipelineRunNodeedges> edges) {
    this.edges = edges;
    return this;
  }

  /**
   * Adds a new item to the <code>edges</code> list.
   */
  public PipelineRunNode addEdgesItem(PipelineRunNodeedges edgesItem) {
    this.edges.add(edgesItem);
    return this;
  }

 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public PipelineRunNode id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get result
  * @return result
  */
  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  /**
   * Sets the <code>result</code> property.
   */
 public void setResult(String result) {
    this.result = result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public PipelineRunNode result(String result) {
    this.result = result;
    return this;
  }

 /**
  * Get startTime
  * @return startTime
  */
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
 public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
  public PipelineRunNode startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
  * Get state
  * @return state
  */
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  /**
   * Sets the <code>state</code> property.
   */
 public void setState(String state) {
    this.state = state;
  }

  /**
   * Sets the <code>state</code> property.
   */
  public PipelineRunNode state(String state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineRunNode {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

