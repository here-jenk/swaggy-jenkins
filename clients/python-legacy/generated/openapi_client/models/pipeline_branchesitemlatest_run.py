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


class PipelineBranchesitemlatestRun(object):
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
        'duration_in_millis': 'int',
        'estimated_duration_in_millis': 'int',
        'en_queue_time': 'str',
        'end_time': 'str',
        'id': 'str',
        'organization': 'str',
        'pipeline': 'str',
        'result': 'str',
        'run_summary': 'str',
        'start_time': 'str',
        'state': 'str',
        'type': 'str',
        'commit_id': 'str',
        '_class': 'str'
    }

    attribute_map = {
        'duration_in_millis': 'durationInMillis',
        'estimated_duration_in_millis': 'estimatedDurationInMillis',
        'en_queue_time': 'enQueueTime',
        'end_time': 'endTime',
        'id': 'id',
        'organization': 'organization',
        'pipeline': 'pipeline',
        'result': 'result',
        'run_summary': 'runSummary',
        'start_time': 'startTime',
        'state': 'state',
        'type': 'type',
        'commit_id': 'commitId',
        '_class': '_class'
    }

    def __init__(self, duration_in_millis=None, estimated_duration_in_millis=None, en_queue_time=None, end_time=None, id=None, organization=None, pipeline=None, result=None, run_summary=None, start_time=None, state=None, type=None, commit_id=None, _class=None, local_vars_configuration=None):  # noqa: E501
        """PipelineBranchesitemlatestRun - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._duration_in_millis = None
        self._estimated_duration_in_millis = None
        self._en_queue_time = None
        self._end_time = None
        self._id = None
        self._organization = None
        self._pipeline = None
        self._result = None
        self._run_summary = None
        self._start_time = None
        self._state = None
        self._type = None
        self._commit_id = None
        self.__class = None
        self.discriminator = None

        if duration_in_millis is not None:
            self.duration_in_millis = duration_in_millis
        if estimated_duration_in_millis is not None:
            self.estimated_duration_in_millis = estimated_duration_in_millis
        if en_queue_time is not None:
            self.en_queue_time = en_queue_time
        if end_time is not None:
            self.end_time = end_time
        if id is not None:
            self.id = id
        if organization is not None:
            self.organization = organization
        if pipeline is not None:
            self.pipeline = pipeline
        if result is not None:
            self.result = result
        if run_summary is not None:
            self.run_summary = run_summary
        if start_time is not None:
            self.start_time = start_time
        if state is not None:
            self.state = state
        if type is not None:
            self.type = type
        if commit_id is not None:
            self.commit_id = commit_id
        if _class is not None:
            self._class = _class

    @property
    def duration_in_millis(self):
        """Gets the duration_in_millis of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The duration_in_millis of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: int
        """
        return self._duration_in_millis

    @duration_in_millis.setter
    def duration_in_millis(self, duration_in_millis):
        """Sets the duration_in_millis of this PipelineBranchesitemlatestRun.


        :param duration_in_millis: The duration_in_millis of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type duration_in_millis: int
        """

        self._duration_in_millis = duration_in_millis

    @property
    def estimated_duration_in_millis(self):
        """Gets the estimated_duration_in_millis of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The estimated_duration_in_millis of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: int
        """
        return self._estimated_duration_in_millis

    @estimated_duration_in_millis.setter
    def estimated_duration_in_millis(self, estimated_duration_in_millis):
        """Sets the estimated_duration_in_millis of this PipelineBranchesitemlatestRun.


        :param estimated_duration_in_millis: The estimated_duration_in_millis of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type estimated_duration_in_millis: int
        """

        self._estimated_duration_in_millis = estimated_duration_in_millis

    @property
    def en_queue_time(self):
        """Gets the en_queue_time of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The en_queue_time of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._en_queue_time

    @en_queue_time.setter
    def en_queue_time(self, en_queue_time):
        """Sets the en_queue_time of this PipelineBranchesitemlatestRun.


        :param en_queue_time: The en_queue_time of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type en_queue_time: str
        """

        self._en_queue_time = en_queue_time

    @property
    def end_time(self):
        """Gets the end_time of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The end_time of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """Sets the end_time of this PipelineBranchesitemlatestRun.


        :param end_time: The end_time of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type end_time: str
        """

        self._end_time = end_time

    @property
    def id(self):
        """Gets the id of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The id of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PipelineBranchesitemlatestRun.


        :param id: The id of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type id: str
        """

        self._id = id

    @property
    def organization(self):
        """Gets the organization of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The organization of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._organization

    @organization.setter
    def organization(self, organization):
        """Sets the organization of this PipelineBranchesitemlatestRun.


        :param organization: The organization of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type organization: str
        """

        self._organization = organization

    @property
    def pipeline(self):
        """Gets the pipeline of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The pipeline of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._pipeline

    @pipeline.setter
    def pipeline(self, pipeline):
        """Sets the pipeline of this PipelineBranchesitemlatestRun.


        :param pipeline: The pipeline of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type pipeline: str
        """

        self._pipeline = pipeline

    @property
    def result(self):
        """Gets the result of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The result of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this PipelineBranchesitemlatestRun.


        :param result: The result of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type result: str
        """

        self._result = result

    @property
    def run_summary(self):
        """Gets the run_summary of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The run_summary of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._run_summary

    @run_summary.setter
    def run_summary(self, run_summary):
        """Sets the run_summary of this PipelineBranchesitemlatestRun.


        :param run_summary: The run_summary of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type run_summary: str
        """

        self._run_summary = run_summary

    @property
    def start_time(self):
        """Gets the start_time of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The start_time of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this PipelineBranchesitemlatestRun.


        :param start_time: The start_time of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type start_time: str
        """

        self._start_time = start_time

    @property
    def state(self):
        """Gets the state of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The state of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """Sets the state of this PipelineBranchesitemlatestRun.


        :param state: The state of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type state: str
        """

        self._state = state

    @property
    def type(self):
        """Gets the type of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The type of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this PipelineBranchesitemlatestRun.


        :param type: The type of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type type: str
        """

        self._type = type

    @property
    def commit_id(self):
        """Gets the commit_id of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The commit_id of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self._commit_id

    @commit_id.setter
    def commit_id(self, commit_id):
        """Sets the commit_id of this PipelineBranchesitemlatestRun.


        :param commit_id: The commit_id of this PipelineBranchesitemlatestRun.  # noqa: E501
        :type commit_id: str
        """

        self._commit_id = commit_id

    @property
    def _class(self):
        """Gets the _class of this PipelineBranchesitemlatestRun.  # noqa: E501


        :return: The _class of this PipelineBranchesitemlatestRun.  # noqa: E501
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this PipelineBranchesitemlatestRun.


        :param _class: The _class of this PipelineBranchesitemlatestRun.  # noqa: E501
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
        if not isinstance(other, PipelineBranchesitemlatestRun):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PipelineBranchesitemlatestRun):
            return True

        return self.to_dict() != other.to_dict()
