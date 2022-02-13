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
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineRunartifacts;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * PipelineRun
 */
@JsonPropertyOrder({
  PipelineRun.JSON_PROPERTY_PROPERTY_CLASS,
  PipelineRun.JSON_PROPERTY_ARTIFACTS,
  PipelineRun.JSON_PROPERTY_DURATION_IN_MILLIS,
  PipelineRun.JSON_PROPERTY_ESTIMATED_DURATION_IN_MILLIS,
  PipelineRun.JSON_PROPERTY_EN_QUEUE_TIME,
  PipelineRun.JSON_PROPERTY_END_TIME,
  PipelineRun.JSON_PROPERTY_ID,
  PipelineRun.JSON_PROPERTY_ORGANIZATION,
  PipelineRun.JSON_PROPERTY_PIPELINE,
  PipelineRun.JSON_PROPERTY_RESULT,
  PipelineRun.JSON_PROPERTY_RUN_SUMMARY,
  PipelineRun.JSON_PROPERTY_START_TIME,
  PipelineRun.JSON_PROPERTY_STATE,
  PipelineRun.JSON_PROPERTY_TYPE,
  PipelineRun.JSON_PROPERTY_COMMIT_ID
})
@JsonTypeName("PipelineRun")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-02-13T02:16:43.247289Z[Etc/UTC]")
@Introspected
public class PipelineRun {
    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public static final String JSON_PROPERTY_ARTIFACTS = "artifacts";
    private List<PipelineRunartifacts> artifacts = null;

    public static final String JSON_PROPERTY_DURATION_IN_MILLIS = "durationInMillis";
    private Integer durationInMillis;

    public static final String JSON_PROPERTY_ESTIMATED_DURATION_IN_MILLIS = "estimatedDurationInMillis";
    private Integer estimatedDurationInMillis;

    public static final String JSON_PROPERTY_EN_QUEUE_TIME = "enQueueTime";
    private String enQueueTime;

    public static final String JSON_PROPERTY_END_TIME = "endTime";
    private String endTime;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_ORGANIZATION = "organization";
    private String organization;

    public static final String JSON_PROPERTY_PIPELINE = "pipeline";
    private String pipeline;

    public static final String JSON_PROPERTY_RESULT = "result";
    private String result;

    public static final String JSON_PROPERTY_RUN_SUMMARY = "runSummary";
    private String runSummary;

    public static final String JSON_PROPERTY_START_TIME = "startTime";
    private String startTime;

    public static final String JSON_PROPERTY_STATE = "state";
    private String state;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_COMMIT_ID = "commitId";
    private String commitId;

    public PipelineRun() {
    }

    public PipelineRun propertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
        return this;
    }

    /**
     * Get propertyClass
     * @return propertyClass
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getPropertyClass() {
        return propertyClass;
    }

    @JsonProperty(JSON_PROPERTY_PROPERTY_CLASS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setPropertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
    }

    public PipelineRun artifacts(List<PipelineRunartifacts> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public PipelineRun addArtifactsItem(PipelineRunartifacts artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<PipelineRunartifacts>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    /**
     * Get artifacts
     * @return artifacts
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ARTIFACTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<PipelineRunartifacts> getArtifacts() {
        return artifacts;
    }

    @JsonProperty(JSON_PROPERTY_ARTIFACTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DURATION_IN_MILLIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getDurationInMillis() {
        return durationInMillis;
    }

    @JsonProperty(JSON_PROPERTY_DURATION_IN_MILLIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ESTIMATED_DURATION_IN_MILLIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getEstimatedDurationInMillis() {
        return estimatedDurationInMillis;
    }

    @JsonProperty(JSON_PROPERTY_ESTIMATED_DURATION_IN_MILLIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_EN_QUEUE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getEnQueueTime() {
        return enQueueTime;
    }

    @JsonProperty(JSON_PROPERTY_EN_QUEUE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_END_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getEndTime() {
        return endTime;
    }

    @JsonProperty(JSON_PROPERTY_END_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getOrganization() {
        return organization;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PIPELINE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getPipeline() {
        return pipeline;
    }

    @JsonProperty(JSON_PROPERTY_PIPELINE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getResult() {
        return result;
    }

    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RUN_SUMMARY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getRunSummary() {
        return runSummary;
    }

    @JsonProperty(JSON_PROPERTY_RUN_SUMMARY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getStartTime() {
        return startTime;
    }

    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getState() {
        return state;
    }

    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMMIT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getCommitId() {
        return commitId;
    }

    @JsonProperty(JSON_PROPERTY_COMMIT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
