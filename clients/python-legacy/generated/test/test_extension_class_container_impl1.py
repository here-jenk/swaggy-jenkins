# coding: utf-8

"""
    Swaggy Jenkins

    Jenkins API clients generated from Swagger / Open API specification  # noqa: E501

    The version of the OpenAPI document: 1.5.1-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import openapi_client
from openapi_client.models.extension_class_container_impl1 import ExtensionClassContainerImpl1  # noqa: E501
from openapi_client.rest import ApiException

class TestExtensionClassContainerImpl1(unittest.TestCase):
    """ExtensionClassContainerImpl1 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test ExtensionClassContainerImpl1
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.extension_class_container_impl1.ExtensionClassContainerImpl1()  # noqa: E501
        if include_optional :
            return ExtensionClassContainerImpl1(
                _class = '', 
                links = openapi_client.models.extension_class_container_impl1links.ExtensionClassContainerImpl1links(
                    self = openapi_client.models.link.Link(
                        _class = '', 
                        href = '', ), 
                    _class = '', ), 
                map = openapi_client.models.extension_class_container_impl1map.ExtensionClassContainerImpl1map(
                    io/jenkins/blueocean/service/embedded/rest/pipeline_impl = openapi_client.models.extension_class_impl.ExtensionClassImpl(
                        _class = '', 
                        _links = openapi_client.models.extension_class_impllinks.ExtensionClassImpllinks(
                            self = openapi_client.models.link.Link(
                                _class = '', 
                                href = '', ), 
                            _class = '', ), 
                        classes = [
                            ''
                            ], ), 
                    io/jenkins/blueocean/service/embedded/rest/multi_branch_pipeline_impl = openapi_client.models.extension_class_impl.ExtensionClassImpl(
                        _class = '', ), 
                    _class = '', )
            )
        else :
            return ExtensionClassContainerImpl1(
        )

    def testExtensionClassContainerImpl1(self):
        """Test ExtensionClassContainerImpl1"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
