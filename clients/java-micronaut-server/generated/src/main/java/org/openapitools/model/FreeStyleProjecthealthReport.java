/*
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FreeStyleProjecthealthReport
 */
@JsonPropertyOrder({
  FreeStyleProjecthealthReport.JSON_PROPERTY_DESCRIPTION,
  FreeStyleProjecthealthReport.JSON_PROPERTY_ICON_CLASS_NAME,
  FreeStyleProjecthealthReport.JSON_PROPERTY_ICON_URL,
  FreeStyleProjecthealthReport.JSON_PROPERTY_SCORE,
  FreeStyleProjecthealthReport.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("FreeStyleProjecthealthReport")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-06-04T08:08:22.203128Z[Etc/UTC]")
@Introspected
public class FreeStyleProjecthealthReport {
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_ICON_CLASS_NAME = "iconClassName";
    private String iconClassName;

    public static final String JSON_PROPERTY_ICON_URL = "iconUrl";
    private String iconUrl;

    public static final String JSON_PROPERTY_SCORE = "score";
    private Integer score;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public FreeStyleProjecthealthReport() {
    }

    public FreeStyleProjecthealthReport description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    @Nullable
    @Schema(name = "description", required = false)
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

    public FreeStyleProjecthealthReport iconClassName(String iconClassName) {
        this.iconClassName = iconClassName;
        return this;
    }

    /**
     * Get iconClassName
     * @return iconClassName
     **/
    @Nullable
    @Schema(name = "iconClassName", required = false)
    @JsonProperty(JSON_PROPERTY_ICON_CLASS_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIconClassName() {
        return iconClassName;
    }

    @JsonProperty(JSON_PROPERTY_ICON_CLASS_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIconClassName(String iconClassName) {
        this.iconClassName = iconClassName;
    }

    public FreeStyleProjecthealthReport iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * Get iconUrl
     * @return iconUrl
     **/
    @Nullable
    @Schema(name = "iconUrl", required = false)
    @JsonProperty(JSON_PROPERTY_ICON_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty(JSON_PROPERTY_ICON_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public FreeStyleProjecthealthReport score(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     **/
    @Nullable
    @Schema(name = "score", required = false)
    @JsonProperty(JSON_PROPERTY_SCORE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getScore() {
        return score;
    }

    @JsonProperty(JSON_PROPERTY_SCORE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setScore(Integer score) {
        this.score = score;
    }

    public FreeStyleProjecthealthReport propertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
        return this;
    }

    /**
     * Get propertyClass
     * @return propertyClass
     **/
    @Nullable
    @Schema(name = "_class", required = false)
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
        FreeStyleProjecthealthReport freeStyleProjecthealthReport = (FreeStyleProjecthealthReport) o;
        return Objects.equals(this.description, freeStyleProjecthealthReport.description) &&
            Objects.equals(this.iconClassName, freeStyleProjecthealthReport.iconClassName) &&
            Objects.equals(this.iconUrl, freeStyleProjecthealthReport.iconUrl) &&
            Objects.equals(this.score, freeStyleProjecthealthReport.score) &&
            Objects.equals(this.propertyClass, freeStyleProjecthealthReport.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, iconClassName, iconUrl, score, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreeStyleProjecthealthReport {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    iconClassName: ").append(toIndentedString(iconClassName)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
