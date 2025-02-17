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
pub struct BranchImpllinks {
    #[serde(rename = "self", skip_serializing_if = "Option::is_none")]
    pub _self: Option<Box<crate::models::Link>>,
    #[serde(rename = "actions", skip_serializing_if = "Option::is_none")]
    pub actions: Option<Box<crate::models::Link>>,
    #[serde(rename = "runs", skip_serializing_if = "Option::is_none")]
    pub runs: Option<Box<crate::models::Link>>,
    #[serde(rename = "queue", skip_serializing_if = "Option::is_none")]
    pub queue: Option<Box<crate::models::Link>>,
    #[serde(rename = "_class", skip_serializing_if = "Option::is_none")]
    pub _class: Option<String>,
}

impl BranchImpllinks {
    pub fn new() -> BranchImpllinks {
        BranchImpllinks {
            _self: None,
            actions: None,
            runs: None,
            queue: None,
            _class: None,
        }
    }
}


