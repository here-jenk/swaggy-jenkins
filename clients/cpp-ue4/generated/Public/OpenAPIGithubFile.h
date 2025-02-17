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
#include "OpenAPIGithubContent.h"

namespace OpenAPI
{

/*
 * OpenAPIGithubFile
 *
 * 
 */
class OPENAPI_API OpenAPIGithubFile : public Model
{
public:
    virtual ~OpenAPIGithubFile() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIGithubContent> Content;
	TOptional<FString> _Class;
};

}
