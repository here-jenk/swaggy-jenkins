# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model_ import Model
from openapi_server.models.queue_blocked_item import QueueBlockedItem
from openapi_server import util


class Queue(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _class: str=None, items: List[QueueBlockedItem]=None):
        """Queue - a model defined in OpenAPI

        :param _class: The _class of this Queue.
        :param items: The items of this Queue.
        """
        self.openapi_types = {
            '_class': str,
            'items': List[QueueBlockedItem]
        }

        self.attribute_map = {
            '_class': '_class',
            'items': 'items'
        }

        self.__class = _class
        self._items = items

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Queue':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Queue of this Queue.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _class(self):
        """Gets the _class of this Queue.


        :return: The _class of this Queue.
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class):
        """Sets the _class of this Queue.


        :param _class: The _class of this Queue.
        :type _class: str
        """

        self.__class = _class

    @property
    def items(self):
        """Gets the items of this Queue.


        :return: The items of this Queue.
        :rtype: List[QueueBlockedItem]
        """
        return self._items

    @items.setter
    def items(self, items):
        """Sets the items of this Queue.


        :param items: The items of this Queue.
        :type items: List[QueueBlockedItem]
        """

        self._items = items
