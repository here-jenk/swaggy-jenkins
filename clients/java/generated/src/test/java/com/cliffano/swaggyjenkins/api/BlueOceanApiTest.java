/*
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cliffano.swaggyjenkins.api;

import com.cliffano.swaggyjenkins.ApiException;
import com.cliffano.swaggyjenkins.model.BranchImpl;
import com.cliffano.swaggyjenkins.model.FavoriteImpl;
import com.cliffano.swaggyjenkins.model.GithubOrganization;
import com.cliffano.swaggyjenkins.model.GithubScm;
import com.cliffano.swaggyjenkins.model.MultibranchPipeline;
import com.cliffano.swaggyjenkins.model.Organisation;
import com.cliffano.swaggyjenkins.model.Pipeline;
import com.cliffano.swaggyjenkins.model.PipelineActivity;
import com.cliffano.swaggyjenkins.model.PipelineFolderImpl;
import com.cliffano.swaggyjenkins.model.PipelineImpl;
import com.cliffano.swaggyjenkins.model.PipelineRun;
import com.cliffano.swaggyjenkins.model.PipelineRunNode;
import com.cliffano.swaggyjenkins.model.PipelineStepImpl;
import com.cliffano.swaggyjenkins.model.QueueItemImpl;
import com.cliffano.swaggyjenkins.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlueOceanApi
 */
@Ignore
public class BlueOceanApiTest {

    private final BlueOceanApi api = new BlueOceanApi();

    
    /**
     * 
     *
     * Delete queue item from an organization pipeline queue
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePipelineQueueItemTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String queue = null;
                api.deletePipelineQueueItem(organization, pipeline, queue);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve authenticated user details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthenticatedUserTest() throws ApiException {
        String organization = null;
                User response = api.getAuthenticatedUser(organization);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of class names supported by a given class
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClassesTest() throws ApiException {
        String propertyClass = null;
                String response = api.getClasses(propertyClass);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve JSON Web Key
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJsonWebKeyTest() throws ApiException {
        Integer key = null;
                String response = api.getJsonWebKey(key);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve JSON Web Token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJsonWebTokenTest() throws ApiException {
        Integer expiryTimeInMins = null;
        Integer maxExpiryTimeInMins = null;
                String response = api.getJsonWebToken(expiryTimeInMins, maxExpiryTimeInMins);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve organization details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganisationTest() throws ApiException {
        String organization = null;
                Organisation response = api.getOrganisation(organization);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve all organizations details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganisationsTest() throws ApiException {
                List<Organisation> response = api.getOrganisations();
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve pipeline details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineTest() throws ApiException {
        String organization = null;
        String pipeline = null;
                Pipeline response = api.getPipeline(organization, pipeline);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve all activities details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineActivitiesTest() throws ApiException {
        String organization = null;
        String pipeline = null;
                List<PipelineActivity> response = api.getPipelineActivities(organization, pipeline);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve branch details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineBranchTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String branch = null;
                BranchImpl response = api.getPipelineBranch(organization, pipeline, branch);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve branch run details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineBranchRunTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String branch = null;
        String run = null;
                PipelineRun response = api.getPipelineBranchRun(organization, pipeline, branch, run);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve all branches details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineBranchesTest() throws ApiException {
        String organization = null;
        String pipeline = null;
                MultibranchPipeline response = api.getPipelineBranches(organization, pipeline);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve pipeline folder for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineFolderTest() throws ApiException {
        String organization = null;
        String folder = null;
                PipelineFolderImpl response = api.getPipelineFolder(organization, folder);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve pipeline details for an organization folder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineFolderPipelineTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String folder = null;
                PipelineImpl response = api.getPipelineFolderPipeline(organization, pipeline, folder);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve queue details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineQueueTest() throws ApiException {
        String organization = null;
        String pipeline = null;
                List<QueueItemImpl> response = api.getPipelineQueue(organization, pipeline);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve run details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String run = null;
                PipelineRun response = api.getPipelineRun(organization, pipeline, run);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get log for a pipeline run
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunLogTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String run = null;
        Integer start = null;
        Boolean download = null;
                String response = api.getPipelineRunLog(organization, pipeline, run, start, download);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve run node details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodeTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String run = null;
        String node = null;
                PipelineRunNode response = api.getPipelineRunNode(organization, pipeline, run, node);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve run node details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodeStepTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String run = null;
        String node = null;
        String step = null;
                PipelineStepImpl response = api.getPipelineRunNodeStep(organization, pipeline, run, node, step);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get log for a pipeline run node step
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodeStepLogTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String run = null;
        String node = null;
        String step = null;
                String response = api.getPipelineRunNodeStepLog(organization, pipeline, run, node, step);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve run node steps details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodeStepsTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String run = null;
        String node = null;
                List<PipelineStepImpl> response = api.getPipelineRunNodeSteps(organization, pipeline, run, node);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve run nodes details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodesTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String run = null;
                List<PipelineRunNode> response = api.getPipelineRunNodes(organization, pipeline, run);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve all runs details for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunsTest() throws ApiException {
        String organization = null;
        String pipeline = null;
                List<PipelineRun> response = api.getPipelineRuns(organization, pipeline);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve all pipelines details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelinesTest() throws ApiException {
        String organization = null;
                List<Pipeline> response = api.getPipelines(organization);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve SCM details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSCMTest() throws ApiException {
        String organization = null;
        String scm = null;
                GithubScm response = api.getSCM(organization, scm);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve SCM organization repositories details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSCMOrganisationRepositoriesTest() throws ApiException {
        String organization = null;
        String scm = null;
        String scmOrganisation = null;
        String credentialId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
                List<GithubOrganization> response = api.getSCMOrganisationRepositories(organization, scm, scmOrganisation, credentialId, pageSize, pageNumber);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve SCM organization repository details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSCMOrganisationRepositoryTest() throws ApiException {
        String organization = null;
        String scm = null;
        String scmOrganisation = null;
        String repository = null;
        String credentialId = null;
                List<GithubOrganization> response = api.getSCMOrganisationRepository(organization, scm, scmOrganisation, repository, credentialId);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve SCM organizations details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSCMOrganisationsTest() throws ApiException {
        String organization = null;
        String scm = null;
        String credentialId = null;
                List<GithubOrganization> response = api.getSCMOrganisations(organization, scm, credentialId);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve user details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String organization = null;
        String user = null;
                User response = api.getUser(organization, user);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve user favorites details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserFavoritesTest() throws ApiException {
        String user = null;
                List<FavoriteImpl> response = api.getUserFavorites(user);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve users details for an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String organization = null;
                User response = api.getUsers(organization);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Replay an organization pipeline run
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPipelineRunTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String run = null;
                QueueItemImpl response = api.postPipelineRun(organization, pipeline, run);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Start a build for an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPipelineRunsTest() throws ApiException {
        String organization = null;
        String pipeline = null;
                QueueItemImpl response = api.postPipelineRuns(organization, pipeline);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Favorite/unfavorite a pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPipelineFavoriteTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        Boolean body = null;
                FavoriteImpl response = api.putPipelineFavorite(organization, pipeline, body);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Stop a build of an organization pipeline
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPipelineRunTest() throws ApiException {
        String organization = null;
        String pipeline = null;
        String run = null;
        String blocking = null;
        Integer timeOutInSecs = null;
                PipelineRun response = api.putPipelineRun(organization, pipeline, run, blocking, timeOutInSecs);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Search for any resource details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String q = null;
                String response = api.search(q);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get classes details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchClassesTest() throws ApiException {
        String q = null;
                String response = api.searchClasses(q);
        // TODO: test validations
    }
    
}
