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
import org.openapitools.model.FreeStyleBuild;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * HudsonMasterComputerexecutors
 */
@JsonPropertyOrder({
  HudsonMasterComputerexecutors.JSON_PROPERTY_CURRENT_EXECUTABLE,
  HudsonMasterComputerexecutors.JSON_PROPERTY_IDLE,
  HudsonMasterComputerexecutors.JSON_PROPERTY_LIKELY_STUCK,
  HudsonMasterComputerexecutors.JSON_PROPERTY_NUMBER,
  HudsonMasterComputerexecutors.JSON_PROPERTY_PROGRESS,
  HudsonMasterComputerexecutors.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("HudsonMasterComputerexecutors")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-10T09:45:35.132923Z[Etc/UTC]")
@Introspected
public class HudsonMasterComputerexecutors {
    public static final String JSON_PROPERTY_CURRENT_EXECUTABLE = "currentExecutable";
    private FreeStyleBuild currentExecutable;

    public static final String JSON_PROPERTY_IDLE = "idle";
    private Boolean idle;

    public static final String JSON_PROPERTY_LIKELY_STUCK = "likelyStuck";
    private Boolean likelyStuck;

    public static final String JSON_PROPERTY_NUMBER = "number";
    private Integer number;

    public static final String JSON_PROPERTY_PROGRESS = "progress";
    private Integer progress;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public HudsonMasterComputerexecutors() {
    }

    public HudsonMasterComputerexecutors currentExecutable(FreeStyleBuild currentExecutable) {
        this.currentExecutable = currentExecutable;
        return this;
    }

    /**
     * Get currentExecutable
     * @return currentExecutable
     **/
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CURRENT_EXECUTABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public FreeStyleBuild getCurrentExecutable() {
        return currentExecutable;
    }

    @JsonProperty(JSON_PROPERTY_CURRENT_EXECUTABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setCurrentExecutable(FreeStyleBuild currentExecutable) {
        this.currentExecutable = currentExecutable;
    }

    public HudsonMasterComputerexecutors idle(Boolean idle) {
        this.idle = idle;
        return this;
    }

    /**
     * Get idle
     * @return idle
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_IDLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getIdle() {
        return idle;
    }

    @JsonProperty(JSON_PROPERTY_IDLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setIdle(Boolean idle) {
        this.idle = idle;
    }

    public HudsonMasterComputerexecutors likelyStuck(Boolean likelyStuck) {
        this.likelyStuck = likelyStuck;
        return this;
    }

    /**
     * Get likelyStuck
     * @return likelyStuck
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LIKELY_STUCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getLikelyStuck() {
        return likelyStuck;
    }

    @JsonProperty(JSON_PROPERTY_LIKELY_STUCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setLikelyStuck(Boolean likelyStuck) {
        this.likelyStuck = likelyStuck;
    }

    public HudsonMasterComputerexecutors number(Integer number) {
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

    public HudsonMasterComputerexecutors progress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * Get progress
     * @return progress
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PROGRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getProgress() {
        return progress;
    }

    @JsonProperty(JSON_PROPERTY_PROGRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public HudsonMasterComputerexecutors propertyClass(String propertyClass) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HudsonMasterComputerexecutors hudsonMasterComputerexecutors = (HudsonMasterComputerexecutors) o;
        return Objects.equals(this.currentExecutable, hudsonMasterComputerexecutors.currentExecutable) &&
            Objects.equals(this.idle, hudsonMasterComputerexecutors.idle) &&
            Objects.equals(this.likelyStuck, hudsonMasterComputerexecutors.likelyStuck) &&
            Objects.equals(this.number, hudsonMasterComputerexecutors.number) &&
            Objects.equals(this.progress, hudsonMasterComputerexecutors.progress) &&
            Objects.equals(this.propertyClass, hudsonMasterComputerexecutors.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentExecutable, idle, likelyStuck, number, progress, propertyClass);
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
