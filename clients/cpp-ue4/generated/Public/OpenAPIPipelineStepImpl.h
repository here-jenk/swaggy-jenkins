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
#include "OpenAPIInputStepImpl.h"
#include "OpenAPIPipelineStepImpllinks.h"

namespace OpenAPI
{

/*
 * OpenAPIPipelineStepImpl
 *
 * 
 */
class OPENAPI_API OpenAPIPipelineStepImpl : public Model
{
public:
    virtual ~OpenAPIPipelineStepImpl() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> _Class;
	TOptional<OpenAPIPipelineStepImpllinks> Links;
	TOptional<FString> DisplayName;
	TOptional<int32> DurationInMillis;
	TOptional<FString> Id;
	TOptional<OpenAPIInputStepImpl> Input;
	TOptional<FString> Result;
	TOptional<FString> StartTime;
	TOptional<FString> State;
};

}
