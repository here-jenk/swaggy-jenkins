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
pub struct GithubRepository {
    #[serde(rename = "_class", skip_serializing_if = "Option::is_none")]
    pub _class: Option<String>,
    #[serde(rename = "_links", skip_serializing_if = "Option::is_none")]
    pub _links: Option<Box<crate::models::GithubRepositorylinks>>,
    #[serde(rename = "defaultBranch", skip_serializing_if = "Option::is_none")]
    pub default_branch: Option<String>,
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "permissions", skip_serializing_if = "Option::is_none")]
    pub permissions: Option<Box<crate::models::GithubRepositorypermissions>>,
    #[serde(rename = "private", skip_serializing_if = "Option::is_none")]
    pub private: Option<bool>,
    #[serde(rename = "fullName", skip_serializing_if = "Option::is_none")]
    pub full_name: Option<String>,
}

impl GithubRepository {
    pub fn new() -> GithubRepository {
        GithubRepository {
            _class: None,
            _links: None,
            default_branch: None,
            description: None,
            name: None,
            permissions: None,
            private: None,
            full_name: None,
        }
    }
}


