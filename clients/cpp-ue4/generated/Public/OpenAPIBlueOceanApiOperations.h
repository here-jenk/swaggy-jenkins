/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * OpenAPI spec version: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIBlueOceanApi.h"

#include "OpenAPIBranchImpl.h"
#include "OpenAPIFavoriteImpl.h"
#include "OpenAPIGithubOrganization.h"
#include "OpenAPIGithubScm.h"
#include "OpenAPIMultibranchPipeline.h"
#include "OpenAPIOrganisation.h"
#include "OpenAPIPipeline.h"
#include "OpenAPIPipelineActivity.h"
#include "OpenAPIPipelineFolderImpl.h"
#include "OpenAPIPipelineImpl.h"
#include "OpenAPIPipelineRun.h"
#include "OpenAPIPipelineRunNode.h"
#include "OpenAPIPipelineStepImpl.h"
#include "OpenAPIQueueItemImpl.h"
#include "OpenAPIUser.h"
#include "UNKNOWN_BASE_TYPE.h"

namespace OpenAPI
{

/* 
 *
 * Delete queue item from an organization pipeline queue
*/
class OPENAPI_API OpenAPIBlueOceanApi::DeletePipelineQueueItemRequest : public Request
{
public:
    virtual ~DeletePipelineQueueItemRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the queue item */
	FString Queue;
};

class OPENAPI_API OpenAPIBlueOceanApi::DeletePipelineQueueItemResponse : public Response
{
public:
    virtual ~DeletePipelineQueueItemResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    
};

/* 
 *
 * Retrieve authenticated user details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetAuthenticatedUserRequest : public Request
{
public:
    virtual ~GetAuthenticatedUserRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetAuthenticatedUserResponse : public Response
{
public:
    virtual ~GetAuthenticatedUserResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIUser Content;
};

/* 
 *
 * Get a list of class names supported by a given class
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetClassesRequest : public Request
{
public:
    virtual ~GetClassesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the class */
	FString _Class;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetClassesResponse : public Response
{
public:
    virtual ~GetClassesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    FString Content;
};

/* 
 *
 * Retrieve JSON Web Key
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetJsonWebKeyRequest : public Request
{
public:
    virtual ~GetJsonWebKeyRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Key ID received as part of JWT header field kid */
	int32 Key = 0;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetJsonWebKeyResponse : public Response
{
public:
    virtual ~GetJsonWebKeyResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    FString Content;
};

/* 
 *
 * Retrieve JSON Web Token
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetJsonWebTokenRequest : public Request
{
public:
    virtual ~GetJsonWebTokenRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Token expiry time in minutes, default: 30 minutes */
	TOptional<int32> ExpiryTimeInMins;
	/* Maximum token expiry time in minutes, default: 480 minutes */
	TOptional<int32> MaxExpiryTimeInMins;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetJsonWebTokenResponse : public Response
{
public:
    virtual ~GetJsonWebTokenResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    FString Content;
};

/* 
 *
 * Retrieve organization details
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetOrganisationRequest : public Request
{
public:
    virtual ~GetOrganisationRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetOrganisationResponse : public Response
{
public:
    virtual ~GetOrganisationResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIOrganisation Content;
};

/* 
 *
 * Retrieve all organizations details
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetOrganisationsRequest : public Request
{
public:
    virtual ~GetOrganisationsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

};

class OPENAPI_API OpenAPIBlueOceanApi::GetOrganisationsResponse : public Response
{
public:
    virtual ~GetOrganisationsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIOrganisation> Content;
};

/* 
 *
 * Retrieve pipeline details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRequest : public Request
{
public:
    virtual ~GetPipelineRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineResponse : public Response
{
public:
    virtual ~GetPipelineResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIPipeline Content;
};

/* 
 *
 * Retrieve all activities details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineActivitiesRequest : public Request
{
public:
    virtual ~GetPipelineActivitiesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineActivitiesResponse : public Response
{
public:
    virtual ~GetPipelineActivitiesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIPipelineActivity> Content;
};

/* 
 *
 * Retrieve branch details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineBranchRequest : public Request
{
public:
    virtual ~GetPipelineBranchRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the branch */
	FString Branch;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineBranchResponse : public Response
{
public:
    virtual ~GetPipelineBranchResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIBranchImpl Content;
};

/* 
 *
 * Retrieve branch run details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineBranchRunRequest : public Request
{
public:
    virtual ~GetPipelineBranchRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the branch */
	FString Branch;
	/* Name of the run */
	FString Run;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineBranchRunResponse : public Response
{
public:
    virtual ~GetPipelineBranchRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIPipelineRun Content;
};

/* 
 *
 * Retrieve all branches details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineBranchesRequest : public Request
{
public:
    virtual ~GetPipelineBranchesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineBranchesResponse : public Response
{
public:
    virtual ~GetPipelineBranchesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIMultibranchPipeline Content;
};

/* 
 *
 * Retrieve pipeline folder for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineFolderRequest : public Request
{
public:
    virtual ~GetPipelineFolderRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the folder */
	FString Folder;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineFolderResponse : public Response
{
public:
    virtual ~GetPipelineFolderResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIPipelineFolderImpl Content;
};

/* 
 *
 * Retrieve pipeline details for an organization folder
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineFolderPipelineRequest : public Request
{
public:
    virtual ~GetPipelineFolderPipelineRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the folder */
	FString Folder;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineFolderPipelineResponse : public Response
{
public:
    virtual ~GetPipelineFolderPipelineResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIPipelineImpl Content;
};

/* 
 *
 * Retrieve queue details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineQueueRequest : public Request
{
public:
    virtual ~GetPipelineQueueRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineQueueResponse : public Response
{
public:
    virtual ~GetPipelineQueueResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIQueueItemImpl> Content;
};

/* 
 *
 * Retrieve run details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunRequest : public Request
{
public:
    virtual ~GetPipelineRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the run */
	FString Run;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunResponse : public Response
{
public:
    virtual ~GetPipelineRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIPipelineRun Content;
};

/* 
 *
 * Get log for a pipeline run
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunLogRequest : public Request
{
public:
    virtual ~GetPipelineRunLogRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the run */
	FString Run;
	/* Start position of the log */
	TOptional<int32> Start;
	/* Set to true in order to download the file, otherwise it's passed as a response body */
	TOptional<bool> Download;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunLogResponse : public Response
{
public:
    virtual ~GetPipelineRunLogResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    FString Content;
};

/* 
 *
 * Retrieve run node details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodeRequest : public Request
{
public:
    virtual ~GetPipelineRunNodeRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the run */
	FString Run;
	/* Name of the node */
	FString Node;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodeResponse : public Response
{
public:
    virtual ~GetPipelineRunNodeResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIPipelineRunNode Content;
};

/* 
 *
 * Retrieve run node details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodeStepRequest : public Request
{
public:
    virtual ~GetPipelineRunNodeStepRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the run */
	FString Run;
	/* Name of the node */
	FString Node;
	/* Name of the step */
	FString Step;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodeStepResponse : public Response
{
public:
    virtual ~GetPipelineRunNodeStepResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIPipelineStepImpl Content;
};

/* 
 *
 * Get log for a pipeline run node step
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodeStepLogRequest : public Request
{
public:
    virtual ~GetPipelineRunNodeStepLogRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the run */
	FString Run;
	/* Name of the node */
	FString Node;
	/* Name of the step */
	FString Step;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodeStepLogResponse : public Response
{
public:
    virtual ~GetPipelineRunNodeStepLogResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    FString Content;
};

/* 
 *
 * Retrieve run node steps details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodeStepsRequest : public Request
{
public:
    virtual ~GetPipelineRunNodeStepsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the run */
	FString Run;
	/* Name of the node */
	FString Node;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodeStepsResponse : public Response
{
public:
    virtual ~GetPipelineRunNodeStepsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIPipelineStepImpl> Content;
};

/* 
 *
 * Retrieve run nodes details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodesRequest : public Request
{
public:
    virtual ~GetPipelineRunNodesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the run */
	FString Run;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunNodesResponse : public Response
{
public:
    virtual ~GetPipelineRunNodesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIPipelineRunNode> Content;
};

/* 
 *
 * Retrieve all runs details for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunsRequest : public Request
{
public:
    virtual ~GetPipelineRunsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelineRunsResponse : public Response
{
public:
    virtual ~GetPipelineRunsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIPipelineRun> Content;
};

/* 
 *
 * Retrieve all pipelines details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetPipelinesRequest : public Request
{
public:
    virtual ~GetPipelinesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetPipelinesResponse : public Response
{
public:
    virtual ~GetPipelinesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIPipeline> Content;
};

/* 
 *
 * Retrieve SCM details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetSCMRequest : public Request
{
public:
    virtual ~GetSCMRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of SCM */
	FString Scm;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetSCMResponse : public Response
{
public:
    virtual ~GetSCMResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGithubScm Content;
};

/* 
 *
 * Retrieve SCM organization repositories details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetSCMOrganisationRepositoriesRequest : public Request
{
public:
    virtual ~GetSCMOrganisationRepositoriesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of SCM */
	FString Scm;
	/* Name of the SCM organization */
	FString ScmOrganisation;
	/* Credential ID */
	TOptional<FString> CredentialId;
	/* Number of items in a page */
	TOptional<int32> PageSize;
	/* Page number */
	TOptional<int32> PageNumber;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetSCMOrganisationRepositoriesResponse : public Response
{
public:
    virtual ~GetSCMOrganisationRepositoriesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIGithubOrganization> Content;
};

/* 
 *
 * Retrieve SCM organization repository details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetSCMOrganisationRepositoryRequest : public Request
{
public:
    virtual ~GetSCMOrganisationRepositoryRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of SCM */
	FString Scm;
	/* Name of the SCM organization */
	FString ScmOrganisation;
	/* Name of the SCM repository */
	FString Repository;
	/* Credential ID */
	TOptional<FString> CredentialId;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetSCMOrganisationRepositoryResponse : public Response
{
public:
    virtual ~GetSCMOrganisationRepositoryResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIGithubOrganization> Content;
};

/* 
 *
 * Retrieve SCM organizations details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetSCMOrganisationsRequest : public Request
{
public:
    virtual ~GetSCMOrganisationsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of SCM */
	FString Scm;
	/* Credential ID */
	TOptional<FString> CredentialId;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetSCMOrganisationsResponse : public Response
{
public:
    virtual ~GetSCMOrganisationsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIGithubOrganization> Content;
};

/* 
 *
 * Retrieve user details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetUserRequest : public Request
{
public:
    virtual ~GetUserRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the user */
	FString User;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetUserResponse : public Response
{
public:
    virtual ~GetUserResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIUser Content;
};

/* 
 *
 * Retrieve user favorites details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetUserFavoritesRequest : public Request
{
public:
    virtual ~GetUserFavoritesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the user */
	FString User;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetUserFavoritesResponse : public Response
{
public:
    virtual ~GetUserFavoritesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    TArray<OpenAPIFavoriteImpl> Content;
};

/* 
 *
 * Retrieve users details for an organization
*/
class OPENAPI_API OpenAPIBlueOceanApi::GetUsersRequest : public Request
{
public:
    virtual ~GetUsersRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
};

class OPENAPI_API OpenAPIBlueOceanApi::GetUsersResponse : public Response
{
public:
    virtual ~GetUsersResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIUser Content;
};

/* 
 *
 * Replay an organization pipeline run
*/
class OPENAPI_API OpenAPIBlueOceanApi::PostPipelineRunRequest : public Request
{
public:
    virtual ~PostPipelineRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the run */
	FString Run;
};

class OPENAPI_API OpenAPIBlueOceanApi::PostPipelineRunResponse : public Response
{
public:
    virtual ~PostPipelineRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIQueueItemImpl Content;
};

/* 
 *
 * Start a build for an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::PostPipelineRunsRequest : public Request
{
public:
    virtual ~PostPipelineRunsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
};

class OPENAPI_API OpenAPIBlueOceanApi::PostPipelineRunsResponse : public Response
{
public:
    virtual ~PostPipelineRunsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIQueueItemImpl Content;
};

/* 
 *
 * Favorite/unfavorite a pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::PutPipelineFavoriteRequest : public Request
{
public:
    virtual ~PutPipelineFavoriteRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Set JSON string body to {\"favorite\": true} to favorite, set value to false to unfavorite */
	UNKNOWN_BASE_TYPE UnknownBaseType;
};

class OPENAPI_API OpenAPIBlueOceanApi::PutPipelineFavoriteResponse : public Response
{
public:
    virtual ~PutPipelineFavoriteResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIFavoriteImpl Content;
};

/* 
 *
 * Stop a build of an organization pipeline
*/
class OPENAPI_API OpenAPIBlueOceanApi::PutPipelineRunRequest : public Request
{
public:
    virtual ~PutPipelineRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Name of the organization */
	FString Organization;
	/* Name of the pipeline */
	FString Pipeline;
	/* Name of the run */
	FString Run;
	/* Set to true to make blocking stop, default: false */
	TOptional<FString> Blocking;
	/* Timeout in seconds, default: 10 seconds */
	TOptional<int32> TimeOutInSecs;
};

class OPENAPI_API OpenAPIBlueOceanApi::PutPipelineRunResponse : public Response
{
public:
    virtual ~PutPipelineRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIPipelineRun Content;
};

/* 
 *
 * Search for any resource details
*/
class OPENAPI_API OpenAPIBlueOceanApi::SearchRequest : public Request
{
public:
    virtual ~SearchRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Query string */
	FString Q;
};

class OPENAPI_API OpenAPIBlueOceanApi::SearchResponse : public Response
{
public:
    virtual ~SearchResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    FString Content;
};

/* 
 *
 * Get classes details
*/
class OPENAPI_API OpenAPIBlueOceanApi::SearchClassesRequest : public Request
{
public:
    virtual ~SearchClassesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Query string containing an array of class names */
	FString Q;
};

class OPENAPI_API OpenAPIBlueOceanApi::SearchClassesResponse : public Response
{
public:
    virtual ~SearchClassesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    FString Content;
};

}
