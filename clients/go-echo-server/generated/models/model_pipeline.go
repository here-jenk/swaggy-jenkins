package models

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
