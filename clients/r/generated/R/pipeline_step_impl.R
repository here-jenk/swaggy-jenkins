# Swaggy Jenkins
#
# Jenkins API clients generated from Swagger / Open API specification
#
# The version of the OpenAPI document: 1.5.1-pre.0
# Contact: blah@cliffano.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title PipelineStepImpl
#'
#' @description PipelineStepImpl Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field _class  character [optional]
#'
#' @field _links  \link{PipelineStepImpllinks} [optional]
#'
#' @field displayName  character [optional]
#'
#' @field durationInMillis  integer [optional]
#'
#' @field id  character [optional]
#'
#' @field input  \link{InputStepImpl} [optional]
#'
#' @field result  character [optional]
#'
#' @field startTime  character [optional]
#'
#' @field state  character [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PipelineStepImpl <- R6::R6Class(
  'PipelineStepImpl',
  public = list(
    `_class` = NULL,
    `_links` = NULL,
    `displayName` = NULL,
    `durationInMillis` = NULL,
    `id` = NULL,
    `input` = NULL,
    `result` = NULL,
    `startTime` = NULL,
    `state` = NULL,
    initialize = function(
        `_class`=NULL, `_links`=NULL, `displayName`=NULL, `durationInMillis`=NULL, `id`=NULL, `input`=NULL, `result`=NULL, `startTime`=NULL, `state`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`_class`)) {
        stopifnot(is.character(`_class`), length(`_class`) == 1)
        self$`_class` <- `_class`
      }
      if (!is.null(`_links`)) {
        stopifnot(R6::is.R6(`_links`))
        self$`_links` <- `_links`
      }
      if (!is.null(`displayName`)) {
        stopifnot(is.character(`displayName`), length(`displayName`) == 1)
        self$`displayName` <- `displayName`
      }
      if (!is.null(`durationInMillis`)) {
        stopifnot(is.numeric(`durationInMillis`), length(`durationInMillis`) == 1)
        self$`durationInMillis` <- `durationInMillis`
      }
      if (!is.null(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!is.null(`input`)) {
        stopifnot(R6::is.R6(`input`))
        self$`input` <- `input`
      }
      if (!is.null(`result`)) {
        stopifnot(is.character(`result`), length(`result`) == 1)
        self$`result` <- `result`
      }
      if (!is.null(`startTime`)) {
        stopifnot(is.character(`startTime`), length(`startTime`) == 1)
        self$`startTime` <- `startTime`
      }
      if (!is.null(`state`)) {
        stopifnot(is.character(`state`), length(`state`) == 1)
        self$`state` <- `state`
      }
    },
    toJSON = function() {
      PipelineStepImplObject <- list()
      if (!is.null(self$`_class`)) {
        PipelineStepImplObject[['_class']] <-
          self$`_class`
      }
      if (!is.null(self$`_links`)) {
        PipelineStepImplObject[['_links']] <-
          self$`_links`$toJSON()
      }
      if (!is.null(self$`displayName`)) {
        PipelineStepImplObject[['displayName']] <-
          self$`displayName`
      }
      if (!is.null(self$`durationInMillis`)) {
        PipelineStepImplObject[['durationInMillis']] <-
          self$`durationInMillis`
      }
      if (!is.null(self$`id`)) {
        PipelineStepImplObject[['id']] <-
          self$`id`
      }
      if (!is.null(self$`input`)) {
        PipelineStepImplObject[['input']] <-
          self$`input`$toJSON()
      }
      if (!is.null(self$`result`)) {
        PipelineStepImplObject[['result']] <-
          self$`result`
      }
      if (!is.null(self$`startTime`)) {
        PipelineStepImplObject[['startTime']] <-
          self$`startTime`
      }
      if (!is.null(self$`state`)) {
        PipelineStepImplObject[['state']] <-
          self$`state`
      }

      PipelineStepImplObject
    },
    fromJSON = function(PipelineStepImplJson) {
      PipelineStepImplObject <- jsonlite::fromJSON(PipelineStepImplJson)
      if (!is.null(PipelineStepImplObject$`_class`)) {
        self$`_class` <- PipelineStepImplObject$`_class`
      }
      if (!is.null(PipelineStepImplObject$`_links`)) {
        _linksObject <- PipelineStepImpllinks$new()
        _linksObject$fromJSON(jsonlite::toJSON(PipelineStepImplObject$_links, auto_unbox = TRUE, digits = NA))
        self$`_links` <- _linksObject
      }
      if (!is.null(PipelineStepImplObject$`displayName`)) {
        self$`displayName` <- PipelineStepImplObject$`displayName`
      }
      if (!is.null(PipelineStepImplObject$`durationInMillis`)) {
        self$`durationInMillis` <- PipelineStepImplObject$`durationInMillis`
      }
      if (!is.null(PipelineStepImplObject$`id`)) {
        self$`id` <- PipelineStepImplObject$`id`
      }
      if (!is.null(PipelineStepImplObject$`input`)) {
        inputObject <- InputStepImpl$new()
        inputObject$fromJSON(jsonlite::toJSON(PipelineStepImplObject$input, auto_unbox = TRUE, digits = NA))
        self$`input` <- inputObject
      }
      if (!is.null(PipelineStepImplObject$`result`)) {
        self$`result` <- PipelineStepImplObject$`result`
      }
      if (!is.null(PipelineStepImplObject$`startTime`)) {
        self$`startTime` <- PipelineStepImplObject$`startTime`
      }
      if (!is.null(PipelineStepImplObject$`state`)) {
        self$`state` <- PipelineStepImplObject$`state`
      }
      self
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`_class`)) {
        sprintf(
        '"_class":
          "%s"
                ',
        self$`_class`
        )},
        if (!is.null(self$`_links`)) {
        sprintf(
        '"_links":
        %s
        ',
        jsonlite::toJSON(self$`_links`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`displayName`)) {
        sprintf(
        '"displayName":
          "%s"
                ',
        self$`displayName`
        )},
        if (!is.null(self$`durationInMillis`)) {
        sprintf(
        '"durationInMillis":
          %d
                ',
        self$`durationInMillis`
        )},
        if (!is.null(self$`id`)) {
        sprintf(
        '"id":
          "%s"
                ',
        self$`id`
        )},
        if (!is.null(self$`input`)) {
        sprintf(
        '"input":
        %s
        ',
        jsonlite::toJSON(self$`input`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`result`)) {
        sprintf(
        '"result":
          "%s"
                ',
        self$`result`
        )},
        if (!is.null(self$`startTime`)) {
        sprintf(
        '"startTime":
          "%s"
                ',
        self$`startTime`
        )},
        if (!is.null(self$`state`)) {
        sprintf(
        '"state":
          "%s"
                ',
        self$`state`
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(PipelineStepImplJson) {
      PipelineStepImplObject <- jsonlite::fromJSON(PipelineStepImplJson)
      self$`_class` <- PipelineStepImplObject$`_class`
      self$`_links` <- PipelineStepImpllinks$new()$fromJSON(jsonlite::toJSON(PipelineStepImplObject$_links, auto_unbox = TRUE, digits = NA))
      self$`displayName` <- PipelineStepImplObject$`displayName`
      self$`durationInMillis` <- PipelineStepImplObject$`durationInMillis`
      self$`id` <- PipelineStepImplObject$`id`
      self$`input` <- InputStepImpl$new()$fromJSON(jsonlite::toJSON(PipelineStepImplObject$input, auto_unbox = TRUE, digits = NA))
      self$`result` <- PipelineStepImplObject$`result`
      self$`startTime` <- PipelineStepImplObject$`startTime`
      self$`state` <- PipelineStepImplObject$`state`
      self
    }
  )
)
