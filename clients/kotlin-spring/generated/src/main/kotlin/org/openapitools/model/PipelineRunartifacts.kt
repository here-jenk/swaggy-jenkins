package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param name 
 * @param propertySize 
 * @param url 
 * @param propertyClass 
 */
data class PipelineRunartifacts(

    @Schema(example = "null", description = "")
    @field:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("size") val propertySize: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("url") val url: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @field:JsonProperty("_class") val propertyClass: kotlin.String? = null
) {

}

