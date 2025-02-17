# coding: utf-8

"""
    Swaggy Jenkins

    Jenkins API clients generated from Swagger / Open API specification  # noqa: E501

    The version of the OpenAPI document: 1.5.1-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""


try:
    from inspect import getfullargspec
except ImportError:
    from inspect import getargspec as getfullargspec
import pprint
import re  # noqa: F401
import six

from openapi_client.configuration import Configuration


class GithubOrganization(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        '_class': 'str',
        'links': 'GithubOrganizationlinks',
        'jenkins_organization_pipeline': 'bool',
        'name': 'str'
    }

    attribute_map = {
        '_class': '_class',
        'links': '_links',
        'jenkins_organization_pipeline': 'jenkinsOrganizationPipeline',
        'name': 'name'
    }

    def __init__(self, _class=None, links=None, jenkins_organization_pipeline=None, name=None, local_vars_configuration=None):  # noqa: E501
        """GithubOrganization - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self.__class = None
        self._links = None
        self._jenkins_organization_pipeline = None
        self._name = None
        self.discriminator = None

        if _class is not None:
            self._class = _class
        if links is not None:
            self.links = links
        if jenkins_organization_pipeline is not None:
            self.jenkins_organization_pipeline = jenkins_organization_pipeline
        if name is not None:
            self.name = name

    @property
    def _class(self):
        """Gets the _class of this GithubOrganization.  # noqa: E501


        :return: The _class of this GithubOrganization.  # noqa: E501
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this GithubOrganization.


        :param _class: The _class of this GithubOrganization.  # noqa: E501
        :type _class: str
        """

        self.__class = _class

    @property
    def links(self):
        """Gets the links of this GithubOrganization.  # noqa: E501


        :return: The links of this GithubOrganization.  # noqa: E501
        :rtype: GithubOrganizationlinks
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this GithubOrganization.


        :param links: The links of this GithubOrganization.  # noqa: E501
        :type links: GithubOrganizationlinks
        """

        self._links = links

    @property
    def jenkins_organization_pipeline(self):
        """Gets the jenkins_organization_pipeline of this GithubOrganization.  # noqa: E501


        :return: The jenkins_organization_pipeline of this GithubOrganization.  # noqa: E501
        :rtype: bool
        """
        return self._jenkins_organization_pipeline

    @jenkins_organization_pipeline.setter
    def jenkins_organization_pipeline(self, jenkins_organization_pipeline):
        """Sets the jenkins_organization_pipeline of this GithubOrganization.


        :param jenkins_organization_pipeline: The jenkins_organization_pipeline of this GithubOrganization.  # noqa: E501
        :type jenkins_organization_pipeline: bool
        """

        self._jenkins_organization_pipeline = jenkins_organization_pipeline

    @property
    def name(self):
        """Gets the name of this GithubOrganization.  # noqa: E501


        :return: The name of this GithubOrganization.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this GithubOrganization.


        :param name: The name of this GithubOrganization.  # noqa: E501
        :type name: str
        """

        self._name = name

    def to_dict(self, serialize=False):
        """Returns the model properties as a dict"""
        result = {}

        def convert(x):
            if hasattr(x, "to_dict"):
                args = getfullargspec(x.to_dict).args
                if len(args) == 1:
                    return x.to_dict()
                else:
                    return x.to_dict(serialize)
            else:
                return x

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            attr = self.attribute_map.get(attr, attr) if serialize else attr
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: convert(x),
                    value
                ))
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], convert(item[1])),
                    value.items()
                ))
            else:
                result[attr] = convert(value)

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, GithubOrganization):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, GithubOrganization):
            return True

        return self.to_dict() != other.to_dict()
