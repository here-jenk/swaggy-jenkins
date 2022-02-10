# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.github_scmlinks import GithubScmlinks  # noqa: F401,E501
from openapi_server import util


class GithubScm(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, links: GithubScmlinks=None, credential_id: str=None, id: str=None, uri: str=None):  # noqa: E501
        """GithubScm - a model defined in Swagger

        :param _class: The _class of this GithubScm.  # noqa: E501
        :type _class: str
        :param links: The links of this GithubScm.  # noqa: E501
        :type links: GithubScmlinks
        :param credential_id: The credential_id of this GithubScm.  # noqa: E501
        :type credential_id: str
        :param id: The id of this GithubScm.  # noqa: E501
        :type id: str
        :param uri: The uri of this GithubScm.  # noqa: E501
        :type uri: str
        """
        self.swagger_types = {
            '_class': str,
            'links': GithubScmlinks,
            'credential_id': str,
            'id': str,
            'uri': str
        }

        self.attribute_map = {
            '_class': '_class',
            'links': '_links',
            'credential_id': 'credentialId',
            'id': 'id',
            'uri': 'uri'
        }

        self.__class = _class
        self._links = links
        self._credential_id = credential_id
        self._id = id
        self._uri = uri

    @classmethod
    def from_dict(cls, dikt) -> 'GithubScm':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GithubScm of this GithubScm.  # noqa: E501
        :rtype: GithubScm
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self) -> str:
        """Gets the _class of this GithubScm.


        :return: The _class of this GithubScm.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this GithubScm.


        :param _class: The _class of this GithubScm.
        :type _class: str
        """

        self.__class = _class

    @property
    def links(self) -> GithubScmlinks:
        """Gets the links of this GithubScm.


        :return: The links of this GithubScm.
        :rtype: GithubScmlinks
        """
        return self._links

    @links.setter
    def links(self, links: GithubScmlinks):
        """Sets the links of this GithubScm.


        :param links: The links of this GithubScm.
        :type links: GithubScmlinks
        """

        self._links = links

    @property
    def credential_id(self) -> str:
        """Gets the credential_id of this GithubScm.


        :return: The credential_id of this GithubScm.
        :rtype: str
        """
        return self._credential_id

    @credential_id.setter
    def credential_id(self, credential_id: str):
        """Sets the credential_id of this GithubScm.


        :param credential_id: The credential_id of this GithubScm.
        :type credential_id: str
        """

        self._credential_id = credential_id

    @property
    def id(self) -> str:
        """Gets the id of this GithubScm.


        :return: The id of this GithubScm.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this GithubScm.


        :param id: The id of this GithubScm.
        :type id: str
        """

        self._id = id

    @property
    def uri(self) -> str:
        """Gets the uri of this GithubScm.


        :return: The uri of this GithubScm.
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri: str):
        """Sets the uri of this GithubScm.


        :param uri: The uri of this GithubScm.
        :type uri: str
        """

        self._uri = uri
