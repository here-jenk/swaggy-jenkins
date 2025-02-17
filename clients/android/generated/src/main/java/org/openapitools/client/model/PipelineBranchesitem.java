/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.PipelineBranchesitemlatestRun;
import org.openapitools.client.model.PipelineBranchesitempullRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PipelineBranchesitem {
  
  @SerializedName("displayName")
  private String displayName = null;
  @SerializedName("estimatedDurationInMillis")
  private Integer estimatedDurationInMillis = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("weatherScore")
  private Integer weatherScore = null;
  @SerializedName("latestRun")
  private PipelineBranchesitemlatestRun latestRun = null;
  @SerializedName("organization")
  private String organization = null;
  @SerializedName("pullRequest")
  private PipelineBranchesitempullRequest pullRequest = null;
  @SerializedName("totalNumberOfPullRequests")
  private Integer totalNumberOfPullRequests = null;
  @SerializedName("_class")
  private String _class = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEstimatedDurationInMillis() {
    return estimatedDurationInMillis;
  }
  public void setEstimatedDurationInMillis(Integer estimatedDurationInMillis) {
    this.estimatedDurationInMillis = estimatedDurationInMillis;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getWeatherScore() {
    return weatherScore;
  }
  public void setWeatherScore(Integer weatherScore) {
    this.weatherScore = weatherScore;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PipelineBranchesitemlatestRun getLatestRun() {
    return latestRun;
  }
  public void setLatestRun(PipelineBranchesitemlatestRun latestRun) {
    this.latestRun = latestRun;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PipelineBranchesitempullRequest getPullRequest() {
    return pullRequest;
  }
  public void setPullRequest(PipelineBranchesitempullRequest pullRequest) {
    this.pullRequest = pullRequest;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalNumberOfPullRequests() {
    return totalNumberOfPullRequests;
  }
  public void setTotalNumberOfPullRequests(Integer totalNumberOfPullRequests) {
    this.totalNumberOfPullRequests = totalNumberOfPullRequests;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClass() {
    return _class;
  }
  public void setClass(String _class) {
    this._class = _class;
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
    return (this.displayName == null ? pipelineBranchesitem.displayName == null : this.displayName.equals(pipelineBranchesitem.displayName)) &&
        (this.estimatedDurationInMillis == null ? pipelineBranchesitem.estimatedDurationInMillis == null : this.estimatedDurationInMillis.equals(pipelineBranchesitem.estimatedDurationInMillis)) &&
        (this.name == null ? pipelineBranchesitem.name == null : this.name.equals(pipelineBranchesitem.name)) &&
        (this.weatherScore == null ? pipelineBranchesitem.weatherScore == null : this.weatherScore.equals(pipelineBranchesitem.weatherScore)) &&
        (this.latestRun == null ? pipelineBranchesitem.latestRun == null : this.latestRun.equals(pipelineBranchesitem.latestRun)) &&
        (this.organization == null ? pipelineBranchesitem.organization == null : this.organization.equals(pipelineBranchesitem.organization)) &&
        (this.pullRequest == null ? pipelineBranchesitem.pullRequest == null : this.pullRequest.equals(pipelineBranchesitem.pullRequest)) &&
        (this.totalNumberOfPullRequests == null ? pipelineBranchesitem.totalNumberOfPullRequests == null : this.totalNumberOfPullRequests.equals(pipelineBranchesitem.totalNumberOfPullRequests)) &&
        (this._class == null ? pipelineBranchesitem._class == null : this._class.equals(pipelineBranchesitem._class));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.estimatedDurationInMillis == null ? 0: this.estimatedDurationInMillis.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.weatherScore == null ? 0: this.weatherScore.hashCode());
    result = 31 * result + (this.latestRun == null ? 0: this.latestRun.hashCode());
    result = 31 * result + (this.organization == null ? 0: this.organization.hashCode());
    result = 31 * result + (this.pullRequest == null ? 0: this.pullRequest.hashCode());
    result = 31 * result + (this.totalNumberOfPullRequests == null ? 0: this.totalNumberOfPullRequests.hashCode());
    result = 31 * result + (this._class == null ? 0: this._class.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineBranchesitem {\n");
    
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  estimatedDurationInMillis: ").append(estimatedDurationInMillis).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  weatherScore: ").append(weatherScore).append("\n");
    sb.append("  latestRun: ").append(latestRun).append("\n");
    sb.append("  organization: ").append(organization).append("\n");
    sb.append("  pullRequest: ").append(pullRequest).append("\n");
    sb.append("  totalNumberOfPullRequests: ").append(totalNumberOfPullRequests).append("\n");
    sb.append("  _class: ").append(_class).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
