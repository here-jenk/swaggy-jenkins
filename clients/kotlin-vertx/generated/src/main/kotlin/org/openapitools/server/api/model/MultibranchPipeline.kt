/**
* Swaggy Jenkins
* Jenkins API clients generated from Swagger / Open API specification
*
* The version of the OpenAPI document: 1.5.1-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param displayName 
 * @param estimatedDurationInMillis 
 * @param latestRun 
 * @param name 
 * @param organization 
 * @param weatherScore 
 * @param branchNames 
 * @param numberOfFailingBranches 
 * @param numberOfFailingPullRequests 
 * @param numberOfSuccessfulBranches 
 * @param numberOfSuccessfulPullRequests 
 * @param totalNumberOfBranches 
 * @param totalNumberOfPullRequests 
 * @param propertyClass 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MultibranchPipeline (
    val displayName: kotlin.String? = null,
    val estimatedDurationInMillis: kotlin.Int? = null,
    val latestRun: kotlin.String? = null,
    val name: kotlin.String? = null,
    val organization: kotlin.String? = null,
    val weatherScore: kotlin.Int? = null,
    val branchNames: kotlin.Array<kotlin.String>? = null,
    val numberOfFailingBranches: kotlin.Int? = null,
    val numberOfFailingPullRequests: kotlin.Int? = null,
    val numberOfSuccessfulBranches: kotlin.Int? = null,
    val numberOfSuccessfulPullRequests: kotlin.Int? = null,
    val totalNumberOfBranches: kotlin.Int? = null,
    val totalNumberOfPullRequests: kotlin.Int? = null,
    val propertyClass: kotlin.String? = null
) {

}

