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


#include "ExtensionClassContainerImpl1map.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ExtensionClassContainerImpl1map::ExtensionClassContainerImpl1map()
{
    m_Io_jenkins_blueocean_service_embedded_rest_PipelineImplIsSet = false;
    m_Io_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImplIsSet = false;
    m__class = "";
    m__classIsSet = false;
    
}

void ExtensionClassContainerImpl1map::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ExtensionClassContainerImpl1map::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ExtensionClassContainerImpl1map::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ExtensionClassContainerImpl1map" : pathPrefix;

                
    return success;
}

bool ExtensionClassContainerImpl1map::operator==(const ExtensionClassContainerImpl1map& rhs) const
{
    return
    
    
    
    ((!ioJenkinsBlueoceanServiceEmbeddedRestPipelineImplIsSet() && !rhs.ioJenkinsBlueoceanServiceEmbeddedRestPipelineImplIsSet()) || (ioJenkinsBlueoceanServiceEmbeddedRestPipelineImplIsSet() && rhs.ioJenkinsBlueoceanServiceEmbeddedRestPipelineImplIsSet() && getIoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl() == rhs.getIoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl())) &&
    
    
    ((!ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImplIsSet() && !rhs.ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImplIsSet()) || (ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImplIsSet() && rhs.ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImplIsSet() && getIoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl() == rhs.getIoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl())) &&
    
    
    ((!r_classIsSet() && !rhs.r_classIsSet()) || (r_classIsSet() && rhs.r_classIsSet() && getClass() == rhs.getClass()))
    
    ;
}

bool ExtensionClassContainerImpl1map::operator!=(const ExtensionClassContainerImpl1map& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ExtensionClassContainerImpl1map& o)
{
    j = nlohmann::json();
    if(o.ioJenkinsBlueoceanServiceEmbeddedRestPipelineImplIsSet())
        j["io.jenkins.blueocean.service.embedded.rest.PipelineImpl"] = o.m_Io_jenkins_blueocean_service_embedded_rest_PipelineImpl;
    if(o.ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImplIsSet())
        j["io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl"] = o.m_Io_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImpl;
    if(o.r_classIsSet())
        j["_class"] = o.m__class;
    
}

void from_json(const nlohmann::json& j, ExtensionClassContainerImpl1map& o)
{
    if(j.find("io.jenkins.blueocean.service.embedded.rest.PipelineImpl") != j.end())
    {
        j.at("io.jenkins.blueocean.service.embedded.rest.PipelineImpl").get_to(o.m_Io_jenkins_blueocean_service_embedded_rest_PipelineImpl);
        o.m_Io_jenkins_blueocean_service_embedded_rest_PipelineImplIsSet = true;
    } 
    if(j.find("io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl") != j.end())
    {
        j.at("io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl").get_to(o.m_Io_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImpl);
        o.m_Io_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImplIsSet = true;
    } 
    if(j.find("_class") != j.end())
    {
        j.at("_class").get_to(o.m__class);
        o.m__classIsSet = true;
    } 
    
}

org::openapitools::server::model::ExtensionClassImpl ExtensionClassContainerImpl1map::getIoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl() const
{
    return m_Io_jenkins_blueocean_service_embedded_rest_PipelineImpl;
}
void ExtensionClassContainerImpl1map::setIoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl(org::openapitools::server::model::ExtensionClassImpl const& value)
{
    m_Io_jenkins_blueocean_service_embedded_rest_PipelineImpl = value;
    m_Io_jenkins_blueocean_service_embedded_rest_PipelineImplIsSet = true;
}
bool ExtensionClassContainerImpl1map::ioJenkinsBlueoceanServiceEmbeddedRestPipelineImplIsSet() const
{
    return m_Io_jenkins_blueocean_service_embedded_rest_PipelineImplIsSet;
}
void ExtensionClassContainerImpl1map::unsetIo_jenkins_blueocean_service_embedded_rest_PipelineImpl()
{
    m_Io_jenkins_blueocean_service_embedded_rest_PipelineImplIsSet = false;
}
org::openapitools::server::model::ExtensionClassImpl ExtensionClassContainerImpl1map::getIoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl() const
{
    return m_Io_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImpl;
}
void ExtensionClassContainerImpl1map::setIoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl(org::openapitools::server::model::ExtensionClassImpl const& value)
{
    m_Io_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImpl = value;
    m_Io_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImplIsSet = true;
}
bool ExtensionClassContainerImpl1map::ioJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImplIsSet() const
{
    return m_Io_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImplIsSet;
}
void ExtensionClassContainerImpl1map::unsetIo_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImpl()
{
    m_Io_jenkins_blueocean_service_embedded_rest_MultiBranchPipelineImplIsSet = false;
}
std::string ExtensionClassContainerImpl1map::getClass() const
{
    return m__class;
}
void ExtensionClassContainerImpl1map::setClass(std::string const& value)
{
    m__class = value;
    m__classIsSet = true;
}
bool ExtensionClassContainerImpl1map::r_classIsSet() const
{
    return m__classIsSet;
}
void ExtensionClassContainerImpl1map::unset_class()
{
    m__classIsSet = false;
}


} // namespace org::openapitools::server::model

