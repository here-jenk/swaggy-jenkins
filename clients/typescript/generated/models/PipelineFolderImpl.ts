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

export class PipelineFolderImpl {
    '_class'?: string;
    'displayName'?: string;
    'fullName'?: string;
    'name'?: string;
    'organization'?: string;
    'numberOfFolders'?: number;
    'numberOfPipelines'?: number;

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
            "name": "fullName",
            "baseName": "fullName",
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
            "name": "numberOfFolders",
            "baseName": "numberOfFolders",
            "type": "number",
            "format": ""
        },
        {
            "name": "numberOfPipelines",
            "baseName": "numberOfPipelines",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PipelineFolderImpl.attributeTypeMap;
    }

    public constructor() {
    }
}

