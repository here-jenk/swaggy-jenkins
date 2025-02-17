# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401


class PipelineBranchesitempullRequestlinks(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    PipelineBranchesitempullRequestlinks - a model defined in OpenAPI

        _self: The _self of this PipelineBranchesitempullRequestlinks [Optional].
        _class: The _class of this PipelineBranchesitempullRequestlinks [Optional].
    """

    _self: Optional[str] = Field(alias="self", default=None)
    _class: Optional[str] = Field(alias="_class", default=None)

PipelineBranchesitempullRequestlinks.update_forward_refs()
