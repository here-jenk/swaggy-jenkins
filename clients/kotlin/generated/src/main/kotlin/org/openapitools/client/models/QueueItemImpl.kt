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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param propertyClass 
 * @param expectedBuildNumber 
 * @param id 
 * @param pipeline 
 * @param queuedTime 
 */

data class QueueItemImpl (

    @Json(name = "_class")
    val propertyClass: kotlin.String? = null,

    @Json(name = "expectedBuildNumber")
    val expectedBuildNumber: kotlin.Int? = null,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "pipeline")
    val pipeline: kotlin.String? = null,

    @Json(name = "queuedTime")
    val queuedTime: kotlin.Int? = null

)

