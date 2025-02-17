# Swaggy Jenkins

Jenkins API clients generated from Swagger / Open API specification


    ## API

          ### Base

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.BaseController`|akka-http API controller|
          |`org.openapitools.server.api.BaseApi`|Representing trait|
              |`org.openapitools.server.api.BaseApiImpl`|Default implementation|

                * `GET /crumbIssuer/api/json` - 

          ### BlueOcean

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.BlueOceanController`|akka-http API controller|
          |`org.openapitools.server.api.BlueOceanApi`|Representing trait|
              |`org.openapitools.server.api.BlueOceanApiImpl`|Default implementation|

                * `DELETE /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue/{queue}` - 
                * `GET /blue/rest/organizations/{organization}/user/` - 
                * `GET /blue/rest/classes/{class}` - 
                * `GET /jwt-auth/jwks/{key}` - 
                * `GET /jwt-auth/token?expiryTimeInMins=[value]&maxExpiryTimeInMins=[value]` - 
                * `GET /blue/rest/organizations/{organization}` - 
                * `GET /blue/rest/organizations/` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/activities` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches/{branch}/runs/{run}` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/branches` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{folder}/` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{folder}/pipelines/{pipeline}` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/queue` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/log?start=[value]&download=[value]` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps/{step}/log` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes/{node}/steps` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/nodes` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs` - 
                * `GET /blue/rest/organizations/{organization}/pipelines/` - 
                * `GET /blue/rest/organizations/{organization}/scm/{scm}` - 
                * `GET /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories?credentialId=[value]&pageSize=[value]&pageNumber=[value]` - 
                * `GET /blue/rest/organizations/{organization}/scm/{scm}/organizations/{scmOrganisation}/repositories/{repository}?credentialId=[value]` - 
                * `GET /blue/rest/organizations/{organization}/scm/{scm}/organizations?credentialId=[value]` - 
                * `GET /blue/rest/organizations/{organization}/users/{user}` - 
                * `GET /blue/rest/users/{user}/favorites` - 
                * `GET /blue/rest/organizations/{organization}/users/` - 
                * `POST /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/replay` - 
                * `POST /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs` - 
                * `PUT /blue/rest/organizations/{organization}/pipelines/{pipeline}/favorite` - 
                * `PUT /blue/rest/organizations/{organization}/pipelines/{pipeline}/runs/{run}/stop?blocking=[value]&timeOutInSecs=[value]` - 
                * `GET /blue/rest/search/?q=[value]` - 
                * `GET /blue/rest/classes/?q=[value]` - 

          ### RemoteAccess

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.RemoteAccessController`|akka-http API controller|
          |`org.openapitools.server.api.RemoteAccessApi`|Representing trait|
              |`org.openapitools.server.api.RemoteAccessApiImpl`|Default implementation|

                * `GET /computer/api/json?depth=[value]` - 
                * `GET /api/json` - 
                * `GET /job/{name}/api/json` - 
                * `GET /job/{name}/config.xml` - 
                * `GET /job/{name}/lastBuild/api/json` - 
                * `GET /job/{name}/{number}/logText/progressiveText?start=[value]` - 
                * `GET /queue/api/json` - 
                * `GET /queue/item/{number}/api/json` - 
                * `GET /view/{name}/api/json` - 
                * `GET /view/{name}/config.xml` - 
                * `HEAD /api/json` - 
                * `POST /createItem?name=[value]&from=[value]&mode=[value]` - 
                * `POST /createView?name=[value]` - 
                * `POST /job/{name}/build?json=[value]&token=[value]` - 
                * `POST /job/{name}/config.xml` - 
                * `POST /job/{name}/doDelete` - 
                * `POST /job/{name}/disable` - 
                * `POST /job/{name}/enable` - 
                * `POST /job/{name}/lastBuild/stop` - 
                * `POST /view/{name}/config.xml` - 

