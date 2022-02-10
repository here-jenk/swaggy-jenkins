package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param id 
 * @param propertyClass 
 */
data class PipelineRunNodeedges(

    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("_class") val propertyClass: kotlin.String? = null
) {

}

