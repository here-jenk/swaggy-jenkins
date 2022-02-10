# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.pipelinelatest_run import PipelinelatestRun
from openapi_server import util


class Pipeline(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, organization: str=None, name: str=None, display_name: str=None, full_name: str=None, weather_score: int=None, estimated_duration_in_millis: int=None, latest_run: PipelinelatestRun=None):
        """Pipeline - a model defined in OpenAPI

        :param _class: The _class of this Pipeline.
        :param organization: The organization of this Pipeline.
        :param name: The name of this Pipeline.
        :param display_name: The display_name of this Pipeline.
        :param full_name: The full_name of this Pipeline.
        :param weather_score: The weather_score of this Pipeline.
        :param estimated_duration_in_millis: The estimated_duration_in_millis of this Pipeline.
        :param latest_run: The latest_run of this Pipeline.
        """
        self.openapi_types = {
            '_class': str,
            'organization': str,
            'name': str,
            'display_name': str,
            'full_name': str,
            'weather_score': int,
            'estimated_duration_in_millis': int,
            'latest_run': PipelinelatestRun
        }

        self.attribute_map = {
            '_class': '_class',
            'organization': 'organization',
            'name': 'name',
            'display_name': 'displayName',
            'full_name': 'fullName',
            'weather_score': 'weatherScore',
            'estimated_duration_in_millis': 'estimatedDurationInMillis',
            'latest_run': 'latestRun'
        }

        self.__class = _class
        self._organization = organization
        self._name = name
        self._display_name = display_name
        self._full_name = full_name
        self._weather_score = weather_score
        self._estimated_duration_in_millis = estimated_duration_in_millis
        self._latest_run = latest_run

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Pipeline':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Pipeline of this Pipeline.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this Pipeline.


        :return: The _class of this Pipeline.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this Pipeline.


        :param _class: The _class of this Pipeline.
        :type _class: str
        """

        self.__class = _class

    @property
    def organization(self):
        """Gets the organization of this Pipeline.


        :return: The organization of this Pipeline.
        :rtype: str
        """
        return self._organization

    @organization.setter
    def organization(self, organization):
        """Sets the organization of this Pipeline.


        :param organization: The organization of this Pipeline.
        :type organization: str
        """

        self._organization = organization

    @property
    def name(self):
        """Gets the name of this Pipeline.


        :return: The name of this Pipeline.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Pipeline.


        :param name: The name of this Pipeline.
        :type name: str
        """

        self._name = name

    @property
    def display_name(self):
        """Gets the display_name of this Pipeline.


        :return: The display_name of this Pipeline.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """Sets the display_name of this Pipeline.


        :param display_name: The display_name of this Pipeline.
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def full_name(self):
        """Gets the full_name of this Pipeline.


        :return: The full_name of this Pipeline.
        :rtype: str
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name):
        """Sets the full_name of this Pipeline.


        :param full_name: The full_name of this Pipeline.
        :type full_name: str
        """

        self._full_name = full_name

    @property
    def weather_score(self):
        """Gets the weather_score of this Pipeline.


        :return: The weather_score of this Pipeline.
        :rtype: int
        """
        return self._weather_score

    @weather_score.setter
    def weather_score(self, weather_score):
        """Sets the weather_score of this Pipeline.


        :param weather_score: The weather_score of this Pipeline.
        :type weather_score: int
        """

        self._weather_score = weather_score

    @property
    def estimated_duration_in_millis(self):
        """Gets the estimated_duration_in_millis of this Pipeline.


        :return: The estimated_duration_in_millis of this Pipeline.
        :rtype: int
        """
        return self._estimated_duration_in_millis

    @estimated_duration_in_millis.setter
    def estimated_duration_in_millis(self, estimated_duration_in_millis):
        """Sets the estimated_duration_in_millis of this Pipeline.


        :param estimated_duration_in_millis: The estimated_duration_in_millis of this Pipeline.
        :type estimated_duration_in_millis: int
        """

        self._estimated_duration_in_millis = estimated_duration_in_millis

    @property
    def latest_run(self):
        """Gets the latest_run of this Pipeline.


        :return: The latest_run of this Pipeline.
        :rtype: PipelinelatestRun
        """
        return self._latest_run

    @latest_run.setter
    def latest_run(self, latest_run):
        """Sets the latest_run of this Pipeline.


        :param latest_run: The latest_run of this Pipeline.
        :type latest_run: PipelinelatestRun
        """

        self._latest_run = latest_run
