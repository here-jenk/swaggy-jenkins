/*
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * API version: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type ListView struct {

	Class string `json:"_class,omitempty"`

	Description string `json:"description,omitempty"`

	Jobs []FreeStyleProject `json:"jobs,omitempty"`

	Name string `json:"name,omitempty"`

	Url string `json:"url,omitempty"`
}
