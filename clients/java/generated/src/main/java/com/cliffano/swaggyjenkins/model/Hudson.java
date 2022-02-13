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
import com.cliffano.swaggyjenkins.model.AllView;
import com.cliffano.swaggyjenkins.model.FreeStyleProject;
import com.cliffano.swaggyjenkins.model.HudsonassignedLabels;
import com.cliffano.swaggyjenkins.model.UnlabeledLoadStatistics;
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
 * Hudson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-13T02:15:08.056011Z[Etc/UTC]")
public class Hudson {
  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_ASSIGNED_LABELS = "assignedLabels";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_LABELS)
  private List<HudsonassignedLabels> assignedLabels = null;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_NODE_DESCRIPTION = "nodeDescription";
  @SerializedName(SERIALIZED_NAME_NODE_DESCRIPTION)
  private String nodeDescription;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_NUM_EXECUTORS = "numExecutors";
  @SerializedName(SERIALIZED_NAME_NUM_EXECUTORS)
  private Integer numExecutors;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JOBS = "jobs";
  @SerializedName(SERIALIZED_NAME_JOBS)
  private List<FreeStyleProject> jobs = null;

  public static final String SERIALIZED_NAME_PRIMARY_VIEW = "primaryView";
  @SerializedName(SERIALIZED_NAME_PRIMARY_VIEW)
  private AllView primaryView;

  public static final String SERIALIZED_NAME_QUIETING_DOWN = "quietingDown";
  @SerializedName(SERIALIZED_NAME_QUIETING_DOWN)
  private Boolean quietingDown;

  public static final String SERIALIZED_NAME_SLAVE_AGENT_PORT = "slaveAgentPort";
  @SerializedName(SERIALIZED_NAME_SLAVE_AGENT_PORT)
  private Integer slaveAgentPort;

  public static final String SERIALIZED_NAME_UNLABELED_LOAD = "unlabeledLoad";
  @SerializedName(SERIALIZED_NAME_UNLABELED_LOAD)
  private UnlabeledLoadStatistics unlabeledLoad;

  public static final String SERIALIZED_NAME_USE_CRUMBS = "useCrumbs";
  @SerializedName(SERIALIZED_NAME_USE_CRUMBS)
  private Boolean useCrumbs;

  public static final String SERIALIZED_NAME_USE_SECURITY = "useSecurity";
  @SerializedName(SERIALIZED_NAME_USE_SECURITY)
  private Boolean useSecurity;

  public static final String SERIALIZED_NAME_VIEWS = "views";
  @SerializedName(SERIALIZED_NAME_VIEWS)
  private List<AllView> views = null;

  public Hudson() { 
  }

  public Hudson propertyClass(String propertyClass) {
    
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


  public Hudson assignedLabels(List<HudsonassignedLabels> assignedLabels) {
    
    this.assignedLabels = assignedLabels;
    return this;
  }

  public Hudson addAssignedLabelsItem(HudsonassignedLabels assignedLabelsItem) {
    if (this.assignedLabels == null) {
      this.assignedLabels = new ArrayList<HudsonassignedLabels>();
    }
    this.assignedLabels.add(assignedLabelsItem);
    return this;
  }

   /**
   * Get assignedLabels
   * @return assignedLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HudsonassignedLabels> getAssignedLabels() {
    return assignedLabels;
  }


  public void setAssignedLabels(List<HudsonassignedLabels> assignedLabels) {
    this.assignedLabels = assignedLabels;
  }


  public Hudson mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public Hudson nodeDescription(String nodeDescription) {
    
    this.nodeDescription = nodeDescription;
    return this;
  }

   /**
   * Get nodeDescription
   * @return nodeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeDescription() {
    return nodeDescription;
  }


  public void setNodeDescription(String nodeDescription) {
    this.nodeDescription = nodeDescription;
  }


  public Hudson nodeName(String nodeName) {
    
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public Hudson numExecutors(Integer numExecutors) {
    
    this.numExecutors = numExecutors;
    return this;
  }

   /**
   * Get numExecutors
   * @return numExecutors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumExecutors() {
    return numExecutors;
  }


  public void setNumExecutors(Integer numExecutors) {
    this.numExecutors = numExecutors;
  }


  public Hudson description(String description) {
    
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


  public Hudson jobs(List<FreeStyleProject> jobs) {
    
    this.jobs = jobs;
    return this;
  }

  public Hudson addJobsItem(FreeStyleProject jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<FreeStyleProject>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FreeStyleProject> getJobs() {
    return jobs;
  }


  public void setJobs(List<FreeStyleProject> jobs) {
    this.jobs = jobs;
  }


  public Hudson primaryView(AllView primaryView) {
    
    this.primaryView = primaryView;
    return this;
  }

   /**
   * Get primaryView
   * @return primaryView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AllView getPrimaryView() {
    return primaryView;
  }


  public void setPrimaryView(AllView primaryView) {
    this.primaryView = primaryView;
  }


  public Hudson quietingDown(Boolean quietingDown) {
    
    this.quietingDown = quietingDown;
    return this;
  }

   /**
   * Get quietingDown
   * @return quietingDown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getQuietingDown() {
    return quietingDown;
  }


  public void setQuietingDown(Boolean quietingDown) {
    this.quietingDown = quietingDown;
  }


  public Hudson slaveAgentPort(Integer slaveAgentPort) {
    
    this.slaveAgentPort = slaveAgentPort;
    return this;
  }

   /**
   * Get slaveAgentPort
   * @return slaveAgentPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSlaveAgentPort() {
    return slaveAgentPort;
  }


  public void setSlaveAgentPort(Integer slaveAgentPort) {
    this.slaveAgentPort = slaveAgentPort;
  }


  public Hudson unlabeledLoad(UnlabeledLoadStatistics unlabeledLoad) {
    
    this.unlabeledLoad = unlabeledLoad;
    return this;
  }

   /**
   * Get unlabeledLoad
   * @return unlabeledLoad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UnlabeledLoadStatistics getUnlabeledLoad() {
    return unlabeledLoad;
  }


  public void setUnlabeledLoad(UnlabeledLoadStatistics unlabeledLoad) {
    this.unlabeledLoad = unlabeledLoad;
  }


  public Hudson useCrumbs(Boolean useCrumbs) {
    
    this.useCrumbs = useCrumbs;
    return this;
  }

   /**
   * Get useCrumbs
   * @return useCrumbs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseCrumbs() {
    return useCrumbs;
  }


  public void setUseCrumbs(Boolean useCrumbs) {
    this.useCrumbs = useCrumbs;
  }


  public Hudson useSecurity(Boolean useSecurity) {
    
    this.useSecurity = useSecurity;
    return this;
  }

   /**
   * Get useSecurity
   * @return useSecurity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseSecurity() {
    return useSecurity;
  }


  public void setUseSecurity(Boolean useSecurity) {
    this.useSecurity = useSecurity;
  }


  public Hudson views(List<AllView> views) {
    
    this.views = views;
    return this;
  }

  public Hudson addViewsItem(AllView viewsItem) {
    if (this.views == null) {
      this.views = new ArrayList<AllView>();
    }
    this.views.add(viewsItem);
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AllView> getViews() {
    return views;
  }


  public void setViews(List<AllView> views) {
    this.views = views;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hudson hudson = (Hudson) o;
    return Objects.equals(this.propertyClass, hudson.propertyClass) &&
        Objects.equals(this.assignedLabels, hudson.assignedLabels) &&
        Objects.equals(this.mode, hudson.mode) &&
        Objects.equals(this.nodeDescription, hudson.nodeDescription) &&
        Objects.equals(this.nodeName, hudson.nodeName) &&
        Objects.equals(this.numExecutors, hudson.numExecutors) &&
        Objects.equals(this.description, hudson.description) &&
        Objects.equals(this.jobs, hudson.jobs) &&
        Objects.equals(this.primaryView, hudson.primaryView) &&
        Objects.equals(this.quietingDown, hudson.quietingDown) &&
        Objects.equals(this.slaveAgentPort, hudson.slaveAgentPort) &&
        Objects.equals(this.unlabeledLoad, hudson.unlabeledLoad) &&
        Objects.equals(this.useCrumbs, hudson.useCrumbs) &&
        Objects.equals(this.useSecurity, hudson.useSecurity) &&
        Objects.equals(this.views, hudson.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, assignedLabels, mode, nodeDescription, nodeName, numExecutors, description, jobs, primaryView, quietingDown, slaveAgentPort, unlabeledLoad, useCrumbs, useSecurity, views);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hudson {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    assignedLabels: ").append(toIndentedString(assignedLabels)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    nodeDescription: ").append(toIndentedString(nodeDescription)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    numExecutors: ").append(toIndentedString(numExecutors)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    primaryView: ").append(toIndentedString(primaryView)).append("\n");
    sb.append("    quietingDown: ").append(toIndentedString(quietingDown)).append("\n");
    sb.append("    slaveAgentPort: ").append(toIndentedString(slaveAgentPort)).append("\n");
    sb.append("    unlabeledLoad: ").append(toIndentedString(unlabeledLoad)).append("\n");
    sb.append("    useCrumbs: ").append(toIndentedString(useCrumbs)).append("\n");
    sb.append("    useSecurity: ").append(toIndentedString(useSecurity)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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

