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

import { RequestFile } from './models';

export class CauseUserIdCause {
    '_class'?: string;
    'shortDescription'?: string;
    'userId'?: string;
    'userName'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "_class",
            "baseName": "_class",
            "type": "string"
        },
        {
            "name": "shortDescription",
            "baseName": "shortDescription",
            "type": "string"
        },
        {
            "name": "userId",
            "baseName": "userId",
            "type": "string"
        },
        {
            "name": "userName",
            "baseName": "userName",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CauseUserIdCause.attributeTypeMap;
    }
}

