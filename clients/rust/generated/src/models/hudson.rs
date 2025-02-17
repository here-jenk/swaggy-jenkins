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
pub struct Hudson {
    #[serde(rename = "_class", skip_serializing_if = "Option::is_none")]
    pub _class: Option<String>,
    #[serde(rename = "assignedLabels", skip_serializing_if = "Option::is_none")]
    pub assigned_labels: Option<Vec<crate::models::HudsonassignedLabels>>,
    #[serde(rename = "mode", skip_serializing_if = "Option::is_none")]
    pub mode: Option<String>,
    #[serde(rename = "nodeDescription", skip_serializing_if = "Option::is_none")]
    pub node_description: Option<String>,
    #[serde(rename = "nodeName", skip_serializing_if = "Option::is_none")]
    pub node_name: Option<String>,
    #[serde(rename = "numExecutors", skip_serializing_if = "Option::is_none")]
    pub num_executors: Option<i32>,
    #[serde(rename = "description", skip_serializing_if = "Option::is_none")]
    pub description: Option<String>,
    #[serde(rename = "jobs", skip_serializing_if = "Option::is_none")]
    pub jobs: Option<Vec<crate::models::FreeStyleProject>>,
    #[serde(rename = "primaryView", skip_serializing_if = "Option::is_none")]
    pub primary_view: Option<Box<crate::models::AllView>>,
    #[serde(rename = "quietingDown", skip_serializing_if = "Option::is_none")]
    pub quieting_down: Option<bool>,
    #[serde(rename = "slaveAgentPort", skip_serializing_if = "Option::is_none")]
    pub slave_agent_port: Option<i32>,
    #[serde(rename = "unlabeledLoad", skip_serializing_if = "Option::is_none")]
    pub unlabeled_load: Option<Box<crate::models::UnlabeledLoadStatistics>>,
    #[serde(rename = "useCrumbs", skip_serializing_if = "Option::is_none")]
    pub use_crumbs: Option<bool>,
    #[serde(rename = "useSecurity", skip_serializing_if = "Option::is_none")]
    pub use_security: Option<bool>,
    #[serde(rename = "views", skip_serializing_if = "Option::is_none")]
    pub views: Option<Vec<crate::models::AllView>>,
}

impl Hudson {
    pub fn new() -> Hudson {
        Hudson {
            _class: None,
            assigned_labels: None,
            mode: None,
            node_description: None,
            node_name: None,
            num_executors: None,
            description: None,
            jobs: None,
            primary_view: None,
            quieting_down: None,
            slave_agent_port: None,
            unlabeled_load: None,
            use_crumbs: None,
            use_security: None,
            views: None,
        }
    }
}


