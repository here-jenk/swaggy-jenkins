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


#include "FavoriteImpl.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

FavoriteImpl::FavoriteImpl()
{
    m__class = "";
    m__classIsSet = false;
    m__linksIsSet = false;
    m_ItemIsSet = false;
    
}

void FavoriteImpl::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool FavoriteImpl::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool FavoriteImpl::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "FavoriteImpl" : pathPrefix;

                
    return success;
}

bool FavoriteImpl::operator==(const FavoriteImpl& rhs) const
{
    return
    
    
    
    ((!r_classIsSet() && !rhs.r_classIsSet()) || (r_classIsSet() && rhs.r_classIsSet() && getClass() == rhs.getClass())) &&
    
    
    ((!linksIsSet() && !rhs.linksIsSet()) || (linksIsSet() && rhs.linksIsSet() && getLinks() == rhs.getLinks())) &&
    
    
    ((!itemIsSet() && !rhs.itemIsSet()) || (itemIsSet() && rhs.itemIsSet() && getItem() == rhs.getItem()))
    
    ;
}

bool FavoriteImpl::operator!=(const FavoriteImpl& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const FavoriteImpl& o)
{
    j = nlohmann::json();
    if(o.r_classIsSet())
        j["_class"] = o.m__class;
    if(o.linksIsSet())
        j["_links"] = o.m__links;
    if(o.itemIsSet())
        j["item"] = o.m_Item;
    
}

void from_json(const nlohmann::json& j, FavoriteImpl& o)
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
    if(j.find("item") != j.end())
    {
        j.at("item").get_to(o.m_Item);
        o.m_ItemIsSet = true;
    } 
    
}

std::string FavoriteImpl::getClass() const
{
    return m__class;
}
void FavoriteImpl::setClass(std::string const& value)
{
    m__class = value;
    m__classIsSet = true;
}
bool FavoriteImpl::r_classIsSet() const
{
    return m__classIsSet;
}
void FavoriteImpl::unset_class()
{
    m__classIsSet = false;
}
org::openapitools::server::model::FavoriteImpllinks FavoriteImpl::getLinks() const
{
    return m__links;
}
void FavoriteImpl::setLinks(org::openapitools::server::model::FavoriteImpllinks const& value)
{
    m__links = value;
    m__linksIsSet = true;
}
bool FavoriteImpl::linksIsSet() const
{
    return m__linksIsSet;
}
void FavoriteImpl::unset_links()
{
    m__linksIsSet = false;
}
org::openapitools::server::model::PipelineImpl FavoriteImpl::getItem() const
{
    return m_Item;
}
void FavoriteImpl::setItem(org::openapitools::server::model::PipelineImpl const& value)
{
    m_Item = value;
    m_ItemIsSet = true;
}
bool FavoriteImpl::itemIsSet() const
{
    return m_ItemIsSet;
}
void FavoriteImpl::unsetItem()
{
    m_ItemIsSet = false;
}


} // namespace org::openapitools::server::model

