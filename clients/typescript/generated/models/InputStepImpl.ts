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

import { InputStepImpllinks } from './InputStepImpllinks';
import { StringParameterDefinition } from './StringParameterDefinition';
import { HttpFile } from '../http/http';

export class InputStepImpl {
    '_class'?: string;
    'links'?: InputStepImpllinks;
    'id'?: string;
    'message'?: string;
    'ok'?: string;
    'parameters'?: Array<StringParameterDefinition>;
    'submitter'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "_class",
            "baseName": "_class",
            "type": "string",
            "format": ""
        },
        {
            "name": "links",
            "baseName": "_links",
            "type": "InputStepImpllinks",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string",
            "format": ""
        },
        {
            "name": "ok",
            "baseName": "ok",
            "type": "string",
            "format": ""
        },
        {
            "name": "parameters",
            "baseName": "parameters",
            "type": "Array<StringParameterDefinition>",
            "format": ""
        },
        {
            "name": "submitter",
            "baseName": "submitter",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return InputStepImpl.attributeTypeMap;
    }

    public constructor() {
    }
}

