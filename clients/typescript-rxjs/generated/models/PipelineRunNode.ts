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

import type {
    PipelineRunNodeedges,
} from './';

/**
 * @export
 * @interface PipelineRunNode
 */
export interface PipelineRunNode {
    /**
     * @type {string}
     * @memberof PipelineRunNode
     */
    _class?: string;
    /**
     * @type {string}
     * @memberof PipelineRunNode
     */
    displayName?: string;
    /**
     * @type {number}
     * @memberof PipelineRunNode
     */
    durationInMillis?: number;
    /**
     * @type {Array<PipelineRunNodeedges>}
     * @memberof PipelineRunNode
     */
    edges?: Array<PipelineRunNodeedges>;
    /**
     * @type {string}
     * @memberof PipelineRunNode
     */
    id?: string;
    /**
     * @type {string}
     * @memberof PipelineRunNode
     */
    result?: string;
    /**
     * @type {string}
     * @memberof PipelineRunNode
     */
    startTime?: string;
    /**
     * @type {string}
     * @memberof PipelineRunNode
     */
    state?: string;
}
