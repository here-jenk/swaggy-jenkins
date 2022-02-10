# coding: utf-8

"""
    Swaggy Jenkins

    Jenkins API clients generated from Swagger / Open API specification  # noqa: E501

    The version of the OpenAPI document: 1.1.2-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import openapi_client
from openapi_client.models.pipeline_runartifacts import PipelineRunartifacts  # noqa: E501
from openapi_client.rest import ApiException

class TestPipelineRunartifacts(unittest.TestCase):
    """PipelineRunartifacts unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test PipelineRunartifacts
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.pipeline_runartifacts.PipelineRunartifacts()  # noqa: E501
        if include_optional :
            return PipelineRunartifacts(
                name = '', 
                size = 56, 
                url = '', 
                _class = ''
            )
        else :
            return PipelineRunartifacts(
        )

    def testPipelineRunartifacts(self):
        """Test PipelineRunartifacts"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
