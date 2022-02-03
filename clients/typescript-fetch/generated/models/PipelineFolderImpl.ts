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
 * @interface PipelineFolderImpl
 */
export interface PipelineFolderImpl {
    /**
     * 
     * @type {string}
     * @memberof PipelineFolderImpl
     */
    _class?: string;
    /**
     * 
     * @type {string}
     * @memberof PipelineFolderImpl
     */
    displayName?: string;
    /**
     * 
     * @type {string}
     * @memberof PipelineFolderImpl
     */
    fullName?: string;
    /**
     * 
     * @type {string}
     * @memberof PipelineFolderImpl
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof PipelineFolderImpl
     */
    organization?: string;
    /**
     * 
     * @type {number}
     * @memberof PipelineFolderImpl
     */
    numberOfFolders?: number;
    /**
     * 
     * @type {number}
     * @memberof PipelineFolderImpl
     */
    numberOfPipelines?: number;
}

export function PipelineFolderImplFromJSON(json: any): PipelineFolderImpl {
    return PipelineFolderImplFromJSONTyped(json, false);
}

export function PipelineFolderImplFromJSONTyped(json: any, ignoreDiscriminator: boolean): PipelineFolderImpl {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        '_class': !exists(json, '_class') ? undefined : json['_class'],
        'displayName': !exists(json, 'displayName') ? undefined : json['displayName'],
        'fullName': !exists(json, 'fullName') ? undefined : json['fullName'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'organization': !exists(json, 'organization') ? undefined : json['organization'],
        'numberOfFolders': !exists(json, 'numberOfFolders') ? undefined : json['numberOfFolders'],
        'numberOfPipelines': !exists(json, 'numberOfPipelines') ? undefined : json['numberOfPipelines'],
    };
}

export function PipelineFolderImplToJSON(value?: PipelineFolderImpl | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        '_class': value._class,
        'displayName': value.displayName,
        'fullName': value.fullName,
        'name': value.name,
        'organization': value.organization,
        'numberOfFolders': value.numberOfFolders,
        'numberOfPipelines': value.numberOfPipelines,
    };
}

