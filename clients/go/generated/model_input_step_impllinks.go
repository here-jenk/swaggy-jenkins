/*
Swaggy Jenkins

Jenkins API clients generated from Swagger / Open API specification

API version: 1.5.1-pre.0
Contact: blah@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// InputStepImpllinks struct for InputStepImpllinks
type InputStepImpllinks struct {
	Self *Link `json:"self,omitempty"`
	Class *string `json:"_class,omitempty"`
}

// NewInputStepImpllinks instantiates a new InputStepImpllinks object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInputStepImpllinks() *InputStepImpllinks {
	this := InputStepImpllinks{}
	return &this
}

// NewInputStepImpllinksWithDefaults instantiates a new InputStepImpllinks object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInputStepImpllinksWithDefaults() *InputStepImpllinks {
	this := InputStepImpllinks{}
	return &this
}

// GetSelf returns the Self field value if set, zero value otherwise.
func (o *InputStepImpllinks) GetSelf() Link {
	if o == nil || o.Self == nil {
		var ret Link
		return ret
	}
	return *o.Self
}

// GetSelfOk returns a tuple with the Self field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InputStepImpllinks) GetSelfOk() (*Link, bool) {
	if o == nil || o.Self == nil {
		return nil, false
	}
	return o.Self, true
}

// HasSelf returns a boolean if a field has been set.
func (o *InputStepImpllinks) HasSelf() bool {
	if o != nil && o.Self != nil {
		return true
	}

	return false
}

// SetSelf gets a reference to the given Link and assigns it to the Self field.
func (o *InputStepImpllinks) SetSelf(v Link) {
	o.Self = &v
}

// GetClass returns the Class field value if set, zero value otherwise.
func (o *InputStepImpllinks) GetClass() string {
	if o == nil || o.Class == nil {
		var ret string
		return ret
	}
	return *o.Class
}

// GetClassOk returns a tuple with the Class field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InputStepImpllinks) GetClassOk() (*string, bool) {
	if o == nil || o.Class == nil {
		return nil, false
	}
	return o.Class, true
}

// HasClass returns a boolean if a field has been set.
func (o *InputStepImpllinks) HasClass() bool {
	if o != nil && o.Class != nil {
		return true
	}

	return false
}

// SetClass gets a reference to the given string and assigns it to the Class field.
func (o *InputStepImpllinks) SetClass(v string) {
	o.Class = &v
}

func (o InputStepImpllinks) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Self != nil {
		toSerialize["self"] = o.Self
	}
	if o.Class != nil {
		toSerialize["_class"] = o.Class
	}
	return json.Marshal(toSerialize)
}

type NullableInputStepImpllinks struct {
	value *InputStepImpllinks
	isSet bool
}

func (v NullableInputStepImpllinks) Get() *InputStepImpllinks {
	return v.value
}

func (v *NullableInputStepImpllinks) Set(val *InputStepImpllinks) {
	v.value = val
	v.isSet = true
}

func (v NullableInputStepImpllinks) IsSet() bool {
	return v.isSet
}

func (v *NullableInputStepImpllinks) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInputStepImpllinks(val *InputStepImpllinks) *NullableInputStepImpllinks {
	return &NullableInputStepImpllinks{value: val, isSet: true}
}

func (v NullableInputStepImpllinks) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInputStepImpllinks) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


