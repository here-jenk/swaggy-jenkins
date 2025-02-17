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



#include "SwapSpaceMonitorMemoryUsage2.h"

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

SwapSpaceMonitorMemoryUsage2::SwapSpaceMonitorMemoryUsage2(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string SwapSpaceMonitorMemoryUsage2::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void SwapSpaceMonitorMemoryUsage2::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree SwapSpaceMonitorMemoryUsage2::toPropertyTree()
{
    return toPropertyTree_internal();
}

void SwapSpaceMonitorMemoryUsage2::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string SwapSpaceMonitorMemoryUsage2::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void SwapSpaceMonitorMemoryUsage2::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree SwapSpaceMonitorMemoryUsage2::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("_class", m__class);
	pt.put("availablePhysicalMemory", m_AvailablePhysicalMemory);
	pt.put("availableSwapSpace", m_AvailableSwapSpace);
	pt.put("totalPhysicalMemory", m_TotalPhysicalMemory);
	pt.put("totalSwapSpace", m_TotalSwapSpace);
	return pt;
}

void SwapSpaceMonitorMemoryUsage2::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m__class = pt.get("_class", "");
	m_AvailablePhysicalMemory = pt.get("availablePhysicalMemory", 0);
	m_AvailableSwapSpace = pt.get("availableSwapSpace", 0);
	m_TotalPhysicalMemory = pt.get("totalPhysicalMemory", 0);
	m_TotalSwapSpace = pt.get("totalSwapSpace", 0);
}

std::string SwapSpaceMonitorMemoryUsage2::get_Class() const
{
    return m__class;
}

void SwapSpaceMonitorMemoryUsage2::set_Class(std::string value)
{
	m__class = value;
}
int32_t SwapSpaceMonitorMemoryUsage2::getAvailablePhysicalMemory() const
{
    return m_AvailablePhysicalMemory;
}

void SwapSpaceMonitorMemoryUsage2::setAvailablePhysicalMemory(int32_t value)
{
	m_AvailablePhysicalMemory = value;
}
int32_t SwapSpaceMonitorMemoryUsage2::getAvailableSwapSpace() const
{
    return m_AvailableSwapSpace;
}

void SwapSpaceMonitorMemoryUsage2::setAvailableSwapSpace(int32_t value)
{
	m_AvailableSwapSpace = value;
}
int32_t SwapSpaceMonitorMemoryUsage2::getTotalPhysicalMemory() const
{
    return m_TotalPhysicalMemory;
}

void SwapSpaceMonitorMemoryUsage2::setTotalPhysicalMemory(int32_t value)
{
	m_TotalPhysicalMemory = value;
}
int32_t SwapSpaceMonitorMemoryUsage2::getTotalSwapSpace() const
{
    return m_TotalSwapSpace;
}

void SwapSpaceMonitorMemoryUsage2::setTotalSwapSpace(int32_t value)
{
	m_TotalSwapSpace = value;
}

std::vector<SwapSpaceMonitorMemoryUsage2> createSwapSpaceMonitorMemoryUsage2VectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<SwapSpaceMonitorMemoryUsage2>();
    for (const auto& child: pt) {
        vec.emplace_back(SwapSpaceMonitorMemoryUsage2(child.second));
    }

    return vec;
}

}
}
}
}

