# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class Organisation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, name: str=None):
        """Organisation - a model defined in OpenAPI

        :param _class: The _class of this Organisation.
        :param name: The name of this Organisation.
        """
        self.openapi_types = {
            '_class': str,
            'name': str
        }

        self.attribute_map = {
            '_class': '_class',
            'name': 'name'
        }

        self.__class = _class
        self._name = name

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Organisation':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Organisation of this Organisation.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this Organisation.


        :return: The _class of this Organisation.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this Organisation.


        :param _class: The _class of this Organisation.
        :type _class: str
        """

        self.__class = _class

    @property
    def name(self):
        """Gets the name of this Organisation.


        :return: The name of this Organisation.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Organisation.


        :param name: The name of this Organisation.
        :type name: str
        """

        self._name = name
