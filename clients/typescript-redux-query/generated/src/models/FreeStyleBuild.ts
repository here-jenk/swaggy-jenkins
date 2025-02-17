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
    CauseAction,
    CauseActionFromJSON,
    CauseActionToJSON,
    EmptyChangeLogSet,
    EmptyChangeLogSetFromJSON,
    EmptyChangeLogSetToJSON,
} from './';

/**
 * 
 * @export
 * @interface FreeStyleBuild
 */
export interface FreeStyleBuild  {
    /**
     * 
     * @type {string}
     * @memberof FreeStyleBuild
     */
    _class?: string;
    /**
     * 
     * @type {number}
     * @memberof FreeStyleBuild
     */
    number?: number;
    /**
     * 
     * @type {string}
     * @memberof FreeStyleBuild
     */
    url?: string;
    /**
     * 
     * @type {Array<CauseAction>}
     * @memberof FreeStyleBuild
     */
    actions?: Array<CauseAction>;
    /**
     * 
     * @type {boolean}
     * @memberof FreeStyleBuild
     */
    building?: boolean;
    /**
     * 
     * @type {string}
     * @memberof FreeStyleBuild
     */
    description?: string;
    /**
     * 
     * @type {string}
     * @memberof FreeStyleBuild
     */
    displayName?: string;
    /**
     * 
     * @type {number}
     * @memberof FreeStyleBuild
     */
    duration?: number;
    /**
     * 
     * @type {number}
     * @memberof FreeStyleBuild
     */
    estimatedDuration?: number;
    /**
     * 
     * @type {string}
     * @memberof FreeStyleBuild
     */
    executor?: string;
    /**
     * 
     * @type {string}
     * @memberof FreeStyleBuild
     */
    fullDisplayName?: string;
    /**
     * 
     * @type {string}
     * @memberof FreeStyleBuild
     */
    id?: string;
    /**
     * 
     * @type {boolean}
     * @memberof FreeStyleBuild
     */
    keepLog?: boolean;
    /**
     * 
     * @type {number}
     * @memberof FreeStyleBuild
     */
    queueId?: number;
    /**
     * 
     * @type {string}
     * @memberof FreeStyleBuild
     */
    result?: string;
    /**
     * 
     * @type {number}
     * @memberof FreeStyleBuild
     */
    timestamp?: number;
    /**
     * 
     * @type {string}
     * @memberof FreeStyleBuild
     */
    builtOn?: string;
    /**
     * 
     * @type {EmptyChangeLogSet}
     * @memberof FreeStyleBuild
     */
    changeSet?: EmptyChangeLogSet;
}

export function FreeStyleBuildFromJSON(json: any): FreeStyleBuild {
    return {
        '_class': !exists(json, '_class') ? undefined : json['_class'],
        'number': !exists(json, 'number') ? undefined : json['number'],
        'url': !exists(json, 'url') ? undefined : json['url'],
        'actions': !exists(json, 'actions') ? undefined : (json['actions'] as Array<any>).map(CauseActionFromJSON),
        'building': !exists(json, 'building') ? undefined : json['building'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'displayName': !exists(json, 'displayName') ? undefined : json['displayName'],
        'duration': !exists(json, 'duration') ? undefined : json['duration'],
        'estimatedDuration': !exists(json, 'estimatedDuration') ? undefined : json['estimatedDuration'],
        'executor': !exists(json, 'executor') ? undefined : json['executor'],
        'fullDisplayName': !exists(json, 'fullDisplayName') ? undefined : json['fullDisplayName'],
        'id': !exists(json, 'id') ? undefined : json['id'],
        'keepLog': !exists(json, 'keepLog') ? undefined : json['keepLog'],
        'queueId': !exists(json, 'queueId') ? undefined : json['queueId'],
        'result': !exists(json, 'result') ? undefined : json['result'],
        'timestamp': !exists(json, 'timestamp') ? undefined : json['timestamp'],
        'builtOn': !exists(json, 'builtOn') ? undefined : json['builtOn'],
        'changeSet': !exists(json, 'changeSet') ? undefined : EmptyChangeLogSetFromJSON(json['changeSet']),
    };
}

export function FreeStyleBuildToJSON(value?: FreeStyleBuild): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        '_class': value._class,
        'number': value.number,
        'url': value.url,
        'actions': value.actions === undefined ? undefined : (value.actions as Array<any>).map(CauseActionToJSON),
        'building': value.building,
        'description': value.description,
        'displayName': value.displayName,
        'duration': value.duration,
        'estimatedDuration': value.estimatedDuration,
        'executor': value.executor,
        'fullDisplayName': value.fullDisplayName,
        'id': value.id,
        'keepLog': value.keepLog,
        'queueId': value.queueId,
        'result': value.result,
        'timestamp': value.timestamp,
        'builtOn': value.builtOn,
        'changeSet': EmptyChangeLogSetToJSON(value.changeSet),
    };
}


