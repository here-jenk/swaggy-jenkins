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

import model_github_organizationlinks

type GithubOrganization* = object
  ## 
  class*: string
  links*: GithubOrganizationlinks
  jenkinsOrganizationPipeline*: bool
  name*: string
