# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401


class PipelineBranchesitemlatestRun(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    PipelineBranchesitemlatestRun - a model defined in OpenAPI

        duration_in_millis: The duration_in_millis of this PipelineBranchesitemlatestRun [Optional].
        estimated_duration_in_millis: The estimated_duration_in_millis of this PipelineBranchesitemlatestRun [Optional].
        en_queue_time: The en_queue_time of this PipelineBranchesitemlatestRun [Optional].
        end_time: The end_time of this PipelineBranchesitemlatestRun [Optional].
        id: The id of this PipelineBranchesitemlatestRun [Optional].
        organization: The organization of this PipelineBranchesitemlatestRun [Optional].
        pipeline: The pipeline of this PipelineBranchesitemlatestRun [Optional].
        result: The result of this PipelineBranchesitemlatestRun [Optional].
        run_summary: The run_summary of this PipelineBranchesitemlatestRun [Optional].
        start_time: The start_time of this PipelineBranchesitemlatestRun [Optional].
        state: The state of this PipelineBranchesitemlatestRun [Optional].
        type: The type of this PipelineBranchesitemlatestRun [Optional].
        commit_id: The commit_id of this PipelineBranchesitemlatestRun [Optional].
        _class: The _class of this PipelineBranchesitemlatestRun [Optional].
    """

    duration_in_millis: Optional[int] = Field(alias="durationInMillis", default=None)
    estimated_duration_in_millis: Optional[int] = Field(alias="estimatedDurationInMillis", default=None)
    en_queue_time: Optional[str] = Field(alias="enQueueTime", default=None)
    end_time: Optional[str] = Field(alias="endTime", default=None)
    id: Optional[str] = Field(alias="id", default=None)
    organization: Optional[str] = Field(alias="organization", default=None)
    pipeline: Optional[str] = Field(alias="pipeline", default=None)
    result: Optional[str] = Field(alias="result", default=None)
    run_summary: Optional[str] = Field(alias="runSummary", default=None)
    start_time: Optional[str] = Field(alias="startTime", default=None)
    state: Optional[str] = Field(alias="state", default=None)
    type: Optional[str] = Field(alias="type", default=None)
    commit_id: Optional[str] = Field(alias="commitId", default=None)
    _class: Optional[str] = Field(alias="_class", default=None)

PipelineBranchesitemlatestRun.update_forward_refs()
