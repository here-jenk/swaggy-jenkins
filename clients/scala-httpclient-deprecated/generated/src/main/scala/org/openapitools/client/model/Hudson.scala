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


case class Hudson (
  `class`: Option[String] = None,
  assignedLabels: Option[List[HudsonassignedLabels]] = None,
  mode: Option[String] = None,
  nodeDescription: Option[String] = None,
  nodeName: Option[String] = None,
  numExecutors: Option[Integer] = None,
  description: Option[String] = None,
  jobs: Option[List[FreeStyleProject]] = None,
  primaryView: Option[AllView] = None,
  quietingDown: Option[Boolean] = None,
  slaveAgentPort: Option[Integer] = None,
  unlabeledLoad: Option[UnlabeledLoadStatistics] = None,
  useCrumbs: Option[Boolean] = None,
  useSecurity: Option[Boolean] = None,
  views: Option[List[AllView]] = None
)

