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

case class ResponseTimeMonitorData (
                  `class`: Option[String],
                  timestamp: Option[Int],
                  average: Option[Int]
)

object ResponseTimeMonitorData {
implicit val format: Format[ResponseTimeMonitorData] = Json.format
}

