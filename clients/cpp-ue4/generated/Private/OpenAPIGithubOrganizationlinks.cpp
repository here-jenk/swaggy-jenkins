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

#include "OpenAPIGithubOrganizationlinks.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIGithubOrganizationlinks::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Repositories.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("repositories")); WriteJsonValue(Writer, Repositories.GetValue());
	}
	if (Self.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("self")); WriteJsonValue(Writer, Self.GetValue());
	}
	if (_Class.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("_class")); WriteJsonValue(Writer, _Class.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIGithubOrganizationlinks::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("repositories"), Repositories);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("self"), Self);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("_class"), _Class);

	return ParseSuccess;
}

}
