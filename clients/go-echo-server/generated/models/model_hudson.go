package models

type Hudson struct {

	Class string `json:"_class,omitempty"`

	AssignedLabels []HudsonassignedLabels `json:"assignedLabels,omitempty"`

	Mode string `json:"mode,omitempty"`

	NodeDescription string `json:"nodeDescription,omitempty"`

	NodeName string `json:"nodeName,omitempty"`

	NumExecutors int32 `json:"numExecutors,omitempty"`

	Description string `json:"description,omitempty"`

	Jobs []FreeStyleProject `json:"jobs,omitempty"`

	PrimaryView AllView `json:"primaryView,omitempty"`

	QuietingDown bool `json:"quietingDown,omitempty"`

	SlaveAgentPort int32 `json:"slaveAgentPort,omitempty"`

	UnlabeledLoad UnlabeledLoadStatistics `json:"unlabeledLoad,omitempty"`

	UseCrumbs bool `json:"useCrumbs,omitempty"`

	UseSecurity bool `json:"useSecurity,omitempty"`

	Views []AllView `json:"views,omitempty"`
}
