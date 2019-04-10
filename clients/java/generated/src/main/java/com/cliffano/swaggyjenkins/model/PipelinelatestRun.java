/*
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * OpenAPI spec version: 1.1.1
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cliffano.swaggyjenkins.model;

import java.util.Objects;
import java.util.Arrays;
import com.cliffano.swaggyjenkins.model.PipelinelatestRunartifacts;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PipelinelatestRun
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-10T13:31:03.355Z[GMT]")
public class PipelinelatestRun {
  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  private List<PipelinelatestRunartifacts> artifacts = null;

  public static final String SERIALIZED_NAME_DURATION_IN_MILLIS = "durationInMillis";
  @SerializedName(SERIALIZED_NAME_DURATION_IN_MILLIS)
  private Integer durationInMillis = null;

  public static final String SERIALIZED_NAME_ESTIMATED_DURATION_IN_MILLIS = "estimatedDurationInMillis";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DURATION_IN_MILLIS)
  private Integer estimatedDurationInMillis = null;

  public static final String SERIALIZED_NAME_EN_QUEUE_TIME = "enQueueTime";
  @SerializedName(SERIALIZED_NAME_EN_QUEUE_TIME)
  private String enQueueTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization = null;

  public static final String SERIALIZED_NAME_PIPELINE = "pipeline";
  @SerializedName(SERIALIZED_NAME_PIPELINE)
  private String pipeline = null;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result = null;

  public static final String SERIALIZED_NAME_RUN_SUMMARY = "runSummary";
  @SerializedName(SERIALIZED_NAME_RUN_SUMMARY)
  private String runSummary = null;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public static final String SERIALIZED_NAME_COMMIT_ID = "commitId";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId = null;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass = null;

  public PipelinelatestRun artifacts(List<PipelinelatestRunartifacts> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public PipelinelatestRun addArtifactsItem(PipelinelatestRunartifacts artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<PipelinelatestRunartifacts>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * Get artifacts
   * @return artifacts
  **/
  @ApiModelProperty(value = "")
  public List<PipelinelatestRunartifacts> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<PipelinelatestRunartifacts> artifacts) {
    this.artifacts = artifacts;
  }

  public PipelinelatestRun durationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
  }

   /**
   * Get durationInMillis
   * @return durationInMillis
  **/
  @ApiModelProperty(value = "")
  public Integer getDurationInMillis() {
    return durationInMillis;
  }

  public void setDurationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
  }

  public PipelinelatestRun estimatedDurationInMillis(Integer estimatedDurationInMillis) {
    this.estimatedDurationInMillis = estimatedDurationInMillis;
    return this;
  }

   /**
   * Get estimatedDurationInMillis
   * @return estimatedDurationInMillis
  **/
  @ApiModelProperty(value = "")
  public Integer getEstimatedDurationInMillis() {
    return estimatedDurationInMillis;
  }

  public void setEstimatedDurationInMillis(Integer estimatedDurationInMillis) {
    this.estimatedDurationInMillis = estimatedDurationInMillis;
  }

  public PipelinelatestRun enQueueTime(String enQueueTime) {
    this.enQueueTime = enQueueTime;
    return this;
  }

   /**
   * Get enQueueTime
   * @return enQueueTime
  **/
  @ApiModelProperty(value = "")
  public String getEnQueueTime() {
    return enQueueTime;
  }

  public void setEnQueueTime(String enQueueTime) {
    this.enQueueTime = enQueueTime;
  }

  public PipelinelatestRun endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public PipelinelatestRun id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PipelinelatestRun organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(value = "")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public PipelinelatestRun pipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Get pipeline
   * @return pipeline
  **/
  @ApiModelProperty(value = "")
  public String getPipeline() {
    return pipeline;
  }

  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }

  public PipelinelatestRun result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public PipelinelatestRun runSummary(String runSummary) {
    this.runSummary = runSummary;
    return this;
  }

   /**
   * Get runSummary
   * @return runSummary
  **/
  @ApiModelProperty(value = "")
  public String getRunSummary() {
    return runSummary;
  }

  public void setRunSummary(String runSummary) {
    this.runSummary = runSummary;
  }

  public PipelinelatestRun startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public PipelinelatestRun state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PipelinelatestRun type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PipelinelatestRun commitId(String commitId) {
    this.commitId = commitId;
    return this;
  }

   /**
   * Get commitId
   * @return commitId
  **/
  @ApiModelProperty(value = "")
  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }

  public PipelinelatestRun propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @ApiModelProperty(value = "")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelinelatestRun pipelinelatestRun = (PipelinelatestRun) o;
    return Objects.equals(this.artifacts, pipelinelatestRun.artifacts) &&
        Objects.equals(this.durationInMillis, pipelinelatestRun.durationInMillis) &&
        Objects.equals(this.estimatedDurationInMillis, pipelinelatestRun.estimatedDurationInMillis) &&
        Objects.equals(this.enQueueTime, pipelinelatestRun.enQueueTime) &&
        Objects.equals(this.endTime, pipelinelatestRun.endTime) &&
        Objects.equals(this.id, pipelinelatestRun.id) &&
        Objects.equals(this.organization, pipelinelatestRun.organization) &&
        Objects.equals(this.pipeline, pipelinelatestRun.pipeline) &&
        Objects.equals(this.result, pipelinelatestRun.result) &&
        Objects.equals(this.runSummary, pipelinelatestRun.runSummary) &&
        Objects.equals(this.startTime, pipelinelatestRun.startTime) &&
        Objects.equals(this.state, pipelinelatestRun.state) &&
        Objects.equals(this.type, pipelinelatestRun.type) &&
        Objects.equals(this.commitId, pipelinelatestRun.commitId) &&
        Objects.equals(this.propertyClass, pipelinelatestRun.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, durationInMillis, estimatedDurationInMillis, enQueueTime, endTime, id, organization, pipeline, result, runSummary, startTime, state, type, commitId, propertyClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelinelatestRun {\n");
    
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
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

