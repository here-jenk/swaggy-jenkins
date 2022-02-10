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
from openapi_client.models.default_crumb_issuer import DefaultCrumbIssuer  # noqa: E501
from openapi_client.rest import ApiException

class TestDefaultCrumbIssuer(unittest.TestCase):
    """DefaultCrumbIssuer unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test DefaultCrumbIssuer
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.default_crumb_issuer.DefaultCrumbIssuer()  # noqa: E501
        if include_optional :
            return DefaultCrumbIssuer(
                _class = '', 
                crumb = '', 
                crumb_request_field = ''
            )
        else :
            return DefaultCrumbIssuer(
        )

    def testDefaultCrumbIssuer(self):
        """Test DefaultCrumbIssuer"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
