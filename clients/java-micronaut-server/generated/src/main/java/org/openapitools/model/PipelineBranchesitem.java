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
import org.openapitools.model.PipelineBranchesitemlatestRun;
import org.openapitools.model.PipelineBranchesitempullRequest;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * PipelineBranchesitem
 */
@JsonPropertyOrder({
  PipelineBranchesitem.JSON_PROPERTY_DISPLAY_NAME,
  PipelineBranchesitem.JSON_PROPERTY_ESTIMATED_DURATION_IN_MILLIS,
  PipelineBranchesitem.JSON_PROPERTY_NAME,
  PipelineBranchesitem.JSON_PROPERTY_WEATHER_SCORE,
  PipelineBranchesitem.JSON_PROPERTY_LATEST_RUN,
  PipelineBranchesitem.JSON_PROPERTY_ORGANIZATION,
  PipelineBranchesitem.JSON_PROPERTY_PULL_REQUEST,
  PipelineBranchesitem.JSON_PROPERTY_TOTAL_NUMBER_OF_PULL_REQUESTS,
  PipelineBranchesitem.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("PipelineBranchesitem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-02-11T12:41:40.232851Z[Etc/UTC]")
@Introspected
public class PipelineBranchesitem {
    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_ESTIMATED_DURATION_IN_MILLIS = "estimatedDurationInMillis";
    private Integer estimatedDurationInMillis;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_WEATHER_SCORE = "weatherScore";
    private Integer weatherScore;

    public static final String JSON_PROPERTY_LATEST_RUN = "latestRun";
    private PipelineBranchesitemlatestRun latestRun;

    public static final String JSON_PROPERTY_ORGANIZATION = "organization";
    private String organization;

    public static final String JSON_PROPERTY_PULL_REQUEST = "pullRequest";
    private PipelineBranchesitempullRequest pullRequest;

    public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_PULL_REQUESTS = "totalNumberOfPullRequests";
    private Integer totalNumberOfPullRequests;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public PipelineBranchesitem() {
    }

    public PipelineBranchesitem displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     * @return displayName
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getDisplayName() {
        return displayName;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PipelineBranchesitem estimatedDurationInMillis(Integer estimatedDurationInMillis) {
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

    public PipelineBranchesitem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setName(String name) {
        this.name = name;
    }

    public PipelineBranchesitem weatherScore(Integer weatherScore) {
        this.weatherScore = weatherScore;
        return this;
    }

    /**
     * Get weatherScore
     * @return weatherScore
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_WEATHER_SCORE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getWeatherScore() {
        return weatherScore;
    }

    @JsonProperty(JSON_PROPERTY_WEATHER_SCORE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setWeatherScore(Integer weatherScore) {
        this.weatherScore = weatherScore;
    }

    public PipelineBranchesitem latestRun(PipelineBranchesitemlatestRun latestRun) {
        this.latestRun = latestRun;
        return this;
    }

    /**
     * Get latestRun
     * @return latestRun
     **/
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LATEST_RUN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public PipelineBranchesitemlatestRun getLatestRun() {
        return latestRun;
    }

    @JsonProperty(JSON_PROPERTY_LATEST_RUN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setLatestRun(PipelineBranchesitemlatestRun latestRun) {
        this.latestRun = latestRun;
    }

    public PipelineBranchesitem organization(String organization) {
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

    public PipelineBranchesitem pullRequest(PipelineBranchesitempullRequest pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     **/
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PULL_REQUEST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public PipelineBranchesitempullRequest getPullRequest() {
        return pullRequest;
    }

    @JsonProperty(JSON_PROPERTY_PULL_REQUEST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setPullRequest(PipelineBranchesitempullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public PipelineBranchesitem totalNumberOfPullRequests(Integer totalNumberOfPullRequests) {
        this.totalNumberOfPullRequests = totalNumberOfPullRequests;
        return this;
    }

    /**
     * Get totalNumberOfPullRequests
     * @return totalNumberOfPullRequests
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_PULL_REQUESTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getTotalNumberOfPullRequests() {
        return totalNumberOfPullRequests;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_PULL_REQUESTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setTotalNumberOfPullRequests(Integer totalNumberOfPullRequests) {
        this.totalNumberOfPullRequests = totalNumberOfPullRequests;
    }

    public PipelineBranchesitem propertyClass(String propertyClass) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineBranchesitem pipelineBranchesitem = (PipelineBranchesitem) o;
        return Objects.equals(this.displayName, pipelineBranchesitem.displayName) &&
            Objects.equals(this.estimatedDurationInMillis, pipelineBranchesitem.estimatedDurationInMillis) &&
            Objects.equals(this.name, pipelineBranchesitem.name) &&
            Objects.equals(this.weatherScore, pipelineBranchesitem.weatherScore) &&
            Objects.equals(this.latestRun, pipelineBranchesitem.latestRun) &&
            Objects.equals(this.organization, pipelineBranchesitem.organization) &&
            Objects.equals(this.pullRequest, pipelineBranchesitem.pullRequest) &&
            Objects.equals(this.totalNumberOfPullRequests, pipelineBranchesitem.totalNumberOfPullRequests) &&
            Objects.equals(this.propertyClass, pipelineBranchesitem.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, estimatedDurationInMillis, name, weatherScore, latestRun, organization, pullRequest, totalNumberOfPullRequests, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineBranchesitem {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    estimatedDurationInMillis: ").append(toIndentedString(estimatedDurationInMillis)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weatherScore: ").append(toIndentedString(weatherScore)).append("\n");
        sb.append("    latestRun: ").append(toIndentedString(latestRun)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
        sb.append("    totalNumberOfPullRequests: ").append(toIndentedString(totalNumberOfPullRequests)).append("\n");
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
