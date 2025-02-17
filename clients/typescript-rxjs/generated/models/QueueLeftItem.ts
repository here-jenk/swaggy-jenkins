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
    FreeStyleBuild,
    FreeStyleProject,
} from './';

/**
 * @export
 * @interface QueueLeftItem
 */
export interface QueueLeftItem {
    /**
     * @type {string}
     * @memberof QueueLeftItem
     */
    _class?: string;
    /**
     * @type {Array<CauseAction>}
     * @memberof QueueLeftItem
     */
    actions?: Array<CauseAction>;
    /**
     * @type {boolean}
     * @memberof QueueLeftItem
     */
    blocked?: boolean;
    /**
     * @type {boolean}
     * @memberof QueueLeftItem
     */
    buildable?: boolean;
    /**
     * @type {number}
     * @memberof QueueLeftItem
     */
    id?: number;
    /**
     * @type {number}
     * @memberof QueueLeftItem
     */
    inQueueSince?: number;
    /**
     * @type {string}
     * @memberof QueueLeftItem
     */
    params?: string;
    /**
     * @type {boolean}
     * @memberof QueueLeftItem
     */
    stuck?: boolean;
    /**
     * @type {FreeStyleProject}
     * @memberof QueueLeftItem
     */
    task?: FreeStyleProject;
    /**
     * @type {string}
     * @memberof QueueLeftItem
     */
    url?: string;
    /**
     * @type {string}
     * @memberof QueueLeftItem
     */
    why?: string;
    /**
     * @type {boolean}
     * @memberof QueueLeftItem
     */
    cancelled?: boolean;
    /**
     * @type {FreeStyleBuild}
     * @memberof QueueLeftItem
     */
    executable?: FreeStyleBuild;
}
