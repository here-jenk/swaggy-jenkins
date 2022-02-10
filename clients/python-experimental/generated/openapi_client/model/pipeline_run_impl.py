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


class PipelineRunImpl(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    _class = StrSchema

    @classmethod
    @property
    def _links(cls) -> typing.Type['PipelineRunImpllinks']:
        return PipelineRunImpllinks
    durationInMillis = IntSchema
    enQueueTime = StrSchema
    endTime = StrSchema
    estimatedDurationInMillis = IntSchema
    id = StrSchema
    organization = StrSchema
    pipeline = StrSchema
    result = StrSchema
    runSummary = StrSchema
    startTime = StrSchema
    state = StrSchema
    type = StrSchema
    commitId = StrSchema


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        _class: typing.Union[_class, Unset] = unset,
        _links: typing.Union['PipelineRunImpllinks', Unset] = unset,
        durationInMillis: typing.Union[durationInMillis, Unset] = unset,
        enQueueTime: typing.Union[enQueueTime, Unset] = unset,
        endTime: typing.Union[endTime, Unset] = unset,
        estimatedDurationInMillis: typing.Union[estimatedDurationInMillis, Unset] = unset,
        id: typing.Union[id, Unset] = unset,
        organization: typing.Union[organization, Unset] = unset,
        pipeline: typing.Union[pipeline, Unset] = unset,
        result: typing.Union[result, Unset] = unset,
        runSummary: typing.Union[runSummary, Unset] = unset,
        startTime: typing.Union[startTime, Unset] = unset,
        state: typing.Union[state, Unset] = unset,
        type: typing.Union[type, Unset] = unset,
        commitId: typing.Union[commitId, Unset] = unset,
        _instantiation_metadata: typing.Optional[InstantiationMetadata] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'PipelineRunImpl':
        return super().__new__(
            cls,
            *args,
            _class=_class,
            _links=_links,
            durationInMillis=durationInMillis,
            enQueueTime=enQueueTime,
            endTime=endTime,
            estimatedDurationInMillis=estimatedDurationInMillis,
            id=id,
            organization=organization,
            pipeline=pipeline,
            result=result,
            runSummary=runSummary,
            startTime=startTime,
            state=state,
            type=type,
            commitId=commitId,
            _instantiation_metadata=_instantiation_metadata,
            **kwargs,
        )

from openapi_client.model.pipeline_run_impllinks import PipelineRunImpllinks
