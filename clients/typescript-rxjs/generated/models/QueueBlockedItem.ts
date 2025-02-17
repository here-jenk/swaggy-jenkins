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
    CauseAction,
    FreeStyleProject,
} from './';

/**
 * @export
 * @interface QueueBlockedItem
 */
export interface QueueBlockedItem {
    /**
     * @type {string}
     * @memberof QueueBlockedItem
     */
    _class?: string;
    /**
     * @type {Array<CauseAction>}
     * @memberof QueueBlockedItem
     */
    actions?: Array<CauseAction>;
    /**
     * @type {boolean}
     * @memberof QueueBlockedItem
     */
    blocked?: boolean;
    /**
     * @type {boolean}
     * @memberof QueueBlockedItem
     */
    buildable?: boolean;
    /**
     * @type {number}
     * @memberof QueueBlockedItem
     */
    id?: number;
    /**
     * @type {number}
     * @memberof QueueBlockedItem
     */
    inQueueSince?: number;
    /**
     * @type {string}
     * @memberof QueueBlockedItem
     */
    params?: string;
    /**
     * @type {boolean}
     * @memberof QueueBlockedItem
     */
    stuck?: boolean;
    /**
     * @type {FreeStyleProject}
     * @memberof QueueBlockedItem
     */
    task?: FreeStyleProject;
    /**
     * @type {string}
     * @memberof QueueBlockedItem
     */
    url?: string;
    /**
     * @type {string}
     * @memberof QueueBlockedItem
     */
    why?: string;
    /**
     * @type {number}
     * @memberof QueueBlockedItem
     */
    buildableStartMilliseconds?: number;
}
