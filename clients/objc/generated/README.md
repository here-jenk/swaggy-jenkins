# OpenAPIClient

Jenkins API clients generated from Swagger / Open API specification

This ObjC package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.5.1-pre.0
- Package version: 
- Build package: org.openapitools.codegen.languages.ObjcClientCodegen
For more information, please visit [http://github.com/cliffano/swaggy-jenkins](http://github.com/cliffano/swaggy-jenkins)

## Requirements

The SDK requires [**ARC (Automatic Reference Counting)**](http://stackoverflow.com/questions/7778356/how-to-enable-disable-automatic-reference-counting) to be enabled in the Xcode project.

## Installation & Usage
### Install from Github using [CocoaPods](https://cocoapods.org/)

Add the following to the Podfile:

```ruby
pod 'OpenAPIClient', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'
```

To specify a particular branch, append `, :branch => 'branch-name-here'`

To specify a particular commit, append `, :commit => '11aa22'`

### Install from local path using [CocoaPods](https://cocoapods.org/)

Put the SDK under your project folder (e.g. /path/to/objc_project/Vendor/OpenAPIClient) and then add the following to the Podfile:

```ruby
pod 'OpenAPIClient', :path => 'Vendor/OpenAPIClient'
```

### Usage

Import the following:

```objc
#import <OpenAPIClient/OAIApiClient.h>
#import <OpenAPIClient/OAIDefaultConfiguration.h>
// load models
#import <OpenAPIClient/OAIAllView.h>
#import <OpenAPIClient/OAIBranchImpl.h>
#import <OpenAPIClient/OAIBranchImpllinks.h>
#import <OpenAPIClient/OAIBranchImplpermissions.h>
#import <OpenAPIClient/OAICauseAction.h>
#import <OpenAPIClient/OAICauseUserIdCause.h>
#import <OpenAPIClient/OAIClassesByClass.h>
#import <OpenAPIClient/OAIClockDifference.h>
#import <OpenAPIClient/OAIComputerSet.h>
#import <OpenAPIClient/OAIDefaultCrumbIssuer.h>
#import <OpenAPIClient/OAIDiskSpaceMonitorDescriptorDiskSpace.h>
#import <OpenAPIClient/OAIEmptyChangeLogSet.h>
#import <OpenAPIClient/OAIExtensionClassContainerImpl1.h>
#import <OpenAPIClient/OAIExtensionClassContainerImpl1links.h>
#import <OpenAPIClient/OAIExtensionClassContainerImpl1map.h>
#import <OpenAPIClient/OAIExtensionClassImpl.h>
#import <OpenAPIClient/OAIExtensionClassImpllinks.h>
#import <OpenAPIClient/OAIFavoriteImpl.h>
#import <OpenAPIClient/OAIFavoriteImpllinks.h>
#import <OpenAPIClient/OAIFreeStyleBuild.h>
#import <OpenAPIClient/OAIFreeStyleProject.h>
#import <OpenAPIClient/OAIFreeStyleProjectactions.h>
#import <OpenAPIClient/OAIFreeStyleProjecthealthReport.h>
#import <OpenAPIClient/OAIGenericResource.h>
#import <OpenAPIClient/OAIGithubContent.h>
#import <OpenAPIClient/OAIGithubFile.h>
#import <OpenAPIClient/OAIGithubOrganization.h>
#import <OpenAPIClient/OAIGithubOrganizationlinks.h>
#import <OpenAPIClient/OAIGithubRepositories.h>
#import <OpenAPIClient/OAIGithubRepositorieslinks.h>
#import <OpenAPIClient/OAIGithubRepository.h>
#import <OpenAPIClient/OAIGithubRepositorylinks.h>
#import <OpenAPIClient/OAIGithubRepositorypermissions.h>
#import <OpenAPIClient/OAIGithubRespositoryContainer.h>
#import <OpenAPIClient/OAIGithubRespositoryContainerlinks.h>
#import <OpenAPIClient/OAIGithubScm.h>
#import <OpenAPIClient/OAIGithubScmlinks.h>
#import <OpenAPIClient/OAIHudson.h>
#import <OpenAPIClient/OAIHudsonMasterComputer.h>
#import <OpenAPIClient/OAIHudsonMasterComputerexecutors.h>
#import <OpenAPIClient/OAIHudsonMasterComputermonitorData.h>
#import <OpenAPIClient/OAIHudsonassignedLabels.h>
#import <OpenAPIClient/OAIInputStepImpl.h>
#import <OpenAPIClient/OAIInputStepImpllinks.h>
#import <OpenAPIClient/OAILabel1.h>
#import <OpenAPIClient/OAILink.h>
#import <OpenAPIClient/OAIListView.h>
#import <OpenAPIClient/OAIMultibranchPipeline.h>
#import <OpenAPIClient/OAINullSCM.h>
#import <OpenAPIClient/OAIOrganisation.h>
#import <OpenAPIClient/OAIPipeline.h>
#import <OpenAPIClient/OAIPipelineActivity.h>
#import <OpenAPIClient/OAIPipelineActivityartifacts.h>
#import <OpenAPIClient/OAIPipelineBranchesitem.h>
#import <OpenAPIClient/OAIPipelineBranchesitemlatestRun.h>
#import <OpenAPIClient/OAIPipelineBranchesitempullRequest.h>
#import <OpenAPIClient/OAIPipelineBranchesitempullRequestlinks.h>
#import <OpenAPIClient/OAIPipelineFolderImpl.h>
#import <OpenAPIClient/OAIPipelineImpl.h>
#import <OpenAPIClient/OAIPipelineImpllinks.h>
#import <OpenAPIClient/OAIPipelineRun.h>
#import <OpenAPIClient/OAIPipelineRunImpl.h>
#import <OpenAPIClient/OAIPipelineRunImpllinks.h>
#import <OpenAPIClient/OAIPipelineRunNode.h>
#import <OpenAPIClient/OAIPipelineRunNodeedges.h>
#import <OpenAPIClient/OAIPipelineRunartifacts.h>
#import <OpenAPIClient/OAIPipelineStepImpl.h>
#import <OpenAPIClient/OAIPipelineStepImpllinks.h>
#import <OpenAPIClient/OAIPipelinelatestRun.h>
#import <OpenAPIClient/OAIPipelinelatestRunartifacts.h>
#import <OpenAPIClient/OAIQueue.h>
#import <OpenAPIClient/OAIQueueBlockedItem.h>
#import <OpenAPIClient/OAIQueueItemImpl.h>
#import <OpenAPIClient/OAIQueueLeftItem.h>
#import <OpenAPIClient/OAIResponseTimeMonitorData.h>
#import <OpenAPIClient/OAIStringParameterDefinition.h>
#import <OpenAPIClient/OAIStringParameterValue.h>
#import <OpenAPIClient/OAISwapSpaceMonitorMemoryUsage2.h>
#import <OpenAPIClient/OAIUnlabeledLoadStatistics.h>
#import <OpenAPIClient/OAIUser.h>
// load API classes for accessing endpoints
#import <OpenAPIClient/OAIBaseApi.h>
#import <OpenAPIClient/OAIBlueOceanApi.h>
#import <OpenAPIClient/OAIRemoteAccessApi.h>

```

## Recommendation

It's recommended to create an instance of ApiClient per thread in a multi-threaded environment to avoid any potential issues.

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```objc

OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: jenkins_auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAIBaseApi *apiInstance = [[OAIBaseApi alloc] init];

[apiInstance getCrumbWithCompletionHandler: 
              ^(OAIDefaultCrumbIssuer* output, NSError* error) {
                            if (output) {
                                NSLog(@"%@", output);
                            }
                            if (error) {
                                NSLog(@"Error: %@", error);
                            }
                        }];

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OAIBaseApi* | [**getCrumb**](docs/OAIBaseApi.md#getcrumb) | **GET** /crumbIssuer/api/json | 
*OAIBlueOceanApi* | [**deletePipelineQueueItem**](docs/OAIBlueOceanApi.md#deletepipelinequeueitem) | **DELETE** /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue/{queue} | 
*OAIBlueOceanApi* | [**getAuthenticatedUser**](docs/OAIBlueOceanApi.md#getauthenticateduser) | **GET** /blue/rest/organizations/{organization}/user/ | 
*OAIBlueOceanApi* | [**getClasses**](docs/OAIBlueOceanApi.md#getclasses) | **GET** /blue/rest/classes/{class} | 
*OAIBlueOceanApi* | [**getJsonWebKey**](docs/OAIBlueOceanApi.md#getjsonwebkey) | **GET** /jwt-auth/jwks/{key} | 
*OAIBlueOceanApi* | [**getJsonWebToken**](docs/OAIBlueOceanApi.md#getjsonwebtoken) | **GET** /jwt-auth/token | 
*OAIBlueOceanApi* | [**getOrganisation**](docs/OAIBlueOceanApi.md#getorganisation) | **GET** /blue/rest/organizations/{organization} | 
*OAIBlueOceanApi* | [**getOrganisations**](docs/OAIBlueOceanApi.md#getorganisations) | **GET** /blue/rest/organizations/ | 
*OAIBlueOceanApi* | [**getPipeline**](docs/OAIBlueOceanApi.md#getpipeline) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline} | 
*OAIBlueOceanApi* | [**getPipelineActivities**](docs/OAIBlueOceanApi.md#getpipelineactivities) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/activities | 
*OAIBlueOceanApi* | [**getPipelineBranch**](docs/OAIBlueOceanApi.md#getpipelinebranch) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/ | 
*OAIBlueOceanApi* | [**getPipelineBranchRun**](docs/OAIBlueOceanApi.md#getpipelinebranchrun) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/runs/{run} | 
*OAIBlueOceanApi* | [**getPipelineBranches**](docs/OAIBlueOceanApi.md#getpipelinebranches) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches | 
*OAIBlueOceanApi* | [**getPipelineFolder**](docs/OAIBlueOceanApi.md#getpipelinefolder) | **GET** /blue/rest/organizations/{organization}/pipelines/{folder}/ | 
*OAIBlueOceanApi* | [**getPipelineFolderPipeline**](docs/OAIBlueOceanApi.md#getpipelinefolderpipeline) | **GET** /blue/rest/organizations/{organization}/pipelines/{folder}/pipelines/{pipeline} | 
*OAIBlueOceanApi* | [**getPipelineQueue**](docs/OAIBlueOceanApi.md#getpipelinequeue) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue | 
*OAIBlueOceanApi* | [**getPipelineRun**](docs/OAIBlueOceanApi.md#getpipelinerun) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run} | 
*OAIBlueOceanApi* | [**getPipelineRunLog**](docs/OAIBlueOceanApi.md#getpipelinerunlog) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/log | 
*OAIBlueOceanApi* | [**getPipelineRunNode**](docs/OAIBlueOceanApi.md#getpipelinerunnode) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node} | 
*OAIBlueOceanApi* | [**getPipelineRunNodeStep**](docs/OAIBlueOceanApi.md#getpipelinerunnodestep) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step} | 
*OAIBlueOceanApi* | [**getPipelineRunNodeStepLog**](docs/OAIBlueOceanApi.md#getpipelinerunnodesteplog) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}/log | 
*OAIBlueOceanApi* | [**getPipelineRunNodeSteps**](docs/OAIBlueOceanApi.md#getpipelinerunnodesteps) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps | 
*OAIBlueOceanApi* | [**getPipelineRunNodes**](docs/OAIBlueOceanApi.md#getpipelinerunnodes) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes | 
*OAIBlueOceanApi* | [**getPipelineRuns**](docs/OAIBlueOceanApi.md#getpipelineruns) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs | 
*OAIBlueOceanApi* | [**getPipelines**](docs/OAIBlueOceanApi.md#getpipelines) | **GET** /blue/rest/organizations/{organization}/pipelines/ | 
*OAIBlueOceanApi* | [**getSCM**](docs/OAIBlueOceanApi.md#getscm) | **GET** /blue/rest/organizations/{organization}/scm/{scm} | 
*OAIBlueOceanApi* | [**getSCMOrganisationRepositories**](docs/OAIBlueOceanApi.md#getscmorganisationrepositories) | **GET** /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories | 
*OAIBlueOceanApi* | [**getSCMOrganisationRepository**](docs/OAIBlueOceanApi.md#getscmorganisationrepository) | **GET** /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories/{repository} | 
*OAIBlueOceanApi* | [**getSCMOrganisations**](docs/OAIBlueOceanApi.md#getscmorganisations) | **GET** /blue/rest/organizations/{organization}/scm/{scm}/organizations | 
*OAIBlueOceanApi* | [**getUser**](docs/OAIBlueOceanApi.md#getuser) | **GET** /blue/rest/organizations/{organization}/users/{user} | 
*OAIBlueOceanApi* | [**getUserFavorites**](docs/OAIBlueOceanApi.md#getuserfavorites) | **GET** /blue/rest/users/{user}/favorites | 
*OAIBlueOceanApi* | [**getUsers**](docs/OAIBlueOceanApi.md#getusers) | **GET** /blue/rest/organizations/{organization}/users/ | 
*OAIBlueOceanApi* | [**postPipelineRun**](docs/OAIBlueOceanApi.md#postpipelinerun) | **POST** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/replay | 
*OAIBlueOceanApi* | [**postPipelineRuns**](docs/OAIBlueOceanApi.md#postpipelineruns) | **POST** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs | 
*OAIBlueOceanApi* | [**putPipelineFavorite**](docs/OAIBlueOceanApi.md#putpipelinefavorite) | **PUT** /blue/rest/organizations/{organization}/pipelines/{pipeline}/favorite | 
*OAIBlueOceanApi* | [**putPipelineRun**](docs/OAIBlueOceanApi.md#putpipelinerun) | **PUT** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/stop | 
*OAIBlueOceanApi* | [**search**](docs/OAIBlueOceanApi.md#search) | **GET** /blue/rest/search/ | 
*OAIBlueOceanApi* | [**searchClasses**](docs/OAIBlueOceanApi.md#searchclasses) | **GET** /blue/rest/classes/ | 
*OAIRemoteAccessApi* | [**getComputer**](docs/OAIRemoteAccessApi.md#getcomputer) | **GET** /computer/api/json | 
*OAIRemoteAccessApi* | [**getJenkins**](docs/OAIRemoteAccessApi.md#getjenkins) | **GET** /api/json | 
*OAIRemoteAccessApi* | [**getJob**](docs/OAIRemoteAccessApi.md#getjob) | **GET** /job/{name}/api/json | 
*OAIRemoteAccessApi* | [**getJobConfig**](docs/OAIRemoteAccessApi.md#getjobconfig) | **GET** /job/{name}/config.xml | 
*OAIRemoteAccessApi* | [**getJobLastBuild**](docs/OAIRemoteAccessApi.md#getjoblastbuild) | **GET** /job/{name}/lastBuild/api/json | 
*OAIRemoteAccessApi* | [**getJobProgressiveText**](docs/OAIRemoteAccessApi.md#getjobprogressivetext) | **GET** /job/{name}/{number}/logText/progressiveText | 
*OAIRemoteAccessApi* | [**getQueue**](docs/OAIRemoteAccessApi.md#getqueue) | **GET** /queue/api/json | 
*OAIRemoteAccessApi* | [**getQueueItem**](docs/OAIRemoteAccessApi.md#getqueueitem) | **GET** /queue/item/{number}/api/json | 
*OAIRemoteAccessApi* | [**getView**](docs/OAIRemoteAccessApi.md#getview) | **GET** /view/{name}/api/json | 
*OAIRemoteAccessApi* | [**getViewConfig**](docs/OAIRemoteAccessApi.md#getviewconfig) | **GET** /view/{name}/config.xml | 
*OAIRemoteAccessApi* | [**headJenkins**](docs/OAIRemoteAccessApi.md#headjenkins) | **HEAD** /api/json | 
*OAIRemoteAccessApi* | [**postCreateItem**](docs/OAIRemoteAccessApi.md#postcreateitem) | **POST** /createItem | 
*OAIRemoteAccessApi* | [**postCreateView**](docs/OAIRemoteAccessApi.md#postcreateview) | **POST** /createView | 
*OAIRemoteAccessApi* | [**postJobBuild**](docs/OAIRemoteAccessApi.md#postjobbuild) | **POST** /job/{name}/build | 
*OAIRemoteAccessApi* | [**postJobConfig**](docs/OAIRemoteAccessApi.md#postjobconfig) | **POST** /job/{name}/config.xml | 
*OAIRemoteAccessApi* | [**postJobDelete**](docs/OAIRemoteAccessApi.md#postjobdelete) | **POST** /job/{name}/doDelete | 
*OAIRemoteAccessApi* | [**postJobDisable**](docs/OAIRemoteAccessApi.md#postjobdisable) | **POST** /job/{name}/disable | 
*OAIRemoteAccessApi* | [**postJobEnable**](docs/OAIRemoteAccessApi.md#postjobenable) | **POST** /job/{name}/enable | 
*OAIRemoteAccessApi* | [**postJobLastBuildStop**](docs/OAIRemoteAccessApi.md#postjoblastbuildstop) | **POST** /job/{name}/lastBuild/stop | 
*OAIRemoteAccessApi* | [**postViewConfig**](docs/OAIRemoteAccessApi.md#postviewconfig) | **POST** /view/{name}/config.xml | 


## Documentation For Models

 - [OAIAllView](docs/OAIAllView.md)
 - [OAIBranchImpl](docs/OAIBranchImpl.md)
 - [OAIBranchImpllinks](docs/OAIBranchImpllinks.md)
 - [OAIBranchImplpermissions](docs/OAIBranchImplpermissions.md)
 - [OAICauseAction](docs/OAICauseAction.md)
 - [OAICauseUserIdCause](docs/OAICauseUserIdCause.md)
 - [OAIClassesByClass](docs/OAIClassesByClass.md)
 - [OAIClockDifference](docs/OAIClockDifference.md)
 - [OAIComputerSet](docs/OAIComputerSet.md)
 - [OAIDefaultCrumbIssuer](docs/OAIDefaultCrumbIssuer.md)
 - [OAIDiskSpaceMonitorDescriptorDiskSpace](docs/OAIDiskSpaceMonitorDescriptorDiskSpace.md)
 - [OAIEmptyChangeLogSet](docs/OAIEmptyChangeLogSet.md)
 - [OAIExtensionClassContainerImpl1](docs/OAIExtensionClassContainerImpl1.md)
 - [OAIExtensionClassContainerImpl1links](docs/OAIExtensionClassContainerImpl1links.md)
 - [OAIExtensionClassContainerImpl1map](docs/OAIExtensionClassContainerImpl1map.md)
 - [OAIExtensionClassImpl](docs/OAIExtensionClassImpl.md)
 - [OAIExtensionClassImpllinks](docs/OAIExtensionClassImpllinks.md)
 - [OAIFavoriteImpl](docs/OAIFavoriteImpl.md)
 - [OAIFavoriteImpllinks](docs/OAIFavoriteImpllinks.md)
 - [OAIFreeStyleBuild](docs/OAIFreeStyleBuild.md)
 - [OAIFreeStyleProject](docs/OAIFreeStyleProject.md)
 - [OAIFreeStyleProjectactions](docs/OAIFreeStyleProjectactions.md)
 - [OAIFreeStyleProjecthealthReport](docs/OAIFreeStyleProjecthealthReport.md)
 - [OAIGenericResource](docs/OAIGenericResource.md)
 - [OAIGithubContent](docs/OAIGithubContent.md)
 - [OAIGithubFile](docs/OAIGithubFile.md)
 - [OAIGithubOrganization](docs/OAIGithubOrganization.md)
 - [OAIGithubOrganizationlinks](docs/OAIGithubOrganizationlinks.md)
 - [OAIGithubRepositories](docs/OAIGithubRepositories.md)
 - [OAIGithubRepositorieslinks](docs/OAIGithubRepositorieslinks.md)
 - [OAIGithubRepository](docs/OAIGithubRepository.md)
 - [OAIGithubRepositorylinks](docs/OAIGithubRepositorylinks.md)
 - [OAIGithubRepositorypermissions](docs/OAIGithubRepositorypermissions.md)
 - [OAIGithubRespositoryContainer](docs/OAIGithubRespositoryContainer.md)
 - [OAIGithubRespositoryContainerlinks](docs/OAIGithubRespositoryContainerlinks.md)
 - [OAIGithubScm](docs/OAIGithubScm.md)
 - [OAIGithubScmlinks](docs/OAIGithubScmlinks.md)
 - [OAIHudson](docs/OAIHudson.md)
 - [OAIHudsonMasterComputer](docs/OAIHudsonMasterComputer.md)
 - [OAIHudsonMasterComputerexecutors](docs/OAIHudsonMasterComputerexecutors.md)
 - [OAIHudsonMasterComputermonitorData](docs/OAIHudsonMasterComputermonitorData.md)
 - [OAIHudsonassignedLabels](docs/OAIHudsonassignedLabels.md)
 - [OAIInputStepImpl](docs/OAIInputStepImpl.md)
 - [OAIInputStepImpllinks](docs/OAIInputStepImpllinks.md)
 - [OAILabel1](docs/OAILabel1.md)
 - [OAILink](docs/OAILink.md)
 - [OAIListView](docs/OAIListView.md)
 - [OAIMultibranchPipeline](docs/OAIMultibranchPipeline.md)
 - [OAINullSCM](docs/OAINullSCM.md)
 - [OAIOrganisation](docs/OAIOrganisation.md)
 - [OAIPipeline](docs/OAIPipeline.md)
 - [OAIPipelineActivity](docs/OAIPipelineActivity.md)
 - [OAIPipelineActivityartifacts](docs/OAIPipelineActivityartifacts.md)
 - [OAIPipelineBranchesitem](docs/OAIPipelineBranchesitem.md)
 - [OAIPipelineBranchesitemlatestRun](docs/OAIPipelineBranchesitemlatestRun.md)
 - [OAIPipelineBranchesitempullRequest](docs/OAIPipelineBranchesitempullRequest.md)
 - [OAIPipelineBranchesitempullRequestlinks](docs/OAIPipelineBranchesitempullRequestlinks.md)
 - [OAIPipelineFolderImpl](docs/OAIPipelineFolderImpl.md)
 - [OAIPipelineImpl](docs/OAIPipelineImpl.md)
 - [OAIPipelineImpllinks](docs/OAIPipelineImpllinks.md)
 - [OAIPipelineRun](docs/OAIPipelineRun.md)
 - [OAIPipelineRunImpl](docs/OAIPipelineRunImpl.md)
 - [OAIPipelineRunImpllinks](docs/OAIPipelineRunImpllinks.md)
 - [OAIPipelineRunNode](docs/OAIPipelineRunNode.md)
 - [OAIPipelineRunNodeedges](docs/OAIPipelineRunNodeedges.md)
 - [OAIPipelineRunartifacts](docs/OAIPipelineRunartifacts.md)
 - [OAIPipelineStepImpl](docs/OAIPipelineStepImpl.md)
 - [OAIPipelineStepImpllinks](docs/OAIPipelineStepImpllinks.md)
 - [OAIPipelinelatestRun](docs/OAIPipelinelatestRun.md)
 - [OAIPipelinelatestRunartifacts](docs/OAIPipelinelatestRunartifacts.md)
 - [OAIQueue](docs/OAIQueue.md)
 - [OAIQueueBlockedItem](docs/OAIQueueBlockedItem.md)
 - [OAIQueueItemImpl](docs/OAIQueueItemImpl.md)
 - [OAIQueueLeftItem](docs/OAIQueueLeftItem.md)
 - [OAIResponseTimeMonitorData](docs/OAIResponseTimeMonitorData.md)
 - [OAIStringParameterDefinition](docs/OAIStringParameterDefinition.md)
 - [OAIStringParameterValue](docs/OAIStringParameterValue.md)
 - [OAISwapSpaceMonitorMemoryUsage2](docs/OAISwapSpaceMonitorMemoryUsage2.md)
 - [OAIUnlabeledLoadStatistics](docs/OAIUnlabeledLoadStatistics.md)
 - [OAIUser](docs/OAIUser.md)


## Documentation For Authorization


## jenkins_auth

- **Type**: HTTP basic authentication

## jwt_auth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Author

blah@cliffano.com

