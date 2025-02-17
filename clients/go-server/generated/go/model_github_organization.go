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

type GithubOrganization struct {

	Class string `json:"_class,omitempty"`

	Links GithubOrganizationlinks `json:"_links,omitempty"`

	JenkinsOrganizationPipeline bool `json:"jenkinsOrganizationPipeline,omitempty"`

	Name string `json:"name,omitempty"`
}

// AssertGithubOrganizationRequired checks if the required fields are not zero-ed
func AssertGithubOrganizationRequired(obj GithubOrganization) error {
	if err := AssertGithubOrganizationlinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertRecurseGithubOrganizationRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of GithubOrganization (e.g. [][]GithubOrganization), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseGithubOrganizationRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aGithubOrganization, ok := obj.(GithubOrganization)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertGithubOrganizationRequired(aGithubOrganization)
	})
}
