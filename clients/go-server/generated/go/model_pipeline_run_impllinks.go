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

type PipelineRunImpllinks struct {

	Nodes Link `json:"nodes,omitempty"`

	Log Link `json:"log,omitempty"`

	Self Link `json:"self,omitempty"`

	Actions Link `json:"actions,omitempty"`

	Steps Link `json:"steps,omitempty"`

	Class string `json:"_class,omitempty"`
}

// AssertPipelineRunImpllinksRequired checks if the required fields are not zero-ed
func AssertPipelineRunImpllinksRequired(obj PipelineRunImpllinks) error {
	if err := AssertLinkRequired(obj.Nodes); err != nil {
		return err
	}
	if err := AssertLinkRequired(obj.Log); err != nil {
		return err
	}
	if err := AssertLinkRequired(obj.Self); err != nil {
		return err
	}
	if err := AssertLinkRequired(obj.Actions); err != nil {
		return err
	}
	if err := AssertLinkRequired(obj.Steps); err != nil {
		return err
	}
	return nil
}

// AssertRecursePipelineRunImpllinksRequired recursively checks if required fields are not zero-ed in a nested slice.
// Accepts only nested slice of PipelineRunImpllinks (e.g. [][]PipelineRunImpllinks), otherwise ErrTypeAssertionError is thrown.
func AssertRecursePipelineRunImpllinksRequired(objSlice interface{}) error {
	return AssertRecurseInterfaceRequired(objSlice, func(obj interface{}) error {
		aPipelineRunImpllinks, ok := obj.(PipelineRunImpllinks)
		if !ok {
			return ErrTypeAssertionError
		}
		return AssertPipelineRunImpllinksRequired(aPipelineRunImpllinks)
	})
}
