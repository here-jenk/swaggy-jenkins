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
 * OpenAPIPipelineFolderImpl
 *
 * 
 */
class OPENAPI_API OpenAPIPipelineFolderImpl : public Model
{
public:
    virtual ~OpenAPIPipelineFolderImpl() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> _Class;
	TOptional<FString> DisplayName;
	TOptional<FString> FullName;
	TOptional<FString> Name;
	TOptional<FString> Organization;
	TOptional<int32> NumberOfFolders;
	TOptional<int32> NumberOfPipelines;
};

}
