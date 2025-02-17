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

import org.openapitools.client.models.AllView
import org.openapitools.client.models.FreeStyleProject
import org.openapitools.client.models.HudsonassignedLabels
import org.openapitools.client.models.UnlabeledLoadStatistics

import com.squareup.moshi.Json

/**
 * 
 *
 * @param propertyClass 
 * @param assignedLabels 
 * @param mode 
 * @param nodeDescription 
 * @param nodeName 
 * @param numExecutors 
 * @param description 
 * @param jobs 
 * @param primaryView 
 * @param quietingDown 
 * @param slaveAgentPort 
 * @param unlabeledLoad 
 * @param useCrumbs 
 * @param useSecurity 
 * @param views 
 */

data class Hudson (

    @Json(name = "_class")
    val propertyClass: kotlin.String? = null,

    @Json(name = "assignedLabels")
    val assignedLabels: kotlin.collections.List<HudsonassignedLabels>? = null,

    @Json(name = "mode")
    val mode: kotlin.String? = null,

    @Json(name = "nodeDescription")
    val nodeDescription: kotlin.String? = null,

    @Json(name = "nodeName")
    val nodeName: kotlin.String? = null,

    @Json(name = "numExecutors")
    val numExecutors: kotlin.Int? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "jobs")
    val jobs: kotlin.collections.List<FreeStyleProject>? = null,

    @Json(name = "primaryView")
    val primaryView: AllView? = null,

    @Json(name = "quietingDown")
    val quietingDown: kotlin.Boolean? = null,

    @Json(name = "slaveAgentPort")
    val slaveAgentPort: kotlin.Int? = null,

    @Json(name = "unlabeledLoad")
    val unlabeledLoad: UnlabeledLoadStatistics? = null,

    @Json(name = "useCrumbs")
    val useCrumbs: kotlin.Boolean? = null,

    @Json(name = "useSecurity")
    val useSecurity: kotlin.Boolean? = null,

    @Json(name = "views")
    val views: kotlin.collections.List<AllView>? = null

)

