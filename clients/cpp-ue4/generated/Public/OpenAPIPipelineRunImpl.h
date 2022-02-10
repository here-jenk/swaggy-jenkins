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
#include "OpenAPIPipelineRunImpllinks.h"

namespace OpenAPI
{

/*
 * OpenAPIPipelineRunImpl
 *
 * 
 */
class OPENAPI_API OpenAPIPipelineRunImpl : public Model
{
public:
    virtual ~OpenAPIPipelineRunImpl() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> _Class;
	TOptional<OpenAPIPipelineRunImpllinks> Links;
	TOptional<int32> DurationInMillis;
	TOptional<FString> EnQueueTime;
	TOptional<FString> EndTime;
	TOptional<int32> EstimatedDurationInMillis;
	TOptional<FString> Id;
	TOptional<FString> Organization;
	TOptional<FString> Pipeline;
	TOptional<FString> Result;
	TOptional<FString> RunSummary;
	TOptional<FString> StartTime;
	TOptional<FString> State;
	TOptional<FString> Type;
	TOptional<FString> CommitId;
};

}
