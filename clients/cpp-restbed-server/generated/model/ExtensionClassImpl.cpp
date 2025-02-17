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



#include "ExtensionClassImpl.h"

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

ExtensionClassImpl::ExtensionClassImpl(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string ExtensionClassImpl::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void ExtensionClassImpl::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree ExtensionClassImpl::toPropertyTree()
{
    return toPropertyTree_internal();
}

void ExtensionClassImpl::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string ExtensionClassImpl::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void ExtensionClassImpl::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ExtensionClassImpl::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("_class", m__class);
	if (m__links != nullptr) {
		pt.add_child("_links", m__links->toPropertyTree());
	}
	// generate tree for Classes
	if (!m_Classes.empty()) {
		for (const auto &childEntry : m_Classes) {
            ptree Classes_node;
            Classes_node.put("", childEntry);
            tmp_node.push_back(std::make_pair("", Classes_node));
		}
		pt.add_child("classes", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ExtensionClassImpl::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m__class = pt.get("_class", "");
	if (pt.get_child_optional("_links")) {
		m__links = std::make_shared<ExtensionClassImpllinks>();
		m__links->fromPropertyTree(pt.get_child("_links"));
	}
	// push all items of Classes into member vector
	if (pt.get_child_optional("classes")) {
		for (const auto &childTree : pt.get_child("classes")) {
            std::string val =
                childTree.second.data();
            m_Classes.emplace_back(std::move(val));
		}
	}
}

std::string ExtensionClassImpl::get_Class() const
{
    return m__class;
}

void ExtensionClassImpl::set_Class(std::string value)
{
	m__class = value;
}
std::shared_ptr<ExtensionClassImpllinks> ExtensionClassImpl::get_Links() const
{
    return m__links;
}

void ExtensionClassImpl::set_Links(std::shared_ptr<ExtensionClassImpllinks> value)
{
	m__links = value;
}
std::vector<std::string> ExtensionClassImpl::getClasses() const
{
    return m_Classes;
}

void ExtensionClassImpl::setClasses(std::vector<std::string> value)
{
	m_Classes = value;
}

std::vector<ExtensionClassImpl> createExtensionClassImplVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ExtensionClassImpl>();
    for (const auto& child: pt) {
        vec.emplace_back(ExtensionClassImpl(child.second));
    }

    return vec;
}

}
}
}
}

