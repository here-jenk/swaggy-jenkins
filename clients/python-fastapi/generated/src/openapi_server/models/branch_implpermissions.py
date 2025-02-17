# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401


class BranchImplpermissions(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    BranchImplpermissions - a model defined in OpenAPI

        create: The create of this BranchImplpermissions [Optional].
        read: The read of this BranchImplpermissions [Optional].
        start: The start of this BranchImplpermissions [Optional].
        stop: The stop of this BranchImplpermissions [Optional].
        _class: The _class of this BranchImplpermissions [Optional].
    """

    create: Optional[bool] = Field(alias="create", default=None)
    read: Optional[bool] = Field(alias="read", default=None)
    start: Optional[bool] = Field(alias="start", default=None)
    stop: Optional[bool] = Field(alias="stop", default=None)
    _class: Optional[str] = Field(alias="_class", default=None)

BranchImplpermissions.update_forward_refs()
