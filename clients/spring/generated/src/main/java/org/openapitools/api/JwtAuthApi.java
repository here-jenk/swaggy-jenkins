/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-13T02:39:21.029908Z[Etc/UTC]")
@Validated
@Tag(name = "jwt-auth", description = "the jwt-auth API")
public interface JwtAuthApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /jwt-auth/jwks/{key}
     * Retrieve JSON Web Key
     *
     * @param key Key ID received as part of JWT header field kid (required)
     * @return Successfully retrieved JWT token (status code 200)
     *         or Authentication failed - incorrect username and/or password (status code 401)
     *         or Jenkins requires authentication - please set username and password (status code 403)
     */
    @Operation(
        operationId = "getJsonWebKey",
        tags = { "blueOcean" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved JWT token", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class))),
            @ApiResponse(responseCode = "401", description = "Authentication failed - incorrect username and/or password"),
            @ApiResponse(responseCode = "403", description = "Jenkins requires authentication - please set username and password")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/jwt-auth/jwks/{key}",
        produces = { "application/json" }
    )
    default ResponseEntity<String> getJsonWebKey(
        @Parameter(name = "key", description = "Key ID received as part of JWT header field kid", required = true, schema = @Schema(description = "")) @PathVariable("key") Integer key
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /jwt-auth/token
     * Retrieve JSON Web Token
     *
     * @param expiryTimeInMins Token expiry time in minutes, default: 30 minutes (optional)
     * @param maxExpiryTimeInMins Maximum token expiry time in minutes, default: 480 minutes (optional)
     * @return Successfully retrieved JWT token (status code 200)
     *         or Authentication failed - incorrect username and/or password (status code 401)
     *         or Jenkins requires authentication - please set username and password (status code 403)
     */
    @Operation(
        operationId = "getJsonWebToken",
        tags = { "blueOcean" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved JWT token", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class))),
            @ApiResponse(responseCode = "401", description = "Authentication failed - incorrect username and/or password"),
            @ApiResponse(responseCode = "403", description = "Jenkins requires authentication - please set username and password")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/jwt-auth/token",
        produces = { "application/json" }
    )
    default ResponseEntity<String> getJsonWebToken(
        @Parameter(name = "expiryTimeInMins", description = "Token expiry time in minutes, default: 30 minutes", schema = @Schema(description = "")) @Valid @RequestParam(value = "expiryTimeInMins", required = false) Integer expiryTimeInMins,
        @Parameter(name = "maxExpiryTimeInMins", description = "Maximum token expiry time in minutes, default: 480 minutes", schema = @Schema(description = "")) @Valid @RequestParam(value = "maxExpiryTimeInMins", required = false) Integer maxExpiryTimeInMins
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
