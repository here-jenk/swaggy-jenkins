/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * OpenAPI spec version: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class QueueItemImpl {
    '_class'?: string;
    'expectedBuildNumber'?: number;
    'id'?: string;
    'pipeline'?: string;
    'queuedTime'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "_class",
            "baseName": "_class",
            "type": "string",
            "format": ""
        },
        {
            "name": "expectedBuildNumber",
            "baseName": "expectedBuildNumber",
            "type": "number",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "pipeline",
            "baseName": "pipeline",
            "type": "string",
            "format": ""
        },
        {
            "name": "queuedTime",
            "baseName": "queuedTime",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return QueueItemImpl.attributeTypeMap;
    }

    public constructor() {
    }
}

