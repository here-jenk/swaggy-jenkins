/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model


case class GithubRepositories (
  `class`: Option[String] = None,
  links: Option[GithubRepositorieslinks] = None,
  items: Option[List[GithubRepository]] = None,
  lastPage: Option[Integer] = None,
  nextPage: Option[Integer] = None,
  pageSize: Option[Integer] = None
)

