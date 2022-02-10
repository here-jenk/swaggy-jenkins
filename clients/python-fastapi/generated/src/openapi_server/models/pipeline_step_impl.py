# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.input_step_impl import InputStepImpl
from openapi_server.models.pipeline_step_impllinks import PipelineStepImpllinks


class PipelineStepImpl(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    PipelineStepImpl - a model defined in OpenAPI

        _class: The _class of this PipelineStepImpl [Optional].
        links: The links of this PipelineStepImpl [Optional].
        display_name: The display_name of this PipelineStepImpl [Optional].
        duration_in_millis: The duration_in_millis of this PipelineStepImpl [Optional].
        id: The id of this PipelineStepImpl [Optional].
        input: The input of this PipelineStepImpl [Optional].
        result: The result of this PipelineStepImpl [Optional].
        start_time: The start_time of this PipelineStepImpl [Optional].
        state: The state of this PipelineStepImpl [Optional].
    """

    _class: Optional[str] = None
    links: Optional[PipelineStepImpllinks] = None
    display_name: Optional[str] = None
    duration_in_millis: Optional[int] = None
    id: Optional[str] = None
    input: Optional[InputStepImpl] = None
    result: Optional[str] = None
    start_time: Optional[str] = None
    state: Optional[str] = None

PipelineStepImpl.update_forward_refs()
