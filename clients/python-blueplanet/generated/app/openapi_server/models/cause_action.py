# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.cause_user_id_cause import CauseUserIdCause  # noqa: F401,E501
from openapi_server import util


class CauseAction(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, causes: List[CauseUserIdCause]=None):  # noqa: E501
        """CauseAction - a model defined in Swagger

        :param _class: The _class of this CauseAction.  # noqa: E501
        :type _class: str
        :param causes: The causes of this CauseAction.  # noqa: E501
        :type causes: List[CauseUserIdCause]
        """
        self.swagger_types = {
            '_class': str,
            'causes': List[CauseUserIdCause]
        }

        self.attribute_map = {
            '_class': '_class',
            'causes': 'causes'
        }

        self.__class = _class
        self._causes = causes

    @classmethod
    def from_dict(cls, dikt) -> 'CauseAction':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CauseAction of this CauseAction.  # noqa: E501
        :rtype: CauseAction
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self) -> str:
        """Gets the _class of this CauseAction.


        :return: The _class of this CauseAction.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: str):
        """Sets the _class of this CauseAction.


        :param _class: The _class of this CauseAction.
        :type _class: str
        """

        self.__class = _class

    @property
    def causes(self) -> List[CauseUserIdCause]:
        """Gets the causes of this CauseAction.


        :return: The causes of this CauseAction.
        :rtype: List[CauseUserIdCause]
        """
        return self._causes

    @causes.setter
    def causes(self, causes: List[CauseUserIdCause]):
        """Sets the causes of this CauseAction.


        :param causes: The causes of this CauseAction.
        :type causes: List[CauseUserIdCause]
        """

        self._causes = causes
