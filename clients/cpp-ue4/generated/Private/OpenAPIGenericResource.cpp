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

#include "OpenAPIGenericResource.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIGenericResource::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (_Class.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("_class")); WriteJsonValue(Writer, _Class.GetValue());
	}
	if (DisplayName.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("displayName")); WriteJsonValue(Writer, DisplayName.GetValue());
	}
	if (DurationInMillis.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("durationInMillis")); WriteJsonValue(Writer, DurationInMillis.GetValue());
	}
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	if (Result.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("result")); WriteJsonValue(Writer, Result.GetValue());
	}
	if (StartTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("startTime")); WriteJsonValue(Writer, StartTime.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIGenericResource::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("_class"), _Class);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("displayName"), DisplayName);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("durationInMillis"), DurationInMillis);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("result"), Result);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("startTime"), StartTime);

	return ParseSuccess;
}

}
