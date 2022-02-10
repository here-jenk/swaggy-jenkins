# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.pipeline_run_impllinks import PipelineRunImpllinks
from openapi_server import util


class PipelineRunImpl(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, links: PipelineRunImpllinks=None, duration_in_millis: int=None, en_queue_time: str=None, end_time: str=None, estimated_duration_in_millis: int=None, id: str=None, organization: str=None, pipeline: str=None, result: str=None, run_summary: str=None, start_time: str=None, state: str=None, type: str=None, commit_id: str=None):
        """PipelineRunImpl - a model defined in OpenAPI

        :param _class: The _class of this PipelineRunImpl.
        :param links: The links of this PipelineRunImpl.
        :param duration_in_millis: The duration_in_millis of this PipelineRunImpl.
        :param en_queue_time: The en_queue_time of this PipelineRunImpl.
        :param end_time: The end_time of this PipelineRunImpl.
        :param estimated_duration_in_millis: The estimated_duration_in_millis of this PipelineRunImpl.
        :param id: The id of this PipelineRunImpl.
        :param organization: The organization of this PipelineRunImpl.
        :param pipeline: The pipeline of this PipelineRunImpl.
        :param result: The result of this PipelineRunImpl.
        :param run_summary: The run_summary of this PipelineRunImpl.
        :param start_time: The start_time of this PipelineRunImpl.
        :param state: The state of this PipelineRunImpl.
        :param type: The type of this PipelineRunImpl.
        :param commit_id: The commit_id of this PipelineRunImpl.
        """
        self.openapi_types = {
            '_class': str,
            'links': PipelineRunImpllinks,
            'duration_in_millis': int,
            'en_queue_time': str,
            'end_time': str,
            'estimated_duration_in_millis': int,
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
            'links': '_links',
            'duration_in_millis': 'durationInMillis',
            'en_queue_time': 'enQueueTime',
            'end_time': 'endTime',
            'estimated_duration_in_millis': 'estimatedDurationInMillis',
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
        self._links = links
        self._duration_in_millis = duration_in_millis
        self._en_queue_time = en_queue_time
        self._end_time = end_time
        self._estimated_duration_in_millis = estimated_duration_in_millis
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
    def from_dict(cls, dikt: dict) -> 'PipelineRunImpl':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The PipelineRunImpl of this PipelineRunImpl.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this PipelineRunImpl.


        :return: The _class of this PipelineRunImpl.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this PipelineRunImpl.


        :param _class: The _class of this PipelineRunImpl.
        :type _class: str
        """

        self.__class = _class

    @property
    def links(self):
        """Gets the links of this PipelineRunImpl.


        :return: The links of this PipelineRunImpl.
        :rtype: PipelineRunImpllinks
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this PipelineRunImpl.


        :param links: The links of this PipelineRunImpl.
        :type links: PipelineRunImpllinks
        """

        self._links = links

    @property
    def duration_in_millis(self):
        """Gets the duration_in_millis of this PipelineRunImpl.


        :return: The duration_in_millis of this PipelineRunImpl.
        :rtype: int
        """
        return self._duration_in_millis

    @duration_in_millis.setter
    def duration_in_millis(self, duration_in_millis):
        """Sets the duration_in_millis of this PipelineRunImpl.


        :param duration_in_millis: The duration_in_millis of this PipelineRunImpl.
        :type duration_in_millis: int
        """

        self._duration_in_millis = duration_in_millis

    @property
    def en_queue_time(self):
        """Gets the en_queue_time of this PipelineRunImpl.


        :return: The en_queue_time of this PipelineRunImpl.
        :rtype: str
        """
        return self._en_queue_time

    @en_queue_time.setter
    def en_queue_time(self, en_queue_time):
        """Sets the en_queue_time of this PipelineRunImpl.


        :param en_queue_time: The en_queue_time of this PipelineRunImpl.
        :type en_queue_time: str
        """

        self._en_queue_time = en_queue_time

    @property
    def end_time(self):
        """Gets the end_time of this PipelineRunImpl.


        :return: The end_time of this PipelineRunImpl.
        :rtype: str
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """Sets the end_time of this PipelineRunImpl.


        :param end_time: The end_time of this PipelineRunImpl.
        :type end_time: str
        """

        self._end_time = end_time

    @property
    def estimated_duration_in_millis(self):
        """Gets the estimated_duration_in_millis of this PipelineRunImpl.


        :return: The estimated_duration_in_millis of this PipelineRunImpl.
        :rtype: int
        """
        return self._estimated_duration_in_millis

    @estimated_duration_in_millis.setter
    def estimated_duration_in_millis(self, estimated_duration_in_millis):
        """Sets the estimated_duration_in_millis of this PipelineRunImpl.


        :param estimated_duration_in_millis: The estimated_duration_in_millis of this PipelineRunImpl.
        :type estimated_duration_in_millis: int
        """

        self._estimated_duration_in_millis = estimated_duration_in_millis

    @property
    def id(self):
        """Gets the id of this PipelineRunImpl.


        :return: The id of this PipelineRunImpl.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PipelineRunImpl.


        :param id: The id of this PipelineRunImpl.
        :type id: str
        """

        self._id = id

    @property
    def organization(self):
        """Gets the organization of this PipelineRunImpl.


        :return: The organization of this PipelineRunImpl.
        :rtype: str
        """
        return self._organization

    @organization.setter
    def organization(self, organization):
        """Sets the organization of this PipelineRunImpl.


        :param organization: The organization of this PipelineRunImpl.
        :type organization: str
        """

        self._organization = organization

    @property
    def pipeline(self):
        """Gets the pipeline of this PipelineRunImpl.


        :return: The pipeline of this PipelineRunImpl.
        :rtype: str
        """
        return self._pipeline

    @pipeline.setter
    def pipeline(self, pipeline):
        """Sets the pipeline of this PipelineRunImpl.


        :param pipeline: The pipeline of this PipelineRunImpl.
        :type pipeline: str
        """

        self._pipeline = pipeline

    @property
    def result(self):
        """Gets the result of this PipelineRunImpl.


        :return: The result of this PipelineRunImpl.
        :rtype: str
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this PipelineRunImpl.


        :param result: The result of this PipelineRunImpl.
        :type result: str
        """

        self._result = result

    @property
    def run_summary(self):
        """Gets the run_summary of this PipelineRunImpl.


        :return: The run_summary of this PipelineRunImpl.
        :rtype: str
        """
        return self._run_summary

    @run_summary.setter
    def run_summary(self, run_summary):
        """Sets the run_summary of this PipelineRunImpl.


        :param run_summary: The run_summary of this PipelineRunImpl.
        :type run_summary: str
        """

        self._run_summary = run_summary

    @property
    def start_time(self):
        """Gets the start_time of this PipelineRunImpl.


        :return: The start_time of this PipelineRunImpl.
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this PipelineRunImpl.


        :param start_time: The start_time of this PipelineRunImpl.
        :type start_time: str
        """

        self._start_time = start_time

    @property
    def state(self):
        """Gets the state of this PipelineRunImpl.


        :return: The state of this PipelineRunImpl.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """Sets the state of this PipelineRunImpl.


        :param state: The state of this PipelineRunImpl.
        :type state: str
        """

        self._state = state

    @property
    def type(self):
        """Gets the type of this PipelineRunImpl.


        :return: The type of this PipelineRunImpl.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this PipelineRunImpl.


        :param type: The type of this PipelineRunImpl.
        :type type: str
        """

        self._type = type

    @property
    def commit_id(self):
        """Gets the commit_id of this PipelineRunImpl.


        :return: The commit_id of this PipelineRunImpl.
        :rtype: str
        """
        return self._commit_id

    @commit_id.setter
    def commit_id(self, commit_id):
        """Sets the commit_id of this PipelineRunImpl.


        :param commit_id: The commit_id of this PipelineRunImpl.
        :type commit_id: str
        """

        self._commit_id = commit_id
