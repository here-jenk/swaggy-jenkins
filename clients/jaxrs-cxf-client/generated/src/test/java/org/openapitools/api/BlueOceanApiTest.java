/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.BranchImpl;
import org.openapitools.model.FavoriteImpl;
import org.openapitools.model.GithubOrganization;
import org.openapitools.model.GithubScm;
import org.openapitools.model.MultibranchPipeline;
import org.openapitools.model.Organisation;
import org.openapitools.model.Pipeline;
import org.openapitools.model.PipelineActivity;
import org.openapitools.model.PipelineFolderImpl;
import org.openapitools.model.PipelineImpl;
import org.openapitools.model.PipelineRun;
import org.openapitools.model.PipelineRunNode;
import org.openapitools.model.PipelineStepImpl;
import org.openapitools.model.QueueItemImpl;
import org.openapitools.model.User;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Swaggy Jenkins
 *
 * <p>Jenkins API clients generated from Swagger / Open API specification
 *
 * API tests for BlueOceanApi
 */
public class BlueOceanApiTest {


    private BlueOceanApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("http://localhost", BlueOceanApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePipelineQueueItemTest() {
        String organization = null;
        String pipeline = null;
        String queue = null;
        //api.deletePipelineQueueItem(organization, pipeline, queue);
        
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthenticatedUserTest() {
        String organization = null;
        //User response = api.getAuthenticatedUser(organization);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClassesTest() {
        String propertyClass = null;
        //String response = api.getClasses(propertyClass);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJsonWebKeyTest() {
        Integer key = null;
        //String response = api.getJsonWebKey(key);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJsonWebTokenTest() {
        Integer expiryTimeInMins = null;
        Integer maxExpiryTimeInMins = null;
        //String response = api.getJsonWebToken(expiryTimeInMins, maxExpiryTimeInMins);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganisationTest() {
        String organization = null;
        //Organisation response = api.getOrganisation(organization);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganisationsTest() {
        //List<Organisation> response = api.getOrganisations();
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineTest() {
        String organization = null;
        String pipeline = null;
        //Pipeline response = api.getPipeline(organization, pipeline);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineActivitiesTest() {
        String organization = null;
        String pipeline = null;
        //List<PipelineActivity> response = api.getPipelineActivities(organization, pipeline);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineBranchTest() {
        String organization = null;
        String pipeline = null;
        String branch = null;
        //BranchImpl response = api.getPipelineBranch(organization, pipeline, branch);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineBranchRunTest() {
        String organization = null;
        String pipeline = null;
        String branch = null;
        String run = null;
        //PipelineRun response = api.getPipelineBranchRun(organization, pipeline, branch, run);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineBranchesTest() {
        String organization = null;
        String pipeline = null;
        //MultibranchPipeline response = api.getPipelineBranches(organization, pipeline);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineFolderTest() {
        String organization = null;
        String folder = null;
        //PipelineFolderImpl response = api.getPipelineFolder(organization, folder);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineFolderPipelineTest() {
        String organization = null;
        String pipeline = null;
        String folder = null;
        //PipelineImpl response = api.getPipelineFolderPipeline(organization, pipeline, folder);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineQueueTest() {
        String organization = null;
        String pipeline = null;
        //List<QueueItemImpl> response = api.getPipelineQueue(organization, pipeline);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunTest() {
        String organization = null;
        String pipeline = null;
        String run = null;
        //PipelineRun response = api.getPipelineRun(organization, pipeline, run);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunLogTest() {
        String organization = null;
        String pipeline = null;
        String run = null;
        Integer start = null;
        Boolean download = null;
        //String response = api.getPipelineRunLog(organization, pipeline, run, start, download);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodeTest() {
        String organization = null;
        String pipeline = null;
        String run = null;
        String node = null;
        //PipelineRunNode response = api.getPipelineRunNode(organization, pipeline, run, node);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodeStepTest() {
        String organization = null;
        String pipeline = null;
        String run = null;
        String node = null;
        String step = null;
        //PipelineStepImpl response = api.getPipelineRunNodeStep(organization, pipeline, run, node, step);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodeStepLogTest() {
        String organization = null;
        String pipeline = null;
        String run = null;
        String node = null;
        String step = null;
        //String response = api.getPipelineRunNodeStepLog(organization, pipeline, run, node, step);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodeStepsTest() {
        String organization = null;
        String pipeline = null;
        String run = null;
        String node = null;
        //List<PipelineStepImpl> response = api.getPipelineRunNodeSteps(organization, pipeline, run, node);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunNodesTest() {
        String organization = null;
        String pipeline = null;
        String run = null;
        //List<PipelineRunNode> response = api.getPipelineRunNodes(organization, pipeline, run);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineRunsTest() {
        String organization = null;
        String pipeline = null;
        //List<PipelineRun> response = api.getPipelineRuns(organization, pipeline);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelinesTest() {
        String organization = null;
        //List<Pipeline> response = api.getPipelines(organization);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSCMTest() {
        String organization = null;
        String scm = null;
        //GithubScm response = api.getSCM(organization, scm);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSCMOrganisationRepositoriesTest() {
        String organization = null;
        String scm = null;
        String scmOrganisation = null;
        String credentialId = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        //List<GithubOrganization> response = api.getSCMOrganisationRepositories(organization, scm, scmOrganisation, credentialId, pageSize, pageNumber);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSCMOrganisationRepositoryTest() {
        String organization = null;
        String scm = null;
        String scmOrganisation = null;
        String repository = null;
        String credentialId = null;
        //List<GithubOrganization> response = api.getSCMOrganisationRepository(organization, scm, scmOrganisation, repository, credentialId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSCMOrganisationsTest() {
        String organization = null;
        String scm = null;
        String credentialId = null;
        //List<GithubOrganization> response = api.getSCMOrganisations(organization, scm, credentialId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() {
        String organization = null;
        String user = null;
        //User response = api.getUser(organization, user);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserFavoritesTest() {
        String user = null;
        //List<FavoriteImpl> response = api.getUserFavorites(user);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() {
        String organization = null;
        //User response = api.getUsers(organization);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPipelineRunTest() {
        String organization = null;
        String pipeline = null;
        String run = null;
        //QueueItemImpl response = api.postPipelineRun(organization, pipeline, run);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPipelineRunsTest() {
        String organization = null;
        String pipeline = null;
        //QueueItemImpl response = api.postPipelineRuns(organization, pipeline);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPipelineFavoriteTest() {
        String organization = null;
        String pipeline = null;
        Boolean body = null;
        //FavoriteImpl response = api.putPipelineFavorite(organization, pipeline, body);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPipelineRunTest() {
        String organization = null;
        String pipeline = null;
        String run = null;
        String blocking = null;
        Integer timeOutInSecs = null;
        //PipelineRun response = api.putPipelineRun(organization, pipeline, run, blocking, timeOutInSecs);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() {
        String q = null;
        //String response = api.search(q);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchClassesTest() {
        String q = null;
        //String response = api.searchClasses(q);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}
