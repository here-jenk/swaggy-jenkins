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

#include "OpenAPIBranchImpllinks.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIBranchImpllinks::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Self.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("self")); WriteJsonValue(Writer, Self.GetValue());
	}
	if (Actions.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("actions")); WriteJsonValue(Writer, Actions.GetValue());
	}
	if (Runs.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("runs")); WriteJsonValue(Writer, Runs.GetValue());
	}
	if (Queue.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("queue")); WriteJsonValue(Writer, Queue.GetValue());
	}
	if (_Class.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("_class")); WriteJsonValue(Writer, _Class.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBranchImpllinks::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("self"), Self);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("actions"), Actions);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("runs"), Runs);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("queue"), Queue);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("_class"), _Class);

	return ParseSuccess;
}

}
