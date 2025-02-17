/**
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.InputStepImpllinks
import org.openapitools.client.models.StringParameterDefinition

import com.squareup.moshi.Json

/**
 * 
 *
 * @param propertyClass 
 * @param links 
 * @param id 
 * @param message 
 * @param ok 
 * @param parameters 
 * @param submitter 
 */

data class InputStepImpl (

    @Json(name = "_class")
    val propertyClass: kotlin.String? = null,

    @Json(name = "_links")
    val links: InputStepImpllinks? = null,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "message")
    val message: kotlin.String? = null,

    @Json(name = "ok")
    val ok: kotlin.String? = null,

    @Json(name = "parameters")
    val parameters: kotlin.collections.List<StringParameterDefinition>? = null,

    @Json(name = "submitter")
    val submitter: kotlin.String? = null

)

