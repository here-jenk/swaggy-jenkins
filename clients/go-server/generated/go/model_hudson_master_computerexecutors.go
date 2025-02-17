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

type HudsonMasterComputerexecutors struct {

	CurrentExecutable FreeStyleBuild `json:"currentExecutable,omitempty"`

	Idle bool `json:"idle,omitempty"`

	LikelyStuck bool `json:"likelyStuck,omitempty"`

	Number int32 `json:"number,omitempty"`

	Progress int32 `json:"progress,omitempty"`

	Class string `json:"_class,omitempty"`
}

// AssertHudsonMasterComputerexecutorsRequired checks if the required fields are not zero-ed
func AssertHudsonMasterComputerexecutorsRequired(obj HudsonMasterComputerexecutors) error {
	if err := AssertFreeStyleBuildRequired(obj.CurrentExecutable); err != nil {
		return err
	}
	return nil
}

// AssertRecurseHudsonMasterComputerexecutorsRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of HudsonMasterComputerexecutors (e.g. [][]HudsonMasterComputerexecutors), otherwise ErrTypeAssertionError is thrown.
func AssertRecurseHudsonMasterComputerexecutorsRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aHudsonMasterComputerexecutors, ok := obj.(HudsonMasterComputerexecutors)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertHudsonMasterComputerexecutorsRequired(aHudsonMasterComputerexecutors)
	})
}
