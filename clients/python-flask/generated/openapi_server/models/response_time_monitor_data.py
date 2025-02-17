# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class ResponseTimeMonitorData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class=None, timestamp=None, average=None):  # noqa: E501
        """ResponseTimeMonitorData - a model defined in OpenAPI

        :param _class: The _class of this ResponseTimeMonitorData.  # noqa: E501
        :type _class: str
        :param timestamp: The timestamp of this ResponseTimeMonitorData.  # noqa: E501
        :type timestamp: int
        :param average: The average of this ResponseTimeMonitorData.  # noqa: E501
        :type average: int
        """
        self.openapi_types = {
            '_class': str,
            'timestamp': int,
            'average': int
        }

        self.attribute_map = {
            '_class': '_class',
            'timestamp': 'timestamp',
            'average': 'average'
        }

        self.__class = _class
        self._timestamp = timestamp
        self._average = average

    @classmethod
    def from_dict(cls, dikt) -> 'ResponseTimeMonitorData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ResponseTimeMonitorData of this ResponseTimeMonitorData.  # noqa: E501
        :rtype: ResponseTimeMonitorData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this ResponseTimeMonitorData.


        :return: The _class of this ResponseTimeMonitorData.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this ResponseTimeMonitorData.


        :param _class: The _class of this ResponseTimeMonitorData.
        :type _class: str
        """

        self.__class = _class

    @property
    def timestamp(self):
        """Gets the timestamp of this ResponseTimeMonitorData.


        :return: The timestamp of this ResponseTimeMonitorData.
        :rtype: int
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """Sets the timestamp of this ResponseTimeMonitorData.


        :param timestamp: The timestamp of this ResponseTimeMonitorData.
        :type timestamp: int
        """

        self._timestamp = timestamp

    @property
    def average(self):
        """Gets the average of this ResponseTimeMonitorData.


        :return: The average of this ResponseTimeMonitorData.
        :rtype: int
        """
        return self._average

    @average.setter
    def average(self, average):
        """Sets the average of this ResponseTimeMonitorData.


        :param average: The average of this ResponseTimeMonitorData.
        :type average: int
        """

        self._average = average
