// tslint:disable
/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import {
    BranchImpllinks,
    BranchImplpermissions,
    PipelineRunImpl,
    StringParameterDefinition,
} from './';

/**
 * @export
 * @interface BranchImpl
 */
export interface BranchImpl {
    /**
     * @type {string}
     * @memberof BranchImpl
     */
    _class?: string;
    /**
     * @type {string}
     * @memberof BranchImpl
     */
    displayName?: string;
    /**
     * @type {number}
     * @memberof BranchImpl
     */
    estimatedDurationInMillis?: number;
    /**
     * @type {string}
     * @memberof BranchImpl
     */
    fullDisplayName?: string;
    /**
     * @type {string}
     * @memberof BranchImpl
     */
    fullName?: string;
    /**
     * @type {string}
     * @memberof BranchImpl
     */
    name?: string;
    /**
     * @type {string}
     * @memberof BranchImpl
     */
    organization?: string;
    /**
     * @type {Array<StringParameterDefinition>}
     * @memberof BranchImpl
     */
    parameters?: Array<StringParameterDefinition>;
    /**
     * @type {BranchImplpermissions}
     * @memberof BranchImpl
     */
    permissions?: BranchImplpermissions;
    /**
     * @type {number}
     * @memberof BranchImpl
     */
    weatherScore?: number;
    /**
     * @type {string}
     * @memberof BranchImpl
     */
    pullRequest?: string;
    /**
     * @type {BranchImpllinks}
     * @memberof BranchImpl
     */
    _links?: BranchImpllinks;
    /**
     * @type {PipelineRunImpl}
     * @memberof BranchImpl
     */
    latestRun?: PipelineRunImpl;
}
