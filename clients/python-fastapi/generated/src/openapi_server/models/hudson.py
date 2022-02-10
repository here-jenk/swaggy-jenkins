# coding: utf-8

from __future__ import annotations
from datetime import date, datetime  # noqa: F401

import re  # noqa: F401
from typing import Any, Dict, List, Optional  # noqa: F401

from pydantic import AnyUrl, BaseModel, EmailStr, validator  # noqa: F401
from openapi_server.models.all_view import AllView
from openapi_server.models.free_style_project import FreeStyleProject
from openapi_server.models.hudsonassigned_labels import HudsonassignedLabels
from openapi_server.models.unlabeled_load_statistics import UnlabeledLoadStatistics


class Hudson(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.

    Hudson - a model defined in OpenAPI

        _class: The _class of this Hudson [Optional].
        assigned_labels: The assigned_labels of this Hudson [Optional].
        mode: The mode of this Hudson [Optional].
        node_description: The node_description of this Hudson [Optional].
        node_name: The node_name of this Hudson [Optional].
        num_executors: The num_executors of this Hudson [Optional].
        description: The description of this Hudson [Optional].
        jobs: The jobs of this Hudson [Optional].
        primary_view: The primary_view of this Hudson [Optional].
        quieting_down: The quieting_down of this Hudson [Optional].
        slave_agent_port: The slave_agent_port of this Hudson [Optional].
        unlabeled_load: The unlabeled_load of this Hudson [Optional].
        use_crumbs: The use_crumbs of this Hudson [Optional].
        use_security: The use_security of this Hudson [Optional].
        views: The views of this Hudson [Optional].
    """

    _class: Optional[str] = None
    assigned_labels: Optional[List[HudsonassignedLabels]] = None
    mode: Optional[str] = None
    node_description: Optional[str] = None
    node_name: Optional[str] = None
    num_executors: Optional[int] = None
    description: Optional[str] = None
    jobs: Optional[List[FreeStyleProject]] = None
    primary_view: Optional[AllView] = None
    quieting_down: Optional[bool] = None
    slave_agent_port: Optional[int] = None
    unlabeled_load: Optional[UnlabeledLoadStatistics] = None
    use_crumbs: Optional[bool] = None
    use_security: Optional[bool] = None
    views: Optional[List[AllView]] = None

Hudson.update_forward_refs()
