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


case class PipelineRunNode(
  `class`: Option[String] = None,
  displayName: Option[String] = None,
  durationInMillis: Option[Int] = None,
  edges: Option[Seq[PipelineRunNodeedges]] = None,
  id: Option[String] = None,
  result: Option[String] = None,
  startTime: Option[String] = None,
  state: Option[String] = None
)

