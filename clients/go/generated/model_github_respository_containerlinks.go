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

// GithubRespositoryContainerlinks struct for GithubRespositoryContainerlinks
type GithubRespositoryContainerlinks struct {
	Self *Link `json:"self,omitempty"`
	Class *string `json:"_class,omitempty"`
}

// NewGithubRespositoryContainerlinks instantiates a new GithubRespositoryContainerlinks object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGithubRespositoryContainerlinks() *GithubRespositoryContainerlinks {
	this := GithubRespositoryContainerlinks{}
	return &this
}

// NewGithubRespositoryContainerlinksWithDefaults instantiates a new GithubRespositoryContainerlinks object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGithubRespositoryContainerlinksWithDefaults() *GithubRespositoryContainerlinks {
	this := GithubRespositoryContainerlinks{}
	return &this
}

// GetSelf returns the Self field value if set, zero value otherwise.
func (o *GithubRespositoryContainerlinks) GetSelf() Link {
	if o == nil || o.Self == nil {
		var ret Link
		return ret
	}
	return *o.Self
}

// GetSelfOk returns a tuple with the Self field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GithubRespositoryContainerlinks) GetSelfOk() (*Link, bool) {
	if o == nil || o.Self == nil {
		return nil, false
	}
	return o.Self, true
}

// HasSelf returns a boolean if a field has been set.
func (o *GithubRespositoryContainerlinks) HasSelf() bool {
	if o != nil && o.Self != nil {
		return true
	}

	return false
}

// SetSelf gets a reference to the given Link and assigns it to the Self field.
func (o *GithubRespositoryContainerlinks) SetSelf(v Link) {
	o.Self = &v
}

// GetClass returns the Class field value if set, zero value otherwise.
func (o *GithubRespositoryContainerlinks) GetClass() string {
	if o == nil || o.Class == nil {
		var ret string
		return ret
	}
	return *o.Class
}

// GetClassOk returns a tuple with the Class field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GithubRespositoryContainerlinks) GetClassOk() (*string, bool) {
	if o == nil || o.Class == nil {
		return nil, false
	}
	return o.Class, true
}

// HasClass returns a boolean if a field has been set.
func (o *GithubRespositoryContainerlinks) HasClass() bool {
	if o != nil && o.Class != nil {
		return true
	}

	return false
}

// SetClass gets a reference to the given string and assigns it to the Class field.
func (o *GithubRespositoryContainerlinks) SetClass(v string) {
	o.Class = &v
}

func (o GithubRespositoryContainerlinks) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Self != nil {
		toSerialize["self"] = o.Self
	}
	if o.Class != nil {
		toSerialize["_class"] = o.Class
	}
	return json.Marshal(toSerialize)
}

type NullableGithubRespositoryContainerlinks struct {
	value *GithubRespositoryContainerlinks
	isSet bool
}

func (v NullableGithubRespositoryContainerlinks) Get() *GithubRespositoryContainerlinks {
	return v.value
}

func (v *NullableGithubRespositoryContainerlinks) Set(val *GithubRespositoryContainerlinks) {
	v.value = val
	v.isSet = true
}

func (v NullableGithubRespositoryContainerlinks) IsSet() bool {
	return v.isSet
}

func (v *NullableGithubRespositoryContainerlinks) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGithubRespositoryContainerlinks(val *GithubRespositoryContainerlinks) *NullableGithubRespositoryContainerlinks {
	return &NullableGithubRespositoryContainerlinks{value: val, isSet: true}
}

func (v NullableGithubRespositoryContainerlinks) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGithubRespositoryContainerlinks) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


