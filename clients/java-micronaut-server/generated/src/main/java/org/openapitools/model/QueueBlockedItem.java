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
import org.openapitools.model.FreeStyleProject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * QueueBlockedItem
 */
@JsonPropertyOrder({
  QueueBlockedItem.JSON_PROPERTY_PROPERTY_CLASS,
  QueueBlockedItem.JSON_PROPERTY_ACTIONS,
  QueueBlockedItem.JSON_PROPERTY_BLOCKED,
  QueueBlockedItem.JSON_PROPERTY_BUILDABLE,
  QueueBlockedItem.JSON_PROPERTY_ID,
  QueueBlockedItem.JSON_PROPERTY_IN_QUEUE_SINCE,
  QueueBlockedItem.JSON_PROPERTY_PARAMS,
  QueueBlockedItem.JSON_PROPERTY_STUCK,
  QueueBlockedItem.JSON_PROPERTY_TASK,
  QueueBlockedItem.JSON_PROPERTY_URL,
  QueueBlockedItem.JSON_PROPERTY_WHY,
  QueueBlockedItem.JSON_PROPERTY_BUILDABLE_START_MILLISECONDS
})
@JsonTypeName("QueueBlockedItem")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-02-11T12:41:40.232851Z[Etc/UTC]")
@Introspected
public class QueueBlockedItem {
    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public static final String JSON_PROPERTY_ACTIONS = "actions";
    private List<CauseAction> actions = null;

    public static final String JSON_PROPERTY_BLOCKED = "blocked";
    private Boolean blocked;

    public static final String JSON_PROPERTY_BUILDABLE = "buildable";
    private Boolean buildable;

    public static final String JSON_PROPERTY_ID = "id";
    private Integer id;

    public static final String JSON_PROPERTY_IN_QUEUE_SINCE = "inQueueSince";
    private Integer inQueueSince;

    public static final String JSON_PROPERTY_PARAMS = "params";
    private String params;

    public static final String JSON_PROPERTY_STUCK = "stuck";
    private Boolean stuck;

    public static final String JSON_PROPERTY_TASK = "task";
    private FreeStyleProject task;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_WHY = "why";
    private String why;

    public static final String JSON_PROPERTY_BUILDABLE_START_MILLISECONDS = "buildableStartMilliseconds";
    private Integer buildableStartMilliseconds;

    public QueueBlockedItem() {
    }

    public QueueBlockedItem propertyClass(String propertyClass) {
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

    public QueueBlockedItem actions(List<CauseAction> actions) {
        this.actions = actions;
        return this;
    }

    public QueueBlockedItem addActionsItem(CauseAction actionsItem) {
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

    public QueueBlockedItem blocked(Boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    /**
     * Get blocked
     * @return blocked
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BLOCKED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getBlocked() {
        return blocked;
    }

    @JsonProperty(JSON_PROPERTY_BLOCKED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public QueueBlockedItem buildable(Boolean buildable) {
        this.buildable = buildable;
        return this;
    }

    /**
     * Get buildable
     * @return buildable
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BUILDABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getBuildable() {
        return buildable;
    }

    @JsonProperty(JSON_PROPERTY_BUILDABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setBuildable(Boolean buildable) {
        this.buildable = buildable;
    }

    public QueueBlockedItem id(Integer id) {
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
       public Integer getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setId(Integer id) {
        this.id = id;
    }

    public QueueBlockedItem inQueueSince(Integer inQueueSince) {
        this.inQueueSince = inQueueSince;
        return this;
    }

    /**
     * Get inQueueSince
     * @return inQueueSince
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_IN_QUEUE_SINCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getInQueueSince() {
        return inQueueSince;
    }

    @JsonProperty(JSON_PROPERTY_IN_QUEUE_SINCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setInQueueSince(Integer inQueueSince) {
        this.inQueueSince = inQueueSince;
    }

    public QueueBlockedItem params(String params) {
        this.params = params;
        return this;
    }

    /**
     * Get params
     * @return params
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getParams() {
        return params;
    }

    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setParams(String params) {
        this.params = params;
    }

    public QueueBlockedItem stuck(Boolean stuck) {
        this.stuck = stuck;
        return this;
    }

    /**
     * Get stuck
     * @return stuck
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STUCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getStuck() {
        return stuck;
    }

    @JsonProperty(JSON_PROPERTY_STUCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setStuck(Boolean stuck) {
        this.stuck = stuck;
    }

    public QueueBlockedItem task(FreeStyleProject task) {
        this.task = task;
        return this;
    }

    /**
     * Get task
     * @return task
     **/
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TASK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public FreeStyleProject getTask() {
        return task;
    }

    @JsonProperty(JSON_PROPERTY_TASK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setTask(FreeStyleProject task) {
        this.task = task;
    }

    public QueueBlockedItem url(String url) {
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

    public QueueBlockedItem why(String why) {
        this.why = why;
        return this;
    }

    /**
     * Get why
     * @return why
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_WHY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getWhy() {
        return why;
    }

    @JsonProperty(JSON_PROPERTY_WHY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setWhy(String why) {
        this.why = why;
    }

    public QueueBlockedItem buildableStartMilliseconds(Integer buildableStartMilliseconds) {
        this.buildableStartMilliseconds = buildableStartMilliseconds;
        return this;
    }

    /**
     * Get buildableStartMilliseconds
     * @return buildableStartMilliseconds
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BUILDABLE_START_MILLISECONDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getBuildableStartMilliseconds() {
        return buildableStartMilliseconds;
    }

    @JsonProperty(JSON_PROPERTY_BUILDABLE_START_MILLISECONDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setBuildableStartMilliseconds(Integer buildableStartMilliseconds) {
        this.buildableStartMilliseconds = buildableStartMilliseconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueueBlockedItem queueBlockedItem = (QueueBlockedItem) o;
        return Objects.equals(this.propertyClass, queueBlockedItem.propertyClass) &&
            Objects.equals(this.actions, queueBlockedItem.actions) &&
            Objects.equals(this.blocked, queueBlockedItem.blocked) &&
            Objects.equals(this.buildable, queueBlockedItem.buildable) &&
            Objects.equals(this.id, queueBlockedItem.id) &&
            Objects.equals(this.inQueueSince, queueBlockedItem.inQueueSince) &&
            Objects.equals(this.params, queueBlockedItem.params) &&
            Objects.equals(this.stuck, queueBlockedItem.stuck) &&
            Objects.equals(this.task, queueBlockedItem.task) &&
            Objects.equals(this.url, queueBlockedItem.url) &&
            Objects.equals(this.why, queueBlockedItem.why) &&
            Objects.equals(this.buildableStartMilliseconds, queueBlockedItem.buildableStartMilliseconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyClass, actions, blocked, buildable, id, inQueueSince, params, stuck, task, url, why, buildableStartMilliseconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueBlockedItem {\n");
        sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
        sb.append("    buildable: ").append(toIndentedString(buildable)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inQueueSince: ").append(toIndentedString(inQueueSince)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    stuck: ").append(toIndentedString(stuck)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    why: ").append(toIndentedString(why)).append("\n");
        sb.append("    buildableStartMilliseconds: ").append(toIndentedString(buildableStartMilliseconds)).append("\n");
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
