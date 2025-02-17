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

import org.openapitools.client.model.PipelinelatestRun;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Pipeline {
  
  @SerializedName("_class")
  private String _class = null;
  @SerializedName("organization")
  private String organization = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("displayName")
  private String displayName = null;
  @SerializedName("fullName")
  private String fullName = null;
  @SerializedName("weatherScore")
  private Integer weatherScore = null;
  @SerializedName("estimatedDurationInMillis")
  private Integer estimatedDurationInMillis = null;
  @SerializedName("latestRun")
  private PipelinelatestRun latestRun = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClass() {
    return _class;
  }
  public void setClass(String _class) {
    this._class = _class;
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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

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
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
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
  public Integer getEstimatedDurationInMillis() {
    return estimatedDurationInMillis;
  }
  public void setEstimatedDurationInMillis(Integer estimatedDurationInMillis) {
    this.estimatedDurationInMillis = estimatedDurationInMillis;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PipelinelatestRun getLatestRun() {
    return latestRun;
  }
  public void setLatestRun(PipelinelatestRun latestRun) {
    this.latestRun = latestRun;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pipeline pipeline = (Pipeline) o;
    return (this._class == null ? pipeline._class == null : this._class.equals(pipeline._class)) &&
        (this.organization == null ? pipeline.organization == null : this.organization.equals(pipeline.organization)) &&
        (this.name == null ? pipeline.name == null : this.name.equals(pipeline.name)) &&
        (this.displayName == null ? pipeline.displayName == null : this.displayName.equals(pipeline.displayName)) &&
        (this.fullName == null ? pipeline.fullName == null : this.fullName.equals(pipeline.fullName)) &&
        (this.weatherScore == null ? pipeline.weatherScore == null : this.weatherScore.equals(pipeline.weatherScore)) &&
        (this.estimatedDurationInMillis == null ? pipeline.estimatedDurationInMillis == null : this.estimatedDurationInMillis.equals(pipeline.estimatedDurationInMillis)) &&
        (this.latestRun == null ? pipeline.latestRun == null : this.latestRun.equals(pipeline.latestRun));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._class == null ? 0: this._class.hashCode());
    result = 31 * result + (this.organization == null ? 0: this.organization.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.displayName == null ? 0: this.displayName.hashCode());
    result = 31 * result + (this.fullName == null ? 0: this.fullName.hashCode());
    result = 31 * result + (this.weatherScore == null ? 0: this.weatherScore.hashCode());
    result = 31 * result + (this.estimatedDurationInMillis == null ? 0: this.estimatedDurationInMillis.hashCode());
    result = 31 * result + (this.latestRun == null ? 0: this.latestRun.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pipeline {\n");
    
    sb.append("  _class: ").append(_class).append("\n");
    sb.append("  organization: ").append(organization).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  fullName: ").append(fullName).append("\n");
    sb.append("  weatherScore: ").append(weatherScore).append("\n");
    sb.append("  estimatedDurationInMillis: ").append(estimatedDurationInMillis).append("\n");
    sb.append("  latestRun: ").append(latestRun).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
