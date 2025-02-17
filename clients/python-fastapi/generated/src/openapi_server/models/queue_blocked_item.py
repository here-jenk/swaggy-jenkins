# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401
from openapi_server.models.cause_action import CauseAction
from openapi_server.models.free_style_project import FreeStyleProject


class QueueBlockedItem(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    QueueBlockedItem - a model defined in OpenAPI

        _class: The _class of this QueueBlockedItem [Optional].
        actions: The actions of this QueueBlockedItem [Optional].
        blocked: The blocked of this QueueBlockedItem [Optional].
        buildable: The buildable of this QueueBlockedItem [Optional].
        id: The id of this QueueBlockedItem [Optional].
        in_queue_since: The in_queue_since of this QueueBlockedItem [Optional].
        params: The params of this QueueBlockedItem [Optional].
        stuck: The stuck of this QueueBlockedItem [Optional].
        task: The task of this QueueBlockedItem [Optional].
        url: The url of this QueueBlockedItem [Optional].
        why: The why of this QueueBlockedItem [Optional].
        buildable_start_milliseconds: The buildable_start_milliseconds of this QueueBlockedItem [Optional].
    """

    _class: Optional[str] = Field(alias="_class", default=None)
    actions: Optional[List[CauseAction]] = Field(alias="actions", default=None)
    blocked: Optional[bool] = Field(alias="blocked", default=None)
    buildable: Optional[bool] = Field(alias="buildable", default=None)
    id: Optional[int] = Field(alias="id", default=None)
    in_queue_since: Optional[int] = Field(alias="inQueueSince", default=None)
    params: Optional[str] = Field(alias="params", default=None)
    stuck: Optional[bool] = Field(alias="stuck", default=None)
    task: Optional[FreeStyleProject] = Field(alias="task", default=None)
    url: Optional[str] = Field(alias="url", default=None)
    why: Optional[str] = Field(alias="why", default=None)
    buildable_start_milliseconds: Optional[int] = Field(alias="buildableStartMilliseconds", default=None)

QueueBlockedItem.update_forward_refs()
