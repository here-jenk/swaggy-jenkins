/*
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * API version: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type HudsonMasterComputermonitorData struct {

	HudsonNodeMonitorsSwapSpaceMonitor SwapSpaceMonitorMemoryUsage2 `json:"hudson.node_monitors.SwapSpaceMonitor,omitempty"`

	HudsonNodeMonitorsTemporarySpaceMonitor DiskSpaceMonitorDescriptorDiskSpace `json:"hudson.node_monitors.TemporarySpaceMonitor,omitempty"`

	HudsonNodeMonitorsDiskSpaceMonitor DiskSpaceMonitorDescriptorDiskSpace `json:"hudson.node_monitors.DiskSpaceMonitor,omitempty"`

	HudsonNodeMonitorsArchitectureMonitor string `json:"hudson.node_monitors.ArchitectureMonitor,omitempty"`

	HudsonNodeMonitorsResponseTimeMonitor ResponseTimeMonitorData `json:"hudson.node_monitors.ResponseTimeMonitor,omitempty"`

	HudsonNodeMonitorsClockMonitor ClockDifference `json:"hudson.node_monitors.ClockMonitor,omitempty"`

	Class string `json:"_class,omitempty"`
}
