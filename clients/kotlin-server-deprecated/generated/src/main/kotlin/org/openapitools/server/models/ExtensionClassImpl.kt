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

import org.openapitools.server.models.ExtensionClassImpllinks

/**
 * 
 * @param propertyClass 
 * @param links 
 * @param classes 
 */
data class ExtensionClassImpl (
    val propertyClass: kotlin.String? = null,
    val links: ExtensionClassImpllinks? = null,
    val classes: kotlin.Array<kotlin.String>? = null
) 

