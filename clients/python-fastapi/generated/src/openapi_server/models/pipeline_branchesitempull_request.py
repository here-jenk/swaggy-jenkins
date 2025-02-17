# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401
from openapi_server.models.pipeline_branchesitempull_requestlinks import PipelineBranchesitempullRequestlinks


class PipelineBranchesitempullRequest(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    PipelineBranchesitempullRequest - a model defined in OpenAPI

        links: The links of this PipelineBranchesitempullRequest [Optional].
        author: The author of this PipelineBranchesitempullRequest [Optional].
        id: The id of this PipelineBranchesitempullRequest [Optional].
        title: The title of this PipelineBranchesitempullRequest [Optional].
        url: The url of this PipelineBranchesitempullRequest [Optional].
        _class: The _class of this PipelineBranchesitempullRequest [Optional].
    """

    links: Optional[PipelineBranchesitempullRequestlinks] = Field(alias="_links", default=None)
    author: Optional[str] = Field(alias="author", default=None)
    id: Optional[str] = Field(alias="id", default=None)
    title: Optional[str] = Field(alias="title", default=None)
    url: Optional[str] = Field(alias="url", default=None)
    _class: Optional[str] = Field(alias="_class", default=None)

PipelineBranchesitempullRequest.update_forward_refs()
