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

import org.openapitools.client.models.GithubRepositorylinks
import org.openapitools.client.models.GithubRepositorypermissions

import com.squareup.moshi.Json

/**
 * 
 *
 * @param propertyClass 
 * @param links 
 * @param defaultBranch 
 * @param description 
 * @param name 
 * @param permissions 
 * @param `private` 
 * @param fullName 
 */

data class GithubRepository (

    @Json(name = "_class")
    val propertyClass: kotlin.String? = null,

    @Json(name = "_links")
    val links: GithubRepositorylinks? = null,

    @Json(name = "defaultBranch")
    val defaultBranch: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "permissions")
    val permissions: GithubRepositorypermissions? = null,

    @Json(name = "private")
    val `private`: kotlin.Boolean? = null,

    @Json(name = "fullName")
    val fullName: kotlin.String? = null

)

