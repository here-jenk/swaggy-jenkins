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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface PipelineBranchesitempullRequestlinks
 */
export interface PipelineBranchesitempullRequestlinks  {
    /**
     * 
     * @type {string}
     * @memberof PipelineBranchesitempullRequestlinks
     */
    self?: string;
    /**
     * 
     * @type {string}
     * @memberof PipelineBranchesitempullRequestlinks
     */
    _class?: string;
}

export function PipelineBranchesitempullRequestlinksFromJSON(json: any): PipelineBranchesitempullRequestlinks {
    return {
        'self': !exists(json, 'self') ? undefined : json['self'],
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function PipelineBranchesitempullRequestlinksToJSON(value?: PipelineBranchesitempullRequestlinks): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'self': value.self,
        '_class': value._class,
    };
}


