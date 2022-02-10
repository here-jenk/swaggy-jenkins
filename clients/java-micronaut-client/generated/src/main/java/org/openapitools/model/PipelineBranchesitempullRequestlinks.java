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
 * PipelineBranchesitempullRequestlinks
 */
@JsonPropertyOrder({
  PipelineBranchesitempullRequestlinks.JSON_PROPERTY_SELF,
  PipelineBranchesitempullRequestlinks.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("PipelineBranchesitempullRequestlinks")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-10T09:45:35.132923Z[Etc/UTC]")
@Introspected
public class PipelineBranchesitempullRequestlinks {
    public static final String JSON_PROPERTY_SELF = "self";
    private String self;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public PipelineBranchesitempullRequestlinks() {
    }

    public PipelineBranchesitempullRequestlinks self(String self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     * @return self
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SELF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getSelf() {
        return self;
    }

    @JsonProperty(JSON_PROPERTY_SELF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setSelf(String self) {
        this.self = self;
    }

    public PipelineBranchesitempullRequestlinks propertyClass(String propertyClass) {
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
        PipelineBranchesitempullRequestlinks pipelineBranchesitempullRequestlinks = (PipelineBranchesitempullRequestlinks) o;
        return Objects.equals(this.self, pipelineBranchesitempullRequestlinks.self) &&
            Objects.equals(this.propertyClass, pipelineBranchesitempullRequestlinks.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineBranchesitempullRequestlinks {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
