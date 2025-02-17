<?php
/**
 * BaseApiInterface
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\DefaultCrumbIssuer;

/**
 * BaseApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface BaseApiInterface
{

    /**
     * Sets authentication method jenkins_auth
     *
     * @param string $value Value of the jenkins_auth authentication method.
     *
     * @return void
     */
    public function setjenkins_auth($value);

    /**
     * Operation getCrumb
     *
     * @param  \array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return \OpenAPI\Server\Model\DefaultCrumbIssuer
     */
    public function getCrumb(&$responseCode, array &$responseHeaders): array|\OpenAPI\Server\Model\DefaultCrumbIssuer;

}
