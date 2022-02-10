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
import org.openapitools.model.GithubContent;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * GithubFile
 */
@JsonPropertyOrder({
  GithubFile.JSON_PROPERTY_CONTENT,
  GithubFile.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("GithubFile")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-10T09:45:35.132923Z[Etc/UTC]")
@Introspected
public class GithubFile {
    public static final String JSON_PROPERTY_CONTENT = "content";
    private GithubContent content;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public GithubFile() {
    }

    public GithubFile content(GithubContent content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     * @return content
     **/
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public GithubContent getContent() {
        return content;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setContent(GithubContent content) {
        this.content = content;
    }

    public GithubFile propertyClass(String propertyClass) {
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
        GithubFile githubFile = (GithubFile) o;
        return Objects.equals(this.content, githubFile.content) &&
            Objects.equals(this.propertyClass, githubFile.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GithubFile {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
