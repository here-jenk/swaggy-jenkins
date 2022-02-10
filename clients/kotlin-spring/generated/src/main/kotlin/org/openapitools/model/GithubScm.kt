package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GithubScmlinks
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
 * @param links 
 * @param credentialId 
 * @param id 
 * @param uri 
 */
data class GithubScm(

    @field:JsonProperty("_class") val propertyClass: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("_links") val links: GithubScmlinks? = null,

    @field:JsonProperty("credentialId") val credentialId: kotlin.String? = null,

    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("uri") val uri: kotlin.String? = null
) {

}

