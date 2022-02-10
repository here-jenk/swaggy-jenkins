# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.link import Link


class GithubRepositorieslinks(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    GithubRepositorieslinks - a model defined in OpenAPI

        _self: The _self of this GithubRepositorieslinks [Optional].
        _class: The _class of this GithubRepositorieslinks [Optional].
    """

    _self: Optional[Link] = None
    _class: Optional[str] = None

GithubRepositorieslinks.update_forward_refs()
