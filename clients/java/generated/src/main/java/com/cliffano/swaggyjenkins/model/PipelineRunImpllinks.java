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
import com.cliffano.swaggyjenkins.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PipelineRunImpllinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-13T02:15:08.056011Z[Etc/UTC]")
public class PipelineRunImpllinks {
  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private Link nodes;

  public static final String SERIALIZED_NAME_LOG = "log";
  @SerializedName(SERIALIZED_NAME_LOG)
  private Link log;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private Link self;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private Link actions;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private Link steps;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public PipelineRunImpllinks() { 
  }

  public PipelineRunImpllinks nodes(Link nodes) {
    
    this.nodes = nodes;
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getNodes() {
    return nodes;
  }


  public void setNodes(Link nodes) {
    this.nodes = nodes;
  }


  public PipelineRunImpllinks log(Link log) {
    
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getLog() {
    return log;
  }


  public void setLog(Link log) {
    this.log = log;
  }


  public PipelineRunImpllinks self(Link self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getSelf() {
    return self;
  }


  public void setSelf(Link self) {
    this.self = self;
  }


  public PipelineRunImpllinks actions(Link actions) {
    
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getActions() {
    return actions;
  }


  public void setActions(Link actions) {
    this.actions = actions;
  }


  public PipelineRunImpllinks steps(Link steps) {
    
    this.steps = steps;
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getSteps() {
    return steps;
  }


  public void setSteps(Link steps) {
    this.steps = steps;
  }


  public PipelineRunImpllinks propertyClass(String propertyClass) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineRunImpllinks pipelineRunImpllinks = (PipelineRunImpllinks) o;
    return Objects.equals(this.nodes, pipelineRunImpllinks.nodes) &&
        Objects.equals(this.log, pipelineRunImpllinks.log) &&
        Objects.equals(this.self, pipelineRunImpllinks.self) &&
        Objects.equals(this.actions, pipelineRunImpllinks.actions) &&
        Objects.equals(this.steps, pipelineRunImpllinks.steps) &&
        Objects.equals(this.propertyClass, pipelineRunImpllinks.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, log, self, actions, steps, propertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineRunImpllinks {\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

