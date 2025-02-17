# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401
from openapi_server.models.github_repositories import GithubRepositories
from openapi_server.models.github_respository_containerlinks import GithubRespositoryContainerlinks


class GithubRespositoryContainer(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    GithubRespositoryContainer - a model defined in OpenAPI

        _class: The _class of this GithubRespositoryContainer [Optional].
        links: The links of this GithubRespositoryContainer [Optional].
        repositories: The repositories of this GithubRespositoryContainer [Optional].
    """

    _class: Optional[str] = Field(alias="_class", default=None)
    links: Optional[GithubRespositoryContainerlinks] = Field(alias="_links", default=None)
    repositories: Optional[GithubRepositories] = Field(alias="repositories", default=None)

GithubRespositoryContainer.update_forward_refs()
