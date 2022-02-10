# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class GithubContent(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, name: str=None, sha: str=None, _class: str=None, repo: str=None, size: int=None, owner: str=None, path: str=None, base64_data: str=None):  # noqa: E501
        """GithubContent - a model defined in Swagger

        :param name: The name of this GithubContent.  # noqa: E501
        :type name: str
        :param sha: The sha of this GithubContent.  # noqa: E501
        :type sha: str
        :param _class: The _class of this GithubContent.  # noqa: E501
        :type _class: str
        :param repo: The repo of this GithubContent.  # noqa: E501
        :type repo: str
        :param size: The size of this GithubContent.  # noqa: E501
        :type size: int
        :param owner: The owner of this GithubContent.  # noqa: E501
        :type owner: str
        :param path: The path of this GithubContent.  # noqa: E501
        :type path: str
        :param base64_data: The base64_data of this GithubContent.  # noqa: E501
        :type base64_data: str
        """
        self.swagger_types = {
            'name': str,
            'sha': str,
            '_class': str,
            'repo': str,
            'size': int,
            'owner': str,
            'path': str,
            'base64_data': str
        }

        self.attribute_map = {
            'name': 'name',
            'sha': 'sha',
            '_class': '_class',
            'repo': 'repo',
            'size': 'size',
            'owner': 'owner',
            'path': 'path',
            'base64_data': 'base64Data'
        }

        self._name = name
        self._sha = sha
        self.__class = _class
        self._repo = repo
        self._size = size
        self._owner = owner
        self._path = path
        self._base64_data = base64_data

    @classmethod
    def from_dict(cls, dikt) -> 'GithubContent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GithubContent of this GithubContent.  # noqa: E501
        :rtype: GithubContent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this GithubContent.


        :return: The name of this GithubContent.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this GithubContent.


        :param name: The name of this GithubContent.
        :type name: str
        """

        self._name = name

    @property
    def sha(self) -> str:
        """Gets the sha of this GithubContent.


        :return: The sha of this GithubContent.
        :rtype: str
        """
        return self._sha

    @sha.setter
    def sha(self, sha: str):
        """Sets the sha of this GithubContent.


        :param sha: The sha of this GithubContent.
        :type sha: str
        """

        self._sha = sha

    @property
    def _class(self) -> str:
        """Gets the _class of this GithubContent.


        :return: The _class of this GithubContent.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this GithubContent.


        :param _class: The _class of this GithubContent.
        :type _class: str
        """

        self.__class = _class

    @property
    def repo(self) -> str:
        """Gets the repo of this GithubContent.


        :return: The repo of this GithubContent.
        :rtype: str
        """
        return self._repo

    @repo.setter
    def repo(self, repo: str):
        """Sets the repo of this GithubContent.


        :param repo: The repo of this GithubContent.
        :type repo: str
        """

        self._repo = repo

    @property
    def size(self) -> int:
        """Gets the size of this GithubContent.


        :return: The size of this GithubContent.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this GithubContent.


        :param size: The size of this GithubContent.
        :type size: int
        """

        self._size = size

    @property
    def owner(self) -> str:
        """Gets the owner of this GithubContent.


        :return: The owner of this GithubContent.
        :rtype: str
        """
        return self._owner

    @owner.setter
    def owner(self, owner: str):
        """Sets the owner of this GithubContent.


        :param owner: The owner of this GithubContent.
        :type owner: str
        """

        self._owner = owner

    @property
    def path(self) -> str:
        """Gets the path of this GithubContent.


        :return: The path of this GithubContent.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path: str):
        """Sets the path of this GithubContent.


        :param path: The path of this GithubContent.
        :type path: str
        """

        self._path = path

    @property
    def base64_data(self) -> str:
        """Gets the base64_data of this GithubContent.


        :return: The base64_data of this GithubContent.
        :rtype: str
        """
        return self._base64_data

    @base64_data.setter
    def base64_data(self, base64_data: str):
        """Sets the base64_data of this GithubContent.


        :param base64_data: The base64_data of this GithubContent.
        :type base64_data: str
        """

        self._base64_data = base64_data
