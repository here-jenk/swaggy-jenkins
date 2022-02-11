/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * BlueOceanApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_BlueOceanApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_BlueOceanApi_H_



#include "ApiClient.h"

#include "model/BranchImpl.h"
#include "model/FavoriteImpl.h"
#include "model/GithubOrganization.h"
#include "model/GithubScm.h"
#include "model/MultibranchPipeline.h"
#include "model/Organisation.h"
#include "model/Pipeline.h"
#include "model/PipelineActivity.h"
#include "model/PipelineFolderImpl.h"
#include "model/PipelineImpl.h"
#include "model/PipelineRun.h"
#include "model/PipelineRunNode.h"
#include "model/PipelineStepImpl.h"
#include "model/QueueItemImpl.h"
#include "model/User.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  BlueOceanApi 
{
public:

    explicit BlueOceanApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~BlueOceanApi();

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Delete queue item from an organization pipeline queue
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="queue">Name of the queue item</param>
    pplx::task<void> deletePipelineQueueItem(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t queue
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve authenticated user details for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    pplx::task<std::shared_ptr<User>> getAuthenticatedUser(
        utility::string_t organization
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Get a list of class names supported by a given class
    /// </remarks>
    /// <param name="r_class">Name of the class</param>
    pplx::task<utility::string_t> getClasses(
        utility::string_t r_class
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve JSON Web Key
    /// </remarks>
    /// <param name="key">Key ID received as part of JWT header field kid</param>
    pplx::task<utility::string_t> getJsonWebKey(
        int32_t key
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve JSON Web Token
    /// </remarks>
    /// <param name="expiryTimeInMins">Token expiry time in minutes, default: 30 minutes (optional, default to 0)</param>
    /// <param name="maxExpiryTimeInMins">Maximum token expiry time in minutes, default: 480 minutes (optional, default to 0)</param>
    pplx::task<utility::string_t> getJsonWebToken(
        boost::optional<int32_t> expiryTimeInMins,
        boost::optional<int32_t> maxExpiryTimeInMins
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve organization details
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    pplx::task<std::shared_ptr<Organisation>> getOrganisation(
        utility::string_t organization
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve all organizations details
    /// </remarks>
    pplx::task<std::vector<std::shared_ptr<Organisation>>> getOrganisations(
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve pipeline details for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    pplx::task<std::shared_ptr<Pipeline>> getPipeline(
        utility::string_t organization,
        utility::string_t pipeline
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve all activities details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    pplx::task<std::vector<std::shared_ptr<PipelineActivity>>> getPipelineActivities(
        utility::string_t organization,
        utility::string_t pipeline
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve branch details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="branch">Name of the branch</param>
    pplx::task<std::shared_ptr<BranchImpl>> getPipelineBranch(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t branch
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve branch run details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="branch">Name of the branch</param>
    /// <param name="run">Name of the run</param>
    pplx::task<std::shared_ptr<PipelineRun>> getPipelineBranchRun(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t branch,
        utility::string_t run
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve all branches details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    pplx::task<std::shared_ptr<MultibranchPipeline>> getPipelineBranches(
        utility::string_t organization,
        utility::string_t pipeline
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve pipeline folder for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="folder">Name of the folder</param>
    pplx::task<std::shared_ptr<PipelineFolderImpl>> getPipelineFolder(
        utility::string_t organization,
        utility::string_t folder
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve pipeline details for an organization folder
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="folder">Name of the folder</param>
    pplx::task<std::shared_ptr<PipelineImpl>> getPipelineFolderPipeline(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t folder
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve queue details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    pplx::task<std::vector<std::shared_ptr<QueueItemImpl>>> getPipelineQueue(
        utility::string_t organization,
        utility::string_t pipeline
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve run details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="run">Name of the run</param>
    pplx::task<std::shared_ptr<PipelineRun>> getPipelineRun(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t run
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Get log for a pipeline run
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="run">Name of the run</param>
    /// <param name="start">Start position of the log (optional, default to 0)</param>
    /// <param name="download">Set to true in order to download the file, otherwise it&#39;s passed as a response body (optional, default to false)</param>
    pplx::task<utility::string_t> getPipelineRunLog(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t run,
        boost::optional<int32_t> start,
        boost::optional<bool> download
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve run node details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="run">Name of the run</param>
    /// <param name="node">Name of the node</param>
    pplx::task<std::shared_ptr<PipelineRunNode>> getPipelineRunNode(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t run,
        utility::string_t node
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve run node details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="run">Name of the run</param>
    /// <param name="node">Name of the node</param>
    /// <param name="step">Name of the step</param>
    pplx::task<std::shared_ptr<PipelineStepImpl>> getPipelineRunNodeStep(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t run,
        utility::string_t node,
        utility::string_t step
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Get log for a pipeline run node step
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="run">Name of the run</param>
    /// <param name="node">Name of the node</param>
    /// <param name="step">Name of the step</param>
    pplx::task<utility::string_t> getPipelineRunNodeStepLog(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t run,
        utility::string_t node,
        utility::string_t step
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve run node steps details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="run">Name of the run</param>
    /// <param name="node">Name of the node</param>
    pplx::task<std::vector<std::shared_ptr<PipelineStepImpl>>> getPipelineRunNodeSteps(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t run,
        utility::string_t node
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve run nodes details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="run">Name of the run</param>
    pplx::task<std::vector<std::shared_ptr<PipelineRunNode>>> getPipelineRunNodes(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t run
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve all runs details for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    pplx::task<std::vector<std::shared_ptr<PipelineRun>>> getPipelineRuns(
        utility::string_t organization,
        utility::string_t pipeline
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve all pipelines details for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    pplx::task<std::vector<std::shared_ptr<Pipeline>>> getPipelines(
        utility::string_t organization
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve SCM details for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="scm">Name of SCM</param>
    pplx::task<std::shared_ptr<GithubScm>> getSCM(
        utility::string_t organization,
        utility::string_t scm
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve SCM organization repositories details for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="scm">Name of SCM</param>
    /// <param name="scmOrganisation">Name of the SCM organization</param>
    /// <param name="credentialId">Credential ID (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="pageSize">Number of items in a page (optional, default to 0)</param>
    /// <param name="pageNumber">Page number (optional, default to 0)</param>
    pplx::task<std::vector<std::shared_ptr<GithubOrganization>>> getSCMOrganisationRepositories(
        utility::string_t organization,
        utility::string_t scm,
        utility::string_t scmOrganisation,
        boost::optional<utility::string_t> credentialId,
        boost::optional<int32_t> pageSize,
        boost::optional<int32_t> pageNumber
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve SCM organization repository details for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="scm">Name of SCM</param>
    /// <param name="scmOrganisation">Name of the SCM organization</param>
    /// <param name="repository">Name of the SCM repository</param>
    /// <param name="credentialId">Credential ID (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<GithubOrganization>>> getSCMOrganisationRepository(
        utility::string_t organization,
        utility::string_t scm,
        utility::string_t scmOrganisation,
        utility::string_t repository,
        boost::optional<utility::string_t> credentialId
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve SCM organizations details for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="scm">Name of SCM</param>
    /// <param name="credentialId">Credential ID (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<GithubOrganization>>> getSCMOrganisations(
        utility::string_t organization,
        utility::string_t scm,
        boost::optional<utility::string_t> credentialId
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve user details for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="user">Name of the user</param>
    pplx::task<std::shared_ptr<User>> getUser(
        utility::string_t organization,
        utility::string_t user
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve user favorites details for an organization
    /// </remarks>
    /// <param name="user">Name of the user</param>
    pplx::task<std::vector<std::shared_ptr<FavoriteImpl>>> getUserFavorites(
        utility::string_t user
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Retrieve users details for an organization
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    pplx::task<std::shared_ptr<User>> getUsers(
        utility::string_t organization
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Replay an organization pipeline run
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="run">Name of the run</param>
    pplx::task<std::shared_ptr<QueueItemImpl>> postPipelineRun(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t run
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Start a build for an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    pplx::task<std::shared_ptr<QueueItemImpl>> postPipelineRuns(
        utility::string_t organization,
        utility::string_t pipeline
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Favorite/unfavorite a pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="body">Set JSON string body to {\&quot;favorite\&quot;: true} to favorite, set value to false to unfavorite</param>
    pplx::task<std::shared_ptr<FavoriteImpl>> putPipelineFavorite(
        utility::string_t organization,
        utility::string_t pipeline,
        bool body
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Stop a build of an organization pipeline
    /// </remarks>
    /// <param name="organization">Name of the organization</param>
    /// <param name="pipeline">Name of the pipeline</param>
    /// <param name="run">Name of the run</param>
    /// <param name="blocking">Set to true to make blocking stop, default: false (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="timeOutInSecs">Timeout in seconds, default: 10 seconds (optional, default to 0)</param>
    pplx::task<std::shared_ptr<PipelineRun>> putPipelineRun(
        utility::string_t organization,
        utility::string_t pipeline,
        utility::string_t run,
        boost::optional<utility::string_t> blocking,
        boost::optional<int32_t> timeOutInSecs
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Search for any resource details
    /// </remarks>
    /// <param name="q">Query string</param>
    pplx::task<utility::string_t> search(
        utility::string_t q
    ) const;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// Get classes details
    /// </remarks>
    /// <param name="q">Query string containing an array of class names</param>
    pplx::task<utility::string_t> searchClasses(
        utility::string_t q
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_BlueOceanApi_H_ */

