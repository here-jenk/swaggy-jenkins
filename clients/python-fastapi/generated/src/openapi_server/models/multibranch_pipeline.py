# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class MultibranchPipeline(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    MultibranchPipeline - a model defined in OpenAPI

        display_name: The display_name of this MultibranchPipeline [Optional].
        estimated_duration_in_millis: The estimated_duration_in_millis of this MultibranchPipeline [Optional].
        latest_run: The latest_run of this MultibranchPipeline [Optional].
        name: The name of this MultibranchPipeline [Optional].
        organization: The organization of this MultibranchPipeline [Optional].
        weather_score: The weather_score of this MultibranchPipeline [Optional].
        branch_names: The branch_names of this MultibranchPipeline [Optional].
        number_of_failing_branches: The number_of_failing_branches of this MultibranchPipeline [Optional].
        number_of_failing_pull_requests: The number_of_failing_pull_requests of this MultibranchPipeline [Optional].
        number_of_successful_branches: The number_of_successful_branches of this MultibranchPipeline [Optional].
        number_of_successful_pull_requests: The number_of_successful_pull_requests of this MultibranchPipeline [Optional].
        total_number_of_branches: The total_number_of_branches of this MultibranchPipeline [Optional].
        total_number_of_pull_requests: The total_number_of_pull_requests of this MultibranchPipeline [Optional].
        _class: The _class of this MultibranchPipeline [Optional].
    """

    display_name: Optional[str] = None
    estimated_duration_in_millis: Optional[int] = None
    latest_run: Optional[str] = None
    name: Optional[str] = None
    organization: Optional[str] = None
    weather_score: Optional[int] = None
    branch_names: Optional[List[str]] = None
    number_of_failing_branches: Optional[int] = None
    number_of_failing_pull_requests: Optional[int] = None
    number_of_successful_branches: Optional[int] = None
    number_of_successful_pull_requests: Optional[int] = None
    total_number_of_branches: Optional[int] = None
    total_number_of_pull_requests: Optional[int] = None
    _class: Optional[str] = None

MultibranchPipeline.update_forward_refs()
