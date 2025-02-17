/* tslint:disable */
/* eslint-disable */
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


import * as runtime from '../runtime';
import {
    DefaultCrumbIssuer,
    DefaultCrumbIssuerFromJSON,
    DefaultCrumbIssuerToJSON,
} from '../models';

/**
 * 
 */
export class BaseApi extends runtime.BaseAPI {

    /**
     * Retrieve CSRF protection token
     */
    async getCrumbRaw(initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<runtime.ApiResponse<DefaultCrumbIssuer>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/crumbIssuer/api/json`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => DefaultCrumbIssuerFromJSON(jsonValue));
    }

    /**
     * Retrieve CSRF protection token
     */
    async getCrumb(initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<DefaultCrumbIssuer> {
        const response = await this.getCrumbRaw(initOverrides);
        return await response.value();
    }

}
