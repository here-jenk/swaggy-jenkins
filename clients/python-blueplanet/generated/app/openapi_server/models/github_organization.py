# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.github_organizationlinks import GithubOrganizationlinks  # noqa: F401,E501
from openapi_server import util


class GithubOrganization(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, links: GithubOrganizationlinks=None, jenkins_organization_pipeline: bool=None, name: str=None):  # noqa: E501
        """GithubOrganization - a model defined in Swagger

        :param _class: The _class of this GithubOrganization.  # noqa: E501
        :type _class: str
        :param links: The links of this GithubOrganization.  # noqa: E501
        :type links: GithubOrganizationlinks
        :param jenkins_organization_pipeline: The jenkins_organization_pipeline of this GithubOrganization.  # noqa: E501
        :type jenkins_organization_pipeline: bool
        :param name: The name of this GithubOrganization.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
            '_class': str,
            'links': GithubOrganizationlinks,
            'jenkins_organization_pipeline': bool,
            'name': str
        }

        self.attribute_map = {
            '_class': '_class',
            'links': '_links',
            'jenkins_organization_pipeline': 'jenkinsOrganizationPipeline',
            'name': 'name'
        }

        self.__class = _class
        self._links = links
        self._jenkins_organization_pipeline = jenkins_organization_pipeline
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'GithubOrganization':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GithubOrganization of this GithubOrganization.  # noqa: E501
        :rtype: GithubOrganization
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self) -> str:
        """Gets the _class of this GithubOrganization.


        :return: The _class of this GithubOrganization.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this GithubOrganization.


        :param _class: The _class of this GithubOrganization.
        :type _class: str
        """

        self.__class = _class

    @property
    def links(self) -> GithubOrganizationlinks:
        """Gets the links of this GithubOrganization.


        :return: The links of this GithubOrganization.
        :rtype: GithubOrganizationlinks
        """
        return self._links

    @links.setter
    def links(self, links: GithubOrganizationlinks):
        """Sets the links of this GithubOrganization.


        :param links: The links of this GithubOrganization.
        :type links: GithubOrganizationlinks
        """

        self._links = links

    @property
    def jenkins_organization_pipeline(self) -> bool:
        """Gets the jenkins_organization_pipeline of this GithubOrganization.


        :return: The jenkins_organization_pipeline of this GithubOrganization.
        :rtype: bool
        """
        return self._jenkins_organization_pipeline

    @jenkins_organization_pipeline.setter
    def jenkins_organization_pipeline(self, jenkins_organization_pipeline: bool):
        """Sets the jenkins_organization_pipeline of this GithubOrganization.


        :param jenkins_organization_pipeline: The jenkins_organization_pipeline of this GithubOrganization.
        :type jenkins_organization_pipeline: bool
        """

        self._jenkins_organization_pipeline = jenkins_organization_pipeline

    @property
    def name(self) -> str:
        """Gets the name of this GithubOrganization.


        :return: The name of this GithubOrganization.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this GithubOrganization.


        :param name: The name of this GithubOrganization.
        :type name: str
        """

        self._name = name
