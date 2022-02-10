# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.free_style_project import FreeStyleProject
from openapi_server import util


class ListView(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, description: str=None, jobs: List[FreeStyleProject]=None, name: str=None, url: str=None):
        """ListView - a model defined in OpenAPI

        :param _class: The _class of this ListView.
        :param description: The description of this ListView.
        :param jobs: The jobs of this ListView.
        :param name: The name of this ListView.
        :param url: The url of this ListView.
        """
        self.openapi_types = {
            '_class': str,
            'description': str,
            'jobs': List[FreeStyleProject],
            'name': str,
            'url': str
        }

        self.attribute_map = {
            '_class': '_class',
            'description': 'description',
            'jobs': 'jobs',
            'name': 'name',
            'url': 'url'
        }

        self.__class = _class
        self._description = description
        self._jobs = jobs
        self._name = name
        self._url = url

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ListView':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ListView of this ListView.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this ListView.


        :return: The _class of this ListView.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this ListView.


        :param _class: The _class of this ListView.
        :type _class: str
        """

        self.__class = _class

    @property
    def description(self):
        """Gets the description of this ListView.


        :return: The description of this ListView.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this ListView.


        :param description: The description of this ListView.
        :type description: str
        """

        self._description = description

    @property
    def jobs(self):
        """Gets the jobs of this ListView.


        :return: The jobs of this ListView.
        :rtype: List[FreeStyleProject]
        """
        return self._jobs

    @jobs.setter
    def jobs(self, jobs):
        """Sets the jobs of this ListView.


        :param jobs: The jobs of this ListView.
        :type jobs: List[FreeStyleProject]
        """

        self._jobs = jobs

    @property
    def name(self):
        """Gets the name of this ListView.


        :return: The name of this ListView.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ListView.


        :param name: The name of this ListView.
        :type name: str
        """

        self._name = name

    @property
    def url(self):
        """Gets the url of this ListView.


        :return: The url of this ListView.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this ListView.


        :param url: The url of this ListView.
        :type url: str
        """

        self._url = url
