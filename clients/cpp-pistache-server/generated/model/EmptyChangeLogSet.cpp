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


#include "EmptyChangeLogSet.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

EmptyChangeLogSet::EmptyChangeLogSet()
{
    m__class = "";
    m__classIsSet = false;
    m_Kind = "";
    m_KindIsSet = false;
    
}

void EmptyChangeLogSet::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool EmptyChangeLogSet::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool EmptyChangeLogSet::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "EmptyChangeLogSet" : pathPrefix;

            
    return success;
}

bool EmptyChangeLogSet::operator==(const EmptyChangeLogSet& rhs) const
{
    return
    
    
    
    ((!r_classIsSet() && !rhs.r_classIsSet()) || (r_classIsSet() && rhs.r_classIsSet() && getClass() == rhs.getClass())) &&
    
    
    ((!kindIsSet() && !rhs.kindIsSet()) || (kindIsSet() && rhs.kindIsSet() && getKind() == rhs.getKind()))
    
    ;
}

bool EmptyChangeLogSet::operator!=(const EmptyChangeLogSet& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const EmptyChangeLogSet& o)
{
    j = nlohmann::json();
    if(o.r_classIsSet())
        j["_class"] = o.m__class;
    if(o.kindIsSet())
        j["kind"] = o.m_Kind;
    
}

void from_json(const nlohmann::json& j, EmptyChangeLogSet& o)
{
    if(j.find("_class") != j.end())
    {
        j.at("_class").get_to(o.m__class);
        o.m__classIsSet = true;
    } 
    if(j.find("kind") != j.end())
    {
        j.at("kind").get_to(o.m_Kind);
        o.m_KindIsSet = true;
    } 
    
}

std::string EmptyChangeLogSet::getClass() const
{
    return m__class;
}
void EmptyChangeLogSet::setClass(std::string const& value)
{
    m__class = value;
    m__classIsSet = true;
}
bool EmptyChangeLogSet::r_classIsSet() const
{
    return m__classIsSet;
}
void EmptyChangeLogSet::unset_class()
{
    m__classIsSet = false;
}
std::string EmptyChangeLogSet::getKind() const
{
    return m_Kind;
}
void EmptyChangeLogSet::setKind(std::string const& value)
{
    m_Kind = value;
    m_KindIsSet = true;
}
bool EmptyChangeLogSet::kindIsSet() const
{
    return m_KindIsSet;
}
void EmptyChangeLogSet::unsetKind()
{
    m_KindIsSet = false;
}


} // namespace org::openapitools::server::model

