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


class FreeStyleProjecthealthReport(object):
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
        'description': 'str',
        'icon_class_name': 'str',
        'icon_url': 'str',
        'score': 'int',
        '_class': 'str'
    }

    attribute_map = {
        'description': 'description',
        'icon_class_name': 'iconClassName',
        'icon_url': 'iconUrl',
        'score': 'score',
        '_class': '_class'
    }

    def __init__(self, description=None, icon_class_name=None, icon_url=None, score=None, _class=None, local_vars_configuration=None):  # noqa: E501
        """FreeStyleProjecthealthReport - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._description = None
        self._icon_class_name = None
        self._icon_url = None
        self._score = None
        self.__class = None
        self.discriminator = None

        if description is not None:
            self.description = description
        if icon_class_name is not None:
            self.icon_class_name = icon_class_name
        if icon_url is not None:
            self.icon_url = icon_url
        if score is not None:
            self.score = score
        if _class is not None:
            self._class = _class

    @property
    def description(self):
        """Gets the description of this FreeStyleProjecthealthReport.  # noqa: E501


        :return: The description of this FreeStyleProjecthealthReport.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this FreeStyleProjecthealthReport.


        :param description: The description of this FreeStyleProjecthealthReport.  # noqa: E501
        :type description: str
        """

        self._description = description

    @property
    def icon_class_name(self):
        """Gets the icon_class_name of this FreeStyleProjecthealthReport.  # noqa: E501


        :return: The icon_class_name of this FreeStyleProjecthealthReport.  # noqa: E501
        :rtype: str
        """
        return self._icon_class_name

    @icon_class_name.setter
    def icon_class_name(self, icon_class_name):
        """Sets the icon_class_name of this FreeStyleProjecthealthReport.


        :param icon_class_name: The icon_class_name of this FreeStyleProjecthealthReport.  # noqa: E501
        :type icon_class_name: str
        """

        self._icon_class_name = icon_class_name

    @property
    def icon_url(self):
        """Gets the icon_url of this FreeStyleProjecthealthReport.  # noqa: E501


        :return: The icon_url of this FreeStyleProjecthealthReport.  # noqa: E501
        :rtype: str
        """
        return self._icon_url

    @icon_url.setter
    def icon_url(self, icon_url):
        """Sets the icon_url of this FreeStyleProjecthealthReport.


        :param icon_url: The icon_url of this FreeStyleProjecthealthReport.  # noqa: E501
        :type icon_url: str
        """

        self._icon_url = icon_url

    @property
    def score(self):
        """Gets the score of this FreeStyleProjecthealthReport.  # noqa: E501


        :return: The score of this FreeStyleProjecthealthReport.  # noqa: E501
        :rtype: int
        """
        return self._score

    @score.setter
    def score(self, score):
        """Sets the score of this FreeStyleProjecthealthReport.


        :param score: The score of this FreeStyleProjecthealthReport.  # noqa: E501
        :type score: int
        """

        self._score = score

    @property
    def _class(self):
        """Gets the _class of this FreeStyleProjecthealthReport.  # noqa: E501


        :return: The _class of this FreeStyleProjecthealthReport.  # noqa: E501
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this FreeStyleProjecthealthReport.


        :param _class: The _class of this FreeStyleProjecthealthReport.  # noqa: E501
        :type _class: str
        """

        self.__class = _class

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
        if not isinstance(other, FreeStyleProjecthealthReport):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, FreeStyleProjecthealthReport):
            return True

        return self.to_dict() != other.to_dict()
