# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.link import Link
from openapi_server import util

from openapi_server.models.link import Link  # noqa: E501

class InputStepImpllinks(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _self=None, _class=None):  # noqa: E501
        """InputStepImpllinks - a model defined in OpenAPI

        :param _self: The _self of this InputStepImpllinks.  # noqa: E501
        :type _self: Link
        :param _class: The _class of this InputStepImpllinks.  # noqa: E501
        :type _class: str
        """
        self.openapi_types = {
            '_self': Link,
            '_class': str
        }

        self.attribute_map = {
            '_self': 'self',
            '_class': '_class'
        }

        self.__self = _self
        self.__class = _class

    @classmethod
    def from_dict(cls, dikt) -> 'InputStepImpllinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The InputStepImpllinks of this InputStepImpllinks.  # noqa: E501
        :rtype: InputStepImpllinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _self(self):
        """Gets the _self of this InputStepImpllinks.


        :return: The _self of this InputStepImpllinks.
        :rtype: Link
        """
        return self.__self

    @_self.setter
    def _self(self, _self):
        """Sets the _self of this InputStepImpllinks.


        :param _self: The _self of this InputStepImpllinks.
        :type _self: Link
        """

        self.__self = _self

    @property
    def _class(self):
        """Gets the _class of this InputStepImpllinks.


        :return: The _class of this InputStepImpllinks.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this InputStepImpllinks.


        :param _class: The _class of this InputStepImpllinks.
        :type _class: str
        """

        self.__class = _class
