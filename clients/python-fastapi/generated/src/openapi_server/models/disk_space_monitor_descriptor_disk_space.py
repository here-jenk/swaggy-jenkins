# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401


class DiskSpaceMonitorDescriptorDiskSpace(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    DiskSpaceMonitorDescriptorDiskSpace - a model defined in OpenAPI

        _class: The _class of this DiskSpaceMonitorDescriptorDiskSpace [Optional].
        timestamp: The timestamp of this DiskSpaceMonitorDescriptorDiskSpace [Optional].
        path: The path of this DiskSpaceMonitorDescriptorDiskSpace [Optional].
        size: The size of this DiskSpaceMonitorDescriptorDiskSpace [Optional].
    """

    _class: Optional[str] = None
    timestamp: Optional[int] = None
    path: Optional[str] = None
    size: Optional[int] = None

DiskSpaceMonitorDescriptorDiskSpace.update_forward_refs()
