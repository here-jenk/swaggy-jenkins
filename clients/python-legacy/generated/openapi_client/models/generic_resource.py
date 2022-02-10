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


class GenericResource(object):
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
        'display_name': 'str',
        'duration_in_millis': 'int',
        'id': 'str',
        'result': 'str',
        'start_time': 'str'
    }

    attribute_map = {
        '_class': '_class',
        'display_name': 'displayName',
        'duration_in_millis': 'durationInMillis',
        'id': 'id',
        'result': 'result',
        'start_time': 'startTime'
    }

    def __init__(self, _class=None, display_name=None, duration_in_millis=None, id=None, result=None, start_time=None, local_vars_configuration=None):  # noqa: E501
        """GenericResource - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self.__class = None
        self._display_name = None
        self._duration_in_millis = None
        self._id = None
        self._result = None
        self._start_time = None
        self.discriminator = None

        if _class is not None:
            self._class = _class
        if display_name is not None:
            self.display_name = display_name
        if duration_in_millis is not None:
            self.duration_in_millis = duration_in_millis
        if id is not None:
            self.id = id
        if result is not None:
            self.result = result
        if start_time is not None:
            self.start_time = start_time

    @property
    def _class(self):
        """Gets the _class of this GenericResource.  # noqa: E501


        :return: The _class of this GenericResource.  # noqa: E501
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this GenericResource.


        :param _class: The _class of this GenericResource.  # noqa: E501
        :type _class: str
        """

        self.__class = _class

    @property
    def display_name(self):
        """Gets the display_name of this GenericResource.  # noqa: E501


        :return: The display_name of this GenericResource.  # noqa: E501
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """Sets the display_name of this GenericResource.


        :param display_name: The display_name of this GenericResource.  # noqa: E501
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def duration_in_millis(self):
        """Gets the duration_in_millis of this GenericResource.  # noqa: E501


        :return: The duration_in_millis of this GenericResource.  # noqa: E501
        :rtype: int
        """
        return self._duration_in_millis

    @duration_in_millis.setter
    def duration_in_millis(self, duration_in_millis):
        """Sets the duration_in_millis of this GenericResource.


        :param duration_in_millis: The duration_in_millis of this GenericResource.  # noqa: E501
        :type duration_in_millis: int
        """

        self._duration_in_millis = duration_in_millis

    @property
    def id(self):
        """Gets the id of this GenericResource.  # noqa: E501


        :return: The id of this GenericResource.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this GenericResource.


        :param id: The id of this GenericResource.  # noqa: E501
        :type id: str
        """

        self._id = id

    @property
    def result(self):
        """Gets the result of this GenericResource.  # noqa: E501


        :return: The result of this GenericResource.  # noqa: E501
        :rtype: str
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this GenericResource.


        :param result: The result of this GenericResource.  # noqa: E501
        :type result: str
        """

        self._result = result

    @property
    def start_time(self):
        """Gets the start_time of this GenericResource.  # noqa: E501


        :return: The start_time of this GenericResource.  # noqa: E501
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this GenericResource.


        :param start_time: The start_time of this GenericResource.  # noqa: E501
        :type start_time: str
        """

        self._start_time = start_time

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
        if not isinstance(other, GenericResource):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, GenericResource):
            return True

        return self.to_dict() != other.to_dict()
