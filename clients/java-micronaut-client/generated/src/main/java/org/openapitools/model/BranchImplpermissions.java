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
 * BranchImplpermissions
 */
@JsonPropertyOrder({
  BranchImplpermissions.JSON_PROPERTY_CREATE,
  BranchImplpermissions.JSON_PROPERTY_READ,
  BranchImplpermissions.JSON_PROPERTY_START,
  BranchImplpermissions.JSON_PROPERTY_STOP,
  BranchImplpermissions.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("BranchImplpermissions")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-02-10T09:45:35.132923Z[Etc/UTC]")
@Introspected
public class BranchImplpermissions {
    public static final String JSON_PROPERTY_CREATE = "create";
    private Boolean create;

    public static final String JSON_PROPERTY_READ = "read";
    private Boolean read;

    public static final String JSON_PROPERTY_START = "start";
    private Boolean start;

    public static final String JSON_PROPERTY_STOP = "stop";
    private Boolean stop;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public BranchImplpermissions() {
    }

    public BranchImplpermissions create(Boolean create) {
        this.create = create;
        return this;
    }

    /**
     * Get create
     * @return create
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CREATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getCreate() {
        return create;
    }

    @JsonProperty(JSON_PROPERTY_CREATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setCreate(Boolean create) {
        this.create = create;
    }

    public BranchImplpermissions read(Boolean read) {
        this.read = read;
        return this;
    }

    /**
     * Get read
     * @return read
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_READ)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getRead() {
        return read;
    }

    @JsonProperty(JSON_PROPERTY_READ)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setRead(Boolean read) {
        this.read = read;
    }

    public BranchImplpermissions start(Boolean start) {
        this.start = start;
        return this;
    }

    /**
     * Get start
     * @return start
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_START)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getStart() {
        return start;
    }

    @JsonProperty(JSON_PROPERTY_START)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setStart(Boolean start) {
        this.start = start;
    }

    public BranchImplpermissions stop(Boolean stop) {
        this.stop = stop;
        return this;
    }

    /**
     * Get stop
     * @return stop
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STOP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public Boolean getStop() {
        return stop;
    }

    @JsonProperty(JSON_PROPERTY_STOP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setStop(Boolean stop) {
        this.stop = stop;
    }

    public BranchImplpermissions propertyClass(String propertyClass) {
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
        BranchImplpermissions branchImplpermissions = (BranchImplpermissions) o;
        return Objects.equals(this.create, branchImplpermissions.create) &&
            Objects.equals(this.read, branchImplpermissions.read) &&
            Objects.equals(this.start, branchImplpermissions.start) &&
            Objects.equals(this.stop, branchImplpermissions.stop) &&
            Objects.equals(this.propertyClass, branchImplpermissions.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(create, read, start, stop, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchImplpermissions {\n");
        sb.append("    create: ").append(toIndentedString(create)).append("\n");
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
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
