// tslint:disable
/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
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
    LinkToJSON,
} from './';

/**
 * 
 * @export
 * @interface InputStepImpllinks
 */
export interface InputStepImpllinks  {
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
    return {
        'self': !exists(json, 'self') ? undefined : LinkFromJSON(json['self']),
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function InputStepImpllinksToJSON(value?: InputStepImpllinks): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'self': LinkToJSON(value.self),
        '_class': value._class,
    };
}


