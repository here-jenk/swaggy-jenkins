# Swaggy Jenkins
#
# Jenkins API clients generated from Swagger / Open API specification
#
# The version of the OpenAPI document: 1.5.1-pre.0
# Contact: blah@cliffano.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title PipelineActivity
#'
#' @description PipelineActivity Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field _class  character [optional]
#'
#' @field artifacts  list( \link{PipelineActivityartifacts} ) [optional]
#'
#' @field durationInMillis  integer [optional]
#'
#' @field estimatedDurationInMillis  integer [optional]
#'
#' @field enQueueTime  character [optional]
#'
#' @field endTime  character [optional]
#'
#' @field id  character [optional]
#'
#' @field organization  character [optional]
#'
#' @field pipeline  character [optional]
#'
#' @field result  character [optional]
#'
#' @field runSummary  character [optional]
#'
#' @field startTime  character [optional]
#'
#' @field state  character [optional]
#'
#' @field type  character [optional]
#'
#' @field commitId  character [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PipelineActivity <- R6::R6Class(
  'PipelineActivity',
  public = list(
    `_class` = NULL,
    `artifacts` = NULL,
    `durationInMillis` = NULL,
    `estimatedDurationInMillis` = NULL,
    `enQueueTime` = NULL,
    `endTime` = NULL,
    `id` = NULL,
    `organization` = NULL,
    `pipeline` = NULL,
    `result` = NULL,
    `runSummary` = NULL,
    `startTime` = NULL,
    `state` = NULL,
    `type` = NULL,
    `commitId` = NULL,
    initialize = function(
        `_class`=NULL, `artifacts`=NULL, `durationInMillis`=NULL, `estimatedDurationInMillis`=NULL, `enQueueTime`=NULL, `endTime`=NULL, `id`=NULL, `organization`=NULL, `pipeline`=NULL, `result`=NULL, `runSummary`=NULL, `startTime`=NULL, `state`=NULL, `type`=NULL, `commitId`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`_class`)) {
        stopifnot(is.character(`_class`), length(`_class`) == 1)
        self$`_class` <- `_class`
      }
      if (!is.null(`artifacts`)) {
        stopifnot(is.vector(`artifacts`), length(`artifacts`) != 0)
        sapply(`artifacts`, function(x) stopifnot(R6::is.R6(x)))
        self$`artifacts` <- `artifacts`
      }
      if (!is.null(`durationInMillis`)) {
        stopifnot(is.numeric(`durationInMillis`), length(`durationInMillis`) == 1)
        self$`durationInMillis` <- `durationInMillis`
      }
      if (!is.null(`estimatedDurationInMillis`)) {
        stopifnot(is.numeric(`estimatedDurationInMillis`), length(`estimatedDurationInMillis`) == 1)
        self$`estimatedDurationInMillis` <- `estimatedDurationInMillis`
      }
      if (!is.null(`enQueueTime`)) {
        stopifnot(is.character(`enQueueTime`), length(`enQueueTime`) == 1)
        self$`enQueueTime` <- `enQueueTime`
      }
      if (!is.null(`endTime`)) {
        stopifnot(is.character(`endTime`), length(`endTime`) == 1)
        self$`endTime` <- `endTime`
      }
      if (!is.null(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!is.null(`organization`)) {
        stopifnot(is.character(`organization`), length(`organization`) == 1)
        self$`organization` <- `organization`
      }
      if (!is.null(`pipeline`)) {
        stopifnot(is.character(`pipeline`), length(`pipeline`) == 1)
        self$`pipeline` <- `pipeline`
      }
      if (!is.null(`result`)) {
        stopifnot(is.character(`result`), length(`result`) == 1)
        self$`result` <- `result`
      }
      if (!is.null(`runSummary`)) {
        stopifnot(is.character(`runSummary`), length(`runSummary`) == 1)
        self$`runSummary` <- `runSummary`
      }
      if (!is.null(`startTime`)) {
        stopifnot(is.character(`startTime`), length(`startTime`) == 1)
        self$`startTime` <- `startTime`
      }
      if (!is.null(`state`)) {
        stopifnot(is.character(`state`), length(`state`) == 1)
        self$`state` <- `state`
      }
      if (!is.null(`type`)) {
        stopifnot(is.character(`type`), length(`type`) == 1)
        self$`type` <- `type`
      }
      if (!is.null(`commitId`)) {
        stopifnot(is.character(`commitId`), length(`commitId`) == 1)
        self$`commitId` <- `commitId`
      }
    },
    toJSON = function() {
      PipelineActivityObject <- list()
      if (!is.null(self$`_class`)) {
        PipelineActivityObject[['_class']] <-
          self$`_class`
      }
      if (!is.null(self$`artifacts`)) {
        PipelineActivityObject[['artifacts']] <-
          lapply(self$`artifacts`, function(x) x$toJSON())
      }
      if (!is.null(self$`durationInMillis`)) {
        PipelineActivityObject[['durationInMillis']] <-
          self$`durationInMillis`
      }
      if (!is.null(self$`estimatedDurationInMillis`)) {
        PipelineActivityObject[['estimatedDurationInMillis']] <-
          self$`estimatedDurationInMillis`
      }
      if (!is.null(self$`enQueueTime`)) {
        PipelineActivityObject[['enQueueTime']] <-
          self$`enQueueTime`
      }
      if (!is.null(self$`endTime`)) {
        PipelineActivityObject[['endTime']] <-
          self$`endTime`
      }
      if (!is.null(self$`id`)) {
        PipelineActivityObject[['id']] <-
          self$`id`
      }
      if (!is.null(self$`organization`)) {
        PipelineActivityObject[['organization']] <-
          self$`organization`
      }
      if (!is.null(self$`pipeline`)) {
        PipelineActivityObject[['pipeline']] <-
          self$`pipeline`
      }
      if (!is.null(self$`result`)) {
        PipelineActivityObject[['result']] <-
          self$`result`
      }
      if (!is.null(self$`runSummary`)) {
        PipelineActivityObject[['runSummary']] <-
          self$`runSummary`
      }
      if (!is.null(self$`startTime`)) {
        PipelineActivityObject[['startTime']] <-
          self$`startTime`
      }
      if (!is.null(self$`state`)) {
        PipelineActivityObject[['state']] <-
          self$`state`
      }
      if (!is.null(self$`type`)) {
        PipelineActivityObject[['type']] <-
          self$`type`
      }
      if (!is.null(self$`commitId`)) {
        PipelineActivityObject[['commitId']] <-
          self$`commitId`
      }

      PipelineActivityObject
    },
    fromJSON = function(PipelineActivityJson) {
      PipelineActivityObject <- jsonlite::fromJSON(PipelineActivityJson)
      if (!is.null(PipelineActivityObject$`_class`)) {
        self$`_class` <- PipelineActivityObject$`_class`
      }
      if (!is.null(PipelineActivityObject$`artifacts`)) {
        self$`artifacts` <- ApiClient$new()$deserializeObj(PipelineActivityObject$`artifacts`, "array[PipelineActivityartifacts]", loadNamespace("openapi"))
      }
      if (!is.null(PipelineActivityObject$`durationInMillis`)) {
        self$`durationInMillis` <- PipelineActivityObject$`durationInMillis`
      }
      if (!is.null(PipelineActivityObject$`estimatedDurationInMillis`)) {
        self$`estimatedDurationInMillis` <- PipelineActivityObject$`estimatedDurationInMillis`
      }
      if (!is.null(PipelineActivityObject$`enQueueTime`)) {
        self$`enQueueTime` <- PipelineActivityObject$`enQueueTime`
      }
      if (!is.null(PipelineActivityObject$`endTime`)) {
        self$`endTime` <- PipelineActivityObject$`endTime`
      }
      if (!is.null(PipelineActivityObject$`id`)) {
        self$`id` <- PipelineActivityObject$`id`
      }
      if (!is.null(PipelineActivityObject$`organization`)) {
        self$`organization` <- PipelineActivityObject$`organization`
      }
      if (!is.null(PipelineActivityObject$`pipeline`)) {
        self$`pipeline` <- PipelineActivityObject$`pipeline`
      }
      if (!is.null(PipelineActivityObject$`result`)) {
        self$`result` <- PipelineActivityObject$`result`
      }
      if (!is.null(PipelineActivityObject$`runSummary`)) {
        self$`runSummary` <- PipelineActivityObject$`runSummary`
      }
      if (!is.null(PipelineActivityObject$`startTime`)) {
        self$`startTime` <- PipelineActivityObject$`startTime`
      }
      if (!is.null(PipelineActivityObject$`state`)) {
        self$`state` <- PipelineActivityObject$`state`
      }
      if (!is.null(PipelineActivityObject$`type`)) {
        self$`type` <- PipelineActivityObject$`type`
      }
      if (!is.null(PipelineActivityObject$`commitId`)) {
        self$`commitId` <- PipelineActivityObject$`commitId`
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
        if (!is.null(self$`artifacts`)) {
        sprintf(
        '"artifacts":
        [%s]
',
        paste(sapply(self$`artifacts`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox=TRUE, digits = NA)), collapse=",")
        )},
        if (!is.null(self$`durationInMillis`)) {
        sprintf(
        '"durationInMillis":
          %d
                ',
        self$`durationInMillis`
        )},
        if (!is.null(self$`estimatedDurationInMillis`)) {
        sprintf(
        '"estimatedDurationInMillis":
          %d
                ',
        self$`estimatedDurationInMillis`
        )},
        if (!is.null(self$`enQueueTime`)) {
        sprintf(
        '"enQueueTime":
          "%s"
                ',
        self$`enQueueTime`
        )},
        if (!is.null(self$`endTime`)) {
        sprintf(
        '"endTime":
          "%s"
                ',
        self$`endTime`
        )},
        if (!is.null(self$`id`)) {
        sprintf(
        '"id":
          "%s"
                ',
        self$`id`
        )},
        if (!is.null(self$`organization`)) {
        sprintf(
        '"organization":
          "%s"
                ',
        self$`organization`
        )},
        if (!is.null(self$`pipeline`)) {
        sprintf(
        '"pipeline":
          "%s"
                ',
        self$`pipeline`
        )},
        if (!is.null(self$`result`)) {
        sprintf(
        '"result":
          "%s"
                ',
        self$`result`
        )},
        if (!is.null(self$`runSummary`)) {
        sprintf(
        '"runSummary":
          "%s"
                ',
        self$`runSummary`
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
        )},
        if (!is.null(self$`type`)) {
        sprintf(
        '"type":
          "%s"
                ',
        self$`type`
        )},
        if (!is.null(self$`commitId`)) {
        sprintf(
        '"commitId":
          "%s"
                ',
        self$`commitId`
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(PipelineActivityJson) {
      PipelineActivityObject <- jsonlite::fromJSON(PipelineActivityJson)
      self$`_class` <- PipelineActivityObject$`_class`
      self$`artifacts` <- ApiClient$new()$deserializeObj(PipelineActivityObject$`artifacts`, "array[PipelineActivityartifacts]", loadNamespace("openapi"))
      self$`durationInMillis` <- PipelineActivityObject$`durationInMillis`
      self$`estimatedDurationInMillis` <- PipelineActivityObject$`estimatedDurationInMillis`
      self$`enQueueTime` <- PipelineActivityObject$`enQueueTime`
      self$`endTime` <- PipelineActivityObject$`endTime`
      self$`id` <- PipelineActivityObject$`id`
      self$`organization` <- PipelineActivityObject$`organization`
      self$`pipeline` <- PipelineActivityObject$`pipeline`
      self$`result` <- PipelineActivityObject$`result`
      self$`runSummary` <- PipelineActivityObject$`runSummary`
      self$`startTime` <- PipelineActivityObject$`startTime`
      self$`state` <- PipelineActivityObject$`state`
      self$`type` <- PipelineActivityObject$`type`
      self$`commitId` <- PipelineActivityObject$`commitId`
      self
    }
  )
)
