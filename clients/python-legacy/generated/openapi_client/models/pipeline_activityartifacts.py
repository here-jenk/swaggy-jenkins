# coding: utf-8

"""
    Swaggy Jenkins

    Jenkins API clients generated from Swagger / Open API specification  # noqa: E501

    The version of the OpenAPI document: 1.1.2-pre.0
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


class PipelineActivityartifacts(object):
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
        'name': 'str',
        'size': 'int',
        'url': 'str',
        '_class': 'str'
    }

    attribute_map = {
        'name': 'name',
        'size': 'size',
        'url': 'url',
        '_class': '_class'
    }

    def __init__(self, name=None, size=None, url=None, _class=None, local_vars_configuration=None):  # noqa: E501
        """PipelineActivityartifacts - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._name = None
        self._size = None
        self._url = None
        self.__class = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if size is not None:
            self.size = size
        if url is not None:
            self.url = url
        if _class is not None:
            self._class = _class

    @property
    def name(self):
        """Gets the name of this PipelineActivityartifacts.  # noqa: E501


        :return: The name of this PipelineActivityartifacts.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this PipelineActivityartifacts.


        :param name: The name of this PipelineActivityartifacts.  # noqa: E501
        :type name: str
        """

        self._name = name

    @property
    def size(self):
        """Gets the size of this PipelineActivityartifacts.  # noqa: E501


        :return: The size of this PipelineActivityartifacts.  # noqa: E501
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size):
        """Sets the size of this PipelineActivityartifacts.


        :param size: The size of this PipelineActivityartifacts.  # noqa: E501
        :type size: int
        """

        self._size = size

    @property
    def url(self):
        """Gets the url of this PipelineActivityartifacts.  # noqa: E501


        :return: The url of this PipelineActivityartifacts.  # noqa: E501
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this PipelineActivityartifacts.


        :param url: The url of this PipelineActivityartifacts.  # noqa: E501
        :type url: str
        """

        self._url = url

    @property
    def _class(self):
        """Gets the _class of this PipelineActivityartifacts.  # noqa: E501


        :return: The _class of this PipelineActivityartifacts.  # noqa: E501
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this PipelineActivityartifacts.


        :param _class: The _class of this PipelineActivityartifacts.  # noqa: E501
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
        if not isinstance(other, PipelineActivityartifacts):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PipelineActivityartifacts):
            return True

        return self.to_dict() != other.to_dict()
