# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class MultibranchPipeline(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, display_name: str=None, estimated_duration_in_millis: int=None, latest_run: str=None, name: str=None, organization: str=None, weather_score: int=None, branch_names: List[str]=None, number_of_failing_branches: int=None, number_of_failing_pull_requests: int=None, number_of_successful_branches: int=None, number_of_successful_pull_requests: int=None, total_number_of_branches: int=None, total_number_of_pull_requests: int=None, _class: str=None):  # noqa: E501
        """MultibranchPipeline - a model defined in Swagger

        :param display_name: The display_name of this MultibranchPipeline.  # noqa: E501
        :type display_name: str
        :param estimated_duration_in_millis: The estimated_duration_in_millis of this MultibranchPipeline.  # noqa: E501
        :type estimated_duration_in_millis: int
        :param latest_run: The latest_run of this MultibranchPipeline.  # noqa: E501
        :type latest_run: str
        :param name: The name of this MultibranchPipeline.  # noqa: E501
        :type name: str
        :param organization: The organization of this MultibranchPipeline.  # noqa: E501
        :type organization: str
        :param weather_score: The weather_score of this MultibranchPipeline.  # noqa: E501
        :type weather_score: int
        :param branch_names: The branch_names of this MultibranchPipeline.  # noqa: E501
        :type branch_names: List[str]
        :param number_of_failing_branches: The number_of_failing_branches of this MultibranchPipeline.  # noqa: E501
        :type number_of_failing_branches: int
        :param number_of_failing_pull_requests: The number_of_failing_pull_requests of this MultibranchPipeline.  # noqa: E501
        :type number_of_failing_pull_requests: int
        :param number_of_successful_branches: The number_of_successful_branches of this MultibranchPipeline.  # noqa: E501
        :type number_of_successful_branches: int
        :param number_of_successful_pull_requests: The number_of_successful_pull_requests of this MultibranchPipeline.  # noqa: E501
        :type number_of_successful_pull_requests: int
        :param total_number_of_branches: The total_number_of_branches of this MultibranchPipeline.  # noqa: E501
        :type total_number_of_branches: int
        :param total_number_of_pull_requests: The total_number_of_pull_requests of this MultibranchPipeline.  # noqa: E501
        :type total_number_of_pull_requests: int
        :param _class: The _class of this MultibranchPipeline.  # noqa: E501
        :type _class: str
        """
        self.swagger_types = {
            'display_name': str,
            'estimated_duration_in_millis': int,
            'latest_run': str,
            'name': str,
            'organization': str,
            'weather_score': int,
            'branch_names': List[str],
            'number_of_failing_branches': int,
            'number_of_failing_pull_requests': int,
            'number_of_successful_branches': int,
            'number_of_successful_pull_requests': int,
            'total_number_of_branches': int,
            'total_number_of_pull_requests': int,
            '_class': str
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'estimated_duration_in_millis': 'estimatedDurationInMillis',
            'latest_run': 'latestRun',
            'name': 'name',
            'organization': 'organization',
            'weather_score': 'weatherScore',
            'branch_names': 'branchNames',
            'number_of_failing_branches': 'numberOfFailingBranches',
            'number_of_failing_pull_requests': 'numberOfFailingPullRequests',
            'number_of_successful_branches': 'numberOfSuccessfulBranches',
            'number_of_successful_pull_requests': 'numberOfSuccessfulPullRequests',
            'total_number_of_branches': 'totalNumberOfBranches',
            'total_number_of_pull_requests': 'totalNumberOfPullRequests',
            '_class': '_class'
        }

        self._display_name = display_name
        self._estimated_duration_in_millis = estimated_duration_in_millis
        self._latest_run = latest_run
        self._name = name
        self._organization = organization
        self._weather_score = weather_score
        self._branch_names = branch_names
        self._number_of_failing_branches = number_of_failing_branches
        self._number_of_failing_pull_requests = number_of_failing_pull_requests
        self._number_of_successful_branches = number_of_successful_branches
        self._number_of_successful_pull_requests = number_of_successful_pull_requests
        self._total_number_of_branches = total_number_of_branches
        self._total_number_of_pull_requests = total_number_of_pull_requests
        self.__class = _class

    @classmethod
    def from_dict(cls, dikt) -> 'MultibranchPipeline':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MultibranchPipeline of this MultibranchPipeline.  # noqa: E501
        :rtype: MultibranchPipeline
        """
        return util.deserialize_model(dikt, cls)

    @property
    def display_name(self) -> str:
        """Gets the display_name of this MultibranchPipeline.


        :return: The display_name of this MultibranchPipeline.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name: str):
        """Sets the display_name of this MultibranchPipeline.


        :param display_name: The display_name of this MultibranchPipeline.
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def estimated_duration_in_millis(self) -> int:
        """Gets the estimated_duration_in_millis of this MultibranchPipeline.


        :return: The estimated_duration_in_millis of this MultibranchPipeline.
        :rtype: int
        """
        return self._estimated_duration_in_millis

    @estimated_duration_in_millis.setter
    def estimated_duration_in_millis(self, estimated_duration_in_millis: int):
        """Sets the estimated_duration_in_millis of this MultibranchPipeline.


        :param estimated_duration_in_millis: The estimated_duration_in_millis of this MultibranchPipeline.
        :type estimated_duration_in_millis: int
        """

        self._estimated_duration_in_millis = estimated_duration_in_millis

    @property
    def latest_run(self) -> str:
        """Gets the latest_run of this MultibranchPipeline.


        :return: The latest_run of this MultibranchPipeline.
        :rtype: str
        """
        return self._latest_run

    @latest_run.setter
    def latest_run(self, latest_run: str):
        """Sets the latest_run of this MultibranchPipeline.


        :param latest_run: The latest_run of this MultibranchPipeline.
        :type latest_run: str
        """

        self._latest_run = latest_run

    @property
    def name(self) -> str:
        """Gets the name of this MultibranchPipeline.


        :return: The name of this MultibranchPipeline.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this MultibranchPipeline.


        :param name: The name of this MultibranchPipeline.
        :type name: str
        """

        self._name = name

    @property
    def organization(self) -> str:
        """Gets the organization of this MultibranchPipeline.


        :return: The organization of this MultibranchPipeline.
        :rtype: str
        """
        return self._organization

    @organization.setter
    def organization(self, organization: str):
        """Sets the organization of this MultibranchPipeline.


        :param organization: The organization of this MultibranchPipeline.
        :type organization: str
        """

        self._organization = organization

    @property
    def weather_score(self) -> int:
        """Gets the weather_score of this MultibranchPipeline.


        :return: The weather_score of this MultibranchPipeline.
        :rtype: int
        """
        return self._weather_score

    @weather_score.setter
    def weather_score(self, weather_score: int):
        """Sets the weather_score of this MultibranchPipeline.


        :param weather_score: The weather_score of this MultibranchPipeline.
        :type weather_score: int
        """

        self._weather_score = weather_score

    @property
    def branch_names(self) -> List[str]:
        """Gets the branch_names of this MultibranchPipeline.


        :return: The branch_names of this MultibranchPipeline.
        :rtype: List[str]
        """
        return self._branch_names

    @branch_names.setter
    def branch_names(self, branch_names: List[str]):
        """Sets the branch_names of this MultibranchPipeline.


        :param branch_names: The branch_names of this MultibranchPipeline.
        :type branch_names: List[str]
        """

        self._branch_names = branch_names

    @property
    def number_of_failing_branches(self) -> int:
        """Gets the number_of_failing_branches of this MultibranchPipeline.


        :return: The number_of_failing_branches of this MultibranchPipeline.
        :rtype: int
        """
        return self._number_of_failing_branches

    @number_of_failing_branches.setter
    def number_of_failing_branches(self, number_of_failing_branches: int):
        """Sets the number_of_failing_branches of this MultibranchPipeline.


        :param number_of_failing_branches: The number_of_failing_branches of this MultibranchPipeline.
        :type number_of_failing_branches: int
        """

        self._number_of_failing_branches = number_of_failing_branches

    @property
    def number_of_failing_pull_requests(self) -> int:
        """Gets the number_of_failing_pull_requests of this MultibranchPipeline.


        :return: The number_of_failing_pull_requests of this MultibranchPipeline.
        :rtype: int
        """
        return self._number_of_failing_pull_requests

    @number_of_failing_pull_requests.setter
    def number_of_failing_pull_requests(self, number_of_failing_pull_requests: int):
        """Sets the number_of_failing_pull_requests of this MultibranchPipeline.


        :param number_of_failing_pull_requests: The number_of_failing_pull_requests of this MultibranchPipeline.
        :type number_of_failing_pull_requests: int
        """

        self._number_of_failing_pull_requests = number_of_failing_pull_requests

    @property
    def number_of_successful_branches(self) -> int:
        """Gets the number_of_successful_branches of this MultibranchPipeline.


        :return: The number_of_successful_branches of this MultibranchPipeline.
        :rtype: int
        """
        return self._number_of_successful_branches

    @number_of_successful_branches.setter
    def number_of_successful_branches(self, number_of_successful_branches: int):
        """Sets the number_of_successful_branches of this MultibranchPipeline.


        :param number_of_successful_branches: The number_of_successful_branches of this MultibranchPipeline.
        :type number_of_successful_branches: int
        """

        self._number_of_successful_branches = number_of_successful_branches

    @property
    def number_of_successful_pull_requests(self) -> int:
        """Gets the number_of_successful_pull_requests of this MultibranchPipeline.


        :return: The number_of_successful_pull_requests of this MultibranchPipeline.
        :rtype: int
        """
        return self._number_of_successful_pull_requests

    @number_of_successful_pull_requests.setter
    def number_of_successful_pull_requests(self, number_of_successful_pull_requests: int):
        """Sets the number_of_successful_pull_requests of this MultibranchPipeline.


        :param number_of_successful_pull_requests: The number_of_successful_pull_requests of this MultibranchPipeline.
        :type number_of_successful_pull_requests: int
        """

        self._number_of_successful_pull_requests = number_of_successful_pull_requests

    @property
    def total_number_of_branches(self) -> int:
        """Gets the total_number_of_branches of this MultibranchPipeline.


        :return: The total_number_of_branches of this MultibranchPipeline.
        :rtype: int
        """
        return self._total_number_of_branches

    @total_number_of_branches.setter
    def total_number_of_branches(self, total_number_of_branches: int):
        """Sets the total_number_of_branches of this MultibranchPipeline.


        :param total_number_of_branches: The total_number_of_branches of this MultibranchPipeline.
        :type total_number_of_branches: int
        """

        self._total_number_of_branches = total_number_of_branches

    @property
    def total_number_of_pull_requests(self) -> int:
        """Gets the total_number_of_pull_requests of this MultibranchPipeline.


        :return: The total_number_of_pull_requests of this MultibranchPipeline.
        :rtype: int
        """
        return self._total_number_of_pull_requests

    @total_number_of_pull_requests.setter
    def total_number_of_pull_requests(self, total_number_of_pull_requests: int):
        """Sets the total_number_of_pull_requests of this MultibranchPipeline.


        :param total_number_of_pull_requests: The total_number_of_pull_requests of this MultibranchPipeline.
        :type total_number_of_pull_requests: int
        """

        self._total_number_of_pull_requests = total_number_of_pull_requests

    @property
    def _class(self) -> str:
        """Gets the _class of this MultibranchPipeline.


        :return: The _class of this MultibranchPipeline.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this MultibranchPipeline.


        :param _class: The _class of this MultibranchPipeline.
        :type _class: str
        """

        self.__class = _class
