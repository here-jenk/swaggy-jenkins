# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401
from openapi_server.models.extension_class_container_impl1links import ExtensionClassContainerImpl1links
from openapi_server.models.extension_class_container_impl1map import ExtensionClassContainerImpl1map


class ExtensionClassContainerImpl1(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    ExtensionClassContainerImpl1 - a model defined in OpenAPI

        _class: The _class of this ExtensionClassContainerImpl1 [Optional].
        links: The links of this ExtensionClassContainerImpl1 [Optional].
        map: The map of this ExtensionClassContainerImpl1 [Optional].
    """

    _class: Optional[str] = Field(alias="_class", default=None)
    links: Optional[ExtensionClassContainerImpl1links] = Field(alias="_links", default=None)
    map: Optional[ExtensionClassContainerImpl1map] = Field(alias="map", default=None)

ExtensionClassContainerImpl1.update_forward_refs()
