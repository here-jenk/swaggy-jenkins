/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.2.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.DefaultCrumbIssuer;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-10T13:34:37.094Z[GMT]")

@Validated
@Api(value = "crumbIssuer", description = "the crumbIssuer API")
public interface CrumbIssuerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "getCrumb", notes = "Retrieve CSRF protection token", response = DefaultCrumbIssuer.class, authorizations = {
        @Authorization(value = "jenkins_auth")
    }, tags={ "base", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved CSRF protection token", response = DefaultCrumbIssuer.class),
        @ApiResponse(code = 401, message = "Authentication failed - incorrect username and/or password"),
        @ApiResponse(code = 403, message = "Jenkins requires authentication - please set username and password") })
    @RequestMapping(value = "/crumbIssuer/api/json",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<DefaultCrumbIssuer> getCrumb() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"crumb\" : \"crumb\",  \"_class\" : \"_class\",  \"crumbRequestField\" : \"crumbRequestField\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
