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
    Link,
    LinkFromJSON,
    LinkFromJSONTyped,
    LinkToJSON,
} from './Link';

/**
 * 
 * @export
 * @interface GithubRespositoryContainerlinks
 */
export interface GithubRespositoryContainerlinks {
    /**
     * 
     * @type {Link}
     * @memberof GithubRespositoryContainerlinks
     */
    self?: Link;
    /**
     * 
     * @type {string}
     * @memberof GithubRespositoryContainerlinks
     */
    _class?: string;
}

export function GithubRespositoryContainerlinksFromJSON(json: any): GithubRespositoryContainerlinks {
    return GithubRespositoryContainerlinksFromJSONTyped(json, false);
}

export function GithubRespositoryContainerlinksFromJSONTyped(json: any, ignoreDiscriminator: boolean): GithubRespositoryContainerlinks {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'self': !exists(json, 'self') ? undefined : LinkFromJSON(json['self']),
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function GithubRespositoryContainerlinksToJSON(value?: GithubRespositoryContainerlinks | null): any {
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

