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
import org.openapitools.model.AllView;
import org.openapitools.model.FreeStyleProject;
import org.openapitools.model.HudsonassignedLabels;
import org.openapitools.model.UnlabeledLoadStatistics;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Hudson
 */
@JsonPropertyOrder({
  Hudson.JSON_PROPERTY_PROPERTY_CLASS,
  Hudson.JSON_PROPERTY_ASSIGNED_LABELS,
  Hudson.JSON_PROPERTY_MODE,
  Hudson.JSON_PROPERTY_NODE_DESCRIPTION,
  Hudson.JSON_PROPERTY_NODE_NAME,
  Hudson.JSON_PROPERTY_NUM_EXECUTORS,
  Hudson.JSON_PROPERTY_DESCRIPTION,
  Hudson.JSON_PROPERTY_JOBS,
  Hudson.JSON_PROPERTY_PRIMARY_VIEW,
  Hudson.JSON_PROPERTY_QUIETING_DOWN,
  Hudson.JSON_PROPERTY_SLAVE_AGENT_PORT,
  Hudson.JSON_PROPERTY_UNLABELED_LOAD,
  Hudson.JSON_PROPERTY_USE_CRUMBS,
  Hudson.JSON_PROPERTY_USE_SECURITY,
  Hudson.JSON_PROPERTY_VIEWS
})
@JsonTypeName("Hudson")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-02-13T02:16:43.247289Z[Etc/UTC]")
@Introspected
public class Hudson {
    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public static final String JSON_PROPERTY_ASSIGNED_LABELS = "assignedLabels";
    private List<HudsonassignedLabels> assignedLabels = null;

    public static final String JSON_PROPERTY_MODE = "mode";
    private String mode;

    public static final String JSON_PROPERTY_NODE_DESCRIPTION = "nodeDescription";
    private String nodeDescription;

    public static final String JSON_PROPERTY_NODE_NAME = "nodeName";
    private String nodeName;

    public static final String JSON_PROPERTY_NUM_EXECUTORS = "numExecutors";
    private Integer numExecutors;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_JOBS = "jobs";
    private List<FreeStyleProject> jobs = null;

    public static final String JSON_PROPERTY_PRIMARY_VIEW = "primaryView";
    private AllView primaryView;

    public static final String JSON_PROPERTY_QUIETING_DOWN = "quietingDown";
    private Boolean quietingDown;

    public static final String JSON_PROPERTY_SLAVE_AGENT_PORT = "slaveAgentPort";
    private Integer slaveAgentPort;

    public static final String JSON_PROPERTY_UNLABELED_LOAD = "unlabeledLoad";
    private UnlabeledLoadStatistics unlabeledLoad;

    public static final String JSON_PROPERTY_USE_CRUMBS = "useCrumbs";
    private Boolean useCrumbs;

    public static final String JSON_PROPERTY_USE_SECURITY = "useSecurity";
    private Boolean useSecurity;

    public static final String JSON_PROPERTY_VIEWS = "views";
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ASSIGNED_LABELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<HudsonassignedLabels> getAssignedLabels() {
        return assignedLabels;
    }

    @JsonProperty(JSON_PROPERTY_ASSIGNED_LABELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getMode() {
        return mode;
    }

    @JsonProperty(JSON_PROPERTY_MODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NODE_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getNodeDescription() {
        return nodeDescription;
    }

    @JsonProperty(JSON_PROPERTY_NODE_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NODE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getNodeName() {
        return nodeName;
    }

    @JsonProperty(JSON_PROPERTY_NODE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NUM_EXECUTORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getNumExecutors() {
        return numExecutors;
    }

    @JsonProperty(JSON_PROPERTY_NUM_EXECUTORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<FreeStyleProject> getJobs() {
        return jobs;
    }

    @JsonProperty(JSON_PROPERTY_JOBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PRIMARY_VIEW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public AllView getPrimaryView() {
        return primaryView;
    }

    @JsonProperty(JSON_PROPERTY_PRIMARY_VIEW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_QUIETING_DOWN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getQuietingDown() {
        return quietingDown;
    }

    @JsonProperty(JSON_PROPERTY_QUIETING_DOWN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SLAVE_AGENT_PORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getSlaveAgentPort() {
        return slaveAgentPort;
    }

    @JsonProperty(JSON_PROPERTY_SLAVE_AGENT_PORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_UNLABELED_LOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public UnlabeledLoadStatistics getUnlabeledLoad() {
        return unlabeledLoad;
    }

    @JsonProperty(JSON_PROPERTY_UNLABELED_LOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_USE_CRUMBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getUseCrumbs() {
        return useCrumbs;
    }

    @JsonProperty(JSON_PROPERTY_USE_CRUMBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_USE_SECURITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getUseSecurity() {
        return useSecurity;
    }

    @JsonProperty(JSON_PROPERTY_USE_SECURITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_VIEWS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<AllView> getViews() {
        return views;
    }

    @JsonProperty(JSON_PROPERTY_VIEWS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
