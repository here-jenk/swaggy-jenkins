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


class ExtensionClassContainerImpl1(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    _class = StrSchema

    @classmethod
    @property
    def _links(cls) -> typing.Type['ExtensionClassContainerImpl1links']:
        return ExtensionClassContainerImpl1links

    @classmethod
    @property
    def map(cls) -> typing.Type['ExtensionClassContainerImpl1map']:
        return ExtensionClassContainerImpl1map


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        _class: typing.Union[_class, Unset] = unset,
        _links: typing.Union['ExtensionClassContainerImpl1links', Unset] = unset,
        map: typing.Union['ExtensionClassContainerImpl1map', Unset] = unset,
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'ExtensionClassContainerImpl1':
        return super().__new__(
            cls,
            *args,
            _class=_class,
            _links=_links,
            map=map,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )

from openapi_client.model.extension_class_container_impl1links import ExtensionClassContainerImpl1links
from openapi_client.model.extension_class_container_impl1map import ExtensionClassContainerImpl1map
