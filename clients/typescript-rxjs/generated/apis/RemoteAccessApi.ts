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

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpHeaders, HttpQuery } from '../runtime';
import type {
    ComputerSet,
    FreeStyleBuild,
    FreeStyleProject,
    Hudson,
    ListView,
    Queue,
} from '../models';

export interface GetComputerRequest {
    depth: number;
}

export interface GetJobRequest {
    name: string;
}

export interface GetJobConfigRequest {
    name: string;
}

export interface GetJobLastBuildRequest {
    name: string;
}

export interface GetJobProgressiveTextRequest {
    name: string;
    number: string;
    start: string;
}

export interface GetQueueItemRequest {
    number: string;
}

export interface GetViewRequest {
    name: string;
}

export interface GetViewConfigRequest {
    name: string;
}

export interface PostCreateItemRequest {
    name: string;
    from?: string;
    mode?: string;
    jenkinsCrumb?: string;
    contentType?: string;
    body?: string;
}

export interface PostCreateViewRequest {
    name: string;
    jenkinsCrumb?: string;
    contentType?: string;
    body?: string;
}

export interface PostJobBuildRequest {
    name: string;
    json: string;
    token?: string;
    jenkinsCrumb?: string;
}

export interface PostJobConfigRequest {
    name: string;
    body: string;
    jenkinsCrumb?: string;
}

export interface PostJobDeleteRequest {
    name: string;
    jenkinsCrumb?: string;
}

export interface PostJobDisableRequest {
    name: string;
    jenkinsCrumb?: string;
}

export interface PostJobEnableRequest {
    name: string;
    jenkinsCrumb?: string;
}

export interface PostJobLastBuildStopRequest {
    name: string;
    jenkinsCrumb?: string;
}

export interface PostViewConfigRequest {
    name: string;
    body: string;
    jenkinsCrumb?: string;
}

/**
 * no description
 */
export class RemoteAccessApi extends BaseAPI {

    /**
     * Retrieve computer details
     */
    getComputer({ depth }: GetComputerRequest): Observable<ComputerSet>
    getComputer({ depth }: GetComputerRequest, opts?: OperationOpts): Observable<AjaxResponse<ComputerSet>>
    getComputer({ depth }: GetComputerRequest, opts?: OperationOpts): Observable<ComputerSet | AjaxResponse<ComputerSet>> {
        throwIfNullOrUndefined(depth, 'depth', 'getComputer');

        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'depth': depth,
        };

        return this.request<ComputerSet>({
            url: '/computer/api/json',
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve Jenkins details
     */
    getJenkins(): Observable<Hudson>
    getJenkins(opts?: OperationOpts): Observable<AjaxResponse<Hudson>>
    getJenkins(opts?: OperationOpts): Observable<Hudson | AjaxResponse<Hudson>> {
        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<Hudson>({
            url: '/api/json',
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve job details
     */
    getJob({ name }: GetJobRequest): Observable<FreeStyleProject>
    getJob({ name }: GetJobRequest, opts?: OperationOpts): Observable<AjaxResponse<FreeStyleProject>>
    getJob({ name }: GetJobRequest, opts?: OperationOpts): Observable<FreeStyleProject | AjaxResponse<FreeStyleProject>> {
        throwIfNullOrUndefined(name, 'name', 'getJob');

        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<FreeStyleProject>({
            url: '/job/{name}/api/json'.replace('{name}', encodeURI(name)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve job configuration
     */
    getJobConfig({ name }: GetJobConfigRequest): Observable<string>
    getJobConfig({ name }: GetJobConfigRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    getJobConfig({ name }: GetJobConfigRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(name, 'name', 'getJobConfig');

        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<string>({
            url: '/job/{name}/config.xml'.replace('{name}', encodeURI(name)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve job\'s last build details
     */
    getJobLastBuild({ name }: GetJobLastBuildRequest): Observable<FreeStyleBuild>
    getJobLastBuild({ name }: GetJobLastBuildRequest, opts?: OperationOpts): Observable<AjaxResponse<FreeStyleBuild>>
    getJobLastBuild({ name }: GetJobLastBuildRequest, opts?: OperationOpts): Observable<FreeStyleBuild | AjaxResponse<FreeStyleBuild>> {
        throwIfNullOrUndefined(name, 'name', 'getJobLastBuild');

        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<FreeStyleBuild>({
            url: '/job/{name}/lastBuild/api/json'.replace('{name}', encodeURI(name)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve job\'s build progressive text output
     */
    getJobProgressiveText({ name, number, start }: GetJobProgressiveTextRequest): Observable<void>
    getJobProgressiveText({ name, number, start }: GetJobProgressiveTextRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    getJobProgressiveText({ name, number, start }: GetJobProgressiveTextRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'getJobProgressiveText');
        throwIfNullOrUndefined(number, 'number', 'getJobProgressiveText');
        throwIfNullOrUndefined(start, 'start', 'getJobProgressiveText');

        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'start': start,
        };

        return this.request<void>({
            url: '/job/{name}/{number}/logText/progressiveText'.replace('{name}', encodeURI(name)).replace('{number}', encodeURI(number)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve queue details
     */
    getQueue(): Observable<Queue>
    getQueue(opts?: OperationOpts): Observable<AjaxResponse<Queue>>
    getQueue(opts?: OperationOpts): Observable<Queue | AjaxResponse<Queue>> {
        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<Queue>({
            url: '/queue/api/json',
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve queued item details
     */
    getQueueItem({ number }: GetQueueItemRequest): Observable<Queue>
    getQueueItem({ number }: GetQueueItemRequest, opts?: OperationOpts): Observable<AjaxResponse<Queue>>
    getQueueItem({ number }: GetQueueItemRequest, opts?: OperationOpts): Observable<Queue | AjaxResponse<Queue>> {
        throwIfNullOrUndefined(number, 'number', 'getQueueItem');

        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<Queue>({
            url: '/queue/item/{number}/api/json'.replace('{number}', encodeURI(number)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve view details
     */
    getView({ name }: GetViewRequest): Observable<ListView>
    getView({ name }: GetViewRequest, opts?: OperationOpts): Observable<AjaxResponse<ListView>>
    getView({ name }: GetViewRequest, opts?: OperationOpts): Observable<ListView | AjaxResponse<ListView>> {
        throwIfNullOrUndefined(name, 'name', 'getView');

        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<ListView>({
            url: '/view/{name}/api/json'.replace('{name}', encodeURI(name)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve view configuration
     */
    getViewConfig({ name }: GetViewConfigRequest): Observable<string>
    getViewConfig({ name }: GetViewConfigRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    getViewConfig({ name }: GetViewConfigRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(name, 'name', 'getViewConfig');

        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<string>({
            url: '/view/{name}/config.xml'.replace('{name}', encodeURI(name)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Retrieve Jenkins headers
     */
    headJenkins(): Observable<void>
    headJenkins(opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    headJenkins(opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        const headers: HttpHeaders = {
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<void>({
            url: '/api/json',
            method: 'HEAD',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Create a new job using job configuration, or copied from an existing job
     */
    postCreateItem({ name, from, mode, jenkinsCrumb, contentType, body }: PostCreateItemRequest): Observable<void>
    postCreateItem({ name, from, mode, jenkinsCrumb, contentType, body }: PostCreateItemRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    postCreateItem({ name, from, mode, jenkinsCrumb, contentType, body }: PostCreateItemRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'postCreateItem');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(jenkinsCrumb != null ? { 'Jenkins-Crumb': String(jenkinsCrumb) } : undefined),
            ...(contentType != null ? { 'Content-Type': String(contentType) } : undefined),
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'name': name,
        };

        if (from != null) { query['from'] = from; }
        if (mode != null) { query['mode'] = mode; }

        return this.request<void>({
            url: '/createItem',
            method: 'POST',
            headers,
            query,
            body: body as any,
        }, opts?.responseOpts);
    };

    /**
     * Create a new view using view configuration
     */
    postCreateView({ name, jenkinsCrumb, contentType, body }: PostCreateViewRequest): Observable<void>
    postCreateView({ name, jenkinsCrumb, contentType, body }: PostCreateViewRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    postCreateView({ name, jenkinsCrumb, contentType, body }: PostCreateViewRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'postCreateView');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(jenkinsCrumb != null ? { 'Jenkins-Crumb': String(jenkinsCrumb) } : undefined),
            ...(contentType != null ? { 'Content-Type': String(contentType) } : undefined),
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'name': name,
        };

        return this.request<void>({
            url: '/createView',
            method: 'POST',
            headers,
            query,
            body: body as any,
        }, opts?.responseOpts);
    };

    /**
     * Build a job
     */
    postJobBuild({ name, json, token, jenkinsCrumb }: PostJobBuildRequest): Observable<void>
    postJobBuild({ name, json, token, jenkinsCrumb }: PostJobBuildRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    postJobBuild({ name, json, token, jenkinsCrumb }: PostJobBuildRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'postJobBuild');
        throwIfNullOrUndefined(json, 'json', 'postJobBuild');

        const headers: HttpHeaders = {
            ...(jenkinsCrumb != null ? { 'Jenkins-Crumb': String(jenkinsCrumb) } : undefined),
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'json': json,
        };

        if (token != null) { query['token'] = token; }

        return this.request<void>({
            url: '/job/{name}/build'.replace('{name}', encodeURI(name)),
            method: 'POST',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Update job configuration
     */
    postJobConfig({ name, body, jenkinsCrumb }: PostJobConfigRequest): Observable<void>
    postJobConfig({ name, body, jenkinsCrumb }: PostJobConfigRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    postJobConfig({ name, body, jenkinsCrumb }: PostJobConfigRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'postJobConfig');
        throwIfNullOrUndefined(body, 'body', 'postJobConfig');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(jenkinsCrumb != null ? { 'Jenkins-Crumb': String(jenkinsCrumb) } : undefined),
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<void>({
            url: '/job/{name}/config.xml'.replace('{name}', encodeURI(name)),
            method: 'POST',
            headers,
            body: body as any,
        }, opts?.responseOpts);
    };

    /**
     * Delete a job
     */
    postJobDelete({ name, jenkinsCrumb }: PostJobDeleteRequest): Observable<void>
    postJobDelete({ name, jenkinsCrumb }: PostJobDeleteRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    postJobDelete({ name, jenkinsCrumb }: PostJobDeleteRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'postJobDelete');

        const headers: HttpHeaders = {
            ...(jenkinsCrumb != null ? { 'Jenkins-Crumb': String(jenkinsCrumb) } : undefined),
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<void>({
            url: '/job/{name}/doDelete'.replace('{name}', encodeURI(name)),
            method: 'POST',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Disable a job
     */
    postJobDisable({ name, jenkinsCrumb }: PostJobDisableRequest): Observable<void>
    postJobDisable({ name, jenkinsCrumb }: PostJobDisableRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    postJobDisable({ name, jenkinsCrumb }: PostJobDisableRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'postJobDisable');

        const headers: HttpHeaders = {
            ...(jenkinsCrumb != null ? { 'Jenkins-Crumb': String(jenkinsCrumb) } : undefined),
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<void>({
            url: '/job/{name}/disable'.replace('{name}', encodeURI(name)),
            method: 'POST',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Enable a job
     */
    postJobEnable({ name, jenkinsCrumb }: PostJobEnableRequest): Observable<void>
    postJobEnable({ name, jenkinsCrumb }: PostJobEnableRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    postJobEnable({ name, jenkinsCrumb }: PostJobEnableRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'postJobEnable');

        const headers: HttpHeaders = {
            ...(jenkinsCrumb != null ? { 'Jenkins-Crumb': String(jenkinsCrumb) } : undefined),
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<void>({
            url: '/job/{name}/enable'.replace('{name}', encodeURI(name)),
            method: 'POST',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Stop a job
     */
    postJobLastBuildStop({ name, jenkinsCrumb }: PostJobLastBuildStopRequest): Observable<void>
    postJobLastBuildStop({ name, jenkinsCrumb }: PostJobLastBuildStopRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    postJobLastBuildStop({ name, jenkinsCrumb }: PostJobLastBuildStopRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'postJobLastBuildStop');

        const headers: HttpHeaders = {
            ...(jenkinsCrumb != null ? { 'Jenkins-Crumb': String(jenkinsCrumb) } : undefined),
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<void>({
            url: '/job/{name}/lastBuild/stop'.replace('{name}', encodeURI(name)),
            method: 'POST',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Update view configuration
     */
    postViewConfig({ name, body, jenkinsCrumb }: PostViewConfigRequest): Observable<void>
    postViewConfig({ name, body, jenkinsCrumb }: PostViewConfigRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    postViewConfig({ name, body, jenkinsCrumb }: PostViewConfigRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(name, 'name', 'postViewConfig');
        throwIfNullOrUndefined(body, 'body', 'postViewConfig');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            ...(jenkinsCrumb != null ? { 'Jenkins-Crumb': String(jenkinsCrumb) } : undefined),
            ...(this.configuration.username != null && this.configuration.password != null ? { Authorization: `Basic ${btoa(this.configuration.username + ':' + this.configuration.password)}` } : undefined),
        };

        return this.request<void>({
            url: '/view/{name}/config.xml'.replace('{name}', encodeURI(name)),
            method: 'POST',
            headers,
            body: body as any,
        }, opts?.responseOpts);
    };

}
