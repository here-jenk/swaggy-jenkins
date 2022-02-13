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
import org.openapitools.model.CauseUserIdCause;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * CauseAction
 */
@JsonPropertyOrder({
  CauseAction.JSON_PROPERTY_PROPERTY_CLASS,
  CauseAction.JSON_PROPERTY_CAUSES
})
@JsonTypeName("CauseAction")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-02-13T02:16:43.247289Z[Etc/UTC]")
@Introspected
public class CauseAction {
    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public static final String JSON_PROPERTY_CAUSES = "causes";
    private List<CauseUserIdCause> causes = null;

    public CauseAction() {
    }

    public CauseAction propertyClass(String propertyClass) {
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

    public CauseAction causes(List<CauseUserIdCause> causes) {
        this.causes = causes;
        return this;
    }

    public CauseAction addCausesItem(CauseUserIdCause causesItem) {
        if (this.causes == null) {
            this.causes = new ArrayList<CauseUserIdCause>();
        }
        this.causes.add(causesItem);
        return this;
    }

    /**
     * Get causes
     * @return causes
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CAUSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<CauseUserIdCause> getCauses() {
        return causes;
    }

    @JsonProperty(JSON_PROPERTY_CAUSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setCauses(List<CauseUserIdCause> causes) {
        this.causes = causes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CauseAction causeAction = (CauseAction) o;
        return Objects.equals(this.propertyClass, causeAction.propertyClass) &&
            Objects.equals(this.causes, causeAction.causes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyClass, causes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CauseAction {\n");
        sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
        sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
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
