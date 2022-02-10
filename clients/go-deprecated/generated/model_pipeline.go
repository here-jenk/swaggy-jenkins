/*
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * API version: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// Pipeline struct for Pipeline
type Pipeline struct {
	Class string `json:"_class,omitempty"`
	Organization string `json:"organization,omitempty"`
	Name string `json:"name,omitempty"`
	DisplayName string `json:"displayName,omitempty"`
	FullName string `json:"fullName,omitempty"`
	WeatherScore int32 `json:"weatherScore,omitempty"`
	EstimatedDurationInMillis int32 `json:"estimatedDurationInMillis,omitempty"`
	LatestRun PipelinelatestRun `json:"latestRun,omitempty"`
}
