/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * OpenAPI spec version: 1.1.2-pre.0
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
 * OpenAPIQueueItemImpl
 *
 * 
 */
class OPENAPI_API OpenAPIQueueItemImpl : public Model
{
public:
    virtual ~OpenAPIQueueItemImpl() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> _Class;
	TOptional<int32> ExpectedBuildNumber;
	TOptional<FString> Id;
	TOptional<FString> Pipeline;
	TOptional<int32> QueuedTime;
};

}
