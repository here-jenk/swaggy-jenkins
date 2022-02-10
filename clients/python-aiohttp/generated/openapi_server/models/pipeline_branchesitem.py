# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.pipeline_branchesitemlatest_run import PipelineBranchesitemlatestRun
from openapi_server.models.pipeline_branchesitempull_request import PipelineBranchesitempullRequest
from openapi_server import util


class PipelineBranchesitem(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, display_name: str=None, estimated_duration_in_millis: int=None, name: str=None, weather_score: int=None, latest_run: PipelineBranchesitemlatestRun=None, organization: str=None, pull_request: PipelineBranchesitempullRequest=None, total_number_of_pull_requests: int=None, _class: str=None):
        """PipelineBranchesitem - a model defined in OpenAPI

        :param display_name: The display_name of this PipelineBranchesitem.
        :param estimated_duration_in_millis: The estimated_duration_in_millis of this PipelineBranchesitem.
        :param name: The name of this PipelineBranchesitem.
        :param weather_score: The weather_score of this PipelineBranchesitem.
        :param latest_run: The latest_run of this PipelineBranchesitem.
        :param organization: The organization of this PipelineBranchesitem.
        :param pull_request: The pull_request of this PipelineBranchesitem.
        :param total_number_of_pull_requests: The total_number_of_pull_requests of this PipelineBranchesitem.
        :param _class: The _class of this PipelineBranchesitem.
        """
        self.openapi_types = {
            'display_name': str,
            'estimated_duration_in_millis': int,
            'name': str,
            'weather_score': int,
            'latest_run': PipelineBranchesitemlatestRun,
            'organization': str,
            'pull_request': PipelineBranchesitempullRequest,
            'total_number_of_pull_requests': int,
            '_class': str
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'estimated_duration_in_millis': 'estimatedDurationInMillis',
            'name': 'name',
            'weather_score': 'weatherScore',
            'latest_run': 'latestRun',
            'organization': 'organization',
            'pull_request': 'pullRequest',
            'total_number_of_pull_requests': 'totalNumberOfPullRequests',
            '_class': '_class'
        }

        self._display_name = display_name
        self._estimated_duration_in_millis = estimated_duration_in_millis
        self._name = name
        self._weather_score = weather_score
        self._latest_run = latest_run
        self._organization = organization
        self._pull_request = pull_request
        self._total_number_of_pull_requests = total_number_of_pull_requests
        self.__class = _class

    @classmethod
    def from_dict(cls, dikt: dict) -> 'PipelineBranchesitem':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The PipelineBranchesitem of this PipelineBranchesitem.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def display_name(self):
        """Gets the display_name of this PipelineBranchesitem.


        :return: The display_name of this PipelineBranchesitem.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """Sets the display_name of this PipelineBranchesitem.


        :param display_name: The display_name of this PipelineBranchesitem.
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def estimated_duration_in_millis(self):
        """Gets the estimated_duration_in_millis of this PipelineBranchesitem.


        :return: The estimated_duration_in_millis of this PipelineBranchesitem.
        :rtype: int
        """
        return self._estimated_duration_in_millis

    @estimated_duration_in_millis.setter
    def estimated_duration_in_millis(self, estimated_duration_in_millis):
        """Sets the estimated_duration_in_millis of this PipelineBranchesitem.


        :param estimated_duration_in_millis: The estimated_duration_in_millis of this PipelineBranchesitem.
        :type estimated_duration_in_millis: int
        """

        self._estimated_duration_in_millis = estimated_duration_in_millis

    @property
    def name(self):
        """Gets the name of this PipelineBranchesitem.


        :return: The name of this PipelineBranchesitem.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this PipelineBranchesitem.


        :param name: The name of this PipelineBranchesitem.
        :type name: str
        """

        self._name = name

    @property
    def weather_score(self):
        """Gets the weather_score of this PipelineBranchesitem.


        :return: The weather_score of this PipelineBranchesitem.
        :rtype: int
        """
        return self._weather_score

    @weather_score.setter
    def weather_score(self, weather_score):
        """Sets the weather_score of this PipelineBranchesitem.


        :param weather_score: The weather_score of this PipelineBranchesitem.
        :type weather_score: int
        """

        self._weather_score = weather_score

    @property
    def latest_run(self):
        """Gets the latest_run of this PipelineBranchesitem.


        :return: The latest_run of this PipelineBranchesitem.
        :rtype: PipelineBranchesitemlatestRun
        """
        return self._latest_run

    @latest_run.setter
    def latest_run(self, latest_run):
        """Sets the latest_run of this PipelineBranchesitem.


        :param latest_run: The latest_run of this PipelineBranchesitem.
        :type latest_run: PipelineBranchesitemlatestRun
        """

        self._latest_run = latest_run

    @property
    def organization(self):
        """Gets the organization of this PipelineBranchesitem.


        :return: The organization of this PipelineBranchesitem.
        :rtype: str
        """
        return self._organization

    @organization.setter
    def organization(self, organization):
        """Sets the organization of this PipelineBranchesitem.


        :param organization: The organization of this PipelineBranchesitem.
        :type organization: str
        """

        self._organization = organization

    @property
    def pull_request(self):
        """Gets the pull_request of this PipelineBranchesitem.


        :return: The pull_request of this PipelineBranchesitem.
        :rtype: PipelineBranchesitempullRequest
        """
        return self._pull_request

    @pull_request.setter
    def pull_request(self, pull_request):
        """Sets the pull_request of this PipelineBranchesitem.


        :param pull_request: The pull_request of this PipelineBranchesitem.
        :type pull_request: PipelineBranchesitempullRequest
        """

        self._pull_request = pull_request

    @property
    def total_number_of_pull_requests(self):
        """Gets the total_number_of_pull_requests of this PipelineBranchesitem.


        :return: The total_number_of_pull_requests of this PipelineBranchesitem.
        :rtype: int
        """
        return self._total_number_of_pull_requests

    @total_number_of_pull_requests.setter
    def total_number_of_pull_requests(self, total_number_of_pull_requests):
        """Sets the total_number_of_pull_requests of this PipelineBranchesitem.


        :param total_number_of_pull_requests: The total_number_of_pull_requests of this PipelineBranchesitem.
        :type total_number_of_pull_requests: int
        """

        self._total_number_of_pull_requests = total_number_of_pull_requests

    @property
    def _class(self):
        """Gets the _class of this PipelineBranchesitem.


        :return: The _class of this PipelineBranchesitem.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this PipelineBranchesitem.


        :param _class: The _class of this PipelineBranchesitem.
        :type _class: str
        """

        self.__class = _class
