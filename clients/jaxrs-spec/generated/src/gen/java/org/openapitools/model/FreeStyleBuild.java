package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CauseAction;
import org.openapitools.model.EmptyChangeLogSet;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("FreeStyleBuild")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-06-04T08:09:11.684443Z[Etc/UTC]")
public class FreeStyleBuild   {
  
  private @Valid String propertyClass;
  private @Valid Integer number;
  private @Valid String url;
  private @Valid List<CauseAction> actions = new ArrayList<>();
  private @Valid Boolean building;
  private @Valid String description;
  private @Valid String displayName;
  private @Valid Integer duration;
  private @Valid Integer estimatedDuration;
  private @Valid String executor;
  private @Valid String fullDisplayName;
  private @Valid String id;
  private @Valid Boolean keepLog;
  private @Valid Integer queueId;
  private @Valid String result;
  private @Valid Integer timestamp;
  private @Valid String builtOn;
  private @Valid EmptyChangeLogSet changeSet;

  /**
   **/
  public FreeStyleBuild propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_class")
  public String getPropertyClass() {
    return propertyClass;
  }

  @JsonProperty("_class")
  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

/**
   **/
  public FreeStyleBuild number(Integer number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  @JsonProperty("number")
  public void setNumber(Integer number) {
    this.number = number;
  }

/**
   **/
  public FreeStyleBuild url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

/**
   **/
  public FreeStyleBuild actions(List<CauseAction> actions) {
    this.actions = actions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("actions")
  public List<CauseAction> getActions() {
    return actions;
  }

  @JsonProperty("actions")
  public void setActions(List<CauseAction> actions) {
    this.actions = actions;
  }

  public FreeStyleBuild addActionsItem(CauseAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }

    this.actions.add(actionsItem);
    return this;
  }

  public FreeStyleBuild removeActionsItem(CauseAction actionsItem) {
    if (actionsItem != null && this.actions != null) {
      this.actions.remove(actionsItem);
    }

    return this;
  }
/**
   **/
  public FreeStyleBuild building(Boolean building) {
    this.building = building;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("building")
  public Boolean getBuilding() {
    return building;
  }

  @JsonProperty("building")
  public void setBuilding(Boolean building) {
    this.building = building;
  }

/**
   **/
  public FreeStyleBuild description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

/**
   **/
  public FreeStyleBuild displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

/**
   **/
  public FreeStyleBuild duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  @JsonProperty("duration")
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

/**
   **/
  public FreeStyleBuild estimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedDuration")
  public Integer getEstimatedDuration() {
    return estimatedDuration;
  }

  @JsonProperty("estimatedDuration")
  public void setEstimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }

/**
   **/
  public FreeStyleBuild executor(String executor) {
    this.executor = executor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("executor")
  public String getExecutor() {
    return executor;
  }

  @JsonProperty("executor")
  public void setExecutor(String executor) {
    this.executor = executor;
  }

/**
   **/
  public FreeStyleBuild fullDisplayName(String fullDisplayName) {
    this.fullDisplayName = fullDisplayName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fullDisplayName")
  public String getFullDisplayName() {
    return fullDisplayName;
  }

  @JsonProperty("fullDisplayName")
  public void setFullDisplayName(String fullDisplayName) {
    this.fullDisplayName = fullDisplayName;
  }

/**
   **/
  public FreeStyleBuild id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   **/
  public FreeStyleBuild keepLog(Boolean keepLog) {
    this.keepLog = keepLog;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keepLog")
  public Boolean getKeepLog() {
    return keepLog;
  }

  @JsonProperty("keepLog")
  public void setKeepLog(Boolean keepLog) {
    this.keepLog = keepLog;
  }

/**
   **/
  public FreeStyleBuild queueId(Integer queueId) {
    this.queueId = queueId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queueId")
  public Integer getQueueId() {
    return queueId;
  }

  @JsonProperty("queueId")
  public void setQueueId(Integer queueId) {
    this.queueId = queueId;
  }

/**
   **/
  public FreeStyleBuild result(String result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  @JsonProperty("result")
  public void setResult(String result) {
    this.result = result;
  }

/**
   **/
  public FreeStyleBuild timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }

  @JsonProperty("timestamp")
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

/**
   **/
  public FreeStyleBuild builtOn(String builtOn) {
    this.builtOn = builtOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("builtOn")
  public String getBuiltOn() {
    return builtOn;
  }

  @JsonProperty("builtOn")
  public void setBuiltOn(String builtOn) {
    this.builtOn = builtOn;
  }

/**
   **/
  public FreeStyleBuild changeSet(EmptyChangeLogSet changeSet) {
    this.changeSet = changeSet;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("changeSet")
  public EmptyChangeLogSet getChangeSet() {
    return changeSet;
  }

  @JsonProperty("changeSet")
  public void setChangeSet(EmptyChangeLogSet changeSet) {
    this.changeSet = changeSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeStyleBuild freeStyleBuild = (FreeStyleBuild) o;
    return Objects.equals(this.propertyClass, freeStyleBuild.propertyClass) &&
        Objects.equals(this.number, freeStyleBuild.number) &&
        Objects.equals(this.url, freeStyleBuild.url) &&
        Objects.equals(this.actions, freeStyleBuild.actions) &&
        Objects.equals(this.building, freeStyleBuild.building) &&
        Objects.equals(this.description, freeStyleBuild.description) &&
        Objects.equals(this.displayName, freeStyleBuild.displayName) &&
        Objects.equals(this.duration, freeStyleBuild.duration) &&
        Objects.equals(this.estimatedDuration, freeStyleBuild.estimatedDuration) &&
        Objects.equals(this.executor, freeStyleBuild.executor) &&
        Objects.equals(this.fullDisplayName, freeStyleBuild.fullDisplayName) &&
        Objects.equals(this.id, freeStyleBuild.id) &&
        Objects.equals(this.keepLog, freeStyleBuild.keepLog) &&
        Objects.equals(this.queueId, freeStyleBuild.queueId) &&
        Objects.equals(this.result, freeStyleBuild.result) &&
        Objects.equals(this.timestamp, freeStyleBuild.timestamp) &&
        Objects.equals(this.builtOn, freeStyleBuild.builtOn) &&
        Objects.equals(this.changeSet, freeStyleBuild.changeSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, number, url, actions, building, description, displayName, duration, estimatedDuration, executor, fullDisplayName, id, keepLog, queueId, result, timestamp, builtOn, changeSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeStyleBuild {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
    sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
    sb.append("    fullDisplayName: ").append(toIndentedString(fullDisplayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keepLog: ").append(toIndentedString(keepLog)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    builtOn: ").append(toIndentedString(builtOn)).append("\n");
    sb.append("    changeSet: ").append(toIndentedString(changeSet)).append("\n");
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

