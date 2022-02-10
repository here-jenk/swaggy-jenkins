package org.openapitools.server.model


/**
 * @param content  for example: ''null''
 * @param `class`  for example: ''null''
*/
final case class GithubFile (
  content: Option[GithubContent],
  `class`: Option[String]
)

