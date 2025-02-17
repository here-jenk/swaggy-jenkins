/**
* Swaggy Jenkins
* Jenkins API clients generated from Swagger / Open API specification
*
* The version of the OpenAPI document: 1.5.1-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "PipelinelatestRun.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

PipelinelatestRun::PipelinelatestRun()
{
    m_ArtifactsIsSet = false;
    m_DurationInMillis = 0;
    m_DurationInMillisIsSet = false;
    m_EstimatedDurationInMillis = 0;
    m_EstimatedDurationInMillisIsSet = false;
    m_EnQueueTime = "";
    m_EnQueueTimeIsSet = false;
    m_EndTime = "";
    m_EndTimeIsSet = false;
    m_Id = "";
    m_IdIsSet = false;
    m_Organization = "";
    m_OrganizationIsSet = false;
    m_Pipeline = "";
    m_PipelineIsSet = false;
    m_Result = "";
    m_ResultIsSet = false;
    m_RunSummary = "";
    m_RunSummaryIsSet = false;
    m_StartTime = "";
    m_StartTimeIsSet = false;
    m_State = "";
    m_StateIsSet = false;
    m_Type = "";
    m_TypeIsSet = false;
    m_CommitId = "";
    m_CommitIdIsSet = false;
    m__class = "";
    m__classIsSet = false;
    
}

void PipelinelatestRun::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool PipelinelatestRun::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool PipelinelatestRun::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "PipelinelatestRun" : pathPrefix;

         
    if (artifactsIsSet())
    {
        const std::vector<org::openapitools::server::model::PipelinelatestRunartifacts>& value = m_Artifacts;
        const std::string currentValuePath = _pathPrefix + ".artifacts";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::PipelinelatestRunartifacts& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".artifacts") && success;
 
                i++;
            }
        }

    }
                                                            
    return success;
}

bool PipelinelatestRun::operator==(const PipelinelatestRun& rhs) const
{
    return
    
    
    
    ((!artifactsIsSet() && !rhs.artifactsIsSet()) || (artifactsIsSet() && rhs.artifactsIsSet() && getArtifacts() == rhs.getArtifacts())) &&
    
    
    ((!durationInMillisIsSet() && !rhs.durationInMillisIsSet()) || (durationInMillisIsSet() && rhs.durationInMillisIsSet() && getDurationInMillis() == rhs.getDurationInMillis())) &&
    
    
    ((!estimatedDurationInMillisIsSet() && !rhs.estimatedDurationInMillisIsSet()) || (estimatedDurationInMillisIsSet() && rhs.estimatedDurationInMillisIsSet() && getEstimatedDurationInMillis() == rhs.getEstimatedDurationInMillis())) &&
    
    
    ((!enQueueTimeIsSet() && !rhs.enQueueTimeIsSet()) || (enQueueTimeIsSet() && rhs.enQueueTimeIsSet() && getEnQueueTime() == rhs.getEnQueueTime())) &&
    
    
    ((!endTimeIsSet() && !rhs.endTimeIsSet()) || (endTimeIsSet() && rhs.endTimeIsSet() && getEndTime() == rhs.getEndTime())) &&
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!organizationIsSet() && !rhs.organizationIsSet()) || (organizationIsSet() && rhs.organizationIsSet() && getOrganization() == rhs.getOrganization())) &&
    
    
    ((!pipelineIsSet() && !rhs.pipelineIsSet()) || (pipelineIsSet() && rhs.pipelineIsSet() && getPipeline() == rhs.getPipeline())) &&
    
    
    ((!resultIsSet() && !rhs.resultIsSet()) || (resultIsSet() && rhs.resultIsSet() && getResult() == rhs.getResult())) &&
    
    
    ((!runSummaryIsSet() && !rhs.runSummaryIsSet()) || (runSummaryIsSet() && rhs.runSummaryIsSet() && getRunSummary() == rhs.getRunSummary())) &&
    
    
    ((!startTimeIsSet() && !rhs.startTimeIsSet()) || (startTimeIsSet() && rhs.startTimeIsSet() && getStartTime() == rhs.getStartTime())) &&
    
    
    ((!stateIsSet() && !rhs.stateIsSet()) || (stateIsSet() && rhs.stateIsSet() && getState() == rhs.getState())) &&
    
    
    ((!typeIsSet() && !rhs.typeIsSet()) || (typeIsSet() && rhs.typeIsSet() && getType() == rhs.getType())) &&
    
    
    ((!commitIdIsSet() && !rhs.commitIdIsSet()) || (commitIdIsSet() && rhs.commitIdIsSet() && getCommitId() == rhs.getCommitId())) &&
    
    
    ((!r_classIsSet() && !rhs.r_classIsSet()) || (r_classIsSet() && rhs.r_classIsSet() && getClass() == rhs.getClass()))
    
    ;
}

bool PipelinelatestRun::operator!=(const PipelinelatestRun& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const PipelinelatestRun& o)
{
    j = nlohmann::json();
    if(o.artifactsIsSet() || !o.m_Artifacts.empty())
        j["artifacts"] = o.m_Artifacts;
    if(o.durationInMillisIsSet())
        j["durationInMillis"] = o.m_DurationInMillis;
    if(o.estimatedDurationInMillisIsSet())
        j["estimatedDurationInMillis"] = o.m_EstimatedDurationInMillis;
    if(o.enQueueTimeIsSet())
        j["enQueueTime"] = o.m_EnQueueTime;
    if(o.endTimeIsSet())
        j["endTime"] = o.m_EndTime;
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.organizationIsSet())
        j["organization"] = o.m_Organization;
    if(o.pipelineIsSet())
        j["pipeline"] = o.m_Pipeline;
    if(o.resultIsSet())
        j["result"] = o.m_Result;
    if(o.runSummaryIsSet())
        j["runSummary"] = o.m_RunSummary;
    if(o.startTimeIsSet())
        j["startTime"] = o.m_StartTime;
    if(o.stateIsSet())
        j["state"] = o.m_State;
    if(o.typeIsSet())
        j["type"] = o.m_Type;
    if(o.commitIdIsSet())
        j["commitId"] = o.m_CommitId;
    if(o.r_classIsSet())
        j["_class"] = o.m__class;
    
}

void from_json(const nlohmann::json& j, PipelinelatestRun& o)
{
    if(j.find("artifacts") != j.end())
    {
        j.at("artifacts").get_to(o.m_Artifacts);
        o.m_ArtifactsIsSet = true;
    } 
    if(j.find("durationInMillis") != j.end())
    {
        j.at("durationInMillis").get_to(o.m_DurationInMillis);
        o.m_DurationInMillisIsSet = true;
    } 
    if(j.find("estimatedDurationInMillis") != j.end())
    {
        j.at("estimatedDurationInMillis").get_to(o.m_EstimatedDurationInMillis);
        o.m_EstimatedDurationInMillisIsSet = true;
    } 
    if(j.find("enQueueTime") != j.end())
    {
        j.at("enQueueTime").get_to(o.m_EnQueueTime);
        o.m_EnQueueTimeIsSet = true;
    } 
    if(j.find("endTime") != j.end())
    {
        j.at("endTime").get_to(o.m_EndTime);
        o.m_EndTimeIsSet = true;
    } 
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("organization") != j.end())
    {
        j.at("organization").get_to(o.m_Organization);
        o.m_OrganizationIsSet = true;
    } 
    if(j.find("pipeline") != j.end())
    {
        j.at("pipeline").get_to(o.m_Pipeline);
        o.m_PipelineIsSet = true;
    } 
    if(j.find("result") != j.end())
    {
        j.at("result").get_to(o.m_Result);
        o.m_ResultIsSet = true;
    } 
    if(j.find("runSummary") != j.end())
    {
        j.at("runSummary").get_to(o.m_RunSummary);
        o.m_RunSummaryIsSet = true;
    } 
    if(j.find("startTime") != j.end())
    {
        j.at("startTime").get_to(o.m_StartTime);
        o.m_StartTimeIsSet = true;
    } 
    if(j.find("state") != j.end())
    {
        j.at("state").get_to(o.m_State);
        o.m_StateIsSet = true;
    } 
    if(j.find("type") != j.end())
    {
        j.at("type").get_to(o.m_Type);
        o.m_TypeIsSet = true;
    } 
    if(j.find("commitId") != j.end())
    {
        j.at("commitId").get_to(o.m_CommitId);
        o.m_CommitIdIsSet = true;
    } 
    if(j.find("_class") != j.end())
    {
        j.at("_class").get_to(o.m__class);
        o.m__classIsSet = true;
    } 
    
}

std::vector<org::openapitools::server::model::PipelinelatestRunartifacts> PipelinelatestRun::getArtifacts() const
{
    return m_Artifacts;
}
void PipelinelatestRun::setArtifacts(std::vector<org::openapitools::server::model::PipelinelatestRunartifacts> const& value)
{
    m_Artifacts = value;
    m_ArtifactsIsSet = true;
}
bool PipelinelatestRun::artifactsIsSet() const
{
    return m_ArtifactsIsSet;
}
void PipelinelatestRun::unsetArtifacts()
{
    m_ArtifactsIsSet = false;
}
int32_t PipelinelatestRun::getDurationInMillis() const
{
    return m_DurationInMillis;
}
void PipelinelatestRun::setDurationInMillis(int32_t const value)
{
    m_DurationInMillis = value;
    m_DurationInMillisIsSet = true;
}
bool PipelinelatestRun::durationInMillisIsSet() const
{
    return m_DurationInMillisIsSet;
}
void PipelinelatestRun::unsetDurationInMillis()
{
    m_DurationInMillisIsSet = false;
}
int32_t PipelinelatestRun::getEstimatedDurationInMillis() const
{
    return m_EstimatedDurationInMillis;
}
void PipelinelatestRun::setEstimatedDurationInMillis(int32_t const value)
{
    m_EstimatedDurationInMillis = value;
    m_EstimatedDurationInMillisIsSet = true;
}
bool PipelinelatestRun::estimatedDurationInMillisIsSet() const
{
    return m_EstimatedDurationInMillisIsSet;
}
void PipelinelatestRun::unsetEstimatedDurationInMillis()
{
    m_EstimatedDurationInMillisIsSet = false;
}
std::string PipelinelatestRun::getEnQueueTime() const
{
    return m_EnQueueTime;
}
void PipelinelatestRun::setEnQueueTime(std::string const& value)
{
    m_EnQueueTime = value;
    m_EnQueueTimeIsSet = true;
}
bool PipelinelatestRun::enQueueTimeIsSet() const
{
    return m_EnQueueTimeIsSet;
}
void PipelinelatestRun::unsetEnQueueTime()
{
    m_EnQueueTimeIsSet = false;
}
std::string PipelinelatestRun::getEndTime() const
{
    return m_EndTime;
}
void PipelinelatestRun::setEndTime(std::string const& value)
{
    m_EndTime = value;
    m_EndTimeIsSet = true;
}
bool PipelinelatestRun::endTimeIsSet() const
{
    return m_EndTimeIsSet;
}
void PipelinelatestRun::unsetEndTime()
{
    m_EndTimeIsSet = false;
}
std::string PipelinelatestRun::getId() const
{
    return m_Id;
}
void PipelinelatestRun::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool PipelinelatestRun::idIsSet() const
{
    return m_IdIsSet;
}
void PipelinelatestRun::unsetId()
{
    m_IdIsSet = false;
}
std::string PipelinelatestRun::getOrganization() const
{
    return m_Organization;
}
void PipelinelatestRun::setOrganization(std::string const& value)
{
    m_Organization = value;
    m_OrganizationIsSet = true;
}
bool PipelinelatestRun::organizationIsSet() const
{
    return m_OrganizationIsSet;
}
void PipelinelatestRun::unsetOrganization()
{
    m_OrganizationIsSet = false;
}
std::string PipelinelatestRun::getPipeline() const
{
    return m_Pipeline;
}
void PipelinelatestRun::setPipeline(std::string const& value)
{
    m_Pipeline = value;
    m_PipelineIsSet = true;
}
bool PipelinelatestRun::pipelineIsSet() const
{
    return m_PipelineIsSet;
}
void PipelinelatestRun::unsetPipeline()
{
    m_PipelineIsSet = false;
}
std::string PipelinelatestRun::getResult() const
{
    return m_Result;
}
void PipelinelatestRun::setResult(std::string const& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}
bool PipelinelatestRun::resultIsSet() const
{
    return m_ResultIsSet;
}
void PipelinelatestRun::unsetResult()
{
    m_ResultIsSet = false;
}
std::string PipelinelatestRun::getRunSummary() const
{
    return m_RunSummary;
}
void PipelinelatestRun::setRunSummary(std::string const& value)
{
    m_RunSummary = value;
    m_RunSummaryIsSet = true;
}
bool PipelinelatestRun::runSummaryIsSet() const
{
    return m_RunSummaryIsSet;
}
void PipelinelatestRun::unsetRunSummary()
{
    m_RunSummaryIsSet = false;
}
std::string PipelinelatestRun::getStartTime() const
{
    return m_StartTime;
}
void PipelinelatestRun::setStartTime(std::string const& value)
{
    m_StartTime = value;
    m_StartTimeIsSet = true;
}
bool PipelinelatestRun::startTimeIsSet() const
{
    return m_StartTimeIsSet;
}
void PipelinelatestRun::unsetStartTime()
{
    m_StartTimeIsSet = false;
}
std::string PipelinelatestRun::getState() const
{
    return m_State;
}
void PipelinelatestRun::setState(std::string const& value)
{
    m_State = value;
    m_StateIsSet = true;
}
bool PipelinelatestRun::stateIsSet() const
{
    return m_StateIsSet;
}
void PipelinelatestRun::unsetState()
{
    m_StateIsSet = false;
}
std::string PipelinelatestRun::getType() const
{
    return m_Type;
}
void PipelinelatestRun::setType(std::string const& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool PipelinelatestRun::typeIsSet() const
{
    return m_TypeIsSet;
}
void PipelinelatestRun::unsetType()
{
    m_TypeIsSet = false;
}
std::string PipelinelatestRun::getCommitId() const
{
    return m_CommitId;
}
void PipelinelatestRun::setCommitId(std::string const& value)
{
    m_CommitId = value;
    m_CommitIdIsSet = true;
}
bool PipelinelatestRun::commitIdIsSet() const
{
    return m_CommitIdIsSet;
}
void PipelinelatestRun::unsetCommitId()
{
    m_CommitIdIsSet = false;
}
std::string PipelinelatestRun::getClass() const
{
    return m__class;
}
void PipelinelatestRun::setClass(std::string const& value)
{
    m__class = value;
    m__classIsSet = true;
}
bool PipelinelatestRun::r_classIsSet() const
{
    return m__classIsSet;
}
void PipelinelatestRun::unset_class()
{
    m__classIsSet = false;
}


} // namespace org::openapitools::server::model

