/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


case class InputStepImpl(
  `class`: Option[String] = None,
  links: Option[InputStepImpllinks] = None,
  id: Option[String] = None,
  message: Option[String] = None,
  ok: Option[String] = None,
  parameters: Option[Seq[StringParameterDefinition]] = None,
  submitter: Option[String] = None
)

