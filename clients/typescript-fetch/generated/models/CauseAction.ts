/* tslint:disable */
/* eslint-disable */
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

import { exists, mapValues } from '../runtime';
import {
    CauseUserIdCause,
    CauseUserIdCauseFromJSON,
    CauseUserIdCauseFromJSONTyped,
    CauseUserIdCauseToJSON,
} from './CauseUserIdCause';

/**
 * 
 * @export
 * @interface CauseAction
 */
export interface CauseAction {
    /**
     * 
     * @type {string}
     * @memberof CauseAction
     */
    _class?: string;
    /**
     * 
     * @type {Array<CauseUserIdCause>}
     * @memberof CauseAction
     */
    causes?: Array<CauseUserIdCause>;
}

export function CauseActionFromJSON(json: any): CauseAction {
    return CauseActionFromJSONTyped(json, false);
}

export function CauseActionFromJSONTyped(json: any, ignoreDiscriminator: boolean): CauseAction {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        '_class': !exists(json, '_class') ? undefined : json['_class'],
        'causes': !exists(json, 'causes') ? undefined : ((json['causes'] as Array<any>).map(CauseUserIdCauseFromJSON)),
    };
}

export function CauseActionToJSON(value?: CauseAction | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        '_class': value._class,
        'causes': value.causes === undefined ? undefined : ((value.causes as Array<any>).map(CauseUserIdCauseToJSON)),
    };
}

