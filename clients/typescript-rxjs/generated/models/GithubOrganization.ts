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
    GithubOrganizationlinks,
} from './';

/**
 * @export
 * @interface GithubOrganization
 */
export interface GithubOrganization {
    /**
     * @type {string}
     * @memberof GithubOrganization
     */
    _class?: string;
    /**
     * @type {GithubOrganizationlinks}
     * @memberof GithubOrganization
     */
    _links?: GithubOrganizationlinks;
    /**
     * @type {boolean}
     * @memberof GithubOrganization
     */
    jenkinsOrganizationPipeline?: boolean;
    /**
     * @type {string}
     * @memberof GithubOrganization
     */
    name?: string;
}
