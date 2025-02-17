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
package org.openapitools.client.api

import org.openapitools.client.model.DefaultCrumbIssuer
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object BaseApi {

  def apply(baseUrl: String = "http://localhost") = new BaseApi(baseUrl)
}

class BaseApi(baseUrl: String) {

  /**
   * Retrieve CSRF protection token
   * 
   * Expected answers:
   *   code 200 : DefaultCrumbIssuer (Successfully retrieved CSRF protection token)
   *   code 401 :  (Authentication failed - incorrect username and/or password)
   *   code 403 :  (Jenkins requires authentication - please set username and password)
   * 
   * Available security schemes:
   *   jenkins_auth (http)
   */
  def getCrumb()(implicit basicAuth: BasicCredentials): ApiRequest[DefaultCrumbIssuer] =
    ApiRequest[DefaultCrumbIssuer](ApiMethods.GET, baseUrl, "/crumbIssuer/api/json", "application/json")
      .withCredentials(basicAuth).withSuccessResponse[DefaultCrumbIssuer](200)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](403)
      



}

