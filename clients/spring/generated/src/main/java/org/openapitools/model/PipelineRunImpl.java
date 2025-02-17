package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PipelineRunImpllinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PipelineRunImpl
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-04T08:12:04.098807Z[Etc/UTC]")
public class PipelineRunImpl {

  @JsonProperty("_class")
  private String propertyClass;

  @JsonProperty("_links")
  private PipelineRunImpllinks links;

  @JsonProperty("durationInMillis")
  private Integer durationInMillis;

  @JsonProperty("enQueueTime")
  private String enQueueTime;

  @JsonProperty("endTime")
  private String endTime;

  @JsonProperty("estimatedDurationInMillis")
  private Integer estimatedDurationInMillis;

  @JsonProperty("id")
  private String id;

  @JsonProperty("organization")
  private String organization;

  @JsonProperty("pipeline")
  private String pipeline;

  @JsonProperty("result")
  private String result;

  @JsonProperty("runSummary")
  private String runSummary;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("state")
  private String state;

  @JsonProperty("type")
  private String type;

  @JsonProperty("commitId")
  private String commitId;

  public PipelineRunImpl propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
  */
  
  @Schema(name = "_class", required = false)
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public PipelineRunImpl links(PipelineRunImpllinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", required = false)
  public PipelineRunImpllinks getLinks() {
    return links;
  }

  public void setLinks(PipelineRunImpllinks links) {
    this.links = links;
  }

  public PipelineRunImpl durationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
  }

  /**
   * Get durationInMillis
   * @return durationInMillis
  */
  
  @Schema(name = "durationInMillis", required = false)
  public Integer getDurationInMillis() {
    return durationInMillis;
  }

  public void setDurationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
  }

  public PipelineRunImpl enQueueTime(String enQueueTime) {
    this.enQueueTime = enQueueTime;
    return this;
  }

  /**
   * Get enQueueTime
   * @return enQueueTime
  */
  
  @Schema(name = "enQueueTime", required = false)
  public String getEnQueueTime() {
    return enQueueTime;
  }

  public void setEnQueueTime(String enQueueTime) {
    this.enQueueTime = enQueueTime;
  }

  public PipelineRunImpl endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  */
  
  @Schema(name = "endTime", required = false)
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public PipelineRunImpl estimatedDurationInMillis(Integer estimatedDurationInMillis) {
    this.estimatedDurationInMillis = estimatedDurationInMillis;
    return this;
  }

  /**
   * Get estimatedDurationInMillis
   * @return estimatedDurationInMillis
  */
  
  @Schema(name = "estimatedDurationInMillis", required = false)
  public Integer getEstimatedDurationInMillis() {
    return estimatedDurationInMillis;
  }

  public void setEstimatedDurationInMillis(Integer estimatedDurationInMillis) {
    this.estimatedDurationInMillis = estimatedDurationInMillis;
  }

  public PipelineRunImpl id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PipelineRunImpl organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
  */
  
  @Schema(name = "organization", required = false)
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public PipelineRunImpl pipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

  /**
   * Get pipeline
   * @return pipeline
  */
  
  @Schema(name = "pipeline", required = false)
  public String getPipeline() {
    return pipeline;
  }

  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }

  public PipelineRunImpl result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  
  @Schema(name = "result", required = false)
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public PipelineRunImpl runSummary(String runSummary) {
    this.runSummary = runSummary;
    return this;
  }

  /**
   * Get runSummary
   * @return runSummary
  */
  
  @Schema(name = "runSummary", required = false)
  public String getRunSummary() {
    return runSummary;
  }

  public void setRunSummary(String runSummary) {
    this.runSummary = runSummary;
  }

  public PipelineRunImpl startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  
  @Schema(name = "startTime", required = false)
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public PipelineRunImpl state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", required = false)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PipelineRunImpl type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PipelineRunImpl commitId(String commitId) {
    this.commitId = commitId;
    return this;
  }

  /**
   * Get commitId
   * @return commitId
  */
  
  @Schema(name = "commitId", required = false)
  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineRunImpl pipelineRunImpl = (PipelineRunImpl) o;
    return Objects.equals(this.propertyClass, pipelineRunImpl.propertyClass) &&
        Objects.equals(this.links, pipelineRunImpl.links) &&
        Objects.equals(this.durationInMillis, pipelineRunImpl.durationInMillis) &&
        Objects.equals(this.enQueueTime, pipelineRunImpl.enQueueTime) &&
        Objects.equals(this.endTime, pipelineRunImpl.endTime) &&
        Objects.equals(this.estimatedDurationInMillis, pipelineRunImpl.estimatedDurationInMillis) &&
        Objects.equals(this.id, pipelineRunImpl.id) &&
        Objects.equals(this.organization, pipelineRunImpl.organization) &&
        Objects.equals(this.pipeline, pipelineRunImpl.pipeline) &&
        Objects.equals(this.result, pipelineRunImpl.result) &&
        Objects.equals(this.runSummary, pipelineRunImpl.runSummary) &&
        Objects.equals(this.startTime, pipelineRunImpl.startTime) &&
        Objects.equals(this.state, pipelineRunImpl.state) &&
        Objects.equals(this.type, pipelineRunImpl.type) &&
        Objects.equals(this.commitId, pipelineRunImpl.commitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, links, durationInMillis, enQueueTime, endTime, estimatedDurationInMillis, id, organization, pipeline, result, runSummary, startTime, state, type, commitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineRunImpl {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    enQueueTime: ").append(toIndentedString(enQueueTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    estimatedDurationInMillis: ").append(toIndentedString(estimatedDurationInMillis)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    runSummary: ").append(toIndentedString(runSummary)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
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

