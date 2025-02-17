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
 * @interface GenericResource
 */
export interface GenericResource  {
    /**
     * 
     * @type {string}
     * @memberof GenericResource
     */
    _class?: string;
    /**
     * 
     * @type {string}
     * @memberof GenericResource
     */
    displayName?: string;
    /**
     * 
     * @type {number}
     * @memberof GenericResource
     */
    durationInMillis?: number;
    /**
     * 
     * @type {string}
     * @memberof GenericResource
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof GenericResource
     */
    result?: string;
    /**
     * 
     * @type {string}
     * @memberof GenericResource
     */
    startTime?: string;
}

export function GenericResourceFromJSON(json: any): GenericResource {
    return {
        '_class': !exists(json, '_class') ? undefined : json['_class'],
        'displayName': !exists(json, 'displayName') ? undefined : json['displayName'],
        'durationInMillis': !exists(json, 'durationInMillis') ? undefined : json['durationInMillis'],
        'id': !exists(json, 'id') ? undefined : json['id'],
        'result': !exists(json, 'result') ? undefined : json['result'],
        'startTime': !exists(json, 'startTime') ? undefined : json['startTime'],
    };
}

export function GenericResourceToJSON(value?: GenericResource): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        '_class': value._class,
        'displayName': value.displayName,
        'durationInMillis': value.durationInMillis,
        'id': value.id,
        'result': value.result,
        'startTime': value.startTime,
    };
}


