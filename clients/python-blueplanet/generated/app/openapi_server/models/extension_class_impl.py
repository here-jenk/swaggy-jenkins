# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.extension_class_impllinks import ExtensionClassImpllinks  # noqa: F401,E501
from openapi_server import util


class ExtensionClassImpl(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, links: ExtensionClassImpllinks=None, classes: List[str]=None):  # noqa: E501
        """ExtensionClassImpl - a model defined in Swagger

        :param _class: The _class of this ExtensionClassImpl.  # noqa: E501
        :type _class: str
        :param links: The links of this ExtensionClassImpl.  # noqa: E501
        :type links: ExtensionClassImpllinks
        :param classes: The classes of this ExtensionClassImpl.  # noqa: E501
        :type classes: List[str]
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'ExtensionClassImpl':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ExtensionClassImpl of this ExtensionClassImpl.  # noqa: E501
        :rtype: ExtensionClassImpl
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self) -> str:
        """Gets the _class of this ExtensionClassImpl.


        :return: The _class of this ExtensionClassImpl.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this ExtensionClassImpl.


        :param _class: The _class of this ExtensionClassImpl.
        :type _class: str
        """

        self.__class = _class

    @property
    def links(self) -> ExtensionClassImpllinks:
        """Gets the links of this ExtensionClassImpl.


        :return: The links of this ExtensionClassImpl.
        :rtype: ExtensionClassImpllinks
        """
        return self._links

    @links.setter
    def links(self, links: ExtensionClassImpllinks):
        """Sets the links of this ExtensionClassImpl.


        :param links: The links of this ExtensionClassImpl.
        :type links: ExtensionClassImpllinks
        """

        self._links = links

    @property
    def classes(self) -> List[str]:
        """Gets the classes of this ExtensionClassImpl.


        :return: The classes of this ExtensionClassImpl.
        :rtype: List[str]
        """
        return self._classes

    @classes.setter
    def classes(self, classes: List[str]):
        """Sets the classes of this ExtensionClassImpl.


        :param classes: The classes of this ExtensionClassImpl.
        :type classes: List[str]
        """

        self._classes = classes
