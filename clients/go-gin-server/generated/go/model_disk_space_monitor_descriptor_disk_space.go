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

type DiskSpaceMonitorDescriptorDiskSpace struct {

	Class string `json:"_class,omitempty"`

	Timestamp int32 `json:"timestamp,omitempty"`

	Path string `json:"path,omitempty"`

	Size int32 `json:"size,omitempty"`
}
