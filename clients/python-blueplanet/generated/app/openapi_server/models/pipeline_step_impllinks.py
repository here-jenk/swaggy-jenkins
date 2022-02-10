# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.link import Link  # noqa: F401,E501
from openapi_server import util


class PipelineStepImpllinks(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, _self: Link=None, actions: Link=None, _class: str=None):  # noqa: E501
        """PipelineStepImpllinks - a model defined in Swagger

        :param _self: The _self of this PipelineStepImpllinks.  # noqa: E501
        :type _self: Link
        :param actions: The actions of this PipelineStepImpllinks.  # noqa: E501
        :type actions: Link
        :param _class: The _class of this PipelineStepImpllinks.  # noqa: E501
        :type _class: str
        """
        self.swagger_types = {
            '_self': Link,
            'actions': Link,
            '_class': str
        }

        self.attribute_map = {
            '_self': 'self',
            'actions': 'actions',
            '_class': '_class'
        }

        self.__self = _self
        self._actions = actions
        self.__class = _class

    @classmethod
    def from_dict(cls, dikt) -> 'PipelineStepImpllinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PipelineStepImpllinks of this PipelineStepImpllinks.  # noqa: E501
        :rtype: PipelineStepImpllinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _self(self) -> Link:
        """Gets the _self of this PipelineStepImpllinks.


        :return: The _self of this PipelineStepImpllinks.
        :rtype: Link
        """
        return self.__self

    @_self.setter
    def _self(self, _self: Link):
        """Sets the _self of this PipelineStepImpllinks.


        :param _self: The _self of this PipelineStepImpllinks.
        :type _self: Link
        """

        self.__self = _self

    @property
    def actions(self) -> Link:
        """Gets the actions of this PipelineStepImpllinks.


        :return: The actions of this PipelineStepImpllinks.
        :rtype: Link
        """
        return self._actions

    @actions.setter
    def actions(self, actions: Link):
        """Sets the actions of this PipelineStepImpllinks.


        :param actions: The actions of this PipelineStepImpllinks.
        :type actions: Link
        """

        self._actions = actions

    @property
    def _class(self) -> str:
        """Gets the _class of this PipelineStepImpllinks.


        :return: The _class of this PipelineStepImpllinks.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this PipelineStepImpllinks.


        :param _class: The _class of this PipelineStepImpllinks.
        :type _class: str
        """

        self.__class = _class
