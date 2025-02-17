# org.openapitools.client - Kotlin client library for Swaggy Jenkins

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BaseApi* | [**getCrumb**](docs/BaseApi.md#getcrumb) | **GET** /crumbIssuer/api/json | 
*BlueOceanApi* | [**deletePipelineQueueItem**](docs/BlueOceanApi.md#deletepipelinequeueitem) | **DELETE** /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue/{queue} | 
*BlueOceanApi* | [**getAuthenticatedUser**](docs/BlueOceanApi.md#getauthenticateduser) | **GET** /blue/rest/organizations/{organization}/user/ | 
*BlueOceanApi* | [**getClasses**](docs/BlueOceanApi.md#getclasses) | **GET** /blue/rest/classes/{class} | 
*BlueOceanApi* | [**getJsonWebKey**](docs/BlueOceanApi.md#getjsonwebkey) | **GET** /jwt-auth/jwks/{key} | 
*BlueOceanApi* | [**getJsonWebToken**](docs/BlueOceanApi.md#getjsonwebtoken) | **GET** /jwt-auth/token | 
*BlueOceanApi* | [**getOrganisation**](docs/BlueOceanApi.md#getorganisation) | **GET** /blue/rest/organizations/{organization} | 
*BlueOceanApi* | [**getOrganisations**](docs/BlueOceanApi.md#getorganisations) | **GET** /blue/rest/organizations/ | 
*BlueOceanApi* | [**getPipeline**](docs/BlueOceanApi.md#getpipeline) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline} | 
*BlueOceanApi* | [**getPipelineActivities**](docs/BlueOceanApi.md#getpipelineactivities) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/activities | 
*BlueOceanApi* | [**getPipelineBranch**](docs/BlueOceanApi.md#getpipelinebranch) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/ | 
*BlueOceanApi* | [**getPipelineBranchRun**](docs/BlueOceanApi.md#getpipelinebranchrun) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/runs/{run} | 
*BlueOceanApi* | [**getPipelineBranches**](docs/BlueOceanApi.md#getpipelinebranches) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches | 
*BlueOceanApi* | [**getPipelineFolder**](docs/BlueOceanApi.md#getpipelinefolder) | **GET** /blue/rest/organizations/{organization}/pipelines/{folder}/ | 
*BlueOceanApi* | [**getPipelineFolderPipeline**](docs/BlueOceanApi.md#getpipelinefolderpipeline) | **GET** /blue/rest/organizations/{organization}/pipelines/{folder}/pipelines/{pipeline} | 
*BlueOceanApi* | [**getPipelineQueue**](docs/BlueOceanApi.md#getpipelinequeue) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue | 
*BlueOceanApi* | [**getPipelineRun**](docs/BlueOceanApi.md#getpipelinerun) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run} | 
*BlueOceanApi* | [**getPipelineRunLog**](docs/BlueOceanApi.md#getpipelinerunlog) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/log | 
*BlueOceanApi* | [**getPipelineRunNode**](docs/BlueOceanApi.md#getpipelinerunnode) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node} | 
*BlueOceanApi* | [**getPipelineRunNodeStep**](docs/BlueOceanApi.md#getpipelinerunnodestep) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step} | 
*BlueOceanApi* | [**getPipelineRunNodeStepLog**](docs/BlueOceanApi.md#getpipelinerunnodesteplog) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}/log | 
*BlueOceanApi* | [**getPipelineRunNodeSteps**](docs/BlueOceanApi.md#getpipelinerunnodesteps) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps | 
*BlueOceanApi* | [**getPipelineRunNodes**](docs/BlueOceanApi.md#getpipelinerunnodes) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes | 
*BlueOceanApi* | [**getPipelineRuns**](docs/BlueOceanApi.md#getpipelineruns) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs | 
*BlueOceanApi* | [**getPipelines**](docs/BlueOceanApi.md#getpipelines) | **GET** /blue/rest/organizations/{organization}/pipelines/ | 
*BlueOceanApi* | [**getSCM**](docs/BlueOceanApi.md#getscm) | **GET** /blue/rest/organizations/{organization}/scm/{scm} | 
*BlueOceanApi* | [**getSCMOrganisationRepositories**](docs/BlueOceanApi.md#getscmorganisationrepositories) | **GET** /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories | 
*BlueOceanApi* | [**getSCMOrganisationRepository**](docs/BlueOceanApi.md#getscmorganisationrepository) | **GET** /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories/{repository} | 
*BlueOceanApi* | [**getSCMOrganisations**](docs/BlueOceanApi.md#getscmorganisations) | **GET** /blue/rest/organizations/{organization}/scm/{scm}/organizations | 
*BlueOceanApi* | [**getUser**](docs/BlueOceanApi.md#getuser) | **GET** /blue/rest/organizations/{organization}/users/{user} | 
*BlueOceanApi* | [**getUserFavorites**](docs/BlueOceanApi.md#getuserfavorites) | **GET** /blue/rest/users/{user}/favorites | 
*BlueOceanApi* | [**getUsers**](docs/BlueOceanApi.md#getusers) | **GET** /blue/rest/organizations/{organization}/users/ | 
*BlueOceanApi* | [**postPipelineRun**](docs/BlueOceanApi.md#postpipelinerun) | **POST** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/replay | 
*BlueOceanApi* | [**postPipelineRuns**](docs/BlueOceanApi.md#postpipelineruns) | **POST** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs | 
*BlueOceanApi* | [**putPipelineFavorite**](docs/BlueOceanApi.md#putpipelinefavorite) | **PUT** /blue/rest/organizations/{organization}/pipelines/{pipeline}/favorite | 
*BlueOceanApi* | [**putPipelineRun**](docs/BlueOceanApi.md#putpipelinerun) | **PUT** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/stop | 
*BlueOceanApi* | [**search**](docs/BlueOceanApi.md#search) | **GET** /blue/rest/search/ | 
*BlueOceanApi* | [**searchClasses**](docs/BlueOceanApi.md#searchclasses) | **GET** /blue/rest/classes/ | 
*RemoteAccessApi* | [**getComputer**](docs/RemoteAccessApi.md#getcomputer) | **GET** /computer/api/json | 
*RemoteAccessApi* | [**getJenkins**](docs/RemoteAccessApi.md#getjenkins) | **GET** /api/json | 
*RemoteAccessApi* | [**getJob**](docs/RemoteAccessApi.md#getjob) | **GET** /job/{name}/api/json | 
*RemoteAccessApi* | [**getJobConfig**](docs/RemoteAccessApi.md#getjobconfig) | **GET** /job/{name}/config.xml | 
*RemoteAccessApi* | [**getJobLastBuild**](docs/RemoteAccessApi.md#getjoblastbuild) | **GET** /job/{name}/lastBuild/api/json | 
*RemoteAccessApi* | [**getJobProgressiveText**](docs/RemoteAccessApi.md#getjobprogressivetext) | **GET** /job/{name}/{number}/logText/progressiveText | 
*RemoteAccessApi* | [**getQueue**](docs/RemoteAccessApi.md#getqueue) | **GET** /queue/api/json | 
*RemoteAccessApi* | [**getQueueItem**](docs/RemoteAccessApi.md#getqueueitem) | **GET** /queue/item/{number}/api/json | 
*RemoteAccessApi* | [**getView**](docs/RemoteAccessApi.md#getview) | **GET** /view/{name}/api/json | 
*RemoteAccessApi* | [**getViewConfig**](docs/RemoteAccessApi.md#getviewconfig) | **GET** /view/{name}/config.xml | 
*RemoteAccessApi* | [**headJenkins**](docs/RemoteAccessApi.md#headjenkins) | **HEAD** /api/json | 
*RemoteAccessApi* | [**postCreateItem**](docs/RemoteAccessApi.md#postcreateitem) | **POST** /createItem | 
*RemoteAccessApi* | [**postCreateView**](docs/RemoteAccessApi.md#postcreateview) | **POST** /createView | 
*RemoteAccessApi* | [**postJobBuild**](docs/RemoteAccessApi.md#postjobbuild) | **POST** /job/{name}/build | 
*RemoteAccessApi* | [**postJobConfig**](docs/RemoteAccessApi.md#postjobconfig) | **POST** /job/{name}/config.xml | 
*RemoteAccessApi* | [**postJobDelete**](docs/RemoteAccessApi.md#postjobdelete) | **POST** /job/{name}/doDelete | 
*RemoteAccessApi* | [**postJobDisable**](docs/RemoteAccessApi.md#postjobdisable) | **POST** /job/{name}/disable | 
*RemoteAccessApi* | [**postJobEnable**](docs/RemoteAccessApi.md#postjobenable) | **POST** /job/{name}/enable | 
*RemoteAccessApi* | [**postJobLastBuildStop**](docs/RemoteAccessApi.md#postjoblastbuildstop) | **POST** /job/{name}/lastBuild/stop | 
*RemoteAccessApi* | [**postViewConfig**](docs/RemoteAccessApi.md#postviewconfig) | **POST** /view/{name}/config.xml | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AllView](docs/AllView.md)
 - [org.openapitools.client.models.BranchImpl](docs/BranchImpl.md)
 - [org.openapitools.client.models.BranchImpllinks](docs/BranchImpllinks.md)
 - [org.openapitools.client.models.BranchImplpermissions](docs/BranchImplpermissions.md)
 - [org.openapitools.client.models.CauseAction](docs/CauseAction.md)
 - [org.openapitools.client.models.CauseUserIdCause](docs/CauseUserIdCause.md)
 - [org.openapitools.client.models.ClassesByClass](docs/ClassesByClass.md)
 - [org.openapitools.client.models.ClockDifference](docs/ClockDifference.md)
 - [org.openapitools.client.models.ComputerSet](docs/ComputerSet.md)
 - [org.openapitools.client.models.DefaultCrumbIssuer](docs/DefaultCrumbIssuer.md)
 - [org.openapitools.client.models.DiskSpaceMonitorDescriptorDiskSpace](docs/DiskSpaceMonitorDescriptorDiskSpace.md)
 - [org.openapitools.client.models.EmptyChangeLogSet](docs/EmptyChangeLogSet.md)
 - [org.openapitools.client.models.ExtensionClassContainerImpl1](docs/ExtensionClassContainerImpl1.md)
 - [org.openapitools.client.models.ExtensionClassContainerImpl1links](docs/ExtensionClassContainerImpl1links.md)
 - [org.openapitools.client.models.ExtensionClassContainerImpl1map](docs/ExtensionClassContainerImpl1map.md)
 - [org.openapitools.client.models.ExtensionClassImpl](docs/ExtensionClassImpl.md)
 - [org.openapitools.client.models.ExtensionClassImpllinks](docs/ExtensionClassImpllinks.md)
 - [org.openapitools.client.models.FavoriteImpl](docs/FavoriteImpl.md)
 - [org.openapitools.client.models.FavoriteImpllinks](docs/FavoriteImpllinks.md)
 - [org.openapitools.client.models.FreeStyleBuild](docs/FreeStyleBuild.md)
 - [org.openapitools.client.models.FreeStyleProject](docs/FreeStyleProject.md)
 - [org.openapitools.client.models.FreeStyleProjectactions](docs/FreeStyleProjectactions.md)
 - [org.openapitools.client.models.FreeStyleProjecthealthReport](docs/FreeStyleProjecthealthReport.md)
 - [org.openapitools.client.models.GenericResource](docs/GenericResource.md)
 - [org.openapitools.client.models.GithubContent](docs/GithubContent.md)
 - [org.openapitools.client.models.GithubFile](docs/GithubFile.md)
 - [org.openapitools.client.models.GithubOrganization](docs/GithubOrganization.md)
 - [org.openapitools.client.models.GithubOrganizationlinks](docs/GithubOrganizationlinks.md)
 - [org.openapitools.client.models.GithubRepositories](docs/GithubRepositories.md)
 - [org.openapitools.client.models.GithubRepositorieslinks](docs/GithubRepositorieslinks.md)
 - [org.openapitools.client.models.GithubRepository](docs/GithubRepository.md)
 - [org.openapitools.client.models.GithubRepositorylinks](docs/GithubRepositorylinks.md)
 - [org.openapitools.client.models.GithubRepositorypermissions](docs/GithubRepositorypermissions.md)
 - [org.openapitools.client.models.GithubRespositoryContainer](docs/GithubRespositoryContainer.md)
 - [org.openapitools.client.models.GithubRespositoryContainerlinks](docs/GithubRespositoryContainerlinks.md)
 - [org.openapitools.client.models.GithubScm](docs/GithubScm.md)
 - [org.openapitools.client.models.GithubScmlinks](docs/GithubScmlinks.md)
 - [org.openapitools.client.models.Hudson](docs/Hudson.md)
 - [org.openapitools.client.models.HudsonMasterComputer](docs/HudsonMasterComputer.md)
 - [org.openapitools.client.models.HudsonMasterComputerexecutors](docs/HudsonMasterComputerexecutors.md)
 - [org.openapitools.client.models.HudsonMasterComputermonitorData](docs/HudsonMasterComputermonitorData.md)
 - [org.openapitools.client.models.HudsonassignedLabels](docs/HudsonassignedLabels.md)
 - [org.openapitools.client.models.InputStepImpl](docs/InputStepImpl.md)
 - [org.openapitools.client.models.InputStepImpllinks](docs/InputStepImpllinks.md)
 - [org.openapitools.client.models.Label1](docs/Label1.md)
 - [org.openapitools.client.models.Link](docs/Link.md)
 - [org.openapitools.client.models.ListView](docs/ListView.md)
 - [org.openapitools.client.models.MultibranchPipeline](docs/MultibranchPipeline.md)
 - [org.openapitools.client.models.NullSCM](docs/NullSCM.md)
 - [org.openapitools.client.models.Organisation](docs/Organisation.md)
 - [org.openapitools.client.models.Pipeline](docs/Pipeline.md)
 - [org.openapitools.client.models.PipelineActivity](docs/PipelineActivity.md)
 - [org.openapitools.client.models.PipelineActivityartifacts](docs/PipelineActivityartifacts.md)
 - [org.openapitools.client.models.PipelineBranchesitem](docs/PipelineBranchesitem.md)
 - [org.openapitools.client.models.PipelineBranchesitemlatestRun](docs/PipelineBranchesitemlatestRun.md)
 - [org.openapitools.client.models.PipelineBranchesitempullRequest](docs/PipelineBranchesitempullRequest.md)
 - [org.openapitools.client.models.PipelineBranchesitempullRequestlinks](docs/PipelineBranchesitempullRequestlinks.md)
 - [org.openapitools.client.models.PipelineFolderImpl](docs/PipelineFolderImpl.md)
 - [org.openapitools.client.models.PipelineImpl](docs/PipelineImpl.md)
 - [org.openapitools.client.models.PipelineImpllinks](docs/PipelineImpllinks.md)
 - [org.openapitools.client.models.PipelineRun](docs/PipelineRun.md)
 - [org.openapitools.client.models.PipelineRunImpl](docs/PipelineRunImpl.md)
 - [org.openapitools.client.models.PipelineRunImpllinks](docs/PipelineRunImpllinks.md)
 - [org.openapitools.client.models.PipelineRunNode](docs/PipelineRunNode.md)
 - [org.openapitools.client.models.PipelineRunNodeedges](docs/PipelineRunNodeedges.md)
 - [org.openapitools.client.models.PipelineRunartifacts](docs/PipelineRunartifacts.md)
 - [org.openapitools.client.models.PipelineStepImpl](docs/PipelineStepImpl.md)
 - [org.openapitools.client.models.PipelineStepImpllinks](docs/PipelineStepImpllinks.md)
 - [org.openapitools.client.models.PipelinelatestRun](docs/PipelinelatestRun.md)
 - [org.openapitools.client.models.PipelinelatestRunartifacts](docs/PipelinelatestRunartifacts.md)
 - [org.openapitools.client.models.Queue](docs/Queue.md)
 - [org.openapitools.client.models.QueueBlockedItem](docs/QueueBlockedItem.md)
 - [org.openapitools.client.models.QueueItemImpl](docs/QueueItemImpl.md)
 - [org.openapitools.client.models.QueueLeftItem](docs/QueueLeftItem.md)
 - [org.openapitools.client.models.ResponseTimeMonitorData](docs/ResponseTimeMonitorData.md)
 - [org.openapitools.client.models.StringParameterDefinition](docs/StringParameterDefinition.md)
 - [org.openapitools.client.models.StringParameterValue](docs/StringParameterValue.md)
 - [org.openapitools.client.models.SwapSpaceMonitorMemoryUsage2](docs/SwapSpaceMonitorMemoryUsage2.md)
 - [org.openapitools.client.models.UnlabeledLoadStatistics](docs/UnlabeledLoadStatistics.md)
 - [org.openapitools.client.models.User](docs/User.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="jenkins_auth"></a>
### jenkins_auth

- **Type**: HTTP basic authentication

<a name="jwt_auth"></a>
### jwt_auth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

