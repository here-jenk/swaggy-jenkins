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

type ResponseTimeMonitorData struct {

	Class string `json:"_class,omitempty"`

	Timestamp int32 `json:"timestamp,omitempty"`

	Average int32 `json:"average,omitempty"`
}
