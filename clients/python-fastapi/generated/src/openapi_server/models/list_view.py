# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.free_style_project import FreeStyleProject


class ListView(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    ListView - a model defined in OpenAPI

        _class: The _class of this ListView [Optional].
        description: The description of this ListView [Optional].
        jobs: The jobs of this ListView [Optional].
        name: The name of this ListView [Optional].
        url: The url of this ListView [Optional].
    """

    _class: Optional[str] = None
    description: Optional[str] = None
    jobs: Optional[List[FreeStyleProject]] = None
    name: Optional[str] = None
    url: Optional[str] = None

ListView.update_forward_refs()
