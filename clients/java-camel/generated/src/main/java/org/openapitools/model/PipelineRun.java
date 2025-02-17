package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineRunartifacts;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PipelineRun
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-06-04T08:08:47.143870Z[Etc/UTC]")
public class PipelineRun {

  @JsonProperty("_class")
  private String propertyClass;

  @JsonProperty("artifacts")
  @Valid
  private List<PipelineRunartifacts> artifacts = null;

  @JsonProperty("durationInMillis")
  private Integer durationInMillis;

  @JsonProperty("estimatedDurationInMillis")
  private Integer estimatedDurationInMillis;

  @JsonProperty("enQueueTime")
  private String enQueueTime;

  @JsonProperty("endTime")
  private String endTime;

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

  public PipelineRun propertyClass(String propertyClass) {
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

  public PipelineRun artifacts(List<PipelineRunartifacts> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public PipelineRun addArtifactsItem(PipelineRunartifacts artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

  /**
   * Get artifacts
   * @return artifacts
  */
  @Valid 
  @Schema(name = "artifacts", required = false)
  public List<PipelineRunartifacts> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<PipelineRunartifacts> artifacts) {
    this.artifacts = artifacts;
  }

  public PipelineRun durationInMillis(Integer durationInMillis) {
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

  public PipelineRun estimatedDurationInMillis(Integer estimatedDurationInMillis) {
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

  public PipelineRun enQueueTime(String enQueueTime) {
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

  public PipelineRun endTime(String endTime) {
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

  public PipelineRun id(String id) {
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

  public PipelineRun organization(String organization) {
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

  public PipelineRun pipeline(String pipeline) {
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

  public PipelineRun result(String result) {
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

  public PipelineRun runSummary(String runSummary) {
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

  public PipelineRun startTime(String startTime) {
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

  public PipelineRun state(String state) {
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

  public PipelineRun type(String type) {
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

  public PipelineRun commitId(String commitId) {
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
    PipelineRun pipelineRun = (PipelineRun) o;
    return Objects.equals(this.propertyClass, pipelineRun.propertyClass) &&
        Objects.equals(this.artifacts, pipelineRun.artifacts) &&
        Objects.equals(this.durationInMillis, pipelineRun.durationInMillis) &&
        Objects.equals(this.estimatedDurationInMillis, pipelineRun.estimatedDurationInMillis) &&
        Objects.equals(this.enQueueTime, pipelineRun.enQueueTime) &&
        Objects.equals(this.endTime, pipelineRun.endTime) &&
        Objects.equals(this.id, pipelineRun.id) &&
        Objects.equals(this.organization, pipelineRun.organization) &&
        Objects.equals(this.pipeline, pipelineRun.pipeline) &&
        Objects.equals(this.result, pipelineRun.result) &&
        Objects.equals(this.runSummary, pipelineRun.runSummary) &&
        Objects.equals(this.startTime, pipelineRun.startTime) &&
        Objects.equals(this.state, pipelineRun.state) &&
        Objects.equals(this.type, pipelineRun.type) &&
        Objects.equals(this.commitId, pipelineRun.commitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, artifacts, durationInMillis, estimatedDurationInMillis, enQueueTime, endTime, id, organization, pipeline, result, runSummary, startTime, state, type, commitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineRun {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    estimatedDurationInMillis: ").append(toIndentedString(estimatedDurationInMillis)).append("\n");
    sb.append("    enQueueTime: ").append(toIndentedString(enQueueTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

