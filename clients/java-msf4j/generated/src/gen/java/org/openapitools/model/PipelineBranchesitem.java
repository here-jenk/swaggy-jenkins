package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PipelineBranchesitemlatestRun;
import org.openapitools.model.PipelineBranchesitempullRequest;

/**
 * PipelineBranchesitem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-06-04T08:08:26.779091Z[Etc/UTC]")
public class PipelineBranchesitem   {
  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("estimatedDurationInMillis")
  private Integer estimatedDurationInMillis;

  @JsonProperty("name")
  private String name;

  @JsonProperty("weatherScore")
  private Integer weatherScore;

  @JsonProperty("latestRun")
  private PipelineBranchesitemlatestRun latestRun;

  @JsonProperty("organization")
  private String organization;

  @JsonProperty("pullRequest")
  private PipelineBranchesitempullRequest pullRequest;

  @JsonProperty("totalNumberOfPullRequests")
  private Integer totalNumberOfPullRequests;

  @JsonProperty("_class")
  private String propertyClass;

  public PipelineBranchesitem displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

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
  @ApiModelProperty(value = "")
  public Integer getEstimatedDurationInMillis() {
    return estimatedDurationInMillis;
  }

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
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

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
  @ApiModelProperty(value = "")
  public Integer getWeatherScore() {
    return weatherScore;
  }

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
  @ApiModelProperty(value = "")
  public PipelineBranchesitemlatestRun getLatestRun() {
    return latestRun;
  }

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
  @ApiModelProperty(value = "")
  public String getOrganization() {
    return organization;
  }

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
  @ApiModelProperty(value = "")
  public PipelineBranchesitempullRequest getPullRequest() {
    return pullRequest;
  }

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
  @ApiModelProperty(value = "")
  public Integer getTotalNumberOfPullRequests() {
    return totalNumberOfPullRequests;
  }

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
  @ApiModelProperty(value = "")
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

