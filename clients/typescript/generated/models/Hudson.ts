/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * OpenAPI spec version: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { AllView } from './AllView';
import { FreeStyleProject } from './FreeStyleProject';
import { HudsonassignedLabels } from './HudsonassignedLabels';
import { UnlabeledLoadStatistics } from './UnlabeledLoadStatistics';
import { HttpFile } from '../http/http';

export class Hudson {
    '_class'?: string;
    'assignedLabels'?: Array<HudsonassignedLabels>;
    'mode'?: string;
    'nodeDescription'?: string;
    'nodeName'?: string;
    'numExecutors'?: number;
    'description'?: string;
    'jobs'?: Array<FreeStyleProject>;
    'primaryView'?: AllView;
    'quietingDown'?: boolean;
    'slaveAgentPort'?: number;
    'unlabeledLoad'?: UnlabeledLoadStatistics;
    'useCrumbs'?: boolean;
    'useSecurity'?: boolean;
    'views'?: Array<AllView>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "_class",
            "baseName": "_class",
            "type": "string",
            "format": ""
        },
        {
            "name": "assignedLabels",
            "baseName": "assignedLabels",
            "type": "Array<HudsonassignedLabels>",
            "format": ""
        },
        {
            "name": "mode",
            "baseName": "mode",
            "type": "string",
            "format": ""
        },
        {
            "name": "nodeDescription",
            "baseName": "nodeDescription",
            "type": "string",
            "format": ""
        },
        {
            "name": "nodeName",
            "baseName": "nodeName",
            "type": "string",
            "format": ""
        },
        {
            "name": "numExecutors",
            "baseName": "numExecutors",
            "type": "number",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "jobs",
            "baseName": "jobs",
            "type": "Array<FreeStyleProject>",
            "format": ""
        },
        {
            "name": "primaryView",
            "baseName": "primaryView",
            "type": "AllView",
            "format": ""
        },
        {
            "name": "quietingDown",
            "baseName": "quietingDown",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "slaveAgentPort",
            "baseName": "slaveAgentPort",
            "type": "number",
            "format": ""
        },
        {
            "name": "unlabeledLoad",
            "baseName": "unlabeledLoad",
            "type": "UnlabeledLoadStatistics",
            "format": ""
        },
        {
            "name": "useCrumbs",
            "baseName": "useCrumbs",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "useSecurity",
            "baseName": "useSecurity",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "views",
            "baseName": "views",
            "type": "Array<AllView>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Hudson.attributeTypeMap;
    }

    public constructor() {
    }
}

