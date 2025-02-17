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
import {
    Link,
    LinkFromJSON,
    LinkToJSON,
} from './';

/**
 * 
 * @export
 * @interface FavoriteImpllinks
 */
export interface FavoriteImpllinks  {
    /**
     * 
     * @type {Link}
     * @memberof FavoriteImpllinks
     */
    self?: Link;
    /**
     * 
     * @type {string}
     * @memberof FavoriteImpllinks
     */
    _class?: string;
}

export function FavoriteImpllinksFromJSON(json: any): FavoriteImpllinks {
    return {
        'self': !exists(json, 'self') ? undefined : LinkFromJSON(json['self']),
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function FavoriteImpllinksToJSON(value?: FavoriteImpllinks): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'self': LinkToJSON(value.self),
        '_class': value._class,
    };
}


