#
# Swaggy Jenkins
# 
# Jenkins API clients generated from Swagger / Open API specification
# The version of the OpenAPI document: 1.1.2-pre.0
# Contact: blah@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_link

type PipelineRunImpllinks* = object
  ## 
  nodes*: Link
  log*: Link
  self*: Link
  actions*: Link
  steps*: Link
  class*: string
