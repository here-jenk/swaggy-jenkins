#
# Swaggy Jenkins
# 
# Jenkins API clients generated from Swagger / Open API specification
# The version of the OpenAPI document: 1.5.1-pre.0
# Contact: blah@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_free_style_project

type ListView* = object
  ## 
  class*: string
  description*: string
  jobs*: seq[FreeStyleProject]
  name*: string
  url*: string
