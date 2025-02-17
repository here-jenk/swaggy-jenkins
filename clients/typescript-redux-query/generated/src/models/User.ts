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
 * @interface User
 */
export interface User  {
    /**
     * 
     * @type {string}
     * @memberof User
     */
    _class?: string;
    /**
     * 
     * @type {string}
     * @memberof User
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof User
     */
    fullName?: string;
    /**
     * 
     * @type {string}
     * @memberof User
     */
    email?: string;
    /**
     * 
     * @type {string}
     * @memberof User
     */
    name?: string;
}

export function UserFromJSON(json: any): User {
    return {
        '_class': !exists(json, '_class') ? undefined : json['_class'],
        'id': !exists(json, 'id') ? undefined : json['id'],
        'fullName': !exists(json, 'fullName') ? undefined : json['fullName'],
        'email': !exists(json, 'email') ? undefined : json['email'],
        'name': !exists(json, 'name') ? undefined : json['name'],
    };
}

export function UserToJSON(value?: User): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        '_class': value._class,
        'id': value.id,
        'fullName': value.fullName,
        'email': value.email,
        'name': value.name,
    };
}


