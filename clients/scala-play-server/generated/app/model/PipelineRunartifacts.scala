package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PipelineRunartifacts.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-06-04T08:11:54.386355Z[Etc/UTC]")
case class PipelineRunartifacts(
  name: Option[String],
  size: Option[Int],
  url: Option[String],
  `class`: Option[String]
  additionalProperties: 
)

object PipelineRunartifacts {
  implicit lazy val pipelineRunartifactsJsonFormat: Format[PipelineRunartifacts] = {
    val realJsonFormat = Json.format[PipelineRunartifacts]
    val declaredPropNames = Set("name", "size", "url", "`class`")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { pipelineRunartifacts =>
        val jsObj = realJsonFormat.writes(pipelineRunartifacts)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

