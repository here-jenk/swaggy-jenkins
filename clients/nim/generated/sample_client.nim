#
# Swaggy Jenkins
# 
# Jenkins API clients generated from Swagger / Open API specification
# The version of the OpenAPI document: 1.5.1-pre.0
# Contact: blah@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import logging
import options

import openapiclient

import config

let logger = newConsoleLogger()
addHandler(logger)

let client = newHttpClient()
client.headers["User-Agent"] = config.useragent
