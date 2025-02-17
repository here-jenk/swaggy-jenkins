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

// SwapSpaceMonitorMemoryUsage2 struct for SwapSpaceMonitorMemoryUsage2
type SwapSpaceMonitorMemoryUsage2 struct {
	Class *string `json:"_class,omitempty"`
	AvailablePhysicalMemory *int32 `json:"availablePhysicalMemory,omitempty"`
	AvailableSwapSpace *int32 `json:"availableSwapSpace,omitempty"`
	TotalPhysicalMemory *int32 `json:"totalPhysicalMemory,omitempty"`
	TotalSwapSpace *int32 `json:"totalSwapSpace,omitempty"`
}

// NewSwapSpaceMonitorMemoryUsage2 instantiates a new SwapSpaceMonitorMemoryUsage2 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSwapSpaceMonitorMemoryUsage2() *SwapSpaceMonitorMemoryUsage2 {
	this := SwapSpaceMonitorMemoryUsage2{}
	return &this
}

// NewSwapSpaceMonitorMemoryUsage2WithDefaults instantiates a new SwapSpaceMonitorMemoryUsage2 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSwapSpaceMonitorMemoryUsage2WithDefaults() *SwapSpaceMonitorMemoryUsage2 {
	this := SwapSpaceMonitorMemoryUsage2{}
	return &this
}

// GetClass returns the Class field value if set, zero value otherwise.
func (o *SwapSpaceMonitorMemoryUsage2) GetClass() string {
	if o == nil || o.Class == nil {
		var ret string
		return ret
	}
	return *o.Class
}

// GetClassOk returns a tuple with the Class field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SwapSpaceMonitorMemoryUsage2) GetClassOk() (*string, bool) {
	if o == nil || o.Class == nil {
		return nil, false
	}
	return o.Class, true
}

// HasClass returns a boolean if a field has been set.
func (o *SwapSpaceMonitorMemoryUsage2) HasClass() bool {
	if o != nil && o.Class != nil {
		return true
	}

	return false
}

// SetClass gets a reference to the given string and assigns it to the Class field.
func (o *SwapSpaceMonitorMemoryUsage2) SetClass(v string) {
	o.Class = &v
}

// GetAvailablePhysicalMemory returns the AvailablePhysicalMemory field value if set, zero value otherwise.
func (o *SwapSpaceMonitorMemoryUsage2) GetAvailablePhysicalMemory() int32 {
	if o == nil || o.AvailablePhysicalMemory == nil {
		var ret int32
		return ret
	}
	return *o.AvailablePhysicalMemory
}

// GetAvailablePhysicalMemoryOk returns a tuple with the AvailablePhysicalMemory field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SwapSpaceMonitorMemoryUsage2) GetAvailablePhysicalMemoryOk() (*int32, bool) {
	if o == nil || o.AvailablePhysicalMemory == nil {
		return nil, false
	}
	return o.AvailablePhysicalMemory, true
}

// HasAvailablePhysicalMemory returns a boolean if a field has been set.
func (o *SwapSpaceMonitorMemoryUsage2) HasAvailablePhysicalMemory() bool {
	if o != nil && o.AvailablePhysicalMemory != nil {
		return true
	}

	return false
}

// SetAvailablePhysicalMemory gets a reference to the given int32 and assigns it to the AvailablePhysicalMemory field.
func (o *SwapSpaceMonitorMemoryUsage2) SetAvailablePhysicalMemory(v int32) {
	o.AvailablePhysicalMemory = &v
}

// GetAvailableSwapSpace returns the AvailableSwapSpace field value if set, zero value otherwise.
func (o *SwapSpaceMonitorMemoryUsage2) GetAvailableSwapSpace() int32 {
	if o == nil || o.AvailableSwapSpace == nil {
		var ret int32
		return ret
	}
	return *o.AvailableSwapSpace
}

// GetAvailableSwapSpaceOk returns a tuple with the AvailableSwapSpace field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SwapSpaceMonitorMemoryUsage2) GetAvailableSwapSpaceOk() (*int32, bool) {
	if o == nil || o.AvailableSwapSpace == nil {
		return nil, false
	}
	return o.AvailableSwapSpace, true
}

// HasAvailableSwapSpace returns a boolean if a field has been set.
func (o *SwapSpaceMonitorMemoryUsage2) HasAvailableSwapSpace() bool {
	if o != nil && o.AvailableSwapSpace != nil {
		return true
	}

	return false
}

// SetAvailableSwapSpace gets a reference to the given int32 and assigns it to the AvailableSwapSpace field.
func (o *SwapSpaceMonitorMemoryUsage2) SetAvailableSwapSpace(v int32) {
	o.AvailableSwapSpace = &v
}

// GetTotalPhysicalMemory returns the TotalPhysicalMemory field value if set, zero value otherwise.
func (o *SwapSpaceMonitorMemoryUsage2) GetTotalPhysicalMemory() int32 {
	if o == nil || o.TotalPhysicalMemory == nil {
		var ret int32
		return ret
	}
	return *o.TotalPhysicalMemory
}

// GetTotalPhysicalMemoryOk returns a tuple with the TotalPhysicalMemory field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SwapSpaceMonitorMemoryUsage2) GetTotalPhysicalMemoryOk() (*int32, bool) {
	if o == nil || o.TotalPhysicalMemory == nil {
		return nil, false
	}
	return o.TotalPhysicalMemory, true
}

// HasTotalPhysicalMemory returns a boolean if a field has been set.
func (o *SwapSpaceMonitorMemoryUsage2) HasTotalPhysicalMemory() bool {
	if o != nil && o.TotalPhysicalMemory != nil {
		return true
	}

	return false
}

// SetTotalPhysicalMemory gets a reference to the given int32 and assigns it to the TotalPhysicalMemory field.
func (o *SwapSpaceMonitorMemoryUsage2) SetTotalPhysicalMemory(v int32) {
	o.TotalPhysicalMemory = &v
}

// GetTotalSwapSpace returns the TotalSwapSpace field value if set, zero value otherwise.
func (o *SwapSpaceMonitorMemoryUsage2) GetTotalSwapSpace() int32 {
	if o == nil || o.TotalSwapSpace == nil {
		var ret int32
		return ret
	}
	return *o.TotalSwapSpace
}

// GetTotalSwapSpaceOk returns a tuple with the TotalSwapSpace field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SwapSpaceMonitorMemoryUsage2) GetTotalSwapSpaceOk() (*int32, bool) {
	if o == nil || o.TotalSwapSpace == nil {
		return nil, false
	}
	return o.TotalSwapSpace, true
}

// HasTotalSwapSpace returns a boolean if a field has been set.
func (o *SwapSpaceMonitorMemoryUsage2) HasTotalSwapSpace() bool {
	if o != nil && o.TotalSwapSpace != nil {
		return true
	}

	return false
}

// SetTotalSwapSpace gets a reference to the given int32 and assigns it to the TotalSwapSpace field.
func (o *SwapSpaceMonitorMemoryUsage2) SetTotalSwapSpace(v int32) {
	o.TotalSwapSpace = &v
}

func (o SwapSpaceMonitorMemoryUsage2) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Class != nil {
		toSerialize["_class"] = o.Class
	}
	if o.AvailablePhysicalMemory != nil {
		toSerialize["availablePhysicalMemory"] = o.AvailablePhysicalMemory
	}
	if o.AvailableSwapSpace != nil {
		toSerialize["availableSwapSpace"] = o.AvailableSwapSpace
	}
	if o.TotalPhysicalMemory != nil {
		toSerialize["totalPhysicalMemory"] = o.TotalPhysicalMemory
	}
	if o.TotalSwapSpace != nil {
		toSerialize["totalSwapSpace"] = o.TotalSwapSpace
	}
	return json.Marshal(toSerialize)
}

type NullableSwapSpaceMonitorMemoryUsage2 struct {
	value *SwapSpaceMonitorMemoryUsage2
	isSet bool
}

func (v NullableSwapSpaceMonitorMemoryUsage2) Get() *SwapSpaceMonitorMemoryUsage2 {
	return v.value
}

func (v *NullableSwapSpaceMonitorMemoryUsage2) Set(val *SwapSpaceMonitorMemoryUsage2) {
	v.value = val
	v.isSet = true
}

func (v NullableSwapSpaceMonitorMemoryUsage2) IsSet() bool {
	return v.isSet
}

func (v *NullableSwapSpaceMonitorMemoryUsage2) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSwapSpaceMonitorMemoryUsage2(val *SwapSpaceMonitorMemoryUsage2) *NullableSwapSpaceMonitorMemoryUsage2 {
	return &NullableSwapSpaceMonitorMemoryUsage2{value: val, isSet: true}
}

func (v NullableSwapSpaceMonitorMemoryUsage2) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSwapSpaceMonitorMemoryUsage2) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


