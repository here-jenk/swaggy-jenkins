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


class PipelineImpl(object):
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
        'estimated_duration_in_millis': 'int',
        'full_name': 'str',
        'latest_run': 'str',
        'name': 'str',
        'organization': 'str',
        'weather_score': 'int',
        'links': 'PipelineImpllinks'
    }

    attribute_map = {
        '_class': '_class',
        'display_name': 'displayName',
        'estimated_duration_in_millis': 'estimatedDurationInMillis',
        'full_name': 'fullName',
        'latest_run': 'latestRun',
        'name': 'name',
        'organization': 'organization',
        'weather_score': 'weatherScore',
        'links': '_links'
    }

    def __init__(self, _class=None, display_name=None, estimated_duration_in_millis=None, full_name=None, latest_run=None, name=None, organization=None, weather_score=None, links=None, local_vars_configuration=None):  # noqa: E501
        """PipelineImpl - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self.__class = None
        self._display_name = None
        self._estimated_duration_in_millis = None
        self._full_name = None
        self._latest_run = None
        self._name = None
        self._organization = None
        self._weather_score = None
        self._links = None
        self.discriminator = None

        if _class is not None:
            self._class = _class
        if display_name is not None:
            self.display_name = display_name
        if estimated_duration_in_millis is not None:
            self.estimated_duration_in_millis = estimated_duration_in_millis
        if full_name is not None:
            self.full_name = full_name
        if latest_run is not None:
            self.latest_run = latest_run
        if name is not None:
            self.name = name
        if organization is not None:
            self.organization = organization
        if weather_score is not None:
            self.weather_score = weather_score
        if links is not None:
            self.links = links

    @property
    def _class(self):
        """Gets the _class of this PipelineImpl.  # noqa: E501


        :return: The _class of this PipelineImpl.  # noqa: E501
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this PipelineImpl.


        :param _class: The _class of this PipelineImpl.  # noqa: E501
        :type _class: str
        """

        self.__class = _class

    @property
    def display_name(self):
        """Gets the display_name of this PipelineImpl.  # noqa: E501


        :return: The display_name of this PipelineImpl.  # noqa: E501
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """Sets the display_name of this PipelineImpl.


        :param display_name: The display_name of this PipelineImpl.  # noqa: E501
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def estimated_duration_in_millis(self):
        """Gets the estimated_duration_in_millis of this PipelineImpl.  # noqa: E501


        :return: The estimated_duration_in_millis of this PipelineImpl.  # noqa: E501
        :rtype: int
        """
        return self._estimated_duration_in_millis

    @estimated_duration_in_millis.setter
    def estimated_duration_in_millis(self, estimated_duration_in_millis):
        """Sets the estimated_duration_in_millis of this PipelineImpl.


        :param estimated_duration_in_millis: The estimated_duration_in_millis of this PipelineImpl.  # noqa: E501
        :type estimated_duration_in_millis: int
        """

        self._estimated_duration_in_millis = estimated_duration_in_millis

    @property
    def full_name(self):
        """Gets the full_name of this PipelineImpl.  # noqa: E501


        :return: The full_name of this PipelineImpl.  # noqa: E501
        :rtype: str
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """Sets the full_name of this PipelineImpl.


        :param full_name: The full_name of this PipelineImpl.  # noqa: E501
        :type full_name: str
        """

        self._full_name = full_name

    @property
    def latest_run(self):
        """Gets the latest_run of this PipelineImpl.  # noqa: E501


        :return: The latest_run of this PipelineImpl.  # noqa: E501
        :rtype: str
        """
        return self._latest_run

    @latest_run.setter
    def latest_run(self, latest_run):
        """Sets the latest_run of this PipelineImpl.


        :param latest_run: The latest_run of this PipelineImpl.  # noqa: E501
        :type latest_run: str
        """

        self._latest_run = latest_run

    @property
    def name(self):
        """Gets the name of this PipelineImpl.  # noqa: E501


        :return: The name of this PipelineImpl.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this PipelineImpl.


        :param name: The name of this PipelineImpl.  # noqa: E501
        :type name: str
        """

        self._name = name

    @property
    def organization(self):
        """Gets the organization of this PipelineImpl.  # noqa: E501


        :return: The organization of this PipelineImpl.  # noqa: E501
        :rtype: str
        """
        return self._organization

    @organization.setter
    def organization(self, organization):
        """Sets the organization of this PipelineImpl.


        :param organization: The organization of this PipelineImpl.  # noqa: E501
        :type organization: str
        """

        self._organization = organization

    @property
    def weather_score(self):
        """Gets the weather_score of this PipelineImpl.  # noqa: E501


        :return: The weather_score of this PipelineImpl.  # noqa: E501
        :rtype: int
        """
        return self._weather_score

    @weather_score.setter
    def weather_score(self, weather_score):
        """Sets the weather_score of this PipelineImpl.


        :param weather_score: The weather_score of this PipelineImpl.  # noqa: E501
        :type weather_score: int
        """

        self._weather_score = weather_score

    @property
    def links(self):
        """Gets the links of this PipelineImpl.  # noqa: E501


        :return: The links of this PipelineImpl.  # noqa: E501
        :rtype: PipelineImpllinks
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this PipelineImpl.


        :param links: The links of this PipelineImpl.  # noqa: E501
        :type links: PipelineImpllinks
        """

        self._links = links

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
        if not isinstance(other, PipelineImpl):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PipelineImpl):
            return True

        return self.to_dict() != other.to_dict()
