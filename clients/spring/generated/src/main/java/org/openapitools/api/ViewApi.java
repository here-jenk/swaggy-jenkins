/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.2.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ListView;
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
@Api(value = "view", description = "the view API")
public interface ViewApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "getView", notes = "Retrieve view details", response = ListView.class, authorizations = {
        @Authorization(value = "jenkins_auth")
    }, tags={ "remoteAccess", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved view details", response = ListView.class),
        @ApiResponse(code = 401, message = "Authentication failed - incorrect username and/or password"),
        @ApiResponse(code = 403, message = "Jenkins requires authentication - please set username and password"),
        @ApiResponse(code = 404, message = "View cannot be found on Jenkins instance") })
    @RequestMapping(value = "/view/{name}/api/json",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ListView> getView(@ApiParam(value = "Name of the view",required=true) @PathVariable("name") String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"jobs\" : [ {    \"color\" : \"color\",    \"displayName\" : \"displayName\",    \"lastSuccessfulBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"description\" : \"description\",    \"fullDisplayName\" : \"fullDisplayName\",    \"lastUnstableBuild\" : \"lastUnstableBuild\",    \"queueItem\" : \"queueItem\",    \"buildable\" : true,    \"firstBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"lastFailedBuild\" : \"lastFailedBuild\",    \"lastBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"nextBuildNumber\" : 9,    \"builds\" : [ {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    }, {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    } ],    \"scm\" : {      \"_class\" : \"_class\"    },    \"keepDependencies\" : true,    \"displayNameOrNull\" : \"displayNameOrNull\",    \"inQueue\" : true,    \"lastCompletedBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"fullName\" : \"fullName\",    \"healthReport\" : [ {      \"score\" : 7,      \"description\" : \"description\",      \"iconClassName\" : \"iconClassName\",      \"iconUrl\" : \"iconUrl\",      \"_class\" : \"_class\"    }, {      \"score\" : 7,      \"description\" : \"description\",      \"iconClassName\" : \"iconClassName\",      \"iconUrl\" : \"iconUrl\",      \"_class\" : \"_class\"    } ],    \"lastStableBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"lastUnsuccessfulBuild\" : \"lastUnsuccessfulBuild\",    \"url\" : \"url\",    \"concurrentBuild\" : true,    \"name\" : \"name\",    \"_class\" : \"_class\",    \"actions\" : [ {      \"_class\" : \"_class\"    }, {      \"_class\" : \"_class\"    } ]  }, {    \"color\" : \"color\",    \"displayName\" : \"displayName\",    \"lastSuccessfulBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"description\" : \"description\",    \"fullDisplayName\" : \"fullDisplayName\",    \"lastUnstableBuild\" : \"lastUnstableBuild\",    \"queueItem\" : \"queueItem\",    \"buildable\" : true,    \"firstBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"lastFailedBuild\" : \"lastFailedBuild\",    \"lastBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"nextBuildNumber\" : 9,    \"builds\" : [ {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    }, {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    } ],    \"scm\" : {      \"_class\" : \"_class\"    },    \"keepDependencies\" : true,    \"displayNameOrNull\" : \"displayNameOrNull\",    \"inQueue\" : true,    \"lastCompletedBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"fullName\" : \"fullName\",    \"healthReport\" : [ {      \"score\" : 7,      \"description\" : \"description\",      \"iconClassName\" : \"iconClassName\",      \"iconUrl\" : \"iconUrl\",      \"_class\" : \"_class\"    }, {      \"score\" : 7,      \"description\" : \"description\",      \"iconClassName\" : \"iconClassName\",      \"iconUrl\" : \"iconUrl\",      \"_class\" : \"_class\"    } ],    \"lastStableBuild\" : {      \"queueId\" : 5,      \"displayName\" : \"displayName\",      \"keepLog\" : true,      \"description\" : \"description\",      \"fullDisplayName\" : \"fullDisplayName\",      \"estimatedDuration\" : 5,      \"url\" : \"url\",      \"building\" : true,      \"changeSet\" : {        \"kind\" : \"kind\",        \"_class\" : \"_class\"      },      \"duration\" : 1,      \"result\" : \"result\",      \"number\" : 6,      \"executor\" : \"executor\",      \"builtOn\" : \"builtOn\",      \"_class\" : \"_class\",      \"id\" : \"id\",      \"actions\" : [ {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      }, {        \"causes\" : [ {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        }, {          \"_class\" : \"_class\",          \"shortDescription\" : \"shortDescription\",          \"userName\" : \"userName\",          \"userId\" : \"userId\"        } ],        \"_class\" : \"_class\"      } ],      \"timestamp\" : 2    },    \"lastUnsuccessfulBuild\" : \"lastUnsuccessfulBuild\",    \"url\" : \"url\",    \"concurrentBuild\" : true,    \"name\" : \"name\",    \"_class\" : \"_class\",    \"actions\" : [ {      \"_class\" : \"_class\"    }, {      \"_class\" : \"_class\"    } ]  } ],  \"name\" : \"name\",  \"description\" : \"description\",  \"_class\" : \"_class\",  \"url\" : \"url\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getViewConfig", notes = "Retrieve view configuration", response = String.class, authorizations = {
        @Authorization(value = "jenkins_auth")
    }, tags={ "remoteAccess", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved view configuration in config.xml format", response = String.class),
        @ApiResponse(code = 401, message = "Authentication failed - incorrect username and/or password"),
        @ApiResponse(code = 403, message = "Jenkins requires authentication - please set username and password"),
        @ApiResponse(code = 404, message = "View cannot be found on Jenkins instance") })
    @RequestMapping(value = "/view/{name}/config.xml",
        produces = { "text/xml" }, 
        method = RequestMethod.GET)
    default ResponseEntity<String> getViewConfig(@ApiParam(value = "Name of the view",required=true) @PathVariable("name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "postViewConfig", notes = "Update view configuration", authorizations = {
        @Authorization(value = "jenkins_auth")
    }, tags={ "remoteAccess", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully updated view configuration"),
        @ApiResponse(code = 400, message = "An error has occurred - error message is embedded inside the HTML response", response = String.class),
        @ApiResponse(code = 401, message = "Authentication failed - incorrect username and/or password"),
        @ApiResponse(code = 403, message = "Jenkins requires authentication - please set username and password"),
        @ApiResponse(code = 404, message = "View cannot be found on Jenkins instance") })
    @RequestMapping(value = "/view/{name}/config.xml",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> postViewConfig(@ApiParam(value = "Name of the view",required=true) @PathVariable("name") String name,@ApiParam(value = "View configuration in config.xml format" ,required=true )  @Valid @RequestBody String body,@ApiParam(value = "CSRF protection token" ) @RequestHeader(value="Jenkins-Crumb", required=false) String jenkinsCrumb) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
