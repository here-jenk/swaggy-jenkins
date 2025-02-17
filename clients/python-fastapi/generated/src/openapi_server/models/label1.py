# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401


class Label1(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    Label1 - a model defined in OpenAPI

        _class: The _class of this Label1 [Optional].
    """

    _class: Optional[str] = Field(alias="_class", default=None)

Label1.update_forward_refs()
