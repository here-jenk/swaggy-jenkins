# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.github_repositories import GithubRepositories
from openapi_server.models.github_respository_containerlinks import GithubRespositoryContainerlinks
from openapi_server import util


class GithubRespositoryContainer(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, links: GithubRespositoryContainerlinks=None, repositories: GithubRepositories=None):
        """GithubRespositoryContainer - a model defined in OpenAPI

        :param _class: The _class of this GithubRespositoryContainer.
        :param links: The links of this GithubRespositoryContainer.
        :param repositories: The repositories of this GithubRespositoryContainer.
        """
        self.openapi_types = {
            '_class': str,
            'links': GithubRespositoryContainerlinks,
            'repositories': GithubRepositories
        }

        self.attribute_map = {
            '_class': '_class',
            'links': '_links',
            'repositories': 'repositories'
        }

        self.__class = _class
        self._links = links
        self._repositories = repositories

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GithubRespositoryContainer':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GithubRespositoryContainer of this GithubRespositoryContainer.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this GithubRespositoryContainer.


        :return: The _class of this GithubRespositoryContainer.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this GithubRespositoryContainer.


        :param _class: The _class of this GithubRespositoryContainer.
        :type _class: str
        """

        self.__class = _class

    @property
    def links(self):
        """Gets the links of this GithubRespositoryContainer.


        :return: The links of this GithubRespositoryContainer.
        :rtype: GithubRespositoryContainerlinks
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this GithubRespositoryContainer.


        :param links: The links of this GithubRespositoryContainer.
        :type links: GithubRespositoryContainerlinks
        """

        self._links = links

    @property
    def repositories(self):
        """Gets the repositories of this GithubRespositoryContainer.


        :return: The repositories of this GithubRespositoryContainer.
        :rtype: GithubRepositories
        """
        return self._repositories

    @repositories.setter
    def repositories(self, repositories):
        """Sets the repositories of this GithubRespositoryContainer.


        :param repositories: The repositories of this GithubRespositoryContainer.
        :type repositories: GithubRepositories
        """

        self._repositories = repositories
