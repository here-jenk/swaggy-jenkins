# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class AllView(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, name: str=None, url: str=None):  # noqa: E501
        """AllView - a model defined in Swagger

        :param _class: The _class of this AllView.  # noqa: E501
        :type _class: str
        :param name: The name of this AllView.  # noqa: E501
        :type name: str
        :param url: The url of this AllView.  # noqa: E501
        :type url: str
        """
        self.swagger_types = {
            '_class': str,
            'name': str,
            'url': str
        }

        self.attribute_map = {
            '_class': '_class',
            'name': 'name',
            'url': 'url'
        }

        self.__class = _class
        self._name = name
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'AllView':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AllView of this AllView.  # noqa: E501
        :rtype: AllView
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self) -> str:
        """Gets the _class of this AllView.


        :return: The _class of this AllView.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this AllView.


        :param _class: The _class of this AllView.
        :type _class: str
        """

        self.__class = _class

    @property
    def name(self) -> str:
        """Gets the name of this AllView.


        :return: The name of this AllView.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this AllView.


        :param name: The name of this AllView.
        :type name: str
        """

        self._name = name

    @property
    def url(self) -> str:
        """Gets the url of this AllView.


        :return: The url of this AllView.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this AllView.


        :param url: The url of this AllView.
        :type url: str
        """

        self._url = url
