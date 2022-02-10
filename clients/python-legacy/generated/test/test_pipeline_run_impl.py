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
from openapi_client.models.pipeline_run_impl import PipelineRunImpl  # noqa: E501
from openapi_client.rest import ApiException

class TestPipelineRunImpl(unittest.TestCase):
    """PipelineRunImpl unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test PipelineRunImpl
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.pipeline_run_impl.PipelineRunImpl()  # noqa: E501
        if include_optional :
            return PipelineRunImpl(
                _class = '', 
                links = openapi_client.models.pipeline_run_impllinks.PipelineRunImpllinks(
                    nodes = openapi_client.models.link.Link(
                        _class = '', 
                        href = '', ), 
                    log = openapi_client.models.link.Link(
                        _class = '', 
                        href = '', ), 
                    self = openapi_client.models.link.Link(
                        _class = '', 
                        href = '', ), 
                    actions = openapi_client.models.link.Link(
                        _class = '', 
                        href = '', ), 
                    steps = openapi_client.models.link.Link(
                        _class = '', 
                        href = '', ), 
                    _class = '', ), 
                duration_in_millis = 56, 
                en_queue_time = '', 
                end_time = '', 
                estimated_duration_in_millis = 56, 
                id = '', 
                organization = '', 
                pipeline = '', 
                result = '', 
                run_summary = '', 
                start_time = '', 
                state = '', 
                type = '', 
                commit_id = ''
            )
        else :
            return PipelineRunImpl(
        )

    def testPipelineRunImpl(self):
        """Test PipelineRunImpl"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
