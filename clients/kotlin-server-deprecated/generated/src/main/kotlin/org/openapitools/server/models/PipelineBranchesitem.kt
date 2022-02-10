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

import org.openapitools.server.models.PipelineBranchesitemlatestRun
import org.openapitools.server.models.PipelineBranchesitempullRequest

/**
 * 
 * @param displayName 
 * @param estimatedDurationInMillis 
 * @param name 
 * @param weatherScore 
 * @param latestRun 
 * @param organization 
 * @param pullRequest 
 * @param totalNumberOfPullRequests 
 * @param propertyClass 
 */
data class PipelineBranchesitem (
    val displayName: kotlin.String? = null,
    val estimatedDurationInMillis: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val weatherScore: kotlin.Int? = null,
    val latestRun: PipelineBranchesitemlatestRun? = null,
    val organization: kotlin.String? = null,
    val pullRequest: PipelineBranchesitempullRequest? = null,
    val totalNumberOfPullRequests: kotlin.Int? = null,
    val propertyClass: kotlin.String? = null
) 

