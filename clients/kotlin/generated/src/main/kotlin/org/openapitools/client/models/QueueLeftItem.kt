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

import org.openapitools.client.models.CauseAction
import org.openapitools.client.models.FreeStyleBuild
import org.openapitools.client.models.FreeStyleProject

import com.squareup.moshi.Json

/**
 * 
 *
 * @param propertyClass 
 * @param actions 
 * @param blocked 
 * @param buildable 
 * @param id 
 * @param inQueueSince 
 * @param params 
 * @param stuck 
 * @param task 
 * @param url 
 * @param why 
 * @param cancelled 
 * @param executable 
 */

data class QueueLeftItem (

    @Json(name = "_class")
    val propertyClass: kotlin.String? = null,

    @Json(name = "actions")
    val actions: kotlin.collections.List<CauseAction>? = null,

    @Json(name = "blocked")
    val blocked: kotlin.Boolean? = null,

    @Json(name = "buildable")
    val buildable: kotlin.Boolean? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "inQueueSince")
    val inQueueSince: kotlin.Int? = null,

    @Json(name = "params")
    val params: kotlin.String? = null,

    @Json(name = "stuck")
    val stuck: kotlin.Boolean? = null,

    @Json(name = "task")
    val task: FreeStyleProject? = null,

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "why")
    val why: kotlin.String? = null,

    @Json(name = "cancelled")
    val cancelled: kotlin.Boolean? = null,

    @Json(name = "executable")
    val executable: FreeStyleBuild? = null

)

