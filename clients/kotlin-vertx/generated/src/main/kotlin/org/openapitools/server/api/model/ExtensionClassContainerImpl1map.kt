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

import org.openapitools.server.api.model.ExtensionClassImpl

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param ioJenkinsBlueoceanServiceEmbeddedRestPipelineImpl 
 * @param ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl 
 * @param propertyClass 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class ExtensionClassContainerImpl1map (
    val ioJenkinsBlueoceanServiceEmbeddedRestPipelineImpl: ExtensionClassImpl? = null,
    val ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl: ExtensionClassImpl? = null,
    val propertyClass: kotlin.String? = null
) {

}

