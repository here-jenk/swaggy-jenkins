{-
   Swaggy Jenkins
   Jenkins API clients generated from Swagger / Open API specification

   The version of the OpenAPI document: 1.1.1
   Contact: blah@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Base exposing
    ( getCrumb
    )

import Api
import Api.Data
import Dict
import Http
import Json.Decode
import Json.Encode



{-| Retrieve CSRF protection token
-}
getCrumb : Api.Request Api.Data.DefaultCrumbIssuer
getCrumb =
    Api.request
        "GET"
        "/crumbIssuer/api/json"
        []
        []
        []
        Nothing
        Api.Data.defaultCrumbIssuerDecoder
