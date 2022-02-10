/*
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;

namespace Org.OpenAPITools.Apis
{ 
    public partial class BlueOceanApi
    { 
        [FunctionName("BlueOceanApi_DeletePipelineQueueItem")]
        public async Task<IActionResult> _DeletePipelineQueueItem([HttpTrigger(AuthorizationLevel.Anonymous, "DELETE", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/queue/{queue}")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string queue)
        {
            var method = this.GetType().GetMethod("DeletePipelineQueueItem");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetAuthenticatedUser")]
        public async Task<IActionResult> _GetAuthenticatedUser([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/user/")]HttpRequest req, ExecutionContext context, string organization)
        {
            var method = this.GetType().GetMethod("GetAuthenticatedUser");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetClasses")]
        public async Task<IActionResult> _GetClasses([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/classes/{class}")]HttpRequest req, ExecutionContext context, string _class)
        {
            var method = this.GetType().GetMethod("GetClasses");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetJsonWebKey")]
        public async Task<IActionResult> _GetJsonWebKey([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/jwt-auth/jwks/{key}")]HttpRequest req, ExecutionContext context, int key)
        {
            var method = this.GetType().GetMethod("GetJsonWebKey");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetJsonWebToken")]
        public async Task<IActionResult> _GetJsonWebToken([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/jwt-auth/token")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetJsonWebToken");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetOrganisation")]
        public async Task<IActionResult> _GetOrganisation([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}")]HttpRequest req, ExecutionContext context, string organization)
        {
            var method = this.GetType().GetMethod("GetOrganisation");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetOrganisations")]
        public async Task<IActionResult> _GetOrganisations([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetOrganisations");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipeline")]
        public async Task<IActionResult> _GetPipeline([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}")]HttpRequest req, ExecutionContext context, string organization, string pipeline)
        {
            var method = this.GetType().GetMethod("GetPipeline");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineActivities")]
        public async Task<IActionResult> _GetPipelineActivities([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/activities")]HttpRequest req, ExecutionContext context, string organization, string pipeline)
        {
            var method = this.GetType().GetMethod("GetPipelineActivities");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineBranch")]
        public async Task<IActionResult> _GetPipelineBranch([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string branch)
        {
            var method = this.GetType().GetMethod("GetPipelineBranch");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineBranchRun")]
        public async Task<IActionResult> _GetPipelineBranchRun([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/runs/{run}")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string branch, string run)
        {
            var method = this.GetType().GetMethod("GetPipelineBranchRun");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineBranches")]
        public async Task<IActionResult> _GetPipelineBranches([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/branches")]HttpRequest req, ExecutionContext context, string organization, string pipeline)
        {
            var method = this.GetType().GetMethod("GetPipelineBranches");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineFolder")]
        public async Task<IActionResult> _GetPipelineFolder([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{folder}/")]HttpRequest req, ExecutionContext context, string organization, string folder)
        {
            var method = this.GetType().GetMethod("GetPipelineFolder");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineFolderPipeline")]
        public async Task<IActionResult> _GetPipelineFolderPipeline([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{folder}/pipelines/{pipeline}")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string folder)
        {
            var method = this.GetType().GetMethod("GetPipelineFolderPipeline");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineQueue")]
        public async Task<IActionResult> _GetPipelineQueue([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/queue")]HttpRequest req, ExecutionContext context, string organization, string pipeline)
        {
            var method = this.GetType().GetMethod("GetPipelineQueue");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineRun")]
        public async Task<IActionResult> _GetPipelineRun([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string run)
        {
            var method = this.GetType().GetMethod("GetPipelineRun");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineRunLog")]
        public async Task<IActionResult> _GetPipelineRunLog([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/log")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string run)
        {
            var method = this.GetType().GetMethod("GetPipelineRunLog");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineRunNode")]
        public async Task<IActionResult> _GetPipelineRunNode([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string run, string node)
        {
            var method = this.GetType().GetMethod("GetPipelineRunNode");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineRunNodeStep")]
        public async Task<IActionResult> _GetPipelineRunNodeStep([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string run, string node, string step)
        {
            var method = this.GetType().GetMethod("GetPipelineRunNodeStep");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , , , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineRunNodeStepLog")]
        public async Task<IActionResult> _GetPipelineRunNodeStepLog([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}/log")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string run, string node, string step)
        {
            var method = this.GetType().GetMethod("GetPipelineRunNodeStepLog");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , , , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineRunNodeSteps")]
        public async Task<IActionResult> _GetPipelineRunNodeSteps([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string run, string node)
        {
            var method = this.GetType().GetMethod("GetPipelineRunNodeSteps");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineRunNodes")]
        public async Task<IActionResult> _GetPipelineRunNodes([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string run)
        {
            var method = this.GetType().GetMethod("GetPipelineRunNodes");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelineRuns")]
        public async Task<IActionResult> _GetPipelineRuns([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs")]HttpRequest req, ExecutionContext context, string organization, string pipeline)
        {
            var method = this.GetType().GetMethod("GetPipelineRuns");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetPipelines")]
        public async Task<IActionResult> _GetPipelines([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/pipelines/")]HttpRequest req, ExecutionContext context, string organization)
        {
            var method = this.GetType().GetMethod("GetPipelines");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetSCM")]
        public async Task<IActionResult> _GetSCM([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/scm/{scm}")]HttpRequest req, ExecutionContext context, string organization, string scm)
        {
            var method = this.GetType().GetMethod("GetSCM");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetSCMOrganisationRepositories")]
        public async Task<IActionResult> _GetSCMOrganisationRepositories([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories")]HttpRequest req, ExecutionContext context, string organization, string scm, string scmOrganisation)
        {
            var method = this.GetType().GetMethod("GetSCMOrganisationRepositories");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetSCMOrganisationRepository")]
        public async Task<IActionResult> _GetSCMOrganisationRepository([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories/{repository}")]HttpRequest req, ExecutionContext context, string organization, string scm, string scmOrganisation, string repository)
        {
            var method = this.GetType().GetMethod("GetSCMOrganisationRepository");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetSCMOrganisations")]
        public async Task<IActionResult> _GetSCMOrganisations([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/scm/{scm}/organizations")]HttpRequest req, ExecutionContext context, string organization, string scm)
        {
            var method = this.GetType().GetMethod("GetSCMOrganisations");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetUser")]
        public async Task<IActionResult> _GetUser([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/users/{user}")]HttpRequest req, ExecutionContext context, string organization, string user)
        {
            var method = this.GetType().GetMethod("GetUser");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetUserFavorites")]
        public async Task<IActionResult> _GetUserFavorites([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/users/{user}/favorites")]HttpRequest req, ExecutionContext context, string user)
        {
            var method = this.GetType().GetMethod("GetUserFavorites");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_GetUsers")]
        public async Task<IActionResult> _GetUsers([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/organizations/{organization}/users/")]HttpRequest req, ExecutionContext context, string organization)
        {
            var method = this.GetType().GetMethod("GetUsers");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_PostPipelineRun")]
        public async Task<IActionResult> _PostPipelineRun([HttpTrigger(AuthorizationLevel.Anonymous, "POST", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/replay")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string run)
        {
            var method = this.GetType().GetMethod("PostPipelineRun");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_PostPipelineRuns")]
        public async Task<IActionResult> _PostPipelineRuns([HttpTrigger(AuthorizationLevel.Anonymous, "POST", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs")]HttpRequest req, ExecutionContext context, string organization, string pipeline)
        {
            var method = this.GetType().GetMethod("PostPipelineRuns");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_PutPipelineFavorite")]
        public async Task<IActionResult> _PutPipelineFavorite([HttpTrigger(AuthorizationLevel.Anonymous, "PUT", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/favorite")]HttpRequest req, ExecutionContext context, string organization, string pipeline)
        {
            var method = this.GetType().GetMethod("PutPipelineFavorite");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_PutPipelineRun")]
        public async Task<IActionResult> _PutPipelineRun([HttpTrigger(AuthorizationLevel.Anonymous, "PUT", Route = "/blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/stop")]HttpRequest req, ExecutionContext context, string organization, string pipeline, string run)
        {
            var method = this.GetType().GetMethod("PutPipelineRun");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context, , ,  })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_Search")]
        public async Task<IActionResult> _Search([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/search/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("Search");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BlueOceanApi_SearchClasses")]
        public async Task<IActionResult> _SearchClasses([HttpTrigger(AuthorizationLevel.Anonymous, "GET", Route = "/blue/rest/classes/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchClasses");

            return method != null 
                ? (await ((Task<IActionResult>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}

