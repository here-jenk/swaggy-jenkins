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



#include "GithubRepositorypermissions.h"

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

GithubRepositorypermissions::GithubRepositorypermissions(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GithubRepositorypermissions::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GithubRepositorypermissions::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GithubRepositorypermissions::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GithubRepositorypermissions::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GithubRepositorypermissions::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GithubRepositorypermissions::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GithubRepositorypermissions::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("admin", m_Admin);
	pt.put("push", m_Push);
	pt.put("pull", m_Pull);
	pt.put("_class", m__class);
	return pt;
}

void GithubRepositorypermissions::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Admin = pt.get("admin", false);
	m_Push = pt.get("push", false);
	m_Pull = pt.get("pull", false);
	m__class = pt.get("_class", "");
}

bool GithubRepositorypermissions::isAdmin() const
{
    return m_Admin;
}

void GithubRepositorypermissions::setAdmin(bool value)
{
	m_Admin = value;
}
bool GithubRepositorypermissions::isPush() const
{
    return m_Push;
}

void GithubRepositorypermissions::setPush(bool value)
{
	m_Push = value;
}
bool GithubRepositorypermissions::isPull() const
{
    return m_Pull;
}

void GithubRepositorypermissions::setPull(bool value)
{
	m_Pull = value;
}
std::string GithubRepositorypermissions::get_Class() const
{
    return m__class;
}

void GithubRepositorypermissions::set_Class(std::string value)
{
	m__class = value;
}

std::vector<GithubRepositorypermissions> createGithubRepositorypermissionsVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GithubRepositorypermissions>();
    for (const auto& child: pt) {
        vec.emplace_back(GithubRepositorypermissions(child.second));
    }

    return vec;
}

}
}
}
}

