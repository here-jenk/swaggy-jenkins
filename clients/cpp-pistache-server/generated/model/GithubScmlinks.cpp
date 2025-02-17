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


#include "GithubScmlinks.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GithubScmlinks::GithubScmlinks()
{
    m_SelfIsSet = false;
    m__class = "";
    m__classIsSet = false;
    
}

void GithubScmlinks::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GithubScmlinks::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GithubScmlinks::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GithubScmlinks" : pathPrefix;

            
    return success;
}

bool GithubScmlinks::operator==(const GithubScmlinks& rhs) const
{
    return
    
    
    
    ((!selfIsSet() && !rhs.selfIsSet()) || (selfIsSet() && rhs.selfIsSet() && getSelf() == rhs.getSelf())) &&
    
    
    ((!r_classIsSet() && !rhs.r_classIsSet()) || (r_classIsSet() && rhs.r_classIsSet() && getClass() == rhs.getClass()))
    
    ;
}

bool GithubScmlinks::operator!=(const GithubScmlinks& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GithubScmlinks& o)
{
    j = nlohmann::json();
    if(o.selfIsSet())
        j["self"] = o.m_Self;
    if(o.r_classIsSet())
        j["_class"] = o.m__class;
    
}

void from_json(const nlohmann::json& j, GithubScmlinks& o)
{
    if(j.find("self") != j.end())
    {
        j.at("self").get_to(o.m_Self);
        o.m_SelfIsSet = true;
    } 
    if(j.find("_class") != j.end())
    {
        j.at("_class").get_to(o.m__class);
        o.m__classIsSet = true;
    } 
    
}

org::openapitools::server::model::Link GithubScmlinks::getSelf() const
{
    return m_Self;
}
void GithubScmlinks::setSelf(org::openapitools::server::model::Link const& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}
bool GithubScmlinks::selfIsSet() const
{
    return m_SelfIsSet;
}
void GithubScmlinks::unsetSelf()
{
    m_SelfIsSet = false;
}
std::string GithubScmlinks::getClass() const
{
    return m__class;
}
void GithubScmlinks::setClass(std::string const& value)
{
    m__class = value;
    m__classIsSet = true;
}
bool GithubScmlinks::r_classIsSet() const
{
    return m__classIsSet;
}
void GithubScmlinks::unset_class()
{
    m__classIsSet = false;
}


} // namespace org::openapitools::server::model

