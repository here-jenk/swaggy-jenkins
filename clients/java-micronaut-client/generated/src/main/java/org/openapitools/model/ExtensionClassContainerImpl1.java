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
import org.openapitools.model.ExtensionClassContainerImpl1links;
import org.openapitools.model.ExtensionClassContainerImpl1map;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ExtensionClassContainerImpl1
 */
@JsonPropertyOrder({
  ExtensionClassContainerImpl1.JSON_PROPERTY_PROPERTY_CLASS,
  ExtensionClassContainerImpl1.JSON_PROPERTY_LINKS,
  ExtensionClassContainerImpl1.JSON_PROPERTY_MAP
})
@JsonTypeName("ExtensionClassContainerImpl1")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-10T09:45:35.132923Z[Etc/UTC]")
@Introspected
public class ExtensionClassContainerImpl1 {
    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public static final String JSON_PROPERTY_LINKS = "_links";
    private ExtensionClassContainerImpl1links links;

    public static final String JSON_PROPERTY_MAP = "map";
    private ExtensionClassContainerImpl1map map;

    public ExtensionClassContainerImpl1() {
    }

    public ExtensionClassContainerImpl1 propertyClass(String propertyClass) {
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

    public ExtensionClassContainerImpl1 links(ExtensionClassContainerImpl1links links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     **/
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LINKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public ExtensionClassContainerImpl1links getLinks() {
        return links;
    }

    @JsonProperty(JSON_PROPERTY_LINKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setLinks(ExtensionClassContainerImpl1links links) {
        this.links = links;
    }

    public ExtensionClassContainerImpl1 map(ExtensionClassContainerImpl1map map) {
        this.map = map;
        return this;
    }

    /**
     * Get map
     * @return map
     **/
    @Valid
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public ExtensionClassContainerImpl1map getMap() {
        return map;
    }

    @JsonProperty(JSON_PROPERTY_MAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setMap(ExtensionClassContainerImpl1map map) {
        this.map = map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionClassContainerImpl1 extensionClassContainerImpl1 = (ExtensionClassContainerImpl1) o;
        return Objects.equals(this.propertyClass, extensionClassContainerImpl1.propertyClass) &&
            Objects.equals(this.links, extensionClassContainerImpl1.links) &&
            Objects.equals(this.map, extensionClassContainerImpl1.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyClass, links, map);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionClassContainerImpl1 {\n");
        sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    map: ").append(toIndentedString(map)).append("\n");
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
