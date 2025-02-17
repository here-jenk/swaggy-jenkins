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


#include "PipelineStepImpllinks.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

PipelineStepImpllinks::PipelineStepImpllinks()
{
    m_SelfIsSet = false;
    m_ActionsIsSet = false;
    m__class = "";
    m__classIsSet = false;
    
}

void PipelineStepImpllinks::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool PipelineStepImpllinks::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool PipelineStepImpllinks::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "PipelineStepImpllinks" : pathPrefix;

                
    return success;
}

bool PipelineStepImpllinks::operator==(const PipelineStepImpllinks& rhs) const
{
    return
    
    
    
    ((!selfIsSet() && !rhs.selfIsSet()) || (selfIsSet() && rhs.selfIsSet() && getSelf() == rhs.getSelf())) &&
    
    
    ((!actionsIsSet() && !rhs.actionsIsSet()) || (actionsIsSet() && rhs.actionsIsSet() && getActions() == rhs.getActions())) &&
    
    
    ((!r_classIsSet() && !rhs.r_classIsSet()) || (r_classIsSet() && rhs.r_classIsSet() && getClass() == rhs.getClass()))
    
    ;
}

bool PipelineStepImpllinks::operator!=(const PipelineStepImpllinks& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const PipelineStepImpllinks& o)
{
    j = nlohmann::json();
    if(o.selfIsSet())
        j["self"] = o.m_Self;
    if(o.actionsIsSet())
        j["actions"] = o.m_Actions;
    if(o.r_classIsSet())
        j["_class"] = o.m__class;
    
}

void from_json(const nlohmann::json& j, PipelineStepImpllinks& o)
{
    if(j.find("self") != j.end())
    {
        j.at("self").get_to(o.m_Self);
        o.m_SelfIsSet = true;
    } 
    if(j.find("actions") != j.end())
    {
        j.at("actions").get_to(o.m_Actions);
        o.m_ActionsIsSet = true;
    } 
    if(j.find("_class") != j.end())
    {
        j.at("_class").get_to(o.m__class);
        o.m__classIsSet = true;
    } 
    
}

org::openapitools::server::model::Link PipelineStepImpllinks::getSelf() const
{
    return m_Self;
}
void PipelineStepImpllinks::setSelf(org::openapitools::server::model::Link const& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}
bool PipelineStepImpllinks::selfIsSet() const
{
    return m_SelfIsSet;
}
void PipelineStepImpllinks::unsetSelf()
{
    m_SelfIsSet = false;
}
org::openapitools::server::model::Link PipelineStepImpllinks::getActions() const
{
    return m_Actions;
}
void PipelineStepImpllinks::setActions(org::openapitools::server::model::Link const& value)
{
    m_Actions = value;
    m_ActionsIsSet = true;
}
bool PipelineStepImpllinks::actionsIsSet() const
{
    return m_ActionsIsSet;
}
void PipelineStepImpllinks::unsetActions()
{
    m_ActionsIsSet = false;
}
std::string PipelineStepImpllinks::getClass() const
{
    return m__class;
}
void PipelineStepImpllinks::setClass(std::string const& value)
{
    m__class = value;
    m__classIsSet = true;
}
bool PipelineStepImpllinks::r_classIsSet() const
{
    return m__classIsSet;
}
void PipelineStepImpllinks::unset_class()
{
    m__classIsSet = false;
}


} // namespace org::openapitools::server::model

