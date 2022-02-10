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

import * as models from './models';

export interface HudsonMasterComputermonitorData {
    "hudson_node_monitors_SwapSpaceMonitor"?: models.SwapSpaceMonitorMemoryUsage2;
    "hudson_node_monitors_TemporarySpaceMonitor"?: models.DiskSpaceMonitorDescriptorDiskSpace;
    "hudson_node_monitors_DiskSpaceMonitor"?: models.DiskSpaceMonitorDescriptorDiskSpace;
    "hudson_node_monitors_ArchitectureMonitor"?: string;
    "hudson_node_monitors_ResponseTimeMonitor"?: models.ResponseTimeMonitorData;
    "hudson_node_monitors_ClockMonitor"?: models.ClockDifference;
    "_class"?: string;
}

