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

import org.openapitools.server.models.CauseAction
import org.openapitools.server.models.FreeStyleBuild
import org.openapitools.server.models.FreeStyleProject

/**
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
    val propertyClass: kotlin.String? = null,
    val actions: kotlin.Array<CauseAction>? = null,
    val blocked: kotlin.Boolean? = null,
    val buildable: kotlin.Boolean? = null,
    val id: kotlin.Int? = null,
    val inQueueSince: kotlin.Int? = null,
    val params: kotlin.String? = null,
    val stuck: kotlin.Boolean? = null,
    val task: FreeStyleProject? = null,
    val url: kotlin.String? = null,
    val why: kotlin.String? = null,
    val cancelled: kotlin.Boolean? = null,
    val executable: FreeStyleBuild? = null
) 

