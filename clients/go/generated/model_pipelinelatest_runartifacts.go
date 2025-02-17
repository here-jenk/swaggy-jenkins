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

// PipelinelatestRunartifacts struct for PipelinelatestRunartifacts
type PipelinelatestRunartifacts struct {
	Name *string `json:"name,omitempty"`
	Size *int32 `json:"size,omitempty"`
	Url *string `json:"url,omitempty"`
	Class *string `json:"_class,omitempty"`
}

// NewPipelinelatestRunartifacts instantiates a new PipelinelatestRunartifacts object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPipelinelatestRunartifacts() *PipelinelatestRunartifacts {
	this := PipelinelatestRunartifacts{}
	return &this
}

// NewPipelinelatestRunartifactsWithDefaults instantiates a new PipelinelatestRunartifacts object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPipelinelatestRunartifactsWithDefaults() *PipelinelatestRunartifacts {
	this := PipelinelatestRunartifacts{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *PipelinelatestRunartifacts) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PipelinelatestRunartifacts) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *PipelinelatestRunartifacts) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *PipelinelatestRunartifacts) SetName(v string) {
	o.Name = &v
}

// GetSize returns the Size field value if set, zero value otherwise.
func (o *PipelinelatestRunartifacts) GetSize() int32 {
	if o == nil || o.Size == nil {
		var ret int32
		return ret
	}
	return *o.Size
}

// GetSizeOk returns a tuple with the Size field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PipelinelatestRunartifacts) GetSizeOk() (*int32, bool) {
	if o == nil || o.Size == nil {
		return nil, false
	}
	return o.Size, true
}

// HasSize returns a boolean if a field has been set.
func (o *PipelinelatestRunartifacts) HasSize() bool {
	if o != nil && o.Size != nil {
		return true
	}

	return false
}

// SetSize gets a reference to the given int32 and assigns it to the Size field.
func (o *PipelinelatestRunartifacts) SetSize(v int32) {
	o.Size = &v
}

// GetUrl returns the Url field value if set, zero value otherwise.
func (o *PipelinelatestRunartifacts) GetUrl() string {
	if o == nil || o.Url == nil {
		var ret string
		return ret
	}
	return *o.Url
}

// GetUrlOk returns a tuple with the Url field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PipelinelatestRunartifacts) GetUrlOk() (*string, bool) {
	if o == nil || o.Url == nil {
		return nil, false
	}
	return o.Url, true
}

// HasUrl returns a boolean if a field has been set.
func (o *PipelinelatestRunartifacts) HasUrl() bool {
	if o != nil && o.Url != nil {
		return true
	}

	return false
}

// SetUrl gets a reference to the given string and assigns it to the Url field.
func (o *PipelinelatestRunartifacts) SetUrl(v string) {
	o.Url = &v
}

// GetClass returns the Class field value if set, zero value otherwise.
func (o *PipelinelatestRunartifacts) GetClass() string {
	if o == nil || o.Class == nil {
		var ret string
		return ret
	}
	return *o.Class
}

// GetClassOk returns a tuple with the Class field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PipelinelatestRunartifacts) GetClassOk() (*string, bool) {
	if o == nil || o.Class == nil {
		return nil, false
	}
	return o.Class, true
}

// HasClass returns a boolean if a field has been set.
func (o *PipelinelatestRunartifacts) HasClass() bool {
	if o != nil && o.Class != nil {
		return true
	}

	return false
}

// SetClass gets a reference to the given string and assigns it to the Class field.
func (o *PipelinelatestRunartifacts) SetClass(v string) {
	o.Class = &v
}

func (o PipelinelatestRunartifacts) MarshalJSON() ([]byte, error) {
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

type NullablePipelinelatestRunartifacts struct {
	value *PipelinelatestRunartifacts
	isSet bool
}

func (v NullablePipelinelatestRunartifacts) Get() *PipelinelatestRunartifacts {
	return v.value
}

func (v *NullablePipelinelatestRunartifacts) Set(val *PipelinelatestRunartifacts) {
	v.value = val
	v.isSet = true
}

func (v NullablePipelinelatestRunartifacts) IsSet() bool {
	return v.isSet
}

func (v *NullablePipelinelatestRunartifacts) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePipelinelatestRunartifacts(val *PipelinelatestRunartifacts) *NullablePipelinelatestRunartifacts {
	return &NullablePipelinelatestRunartifacts{value: val, isSet: true}
}

func (v NullablePipelinelatestRunartifacts) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePipelinelatestRunartifacts) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


