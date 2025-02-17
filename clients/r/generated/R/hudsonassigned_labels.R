# Swaggy Jenkins
#
# Jenkins API clients generated from Swagger / Open API specification
#
# The version of the OpenAPI document: 1.5.1-pre.0
# Contact: blah@cliffano.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title HudsonassignedLabels
#'
#' @description HudsonassignedLabels Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field _class  character [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
HudsonassignedLabels <- R6::R6Class(
  'HudsonassignedLabels',
  public = list(
    `_class` = NULL,
    initialize = function(
        `_class`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`_class`)) {
        stopifnot(is.character(`_class`), length(`_class`) == 1)
        self$`_class` <- `_class`
      }
    },
    toJSON = function() {
      HudsonassignedLabelsObject <- list()
      if (!is.null(self$`_class`)) {
        HudsonassignedLabelsObject[['_class']] <-
          self$`_class`
      }

      HudsonassignedLabelsObject
    },
    fromJSON = function(HudsonassignedLabelsJson) {
      HudsonassignedLabelsObject <- jsonlite::fromJSON(HudsonassignedLabelsJson)
      if (!is.null(HudsonassignedLabelsObject$`_class`)) {
        self$`_class` <- HudsonassignedLabelsObject$`_class`
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
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(HudsonassignedLabelsJson) {
      HudsonassignedLabelsObject <- jsonlite::fromJSON(HudsonassignedLabelsJson)
      self$`_class` <- HudsonassignedLabelsObject$`_class`
      self
    }
  )
)
