# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401


class GenericResource(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    GenericResource - a model defined in OpenAPI

        _class: The _class of this GenericResource [Optional].
        display_name: The display_name of this GenericResource [Optional].
        duration_in_millis: The duration_in_millis of this GenericResource [Optional].
        id: The id of this GenericResource [Optional].
        result: The result of this GenericResource [Optional].
        start_time: The start_time of this GenericResource [Optional].
    """

    _class: Optional[str] = Field(alias="_class", default=None)
    display_name: Optional[str] = Field(alias="displayName", default=None)
    duration_in_millis: Optional[int] = Field(alias="durationInMillis", default=None)
    id: Optional[str] = Field(alias="id", default=None)
    result: Optional[str] = Field(alias="result", default=None)
    start_time: Optional[str] = Field(alias="startTime", default=None)

GenericResource.update_forward_refs()
