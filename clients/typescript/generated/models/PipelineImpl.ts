/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * OpenAPI spec version: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { PipelineImpllinks } from './PipelineImpllinks';
import { HttpFile } from '../http/http';

export class PipelineImpl {
    '_class'?: string;
    'displayName'?: string;
    'estimatedDurationInMillis'?: number;
    'fullName'?: string;
    'latestRun'?: string;
    'name'?: string;
    'organization'?: string;
    'weatherScore'?: number;
    'links'?: PipelineImpllinks;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "_class",
            "baseName": "_class",
            "type": "string",
            "format": ""
        },
        {
            "name": "displayName",
            "baseName": "displayName",
            "type": "string",
            "format": ""
        },
        {
            "name": "estimatedDurationInMillis",
            "baseName": "estimatedDurationInMillis",
            "type": "number",
            "format": ""
        },
        {
            "name": "fullName",
            "baseName": "fullName",
            "type": "string",
            "format": ""
        },
        {
            "name": "latestRun",
            "baseName": "latestRun",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "organization",
            "baseName": "organization",
            "type": "string",
            "format": ""
        },
        {
            "name": "weatherScore",
            "baseName": "weatherScore",
            "type": "number",
            "format": ""
        },
        {
            "name": "links",
            "baseName": "_links",
            "type": "PipelineImpllinks",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PipelineImpl.attributeTypeMap;
    }

    public constructor() {
    }
}

