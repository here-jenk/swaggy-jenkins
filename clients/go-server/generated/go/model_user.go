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

type User struct {

	Class string `json:"_class,omitempty"`

	Id string `json:"id,omitempty"`

	FullName string `json:"fullName,omitempty"`

	Email string `json:"email,omitempty"`

	Name string `json:"name,omitempty"`
}

// AssertUserRequired checks if the required fields are not zero-ed
func AssertUserRequired(obj User) error {
	return nil
}

// AssertRecurseUserRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of User (e.g. [][]User), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseUserRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aUser, ok := obj.(User)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertUserRequired(aUser)
	})
}
