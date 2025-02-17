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

namespace OpenAPI
{

/*
 * OpenAPIGenericResource
 *
 * 
 */
class OPENAPI_API OpenAPIGenericResource : public Model
{
public:
    virtual ~OpenAPIGenericResource() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> _Class;
	TOptional<FString> DisplayName;
	TOptional<int32> DurationInMillis;
	TOptional<FString> Id;
	TOptional<FString> Result;
	TOptional<FString> StartTime;
};

}
