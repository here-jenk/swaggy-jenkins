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
    PipelineBranchesitempullRequestlinks,
} from './';

/**
 * @export
 * @interface PipelineBranchesitempullRequest
 */
export interface PipelineBranchesitempullRequest {
    /**
     * @type {PipelineBranchesitempullRequestlinks}
     * @memberof PipelineBranchesitempullRequest
     */
    _links?: PipelineBranchesitempullRequestlinks;
    /**
     * @type {string}
     * @memberof PipelineBranchesitempullRequest
     */
    author?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitempullRequest
     */
    id?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitempullRequest
     */
    title?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitempullRequest
     */
    url?: string;
    /**
     * @type {string}
     * @memberof PipelineBranchesitempullRequest
     */
    _class?: string;
}
