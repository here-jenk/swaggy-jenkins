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
import {
    Link,
    LinkFromJSON,
    LinkFromJSONTyped,
    LinkToJSON,
} from './Link';

/**
 * 
 * @export
 * @interface InputStepImpllinks
 */
export interface InputStepImpllinks {
    /**
     * 
     * @type {Link}
     * @memberof InputStepImpllinks
     */
    self?: Link;
    /**
     * 
     * @type {string}
     * @memberof InputStepImpllinks
     */
    _class?: string;
}

export function InputStepImpllinksFromJSON(json: any): InputStepImpllinks {
    return InputStepImpllinksFromJSONTyped(json, false);
}

export function InputStepImpllinksFromJSONTyped(json: any, ignoreDiscriminator: boolean): InputStepImpllinks {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'self': !exists(json, 'self') ? undefined : LinkFromJSON(json['self']),
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function InputStepImpllinksToJSON(value?: InputStepImpllinks | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'self': LinkToJSON(value.self),
        '_class': value._class,
    };
}

