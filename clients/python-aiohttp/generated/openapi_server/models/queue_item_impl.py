# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class QueueItemImpl(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, expected_build_number: int=None, id: str=None, pipeline: str=None, queued_time: int=None):
        """QueueItemImpl - a model defined in OpenAPI

        :param _class: The _class of this QueueItemImpl.
        :param expected_build_number: The expected_build_number of this QueueItemImpl.
        :param id: The id of this QueueItemImpl.
        :param pipeline: The pipeline of this QueueItemImpl.
        :param queued_time: The queued_time of this QueueItemImpl.
        """
        self.openapi_types = {
            '_class': str,
            'expected_build_number': int,
            'id': str,
            'pipeline': str,
            'queued_time': int
        }

        self.attribute_map = {
            '_class': '_class',
            'expected_build_number': 'expectedBuildNumber',
            'id': 'id',
            'pipeline': 'pipeline',
            'queued_time': 'queuedTime'
        }

        self.__class = _class
        self._expected_build_number = expected_build_number
        self._id = id
        self._pipeline = pipeline
        self._queued_time = queued_time

    @classmethod
    def from_dict(cls, dikt: dict) -> 'QueueItemImpl':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The QueueItemImpl of this QueueItemImpl.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this QueueItemImpl.


        :return: The _class of this QueueItemImpl.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this QueueItemImpl.


        :param _class: The _class of this QueueItemImpl.
        :type _class: str
        """

        self.__class = _class

    @property
    def expected_build_number(self):
        """Gets the expected_build_number of this QueueItemImpl.


        :return: The expected_build_number of this QueueItemImpl.
        :rtype: int
        """
        return self._expected_build_number

    @expected_build_number.setter
    def expected_build_number(self, expected_build_number):
        """Sets the expected_build_number of this QueueItemImpl.


        :param expected_build_number: The expected_build_number of this QueueItemImpl.
        :type expected_build_number: int
        """

        self._expected_build_number = expected_build_number

    @property
    def id(self):
        """Gets the id of this QueueItemImpl.


        :return: The id of this QueueItemImpl.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this QueueItemImpl.


        :param id: The id of this QueueItemImpl.
        :type id: str
        """

        self._id = id

    @property
    def pipeline(self):
        """Gets the pipeline of this QueueItemImpl.


        :return: The pipeline of this QueueItemImpl.
        :rtype: str
        """
        return self._pipeline

    @pipeline.setter
    def pipeline(self, pipeline):
        """Sets the pipeline of this QueueItemImpl.


        :param pipeline: The pipeline of this QueueItemImpl.
        :type pipeline: str
        """

        self._pipeline = pipeline

    @property
    def queued_time(self):
        """Gets the queued_time of this QueueItemImpl.


        :return: The queued_time of this QueueItemImpl.
        :rtype: int
        """
        return self._queued_time

    @queued_time.setter
    def queued_time(self, queued_time):
        """Sets the queued_time of this QueueItemImpl.


        :param queued_time: The queued_time of this QueueItemImpl.
        :type queued_time: int
        """

        self._queued_time = queued_time
