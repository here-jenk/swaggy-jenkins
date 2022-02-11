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
 * FavoriteImpllinks
 */
@JsonPropertyOrder({
  FavoriteImpllinks.JSON_PROPERTY_SELF,
  FavoriteImpllinks.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("FavoriteImpllinks")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-11T12:41:29.860693Z[Etc/UTC]")
@Introspected
public class FavoriteImpllinks {
    public static final String JSON_PROPERTY_SELF = "self";
    private Link self;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public FavoriteImpllinks() {
    }

    public FavoriteImpllinks self(Link self) {
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

    public FavoriteImpllinks propertyClass(String propertyClass) {
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
        FavoriteImpllinks favoriteImpllinks = (FavoriteImpllinks) o;
        return Objects.equals(this.self, favoriteImpllinks.self) &&
            Objects.equals(this.propertyClass, favoriteImpllinks.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FavoriteImpllinks {\n");
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
