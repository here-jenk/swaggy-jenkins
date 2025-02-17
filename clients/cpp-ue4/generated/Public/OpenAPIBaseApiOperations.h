/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * OpenAPI spec version: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIBaseApi.h"

#include "OpenAPIDefaultCrumbIssuer.h"

namespace OpenAPI
{

/* 
 *
 * Retrieve CSRF protection token
*/
class OPENAPI_API OpenAPIBaseApi::GetCrumbRequest : public Request
{
public:
    virtual ~GetCrumbRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

};

class OPENAPI_API OpenAPIBaseApi::GetCrumbResponse : public Response
{
public:
    virtual ~GetCrumbResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIDefaultCrumbIssuer Content;
};

}
