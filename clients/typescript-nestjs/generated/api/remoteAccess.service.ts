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
/* tslint:disable:no-unused-variable member-ordering */

import { HttpService, Inject, Injectable, Optional } from '@nestjs/common';
import { AxiosResponse } from 'axios';
import { Observable } from 'rxjs';
import { ComputerSet } from '../model/computerSet';
import { FreeStyleBuild } from '../model/freeStyleBuild';
import { FreeStyleProject } from '../model/freeStyleProject';
import { Hudson } from '../model/hudson';
import { ListView } from '../model/listView';
import { Queue } from '../model/queue';
import { Configuration } from '../configuration';


@Injectable()
export class RemoteAccessService {

    protected basePath = 'http://localhost';
    public defaultHeaders: Record<string,string> = {};
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * 
     * Retrieve computer details
     * @param depth Recursion depth in response model
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getComputer(depth: number, ): Observable<AxiosResponse<ComputerSet>>;
    public getComputer(depth: number, ): Observable<any> {

        if (depth === null || depth === undefined) {
            throw new Error('Required parameter depth was null or undefined when calling getComputer.');
        }

        let queryParameters = {};
        if (depth !== undefined && depth !== null) {
            queryParameters['depth'] = <any>depth;
        }

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<ComputerSet>(`${this.basePath}/computer/api/json`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve Jenkins details
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getJenkins(): Observable<AxiosResponse<Hudson>>;
    public getJenkins(): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<Hudson>(`${this.basePath}/api/json`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve job details
     * @param name Name of the job
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getJob(name: string, ): Observable<AxiosResponse<FreeStyleProject>>;
    public getJob(name: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling getJob.');
        }

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<FreeStyleProject>(`${this.basePath}/job/${encodeURIComponent(String(name))}/api/json`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve job configuration
     * @param name Name of the job
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getJobConfig(name: string, ): Observable<AxiosResponse<string>>;
    public getJobConfig(name: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling getJobConfig.');
        }

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'text/xml'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<string>(`${this.basePath}/job/${encodeURIComponent(String(name))}/config.xml`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve job\&#39;s last build details
     * @param name Name of the job
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getJobLastBuild(name: string, ): Observable<AxiosResponse<FreeStyleBuild>>;
    public getJobLastBuild(name: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling getJobLastBuild.');
        }

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<FreeStyleBuild>(`${this.basePath}/job/${encodeURIComponent(String(name))}/lastBuild/api/json`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve job\&#39;s build progressive text output
     * @param name Name of the job
     * @param number Build number
     * @param start Starting point of progressive text output
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getJobProgressiveText(name: string, number: string, start: string, ): Observable<AxiosResponse<any>>;
    public getJobProgressiveText(name: string, number: string, start: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling getJobProgressiveText.');
        }

        if (number === null || number === undefined) {
            throw new Error('Required parameter number was null or undefined when calling getJobProgressiveText.');
        }

        if (start === null || start === undefined) {
            throw new Error('Required parameter start was null or undefined when calling getJobProgressiveText.');
        }

        let queryParameters = {};
        if (start !== undefined && start !== null) {
            queryParameters['start'] = <any>start;
        }

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<any>(`${this.basePath}/job/${encodeURIComponent(String(name))}/${encodeURIComponent(String(number))}/logText/progressiveText`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve queue details
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getQueue(): Observable<AxiosResponse<Queue>>;
    public getQueue(): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<Queue>(`${this.basePath}/queue/api/json`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve queued item details
     * @param number Queue number
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getQueueItem(number: string, ): Observable<AxiosResponse<Queue>>;
    public getQueueItem(number: string, ): Observable<any> {

        if (number === null || number === undefined) {
            throw new Error('Required parameter number was null or undefined when calling getQueueItem.');
        }

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<Queue>(`${this.basePath}/queue/item/${encodeURIComponent(String(number))}/api/json`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve view details
     * @param name Name of the view
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getView(name: string, ): Observable<AxiosResponse<ListView>>;
    public getView(name: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling getView.');
        }

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<ListView>(`${this.basePath}/view/${encodeURIComponent(String(name))}/api/json`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve view configuration
     * @param name Name of the view
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getViewConfig(name: string, ): Observable<AxiosResponse<string>>;
    public getViewConfig(name: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling getViewConfig.');
        }

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'text/xml'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<string>(`${this.basePath}/view/${encodeURIComponent(String(name))}/config.xml`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Retrieve Jenkins headers
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public headJenkins(): Observable<AxiosResponse<any>>;
    public headJenkins(): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.head<any>(`${this.basePath}/api/json`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Create a new job using job configuration, or copied from an existing job
     * @param name Name of the new job
     * @param from Existing job to copy from
     * @param mode Set to \&#39;copy\&#39; for copying an existing job
     * @param jenkinsCrumb CSRF protection token
     * @param contentType Content type header application/xml
     * @param body Job configuration in config.xml format
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public postCreateItem(name: string, from?: string, mode?: string, jenkinsCrumb?: string, contentType?: string, body?: string, ): Observable<AxiosResponse<any>>;
    public postCreateItem(name: string, from?: string, mode?: string, jenkinsCrumb?: string, contentType?: string, body?: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling postCreateItem.');
        }






        let queryParameters = {};
        if (name !== undefined && name !== null) {
            queryParameters['name'] = <any>name;
        }
        if (from !== undefined && from !== null) {
            queryParameters['from'] = <any>from;
        }
        if (mode !== undefined && mode !== null) {
            queryParameters['mode'] = <any>mode;
        }

        let headers = this.defaultHeaders;
        if (jenkinsCrumb !== undefined && jenkinsCrumb !== null) {
            headers['Jenkins-Crumb'] = String(jenkinsCrumb);
        }
        if (contentType !== undefined && contentType !== null) {
            headers['Content-Type'] = String(contentType);
        }

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<any>(`${this.basePath}/createItem`,
            body,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Create a new view using view configuration
     * @param name Name of the new view
     * @param jenkinsCrumb CSRF protection token
     * @param contentType Content type header application/xml
     * @param body View configuration in config.xml format
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public postCreateView(name: string, jenkinsCrumb?: string, contentType?: string, body?: string, ): Observable<AxiosResponse<any>>;
    public postCreateView(name: string, jenkinsCrumb?: string, contentType?: string, body?: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling postCreateView.');
        }




        let queryParameters = {};
        if (name !== undefined && name !== null) {
            queryParameters['name'] = <any>name;
        }

        let headers = this.defaultHeaders;
        if (jenkinsCrumb !== undefined && jenkinsCrumb !== null) {
            headers['Jenkins-Crumb'] = String(jenkinsCrumb);
        }
        if (contentType !== undefined && contentType !== null) {
            headers['Content-Type'] = String(contentType);
        }

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<any>(`${this.basePath}/createView`,
            body,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Build a job
     * @param name Name of the job
     * @param json 
     * @param token 
     * @param jenkinsCrumb CSRF protection token
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public postJobBuild(name: string, json: string, token?: string, jenkinsCrumb?: string, ): Observable<AxiosResponse<any>>;
    public postJobBuild(name: string, json: string, token?: string, jenkinsCrumb?: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling postJobBuild.');
        }

        if (json === null || json === undefined) {
            throw new Error('Required parameter json was null or undefined when calling postJobBuild.');
        }



        let queryParameters = {};
        if (json !== undefined && json !== null) {
            queryParameters['json'] = <any>json;
        }
        if (token !== undefined && token !== null) {
            queryParameters['token'] = <any>token;
        }

        let headers = this.defaultHeaders;
        if (jenkinsCrumb !== undefined && jenkinsCrumb !== null) {
            headers['Jenkins-Crumb'] = String(jenkinsCrumb);
        }

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<any>(`${this.basePath}/job/${encodeURIComponent(String(name))}/build`,
            null,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Update job configuration
     * @param name Name of the job
     * @param body Job configuration in config.xml format
     * @param jenkinsCrumb CSRF protection token
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public postJobConfig(name: string, body: string, jenkinsCrumb?: string, ): Observable<AxiosResponse<any>>;
    public postJobConfig(name: string, body: string, jenkinsCrumb?: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling postJobConfig.');
        }

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling postJobConfig.');
        }


        let headers = this.defaultHeaders;
        if (jenkinsCrumb !== undefined && jenkinsCrumb !== null) {
            headers['Jenkins-Crumb'] = String(jenkinsCrumb);
        }

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<any>(`${this.basePath}/job/${encodeURIComponent(String(name))}/config.xml`,
            body,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Delete a job
     * @param name Name of the job
     * @param jenkinsCrumb CSRF protection token
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public postJobDelete(name: string, jenkinsCrumb?: string, ): Observable<AxiosResponse<any>>;
    public postJobDelete(name: string, jenkinsCrumb?: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling postJobDelete.');
        }


        let headers = this.defaultHeaders;
        if (jenkinsCrumb !== undefined && jenkinsCrumb !== null) {
            headers['Jenkins-Crumb'] = String(jenkinsCrumb);
        }

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<any>(`${this.basePath}/job/${encodeURIComponent(String(name))}/doDelete`,
            null,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Disable a job
     * @param name Name of the job
     * @param jenkinsCrumb CSRF protection token
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public postJobDisable(name: string, jenkinsCrumb?: string, ): Observable<AxiosResponse<any>>;
    public postJobDisable(name: string, jenkinsCrumb?: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling postJobDisable.');
        }


        let headers = this.defaultHeaders;
        if (jenkinsCrumb !== undefined && jenkinsCrumb !== null) {
            headers['Jenkins-Crumb'] = String(jenkinsCrumb);
        }

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<any>(`${this.basePath}/job/${encodeURIComponent(String(name))}/disable`,
            null,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Enable a job
     * @param name Name of the job
     * @param jenkinsCrumb CSRF protection token
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public postJobEnable(name: string, jenkinsCrumb?: string, ): Observable<AxiosResponse<any>>;
    public postJobEnable(name: string, jenkinsCrumb?: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling postJobEnable.');
        }


        let headers = this.defaultHeaders;
        if (jenkinsCrumb !== undefined && jenkinsCrumb !== null) {
            headers['Jenkins-Crumb'] = String(jenkinsCrumb);
        }

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<any>(`${this.basePath}/job/${encodeURIComponent(String(name))}/enable`,
            null,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Stop a job
     * @param name Name of the job
     * @param jenkinsCrumb CSRF protection token
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public postJobLastBuildStop(name: string, jenkinsCrumb?: string, ): Observable<AxiosResponse<any>>;
    public postJobLastBuildStop(name: string, jenkinsCrumb?: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling postJobLastBuildStop.');
        }


        let headers = this.defaultHeaders;
        if (jenkinsCrumb !== undefined && jenkinsCrumb !== null) {
            headers['Jenkins-Crumb'] = String(jenkinsCrumb);
        }

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.post<any>(`${this.basePath}/job/${encodeURIComponent(String(name))}/lastBuild/stop`,
            null,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * 
     * Update view configuration
     * @param name Name of the view
     * @param body View configuration in config.xml format
     * @param jenkinsCrumb CSRF protection token
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public postViewConfig(name: string, body: string, jenkinsCrumb?: string, ): Observable<AxiosResponse<any>>;
    public postViewConfig(name: string, body: string, jenkinsCrumb?: string, ): Observable<any> {

        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling postViewConfig.');
        }

        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling postViewConfig.');
        }


        let headers = this.defaultHeaders;
        if (jenkinsCrumb !== undefined && jenkinsCrumb !== null) {
            headers['Jenkins-Crumb'] = String(jenkinsCrumb);
        }

        // authentication (jenkins_auth) required
        if (this.configuration.username || this.configuration.password) {
            headers['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            '*/*'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<any>(`${this.basePath}/view/${encodeURIComponent(String(name))}/config.xml`,
            body,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}
