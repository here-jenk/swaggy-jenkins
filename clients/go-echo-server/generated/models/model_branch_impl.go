package models

type BranchImpl struct {

	Class string `json:"_class,omitempty"`

	DisplayName string `json:"displayName,omitempty"`

	EstimatedDurationInMillis int32 `json:"estimatedDurationInMillis,omitempty"`

	FullDisplayName string `json:"fullDisplayName,omitempty"`

	FullName string `json:"fullName,omitempty"`

	Name string `json:"name,omitempty"`

	Organization string `json:"organization,omitempty"`

	Parameters []StringParameterDefinition `json:"parameters,omitempty"`

	Permissions BranchImplpermissions `json:"permissions,omitempty"`

	WeatherScore int32 `json:"weatherScore,omitempty"`

	PullRequest string `json:"pullRequest,omitempty"`

	Links BranchImpllinks `json:"_links,omitempty"`

	LatestRun PipelineRunImpl `json:"latestRun,omitempty"`
}
