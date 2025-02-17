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
    InputStepImpllinks,
    StringParameterDefinition,
} from './';

/**
 * @export
 * @interface InputStepImpl
 */
export interface InputStepImpl {
    /**
     * @type {string}
     * @memberof InputStepImpl
     */
    _class?: string;
    /**
     * @type {InputStepImpllinks}
     * @memberof InputStepImpl
     */
    _links?: InputStepImpllinks;
    /**
     * @type {string}
     * @memberof InputStepImpl
     */
    id?: string;
    /**
     * @type {string}
     * @memberof InputStepImpl
     */
    message?: string;
    /**
     * @type {string}
     * @memberof InputStepImpl
     */
    ok?: string;
    /**
     * @type {Array<StringParameterDefinition>}
     * @memberof InputStepImpl
     */
    parameters?: Array<StringParameterDefinition>;
    /**
     * @type {string}
     * @memberof InputStepImpl
     */
    submitter?: string;
}
