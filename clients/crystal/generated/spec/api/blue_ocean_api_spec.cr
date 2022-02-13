# #Swaggy Jenkins
#
##Jenkins API clients generated from Swagger / Open API specification
#
#The version of the OpenAPI document: 1.1.2-pre.0
#Contact: blah@cliffano.com
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.4.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for ::BlueOceanApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "BlueOceanApi" do
  describe "test an instance of BlueOceanApi" do
    it "should create an instance of BlueOceanApi" do
      api_instance = ::BlueOceanApi.new
      # TODO expect(api_instance).to be_instance_of(::BlueOceanApi)
    end
  end

  # unit tests for delete_pipeline_queue_item
  # Delete queue item from an organization pipeline queue
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param queue Name of the queue item
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe "delete_pipeline_queue_item test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_authenticated_user
  # Retrieve authenticated user details for an organization
  # @param organization Name of the organization
  # @param [Hash] opts the optional parameters
  # @return [User]
  describe "get_authenticated_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_classes
  # Get a list of class names supported by a given class
  # @param _class Name of the class
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "get_classes test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_json_web_key
  # Retrieve JSON Web Key
  # @param key Key ID received as part of JWT header field kid
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "get_json_web_key test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_json_web_token
  # Retrieve JSON Web Token
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :expiry_time_in_mins Token expiry time in minutes, default: 30 minutes
  # @option opts [Int32] :max_expiry_time_in_mins Maximum token expiry time in minutes, default: 480 minutes
  # @return [String]
  describe "get_json_web_token test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_organisation
  # Retrieve organization details
  # @param organization Name of the organization
  # @param [Hash] opts the optional parameters
  # @return [Organisation]
  describe "get_organisation test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_organisations
  # Retrieve all organizations details
  # @param [Hash] opts the optional parameters
  # @return [Array(Organisation)]
  describe "get_organisations test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline
  # Retrieve pipeline details for an organization
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param [Hash] opts the optional parameters
  # @return [Pipeline]
  describe "get_pipeline test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_activities
  # Retrieve all activities details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param [Hash] opts the optional parameters
  # @return [Array(PipelineActivity)]
  describe "get_pipeline_activities test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_branch
  # Retrieve branch details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param branch Name of the branch
  # @param [Hash] opts the optional parameters
  # @return [BranchImpl]
  describe "get_pipeline_branch test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_branch_run
  # Retrieve branch run details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param branch Name of the branch
  # @param run Name of the run
  # @param [Hash] opts the optional parameters
  # @return [PipelineRun]
  describe "get_pipeline_branch_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_branches
  # Retrieve all branches details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param [Hash] opts the optional parameters
  # @return [MultibranchPipeline]
  describe "get_pipeline_branches test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_folder
  # Retrieve pipeline folder for an organization
  # @param organization Name of the organization
  # @param folder Name of the folder
  # @param [Hash] opts the optional parameters
  # @return [PipelineFolderImpl]
  describe "get_pipeline_folder test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_folder_pipeline
  # Retrieve pipeline details for an organization folder
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param folder Name of the folder
  # @param [Hash] opts the optional parameters
  # @return [PipelineImpl]
  describe "get_pipeline_folder_pipeline test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_queue
  # Retrieve queue details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param [Hash] opts the optional parameters
  # @return [Array(QueueItemImpl)]
  describe "get_pipeline_queue test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_run
  # Retrieve run details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param run Name of the run
  # @param [Hash] opts the optional parameters
  # @return [PipelineRun]
  describe "get_pipeline_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_run_log
  # Get log for a pipeline run
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param run Name of the run
  # @param [Hash] opts the optional parameters
  # @option opts [Int32] :start Start position of the log
  # @option opts [Bool] :download Set to true in order to download the file, otherwise it&#39;s passed as a response body
  # @return [String]
  describe "get_pipeline_run_log test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_run_node
  # Retrieve run node details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param run Name of the run
  # @param node Name of the node
  # @param [Hash] opts the optional parameters
  # @return [PipelineRunNode]
  describe "get_pipeline_run_node test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_run_node_step
  # Retrieve run node details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param run Name of the run
  # @param node Name of the node
  # @param step Name of the step
  # @param [Hash] opts the optional parameters
  # @return [PipelineStepImpl]
  describe "get_pipeline_run_node_step test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_run_node_step_log
  # Get log for a pipeline run node step
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param run Name of the run
  # @param node Name of the node
  # @param step Name of the step
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "get_pipeline_run_node_step_log test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_run_node_steps
  # Retrieve run node steps details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param run Name of the run
  # @param node Name of the node
  # @param [Hash] opts the optional parameters
  # @return [Array(PipelineStepImpl)]
  describe "get_pipeline_run_node_steps test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_run_nodes
  # Retrieve run nodes details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param run Name of the run
  # @param [Hash] opts the optional parameters
  # @return [Array(PipelineRunNode)]
  describe "get_pipeline_run_nodes test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipeline_runs
  # Retrieve all runs details for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param [Hash] opts the optional parameters
  # @return [Array(PipelineRun)]
  describe "get_pipeline_runs test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_pipelines
  # Retrieve all pipelines details for an organization
  # @param organization Name of the organization
  # @param [Hash] opts the optional parameters
  # @return [Array(Pipeline)]
  describe "get_pipelines test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_scm
  # Retrieve SCM details for an organization
  # @param organization Name of the organization
  # @param scm Name of SCM
  # @param [Hash] opts the optional parameters
  # @return [GithubScm]
  describe "get_scm test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_scm_organisation_repositories
  # Retrieve SCM organization repositories details for an organization
  # @param organization Name of the organization
  # @param scm Name of SCM
  # @param scm_organisation Name of the SCM organization
  # @param [Hash] opts the optional parameters
  # @option opts [String] :credential_id Credential ID
  # @option opts [Int32] :page_size Number of items in a page
  # @option opts [Int32] :page_number Page number
  # @return [Array(GithubOrganization)]
  describe "get_scm_organisation_repositories test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_scm_organisation_repository
  # Retrieve SCM organization repository details for an organization
  # @param organization Name of the organization
  # @param scm Name of SCM
  # @param scm_organisation Name of the SCM organization
  # @param repository Name of the SCM repository
  # @param [Hash] opts the optional parameters
  # @option opts [String] :credential_id Credential ID
  # @return [Array(GithubOrganization)]
  describe "get_scm_organisation_repository test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_scm_organisations
  # Retrieve SCM organizations details for an organization
  # @param organization Name of the organization
  # @param scm Name of SCM
  # @param [Hash] opts the optional parameters
  # @option opts [String] :credential_id Credential ID
  # @return [Array(GithubOrganization)]
  describe "get_scm_organisations test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_user
  # Retrieve user details for an organization
  # @param organization Name of the organization
  # @param user Name of the user
  # @param [Hash] opts the optional parameters
  # @return [User]
  describe "get_user test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_user_favorites
  # Retrieve user favorites details for an organization
  # @param user Name of the user
  # @param [Hash] opts the optional parameters
  # @return [Array(FavoriteImpl)]
  describe "get_user_favorites test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_users
  # Retrieve users details for an organization
  # @param organization Name of the organization
  # @param [Hash] opts the optional parameters
  # @return [User]
  describe "get_users test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for post_pipeline_run
  # Replay an organization pipeline run
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param run Name of the run
  # @param [Hash] opts the optional parameters
  # @return [QueueItemImpl]
  describe "post_pipeline_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for post_pipeline_runs
  # Start a build for an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param [Hash] opts the optional parameters
  # @return [QueueItemImpl]
  describe "post_pipeline_runs test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for put_pipeline_favorite
  # Favorite/unfavorite a pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param body Set JSON string body to {\&quot;favorite\&quot;: true} to favorite, set value to false to unfavorite
  # @param [Hash] opts the optional parameters
  # @return [FavoriteImpl]
  describe "put_pipeline_favorite test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for put_pipeline_run
  # Stop a build of an organization pipeline
  # @param organization Name of the organization
  # @param pipeline Name of the pipeline
  # @param run Name of the run
  # @param [Hash] opts the optional parameters
  # @option opts [String] :blocking Set to true to make blocking stop, default: false
  # @option opts [Int32] :time_out_in_secs Timeout in seconds, default: 10 seconds
  # @return [PipelineRun]
  describe "put_pipeline_run test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for search
  # Search for any resource details
  # @param q Query string
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "search test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for search_classes
  # Get classes details
  # @param q Query string containing an array of class names
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe "search_classes test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
