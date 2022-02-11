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
 * DefaultCrumbIssuer
 */
@JsonPropertyOrder({
  DefaultCrumbIssuer.JSON_PROPERTY_PROPERTY_CLASS,
  DefaultCrumbIssuer.JSON_PROPERTY_CRUMB,
  DefaultCrumbIssuer.JSON_PROPERTY_CRUMB_REQUEST_FIELD
})
@JsonTypeName("DefaultCrumbIssuer")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-02-11T12:41:40.232851Z[Etc/UTC]")
@Introspected
public class DefaultCrumbIssuer {
    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public static final String JSON_PROPERTY_CRUMB = "crumb";
    private String crumb;

    public static final String JSON_PROPERTY_CRUMB_REQUEST_FIELD = "crumbRequestField";
    private String crumbRequestField;

    public DefaultCrumbIssuer() {
    }

    public DefaultCrumbIssuer propertyClass(String propertyClass) {
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

    public DefaultCrumbIssuer crumb(String crumb) {
        this.crumb = crumb;
        return this;
    }

    /**
     * Get crumb
     * @return crumb
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CRUMB)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getCrumb() {
        return crumb;
    }

    @JsonProperty(JSON_PROPERTY_CRUMB)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setCrumb(String crumb) {
        this.crumb = crumb;
    }

    public DefaultCrumbIssuer crumbRequestField(String crumbRequestField) {
        this.crumbRequestField = crumbRequestField;
        return this;
    }

    /**
     * Get crumbRequestField
     * @return crumbRequestField
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CRUMB_REQUEST_FIELD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getCrumbRequestField() {
        return crumbRequestField;
    }

    @JsonProperty(JSON_PROPERTY_CRUMB_REQUEST_FIELD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setCrumbRequestField(String crumbRequestField) {
        this.crumbRequestField = crumbRequestField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefaultCrumbIssuer defaultCrumbIssuer = (DefaultCrumbIssuer) o;
        return Objects.equals(this.propertyClass, defaultCrumbIssuer.propertyClass) &&
            Objects.equals(this.crumb, defaultCrumbIssuer.crumb) &&
            Objects.equals(this.crumbRequestField, defaultCrumbIssuer.crumbRequestField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyClass, crumb, crumbRequestField);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefaultCrumbIssuer {\n");
        sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
        sb.append("    crumb: ").append(toIndentedString(crumb)).append("\n");
        sb.append("    crumbRequestField: ").append(toIndentedString(crumbRequestField)).append("\n");
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
