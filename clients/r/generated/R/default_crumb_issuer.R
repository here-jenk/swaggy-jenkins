# Swaggy Jenkins
#
# Jenkins API clients generated from Swagger / Open API specification
#
# The version of the OpenAPI document: 1.5.1-pre.0
# Contact: blah@cliffano.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title DefaultCrumbIssuer
#'
#' @description DefaultCrumbIssuer Class
#'
#' @format An \code{R6Class} generator object
#'
#' @field _class  character [optional]
#'
#' @field crumb  character [optional]
#'
#' @field crumbRequestField  character [optional]
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DefaultCrumbIssuer <- R6::R6Class(
  'DefaultCrumbIssuer',
  public = list(
    `_class` = NULL,
    `crumb` = NULL,
    `crumbRequestField` = NULL,
    initialize = function(
        `_class`=NULL, `crumb`=NULL, `crumbRequestField`=NULL, ...
    ) {
      local.optional.var <- list(...)
      if (!is.null(`_class`)) {
        stopifnot(is.character(`_class`), length(`_class`) == 1)
        self$`_class` <- `_class`
      }
      if (!is.null(`crumb`)) {
        stopifnot(is.character(`crumb`), length(`crumb`) == 1)
        self$`crumb` <- `crumb`
      }
      if (!is.null(`crumbRequestField`)) {
        stopifnot(is.character(`crumbRequestField`), length(`crumbRequestField`) == 1)
        self$`crumbRequestField` <- `crumbRequestField`
      }
    },
    toJSON = function() {
      DefaultCrumbIssuerObject <- list()
      if (!is.null(self$`_class`)) {
        DefaultCrumbIssuerObject[['_class']] <-
          self$`_class`
      }
      if (!is.null(self$`crumb`)) {
        DefaultCrumbIssuerObject[['crumb']] <-
          self$`crumb`
      }
      if (!is.null(self$`crumbRequestField`)) {
        DefaultCrumbIssuerObject[['crumbRequestField']] <-
          self$`crumbRequestField`
      }

      DefaultCrumbIssuerObject
    },
    fromJSON = function(DefaultCrumbIssuerJson) {
      DefaultCrumbIssuerObject <- jsonlite::fromJSON(DefaultCrumbIssuerJson)
      if (!is.null(DefaultCrumbIssuerObject$`_class`)) {
        self$`_class` <- DefaultCrumbIssuerObject$`_class`
      }
      if (!is.null(DefaultCrumbIssuerObject$`crumb`)) {
        self$`crumb` <- DefaultCrumbIssuerObject$`crumb`
      }
      if (!is.null(DefaultCrumbIssuerObject$`crumbRequestField`)) {
        self$`crumbRequestField` <- DefaultCrumbIssuerObject$`crumbRequestField`
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
        if (!is.null(self$`crumb`)) {
        sprintf(
        '"crumb":
          "%s"
                ',
        self$`crumb`
        )},
        if (!is.null(self$`crumbRequestField`)) {
        sprintf(
        '"crumbRequestField":
          "%s"
                ',
        self$`crumbRequestField`
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(DefaultCrumbIssuerJson) {
      DefaultCrumbIssuerObject <- jsonlite::fromJSON(DefaultCrumbIssuerJson)
      self$`_class` <- DefaultCrumbIssuerObject$`_class`
      self$`crumb` <- DefaultCrumbIssuerObject$`crumb`
      self$`crumbRequestField` <- DefaultCrumbIssuerObject$`crumbRequestField`
      self
    }
  )
)
