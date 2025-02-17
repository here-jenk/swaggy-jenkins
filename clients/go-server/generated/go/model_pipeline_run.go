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

type PipelineRun struct {

	Class string `json:"_class,omitempty"`

	Artifacts []PipelineRunartifacts `json:"artifacts,omitempty"`

	DurationInMillis int32 `json:"durationInMillis,omitempty"`

	EstimatedDurationInMillis int32 `json:"estimatedDurationInMillis,omitempty"`

	EnQueueTime string `json:"enQueueTime,omitempty"`

	EndTime string `json:"endTime,omitempty"`

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

// AssertPipelineRunRequired checks if the required fields are not zero-ed
func AssertPipelineRunRequired(obj PipelineRun) error {
	for _, el := range obj.Artifacts {
		if err := AssertPipelineRunartifactsRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertRecursePipelineRunRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of PipelineRun (e.g. [][]PipelineRun), otherwise ErrTypeAssertionError is thrown.
func AssertRecursePipelineRunRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aPipelineRun, ok := obj.(PipelineRun)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertPipelineRunRequired(aPipelineRun)
	})
}
