# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.hudson_master_computer import HudsonMasterComputer


class ComputerSet(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    ComputerSet - a model defined in OpenAPI

        _class: The _class of this ComputerSet [Optional].
        busy_executors: The busy_executors of this ComputerSet [Optional].
        computer: The computer of this ComputerSet [Optional].
        display_name: The display_name of this ComputerSet [Optional].
        total_executors: The total_executors of this ComputerSet [Optional].
    """

    _class: Optional[str] = None
    busy_executors: Optional[int] = None
    computer: Optional[List[HudsonMasterComputer]] = None
    display_name: Optional[str] = None
    total_executors: Optional[int] = None

ComputerSet.update_forward_refs()
