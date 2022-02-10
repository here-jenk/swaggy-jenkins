/**
 * 
 * Swaggy Jenkins
 * 
 * 
 * Jenkins API clients generated from Swagger / Open API specification
 * 
 * Version: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// remote_access_api

export default {
    Query: {

        // @return ComputerSet
        GetComputer: ($depth) => {
            return {
                "depth": "56"
            };
        },

        // @return Hudson
        GetJenkins: () => {
            return {
                
            };
        },

        // @return FreeStyleProject
        GetJob: ($name) => {
            return {
                "name": "name_example"
            };
        },

        // @return String!
        GetJobConfig: ($name) => {
            return {
                "name": "name_example"
            };
        },

        // @return FreeStyleBuild
        GetJobLastBuild: ($name) => {
            return {
                "name": "name_example"
            };
        },

        // @return 
        GetJobProgressiveText: ($name, $number, $start) => {
            return {
                "name": "name_example",
                "number": "number_example",
                "start": "start_example"
            };
        },

        // @return Queue
        GetQueue: () => {
            return {
                
            };
        },

        // @return Queue
        GetQueueItem: ($number) => {
            return {
                "number": "number_example"
            };
        },

        // @return ListView
        GetView: ($name) => {
            return {
                "name": "name_example"
            };
        },

        // @return String!
        GetViewConfig: ($name) => {
            return {
                "name": "name_example"
            };
        },

        // @return 
        HeadJenkins: () => {
            return {
                
            };
        },

    },

    Mutation: {

        // @return 
        PostCreateItem: ($name, $from, $mode, $jenkinsCrumb, $contentType, $body) => {
            return {
                "name": "name_example",
                "from": "from_example",
                "mode": "mode_example",
                "jenkinsCrumb": "jenkinsCrumb_example",
                "contentType": "contentType_example",
                "body": "body_example"
            };
        },

        // @return 
        PostCreateView: ($name, $jenkinsCrumb, $contentType, $body) => {
            return {
                "name": "name_example",
                "jenkinsCrumb": "jenkinsCrumb_example",
                "contentType": "contentType_example",
                "body": "body_example"
            };
        },

        // @return 
        PostJobBuild: ($name, $json, $token, $jenkinsCrumb) => {
            return {
                "name": "name_example",
                "json": "json_example",
                "token": "token_example",
                "jenkinsCrumb": "jenkinsCrumb_example"
            };
        },

        // @return 
        PostJobConfig: ($name, $body, $jenkinsCrumb) => {
            return {
                "name": "name_example",
                "body": "body_example",
                "jenkinsCrumb": "jenkinsCrumb_example"
            };
        },

        // @return 
        PostJobDelete: ($name, $jenkinsCrumb) => {
            return {
                "name": "name_example",
                "jenkinsCrumb": "jenkinsCrumb_example"
            };
        },

        // @return 
        PostJobDisable: ($name, $jenkinsCrumb) => {
            return {
                "name": "name_example",
                "jenkinsCrumb": "jenkinsCrumb_example"
            };
        },

        // @return 
        PostJobEnable: ($name, $jenkinsCrumb) => {
            return {
                "name": "name_example",
                "jenkinsCrumb": "jenkinsCrumb_example"
            };
        },

        // @return 
        PostJobLastBuildStop: ($name, $jenkinsCrumb) => {
            return {
                "name": "name_example",
                "jenkinsCrumb": "jenkinsCrumb_example"
            };
        },

        // @return 
        PostViewConfig: ($name, $body, $jenkinsCrumb) => {
            return {
                "name": "name_example",
                "body": "body_example",
                "jenkinsCrumb": "jenkinsCrumb_example"
            };
        },

    }
}