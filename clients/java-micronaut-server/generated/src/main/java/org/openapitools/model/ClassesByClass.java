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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ClassesByClass
 */
@JsonPropertyOrder({
  ClassesByClass.JSON_PROPERTY_CLASSES,
  ClassesByClass.JSON_PROPERTY_PROPERTY_CLASS
})
@JsonTypeName("ClassesByClass")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-02-10T09:45:45.459643Z[Etc/UTC]")
@Introspected
public class ClassesByClass {
    public static final String JSON_PROPERTY_CLASSES = "classes";
    private List<String> classes = null;

    public static final String JSON_PROPERTY_PROPERTY_CLASS = "_class";
    private String propertyClass;

    public ClassesByClass() {
    }

    public ClassesByClass classes(List<String> classes) {
        this.classes = classes;
        return this;
    }

    public ClassesByClass addClassesItem(String classesItem) {
        if (this.classes == null) {
            this.classes = new ArrayList<String>();
        }
        this.classes.add(classesItem);
        return this;
    }

    /**
     * Get classes
     * @return classes
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CLASSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<String> getClasses() {
        return classes;
    }

    @JsonProperty(JSON_PROPERTY_CLASSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public ClassesByClass propertyClass(String propertyClass) {
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
        ClassesByClass classesByClass = (ClassesByClass) o;
        return Objects.equals(this.classes, classesByClass.classes) &&
            Objects.equals(this.propertyClass, classesByClass.propertyClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classes, propertyClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassesByClass {\n");
        sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
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
