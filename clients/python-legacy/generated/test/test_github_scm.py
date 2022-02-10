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
from openapi_client.models.github_scm import GithubScm  # noqa: E501
from openapi_client.rest import ApiException

class TestGithubScm(unittest.TestCase):
    """GithubScm unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test GithubScm
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.github_scm.GithubScm()  # noqa: E501
        if include_optional :
            return GithubScm(
                _class = '', 
                links = openapi_client.models.github_scmlinks.GithubScmlinks(
                    self = openapi_client.models.link.Link(
                        _class = '', 
                        href = '', ), 
                    _class = '', ), 
                credential_id = '', 
                id = '', 
                uri = ''
            )
        else :
            return GithubScm(
        )

    def testGithubScm(self):
        """Test GithubScm"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
