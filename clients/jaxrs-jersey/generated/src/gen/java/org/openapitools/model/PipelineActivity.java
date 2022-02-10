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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineActivityartifacts;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PipelineActivity
 */
@JsonPropertyOrder({
  PipelineActivity.JSON_PROPERTY_PROPERTY_CLASS,
  PipelineActivity.JSON_PROPERTY_ARTIFACTS,
  PipelineActivity.JSON_PROPERTY_DURATION_IN_MILLIS,
  PipelineActivity.JSON_PROPERTY_ESTIMATED_DURATION_IN_MILLIS,
  PipelineActivity.JSON_PROPERTY_EN_QUEUE_TIME,
  PipelineActivity.JSON_PROPERTY_END_TIME,
  PipelineActivity.JSON_PROPERTY_ID,
  PipelineActivity.JSON_PROPERTY_ORGANIZATION,
  PipelineActivity.JSON_PROPERTY_PIPELINE,
  PipelineActivity.JSON_PROPERTY_RESULT,
  PipelineActivity.JSON_PROPERTY_RUN_SUMMARY,
  PipelineActivity.JSON_PROPERTY_START_TIME,
  PipelineActivity.JSON_PROPERTY_STATE,
  PipelineActivity.JSON_PROPERTY_TYPE,
  PipelineActivity.JSON_PROPERTY_COMMIT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-02-10T09:47:07.448540Z[Etc/UTC]")
public class PipelineActivity   {
  public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
  @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
  private String propertyClass;

  public static final String JSON_PROPERTY_ARTIFACTS = "artifacts";
  @JsonProperty(JSON_PROPERTY_ARTIFACTS)
  private List<PipelineActivityartifacts> artifacts = null;

  public static final String JSON_PROPERTY_DURATION_IN_MILLIS = "durationInMillis";
  @JsonProperty(JSON_PROPERTY_DURATION_IN_MILLIS)
  private Integer durationInMillis;

  public static final String JSON_PROPERTY_ESTIMATED_DURATION_IN_MILLIS = "estimatedDurationInMillis";
  @JsonProperty(JSON_PROPERTY_ESTIMATED_DURATION_IN_MILLIS)
  private Integer estimatedDurationInMillis;

  public static final String JSON_PROPERTY_EN_QUEUE_TIME = "enQueueTime";
  @JsonProperty(JSON_PROPERTY_EN_QUEUE_TIME)
  private String enQueueTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  @JsonProperty(JSON_PROPERTY_END_TIME)
  private String endTime;

  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  private String organization;

  public static final String JSON_PROPERTY_PIPELINE = "pipeline";
  @JsonProperty(JSON_PROPERTY_PIPELINE)
  private String pipeline;

  public static final String JSON_PROPERTY_RESULT = "result";
  @JsonProperty(JSON_PROPERTY_RESULT)
  private String result;

  public static final String JSON_PROPERTY_RUN_SUMMARY = "runSummary";
  @JsonProperty(JSON_PROPERTY_RUN_SUMMARY)
  private String runSummary;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  @JsonProperty(JSON_PROPERTY_START_TIME)
  private String startTime;

  public static final String JSON_PROPERTY_STATE = "state";
  @JsonProperty(JSON_PROPERTY_STATE)
  private String state;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public static final String JSON_PROPERTY_COMMIT_ID = "commitId";
  @JsonProperty(JSON_PROPERTY_COMMIT_ID)
  private String commitId;

  public PipelineActivity propertyClass(String propertyClass) {
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

  public PipelineActivity artifacts(List<PipelineActivityartifacts> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public PipelineActivity addArtifactsItem(PipelineActivityartifacts artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<PipelineActivityartifacts>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

  /**
   * Get artifacts
   * @return artifacts
   **/
  @JsonProperty(value = "artifacts")
  @ApiModelProperty(value = "")
  @Valid 
  public List<PipelineActivityartifacts> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<PipelineActivityartifacts> artifacts) {
    this.artifacts = artifacts;
  }

  public PipelineActivity durationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
  }

  /**
   * Get durationInMillis
   * @return durationInMillis
   **/
  @JsonProperty(value = "durationInMillis")
  @ApiModelProperty(value = "")
  
  public Integer getDurationInMillis() {
    return durationInMillis;
  }

  public void setDurationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
  }

  public PipelineActivity estimatedDurationInMillis(Integer estimatedDurationInMillis) {
    this.estimatedDurationInMillis = estimatedDurationInMillis;
    return this;
  }

  /**
   * Get estimatedDurationInMillis
   * @return estimatedDurationInMillis
   **/
  @JsonProperty(value = "estimatedDurationInMillis")
  @ApiModelProperty(value = "")
  
  public Integer getEstimatedDurationInMillis() {
    return estimatedDurationInMillis;
  }

  public void setEstimatedDurationInMillis(Integer estimatedDurationInMillis) {
    this.estimatedDurationInMillis = estimatedDurationInMillis;
  }

  public PipelineActivity enQueueTime(String enQueueTime) {
    this.enQueueTime = enQueueTime;
    return this;
  }

  /**
   * Get enQueueTime
   * @return enQueueTime
   **/
  @JsonProperty(value = "enQueueTime")
  @ApiModelProperty(value = "")
  
  public String getEnQueueTime() {
    return enQueueTime;
  }

  public void setEnQueueTime(String enQueueTime) {
    this.enQueueTime = enQueueTime;
  }

  public PipelineActivity endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   **/
  @JsonProperty(value = "endTime")
  @ApiModelProperty(value = "")
  
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public PipelineActivity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(value = "")
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PipelineActivity organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   **/
  @JsonProperty(value = "organization")
  @ApiModelProperty(value = "")
  
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public PipelineActivity pipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

  /**
   * Get pipeline
   * @return pipeline
   **/
  @JsonProperty(value = "pipeline")
  @ApiModelProperty(value = "")
  
  public String getPipeline() {
    return pipeline;
  }

  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }

  public PipelineActivity result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   **/
  @JsonProperty(value = "result")
  @ApiModelProperty(value = "")
  
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public PipelineActivity runSummary(String runSummary) {
    this.runSummary = runSummary;
    return this;
  }

  /**
   * Get runSummary
   * @return runSummary
   **/
  @JsonProperty(value = "runSummary")
  @ApiModelProperty(value = "")
  
  public String getRunSummary() {
    return runSummary;
  }

  public void setRunSummary(String runSummary) {
    this.runSummary = runSummary;
  }

  public PipelineActivity startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   **/
  @JsonProperty(value = "startTime")
  @ApiModelProperty(value = "")
  
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public PipelineActivity state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @JsonProperty(value = "state")
  @ApiModelProperty(value = "")
  
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PipelineActivity type(String type) {
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

  public PipelineActivity commitId(String commitId) {
    this.commitId = commitId;
    return this;
  }

  /**
   * Get commitId
   * @return commitId
   **/
  @JsonProperty(value = "commitId")
  @ApiModelProperty(value = "")
  
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
    PipelineActivity pipelineActivity = (PipelineActivity) o;
    return Objects.equals(this.propertyClass, pipelineActivity.propertyClass) &&
        Objects.equals(this.artifacts, pipelineActivity.artifacts) &&
        Objects.equals(this.durationInMillis, pipelineActivity.durationInMillis) &&
        Objects.equals(this.estimatedDurationInMillis, pipelineActivity.estimatedDurationInMillis) &&
        Objects.equals(this.enQueueTime, pipelineActivity.enQueueTime) &&
        Objects.equals(this.endTime, pipelineActivity.endTime) &&
        Objects.equals(this.id, pipelineActivity.id) &&
        Objects.equals(this.organization, pipelineActivity.organization) &&
        Objects.equals(this.pipeline, pipelineActivity.pipeline) &&
        Objects.equals(this.result, pipelineActivity.result) &&
        Objects.equals(this.runSummary, pipelineActivity.runSummary) &&
        Objects.equals(this.startTime, pipelineActivity.startTime) &&
        Objects.equals(this.state, pipelineActivity.state) &&
        Objects.equals(this.type, pipelineActivity.type) &&
        Objects.equals(this.commitId, pipelineActivity.commitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, artifacts, durationInMillis, estimatedDurationInMillis, enQueueTime, endTime, id, organization, pipeline, result, runSummary, startTime, state, type, commitId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineActivity {\n");
    
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

