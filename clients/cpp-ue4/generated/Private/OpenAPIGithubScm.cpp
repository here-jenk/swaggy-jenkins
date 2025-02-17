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

#include "OpenAPIGithubScm.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIGithubScm::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (_Class.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("_class")); WriteJsonValue(Writer, _Class.GetValue());
	}
	if (Links.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("_links")); WriteJsonValue(Writer, Links.GetValue());
	}
	if (CredentialId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("credentialId")); WriteJsonValue(Writer, CredentialId.GetValue());
	}
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	if (Uri.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("uri")); WriteJsonValue(Writer, Uri.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIGithubScm::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("_class"), _Class);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("_links"), Links);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("credentialId"), CredentialId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("uri"), Uri);

	return ParseSuccess;
}

}
