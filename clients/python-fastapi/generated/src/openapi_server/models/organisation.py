# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401


class Organisation(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    Organisation - a model defined in OpenAPI

        _class: The _class of this Organisation [Optional].
        name: The name of this Organisation [Optional].
    """

    _class: Optional[str] = Field(alias="_class", default=None)
    name: Optional[str] = Field(alias="name", default=None)

Organisation.update_forward_refs()
