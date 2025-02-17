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

type ExtensionClassImpllinks struct {

	Self Link `json:"self,omitempty"`

	Class string `json:"_class,omitempty"`
}

// AssertExtensionClassImpllinksRequired checks if the required fields are not zero-ed
func AssertExtensionClassImpllinksRequired(obj ExtensionClassImpllinks) error {
	if err := AssertLinkRequired(obj.Self); err != nil {
		return err
	}
	return nil
}

// AssertRecurseExtensionClassImpllinksRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of ExtensionClassImpllinks (e.g. [][]ExtensionClassImpllinks), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseExtensionClassImpllinksRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aExtensionClassImpllinks, ok := obj.(ExtensionClassImpllinks)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertExtensionClassImpllinksRequired(aExtensionClassImpllinks)
	})
}
