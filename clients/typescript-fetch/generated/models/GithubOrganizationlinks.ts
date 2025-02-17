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
 * @interface GithubOrganizationlinks
 */
export interface GithubOrganizationlinks {
    /**
     * 
     * @type {Link}
     * @memberof GithubOrganizationlinks
     */
    repositories?: Link;
    /**
     * 
     * @type {Link}
     * @memberof GithubOrganizationlinks
     */
    self?: Link;
    /**
     * 
     * @type {string}
     * @memberof GithubOrganizationlinks
     */
    _class?: string;
}

export function GithubOrganizationlinksFromJSON(json: any): GithubOrganizationlinks {
    return GithubOrganizationlinksFromJSONTyped(json, false);
}

export function GithubOrganizationlinksFromJSONTyped(json: any, ignoreDiscriminator: boolean): GithubOrganizationlinks {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'repositories': !exists(json, 'repositories') ? undefined : LinkFromJSON(json['repositories']),
        'self': !exists(json, 'self') ? undefined : LinkFromJSON(json['self']),
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function GithubOrganizationlinksToJSON(value?: GithubOrganizationlinks | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'repositories': LinkToJSON(value.repositories),
        'self': LinkToJSON(value.self),
        '_class': value._class,
    };
}

