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

#include "OpenAPIQueueLeftItem.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIQueueLeftItem::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (_Class.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("_class")); WriteJsonValue(Writer, _Class.GetValue());
	}
	if (Actions.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("actions")); WriteJsonValue(Writer, Actions.GetValue());
	}
	if (Blocked.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("blocked")); WriteJsonValue(Writer, Blocked.GetValue());
	}
	if (Buildable.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("buildable")); WriteJsonValue(Writer, Buildable.GetValue());
	}
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	if (InQueueSince.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("inQueueSince")); WriteJsonValue(Writer, InQueueSince.GetValue());
	}
	if (Params.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("params")); WriteJsonValue(Writer, Params.GetValue());
	}
	if (Stuck.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("stuck")); WriteJsonValue(Writer, Stuck.GetValue());
	}
	if (Task.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("task")); WriteJsonValue(Writer, Task.GetValue());
	}
	if (Url.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("url")); WriteJsonValue(Writer, Url.GetValue());
	}
	if (Why.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("why")); WriteJsonValue(Writer, Why.GetValue());
	}
	if (Cancelled.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cancelled")); WriteJsonValue(Writer, Cancelled.GetValue());
	}
	if (Executable.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("executable")); WriteJsonValue(Writer, Executable.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIQueueLeftItem::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("_class"), _Class);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("actions"), Actions);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("blocked"), Blocked);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("buildable"), Buildable);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("inQueueSince"), InQueueSince);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("params"), Params);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("stuck"), Stuck);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("task"), Task);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("url"), Url);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("why"), Why);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cancelled"), Cancelled);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("executable"), Executable);

	return ParseSuccess;
}

}
