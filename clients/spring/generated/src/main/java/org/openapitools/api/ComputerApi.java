/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ComputerSet;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-10T09:53:34.462656Z[Etc/UTC]")
@Validated
@Tag(name = "computer", description = "the computer API")
public interface ComputerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /computer/api/json
     * Retrieve computer details
     *
     * @param depth Recursion depth in response model (required)
     * @return Successfully retrieved computer details (status code 200)
     *         or Authentication failed - incorrect username and/or password (status code 401)
     *         or Jenkins requires authentication - please set username and password (status code 403)
     */
    @Operation(
        operationId = "getComputer",
        tags = { "remoteAccess" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved computer details", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ComputerSet.class))),
            @ApiResponse(responseCode = "401", description = "Authentication failed - incorrect username and/or password"),
            @ApiResponse(responseCode = "403", description = "Jenkins requires authentication - please set username and password")
        },
        security = {
            @SecurityRequirement(name = "jenkins_auth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/computer/api/json",
        produces = { "application/json" }
    )
    default ResponseEntity<ComputerSet> getComputer(
        @NotNull @Parameter(name = "depth", description = "Recursion depth in response model", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "depth", required = true) Integer depth
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"busyExecutors\" : 0, \"totalExecutors\" : 1, \"computer\" : [ { \"idle\" : true, \"displayName\" : \"displayName\", \"jnlpAgent\" : true, \"launchSupported\" : true, \"icon\" : \"icon\", \"iconClassName\" : \"iconClassName\", \"offlineCause\" : \"offlineCause\", \"temporarilyOffline\" : true, \"numExecutors\" : 1, \"offline\" : true, \"executors\" : [ { \"currentExecutable\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"number\" : 6, \"idle\" : true, \"likelyStuck\" : true, \"progress\" : 1, \"_class\" : \"_class\" }, { \"currentExecutable\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"number\" : 6, \"idle\" : true, \"likelyStuck\" : true, \"progress\" : 1, \"_class\" : \"_class\" } ], \"monitorData\" : { \"hudson.node_monitors.SwapSpaceMonitor\" : { \"totalSwapSpace\" : 7, \"availableSwapSpace\" : 5, \"_class\" : \"_class\", \"availablePhysicalMemory\" : 5, \"totalPhysicalMemory\" : 2 }, \"hudson.node_monitors.TemporarySpaceMonitor\" : { \"path\" : \"path\", \"size\" : 3, \"_class\" : \"_class\", \"timestamp\" : 9 }, \"hudson.node_monitors.DiskSpaceMonitor\" : { \"path\" : \"path\", \"size\" : 3, \"_class\" : \"_class\", \"timestamp\" : 9 }, \"hudson.node_monitors.ArchitectureMonitor\" : \"hudson.node_monitors.ArchitectureMonitor\", \"_class\" : \"_class\", \"hudson.node_monitors.ResponseTimeMonitor\" : { \"average\" : 4, \"_class\" : \"_class\", \"timestamp\" : 2 }, \"hudson.node_monitors.ClockMonitor\" : { \"diff\" : 7, \"_class\" : \"_class\" } }, \"_class\" : \"_class\", \"loadStatistics\" : { \"_class\" : \"_class\" }, \"manualLaunchAllowed\" : true, \"offlineCauseReason\" : \"offlineCauseReason\" }, { \"idle\" : true, \"displayName\" : \"displayName\", \"jnlpAgent\" : true, \"launchSupported\" : true, \"icon\" : \"icon\", \"iconClassName\" : \"iconClassName\", \"offlineCause\" : \"offlineCause\", \"temporarilyOffline\" : true, \"numExecutors\" : 1, \"offline\" : true, \"executors\" : [ { \"currentExecutable\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"number\" : 6, \"idle\" : true, \"likelyStuck\" : true, \"progress\" : 1, \"_class\" : \"_class\" }, { \"currentExecutable\" : { \"queueId\" : 5, \"displayName\" : \"displayName\", \"keepLog\" : true, \"description\" : \"description\", \"fullDisplayName\" : \"fullDisplayName\", \"estimatedDuration\" : 5, \"url\" : \"url\", \"building\" : true, \"changeSet\" : { \"kind\" : \"kind\", \"_class\" : \"_class\" }, \"duration\" : 1, \"result\" : \"result\", \"number\" : 6, \"executor\" : \"executor\", \"builtOn\" : \"builtOn\", \"_class\" : \"_class\", \"id\" : \"id\", \"actions\" : [ { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" }, { \"causes\" : [ { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" }, { \"_class\" : \"_class\", \"shortDescription\" : \"shortDescription\", \"userName\" : \"userName\", \"userId\" : \"userId\" } ], \"_class\" : \"_class\" } ], \"timestamp\" : 2 }, \"number\" : 6, \"idle\" : true, \"likelyStuck\" : true, \"progress\" : 1, \"_class\" : \"_class\" } ], \"monitorData\" : { \"hudson.node_monitors.SwapSpaceMonitor\" : { \"totalSwapSpace\" : 7, \"availableSwapSpace\" : 5, \"_class\" : \"_class\", \"availablePhysicalMemory\" : 5, \"totalPhysicalMemory\" : 2 }, \"hudson.node_monitors.TemporarySpaceMonitor\" : { \"path\" : \"path\", \"size\" : 3, \"_class\" : \"_class\", \"timestamp\" : 9 }, \"hudson.node_monitors.DiskSpaceMonitor\" : { \"path\" : \"path\", \"size\" : 3, \"_class\" : \"_class\", \"timestamp\" : 9 }, \"hudson.node_monitors.ArchitectureMonitor\" : \"hudson.node_monitors.ArchitectureMonitor\", \"_class\" : \"_class\", \"hudson.node_monitors.ResponseTimeMonitor\" : { \"average\" : 4, \"_class\" : \"_class\", \"timestamp\" : 2 }, \"hudson.node_monitors.ClockMonitor\" : { \"diff\" : 7, \"_class\" : \"_class\" } }, \"_class\" : \"_class\", \"loadStatistics\" : { \"_class\" : \"_class\" }, \"manualLaunchAllowed\" : true, \"offlineCauseReason\" : \"offlineCauseReason\" } ], \"displayName\" : \"displayName\", \"_class\" : \"_class\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
