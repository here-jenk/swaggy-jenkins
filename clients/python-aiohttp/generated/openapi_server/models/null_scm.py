# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class NullSCM(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None):
        """NullSCM - a model defined in OpenAPI

        :param _class: The _class of this NullSCM.
        """
        self.openapi_types = {
            '_class': str
        }

        self.attribute_map = {
            '_class': '_class'
        }

        self.__class = _class

    @classmethod
    def from_dict(cls, dikt: dict) -> 'NullSCM':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The NullSCM of this NullSCM.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this NullSCM.


        :return: The _class of this NullSCM.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this NullSCM.


        :param _class: The _class of this NullSCM.
        :type _class: str
        """

        self.__class = _class
