# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, Field, validator  # noqa: F401
from openapi_server.models.extension_class_impl import ExtensionClassImpl


class ExtensionClassContainerImpl1map(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    ExtensionClassContainerImpl1map - a model defined in OpenAPI

        io_jenkins_blueocean_service_embedded_rest_pipeline_impl: The io_jenkins_blueocean_service_embedded_rest_pipeline_impl of this ExtensionClassContainerImpl1map [Optional].
        io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl: The io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl of this ExtensionClassContainerImpl1map [Optional].
        _class: The _class of this ExtensionClassContainerImpl1map [Optional].
    """

    io_jenkins_blueocean_service_embedded_rest_pipeline_impl: Optional[ExtensionClassImpl] = Field(alias="io.jenkins.blueocean.service.embedded.rest.PipelineImpl", default=None)
    io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl: Optional[ExtensionClassImpl] = Field(alias="io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl", default=None)
    _class: Optional[str] = Field(alias="_class", default=None)

ExtensionClassContainerImpl1map.update_forward_refs()
