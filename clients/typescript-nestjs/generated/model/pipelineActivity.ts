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
import { PipelineActivityartifacts } from './pipelineActivityartifacts';


export interface PipelineActivity { 
    _class?: string;
    artifacts?: Array<PipelineActivityartifacts>;
    durationInMillis?: number;
    estimatedDurationInMillis?: number;
    enQueueTime?: string;
    endTime?: string;
    id?: string;
    organization?: string;
    pipeline?: string;
    result?: string;
    runSummary?: string;
    startTime?: string;
    state?: string;
    type?: string;
    commitId?: string;
}

