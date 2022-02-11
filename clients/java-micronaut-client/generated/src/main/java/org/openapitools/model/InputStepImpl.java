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
import org.openapitools.model.InputStepImpllinks;
import org.openapitools.model.StringParameterDefinition;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * InputStepImpl
 */
@JsonPropertyOrder({
  InputStepImpl.JSON_PROPERTY_PROPERTY_CLASS,
  InputStepImpl.JSON_PROPERTY_LINKS,
  InputStepImpl.JSON_PROPERTY_ID,
  InputStepImpl.JSON_PROPERTY_MESSAGE,
  InputStepImpl.JSON_PROPERTY_OK,
  InputStepImpl.JSON_PROPERTY_PARAMETERS,
  InputStepImpl.JSON_PROPERTY_SUBMITTER
})
@JsonTypeName("InputStepImpl")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-11T12:41:29.860693Z[Etc/UTC]")
@Introspected
public class InputStepImpl {
    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public static final String JSON_PROPERTY_LINKS = "_links";
    private InputStepImpllinks links;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private String message;

    public static final String JSON_PROPERTY_OK = "ok";
    private String ok;

    public static final String JSON_PROPERTY_PARAMETERS = "parameters";
    private List<StringParameterDefinition> parameters = null;

    public static final String JSON_PROPERTY_SUBMITTER = "submitter";
    private String submitter;

    public InputStepImpl() {
    }

    public InputStepImpl propertyClass(String propertyClass) {
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

    public InputStepImpl links(InputStepImpllinks links) {
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
       public InputStepImpllinks getLinks() {
        return links;
    }

    @JsonProperty(JSON_PROPERTY_LINKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setLinks(InputStepImpllinks links) {
        this.links = links;
    }

    public InputStepImpl id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setId(String id) {
        this.id = id;
    }

    public InputStepImpl message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setMessage(String message) {
        this.message = message;
    }

    public InputStepImpl ok(String ok) {
        this.ok = ok;
        return this;
    }

    /**
     * Get ok
     * @return ok
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getOk() {
        return ok;
    }

    @JsonProperty(JSON_PROPERTY_OK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setOk(String ok) {
        this.ok = ok;
    }

    public InputStepImpl parameters(List<StringParameterDefinition> parameters) {
        this.parameters = parameters;
        return this;
    }

    public InputStepImpl addParametersItem(StringParameterDefinition parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<StringParameterDefinition>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * Get parameters
     * @return parameters
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<StringParameterDefinition> getParameters() {
        return parameters;
    }

    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setParameters(List<StringParameterDefinition> parameters) {
        this.parameters = parameters;
    }

    public InputStepImpl submitter(String submitter) {
        this.submitter = submitter;
        return this;
    }

    /**
     * Get submitter
     * @return submitter
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SUBMITTER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public String getSubmitter() {
        return submitter;
    }

    @JsonProperty(JSON_PROPERTY_SUBMITTER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputStepImpl inputStepImpl = (InputStepImpl) o;
        return Objects.equals(this.propertyClass, inputStepImpl.propertyClass) &&
            Objects.equals(this.links, inputStepImpl.links) &&
            Objects.equals(this.id, inputStepImpl.id) &&
            Objects.equals(this.message, inputStepImpl.message) &&
            Objects.equals(this.ok, inputStepImpl.ok) &&
            Objects.equals(this.parameters, inputStepImpl.parameters) &&
            Objects.equals(this.submitter, inputStepImpl.submitter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyClass, links, id, message, ok, parameters, submitter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputStepImpl {\n");
        sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    submitter: ").append(toIndentedString(submitter)).append("\n");
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
