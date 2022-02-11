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
import org.openapitools.model.PipelineRunNodeedges;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * PipelineRunNode
 */
@JsonPropertyOrder({
  PipelineRunNode.JSON_PROPERTY_PROPERTY_CLASS,
  PipelineRunNode.JSON_PROPERTY_DISPLAY_NAME,
  PipelineRunNode.JSON_PROPERTY_DURATION_IN_MILLIS,
  PipelineRunNode.JSON_PROPERTY_EDGES,
  PipelineRunNode.JSON_PROPERTY_ID,
  PipelineRunNode.JSON_PROPERTY_RESULT,
  PipelineRunNode.JSON_PROPERTY_START_TIME,
  PipelineRunNode.JSON_PROPERTY_STATE
})
@JsonTypeName("PipelineRunNode")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-11T12:41:29.860693Z[Etc/UTC]")
@Introspected
public class PipelineRunNode {
    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_DURATION_IN_MILLIS = "durationInMillis";
    private Integer durationInMillis;

    public static final String JSON_PROPERTY_EDGES = "edges";
    private List<PipelineRunNodeedges> edges = null;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_RESULT = "result";
    private String result;

    public static final String JSON_PROPERTY_START_TIME = "startTime";
    private String startTime;

    public static final String JSON_PROPERTY_STATE = "state";
    private String state;

    public PipelineRunNode() {
    }

    public PipelineRunNode propertyClass(String propertyClass) {
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

    public PipelineRunNode displayName(String displayName) {
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

    public PipelineRunNode durationInMillis(Integer durationInMillis) {
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

    public PipelineRunNode edges(List<PipelineRunNodeedges> edges) {
        this.edges = edges;
        return this;
    }

    public PipelineRunNode addEdgesItem(PipelineRunNodeedges edgesItem) {
        if (this.edges == null) {
            this.edges = new ArrayList<PipelineRunNodeedges>();
        }
        this.edges.add(edgesItem);
        return this;
    }

    /**
     * Get edges
     * @return edges
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_EDGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<PipelineRunNodeedges> getEdges() {
        return edges;
    }

    @JsonProperty(JSON_PROPERTY_EDGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setEdges(List<PipelineRunNodeedges> edges) {
        this.edges = edges;
    }

    public PipelineRunNode id(String id) {
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

    public PipelineRunNode result(String result) {
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

    public PipelineRunNode startTime(String startTime) {
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

    public PipelineRunNode state(String state) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineRunNode pipelineRunNode = (PipelineRunNode) o;
        return Objects.equals(this.propertyClass, pipelineRunNode.propertyClass) &&
            Objects.equals(this.displayName, pipelineRunNode.displayName) &&
            Objects.equals(this.durationInMillis, pipelineRunNode.durationInMillis) &&
            Objects.equals(this.edges, pipelineRunNode.edges) &&
            Objects.equals(this.id, pipelineRunNode.id) &&
            Objects.equals(this.result, pipelineRunNode.result) &&
            Objects.equals(this.startTime, pipelineRunNode.startTime) &&
            Objects.equals(this.state, pipelineRunNode.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyClass, displayName, durationInMillis, edges, id, result, startTime, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineRunNode {\n");
        sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
        sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
