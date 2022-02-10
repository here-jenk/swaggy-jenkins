# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.extension_class_impllinks import ExtensionClassImpllinks
from openapi_server import util


class ExtensionClassImpl(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, links: ExtensionClassImpllinks=None, classes: List[str]=None):
        """ExtensionClassImpl - a model defined in OpenAPI

        :param _class: The _class of this ExtensionClassImpl.
        :param links: The links of this ExtensionClassImpl.
        :param classes: The classes of this ExtensionClassImpl.
        """
        self.openapi_types = {
            '_class': str,
            'links': ExtensionClassImpllinks,
            'classes': List[str]
        }

        self.attribute_map = {
            '_class': '_class',
            'links': '_links',
            'classes': 'classes'
        }

        self.__class = _class
        self._links = links
        self._classes = classes

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ExtensionClassImpl':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ExtensionClassImpl of this ExtensionClassImpl.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this ExtensionClassImpl.


        :return: The _class of this ExtensionClassImpl.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this ExtensionClassImpl.


        :param _class: The _class of this ExtensionClassImpl.
        :type _class: str
        """

        self.__class = _class

    @property
    def links(self):
        """Gets the links of this ExtensionClassImpl.


        :return: The links of this ExtensionClassImpl.
        :rtype: ExtensionClassImpllinks
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this ExtensionClassImpl.


        :param links: The links of this ExtensionClassImpl.
        :type links: ExtensionClassImpllinks
        """

        self._links = links

    @property
    def classes(self):
        """Gets the classes of this ExtensionClassImpl.


        :return: The classes of this ExtensionClassImpl.
        :rtype: List[str]
        """
        return self._classes

    @classes.setter
    def classes(self, classes):
        """Sets the classes of this ExtensionClassImpl.


        :param classes: The classes of this ExtensionClassImpl.
        :type classes: List[str]
        """

        self._classes = classes
