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

/**
 * @export
 * @interface MultibranchPipeline
 */
export interface MultibranchPipeline {
    /**
     * @type {string}
     * @memberof MultibranchPipeline
     */
    displayName?: string;
    /**
     * @type {number}
     * @memberof MultibranchPipeline
     */
    estimatedDurationInMillis?: number;
    /**
     * @type {string}
     * @memberof MultibranchPipeline
     */
    latestRun?: string;
    /**
     * @type {string}
     * @memberof MultibranchPipeline
     */
    name?: string;
    /**
     * @type {string}
     * @memberof MultibranchPipeline
     */
    organization?: string;
    /**
     * @type {number}
     * @memberof MultibranchPipeline
     */
    weatherScore?: number;
    /**
     * @type {Array<string>}
     * @memberof MultibranchPipeline
     */
    branchNames?: Array<string>;
    /**
     * @type {number}
     * @memberof MultibranchPipeline
     */
    numberOfFailingBranches?: number;
    /**
     * @type {number}
     * @memberof MultibranchPipeline
     */
    numberOfFailingPullRequests?: number;
    /**
     * @type {number}
     * @memberof MultibranchPipeline
     */
    numberOfSuccessfulBranches?: number;
    /**
     * @type {number}
     * @memberof MultibranchPipeline
     */
    numberOfSuccessfulPullRequests?: number;
    /**
     * @type {number}
     * @memberof MultibranchPipeline
     */
    totalNumberOfBranches?: number;
    /**
     * @type {number}
     * @memberof MultibranchPipeline
     */
    totalNumberOfPullRequests?: number;
    /**
     * @type {string}
     * @memberof MultibranchPipeline
     */
    _class?: string;
}
