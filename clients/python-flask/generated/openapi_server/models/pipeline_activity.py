# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.pipeline_activityartifacts import PipelineActivityartifacts
from openapi_server import util

from openapi_server.models.pipeline_activityartifacts import PipelineActivityartifacts  # noqa: E501

class PipelineActivity(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class=None, artifacts=None, duration_in_millis=None, estimated_duration_in_millis=None, en_queue_time=None, end_time=None, id=None, organization=None, pipeline=None, result=None, run_summary=None, start_time=None, state=None, type=None, commit_id=None):  # noqa: E501
        """PipelineActivity - a model defined in OpenAPI

        :param _class: The _class of this PipelineActivity.  # noqa: E501
        :type _class: str
        :param artifacts: The artifacts of this PipelineActivity.  # noqa: E501
        :type artifacts: List[PipelineActivityartifacts]
        :param duration_in_millis: The duration_in_millis of this PipelineActivity.  # noqa: E501
        :type duration_in_millis: int
        :param estimated_duration_in_millis: The estimated_duration_in_millis of this PipelineActivity.  # noqa: E501
        :type estimated_duration_in_millis: int
        :param en_queue_time: The en_queue_time of this PipelineActivity.  # noqa: E501
        :type en_queue_time: str
        :param end_time: The end_time of this PipelineActivity.  # noqa: E501
        :type end_time: str
        :param id: The id of this PipelineActivity.  # noqa: E501
        :type id: str
        :param organization: The organization of this PipelineActivity.  # noqa: E501
        :type organization: str
        :param pipeline: The pipeline of this PipelineActivity.  # noqa: E501
        :type pipeline: str
        :param result: The result of this PipelineActivity.  # noqa: E501
        :type result: str
        :param run_summary: The run_summary of this PipelineActivity.  # noqa: E501
        :type run_summary: str
        :param start_time: The start_time of this PipelineActivity.  # noqa: E501
        :type start_time: str
        :param state: The state of this PipelineActivity.  # noqa: E501
        :type state: str
        :param type: The type of this PipelineActivity.  # noqa: E501
        :type type: str
        :param commit_id: The commit_id of this PipelineActivity.  # noqa: E501
        :type commit_id: str
        """
        self.openapi_types = {
            '_class': str,
            'artifacts': List[PipelineActivityartifacts],
            'duration_in_millis': int,
            'estimated_duration_in_millis': int,
            'en_queue_time': str,
            'end_time': str,
            'id': str,
            'organization': str,
            'pipeline': str,
            'result': str,
            'run_summary': str,
            'start_time': str,
            'state': str,
            'type': str,
            'commit_id': str
        }

        self.attribute_map = {
            '_class': '_class',
            'artifacts': 'artifacts',
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
            'commit_id': 'commitId'
        }

        self.__class = _class
        self._artifacts = artifacts
        self._duration_in_millis = duration_in_millis
        self._estimated_duration_in_millis = estimated_duration_in_millis
        self._en_queue_time = en_queue_time
        self._end_time = end_time
        self._id = id
        self._organization = organization
        self._pipeline = pipeline
        self._result = result
        self._run_summary = run_summary
        self._start_time = start_time
        self._state = state
        self._type = type
        self._commit_id = commit_id

    @classmethod
    def from_dict(cls, dikt) -> 'PipelineActivity':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PipelineActivity of this PipelineActivity.  # noqa: E501
        :rtype: PipelineActivity
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this PipelineActivity.


        :return: The _class of this PipelineActivity.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this PipelineActivity.


        :param _class: The _class of this PipelineActivity.
        :type _class: str
        """

        self.__class = _class

    @property
    def artifacts(self):
        """Gets the artifacts of this PipelineActivity.


        :return: The artifacts of this PipelineActivity.
        :rtype: List[PipelineActivityartifacts]
        """
        return self._artifacts

    @artifacts.setter
    def artifacts(self, artifacts):
        """Sets the artifacts of this PipelineActivity.


        :param artifacts: The artifacts of this PipelineActivity.
        :type artifacts: List[PipelineActivityartifacts]
        """

        self._artifacts = artifacts

    @property
    def duration_in_millis(self):
        """Gets the duration_in_millis of this PipelineActivity.


        :return: The duration_in_millis of this PipelineActivity.
        :rtype: int
        """
        return self._duration_in_millis

    @duration_in_millis.setter
    def duration_in_millis(self, duration_in_millis):
        """Sets the duration_in_millis of this PipelineActivity.


        :param duration_in_millis: The duration_in_millis of this PipelineActivity.
        :type duration_in_millis: int
        """

        self._duration_in_millis = duration_in_millis

    @property
    def estimated_duration_in_millis(self):
        """Gets the estimated_duration_in_millis of this PipelineActivity.


        :return: The estimated_duration_in_millis of this PipelineActivity.
        :rtype: int
        """
        return self._estimated_duration_in_millis

    @estimated_duration_in_millis.setter
    def estimated_duration_in_millis(self, estimated_duration_in_millis):
        """Sets the estimated_duration_in_millis of this PipelineActivity.


        :param estimated_duration_in_millis: The estimated_duration_in_millis of this PipelineActivity.
        :type estimated_duration_in_millis: int
        """

        self._estimated_duration_in_millis = estimated_duration_in_millis

    @property
    def en_queue_time(self):
        """Gets the en_queue_time of this PipelineActivity.


        :return: The en_queue_time of this PipelineActivity.
        :rtype: str
        """
        return self._en_queue_time

    @en_queue_time.setter
    def en_queue_time(self, en_queue_time):
        """Sets the en_queue_time of this PipelineActivity.


        :param en_queue_time: The en_queue_time of this PipelineActivity.
        :type en_queue_time: str
        """

        self._en_queue_time = en_queue_time

    @property
    def end_time(self):
        """Gets the end_time of this PipelineActivity.


        :return: The end_time of this PipelineActivity.
        :rtype: str
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """Sets the end_time of this PipelineActivity.


        :param end_time: The end_time of this PipelineActivity.
        :type end_time: str
        """

        self._end_time = end_time

    @property
    def id(self):
        """Gets the id of this PipelineActivity.


        :return: The id of this PipelineActivity.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PipelineActivity.


        :param id: The id of this PipelineActivity.
        :type id: str
        """

        self._id = id

    @property
    def organization(self):
        """Gets the organization of this PipelineActivity.


        :return: The organization of this PipelineActivity.
        :rtype: str
        """
        return self._organization

    @organization.setter
    def organization(self, organization):
        """Sets the organization of this PipelineActivity.


        :param organization: The organization of this PipelineActivity.
        :type organization: str
        """

        self._organization = organization

    @property
    def pipeline(self):
        """Gets the pipeline of this PipelineActivity.


        :return: The pipeline of this PipelineActivity.
        :rtype: str
        """
        return self._pipeline

    @pipeline.setter
    def pipeline(self, pipeline):
        """Sets the pipeline of this PipelineActivity.


        :param pipeline: The pipeline of this PipelineActivity.
        :type pipeline: str
        """

        self._pipeline = pipeline

    @property
    def result(self):
        """Gets the result of this PipelineActivity.


        :return: The result of this PipelineActivity.
        :rtype: str
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this PipelineActivity.


        :param result: The result of this PipelineActivity.
        :type result: str
        """

        self._result = result

    @property
    def run_summary(self):
        """Gets the run_summary of this PipelineActivity.


        :return: The run_summary of this PipelineActivity.
        :rtype: str
        """
        return self._run_summary

    @run_summary.setter
    def run_summary(self, run_summary):
        """Sets the run_summary of this PipelineActivity.


        :param run_summary: The run_summary of this PipelineActivity.
        :type run_summary: str
        """

        self._run_summary = run_summary

    @property
    def start_time(self):
        """Gets the start_time of this PipelineActivity.


        :return: The start_time of this PipelineActivity.
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this PipelineActivity.


        :param start_time: The start_time of this PipelineActivity.
        :type start_time: str
        """

        self._start_time = start_time

    @property
    def state(self):
        """Gets the state of this PipelineActivity.


        :return: The state of this PipelineActivity.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """Sets the state of this PipelineActivity.


        :param state: The state of this PipelineActivity.
        :type state: str
        """

        self._state = state

    @property
    def type(self):
        """Gets the type of this PipelineActivity.


        :return: The type of this PipelineActivity.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this PipelineActivity.


        :param type: The type of this PipelineActivity.
        :type type: str
        """

        self._type = type

    @property
    def commit_id(self):
        """Gets the commit_id of this PipelineActivity.


        :return: The commit_id of this PipelineActivity.
        :rtype: str
        """
        return self._commit_id

    @commit_id.setter
    def commit_id(self, commit_id):
        """Sets the commit_id of this PipelineActivity.


        :param commit_id: The commit_id of this PipelineActivity.
        :type commit_id: str
        """

        self._commit_id = commit_id
