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

import org.openapitools.client.models.PipelinelatestRun

import com.squareup.moshi.Json

/**
 * 
 *
 * @param propertyClass 
 * @param organization 
 * @param name 
 * @param displayName 
 * @param fullName 
 * @param weatherScore 
 * @param estimatedDurationInMillis 
 * @param latestRun 
 */

data class Pipeline (

    @Json(name = "_class")
    val propertyClass: kotlin.String? = null,

    @Json(name = "organization")
    val organization: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "fullName")
    val fullName: kotlin.String? = null,

    @Json(name = "weatherScore")
    val weatherScore: kotlin.Int? = null,

    @Json(name = "estimatedDurationInMillis")
    val estimatedDurationInMillis: kotlin.Int? = null,

    @Json(name = "latestRun")
    val latestRun: PipelinelatestRun? = null

)

