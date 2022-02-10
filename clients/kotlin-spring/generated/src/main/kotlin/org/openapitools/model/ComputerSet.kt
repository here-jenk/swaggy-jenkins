package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.HudsonMasterComputer
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
 * @param propertyClass 
 * @param busyExecutors 
 * @param computer 
 * @param displayName 
 * @param totalExecutors 
 */
data class ComputerSet(

    @field:JsonProperty("_class") val propertyClass: kotlin.String? = null,

    @field:JsonProperty("busyExecutors") val busyExecutors: kotlin.Int? = null,

    @field:Valid
    @field:JsonProperty("computer") val computer: kotlin.collections.List<HudsonMasterComputer>? = null,

    @field:JsonProperty("displayName") val displayName: kotlin.String? = null,

    @field:JsonProperty("totalExecutors") val totalExecutors: kotlin.Int? = null
) {

}

