=begin
Swaggy Jenkins

Jenkins API clients generated from Swagger / Open API specification

OpenAPI spec version: 1.1.1
Contact: blah@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end
Rails.application.routes.draw do

  def add_openapi_route http_method, path, opts = {}
    full_path = path.gsub(/{(.*?)}/, ':\1')
    match full_path, to: "#{opts.fetch(:controller_name)}##{opts[:action_name]}", via: http_method
  end

  add_openapi_route 'GET', '//crumbIssuer/api/json', controller_name: 'base', action_name: 'get_crumb'
  add_openapi_route 'DELETE', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/queue/{queue}', controller_name: 'blue_ocean', action_name: 'delete_pipeline_queue_item'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/user/', controller_name: 'blue_ocean', action_name: 'get_authenticated_user'
  add_openapi_route 'GET', '//blue/rest/classes/{class}', controller_name: 'blue_ocean', action_name: 'get_classes'
  add_openapi_route 'GET', '//jwt-auth/jwks/{key}', controller_name: 'blue_ocean', action_name: 'get_json_web_key'
  add_openapi_route 'GET', '//jwt-auth/token', controller_name: 'blue_ocean', action_name: 'get_json_web_token'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}', controller_name: 'blue_ocean', action_name: 'get_organisation'
  add_openapi_route 'GET', '//blue/rest/organizations/', controller_name: 'blue_ocean', action_name: 'get_organisations'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}', controller_name: 'blue_ocean', action_name: 'get_pipeline'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/activities', controller_name: 'blue_ocean', action_name: 'get_pipeline_activities'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/', controller_name: 'blue_ocean', action_name: 'get_pipeline_branch'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/runs/{run}', controller_name: 'blue_ocean', action_name: 'get_pipeline_branch_run'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/branches', controller_name: 'blue_ocean', action_name: 'get_pipeline_branches'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{folder}/', controller_name: 'blue_ocean', action_name: 'get_pipeline_folder'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{folder}/pipelines/{pipeline}', controller_name: 'blue_ocean', action_name: 'get_pipeline_folder_pipeline'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/queue', controller_name: 'blue_ocean', action_name: 'get_pipeline_queue'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}', controller_name: 'blue_ocean', action_name: 'get_pipeline_run'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/log', controller_name: 'blue_ocean', action_name: 'get_pipeline_run_log'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}', controller_name: 'blue_ocean', action_name: 'get_pipeline_run_node'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}', controller_name: 'blue_ocean', action_name: 'get_pipeline_run_node_step'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}/log', controller_name: 'blue_ocean', action_name: 'get_pipeline_run_node_step_log'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps', controller_name: 'blue_ocean', action_name: 'get_pipeline_run_node_steps'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes', controller_name: 'blue_ocean', action_name: 'get_pipeline_run_nodes'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs', controller_name: 'blue_ocean', action_name: 'get_pipeline_runs'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/pipelines/', controller_name: 'blue_ocean', action_name: 'get_pipelines'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/scm/{scm}', controller_name: 'blue_ocean', action_name: 'get_scm'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories', controller_name: 'blue_ocean', action_name: 'get_scm_organisation_repositories'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories/{repository}', controller_name: 'blue_ocean', action_name: 'get_scm_organisation_repository'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/scm/{scm}/organizations', controller_name: 'blue_ocean', action_name: 'get_scm_organisations'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/users/{user}', controller_name: 'blue_ocean', action_name: 'get_user'
  add_openapi_route 'GET', '//blue/rest/users/{user}/favorites', controller_name: 'blue_ocean', action_name: 'get_user_favorites'
  add_openapi_route 'GET', '//blue/rest/organizations/{organization}/users/', controller_name: 'blue_ocean', action_name: 'get_users'
  add_openapi_route 'POST', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/replay', controller_name: 'blue_ocean', action_name: 'post_pipeline_run'
  add_openapi_route 'POST', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs', controller_name: 'blue_ocean', action_name: 'post_pipeline_runs'
  add_openapi_route 'PUT', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/favorite', controller_name: 'blue_ocean', action_name: 'put_pipeline_favorite'
  add_openapi_route 'PUT', '//blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/stop', controller_name: 'blue_ocean', action_name: 'put_pipeline_run'
  add_openapi_route 'GET', '//blue/rest/search/', controller_name: 'blue_ocean', action_name: 'search'
  add_openapi_route 'GET', '//blue/rest/classes/', controller_name: 'blue_ocean', action_name: 'search_classes'
  add_openapi_route 'GET', '//computer/api/json', controller_name: 'remote_access', action_name: 'get_computer'
  add_openapi_route 'GET', '//api/json', controller_name: 'remote_access', action_name: 'get_jenkins'
  add_openapi_route 'GET', '//job/{name}/api/json', controller_name: 'remote_access', action_name: 'get_job'
  add_openapi_route 'GET', '//job/{name}/config.xml', controller_name: 'remote_access', action_name: 'get_job_config'
  add_openapi_route 'GET', '//job/{name}/lastBuild/api/json', controller_name: 'remote_access', action_name: 'get_job_last_build'
  add_openapi_route 'GET', '//job/{name}/{number}/logText/progressiveText', controller_name: 'remote_access', action_name: 'get_job_progressive_text'
  add_openapi_route 'GET', '//queue/api/json', controller_name: 'remote_access', action_name: 'get_queue'
  add_openapi_route 'GET', '//queue/item/{number}/api/json', controller_name: 'remote_access', action_name: 'get_queue_item'
  add_openapi_route 'GET', '//view/{name}/api/json', controller_name: 'remote_access', action_name: 'get_view'
  add_openapi_route 'GET', '//view/{name}/config.xml', controller_name: 'remote_access', action_name: 'get_view_config'
  add_openapi_route 'HEAD', '//api/json', controller_name: 'remote_access', action_name: 'head_jenkins'
  add_openapi_route 'POST', '//createItem', controller_name: 'remote_access', action_name: 'post_create_item'
  add_openapi_route 'POST', '//createView', controller_name: 'remote_access', action_name: 'post_create_view'
  add_openapi_route 'POST', '//job/{name}/build', controller_name: 'remote_access', action_name: 'post_job_build'
  add_openapi_route 'POST', '//job/{name}/config.xml', controller_name: 'remote_access', action_name: 'post_job_config'
  add_openapi_route 'POST', '//job/{name}/doDelete', controller_name: 'remote_access', action_name: 'post_job_delete'
  add_openapi_route 'POST', '//job/{name}/disable', controller_name: 'remote_access', action_name: 'post_job_disable'
  add_openapi_route 'POST', '//job/{name}/enable', controller_name: 'remote_access', action_name: 'post_job_enable'
  add_openapi_route 'POST', '//job/{name}/lastBuild/stop', controller_name: 'remote_access', action_name: 'post_job_last_build_stop'
  add_openapi_route 'POST', '//view/{name}/config.xml', controller_name: 'remote_access', action_name: 'post_view_config'
end
