/*
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * API version: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
)



// BaseApiRouter defines the required methods for binding the api requests to a responses for the BaseApi
// The BaseApiRouter implementation should parse necessary information from the http request,
// pass the data to a BaseApiServicer to perform the required actions, then write the service results to the http response.
type BaseApiRouter interface { 
	GetCrumb(http.ResponseWriter, *http.Request)
}
// BlueOceanApiRouter defines the required methods for binding the api requests to a responses for the BlueOceanApi
// The BlueOceanApiRouter implementation should parse necessary information from the http request,
// pass the data to a BlueOceanApiServicer to perform the required actions, then write the service results to the http response.
type BlueOceanApiRouter interface { 
	DeletePipelineQueueItem(http.ResponseWriter, *http.Request)
	GetAuthenticatedUser(http.ResponseWriter, *http.Request)
	GetClasses(http.ResponseWriter, *http.Request)
	GetJsonWebKey(http.ResponseWriter, *http.Request)
	GetJsonWebToken(http.ResponseWriter, *http.Request)
	GetOrganisation(http.ResponseWriter, *http.Request)
	GetOrganisations(http.ResponseWriter, *http.Request)
	GetPipeline(http.ResponseWriter, *http.Request)
	GetPipelineActivities(http.ResponseWriter, *http.Request)
	GetPipelineBranch(http.ResponseWriter, *http.Request)
	GetPipelineBranchRun(http.ResponseWriter, *http.Request)
	GetPipelineBranches(http.ResponseWriter, *http.Request)
	GetPipelineFolder(http.ResponseWriter, *http.Request)
	GetPipelineFolderPipeline(http.ResponseWriter, *http.Request)
	GetPipelineQueue(http.ResponseWriter, *http.Request)
	GetPipelineRun(http.ResponseWriter, *http.Request)
	GetPipelineRunLog(http.ResponseWriter, *http.Request)
	GetPipelineRunNode(http.ResponseWriter, *http.Request)
	GetPipelineRunNodeStep(http.ResponseWriter, *http.Request)
	GetPipelineRunNodeStepLog(http.ResponseWriter, *http.Request)
	GetPipelineRunNodeSteps(http.ResponseWriter, *http.Request)
	GetPipelineRunNodes(http.ResponseWriter, *http.Request)
	GetPipelineRuns(http.ResponseWriter, *http.Request)
	GetPipelines(http.ResponseWriter, *http.Request)
	GetSCM(http.ResponseWriter, *http.Request)
	GetSCMOrganisationRepositories(http.ResponseWriter, *http.Request)
	GetSCMOrganisationRepository(http.ResponseWriter, *http.Request)
	GetSCMOrganisations(http.ResponseWriter, *http.Request)
	GetUser(http.ResponseWriter, *http.Request)
	GetUserFavorites(http.ResponseWriter, *http.Request)
	GetUsers(http.ResponseWriter, *http.Request)
	PostPipelineRun(http.ResponseWriter, *http.Request)
	PostPipelineRuns(http.ResponseWriter, *http.Request)
	PutPipelineFavorite(http.ResponseWriter, *http.Request)
	PutPipelineRun(http.ResponseWriter, *http.Request)
	Search(http.ResponseWriter, *http.Request)
	SearchClasses(http.ResponseWriter, *http.Request)
}
// RemoteAccessApiRouter defines the required methods for binding the api requests to a responses for the RemoteAccessApi
// The RemoteAccessApiRouter implementation should parse necessary information from the http request,
// pass the data to a RemoteAccessApiServicer to perform the required actions, then write the service results to the http response.
type RemoteAccessApiRouter interface { 
	GetComputer(http.ResponseWriter, *http.Request)
	GetJenkins(http.ResponseWriter, *http.Request)
	GetJob(http.ResponseWriter, *http.Request)
	GetJobConfig(http.ResponseWriter, *http.Request)
	GetJobLastBuild(http.ResponseWriter, *http.Request)
	GetJobProgressiveText(http.ResponseWriter, *http.Request)
	GetQueue(http.ResponseWriter, *http.Request)
	GetQueueItem(http.ResponseWriter, *http.Request)
	GetView(http.ResponseWriter, *http.Request)
	GetViewConfig(http.ResponseWriter, *http.Request)
	HeadJenkins(http.ResponseWriter, *http.Request)
	PostCreateItem(http.ResponseWriter, *http.Request)
	PostCreateView(http.ResponseWriter, *http.Request)
	PostJobBuild(http.ResponseWriter, *http.Request)
	PostJobConfig(http.ResponseWriter, *http.Request)
	PostJobDelete(http.ResponseWriter, *http.Request)
	PostJobDisable(http.ResponseWriter, *http.Request)
	PostJobEnable(http.ResponseWriter, *http.Request)
	PostJobLastBuildStop(http.ResponseWriter, *http.Request)
	PostViewConfig(http.ResponseWriter, *http.Request)
}


// BaseApiServicer defines the api actions for the BaseApi service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type BaseApiServicer interface { 
	GetCrumb(context.Context) (ImplResponse, error)
}


// BlueOceanApiServicer defines the api actions for the BlueOceanApi service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type BlueOceanApiServicer interface { 
	DeletePipelineQueueItem(context.Context, string, string, string) (ImplResponse, error)
	GetAuthenticatedUser(context.Context, string) (ImplResponse, error)
	GetClasses(context.Context, string) (ImplResponse, error)
	GetJsonWebKey(context.Context, int32) (ImplResponse, error)
	GetJsonWebToken(context.Context, int32, int32) (ImplResponse, error)
	GetOrganisation(context.Context, string) (ImplResponse, error)
	GetOrganisations(context.Context) (ImplResponse, error)
	GetPipeline(context.Context, string, string) (ImplResponse, error)
	GetPipelineActivities(context.Context, string, string) (ImplResponse, error)
	GetPipelineBranch(context.Context, string, string, string) (ImplResponse, error)
	GetPipelineBranchRun(context.Context, string, string, string, string) (ImplResponse, error)
	GetPipelineBranches(context.Context, string, string) (ImplResponse, error)
	GetPipelineFolder(context.Context, string, string) (ImplResponse, error)
	GetPipelineFolderPipeline(context.Context, string, string, string) (ImplResponse, error)
	GetPipelineQueue(context.Context, string, string) (ImplResponse, error)
	GetPipelineRun(context.Context, string, string, string) (ImplResponse, error)
	GetPipelineRunLog(context.Context, string, string, string, int32, bool) (ImplResponse, error)
	GetPipelineRunNode(context.Context, string, string, string, string) (ImplResponse, error)
	GetPipelineRunNodeStep(context.Context, string, string, string, string, string) (ImplResponse, error)
	GetPipelineRunNodeStepLog(context.Context, string, string, string, string, string) (ImplResponse, error)
	GetPipelineRunNodeSteps(context.Context, string, string, string, string) (ImplResponse, error)
	GetPipelineRunNodes(context.Context, string, string, string) (ImplResponse, error)
	GetPipelineRuns(context.Context, string, string) (ImplResponse, error)
	GetPipelines(context.Context, string) (ImplResponse, error)
	GetSCM(context.Context, string, string) (ImplResponse, error)
	GetSCMOrganisationRepositories(context.Context, string, string, string, string, int32, int32) (ImplResponse, error)
	GetSCMOrganisationRepository(context.Context, string, string, string, string, string) (ImplResponse, error)
	GetSCMOrganisations(context.Context, string, string, string) (ImplResponse, error)
	GetUser(context.Context, string, string) (ImplResponse, error)
	GetUserFavorites(context.Context, string) (ImplResponse, error)
	GetUsers(context.Context, string) (ImplResponse, error)
	PostPipelineRun(context.Context, string, string, string) (ImplResponse, error)
	PostPipelineRuns(context.Context, string, string) (ImplResponse, error)
	PutPipelineFavorite(context.Context, string, string, bool) (ImplResponse, error)
	PutPipelineRun(context.Context, string, string, string, string, int32) (ImplResponse, error)
	Search(context.Context, string) (ImplResponse, error)
	SearchClasses(context.Context, string) (ImplResponse, error)
}


// RemoteAccessApiServicer defines the api actions for the RemoteAccessApi service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type RemoteAccessApiServicer interface { 
	GetComputer(context.Context, int32) (ImplResponse, error)
	GetJenkins(context.Context) (ImplResponse, error)
	GetJob(context.Context, string) (ImplResponse, error)
	GetJobConfig(context.Context, string) (ImplResponse, error)
	GetJobLastBuild(context.Context, string) (ImplResponse, error)
	GetJobProgressiveText(context.Context, string, string, string) (ImplResponse, error)
	GetQueue(context.Context) (ImplResponse, error)
	GetQueueItem(context.Context, string) (ImplResponse, error)
	GetView(context.Context, string) (ImplResponse, error)
	GetViewConfig(context.Context, string) (ImplResponse, error)
	HeadJenkins(context.Context) (ImplResponse, error)
	PostCreateItem(context.Context, string, string, string, string, string, string) (ImplResponse, error)
	PostCreateView(context.Context, string, string, string, string) (ImplResponse, error)
	PostJobBuild(context.Context, string, string, string, string) (ImplResponse, error)
	PostJobConfig(context.Context, string, string, string) (ImplResponse, error)
	PostJobDelete(context.Context, string, string) (ImplResponse, error)
	PostJobDisable(context.Context, string, string) (ImplResponse, error)
	PostJobEnable(context.Context, string, string) (ImplResponse, error)
	PostJobLastBuildStop(context.Context, string, string) (ImplResponse, error)
	PostViewConfig(context.Context, string, string, string) (ImplResponse, error)
}
