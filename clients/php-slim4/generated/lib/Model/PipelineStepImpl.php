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
 * The version of the OpenAPI document: 1.5.1-pre.0
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
 * PipelineStepImpl
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class PipelineStepImpl extends BaseModel
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
    "_links" : {
      "$ref" : "#/components/schemas/PipelineStepImpllinks"
    },
    "displayName" : {
      "type" : "string"
    },
    "durationInMillis" : {
      "type" : "integer"
    },
    "id" : {
      "type" : "string"
    },
    "input" : {
      "$ref" : "#/components/schemas/InputStepImpl"
    },
    "result" : {
      "type" : "string"
    },
    "startTime" : {
      "type" : "string"
    },
    "state" : {
      "type" : "string"
    }
  }
}
SCHEMA;
}
