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
 * @interface PipelineStepImpllinks
 */
export interface PipelineStepImpllinks {
    /**
     * 
     * @type {Link}
     * @memberof PipelineStepImpllinks
     */
    self?: Link;
    /**
     * 
     * @type {Link}
     * @memberof PipelineStepImpllinks
     */
    actions?: Link;
    /**
     * 
     * @type {string}
     * @memberof PipelineStepImpllinks
     */
    _class?: string;
}

export function PipelineStepImpllinksFromJSON(json: any): PipelineStepImpllinks {
    return PipelineStepImpllinksFromJSONTyped(json, false);
}

export function PipelineStepImpllinksFromJSONTyped(json: any, ignoreDiscriminator: boolean): PipelineStepImpllinks {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'self': !exists(json, 'self') ? undefined : LinkFromJSON(json['self']),
        'actions': !exists(json, 'actions') ? undefined : LinkFromJSON(json['actions']),
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function PipelineStepImpllinksToJSON(value?: PipelineStepImpllinks | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'self': LinkToJSON(value.self),
        'actions': LinkToJSON(value.actions),
        '_class': value._class,
    };
}

