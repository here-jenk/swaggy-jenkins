package org.openapitools.model;

import org.openapitools.model.FreeStyleBuild;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class HudsonMasterComputerexecutors  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FreeStyleBuild currentExecutable;

  @ApiModelProperty(value = "")
  private Boolean idle;

  @ApiModelProperty(value = "")
  private Boolean likelyStuck;

  @ApiModelProperty(value = "")
  private Integer number;

  @ApiModelProperty(value = "")
  private Integer progress;

  @ApiModelProperty(value = "")
  private String propertyClass;
 /**
  * Get currentExecutable
  * @return currentExecutable
  */
  @JsonProperty("currentExecutable")
  public FreeStyleBuild getCurrentExecutable() {
    return currentExecutable;
  }

  /**
   * Sets the <code>currentExecutable</code> property.
   */
 public void setCurrentExecutable(FreeStyleBuild currentExecutable) {
    this.currentExecutable = currentExecutable;
  }

  /**
   * Sets the <code>currentExecutable</code> property.
   */
  public HudsonMasterComputerexecutors currentExecutable(FreeStyleBuild currentExecutable) {
    this.currentExecutable = currentExecutable;
    return this;
  }

 /**
  * Get idle
  * @return idle
  */
  @JsonProperty("idle")
  public Boolean getIdle() {
    return idle;
  }

  /**
   * Sets the <code>idle</code> property.
   */
 public void setIdle(Boolean idle) {
    this.idle = idle;
  }

  /**
   * Sets the <code>idle</code> property.
   */
  public HudsonMasterComputerexecutors idle(Boolean idle) {
    this.idle = idle;
    return this;
  }

 /**
  * Get likelyStuck
  * @return likelyStuck
  */
  @JsonProperty("likelyStuck")
  public Boolean getLikelyStuck() {
    return likelyStuck;
  }

  /**
   * Sets the <code>likelyStuck</code> property.
   */
 public void setLikelyStuck(Boolean likelyStuck) {
    this.likelyStuck = likelyStuck;
  }

  /**
   * Sets the <code>likelyStuck</code> property.
   */
  public HudsonMasterComputerexecutors likelyStuck(Boolean likelyStuck) {
    this.likelyStuck = likelyStuck;
    return this;
  }

 /**
  * Get number
  * @return number
  */
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  /**
   * Sets the <code>number</code> property.
   */
 public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * Sets the <code>number</code> property.
   */
  public HudsonMasterComputerexecutors number(Integer number) {
    this.number = number;
    return this;
  }

 /**
  * Get progress
  * @return progress
  */
  @JsonProperty("progress")
  public Integer getProgress() {
    return progress;
  }

  /**
   * Sets the <code>progress</code> property.
   */
 public void setProgress(Integer progress) {
    this.progress = progress;
  }

  /**
   * Sets the <code>progress</code> property.
   */
  public HudsonMasterComputerexecutors progress(Integer progress) {
    this.progress = progress;
    return this;
  }

 /**
  * Get propertyClass
  * @return propertyClass
  */
  @JsonProperty("_class")
  public String getPropertyClass() {
    return propertyClass;
  }

  /**
   * Sets the <code>propertyClass</code> property.
   */
 public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  /**
   * Sets the <code>propertyClass</code> property.
   */
  public HudsonMasterComputerexecutors propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HudsonMasterComputerexecutors {\n");
    
    sb.append("    currentExecutable: ").append(toIndentedString(currentExecutable)).append("\n");
    sb.append("    idle: ").append(toIndentedString(idle)).append("\n");
    sb.append("    likelyStuck: ").append(toIndentedString(likelyStuck)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

