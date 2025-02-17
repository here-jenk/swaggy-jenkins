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

type FavoriteImpllinks struct {

	Self Link `json:"self,omitempty"`

	Class string `json:"_class,omitempty"`
}

// AssertFavoriteImpllinksRequired checks if the required fields are not zero-ed
func AssertFavoriteImpllinksRequired(obj FavoriteImpllinks) error {
	if err := AssertLinkRequired(obj.Self); err != nil {
		return err
	}
	return nil
}

// AssertRecurseFavoriteImpllinksRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of FavoriteImpllinks (e.g. [][]FavoriteImpllinks), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseFavoriteImpllinksRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aFavoriteImpllinks, ok := obj.(FavoriteImpllinks)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertFavoriteImpllinksRequired(aFavoriteImpllinks)
	})
}
