// tslint:disable
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
/**
 * 
 * @export
 * @interface FreeStyleProjectactions
 */
export interface FreeStyleProjectactions  {
    /**
     * 
     * @type {string}
     * @memberof FreeStyleProjectactions
     */
    _class?: string;
}

export function FreeStyleProjectactionsFromJSON(json: any): FreeStyleProjectactions {
    return {
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function FreeStyleProjectactionsToJSON(value?: FreeStyleProjectactions): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        '_class': value._class,
    };
}


