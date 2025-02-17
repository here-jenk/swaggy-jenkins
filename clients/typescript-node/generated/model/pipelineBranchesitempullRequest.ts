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

import { RequestFile } from './models';
import { PipelineBranchesitempullRequestlinks } from './pipelineBranchesitempullRequestlinks';

export class PipelineBranchesitempullRequest {
    'links'?: PipelineBranchesitempullRequestlinks;
    'author'?: string;
    'id'?: string;
    'title'?: string;
    'url'?: string;
    '_class'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "links",
            "baseName": "_links",
            "type": "PipelineBranchesitempullRequestlinks"
        },
        {
            "name": "author",
            "baseName": "author",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        },
        {
            "name": "_class",
            "baseName": "_class",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return PipelineBranchesitempullRequest.attributeTypeMap;
    }
}

