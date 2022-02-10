# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.pipeline_run_nodeedges import PipelineRunNodeedges
from openapi_server import util


class PipelineRunNode(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, display_name: str=None, duration_in_millis: int=None, edges: List[PipelineRunNodeedges]=None, id: str=None, result: str=None, start_time: str=None, state: str=None):
        """PipelineRunNode - a model defined in OpenAPI

        :param _class: The _class of this PipelineRunNode.
        :param display_name: The display_name of this PipelineRunNode.
        :param duration_in_millis: The duration_in_millis of this PipelineRunNode.
        :param edges: The edges of this PipelineRunNode.
        :param id: The id of this PipelineRunNode.
        :param result: The result of this PipelineRunNode.
        :param start_time: The start_time of this PipelineRunNode.
        :param state: The state of this PipelineRunNode.
        """
        self.openapi_types = {
            '_class': str,
            'display_name': str,
            'duration_in_millis': int,
            'edges': List[PipelineRunNodeedges],
            'id': str,
            'result': str,
            'start_time': str,
            'state': str
        }

        self.attribute_map = {
            '_class': '_class',
            'display_name': 'displayName',
            'duration_in_millis': 'durationInMillis',
            'edges': 'edges',
            'id': 'id',
            'result': 'result',
            'start_time': 'startTime',
            'state': 'state'
        }

        self.__class = _class
        self._display_name = display_name
        self._duration_in_millis = duration_in_millis
        self._edges = edges
        self._id = id
        self._result = result
        self._start_time = start_time
        self._state = state

    @classmethod
    def from_dict(cls, dikt: dict) -> 'PipelineRunNode':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The PipelineRunNode of this PipelineRunNode.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this PipelineRunNode.


        :return: The _class of this PipelineRunNode.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this PipelineRunNode.


        :param _class: The _class of this PipelineRunNode.
        :type _class: str
        """

        self.__class = _class

    @property
    def display_name(self):
        """Gets the display_name of this PipelineRunNode.


        :return: The display_name of this PipelineRunNode.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """Sets the display_name of this PipelineRunNode.


        :param display_name: The display_name of this PipelineRunNode.
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def duration_in_millis(self):
        """Gets the duration_in_millis of this PipelineRunNode.


        :return: The duration_in_millis of this PipelineRunNode.
        :rtype: int
        """
        return self._duration_in_millis

    @duration_in_millis.setter
    def duration_in_millis(self, duration_in_millis):
        """Sets the duration_in_millis of this PipelineRunNode.


        :param duration_in_millis: The duration_in_millis of this PipelineRunNode.
        :type duration_in_millis: int
        """

        self._duration_in_millis = duration_in_millis

    @property
    def edges(self):
        """Gets the edges of this PipelineRunNode.


        :return: The edges of this PipelineRunNode.
        :rtype: List[PipelineRunNodeedges]
        """
        return self._edges

    @edges.setter
    def edges(self, edges):
        """Sets the edges of this PipelineRunNode.


        :param edges: The edges of this PipelineRunNode.
        :type edges: List[PipelineRunNodeedges]
        """

        self._edges = edges

    @property
    def id(self):
        """Gets the id of this PipelineRunNode.


        :return: The id of this PipelineRunNode.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PipelineRunNode.


        :param id: The id of this PipelineRunNode.
        :type id: str
        """

        self._id = id

    @property
    def result(self):
        """Gets the result of this PipelineRunNode.


        :return: The result of this PipelineRunNode.
        :rtype: str
        """
        return self._result

    @result.setter
    def result(self, result):
        """Sets the result of this PipelineRunNode.


        :param result: The result of this PipelineRunNode.
        :type result: str
        """

        self._result = result

    @property
    def start_time(self):
        """Gets the start_time of this PipelineRunNode.


        :return: The start_time of this PipelineRunNode.
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """Sets the start_time of this PipelineRunNode.


        :param start_time: The start_time of this PipelineRunNode.
        :type start_time: str
        """

        self._start_time = start_time

    @property
    def state(self):
        """Gets the state of this PipelineRunNode.


        :return: The state of this PipelineRunNode.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """Sets the state of this PipelineRunNode.


        :param state: The state of this PipelineRunNode.
        :type state: str
        """

        self._state = state
