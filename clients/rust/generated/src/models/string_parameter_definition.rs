/*
 * Swaggy Jenkins
 *
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct StringParameterDefinition {
    #[serde(rename = "_class", skip_serializing_if = "Option::is_none")]
    pub _class: Option<String>,
    #[serde(rename = "defaultParameterValue", skip_serializing_if = "Option::is_none")]
    pub default_parameter_value: Option<Box<crate::models::StringParameterValue>>,
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub _type: Option<String>,
}

impl StringParameterDefinition {
    pub fn new() -> StringParameterDefinition {
        StringParameterDefinition {
            _class: None,
            default_parameter_value: None,
            description: None,
            name: None,
            _type: None,
        }
    }
}


