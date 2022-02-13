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
import org.openapitools.model.CauseAction;
import org.openapitools.model.EmptyChangeLogSet;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * FreeStyleBuild
 */
@JsonPropertyOrder({
  FreeStyleBuild.JSON_PROPERTY_PROPERTY_CLASS,
  FreeStyleBuild.JSON_PROPERTY_NUMBER,
  FreeStyleBuild.JSON_PROPERTY_URL,
  FreeStyleBuild.JSON_PROPERTY_ACTIONS,
  FreeStyleBuild.JSON_PROPERTY_BUILDING,
  FreeStyleBuild.JSON_PROPERTY_DESCRIPTION,
  FreeStyleBuild.JSON_PROPERTY_DISPLAY_NAME,
  FreeStyleBuild.JSON_PROPERTY_DURATION,
  FreeStyleBuild.JSON_PROPERTY_ESTIMATED_DURATION,
  FreeStyleBuild.JSON_PROPERTY_EXECUTOR,
  FreeStyleBuild.JSON_PROPERTY_FULL_DISPLAY_NAME,
  FreeStyleBuild.JSON_PROPERTY_ID,
  FreeStyleBuild.JSON_PROPERTY_KEEP_LOG,
  FreeStyleBuild.JSON_PROPERTY_QUEUE_ID,
  FreeStyleBuild.JSON_PROPERTY_RESULT,
  FreeStyleBuild.JSON_PROPERTY_TIMESTAMP,
  FreeStyleBuild.JSON_PROPERTY_BUILT_ON,
  FreeStyleBuild.JSON_PROPERTY_CHANGE_SET
})
@JsonTypeName("FreeStyleBuild")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-02-13T02:16:43.247289Z[Etc/UTC]")
@Introspected
public class FreeStyleBuild {
    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public static final String JSON_PROPERTY_NUMBER = "number";
    private Integer number;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_ACTIONS = "actions";
    private List<CauseAction> actions = null;

    public static final String JSON_PROPERTY_BUILDING = "building";
    private Boolean building;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_DURATION = "duration";
    private Integer duration;

    public static final String JSON_PROPERTY_ESTIMATED_DURATION = "estimatedDuration";
    private Integer estimatedDuration;

    public static final String JSON_PROPERTY_EXECUTOR = "executor";
    private String executor;

    public static final String JSON_PROPERTY_FULL_DISPLAY_NAME = "fullDisplayName";
    private String fullDisplayName;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_KEEP_LOG = "keepLog";
    private Boolean keepLog;

    public static final String JSON_PROPERTY_QUEUE_ID = "queueId";
    private Integer queueId;

    public static final String JSON_PROPERTY_RESULT = "result";
    private String result;

    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    private Integer timestamp;

    public static final String JSON_PROPERTY_BUILT_ON = "builtOn";
    private String builtOn;

    public static final String JSON_PROPERTY_CHANGE_SET = "changeSet";
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

    public FreeStyleBuild number(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getNumber() {
        return number;
    }

    @JsonProperty(JSON_PROPERTY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ACTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<CauseAction> getActions() {
        return actions;
    }

    @JsonProperty(JSON_PROPERTY_ACTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BUILDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getBuilding() {
        return building;
    }

    @JsonProperty(JSON_PROPERTY_BUILDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

    public FreeStyleBuild duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get duration
     * @return duration
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getDuration() {
        return duration;
    }

    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ESTIMATED_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getEstimatedDuration() {
        return estimatedDuration;
    }

    @JsonProperty(JSON_PROPERTY_ESTIMATED_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_EXECUTOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getExecutor() {
        return executor;
    }

    @JsonProperty(JSON_PROPERTY_EXECUTOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_FULL_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getFullDisplayName() {
        return fullDisplayName;
    }

    @JsonProperty(JSON_PROPERTY_FULL_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

    public FreeStyleBuild keepLog(Boolean keepLog) {
        this.keepLog = keepLog;
        return this;
    }

    /**
     * Get keepLog
     * @return keepLog
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_KEEP_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getKeepLog() {
        return keepLog;
    }

    @JsonProperty(JSON_PROPERTY_KEEP_LOG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_QUEUE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getQueueId() {
        return queueId;
    }

    @JsonProperty(JSON_PROPERTY_QUEUE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

    public FreeStyleBuild timestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BUILT_ON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getBuiltOn() {
        return builtOn;
    }

    @JsonProperty(JSON_PROPERTY_BUILT_ON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CHANGE_SET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public EmptyChangeLogSet getChangeSet() {
        return changeSet;
    }

    @JsonProperty(JSON_PROPERTY_CHANGE_SET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
