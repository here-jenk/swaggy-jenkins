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
from openapi_client.models.cause_user_id_cause import CauseUserIdCause  # noqa: E501
from openapi_client.rest import ApiException

class TestCauseUserIdCause(unittest.TestCase):
    """CauseUserIdCause unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test CauseUserIdCause
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.cause_user_id_cause.CauseUserIdCause()  # noqa: E501
        if include_optional :
            return CauseUserIdCause(
                _class = '', 
                short_description = '', 
                user_id = '', 
                user_name = ''
            )
        else :
            return CauseUserIdCause(
        )

    def testCauseUserIdCause(self):
        """Test CauseUserIdCause"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
