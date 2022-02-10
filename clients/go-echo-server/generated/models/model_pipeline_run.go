package models

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
