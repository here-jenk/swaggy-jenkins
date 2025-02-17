# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401
from openapi_server.models.link import Link


class PipelineImpllinks(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    PipelineImpllinks - a model defined in OpenAPI

        runs: The runs of this PipelineImpllinks [Optional].
        _self: The _self of this PipelineImpllinks [Optional].
        queue: The queue of this PipelineImpllinks [Optional].
        actions: The actions of this PipelineImpllinks [Optional].
        _class: The _class of this PipelineImpllinks [Optional].
    """

    runs: Optional[Link] = Field(alias="runs", default=None)
    _self: Optional[Link] = Field(alias="self", default=None)
    queue: Optional[Link] = Field(alias="queue", default=None)
    actions: Optional[Link] = Field(alias="actions", default=None)
    _class: Optional[str] = Field(alias="_class", default=None)

PipelineImpllinks.update_forward_refs()
