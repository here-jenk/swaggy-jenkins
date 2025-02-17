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



#include "PipelineRun.h"

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

PipelineRun::PipelineRun(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string PipelineRun::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void PipelineRun::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree PipelineRun::toPropertyTree()
{
    return toPropertyTree_internal();
}

void PipelineRun::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string PipelineRun::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void PipelineRun::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree PipelineRun::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("_class", m__class);
	// generate tree for Artifacts
	if (!m_Artifacts.empty()) {
		for (const auto &childEntry : m_Artifacts) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("artifacts", tmp_node);
		tmp_node.clear();
	}
	pt.put("durationInMillis", m_DurationInMillis);
	pt.put("estimatedDurationInMillis", m_EstimatedDurationInMillis);
	pt.put("enQueueTime", m_EnQueueTime);
	pt.put("endTime", m_EndTime);
	pt.put("id", m_Id);
	pt.put("organization", m_Organization);
	pt.put("pipeline", m_Pipeline);
	pt.put("result", m_Result);
	pt.put("runSummary", m_RunSummary);
	pt.put("startTime", m_StartTime);
	pt.put("state", m_State);
	pt.put("type", m_Type);
	pt.put("commitId", m_CommitId);
	return pt;
}

void PipelineRun::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m__class = pt.get("_class", "");
	// push all items of Artifacts into member vector
	if (pt.get_child_optional("artifacts")) {
		for (const auto &childTree : pt.get_child("artifacts")) {
            std::shared_ptr<PipelineRunartifacts> val =
                std::make_shared<PipelineRunartifacts>(childTree.second);
            m_Artifacts.emplace_back(std::move(val));
		}
	}
	m_DurationInMillis = pt.get("durationInMillis", 0);
	m_EstimatedDurationInMillis = pt.get("estimatedDurationInMillis", 0);
	m_EnQueueTime = pt.get("enQueueTime", "");
	m_EndTime = pt.get("endTime", "");
	m_Id = pt.get("id", "");
	m_Organization = pt.get("organization", "");
	m_Pipeline = pt.get("pipeline", "");
	m_Result = pt.get("result", "");
	m_RunSummary = pt.get("runSummary", "");
	m_StartTime = pt.get("startTime", "");
	m_State = pt.get("state", "");
	m_Type = pt.get("type", "");
	m_CommitId = pt.get("commitId", "");
}

std::string PipelineRun::get_Class() const
{
    return m__class;
}

void PipelineRun::set_Class(std::string value)
{
	m__class = value;
}
std::vector<std::shared_ptr<PipelineRunartifacts>> PipelineRun::getArtifacts() const
{
    return m_Artifacts;
}

void PipelineRun::setArtifacts(std::vector<std::shared_ptr<PipelineRunartifacts>> value)
{
	m_Artifacts = value;
}
int32_t PipelineRun::getDurationInMillis() const
{
    return m_DurationInMillis;
}

void PipelineRun::setDurationInMillis(int32_t value)
{
	m_DurationInMillis = value;
}
int32_t PipelineRun::getEstimatedDurationInMillis() const
{
    return m_EstimatedDurationInMillis;
}

void PipelineRun::setEstimatedDurationInMillis(int32_t value)
{
	m_EstimatedDurationInMillis = value;
}
std::string PipelineRun::getEnQueueTime() const
{
    return m_EnQueueTime;
}

void PipelineRun::setEnQueueTime(std::string value)
{
	m_EnQueueTime = value;
}
std::string PipelineRun::getEndTime() const
{
    return m_EndTime;
}

void PipelineRun::setEndTime(std::string value)
{
	m_EndTime = value;
}
std::string PipelineRun::getId() const
{
    return m_Id;
}

void PipelineRun::setId(std::string value)
{
	m_Id = value;
}
std::string PipelineRun::getOrganization() const
{
    return m_Organization;
}

void PipelineRun::setOrganization(std::string value)
{
	m_Organization = value;
}
std::string PipelineRun::getPipeline() const
{
    return m_Pipeline;
}

void PipelineRun::setPipeline(std::string value)
{
	m_Pipeline = value;
}
std::string PipelineRun::getResult() const
{
    return m_Result;
}

void PipelineRun::setResult(std::string value)
{
	m_Result = value;
}
std::string PipelineRun::getRunSummary() const
{
    return m_RunSummary;
}

void PipelineRun::setRunSummary(std::string value)
{
	m_RunSummary = value;
}
std::string PipelineRun::getStartTime() const
{
    return m_StartTime;
}

void PipelineRun::setStartTime(std::string value)
{
	m_StartTime = value;
}
std::string PipelineRun::getState() const
{
    return m_State;
}

void PipelineRun::setState(std::string value)
{
	m_State = value;
}
std::string PipelineRun::getType() const
{
    return m_Type;
}

void PipelineRun::setType(std::string value)
{
	m_Type = value;
}
std::string PipelineRun::getCommitId() const
{
    return m_CommitId;
}

void PipelineRun::setCommitId(std::string value)
{
	m_CommitId = value;
}

std::vector<PipelineRun> createPipelineRunVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<PipelineRun>();
    for (const auto& child: pt) {
        vec.emplace_back(PipelineRun(child.second));
    }

    return vec;
}

}
}
}
}

