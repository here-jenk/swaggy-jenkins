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
    GithubScmlinks,
} from './';

/**
 * @export
 * @interface GithubScm
 */
export interface GithubScm {
    /**
     * @type {string}
     * @memberof GithubScm
     */
    _class?: string;
    /**
     * @type {GithubScmlinks}
     * @memberof GithubScm
     */
    _links?: GithubScmlinks;
    /**
     * @type {string}
     * @memberof GithubScm
     */
    credentialId?: string;
    /**
     * @type {string}
     * @memberof GithubScm
     */
    id?: string;
    /**
     * @type {string}
     * @memberof GithubScm
     */
    uri?: string;
}
