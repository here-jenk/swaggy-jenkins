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


package com.cliffano.swaggyjenkins.model;

import java.util.Objects;
import java.util.Arrays;
import com.cliffano.swaggyjenkins.model.CauseAction;
import com.cliffano.swaggyjenkins.model.EmptyChangeLogSet;
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
 * FreeStyleBuild
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-10T09:45:11.812644Z[Etc/UTC]")
public class FreeStyleBuild {
  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<CauseAction> actions = null;

  public static final String SERIALIZED_NAME_BUILDING = "building";
  @SerializedName(SERIALIZED_NAME_BUILDING)
  private Boolean building;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_ESTIMATED_DURATION = "estimatedDuration";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DURATION)
  private Integer estimatedDuration;

  public static final String SERIALIZED_NAME_EXECUTOR = "executor";
  @SerializedName(SERIALIZED_NAME_EXECUTOR)
  private String executor;

  public static final String SERIALIZED_NAME_FULL_DISPLAY_NAME = "fullDisplayName";
  @SerializedName(SERIALIZED_NAME_FULL_DISPLAY_NAME)
  private String fullDisplayName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEEP_LOG = "keepLog";
  @SerializedName(SERIALIZED_NAME_KEEP_LOG)
  private Boolean keepLog;

  public static final String SERIALIZED_NAME_QUEUE_ID = "queueId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ID)
  private Integer queueId;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_BUILT_ON = "builtOn";
  @SerializedName(SERIALIZED_NAME_BUILT_ON)
  private String builtOn;

  public static final String SERIALIZED_NAME_CHANGE_SET = "changeSet";
  @SerializedName(SERIALIZED_NAME_CHANGE_SET)
  private EmptyChangeLogSet changeSet;

  public FreeStyleBuild() { 
  }

  public FreeStyleBuild propertyClass(String propertyClass) {
    
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyClass() {
    return propertyClass;
  }


  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }


  public FreeStyleBuild number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public FreeStyleBuild url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public FreeStyleBuild actions(List<CauseAction> actions) {
    
    this.actions = actions;
    return this;
  }

  public FreeStyleBuild addActionsItem(CauseAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<CauseAction>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CauseAction> getActions() {
    return actions;
  }


  public void setActions(List<CauseAction> actions) {
    this.actions = actions;
  }


  public FreeStyleBuild building(Boolean building) {
    
    this.building = building;
    return this;
  }

   /**
   * Get building
   * @return building
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBuilding() {
    return building;
  }


  public void setBuilding(Boolean building) {
    this.building = building;
  }


  public FreeStyleBuild description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public FreeStyleBuild displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public FreeStyleBuild duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public FreeStyleBuild estimatedDuration(Integer estimatedDuration) {
    
    this.estimatedDuration = estimatedDuration;
    return this;
  }

   /**
   * Get estimatedDuration
   * @return estimatedDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEstimatedDuration() {
    return estimatedDuration;
  }


  public void setEstimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }


  public FreeStyleBuild executor(String executor) {
    
    this.executor = executor;
    return this;
  }

   /**
   * Get executor
   * @return executor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutor() {
    return executor;
  }


  public void setExecutor(String executor) {
    this.executor = executor;
  }


  public FreeStyleBuild fullDisplayName(String fullDisplayName) {
    
    this.fullDisplayName = fullDisplayName;
    return this;
  }

   /**
   * Get fullDisplayName
   * @return fullDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFullDisplayName() {
    return fullDisplayName;
  }


  public void setFullDisplayName(String fullDisplayName) {
    this.fullDisplayName = fullDisplayName;
  }


  public FreeStyleBuild id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FreeStyleBuild keepLog(Boolean keepLog) {
    
    this.keepLog = keepLog;
    return this;
  }

   /**
   * Get keepLog
   * @return keepLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getKeepLog() {
    return keepLog;
  }


  public void setKeepLog(Boolean keepLog) {
    this.keepLog = keepLog;
  }


  public FreeStyleBuild queueId(Integer queueId) {
    
    this.queueId = queueId;
    return this;
  }

   /**
   * Get queueId
   * @return queueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQueueId() {
    return queueId;
  }


  public void setQueueId(Integer queueId) {
    this.queueId = queueId;
  }


  public FreeStyleBuild result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public FreeStyleBuild timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public FreeStyleBuild builtOn(String builtOn) {
    
    this.builtOn = builtOn;
    return this;
  }

   /**
   * Get builtOn
   * @return builtOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuiltOn() {
    return builtOn;
  }


  public void setBuiltOn(String builtOn) {
    this.builtOn = builtOn;
  }


  public FreeStyleBuild changeSet(EmptyChangeLogSet changeSet) {
    
    this.changeSet = changeSet;
    return this;
  }

   /**
   * Get changeSet
   * @return changeSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmptyChangeLogSet getChangeSet() {
    return changeSet;
  }


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

