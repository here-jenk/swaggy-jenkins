# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.extension_class_impl import ExtensionClassImpl  # noqa: F401,E501
from openapi_server import util


class ExtensionClassContainerImpl1map(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, io_jenkins_blueocean_service_embedded_rest_pipeline_impl: ExtensionClassImpl=None, io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl: ExtensionClassImpl=None, _class: str=None):  # noqa: E501
        """ExtensionClassContainerImpl1map - a model defined in Swagger

        :param io_jenkins_blueocean_service_embedded_rest_pipeline_impl: The io_jenkins_blueocean_service_embedded_rest_pipeline_impl of this ExtensionClassContainerImpl1map.  # noqa: E501
        :type io_jenkins_blueocean_service_embedded_rest_pipeline_impl: ExtensionClassImpl
        :param io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl: The io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl of this ExtensionClassContainerImpl1map.  # noqa: E501
        :type io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl: ExtensionClassImpl
        :param _class: The _class of this ExtensionClassContainerImpl1map.  # noqa: E501
        :type _class: str
        """
        self.swagger_types = {
            'io_jenkins_blueocean_service_embedded_rest_pipeline_impl': ExtensionClassImpl,
            'io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl': ExtensionClassImpl,
            '_class': str
        }

        self.attribute_map = {
            'io_jenkins_blueocean_service_embedded_rest_pipeline_impl': 'io.jenkins.blueocean.service.embedded.rest.PipelineImpl',
            'io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl': 'io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl',
            '_class': '_class'
        }

        self._io_jenkins_blueocean_service_embedded_rest_pipeline_impl = io_jenkins_blueocean_service_embedded_rest_pipeline_impl
        self._io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl = io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl
        self.__class = _class

    @classmethod
    def from_dict(cls, dikt) -> 'ExtensionClassContainerImpl1map':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ExtensionClassContainerImpl1map of this ExtensionClassContainerImpl1map.  # noqa: E501
        :rtype: ExtensionClassContainerImpl1map
        """
        return util.deserialize_model(dikt, cls)

    @property
    def io_jenkins_blueocean_service_embedded_rest_pipeline_impl(self) -> ExtensionClassImpl:
        """Gets the io_jenkins_blueocean_service_embedded_rest_pipeline_impl of this ExtensionClassContainerImpl1map.


        :return: The io_jenkins_blueocean_service_embedded_rest_pipeline_impl of this ExtensionClassContainerImpl1map.
        :rtype: ExtensionClassImpl
        """
        return self._io_jenkins_blueocean_service_embedded_rest_pipeline_impl

    @io_jenkins_blueocean_service_embedded_rest_pipeline_impl.setter
    def io_jenkins_blueocean_service_embedded_rest_pipeline_impl(self, io_jenkins_blueocean_service_embedded_rest_pipeline_impl: ExtensionClassImpl):
        """Sets the io_jenkins_blueocean_service_embedded_rest_pipeline_impl of this ExtensionClassContainerImpl1map.


        :param io_jenkins_blueocean_service_embedded_rest_pipeline_impl: The io_jenkins_blueocean_service_embedded_rest_pipeline_impl of this ExtensionClassContainerImpl1map.
        :type io_jenkins_blueocean_service_embedded_rest_pipeline_impl: ExtensionClassImpl
        """

        self._io_jenkins_blueocean_service_embedded_rest_pipeline_impl = io_jenkins_blueocean_service_embedded_rest_pipeline_impl

    @property
    def io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl(self) -> ExtensionClassImpl:
        """Gets the io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl of this ExtensionClassContainerImpl1map.


        :return: The io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl of this ExtensionClassContainerImpl1map.
        :rtype: ExtensionClassImpl
        """
        return self._io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl

    @io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl.setter
    def io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl(self, io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl: ExtensionClassImpl):
        """Sets the io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl of this ExtensionClassContainerImpl1map.


        :param io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl: The io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl of this ExtensionClassContainerImpl1map.
        :type io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl: ExtensionClassImpl
        """

        self._io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl = io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl

    @property
    def _class(self) -> str:
        """Gets the _class of this ExtensionClassContainerImpl1map.


        :return: The _class of this ExtensionClassContainerImpl1map.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this ExtensionClassContainerImpl1map.


        :param _class: The _class of this ExtensionClassContainerImpl1map.
        :type _class: str
        """

        self.__class = _class
