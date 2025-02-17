# Swaggy Jenkins
#
# Jenkins API clients generated from Swagger / Open API specification
#
# The version of the OpenAPI document: 1.5.1-pre.0
# Contact: blah@cliffano.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title PipelineBranchesitemlatestRun
#'
#' @description PipelineBranchesitemlatestRun Class
#'
#' @format An \code{R6Class} generator object
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
#' @field _class  character [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PipelineBranchesitemlatestRun <- R6::R6Class(
  'PipelineBranchesitemlatestRun',
  public = list(
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
    `_class` = NULL,
    initialize = function(
        `durationInMillis`=NULL, `estimatedDurationInMillis`=NULL, `enQueueTime`=NULL, `endTime`=NULL, `id`=NULL, `organization`=NULL, `pipeline`=NULL, `result`=NULL, `runSummary`=NULL, `startTime`=NULL, `state`=NULL, `type`=NULL, `commitId`=NULL, `_class`=NULL, ...
    ) {
      local.optional.var <- list(...)
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
      if (!is.null(`_class`)) {
        stopifnot(is.character(`_class`), length(`_class`) == 1)
        self$`_class` <- `_class`
      }
    },
    toJSON = function() {
      PipelineBranchesitemlatestRunObject <- list()
      if (!is.null(self$`durationInMillis`)) {
        PipelineBranchesitemlatestRunObject[['durationInMillis']] <-
          self$`durationInMillis`
      }
      if (!is.null(self$`estimatedDurationInMillis`)) {
        PipelineBranchesitemlatestRunObject[['estimatedDurationInMillis']] <-
          self$`estimatedDurationInMillis`
      }
      if (!is.null(self$`enQueueTime`)) {
        PipelineBranchesitemlatestRunObject[['enQueueTime']] <-
          self$`enQueueTime`
      }
      if (!is.null(self$`endTime`)) {
        PipelineBranchesitemlatestRunObject[['endTime']] <-
          self$`endTime`
      }
      if (!is.null(self$`id`)) {
        PipelineBranchesitemlatestRunObject[['id']] <-
          self$`id`
      }
      if (!is.null(self$`organization`)) {
        PipelineBranchesitemlatestRunObject[['organization']] <-
          self$`organization`
      }
      if (!is.null(self$`pipeline`)) {
        PipelineBranchesitemlatestRunObject[['pipeline']] <-
          self$`pipeline`
      }
      if (!is.null(self$`result`)) {
        PipelineBranchesitemlatestRunObject[['result']] <-
          self$`result`
      }
      if (!is.null(self$`runSummary`)) {
        PipelineBranchesitemlatestRunObject[['runSummary']] <-
          self$`runSummary`
      }
      if (!is.null(self$`startTime`)) {
        PipelineBranchesitemlatestRunObject[['startTime']] <-
          self$`startTime`
      }
      if (!is.null(self$`state`)) {
        PipelineBranchesitemlatestRunObject[['state']] <-
          self$`state`
      }
      if (!is.null(self$`type`)) {
        PipelineBranchesitemlatestRunObject[['type']] <-
          self$`type`
      }
      if (!is.null(self$`commitId`)) {
        PipelineBranchesitemlatestRunObject[['commitId']] <-
          self$`commitId`
      }
      if (!is.null(self$`_class`)) {
        PipelineBranchesitemlatestRunObject[['_class']] <-
          self$`_class`
      }

      PipelineBranchesitemlatestRunObject
    },
    fromJSON = function(PipelineBranchesitemlatestRunJson) {
      PipelineBranchesitemlatestRunObject <- jsonlite::fromJSON(PipelineBranchesitemlatestRunJson)
      if (!is.null(PipelineBranchesitemlatestRunObject$`durationInMillis`)) {
        self$`durationInMillis` <- PipelineBranchesitemlatestRunObject$`durationInMillis`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`estimatedDurationInMillis`)) {
        self$`estimatedDurationInMillis` <- PipelineBranchesitemlatestRunObject$`estimatedDurationInMillis`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`enQueueTime`)) {
        self$`enQueueTime` <- PipelineBranchesitemlatestRunObject$`enQueueTime`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`endTime`)) {
        self$`endTime` <- PipelineBranchesitemlatestRunObject$`endTime`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`id`)) {
        self$`id` <- PipelineBranchesitemlatestRunObject$`id`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`organization`)) {
        self$`organization` <- PipelineBranchesitemlatestRunObject$`organization`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`pipeline`)) {
        self$`pipeline` <- PipelineBranchesitemlatestRunObject$`pipeline`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`result`)) {
        self$`result` <- PipelineBranchesitemlatestRunObject$`result`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`runSummary`)) {
        self$`runSummary` <- PipelineBranchesitemlatestRunObject$`runSummary`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`startTime`)) {
        self$`startTime` <- PipelineBranchesitemlatestRunObject$`startTime`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`state`)) {
        self$`state` <- PipelineBranchesitemlatestRunObject$`state`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`type`)) {
        self$`type` <- PipelineBranchesitemlatestRunObject$`type`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`commitId`)) {
        self$`commitId` <- PipelineBranchesitemlatestRunObject$`commitId`
      }
      if (!is.null(PipelineBranchesitemlatestRunObject$`_class`)) {
        self$`_class` <- PipelineBranchesitemlatestRunObject$`_class`
      }
      self
    },
    toJSONString = function() {
      jsoncontent <- c(
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
        )},
        if (!is.null(self$`_class`)) {
        sprintf(
        '"_class":
          "%s"
                ',
        self$`_class`
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(PipelineBranchesitemlatestRunJson) {
      PipelineBranchesitemlatestRunObject <- jsonlite::fromJSON(PipelineBranchesitemlatestRunJson)
      self$`durationInMillis` <- PipelineBranchesitemlatestRunObject$`durationInMillis`
      self$`estimatedDurationInMillis` <- PipelineBranchesitemlatestRunObject$`estimatedDurationInMillis`
      self$`enQueueTime` <- PipelineBranchesitemlatestRunObject$`enQueueTime`
      self$`endTime` <- PipelineBranchesitemlatestRunObject$`endTime`
      self$`id` <- PipelineBranchesitemlatestRunObject$`id`
      self$`organization` <- PipelineBranchesitemlatestRunObject$`organization`
      self$`pipeline` <- PipelineBranchesitemlatestRunObject$`pipeline`
      self$`result` <- PipelineBranchesitemlatestRunObject$`result`
      self$`runSummary` <- PipelineBranchesitemlatestRunObject$`runSummary`
      self$`startTime` <- PipelineBranchesitemlatestRunObject$`startTime`
      self$`state` <- PipelineBranchesitemlatestRunObject$`state`
      self$`type` <- PipelineBranchesitemlatestRunObject$`type`
      self$`commitId` <- PipelineBranchesitemlatestRunObject$`commitId`
      self$`_class` <- PipelineBranchesitemlatestRunObject$`_class`
      self
    }
  )
)
