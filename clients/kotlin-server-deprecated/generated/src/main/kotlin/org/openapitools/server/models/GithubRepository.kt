/**
* Swaggy Jenkins
* Jenkins API clients generated from Swagger / Open API specification
*
* The version of the OpenAPI document: 1.1.2-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.GithubRepositorylinks
import org.openapitools.server.models.GithubRepositorypermissions

/**
 * 
 * @param propertyClass 
 * @param links 
 * @param defaultBranch 
 * @param description 
 * @param name 
 * @param permissions 
 * @param &#x60;private&#x60; 
 * @param fullName 
 */
data class GithubRepository (
    val propertyClass: kotlin.String? = null,
    val links: GithubRepositorylinks? = null,
    val defaultBranch: kotlin.String? = null,
    val description: kotlin.String? = null,
    val name: kotlin.String? = null,
    val permissions: GithubRepositorypermissions? = null,
    val `private`: kotlin.Boolean? = null,
    val fullName: kotlin.String? = null
) 

