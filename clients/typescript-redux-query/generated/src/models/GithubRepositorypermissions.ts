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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface GithubRepositorypermissions
 */
export interface GithubRepositorypermissions  {
    /**
     * 
     * @type {boolean}
     * @memberof GithubRepositorypermissions
     */
    admin?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GithubRepositorypermissions
     */
    push?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GithubRepositorypermissions
     */
    pull?: boolean;
    /**
     * 
     * @type {string}
     * @memberof GithubRepositorypermissions
     */
    _class?: string;
}

export function GithubRepositorypermissionsFromJSON(json: any): GithubRepositorypermissions {
    return {
        'admin': !exists(json, 'admin') ? undefined : json['admin'],
        'push': !exists(json, 'push') ? undefined : json['push'],
        'pull': !exists(json, 'pull') ? undefined : json['pull'],
        '_class': !exists(json, '_class') ? undefined : json['_class'],
    };
}

export function GithubRepositorypermissionsToJSON(value?: GithubRepositorypermissions): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'admin': value.admin,
        'push': value.push,
        'pull': value.pull,
        '_class': value._class,
    };
}


