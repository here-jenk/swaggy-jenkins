/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.0.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "GithubOrganization.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

GithubOrganization::GithubOrganization(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GithubOrganization::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GithubOrganization::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GithubOrganization::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GithubOrganization::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GithubOrganization::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GithubOrganization::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GithubOrganization::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("_class", m__class);
	if (m__links != nullptr) {
		pt.add_child("_links", m__links->toPropertyTree());
	}
	pt.put("jenkinsOrganizationPipeline", m_JenkinsOrganizationPipeline);
	pt.put("name", m_Name);
	return pt;
}

void GithubOrganization::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m__class = pt.get("_class", "");
	if (pt.get_child_optional("_links")) {
		m__links = std::make_shared<GithubOrganizationlinks>();
		m__links->fromPropertyTree(pt.get_child("_links"));
	}
	m_JenkinsOrganizationPipeline = pt.get("jenkinsOrganizationPipeline", false);
	m_Name = pt.get("name", "");
}

std::string GithubOrganization::get_Class() const
{
    return m__class;
}

void GithubOrganization::set_Class(std::string value)
{
	m__class = value;
}
std::shared_ptr<GithubOrganizationlinks> GithubOrganization::get_Links() const
{
    return m__links;
}

void GithubOrganization::set_Links(std::shared_ptr<GithubOrganizationlinks> value)
{
	m__links = value;
}
bool GithubOrganization::isJenkinsOrganizationPipeline() const
{
    return m_JenkinsOrganizationPipeline;
}

void GithubOrganization::setJenkinsOrganizationPipeline(bool value)
{
	m_JenkinsOrganizationPipeline = value;
}
std::string GithubOrganization::getName() const
{
    return m_Name;
}

void GithubOrganization::setName(std::string value)
{
	m_Name = value;
}

std::vector<GithubOrganization> createGithubOrganizationVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GithubOrganization>();
    for (const auto& child: pt) {
        vec.emplace_back(GithubOrganization(child.second));
    }

    return vec;
}

}
}
}
}

