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
 * GithubRepositorypermissions
 */
@JsonPropertyOrder({
  GithubRepositorypermissions.JSON_PROPERTY_ADMIN,
  GithubRepositorypermissions.JSON_PROPERTY_PUSH,
  GithubRepositorypermissions.JSON_PROPERTY_PULL,
  GithubRepositorypermissions.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("GithubRepositorypermissions")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-02-10T09:45:45.459643Z[Etc/UTC]")
@Introspected
public class GithubRepositorypermissions {
    public static final String JSON_PROPERTY_ADMIN = "admin";
    private Boolean admin;

    public static final String JSON_PROPERTY_PUSH = "push";
    private Boolean push;

    public static final String JSON_PROPERTY_PULL = "pull";
    private Boolean pull;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public GithubRepositorypermissions() {
    }

    public GithubRepositorypermissions admin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    /**
     * Get admin
     * @return admin
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ADMIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getAdmin() {
        return admin;
    }

    @JsonProperty(JSON_PROPERTY_ADMIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public GithubRepositorypermissions push(Boolean push) {
        this.push = push;
        return this;
    }

    /**
     * Get push
     * @return push
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PUSH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getPush() {
        return push;
    }

    @JsonProperty(JSON_PROPERTY_PUSH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setPush(Boolean push) {
        this.push = push;
    }

    public GithubRepositorypermissions pull(Boolean pull) {
        this.pull = pull;
        return this;
    }

    /**
     * Get pull
     * @return pull
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PULL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getPull() {
        return pull;
    }

    @JsonProperty(JSON_PROPERTY_PULL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setPull(Boolean pull) {
        this.pull = pull;
    }

    public GithubRepositorypermissions propertyClass(String propertyClass) {
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
        GithubRepositorypermissions githubRepositorypermissions = (GithubRepositorypermissions) o;
        return Objects.equals(this.admin, githubRepositorypermissions.admin) &&
            Objects.equals(this.push, githubRepositorypermissions.push) &&
            Objects.equals(this.pull, githubRepositorypermissions.pull) &&
            Objects.equals(this.propertyClass, githubRepositorypermissions.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin, push, pull, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GithubRepositorypermissions {\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    push: ").append(toIndentedString(push)).append("\n");
        sb.append("    pull: ").append(toIndentedString(pull)).append("\n");
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
