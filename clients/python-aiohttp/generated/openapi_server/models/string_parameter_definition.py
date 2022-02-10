# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.string_parameter_value import StringParameterValue
from openapi_server import util


class StringParameterDefinition(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, default_parameter_value: StringParameterValue=None, description: str=None, name: str=None, type: str=None):
        """StringParameterDefinition - a model defined in OpenAPI

        :param _class: The _class of this StringParameterDefinition.
        :param default_parameter_value: The default_parameter_value of this StringParameterDefinition.
        :param description: The description of this StringParameterDefinition.
        :param name: The name of this StringParameterDefinition.
        :param type: The type of this StringParameterDefinition.
        """
        self.openapi_types = {
            '_class': str,
            'default_parameter_value': StringParameterValue,
            'description': str,
            'name': str,
            'type': str
        }

        self.attribute_map = {
            '_class': '_class',
            'default_parameter_value': 'defaultParameterValue',
            'description': 'description',
            'name': 'name',
            'type': 'type'
        }

        self.__class = _class
        self._default_parameter_value = default_parameter_value
        self._description = description
        self._name = name
        self._type = type

    @classmethod
    def from_dict(cls, dikt: dict) -> 'StringParameterDefinition':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The StringParameterDefinition of this StringParameterDefinition.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this StringParameterDefinition.


        :return: The _class of this StringParameterDefinition.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this StringParameterDefinition.


        :param _class: The _class of this StringParameterDefinition.
        :type _class: str
        """

        self.__class = _class

    @property
    def default_parameter_value(self):
        """Gets the default_parameter_value of this StringParameterDefinition.


        :return: The default_parameter_value of this StringParameterDefinition.
        :rtype: StringParameterValue
        """
        return self._default_parameter_value

    @default_parameter_value.setter
    def default_parameter_value(self, default_parameter_value):
        """Sets the default_parameter_value of this StringParameterDefinition.


        :param default_parameter_value: The default_parameter_value of this StringParameterDefinition.
        :type default_parameter_value: StringParameterValue
        """

        self._default_parameter_value = default_parameter_value

    @property
    def description(self):
        """Gets the description of this StringParameterDefinition.


        :return: The description of this StringParameterDefinition.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this StringParameterDefinition.


        :param description: The description of this StringParameterDefinition.
        :type description: str
        """

        self._description = description

    @property
    def name(self):
        """Gets the name of this StringParameterDefinition.


        :return: The name of this StringParameterDefinition.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this StringParameterDefinition.


        :param name: The name of this StringParameterDefinition.
        :type name: str
        """

        self._name = name

    @property
    def type(self):
        """Gets the type of this StringParameterDefinition.


        :return: The type of this StringParameterDefinition.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this StringParameterDefinition.


        :param type: The type of this StringParameterDefinition.
        :type type: str
        """

        self._type = type
