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

/**
 * @export
 * @interface PipelineBranchesitemlatestRun
 */
export interface PipelineBranchesitemlatestRun {
    /**
     * @type {number}
     * @memberof PipelineBranchesitemlatestRun
     */
    durationInMillis?: number;
    /**
     * @type {number}
     * @memberof PipelineBranchesitemlatestRun
     */
    estimatedDurationInMillis?: number;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    enQueueTime?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    endTime?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    id?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    organization?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    pipeline?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    result?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    runSummary?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    startTime?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    state?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    type?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    commitId?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitemlatestRun
     */
    _class?: string;
}
