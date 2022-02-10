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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * PipelineRunartifacts
 */
@JsonPropertyOrder({
  PipelineRunartifacts.JSON_PROPERTY_NAME,
  PipelineRunartifacts.JSON_PROPERTY_SIZE,
  PipelineRunartifacts.JSON_PROPERTY_URL,
  PipelineRunartifacts.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("PipelineRunartifacts")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-10T09:45:35.132923Z[Etc/UTC]")
@Introspected
public class PipelineRunartifacts {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_SIZE = "size";
    private Integer size;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public PipelineRunartifacts() {
    }

    public PipelineRunartifacts name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setName(String name) {
        this.name = name;
    }

    public PipelineRunartifacts size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Integer getSize() {
        return size;
    }

    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setSize(Integer size) {
        this.size = size;
    }

    public PipelineRunartifacts url(String url) {
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

    public PipelineRunartifacts propertyClass(String propertyClass) {
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
        PipelineRunartifacts pipelineRunartifacts = (PipelineRunartifacts) o;
        return Objects.equals(this.name, pipelineRunartifacts.name) &&
            Objects.equals(this.size, pipelineRunartifacts.size) &&
            Objects.equals(this.url, pipelineRunartifacts.url) &&
            Objects.equals(this.propertyClass, pipelineRunartifacts.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, url, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineRunartifacts {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
