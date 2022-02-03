# BLUEOCEAN_API

All URIs are relative to *http://localhost*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**authenticated_user**](BLUEOCEAN_API.md#authenticated_user) | **Get** /blue/rest/organizations/{organization}/user/ | 
[**classes**](BLUEOCEAN_API.md#classes) | **Get** /blue/rest/classes/{class} | 
[**delete_pipeline_queue_item**](BLUEOCEAN_API.md#delete_pipeline_queue_item) | **Delete** /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue/{queue} | 
[**json_web_key**](BLUEOCEAN_API.md#json_web_key) | **Get** /jwt-auth/jwks/{key} | 
[**json_web_token**](BLUEOCEAN_API.md#json_web_token) | **Get** /jwt-auth/token | 
[**organisation**](BLUEOCEAN_API.md#organisation) | **Get** /blue/rest/organizations/{organization} | 
[**organisations**](BLUEOCEAN_API.md#organisations) | **Get** /blue/rest/organizations/ | 
[**pipeline**](BLUEOCEAN_API.md#pipeline) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline} | 
[**pipeline_activities**](BLUEOCEAN_API.md#pipeline_activities) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/activities | 
[**pipeline_branch**](BLUEOCEAN_API.md#pipeline_branch) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/ | 
[**pipeline_branch_run**](BLUEOCEAN_API.md#pipeline_branch_run) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/runs/{run} | 
[**pipeline_branches**](BLUEOCEAN_API.md#pipeline_branches) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches | 
[**pipeline_folder**](BLUEOCEAN_API.md#pipeline_folder) | **Get** /blue/rest/organizations/{organization}/pipelines/{folder}/ | 
[**pipeline_folder_pipeline**](BLUEOCEAN_API.md#pipeline_folder_pipeline) | **Get** /blue/rest/organizations/{organization}/pipelines/{folder}/pipelines/{pipeline} | 
[**pipeline_queue**](BLUEOCEAN_API.md#pipeline_queue) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue | 
[**pipeline_run**](BLUEOCEAN_API.md#pipeline_run) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run} | 
[**pipeline_run_log**](BLUEOCEAN_API.md#pipeline_run_log) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/log | 
[**pipeline_run_node**](BLUEOCEAN_API.md#pipeline_run_node) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node} | 
[**pipeline_run_node_step**](BLUEOCEAN_API.md#pipeline_run_node_step) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step} | 
[**pipeline_run_node_step_log**](BLUEOCEAN_API.md#pipeline_run_node_step_log) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}/log | 
[**pipeline_run_node_steps**](BLUEOCEAN_API.md#pipeline_run_node_steps) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps | 
[**pipeline_run_nodes**](BLUEOCEAN_API.md#pipeline_run_nodes) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes | 
[**pipeline_runs**](BLUEOCEAN_API.md#pipeline_runs) | **Get** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs | 
[**pipelines**](BLUEOCEAN_API.md#pipelines) | **Get** /blue/rest/organizations/{organization}/pipelines/ | 
[**post_pipeline_run**](BLUEOCEAN_API.md#post_pipeline_run) | **Post** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/replay | 
[**post_pipeline_runs**](BLUEOCEAN_API.md#post_pipeline_runs) | **Post** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs | 
[**put_pipeline_favorite**](BLUEOCEAN_API.md#put_pipeline_favorite) | **Put** /blue/rest/organizations/{organization}/pipelines/{pipeline}/favorite | 
[**put_pipeline_run**](BLUEOCEAN_API.md#put_pipeline_run) | **Put** /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/stop | 
[**sc_m**](BLUEOCEAN_API.md#sc_m) | **Get** /blue/rest/organizations/{organization}/scm/{scm} | 
[**sc_morganisation_repositories**](BLUEOCEAN_API.md#sc_morganisation_repositories) | **Get** /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories | 
[**sc_morganisation_repository**](BLUEOCEAN_API.md#sc_morganisation_repository) | **Get** /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories/{repository} | 
[**sc_morganisations**](BLUEOCEAN_API.md#sc_morganisations) | **Get** /blue/rest/organizations/{organization}/scm/{scm}/organizations | 
[**search**](BLUEOCEAN_API.md#search) | **Get** /blue/rest/search/ | 
[**search_classes**](BLUEOCEAN_API.md#search_classes) | **Get** /blue/rest/classes/ | 
[**user**](BLUEOCEAN_API.md#user) | **Get** /blue/rest/organizations/{organization}/users/{user} | 
[**user_favorites**](BLUEOCEAN_API.md#user_favorites) | **Get** /blue/rest/users/{user}/favorites | 
[**users**](BLUEOCEAN_API.md#users) | **Get** /blue/rest/organizations/{organization}/users/ | 


# **authenticated_user**
> authenticated_user (organization: STRING_32 ): detachable USER




Retrieve authenticated user details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]

### Return type

[**USER**](User.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **classes**
> classes (var_class: STRING_32 ): detachable STRING_32




Get a list of class names supported by a given class


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **var_class** | **STRING_32**| Name of the class | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_pipeline_queue_item**
> delete_pipeline_queue_item (organization: STRING_32 ; pipeline: STRING_32 ; queue: STRING_32 )




Delete queue item from an organization pipeline queue


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **queue** | **STRING_32**| Name of the queue item | [default to null]

### Return type

{empty response body)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **json_web_key**
> json_web_key (key: INTEGER_32 ): detachable STRING_32




Retrieve JSON Web Key


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **INTEGER_32**| Key ID received as part of JWT header field kid | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **json_web_token**
> json_web_token (expiry_time_in_mins:  detachable INTEGER_32 ; max_expiry_time_in_mins:  detachable INTEGER_32 ): detachable STRING_32




Retrieve JSON Web Token


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiry_time_in_mins** | **INTEGER_32**| Token expiry time in minutes, default: 30 minutes | [optional] [default to null]
 **max_expiry_time_in_mins** | **INTEGER_32**| Maximum token expiry time in minutes, default: 480 minutes | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **organisation**
> organisation (organization: STRING_32 ): detachable ORGANISATION




Retrieve organization details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]

### Return type

[**ORGANISATION**](Organisation.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **organisations**
> organisations : detachable LIST [ORGANISATION]




Retrieve all organizations details


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [ORGANISATION]**](Organisation.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline**
> pipeline (organization: STRING_32 ; pipeline: STRING_32 ): detachable PIPELINE




Retrieve pipeline details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]

### Return type

[**PIPELINE**](Pipeline.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_activities**
> pipeline_activities (organization: STRING_32 ; pipeline: STRING_32 ): detachable LIST [PIPELINE_ACTIVITY]




Retrieve all activities details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]

### Return type

[**LIST [PIPELINE_ACTIVITY]**](PipelineActivity.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_branch**
> pipeline_branch (organization: STRING_32 ; pipeline: STRING_32 ; branch: STRING_32 ): detachable BRANCH_IMPL




Retrieve branch details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **branch** | **STRING_32**| Name of the branch | [default to null]

### Return type

[**BRANCH_IMPL**](BranchImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_branch_run**
> pipeline_branch_run (organization: STRING_32 ; pipeline: STRING_32 ; branch: STRING_32 ; run: STRING_32 ): detachable PIPELINE_RUN




Retrieve branch run details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **branch** | **STRING_32**| Name of the branch | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]

### Return type

[**PIPELINE_RUN**](PipelineRun.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_branches**
> pipeline_branches (organization: STRING_32 ; pipeline: STRING_32 ): detachable MULTIBRANCH_PIPELINE




Retrieve all branches details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]

### Return type

[**MULTIBRANCH_PIPELINE**](MultibranchPipeline.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_folder**
> pipeline_folder (organization: STRING_32 ; folder: STRING_32 ): detachable PIPELINE_FOLDER_IMPL




Retrieve pipeline folder for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **folder** | **STRING_32**| Name of the folder | [default to null]

### Return type

[**PIPELINE_FOLDER_IMPL**](PipelineFolderImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_folder_pipeline**
> pipeline_folder_pipeline (organization: STRING_32 ; pipeline: STRING_32 ; folder: STRING_32 ): detachable PIPELINE_IMPL




Retrieve pipeline details for an organization folder


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **folder** | **STRING_32**| Name of the folder | [default to null]

### Return type

[**PIPELINE_IMPL**](PipelineImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_queue**
> pipeline_queue (organization: STRING_32 ; pipeline: STRING_32 ): detachable LIST [QUEUE_ITEM_IMPL]




Retrieve queue details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]

### Return type

[**LIST [QUEUE_ITEM_IMPL]**](QueueItemImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_run**
> pipeline_run (organization: STRING_32 ; pipeline: STRING_32 ; run: STRING_32 ): detachable PIPELINE_RUN




Retrieve run details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]

### Return type

[**PIPELINE_RUN**](PipelineRun.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_run_log**
> pipeline_run_log (organization: STRING_32 ; pipeline: STRING_32 ; run: STRING_32 ; start:  detachable INTEGER_32 ; download:  detachable BOOLEAN ): detachable STRING_32




Get log for a pipeline run


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]
 **start** | **INTEGER_32**| Start position of the log | [optional] [default to null]
 **download** | **BOOLEAN**| Set to true in order to download the file, otherwise it&#39;s passed as a response body | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_run_node**
> pipeline_run_node (organization: STRING_32 ; pipeline: STRING_32 ; run: STRING_32 ; node: STRING_32 ): detachable PIPELINE_RUN_NODE




Retrieve run node details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]
 **node** | **STRING_32**| Name of the node | [default to null]

### Return type

[**PIPELINE_RUN_NODE**](PipelineRunNode.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_run_node_step**
> pipeline_run_node_step (organization: STRING_32 ; pipeline: STRING_32 ; run: STRING_32 ; node: STRING_32 ; step: STRING_32 ): detachable PIPELINE_STEP_IMPL




Retrieve run node details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]
 **node** | **STRING_32**| Name of the node | [default to null]
 **step** | **STRING_32**| Name of the step | [default to null]

### Return type

[**PIPELINE_STEP_IMPL**](PipelineStepImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_run_node_step_log**
> pipeline_run_node_step_log (organization: STRING_32 ; pipeline: STRING_32 ; run: STRING_32 ; node: STRING_32 ; step: STRING_32 ): detachable STRING_32




Get log for a pipeline run node step


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]
 **node** | **STRING_32**| Name of the node | [default to null]
 **step** | **STRING_32**| Name of the step | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_run_node_steps**
> pipeline_run_node_steps (organization: STRING_32 ; pipeline: STRING_32 ; run: STRING_32 ; node: STRING_32 ): detachable LIST [PIPELINE_STEP_IMPL]




Retrieve run node steps details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]
 **node** | **STRING_32**| Name of the node | [default to null]

### Return type

[**LIST [PIPELINE_STEP_IMPL]**](PipelineStepImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_run_nodes**
> pipeline_run_nodes (organization: STRING_32 ; pipeline: STRING_32 ; run: STRING_32 ): detachable LIST [PIPELINE_RUN_NODE]




Retrieve run nodes details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]

### Return type

[**LIST [PIPELINE_RUN_NODE]**](PipelineRunNode.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline_runs**
> pipeline_runs (organization: STRING_32 ; pipeline: STRING_32 ): detachable LIST [PIPELINE_RUN]




Retrieve all runs details for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]

### Return type

[**LIST [PIPELINE_RUN]**](PipelineRun.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipelines**
> pipelines (organization: STRING_32 ): detachable LIST [PIPELINE]




Retrieve all pipelines details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]

### Return type

[**LIST [PIPELINE]**](Pipeline.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_pipeline_run**
> post_pipeline_run (organization: STRING_32 ; pipeline: STRING_32 ; run: STRING_32 ): detachable QUEUE_ITEM_IMPL




Replay an organization pipeline run


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]

### Return type

[**QUEUE_ITEM_IMPL**](QueueItemImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_pipeline_runs**
> post_pipeline_runs (organization: STRING_32 ; pipeline: STRING_32 ): detachable QUEUE_ITEM_IMPL




Start a build for an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]

### Return type

[**QUEUE_ITEM_IMPL**](QueueItemImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_pipeline_favorite**
> put_pipeline_favorite (organization: STRING_32 ; pipeline: STRING_32 ; unknown_base_type: UNKNOWN_BASE_TYPE ): detachable FAVORITE_IMPL




Favorite/unfavorite a pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)| Set JSON string body to {\&quot;favorite\&quot;: true} to favorite, set value to false to unfavorite | 

### Return type

[**FAVORITE_IMPL**](FavoriteImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_pipeline_run**
> put_pipeline_run (organization: STRING_32 ; pipeline: STRING_32 ; run: STRING_32 ; blocking:  detachable STRING_32 ; time_out_in_secs:  detachable INTEGER_32 ): detachable PIPELINE_RUN




Stop a build of an organization pipeline


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **pipeline** | **STRING_32**| Name of the pipeline | [default to null]
 **run** | **STRING_32**| Name of the run | [default to null]
 **blocking** | **STRING_32**| Set to true to make blocking stop, default: false | [optional] [default to null]
 **time_out_in_secs** | **INTEGER_32**| Timeout in seconds, default: 10 seconds | [optional] [default to null]

### Return type

[**PIPELINE_RUN**](PipelineRun.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sc_m**
> sc_m (organization: STRING_32 ; scm: STRING_32 ): detachable GITHUB_SCM




Retrieve SCM details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **scm** | **STRING_32**| Name of SCM | [default to null]

### Return type

[**GITHUB_SCM**](GithubScm.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sc_morganisation_repositories**
> sc_morganisation_repositories (organization: STRING_32 ; scm: STRING_32 ; scm_organisation: STRING_32 ; credential_id:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; page_number:  detachable INTEGER_32 ): detachable LIST [GITHUB_ORGANIZATION]




Retrieve SCM organization repositories details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **scm** | **STRING_32**| Name of SCM | [default to null]
 **scm_organisation** | **STRING_32**| Name of the SCM organization | [default to null]
 **credential_id** | **STRING_32**| Credential ID | [optional] [default to null]
 **page_size** | **INTEGER_32**| Number of items in a page | [optional] [default to null]
 **page_number** | **INTEGER_32**| Page number | [optional] [default to null]

### Return type

[**LIST [GITHUB_ORGANIZATION]**](GithubOrganization.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sc_morganisation_repository**
> sc_morganisation_repository (organization: STRING_32 ; scm: STRING_32 ; scm_organisation: STRING_32 ; repository: STRING_32 ; credential_id:  detachable STRING_32 ): detachable LIST [GITHUB_ORGANIZATION]




Retrieve SCM organization repository details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **scm** | **STRING_32**| Name of SCM | [default to null]
 **scm_organisation** | **STRING_32**| Name of the SCM organization | [default to null]
 **repository** | **STRING_32**| Name of the SCM repository | [default to null]
 **credential_id** | **STRING_32**| Credential ID | [optional] [default to null]

### Return type

[**LIST [GITHUB_ORGANIZATION]**](GithubOrganization.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sc_morganisations**
> sc_morganisations (organization: STRING_32 ; scm: STRING_32 ; credential_id:  detachable STRING_32 ): detachable LIST [GITHUB_ORGANIZATION]




Retrieve SCM organizations details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **scm** | **STRING_32**| Name of SCM | [default to null]
 **credential_id** | **STRING_32**| Credential ID | [optional] [default to null]

### Return type

[**LIST [GITHUB_ORGANIZATION]**](GithubOrganization.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search**
> search (q: STRING_32 ): detachable STRING_32




Search for any resource details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **STRING_32**| Query string | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_classes**
> search_classes (q: STRING_32 ): detachable STRING_32




Get classes details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **STRING_32**| Query string containing an array of class names | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user**
> user (organization: STRING_32 ; user: STRING_32 ): detachable USER




Retrieve user details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]
 **user** | **STRING_32**| Name of the user | [default to null]

### Return type

[**USER**](User.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_favorites**
> user_favorites (user: STRING_32 ): detachable LIST [FAVORITE_IMPL]




Retrieve user favorites details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **STRING_32**| Name of the user | [default to null]

### Return type

[**LIST [FAVORITE_IMPL]**](FavoriteImpl.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users**
> users (organization: STRING_32 ): detachable USER




Retrieve users details for an organization


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Name of the organization | [default to null]

### Return type

[**USER**](User.md)

### Authorization

[jenkins_auth](../README.md#jenkins_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

