package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Link;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2022-06-04T08:08:14.272389Z[Etc/UTC]")
public class PipelineImpllinks   {
  @JsonProperty("runs")
  private Link runs;

  @JsonProperty("self")
  private Link self;

  @JsonProperty("queue")
  private Link queue;

  @JsonProperty("actions")
  private Link actions;

  @JsonProperty("_class")
  private String propertyClass;

  /**
   **/
  public PipelineImpllinks runs(Link runs) {
    this.runs = runs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("runs")
  public Link getRuns() {
    return runs;
  }
  public void setRuns(Link runs) {
    this.runs = runs;
  }

  /**
   **/
  public PipelineImpllinks self(Link self) {
    this.self = self;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("self")
  public Link getSelf() {
    return self;
  }
  public void setSelf(Link self) {
    this.self = self;
  }

  /**
   **/
  public PipelineImpllinks queue(Link queue) {
    this.queue = queue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue")
  public Link getQueue() {
    return queue;
  }
  public void setQueue(Link queue) {
    this.queue = queue;
  }

  /**
   **/
  public PipelineImpllinks actions(Link actions) {
    this.actions = actions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("actions")
  public Link getActions() {
    return actions;
  }
  public void setActions(Link actions) {
    this.actions = actions;
  }

  /**
   **/
  public PipelineImpllinks propertyClass(String propertyClass) {
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
    PipelineImpllinks pipelineImpllinks = (PipelineImpllinks) o;
    return Objects.equals(runs, pipelineImpllinks.runs) &&
        Objects.equals(self, pipelineImpllinks.self) &&
        Objects.equals(queue, pipelineImpllinks.queue) &&
        Objects.equals(actions, pipelineImpllinks.actions) &&
        Objects.equals(propertyClass, pipelineImpllinks.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runs, self, queue, actions, propertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineImpllinks {\n");
    
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

