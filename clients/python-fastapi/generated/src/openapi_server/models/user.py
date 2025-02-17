# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401


class User(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    User - a model defined in OpenAPI

        _class: The _class of this User [Optional].
        id: The id of this User [Optional].
        full_name: The full_name of this User [Optional].
        email: The email of this User [Optional].
        name: The name of this User [Optional].
    """

    _class: Optional[str] = Field(alias="_class", default=None)
    id: Optional[str] = Field(alias="id", default=None)
    full_name: Optional[str] = Field(alias="fullName", default=None)
    email: Optional[str] = Field(alias="email", default=None)
    name: Optional[str] = Field(alias="name", default=None)

User.update_forward_refs()
