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
    FreeStyleBuild,
    FreeStyleBuildFromJSON,
    FreeStyleBuildFromJSONTyped,
    FreeStyleBuildToJSON,
} from './FreeStyleBuild';

/**
 * 
 * @export
 * @interface HudsonMasterComputerexecutors
 */
export interface HudsonMasterComputerexecutors {
    /**
     * 
     * @type {FreeStyleBuild}
     * @memberof HudsonMasterComputerexecutors
     */
    currentExecutable?: FreeStyleBuild;
    /**
     * 
     * @type {boolean}
     * @memberof HudsonMasterComputerexecutors
     */
    idle?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof HudsonMasterComputerexecutors
     */
    likelyStuck?: boolean;
    /**
     * 
     * @type {number}
     * @memberof HudsonMasterComputerexecutors
     */
    number?: number;
    /**
     * 
     * @type {number}
     * @memberof HudsonMasterComputerexecutors
     */
    progress?: number;
    /**
     * 
     * @type {string}
     * @memberof HudsonMasterComputerexecutors
     */
    _class?: string;
}

export function HudsonMasterComputerexecutorsFromJSON(json: any): HudsonMasterComputerexecutors {
    return HudsonMasterComputerexecutorsFromJSONTyped(json, false);
}

export function HudsonMasterComputerexecutorsFromJSONTyped(json: any, ignoreDiscriminator: boolean): HudsonMasterComputerexecutors {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'currentExecutable': !exists(json, 'currentExecutable') ? undefined : FreeStyleBuildFromJSON(json['currentExecutable']),
        'idle': !exists(json, 'idle') ? undefined : json['idle'],
        'likelyStuck': !exists(json, 'likelyStuck') ? undefined : json['likelyStuck'],
        'number': !exists(json, 'number') ? undefined : json['number'],
        'progress': !exists(json, 'progress') ? undefined : json['progress'],
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function HudsonMasterComputerexecutorsToJSON(value?: HudsonMasterComputerexecutors | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'currentExecutable': FreeStyleBuildToJSON(value.currentExecutable),
        'idle': value.idle,
        'likelyStuck': value.likelyStuck,
        'number': value.number,
        'progress': value.progress,
        '_class': value._class,
    };
}

