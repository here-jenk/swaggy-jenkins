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


#include "ExtensionClassImpl.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ExtensionClassImpl::ExtensionClassImpl()
{
    m__class = "";
    m__classIsSet = false;
    m__linksIsSet = false;
    m_ClassesIsSet = false;
    
}

void ExtensionClassImpl::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ExtensionClassImpl::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ExtensionClassImpl::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ExtensionClassImpl" : pathPrefix;

                 
    if (classesIsSet())
    {
        const std::vector<std::string>& value = m_Classes;
        const std::string currentValuePath = _pathPrefix + ".classes";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool ExtensionClassImpl::operator==(const ExtensionClassImpl& rhs) const
{
    return
    
    
    
    ((!r_classIsSet() && !rhs.r_classIsSet()) || (r_classIsSet() && rhs.r_classIsSet() && getClass() == rhs.getClass())) &&
    
    
    ((!linksIsSet() && !rhs.linksIsSet()) || (linksIsSet() && rhs.linksIsSet() && getLinks() == rhs.getLinks())) &&
    
    
    ((!classesIsSet() && !rhs.classesIsSet()) || (classesIsSet() && rhs.classesIsSet() && getClasses() == rhs.getClasses()))
    
    ;
}

bool ExtensionClassImpl::operator!=(const ExtensionClassImpl& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ExtensionClassImpl& o)
{
    j = nlohmann::json();
    if(o.r_classIsSet())
        j["_class"] = o.m__class;
    if(o.linksIsSet())
        j["_links"] = o.m__links;
    if(o.classesIsSet() || !o.m_Classes.empty())
        j["classes"] = o.m_Classes;
    
}

void from_json(const nlohmann::json& j, ExtensionClassImpl& o)
{
    if(j.find("_class") != j.end())
    {
        j.at("_class").get_to(o.m__class);
        o.m__classIsSet = true;
    } 
    if(j.find("_links") != j.end())
    {
        j.at("_links").get_to(o.m__links);
        o.m__linksIsSet = true;
    } 
    if(j.find("classes") != j.end())
    {
        j.at("classes").get_to(o.m_Classes);
        o.m_ClassesIsSet = true;
    } 
    
}

std::string ExtensionClassImpl::getClass() const
{
    return m__class;
}
void ExtensionClassImpl::setClass(std::string const& value)
{
    m__class = value;
    m__classIsSet = true;
}
bool ExtensionClassImpl::r_classIsSet() const
{
    return m__classIsSet;
}
void ExtensionClassImpl::unset_class()
{
    m__classIsSet = false;
}
org::openapitools::server::model::ExtensionClassImpllinks ExtensionClassImpl::getLinks() const
{
    return m__links;
}
void ExtensionClassImpl::setLinks(org::openapitools::server::model::ExtensionClassImpllinks const& value)
{
    m__links = value;
    m__linksIsSet = true;
}
bool ExtensionClassImpl::linksIsSet() const
{
    return m__linksIsSet;
}
void ExtensionClassImpl::unset_links()
{
    m__linksIsSet = false;
}
std::vector<std::string> ExtensionClassImpl::getClasses() const
{
    return m_Classes;
}
void ExtensionClassImpl::setClasses(std::vector<std::string> const& value)
{
    m_Classes = value;
    m_ClassesIsSet = true;
}
bool ExtensionClassImpl::classesIsSet() const
{
    return m_ClassesIsSet;
}
void ExtensionClassImpl::unsetClasses()
{
    m_ClassesIsSet = false;
}


} // namespace org::openapitools::server::model

