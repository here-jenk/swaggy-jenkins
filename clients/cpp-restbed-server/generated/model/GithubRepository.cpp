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



#include "GithubRepository.h"

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

GithubRepository::GithubRepository(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GithubRepository::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GithubRepository::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GithubRepository::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GithubRepository::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GithubRepository::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GithubRepository::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GithubRepository::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("_class", m__class);
	if (m__links != nullptr) {
		pt.add_child("_links", m__links->toPropertyTree());
	}
	pt.put("defaultBranch", m_DefaultBranch);
	pt.put("description", m_Description);
	pt.put("name", m_Name);
	if (m_Permissions != nullptr) {
		pt.add_child("permissions", m_Permissions->toPropertyTree());
	}
	pt.put("private", m_r_private);
	pt.put("fullName", m_FullName);
	return pt;
}

void GithubRepository::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m__class = pt.get("_class", "");
	if (pt.get_child_optional("_links")) {
		m__links = std::make_shared<GithubRepositorylinks>();
		m__links->fromPropertyTree(pt.get_child("_links"));
	}
	m_DefaultBranch = pt.get("defaultBranch", "");
	m_Description = pt.get("description", "");
	m_Name = pt.get("name", "");
	if (pt.get_child_optional("permissions")) {
		m_Permissions = std::make_shared<GithubRepositorypermissions>();
		m_Permissions->fromPropertyTree(pt.get_child("permissions"));
	}
	m_r_private = pt.get("private", false);
	m_FullName = pt.get("fullName", "");
}

std::string GithubRepository::get_Class() const
{
    return m__class;
}

void GithubRepository::set_Class(std::string value)
{
	m__class = value;
}
std::shared_ptr<GithubRepositorylinks> GithubRepository::get_Links() const
{
    return m__links;
}

void GithubRepository::set_Links(std::shared_ptr<GithubRepositorylinks> value)
{
	m__links = value;
}
std::string GithubRepository::getDefaultBranch() const
{
    return m_DefaultBranch;
}

void GithubRepository::setDefaultBranch(std::string value)
{
	m_DefaultBranch = value;
}
std::string GithubRepository::getDescription() const
{
    return m_Description;
}

void GithubRepository::setDescription(std::string value)
{
	m_Description = value;
}
std::string GithubRepository::getName() const
{
    return m_Name;
}

void GithubRepository::setName(std::string value)
{
	m_Name = value;
}
std::shared_ptr<GithubRepositorypermissions> GithubRepository::getPermissions() const
{
    return m_Permissions;
}

void GithubRepository::setPermissions(std::shared_ptr<GithubRepositorypermissions> value)
{
	m_Permissions = value;
}
bool GithubRepository::isRPrivate() const
{
    return m_r_private;
}

void GithubRepository::setRPrivate(bool value)
{
	m_r_private = value;
}
std::string GithubRepository::getFullName() const
{
    return m_FullName;
}

void GithubRepository::setFullName(std::string value)
{
	m_FullName = value;
}

std::vector<GithubRepository> createGithubRepositoryVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GithubRepository>();
    for (const auto& child: pt) {
        vec.emplace_back(GithubRepository(child.second));
    }

    return vec;
}

}
}
}
}

