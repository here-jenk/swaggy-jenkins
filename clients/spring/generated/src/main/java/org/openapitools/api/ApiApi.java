/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Hudson;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-04T08:12:04.098807Z[Etc/UTC]")
@Validated
@Tag(name = "api", description = "the api API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/json
     * Retrieve Jenkins details
     *
     * @return Successfully retrieved Jenkins details (status code 200)
     *         or Authentication failed - incorrect username and/or password (status code 401)
     *         or Jenkins requires authentication - please set username and password (status code 403)
     */
    @Operation(
        operationId = "getJenkins",
        tags = { "remoteAccess" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved Jenkins details", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Hudson.class))
            }),
            @ApiResponse(responseCode = "401", description = "Authentication failed - incorrect username and/or password"),
            @ApiResponse(responseCode = "403", description = "Jenkins requires authentication - please set username and password")
        },
        security = {
            @SecurityRequirement(name = "jenkins_auth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/json",
        produces = { "application/json" }
    )
    default ResponseEntity<Hudson> getJenkins(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"nodeName\" : \"nodeName\", \"assignedLabels\" : [ { \"_class\" : \"_class\" }, { \"_class\" : \"_class\" } ], \"jobs\" : [ { \"color\" : \"color\", \"displayName\" : \"displayName\", \"lastSuccessfulBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"lastUnstableBuild\" : \"lastUnstableBuild\", \"queueItem\" : \"queueItem\", \"buildable\" : true, \"firstBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"lastFailedBuild\" : \"lastFailedBuild\", \"lastBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"nextBuildNumber\" : 9, \"builds\" : [ { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 } ], \"scm\" : { \"_class\" : \"_class\" }, \"keepDependencies\" : true, \"displayNameOrNull\" : \"displayNameOrNull\", \"inQueue\" : true, \"lastCompletedBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"fullName\" : \"fullName\", \"healthReport\" : [ { \"score\" : 7, \"description\" : \"description\", \"iconClassName\" : \"iconClassName\", \"iconUrl\" : \"iconUrl\", \"_class\" : \"_class\" }, { \"score\" : 7, \"description\" : \"description\", \"iconClassName\" : \"iconClassName\", \"iconUrl\" : \"iconUrl\", \"_class\" : \"_class\" } ], \"lastStableBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"lastUnsuccessfulBuild\" : \"lastUnsuccessfulBuild\", \"url\" : \"url\", \"concurrentBuild\" : true, \"name\" : \"name\", \"_class\" : \"_class\", \"actions\" : [ { \"_class\" : \"_class\" }, { \"_class\" : \"_class\" } ] }, { \"color\" : \"color\", \"displayName\" : \"displayName\", \"lastSuccessfulBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"lastUnstableBuild\" : \"lastUnstableBuild\", \"queueItem\" : \"queueItem\", \"buildable\" : true, \"firstBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"lastFailedBuild\" : \"lastFailedBuild\", \"lastBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"nextBuildNumber\" : 9, \"builds\" : [ { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 } ], \"scm\" : { \"_class\" : \"_class\" }, \"keepDependencies\" : true, \"displayNameOrNull\" : \"displayNameOrNull\", \"inQueue\" : true, \"lastCompletedBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"fullName\" : \"fullName\", \"healthReport\" : [ { \"score\" : 7, \"description\" : \"description\", \"iconClassName\" : \"iconClassName\", \"iconUrl\" : \"iconUrl\", \"_class\" : \"_class\" }, { \"score\" : 7, \"description\" : \"description\", \"iconClassName\" : \"iconClassName\", \"iconUrl\" : \"iconUrl\", \"_class\" : \"_class\" } ], \"lastStableBuild\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"lastUnsuccessfulBuild\" : \"lastUnsuccessfulBuild\", \"url\" : \"url\", \"concurrentBuild\" : true, \"name\" : \"name\", \"_class\" : \"_class\", \"actions\" : [ { \"_class\" : \"_class\" }, { \"_class\" : \"_class\" } ] } ], \"slaveAgentPort\" : 3, \"description\" : \"description\", \"useCrumbs\" : true, \"nodeDescription\" : \"nodeDescription\", \"primaryView\" : { \"name\" : \"name\", \"_class\" : \"_class\", \"url\" : \"url\" }, \"unlabeledLoad\" : { \"_class\" : \"_class\" }, \"mode\" : \"mode\", \"numExecutors\" : 0, \"quietingDown\" : true, \"useSecurity\" : true, \"_class\" : \"_class\", \"views\" : [ { \"name\" : \"name\", \"_class\" : \"_class\", \"url\" : \"url\" }, { \"name\" : \"name\", \"_class\" : \"_class\", \"url\" : \"url\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * HEAD /api/json
     * Retrieve Jenkins headers
     *
     * @return Successfully retrieved Jenkins headers (status code 200)
     *         or Authentication failed - incorrect username and/or password (status code 401)
     *         or Jenkins requires authentication - please set username and password (status code 403)
     */
    @Operation(
        operationId = "headJenkins",
        tags = { "remoteAccess" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved Jenkins headers"),
            @ApiResponse(responseCode = "401", description = "Authentication failed - incorrect username and/or password"),
            @ApiResponse(responseCode = "403", description = "Jenkins requires authentication - please set username and password")
        },
        security = {
            @SecurityRequirement(name = "jenkins_auth")
        }
    )
    @RequestMapping(
        method = RequestMethod.HEAD,
        value = "/api/json"
    )
    default ResponseEntity<Void> headJenkins(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
