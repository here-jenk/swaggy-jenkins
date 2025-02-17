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

// PipelineRunartifacts struct for PipelineRunartifacts
type PipelineRunartifacts struct {
	Name *string `json:"name,omitempty"`
	Size *int32 `json:"size,omitempty"`
	Url *string `json:"url,omitempty"`
	Class *string `json:"_class,omitempty"`
}

// NewPipelineRunartifacts instantiates a new PipelineRunartifacts object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPipelineRunartifacts() *PipelineRunartifacts {
	this := PipelineRunartifacts{}
	return &this
}

// NewPipelineRunartifactsWithDefaults instantiates a new PipelineRunartifacts object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPipelineRunartifactsWithDefaults() *PipelineRunartifacts {
	this := PipelineRunartifacts{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *PipelineRunartifacts) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PipelineRunartifacts) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *PipelineRunartifacts) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *PipelineRunartifacts) SetName(v string) {
	o.Name = &v
}

// GetSize returns the Size field value if set, zero value otherwise.
func (o *PipelineRunartifacts) GetSize() int32 {
	if o == nil || o.Size == nil {
		var ret int32
		return ret
	}
	return *o.Size
}

// GetSizeOk returns a tuple with the Size field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PipelineRunartifacts) GetSizeOk() (*int32, bool) {
	if o == nil || o.Size == nil {
		return nil, false
	}
	return o.Size, true
}

// HasSize returns a boolean if a field has been set.
func (o *PipelineRunartifacts) HasSize() bool {
	if o != nil && o.Size != nil {
		return true
	}

	return false
}

// SetSize gets a reference to the given int32 and assigns it to the Size field.
func (o *PipelineRunartifacts) SetSize(v int32) {
	o.Size = &v
}

// GetUrl returns the Url field value if set, zero value otherwise.
func (o *PipelineRunartifacts) GetUrl() string {
	if o == nil || o.Url == nil {
		var ret string
		return ret
	}
	return *o.Url
}

// GetUrlOk returns a tuple with the Url field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PipelineRunartifacts) GetUrlOk() (*string, bool) {
	if o == nil || o.Url == nil {
		return nil, false
	}
	return o.Url, true
}

// HasUrl returns a boolean if a field has been set.
func (o *PipelineRunartifacts) HasUrl() bool {
	if o != nil && o.Url != nil {
		return true
	}

	return false
}

// SetUrl gets a reference to the given string and assigns it to the Url field.
func (o *PipelineRunartifacts) SetUrl(v string) {
	o.Url = &v
}

// GetClass returns the Class field value if set, zero value otherwise.
func (o *PipelineRunartifacts) GetClass() string {
	if o == nil || o.Class == nil {
		var ret string
		return ret
	}
	return *o.Class
}

// GetClassOk returns a tuple with the Class field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PipelineRunartifacts) GetClassOk() (*string, bool) {
	if o == nil || o.Class == nil {
		return nil, false
	}
	return o.Class, true
}

// HasClass returns a boolean if a field has been set.
func (o *PipelineRunartifacts) HasClass() bool {
	if o != nil && o.Class != nil {
		return true
	}

	return false
}

// SetClass gets a reference to the given string and assigns it to the Class field.
func (o *PipelineRunartifacts) SetClass(v string) {
	o.Class = &v
}

func (o PipelineRunartifacts) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if o.Size != nil {
		toSerialize["size"] = o.Size
	}
	if o.Url != nil {
		toSerialize["url"] = o.Url
	}
	if o.Class != nil {
		toSerialize["_class"] = o.Class
	}
	return json.Marshal(toSerialize)
}

type NullablePipelineRunartifacts struct {
	value *PipelineRunartifacts
	isSet bool
}

func (v NullablePipelineRunartifacts) Get() *PipelineRunartifacts {
	return v.value
}

func (v *NullablePipelineRunartifacts) Set(val *PipelineRunartifacts) {
	v.value = val
	v.isSet = true
}

func (v NullablePipelineRunartifacts) IsSet() bool {
	return v.isSet
}

func (v *NullablePipelineRunartifacts) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePipelineRunartifacts(val *PipelineRunartifacts) *NullablePipelineRunartifacts {
	return &NullablePipelineRunartifacts{value: val, isSet: true}
}

func (v NullablePipelineRunartifacts) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePipelineRunartifacts) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


