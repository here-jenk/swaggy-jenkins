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

type FreeStyleProject struct {

	Class string `json:"_class,omitempty"`

	Name string `json:"name,omitempty"`

	Url string `json:"url,omitempty"`

	Color string `json:"color,omitempty"`

	Actions []FreeStyleProjectactions `json:"actions,omitempty"`

	Description string `json:"description,omitempty"`

	DisplayName string `json:"displayName,omitempty"`

	DisplayNameOrNull string `json:"displayNameOrNull,omitempty"`

	FullDisplayName string `json:"fullDisplayName,omitempty"`

	FullName string `json:"fullName,omitempty"`

	Buildable bool `json:"buildable,omitempty"`

	Builds []FreeStyleBuild `json:"builds,omitempty"`

	FirstBuild FreeStyleBuild `json:"firstBuild,omitempty"`

	HealthReport []FreeStyleProjecthealthReport `json:"healthReport,omitempty"`

	InQueue bool `json:"inQueue,omitempty"`

	KeepDependencies bool `json:"keepDependencies,omitempty"`

	LastBuild FreeStyleBuild `json:"lastBuild,omitempty"`

	LastCompletedBuild FreeStyleBuild `json:"lastCompletedBuild,omitempty"`

	LastFailedBuild string `json:"lastFailedBuild,omitempty"`

	LastStableBuild FreeStyleBuild `json:"lastStableBuild,omitempty"`

	LastSuccessfulBuild FreeStyleBuild `json:"lastSuccessfulBuild,omitempty"`

	LastUnstableBuild string `json:"lastUnstableBuild,omitempty"`

	LastUnsuccessfulBuild string `json:"lastUnsuccessfulBuild,omitempty"`

	NextBuildNumber int32 `json:"nextBuildNumber,omitempty"`

	QueueItem string `json:"queueItem,omitempty"`

	ConcurrentBuild bool `json:"concurrentBuild,omitempty"`

	Scm NullScm `json:"scm,omitempty"`
}
