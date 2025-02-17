# swaggyjenkins
Jenkins API clients generated from Swagger / Open API specification

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.5.1-pre.0
- Package version: 1.5.1-pre.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen
For more information, please visit [http://github.com/cliffano/swaggy-jenkins](http://github.com/cliffano/swaggy-jenkins)

## Requirements.

Python >=3.6

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/cliffano/swaggy-jenkins.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/cliffano/swaggy-jenkins.git`)

Then import the package:
```python
import swaggyjenkins
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swaggyjenkins
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python

import time
import swaggyjenkins
from pprint import pprint
from swaggyjenkins.api import base_api
from swaggyjenkins.model.default_crumb_issuer import DefaultCrumbIssuer
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggyjenkins.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: jenkins_auth
configuration = swaggyjenkins.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)


# Enter a context with an instance of the API client
with swaggyjenkins.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = base_api.BaseApi(api_client)

    try:
        api_response = api_instance.get_crumb()
        pprint(api_response)
    except swaggyjenkins.ApiException as e:
        print("Exception when calling BaseApi->get_crumb: %s\n" % e)
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BaseApi* | [**get_crumb**](docs/BaseApi.md#get_crumb) | **GET** /crumbIssuer/api/json | 
*BlueOceanApi* | [**delete_pipeline_queue_item**](docs/BlueOceanApi.md#delete_pipeline_queue_item) | **DELETE** /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue/{queue} | 
*BlueOceanApi* | [**get_authenticated_user**](docs/BlueOceanApi.md#get_authenticated_user) | **GET** /blue/rest/organizations/{organization}/user/ | 
*BlueOceanApi* | [**get_classes**](docs/BlueOceanApi.md#get_classes) | **GET** /blue/rest/classes/{class} | 
*BlueOceanApi* | [**get_json_web_key**](docs/BlueOceanApi.md#get_json_web_key) | **GET** /jwt-auth/jwks/{key} | 
*BlueOceanApi* | [**get_json_web_token**](docs/BlueOceanApi.md#get_json_web_token) | **GET** /jwt-auth/token | 
*BlueOceanApi* | [**get_organisation**](docs/BlueOceanApi.md#get_organisation) | **GET** /blue/rest/organizations/{organization} | 
*BlueOceanApi* | [**get_organisations**](docs/BlueOceanApi.md#get_organisations) | **GET** /blue/rest/organizations/ | 
*BlueOceanApi* | [**get_pipeline**](docs/BlueOceanApi.md#get_pipeline) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline} | 
*BlueOceanApi* | [**get_pipeline_activities**](docs/BlueOceanApi.md#get_pipeline_activities) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/activities | 
*BlueOceanApi* | [**get_pipeline_branch**](docs/BlueOceanApi.md#get_pipeline_branch) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/ | 
*BlueOceanApi* | [**get_pipeline_branch_run**](docs/BlueOceanApi.md#get_pipeline_branch_run) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/runs/{run} | 
*BlueOceanApi* | [**get_pipeline_branches**](docs/BlueOceanApi.md#get_pipeline_branches) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches | 
*BlueOceanApi* | [**get_pipeline_folder**](docs/BlueOceanApi.md#get_pipeline_folder) | **GET** /blue/rest/organizations/{organization}/pipelines/{folder}/ | 
*BlueOceanApi* | [**get_pipeline_folder_pipeline**](docs/BlueOceanApi.md#get_pipeline_folder_pipeline) | **GET** /blue/rest/organizations/{organization}/pipelines/{folder}/pipelines/{pipeline} | 
*BlueOceanApi* | [**get_pipeline_queue**](docs/BlueOceanApi.md#get_pipeline_queue) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue | 
*BlueOceanApi* | [**get_pipeline_run**](docs/BlueOceanApi.md#get_pipeline_run) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run} | 
*BlueOceanApi* | [**get_pipeline_run_log**](docs/BlueOceanApi.md#get_pipeline_run_log) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/log | 
*BlueOceanApi* | [**get_pipeline_run_node**](docs/BlueOceanApi.md#get_pipeline_run_node) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node} | 
*BlueOceanApi* | [**get_pipeline_run_node_step**](docs/BlueOceanApi.md#get_pipeline_run_node_step) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step} | 
*BlueOceanApi* | [**get_pipeline_run_node_step_log**](docs/BlueOceanApi.md#get_pipeline_run_node_step_log) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}/log | 
*BlueOceanApi* | [**get_pipeline_run_node_steps**](docs/BlueOceanApi.md#get_pipeline_run_node_steps) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps | 
*BlueOceanApi* | [**get_pipeline_run_nodes**](docs/BlueOceanApi.md#get_pipeline_run_nodes) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes | 
*BlueOceanApi* | [**get_pipeline_runs**](docs/BlueOceanApi.md#get_pipeline_runs) | **GET** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs | 
*BlueOceanApi* | [**get_pipelines**](docs/BlueOceanApi.md#get_pipelines) | **GET** /blue/rest/organizations/{organization}/pipelines/ | 
*BlueOceanApi* | [**get_scm**](docs/BlueOceanApi.md#get_scm) | **GET** /blue/rest/organizations/{organization}/scm/{scm} | 
*BlueOceanApi* | [**get_scm_organisation_repositories**](docs/BlueOceanApi.md#get_scm_organisation_repositories) | **GET** /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories | 
*BlueOceanApi* | [**get_scm_organisation_repository**](docs/BlueOceanApi.md#get_scm_organisation_repository) | **GET** /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories/{repository} | 
*BlueOceanApi* | [**get_scm_organisations**](docs/BlueOceanApi.md#get_scm_organisations) | **GET** /blue/rest/organizations/{organization}/scm/{scm}/organizations | 
*BlueOceanApi* | [**get_user**](docs/BlueOceanApi.md#get_user) | **GET** /blue/rest/organizations/{organization}/users/{user} | 
*BlueOceanApi* | [**get_user_favorites**](docs/BlueOceanApi.md#get_user_favorites) | **GET** /blue/rest/users/{user}/favorites | 
*BlueOceanApi* | [**get_users**](docs/BlueOceanApi.md#get_users) | **GET** /blue/rest/organizations/{organization}/users/ | 
*BlueOceanApi* | [**post_pipeline_run**](docs/BlueOceanApi.md#post_pipeline_run) | **POST** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/replay | 
*BlueOceanApi* | [**post_pipeline_runs**](docs/BlueOceanApi.md#post_pipeline_runs) | **POST** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs | 
*BlueOceanApi* | [**put_pipeline_favorite**](docs/BlueOceanApi.md#put_pipeline_favorite) | **PUT** /blue/rest/organizations/{organization}/pipelines/{pipeline}/favorite | 
*BlueOceanApi* | [**put_pipeline_run**](docs/BlueOceanApi.md#put_pipeline_run) | **PUT** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/stop | 
*BlueOceanApi* | [**search**](docs/BlueOceanApi.md#search) | **GET** /blue/rest/search/ | 
*BlueOceanApi* | [**search_classes**](docs/BlueOceanApi.md#search_classes) | **GET** /blue/rest/classes/ | 
*RemoteAccessApi* | [**get_computer**](docs/RemoteAccessApi.md#get_computer) | **GET** /computer/api/json | 
*RemoteAccessApi* | [**get_jenkins**](docs/RemoteAccessApi.md#get_jenkins) | **GET** /api/json | 
*RemoteAccessApi* | [**get_job**](docs/RemoteAccessApi.md#get_job) | **GET** /job/{name}/api/json | 
*RemoteAccessApi* | [**get_job_config**](docs/RemoteAccessApi.md#get_job_config) | **GET** /job/{name}/config.xml | 
*RemoteAccessApi* | [**get_job_last_build**](docs/RemoteAccessApi.md#get_job_last_build) | **GET** /job/{name}/lastBuild/api/json | 
*RemoteAccessApi* | [**get_job_progressive_text**](docs/RemoteAccessApi.md#get_job_progressive_text) | **GET** /job/{name}/{number}/logText/progressiveText | 
*RemoteAccessApi* | [**get_queue**](docs/RemoteAccessApi.md#get_queue) | **GET** /queue/api/json | 
*RemoteAccessApi* | [**get_queue_item**](docs/RemoteAccessApi.md#get_queue_item) | **GET** /queue/item/{number}/api/json | 
*RemoteAccessApi* | [**get_view**](docs/RemoteAccessApi.md#get_view) | **GET** /view/{name}/api/json | 
*RemoteAccessApi* | [**get_view_config**](docs/RemoteAccessApi.md#get_view_config) | **GET** /view/{name}/config.xml | 
*RemoteAccessApi* | [**head_jenkins**](docs/RemoteAccessApi.md#head_jenkins) | **HEAD** /api/json | 
*RemoteAccessApi* | [**post_create_item**](docs/RemoteAccessApi.md#post_create_item) | **POST** /createItem | 
*RemoteAccessApi* | [**post_create_view**](docs/RemoteAccessApi.md#post_create_view) | **POST** /createView | 
*RemoteAccessApi* | [**post_job_build**](docs/RemoteAccessApi.md#post_job_build) | **POST** /job/{name}/build | 
*RemoteAccessApi* | [**post_job_config**](docs/RemoteAccessApi.md#post_job_config) | **POST** /job/{name}/config.xml | 
*RemoteAccessApi* | [**post_job_delete**](docs/RemoteAccessApi.md#post_job_delete) | **POST** /job/{name}/doDelete | 
*RemoteAccessApi* | [**post_job_disable**](docs/RemoteAccessApi.md#post_job_disable) | **POST** /job/{name}/disable | 
*RemoteAccessApi* | [**post_job_enable**](docs/RemoteAccessApi.md#post_job_enable) | **POST** /job/{name}/enable | 
*RemoteAccessApi* | [**post_job_last_build_stop**](docs/RemoteAccessApi.md#post_job_last_build_stop) | **POST** /job/{name}/lastBuild/stop | 
*RemoteAccessApi* | [**post_view_config**](docs/RemoteAccessApi.md#post_view_config) | **POST** /view/{name}/config.xml | 


## Documentation For Models

 - [AllView](docs/AllView.md)
 - [BranchImpl](docs/BranchImpl.md)
 - [BranchImpllinks](docs/BranchImpllinks.md)
 - [BranchImplpermissions](docs/BranchImplpermissions.md)
 - [CauseAction](docs/CauseAction.md)
 - [CauseUserIdCause](docs/CauseUserIdCause.md)
 - [ClassesByClass](docs/ClassesByClass.md)
 - [ClockDifference](docs/ClockDifference.md)
 - [ComputerSet](docs/ComputerSet.md)
 - [DefaultCrumbIssuer](docs/DefaultCrumbIssuer.md)
 - [DiskSpaceMonitorDescriptorDiskSpace](docs/DiskSpaceMonitorDescriptorDiskSpace.md)
 - [EmptyChangeLogSet](docs/EmptyChangeLogSet.md)
 - [ExtensionClassContainerImpl1](docs/ExtensionClassContainerImpl1.md)
 - [ExtensionClassContainerImpl1links](docs/ExtensionClassContainerImpl1links.md)
 - [ExtensionClassContainerImpl1map](docs/ExtensionClassContainerImpl1map.md)
 - [ExtensionClassImpl](docs/ExtensionClassImpl.md)
 - [ExtensionClassImpllinks](docs/ExtensionClassImpllinks.md)
 - [FavoriteImpl](docs/FavoriteImpl.md)
 - [FavoriteImpllinks](docs/FavoriteImpllinks.md)
 - [FreeStyleBuild](docs/FreeStyleBuild.md)
 - [FreeStyleProject](docs/FreeStyleProject.md)
 - [FreeStyleProjectactions](docs/FreeStyleProjectactions.md)
 - [FreeStyleProjecthealthReport](docs/FreeStyleProjecthealthReport.md)
 - [GenericResource](docs/GenericResource.md)
 - [GithubContent](docs/GithubContent.md)
 - [GithubFile](docs/GithubFile.md)
 - [GithubOrganization](docs/GithubOrganization.md)
 - [GithubOrganizationlinks](docs/GithubOrganizationlinks.md)
 - [GithubRepositories](docs/GithubRepositories.md)
 - [GithubRepositorieslinks](docs/GithubRepositorieslinks.md)
 - [GithubRepository](docs/GithubRepository.md)
 - [GithubRepositorylinks](docs/GithubRepositorylinks.md)
 - [GithubRepositorypermissions](docs/GithubRepositorypermissions.md)
 - [GithubRespositoryContainer](docs/GithubRespositoryContainer.md)
 - [GithubRespositoryContainerlinks](docs/GithubRespositoryContainerlinks.md)
 - [GithubScm](docs/GithubScm.md)
 - [GithubScmlinks](docs/GithubScmlinks.md)
 - [Hudson](docs/Hudson.md)
 - [HudsonMasterComputer](docs/HudsonMasterComputer.md)
 - [HudsonMasterComputerexecutors](docs/HudsonMasterComputerexecutors.md)
 - [HudsonMasterComputermonitorData](docs/HudsonMasterComputermonitorData.md)
 - [HudsonassignedLabels](docs/HudsonassignedLabels.md)
 - [InputStepImpl](docs/InputStepImpl.md)
 - [InputStepImpllinks](docs/InputStepImpllinks.md)
 - [Label1](docs/Label1.md)
 - [Link](docs/Link.md)
 - [ListView](docs/ListView.md)
 - [MultibranchPipeline](docs/MultibranchPipeline.md)
 - [NullSCM](docs/NullSCM.md)
 - [Organisation](docs/Organisation.md)
 - [Organisations](docs/Organisations.md)
 - [Pipeline](docs/Pipeline.md)
 - [PipelineActivities](docs/PipelineActivities.md)
 - [PipelineActivity](docs/PipelineActivity.md)
 - [PipelineActivityartifacts](docs/PipelineActivityartifacts.md)
 - [PipelineBranches](docs/PipelineBranches.md)
 - [PipelineBranchesitem](docs/PipelineBranchesitem.md)
 - [PipelineBranchesitemlatestRun](docs/PipelineBranchesitemlatestRun.md)
 - [PipelineBranchesitempullRequest](docs/PipelineBranchesitempullRequest.md)
 - [PipelineBranchesitempullRequestlinks](docs/PipelineBranchesitempullRequestlinks.md)
 - [PipelineFolderImpl](docs/PipelineFolderImpl.md)
 - [PipelineImpl](docs/PipelineImpl.md)
 - [PipelineImpllinks](docs/PipelineImpllinks.md)
 - [PipelineQueue](docs/PipelineQueue.md)
 - [PipelineRun](docs/PipelineRun.md)
 - [PipelineRunImpl](docs/PipelineRunImpl.md)
 - [PipelineRunImpllinks](docs/PipelineRunImpllinks.md)
 - [PipelineRunNode](docs/PipelineRunNode.md)
 - [PipelineRunNodeSteps](docs/PipelineRunNodeSteps.md)
 - [PipelineRunNodeedges](docs/PipelineRunNodeedges.md)
 - [PipelineRunNodes](docs/PipelineRunNodes.md)
 - [PipelineRunSteps](docs/PipelineRunSteps.md)
 - [PipelineRunartifacts](docs/PipelineRunartifacts.md)
 - [PipelineRuns](docs/PipelineRuns.md)
 - [PipelineStepImpl](docs/PipelineStepImpl.md)
 - [PipelineStepImpllinks](docs/PipelineStepImpllinks.md)
 - [PipelinelatestRun](docs/PipelinelatestRun.md)
 - [PipelinelatestRunartifacts](docs/PipelinelatestRunartifacts.md)
 - [Pipelines](docs/Pipelines.md)
 - [Queue](docs/Queue.md)
 - [QueueBlockedItem](docs/QueueBlockedItem.md)
 - [QueueItemImpl](docs/QueueItemImpl.md)
 - [QueueLeftItem](docs/QueueLeftItem.md)
 - [ResponseTimeMonitorData](docs/ResponseTimeMonitorData.md)
 - [ScmOrganisations](docs/ScmOrganisations.md)
 - [StringParameterDefinition](docs/StringParameterDefinition.md)
 - [StringParameterValue](docs/StringParameterValue.md)
 - [SwapSpaceMonitorMemoryUsage2](docs/SwapSpaceMonitorMemoryUsage2.md)
 - [UnlabeledLoadStatistics](docs/UnlabeledLoadStatistics.md)
 - [User](docs/User.md)
 - [UserFavorites](docs/UserFavorites.md)
 - [Users](docs/Users.md)


## Documentation For Authorization


## jenkins_auth

- **Type**: HTTP basic authentication


## jwt_auth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Author

blah@cliffano.com


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in swaggyjenkins.apis and swaggyjenkins.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from swaggyjenkins.api.default_api import DefaultApi`
- `from swaggyjenkins.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import swaggyjenkins
from swaggyjenkins.apis import *
from swaggyjenkins.models import *
```

