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

type GithubScm struct {

	Class string `json:"_class,omitempty"`

	Links GithubScmlinks `json:"_links,omitempty"`

	CredentialId string `json:"credentialId,omitempty"`

	Id string `json:"id,omitempty"`

	Uri string `json:"uri,omitempty"`
}
