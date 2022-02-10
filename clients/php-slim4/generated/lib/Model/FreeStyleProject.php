<?php

/**
 * Swaggy Jenkins
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Jenkins API clients generated from Swagger / Open API specification
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

use OpenAPIServer\BaseModel;

/**
 * FreeStyleProject
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class FreeStyleProject extends BaseModel
{
    /**
     * @var string Models namespace.
     * Can be required for data deserialization when model contains referenced schemas.
     */
    protected const MODELS_NAMESPACE = '\OpenAPIServer\Model';

    /**
     * @var string Constant with OAS schema of current class.
     * Should be overwritten by inherited class.
     */
    protected const MODEL_SCHEMA = <<<'SCHEMA'
{
  "type" : "object",
  "properties" : {
    "_class" : {
      "type" : "string"
    },
    "name" : {
      "type" : "string"
    },
    "url" : {
      "type" : "string"
    },
    "color" : {
      "type" : "string"
    },
    "actions" : {
      "type" : "array",
      "items" : {
        "$ref" : "#/components/schemas/FreeStyleProjectactions"
      }
    },
    "description" : {
      "type" : "string"
    },
    "displayName" : {
      "type" : "string"
    },
    "displayNameOrNull" : {
      "type" : "string"
    },
    "fullDisplayName" : {
      "type" : "string"
    },
    "fullName" : {
      "type" : "string"
    },
    "buildable" : {
      "type" : "boolean"
    },
    "builds" : {
      "type" : "array",
      "items" : {
        "$ref" : "#/components/schemas/FreeStyleBuild"
      }
    },
    "firstBuild" : {
      "$ref" : "#/components/schemas/FreeStyleBuild"
    },
    "healthReport" : {
      "type" : "array",
      "items" : {
        "$ref" : "#/components/schemas/FreeStyleProjecthealthReport"
      }
    },
    "inQueue" : {
      "type" : "boolean"
    },
    "keepDependencies" : {
      "type" : "boolean"
    },
    "lastBuild" : {
      "$ref" : "#/components/schemas/FreeStyleBuild"
    },
    "lastCompletedBuild" : {
      "$ref" : "#/components/schemas/FreeStyleBuild"
    },
    "lastFailedBuild" : {
      "type" : "string"
    },
    "lastStableBuild" : {
      "$ref" : "#/components/schemas/FreeStyleBuild"
    },
    "lastSuccessfulBuild" : {
      "$ref" : "#/components/schemas/FreeStyleBuild"
    },
    "lastUnstableBuild" : {
      "type" : "string"
    },
    "lastUnsuccessfulBuild" : {
      "type" : "string"
    },
    "nextBuildNumber" : {
      "type" : "integer"
    },
    "queueItem" : {
      "type" : "string"
    },
    "concurrentBuild" : {
      "type" : "boolean"
    },
    "scm" : {
      "$ref" : "#/components/schemas/NullSCM"
    }
  }
}
SCHEMA;
}
