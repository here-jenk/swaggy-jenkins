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

type GithubRepositories struct {

	Class string `json:"_class,omitempty"`

	Links GithubRepositorieslinks `json:"_links,omitempty"`

	Items []GithubRepository `json:"items,omitempty"`

	LastPage int32 `json:"lastPage,omitempty"`

	NextPage int32 `json:"nextPage,omitempty"`

	PageSize int32 `json:"pageSize,omitempty"`
}

// AssertGithubRepositoriesRequired checks if the required fields are not zero-ed
func AssertGithubRepositoriesRequired(obj GithubRepositories) error {
	if err := AssertGithubRepositorieslinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Items {
		if err := AssertGithubRepositoryRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertRecurseGithubRepositoriesRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of GithubRepositories (e.g. [][]GithubRepositories), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseGithubRepositoriesRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aGithubRepositories, ok := obj.(GithubRepositories)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertGithubRepositoriesRequired(aGithubRepositories)
	})
}
