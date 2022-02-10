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
import org.openapitools.model.Link;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ExtensionClassContainerImpl1links
 */
@JsonPropertyOrder({
  ExtensionClassContainerImpl1links.JSON_PROPERTY_SELF,
  ExtensionClassContainerImpl1links.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("ExtensionClassContainerImpl1links")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-10T09:45:35.132923Z[Etc/UTC]")
@Introspected
public class ExtensionClassContainerImpl1links {
    public static final String JSON_PROPERTY_SELF = "self";
    private Link self;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public ExtensionClassContainerImpl1links() {
    }

    public ExtensionClassContainerImpl1links self(Link self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     * @return self
     **/
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SELF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Link getSelf() {
        return self;
    }

    @JsonProperty(JSON_PROPERTY_SELF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setSelf(Link self) {
        this.self = self;
    }

    public ExtensionClassContainerImpl1links propertyClass(String propertyClass) {
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
        ExtensionClassContainerImpl1links extensionClassContainerImpl1links = (ExtensionClassContainerImpl1links) o;
        return Objects.equals(this.self, extensionClassContainerImpl1links.self) &&
            Objects.equals(this.propertyClass, extensionClassContainerImpl1links.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionClassContainerImpl1links {\n");
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
