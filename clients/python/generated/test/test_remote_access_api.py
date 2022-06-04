"""
    Swaggy Jenkins

    Jenkins API clients generated from Swagger / Open API specification  # noqa: E501

    The version of the OpenAPI document: 1.5.1-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""


import unittest

import swaggyjenkins
from swaggyjenkins.api.remote_access_api import RemoteAccessApi  # noqa: E501


class TestRemoteAccessApi(unittest.TestCase):
    """RemoteAccessApi unit test stubs"""

    def setUp(self):
        self.api = RemoteAccessApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_computer(self):
        """Test case for get_computer

        """
        pass

    def test_get_jenkins(self):
        """Test case for get_jenkins

        """
        pass

    def test_get_job(self):
        """Test case for get_job

        """
        pass

    def test_get_job_config(self):
        """Test case for get_job_config

        """
        pass

    def test_get_job_last_build(self):
        """Test case for get_job_last_build

        """
        pass

    def test_get_job_progressive_text(self):
        """Test case for get_job_progressive_text

        """
        pass

    def test_get_queue(self):
        """Test case for get_queue

        """
        pass

    def test_get_queue_item(self):
        """Test case for get_queue_item

        """
        pass

    def test_get_view(self):
        """Test case for get_view

        """
        pass

    def test_get_view_config(self):
        """Test case for get_view_config

        """
        pass

    def test_head_jenkins(self):
        """Test case for head_jenkins

        """
        pass

    def test_post_create_item(self):
        """Test case for post_create_item

        """
        pass

    def test_post_create_view(self):
        """Test case for post_create_view

        """
        pass

    def test_post_job_build(self):
        """Test case for post_job_build

        """
        pass

    def test_post_job_config(self):
        """Test case for post_job_config

        """
        pass

    def test_post_job_delete(self):
        """Test case for post_job_delete

        """
        pass

    def test_post_job_disable(self):
        """Test case for post_job_disable

        """
        pass

    def test_post_job_enable(self):
        """Test case for post_job_enable

        """
        pass

    def test_post_job_last_build_stop(self):
        """Test case for post_job_last_build_stop

        """
        pass

    def test_post_view_config(self):
        """Test case for post_view_config

        """
        pass


if __name__ == '__main__':
    unittest.main()
