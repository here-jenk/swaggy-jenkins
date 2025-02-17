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

package io.swagger.client.model
import play.api.libs.json._

case class Hudson (
                  `class`: Option[String],
                  assignedLabels: Option[Seq[HudsonassignedLabels]],
                  mode: Option[String],
                  nodeDescription: Option[String],
                  nodeName: Option[String],
                  numExecutors: Option[Int],
                  description: Option[String],
                  jobs: Option[Seq[FreeStyleProject]],
                  primaryView: Option[AllView],
                  quietingDown: Option[Boolean],
                  slaveAgentPort: Option[Int],
                  unlabeledLoad: Option[UnlabeledLoadStatistics],
                  useCrumbs: Option[Boolean],
                  useSecurity: Option[Boolean],
                  views: Option[Seq[AllView]]
)

object Hudson {
implicit val format: Format[Hudson] = Json.format
}

