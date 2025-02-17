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
 * @interface SwapSpaceMonitorMemoryUsage2
 */
export interface SwapSpaceMonitorMemoryUsage2  {
    /**
     * 
     * @type {string}
     * @memberof SwapSpaceMonitorMemoryUsage2
     */
    _class?: string;
    /**
     * 
     * @type {number}
     * @memberof SwapSpaceMonitorMemoryUsage2
     */
    availablePhysicalMemory?: number;
    /**
     * 
     * @type {number}
     * @memberof SwapSpaceMonitorMemoryUsage2
     */
    availableSwapSpace?: number;
    /**
     * 
     * @type {number}
     * @memberof SwapSpaceMonitorMemoryUsage2
     */
    totalPhysicalMemory?: number;
    /**
     * 
     * @type {number}
     * @memberof SwapSpaceMonitorMemoryUsage2
     */
    totalSwapSpace?: number;
}

export function SwapSpaceMonitorMemoryUsage2FromJSON(json: any): SwapSpaceMonitorMemoryUsage2 {
    return {
        '_class': !exists(json, '_class') ? undefined : json['_class'],
        'availablePhysicalMemory': !exists(json, 'availablePhysicalMemory') ? undefined : json['availablePhysicalMemory'],
        'availableSwapSpace': !exists(json, 'availableSwapSpace') ? undefined : json['availableSwapSpace'],
        'totalPhysicalMemory': !exists(json, 'totalPhysicalMemory') ? undefined : json['totalPhysicalMemory'],
        'totalSwapSpace': !exists(json, 'totalSwapSpace') ? undefined : json['totalSwapSpace'],
    };
}

export function SwapSpaceMonitorMemoryUsage2ToJSON(value?: SwapSpaceMonitorMemoryUsage2): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        '_class': value._class,
        'availablePhysicalMemory': value.availablePhysicalMemory,
        'availableSwapSpace': value.availableSwapSpace,
        'totalPhysicalMemory': value.totalPhysicalMemory,
        'totalSwapSpace': value.totalSwapSpace,
    };
}


