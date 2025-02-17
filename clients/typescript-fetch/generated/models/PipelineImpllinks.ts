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
 * @interface PipelineImpllinks
 */
export interface PipelineImpllinks {
    /**
     * 
     * @type {Link}
     * @memberof PipelineImpllinks
     */
    runs?: Link;
    /**
     * 
     * @type {Link}
     * @memberof PipelineImpllinks
     */
    self?: Link;
    /**
     * 
     * @type {Link}
     * @memberof PipelineImpllinks
     */
    queue?: Link;
    /**
     * 
     * @type {Link}
     * @memberof PipelineImpllinks
     */
    actions?: Link;
    /**
     * 
     * @type {string}
     * @memberof PipelineImpllinks
     */
    _class?: string;
}

export function PipelineImpllinksFromJSON(json: any): PipelineImpllinks {
    return PipelineImpllinksFromJSONTyped(json, false);
}

export function PipelineImpllinksFromJSONTyped(json: any, ignoreDiscriminator: boolean): PipelineImpllinks {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'runs': !exists(json, 'runs') ? undefined : LinkFromJSON(json['runs']),
        'self': !exists(json, 'self') ? undefined : LinkFromJSON(json['self']),
        'queue': !exists(json, 'queue') ? undefined : LinkFromJSON(json['queue']),
        'actions': !exists(json, 'actions') ? undefined : LinkFromJSON(json['actions']),
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function PipelineImpllinksToJSON(value?: PipelineImpllinks | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'runs': LinkToJSON(value.runs),
        'self': LinkToJSON(value.self),
        'queue': LinkToJSON(value.queue),
        'actions': LinkToJSON(value.actions),
        '_class': value._class,
    };
}

