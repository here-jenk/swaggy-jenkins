/* tslint:disable */
/* eslint-disable */
/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.1
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CauseUserIdCause
 */
export interface CauseUserIdCause {
    /**
     * 
     * @type {string}
     * @memberof CauseUserIdCause
     */
    _class?: string;
    /**
     * 
     * @type {string}
     * @memberof CauseUserIdCause
     */
    shortDescription?: string;
    /**
     * 
     * @type {string}
     * @memberof CauseUserIdCause
     */
    userId?: string;
    /**
     * 
     * @type {string}
     * @memberof CauseUserIdCause
     */
    userName?: string;
}

export function CauseUserIdCauseFromJSON(json: any): CauseUserIdCause {
    return CauseUserIdCauseFromJSONTyped(json, false);
}

export function CauseUserIdCauseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CauseUserIdCause {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        '_class': !exists(json, '_class') ? undefined : json['_class'],
        'shortDescription': !exists(json, 'shortDescription') ? undefined : json['shortDescription'],
        'userId': !exists(json, 'userId') ? undefined : json['userId'],
        'userName': !exists(json, 'userName') ? undefined : json['userName'],
    };
}

export function CauseUserIdCauseToJSON(value?: CauseUserIdCause | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        '_class': value._class,
        'shortDescription': value.shortDescription,
        'userId': value.userId,
        'userName': value.userName,
    };
}

