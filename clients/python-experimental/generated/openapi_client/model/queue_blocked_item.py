# coding: utf-8

"""
    Swaggy Jenkins

    Jenkins API clients generated from Swagger / Open API specification  # noqa: E501

    The version of the OpenAPI document: 1.1.2-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""

import re  # noqa: F401
import sys  # noqa: F401
import typing  # noqa: F401

from frozendict import frozendict  # noqa: F401

import decimal  # noqa: F401
from datetime import date, datetime  # noqa: F401
from frozendict import frozendict  # noqa: F401

from openapi_client.schemas import (  # noqa: F401
    AnyTypeSchema,
    ComposedSchema,
    DictSchema,
    ListSchema,
    StrSchema,
    IntSchema,
    Int32Schema,
    Int64Schema,
    Float32Schema,
    Float64Schema,
    NumberSchema,
    DateSchema,
    DateTimeSchema,
    DecimalSchema,
    BoolSchema,
    BinarySchema,
    NoneSchema,
    none_type,
    InstantiationMetadata,
    Unset,
    unset,
    ComposedBase,
    ListBase,
    DictBase,
    NoneBase,
    StrBase,
    IntBase,
    NumberBase,
    DateBase,
    DateTimeBase,
    BoolBase,
    BinaryBase,
    Schema,
    _SchemaValidator,
    _SchemaTypeChecker,
    _SchemaEnumMaker
)


class QueueBlockedItem(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    _class = StrSchema
    
    
    class actions(
        ListSchema
    ):
    
        @classmethod
        @property
        def _items(cls) -> typing.Type['CauseAction']:
            return CauseAction
    blocked = BoolSchema
    buildable = BoolSchema
    id = IntSchema
    inQueueSince = IntSchema
    params = StrSchema
    stuck = BoolSchema

    @classmethod
    @property
    def task(cls) -> typing.Type['FreeStyleProject']:
        return FreeStyleProject
    url = StrSchema
    why = StrSchema
    buildableStartMilliseconds = IntSchema


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        _class: typing.Union[_class, Unset] = unset,
        actions: typing.Union[actions, Unset] = unset,
        blocked: typing.Union[blocked, Unset] = unset,
        buildable: typing.Union[buildable, Unset] = unset,
        id: typing.Union[id, Unset] = unset,
        inQueueSince: typing.Union[inQueueSince, Unset] = unset,
        params: typing.Union[params, Unset] = unset,
        stuck: typing.Union[stuck, Unset] = unset,
        task: typing.Union['FreeStyleProject', Unset] = unset,
        url: typing.Union[url, Unset] = unset,
        why: typing.Union[why, Unset] = unset,
        buildableStartMilliseconds: typing.Union[buildableStartMilliseconds, Unset] = unset,
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'QueueBlockedItem':
        return super().__new__(
            cls,
            *args,
            _class=_class,
            actions=actions,
            blocked=blocked,
            buildable=buildable,
            id=id,
            inQueueSince=inQueueSince,
            params=params,
            stuck=stuck,
            task=task,
            url=url,
            why=why,
            buildableStartMilliseconds=buildableStartMilliseconds,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )

from openapi_client.model.cause_action import CauseAction
from openapi_client.model.free_style_project import FreeStyleProject
