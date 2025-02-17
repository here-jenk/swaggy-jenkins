/*
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

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.ComputerSet;
import org.openapitools.model.FreeStyleBuild;
import org.openapitools.model.FreeStyleProject;
import org.openapitools.model.Hudson;
import org.openapitools.model.ListView;
import org.openapitools.model.Queue;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-06-04T08:08:17.621469Z[Etc/UTC]")
@Client("${openapi-micronaut-client-base-path}")
public interface RemoteAccessApi {
    /**
     * Retrieve computer details
     *
     * @param depth Recursion depth in response model (required)
     * @return ComputerSet
     */
    @Get(uri="/computer/api/json")
    @Consumes({"application/json"})
    Mono<ComputerSet> getComputer(
        @QueryValue(value="depth") @NotNull Integer depth
    );

    /**
     * Retrieve Jenkins details
     *
     * @return Hudson
     */
    @Get(uri="/api/json")
    @Consumes({"application/json"})
    Mono<Hudson> getJenkins();

    /**
     * Retrieve job details
     *
     * @param name Name of the job (required)
     * @return FreeStyleProject
     */
    @Get(uri="/job/{name}/api/json")
    @Consumes({"application/json"})
    Mono<FreeStyleProject> getJob(
        @PathVariable(name="name") @NotNull String name
    );

    /**
     * Retrieve job configuration
     *
     * @param name Name of the job (required)
     * @return String
     */
    @Get(uri="/job/{name}/config.xml")
    @Consumes({"text/xml"})
    Mono<String> getJobConfig(
        @PathVariable(name="name") @NotNull String name
    );

    /**
     * Retrieve job&#39;s last build details
     *
     * @param name Name of the job (required)
     * @return FreeStyleBuild
     */
    @Get(uri="/job/{name}/lastBuild/api/json")
    @Consumes({"application/json"})
    Mono<FreeStyleBuild> getJobLastBuild(
        @PathVariable(name="name") @NotNull String name
    );

    /**
     * Retrieve job&#39;s build progressive text output
     *
     * @param name Name of the job (required)
     * @param number Build number (required)
     * @param start Starting point of progressive text output (required)
     */
    @Get(uri="/job/{name}/{number}/logText/progressiveText")
    Mono<Void> getJobProgressiveText(
        @PathVariable(name="name") @NotNull String name, 
        @PathVariable(name="number") @NotNull String number, 
        @QueryValue(value="start") @NotNull String start
    );

    /**
     * Retrieve queue details
     *
     * @return Queue
     */
    @Get(uri="/queue/api/json")
    @Consumes({"application/json"})
    Mono<Queue> getQueue();

    /**
     * Retrieve queued item details
     *
     * @param number Queue number (required)
     * @return Queue
     */
    @Get(uri="/queue/item/{number}/api/json")
    @Consumes({"application/json"})
    Mono<Queue> getQueueItem(
        @PathVariable(name="number") @NotNull String number
    );

    /**
     * Retrieve view details
     *
     * @param name Name of the view (required)
     * @return ListView
     */
    @Get(uri="/view/{name}/api/json")
    @Consumes({"application/json"})
    Mono<ListView> getView(
        @PathVariable(name="name") @NotNull String name
    );

    /**
     * Retrieve view configuration
     *
     * @param name Name of the view (required)
     * @return String
     */
    @Get(uri="/view/{name}/config.xml")
    @Consumes({"text/xml"})
    Mono<String> getViewConfig(
        @PathVariable(name="name") @NotNull String name
    );

    /**
     * Retrieve Jenkins headers
     *
     */
    @Head(uri="/api/json")
    Mono<Void> headJenkins();

    /**
     * Create a new job using job configuration, or copied from an existing job
     *
     * @param name Name of the new job (required)
     * @param from Existing job to copy from (optional)
     * @param mode Set to &#39;copy&#39; for copying an existing job (optional)
     * @param jenkinsCrumb CSRF protection token (optional)
     * @param contentType Content type header application/xml (optional)
     * @param _body Job configuration in config.xml format (optional)
     */
    @Post(uri="/createItem")
    
    @Produces({"application/json"})
    Mono<Void> postCreateItem(
        @QueryValue(value="name") @NotNull String name, 
        @QueryValue(value="from") @Nullable String from, 
        @QueryValue(value="mode") @Nullable String mode, 
        @Header(name="Jenkins-Crumb") @Nullable String jenkinsCrumb, 
        @Header(name="Content-Type") @Nullable String contentType, 
        @Body @Nullable String _body
    );

    /**
     * Create a new view using view configuration
     *
     * @param name Name of the new view (required)
     * @param jenkinsCrumb CSRF protection token (optional)
     * @param contentType Content type header application/xml (optional)
     * @param _body View configuration in config.xml format (optional)
     */
    @Post(uri="/createView")
    
    @Produces({"application/json"})
    Mono<Void> postCreateView(
        @QueryValue(value="name") @NotNull String name, 
        @Header(name="Jenkins-Crumb") @Nullable String jenkinsCrumb, 
        @Header(name="Content-Type") @Nullable String contentType, 
        @Body @Nullable String _body
    );

    /**
     * Build a job
     *
     * @param name Name of the job (required)
     * @param json  (required)
     * @param token  (optional)
     * @param jenkinsCrumb CSRF protection token (optional)
     */
    @Post(uri="/job/{name}/build")
    Mono<Void> postJobBuild(
        @PathVariable(name="name") @NotNull String name, 
        @QueryValue(value="json") @NotNull String json, 
        @QueryValue(value="token") @Nullable String token, 
        @Header(name="Jenkins-Crumb") @Nullable String jenkinsCrumb
    );

    /**
     * Update job configuration
     *
     * @param name Name of the job (required)
     * @param _body Job configuration in config.xml format (required)
     * @param jenkinsCrumb CSRF protection token (optional)
     */
    @Post(uri="/job/{name}/config.xml")
    
    @Produces({"application/json"})
    Mono<Void> postJobConfig(
        @PathVariable(name="name") @NotNull String name, 
        @Body @NotNull String _body, 
        @Header(name="Jenkins-Crumb") @Nullable String jenkinsCrumb
    );

    /**
     * Delete a job
     *
     * @param name Name of the job (required)
     * @param jenkinsCrumb CSRF protection token (optional)
     */
    @Post(uri="/job/{name}/doDelete")
    Mono<Void> postJobDelete(
        @PathVariable(name="name") @NotNull String name, 
        @Header(name="Jenkins-Crumb") @Nullable String jenkinsCrumb
    );

    /**
     * Disable a job
     *
     * @param name Name of the job (required)
     * @param jenkinsCrumb CSRF protection token (optional)
     */
    @Post(uri="/job/{name}/disable")
    Mono<Void> postJobDisable(
        @PathVariable(name="name") @NotNull String name, 
        @Header(name="Jenkins-Crumb") @Nullable String jenkinsCrumb
    );

    /**
     * Enable a job
     *
     * @param name Name of the job (required)
     * @param jenkinsCrumb CSRF protection token (optional)
     */
    @Post(uri="/job/{name}/enable")
    Mono<Void> postJobEnable(
        @PathVariable(name="name") @NotNull String name, 
        @Header(name="Jenkins-Crumb") @Nullable String jenkinsCrumb
    );

    /**
     * Stop a job
     *
     * @param name Name of the job (required)
     * @param jenkinsCrumb CSRF protection token (optional)
     */
    @Post(uri="/job/{name}/lastBuild/stop")
    Mono<Void> postJobLastBuildStop(
        @PathVariable(name="name") @NotNull String name, 
        @Header(name="Jenkins-Crumb") @Nullable String jenkinsCrumb
    );

    /**
     * Update view configuration
     *
     * @param name Name of the view (required)
     * @param _body View configuration in config.xml format (required)
     * @param jenkinsCrumb CSRF protection token (optional)
     */
    @Post(uri="/view/{name}/config.xml")
    
    @Produces({"application/json"})
    Mono<Void> postViewConfig(
        @PathVariable(name="name") @NotNull String name, 
        @Body @NotNull String _body, 
        @Header(name="Jenkins-Crumb") @Nullable String jenkinsCrumb
    );

}
