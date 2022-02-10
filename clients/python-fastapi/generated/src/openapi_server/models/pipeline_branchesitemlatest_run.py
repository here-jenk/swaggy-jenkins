# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


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

    duration_in_millis: Optional[int] = None
    estimated_duration_in_millis: Optional[int] = None
    en_queue_time: Optional[str] = None
    end_time: Optional[str] = None
    id: Optional[str] = None
    organization: Optional[str] = None
    pipeline: Optional[str] = None
    result: Optional[str] = None
    run_summary: Optional[str] = None
    start_time: Optional[str] = None
    state: Optional[str] = None
    type: Optional[str] = None
    commit_id: Optional[str] = None
    _class: Optional[str] = None

PipelineBranchesitemlatestRun.update_forward_refs()
