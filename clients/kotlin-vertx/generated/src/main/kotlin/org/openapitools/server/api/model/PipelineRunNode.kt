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
package org.openapitools.server.api.model

import org.openapitools.server.api.model.PipelineRunNodeedges

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param propertyClass 
 * @param displayName 
 * @param durationInMillis 
 * @param edges 
 * @param id 
 * @param result 
 * @param startTime 
 * @param state 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class PipelineRunNode (
    val propertyClass: kotlin.String? = null,
    val displayName: kotlin.String? = null,
    val durationInMillis: kotlin.Int? = null,
    val edges: kotlin.Array<PipelineRunNodeedges>? = null,
    val id: kotlin.String? = null,
    val result: kotlin.String? = null,
    val startTime: kotlin.String? = null,
    val state: kotlin.String? = null
) {

}

