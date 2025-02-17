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

import org.openapitools.server.api.model.ClockDifference
import org.openapitools.server.api.model.DiskSpaceMonitorDescriptorDiskSpace
import org.openapitools.server.api.model.ResponseTimeMonitorData
import org.openapitools.server.api.model.SwapSpaceMonitorMemoryUsage2

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param hudsonNodeMonitorsSwapSpaceMonitor 
 * @param hudsonNodeMonitorsTemporarySpaceMonitor 
 * @param hudsonNodeMonitorsDiskSpaceMonitor 
 * @param hudsonNodeMonitorsArchitectureMonitor 
 * @param hudsonNodeMonitorsResponseTimeMonitor 
 * @param hudsonNodeMonitorsClockMonitor 
 * @param propertyClass 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class HudsonMasterComputermonitorData (
    val hudsonNodeMonitorsSwapSpaceMonitor: SwapSpaceMonitorMemoryUsage2? = null,
    val hudsonNodeMonitorsTemporarySpaceMonitor: DiskSpaceMonitorDescriptorDiskSpace? = null,
    val hudsonNodeMonitorsDiskSpaceMonitor: DiskSpaceMonitorDescriptorDiskSpace? = null,
    val hudsonNodeMonitorsArchitectureMonitor: kotlin.String? = null,
    val hudsonNodeMonitorsResponseTimeMonitor: ResponseTimeMonitorData? = null,
    val hudsonNodeMonitorsClockMonitor: ClockDifference? = null,
    val propertyClass: kotlin.String? = null
) {

}

