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
// PipelineRunImpl struct for PipelineRunImpl
type PipelineRunImpl struct {
	Class string `json:"_class,omitempty"`
	Links PipelineRunImpllinks `json:"_links,omitempty"`
	DurationInMillis int32 `json:"durationInMillis,omitempty"`
	EnQueueTime string `json:"enQueueTime,omitempty"`
	EndTime string `json:"endTime,omitempty"`
	EstimatedDurationInMillis int32 `json:"estimatedDurationInMillis,omitempty"`
	Id string `json:"id,omitempty"`
	Organization string `json:"organization,omitempty"`
	Pipeline string `json:"pipeline,omitempty"`
	Result string `json:"result,omitempty"`
	RunSummary string `json:"runSummary,omitempty"`
	StartTime string `json:"startTime,omitempty"`
	State string `json:"state,omitempty"`
	Type string `json:"type,omitempty"`
	CommitId string `json:"commitId,omitempty"`
}
