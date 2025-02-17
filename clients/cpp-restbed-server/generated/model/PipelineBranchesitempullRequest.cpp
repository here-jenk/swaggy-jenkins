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



#include "PipelineBranchesitempullRequest.h"

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

PipelineBranchesitempullRequest::PipelineBranchesitempullRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string PipelineBranchesitempullRequest::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void PipelineBranchesitempullRequest::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree PipelineBranchesitempullRequest::toPropertyTree()
{
    return toPropertyTree_internal();
}

void PipelineBranchesitempullRequest::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string PipelineBranchesitempullRequest::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void PipelineBranchesitempullRequest::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree PipelineBranchesitempullRequest::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m__links != nullptr) {
		pt.add_child("_links", m__links->toPropertyTree());
	}
	pt.put("author", m_Author);
	pt.put("id", m_Id);
	pt.put("title", m_Title);
	pt.put("url", m_Url);
	pt.put("_class", m__class);
	return pt;
}

void PipelineBranchesitempullRequest::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("_links")) {
		m__links = std::make_shared<PipelineBranchesitempullRequestlinks>();
		m__links->fromPropertyTree(pt.get_child("_links"));
	}
	m_Author = pt.get("author", "");
	m_Id = pt.get("id", "");
	m_Title = pt.get("title", "");
	m_Url = pt.get("url", "");
	m__class = pt.get("_class", "");
}

std::shared_ptr<PipelineBranchesitempullRequestlinks> PipelineBranchesitempullRequest::get_Links() const
{
    return m__links;
}

void PipelineBranchesitempullRequest::set_Links(std::shared_ptr<PipelineBranchesitempullRequestlinks> value)
{
	m__links = value;
}
std::string PipelineBranchesitempullRequest::getAuthor() const
{
    return m_Author;
}

void PipelineBranchesitempullRequest::setAuthor(std::string value)
{
	m_Author = value;
}
std::string PipelineBranchesitempullRequest::getId() const
{
    return m_Id;
}

void PipelineBranchesitempullRequest::setId(std::string value)
{
	m_Id = value;
}
std::string PipelineBranchesitempullRequest::getTitle() const
{
    return m_Title;
}

void PipelineBranchesitempullRequest::setTitle(std::string value)
{
	m_Title = value;
}
std::string PipelineBranchesitempullRequest::getUrl() const
{
    return m_Url;
}

void PipelineBranchesitempullRequest::setUrl(std::string value)
{
	m_Url = value;
}
std::string PipelineBranchesitempullRequest::get_Class() const
{
    return m__class;
}

void PipelineBranchesitempullRequest::set_Class(std::string value)
{
	m__class = value;
}

std::vector<PipelineBranchesitempullRequest> createPipelineBranchesitempullRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<PipelineBranchesitempullRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(PipelineBranchesitempullRequest(child.second));
    }

    return vec;
}

}
}
}
}

