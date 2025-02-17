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


#include "HudsonMasterComputer.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

HudsonMasterComputer::HudsonMasterComputer()
{
    m__class = "";
    m__classIsSet = false;
    m_DisplayName = "";
    m_DisplayNameIsSet = false;
    m_ExecutorsIsSet = false;
    m_Icon = "";
    m_IconIsSet = false;
    m_IconClassName = "";
    m_IconClassNameIsSet = false;
    m_Idle = false;
    m_IdleIsSet = false;
    m_JnlpAgent = false;
    m_JnlpAgentIsSet = false;
    m_LaunchSupported = false;
    m_LaunchSupportedIsSet = false;
    m_LoadStatisticsIsSet = false;
    m_ManualLaunchAllowed = false;
    m_ManualLaunchAllowedIsSet = false;
    m_MonitorDataIsSet = false;
    m_NumExecutors = 0;
    m_NumExecutorsIsSet = false;
    m_Offline = false;
    m_OfflineIsSet = false;
    m_OfflineCause = "";
    m_OfflineCauseIsSet = false;
    m_OfflineCauseReason = "";
    m_OfflineCauseReasonIsSet = false;
    m_TemporarilyOffline = false;
    m_TemporarilyOfflineIsSet = false;
    
}

void HudsonMasterComputer::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool HudsonMasterComputer::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool HudsonMasterComputer::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "HudsonMasterComputer" : pathPrefix;

                 
    if (executorsIsSet())
    {
        const std::vector<org::openapitools::server::model::HudsonMasterComputerexecutors>& value = m_Executors;
        const std::string currentValuePath = _pathPrefix + ".executors";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::HudsonMasterComputerexecutors& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".executors") && success;
 
                i++;
            }
        }

    }
                                                        
    return success;
}

bool HudsonMasterComputer::operator==(const HudsonMasterComputer& rhs) const
{
    return
    
    
    
    ((!r_classIsSet() && !rhs.r_classIsSet()) || (r_classIsSet() && rhs.r_classIsSet() && getClass() == rhs.getClass())) &&
    
    
    ((!displayNameIsSet() && !rhs.displayNameIsSet()) || (displayNameIsSet() && rhs.displayNameIsSet() && getDisplayName() == rhs.getDisplayName())) &&
    
    
    ((!executorsIsSet() && !rhs.executorsIsSet()) || (executorsIsSet() && rhs.executorsIsSet() && getExecutors() == rhs.getExecutors())) &&
    
    
    ((!iconIsSet() && !rhs.iconIsSet()) || (iconIsSet() && rhs.iconIsSet() && getIcon() == rhs.getIcon())) &&
    
    
    ((!iconClassNameIsSet() && !rhs.iconClassNameIsSet()) || (iconClassNameIsSet() && rhs.iconClassNameIsSet() && getIconClassName() == rhs.getIconClassName())) &&
    
    
    ((!idleIsSet() && !rhs.idleIsSet()) || (idleIsSet() && rhs.idleIsSet() && isIdle() == rhs.isIdle())) &&
    
    
    ((!jnlpAgentIsSet() && !rhs.jnlpAgentIsSet()) || (jnlpAgentIsSet() && rhs.jnlpAgentIsSet() && isJnlpAgent() == rhs.isJnlpAgent())) &&
    
    
    ((!launchSupportedIsSet() && !rhs.launchSupportedIsSet()) || (launchSupportedIsSet() && rhs.launchSupportedIsSet() && isLaunchSupported() == rhs.isLaunchSupported())) &&
    
    
    ((!loadStatisticsIsSet() && !rhs.loadStatisticsIsSet()) || (loadStatisticsIsSet() && rhs.loadStatisticsIsSet() && getLoadStatistics() == rhs.getLoadStatistics())) &&
    
    
    ((!manualLaunchAllowedIsSet() && !rhs.manualLaunchAllowedIsSet()) || (manualLaunchAllowedIsSet() && rhs.manualLaunchAllowedIsSet() && isManualLaunchAllowed() == rhs.isManualLaunchAllowed())) &&
    
    
    ((!monitorDataIsSet() && !rhs.monitorDataIsSet()) || (monitorDataIsSet() && rhs.monitorDataIsSet() && getMonitorData() == rhs.getMonitorData())) &&
    
    
    ((!numExecutorsIsSet() && !rhs.numExecutorsIsSet()) || (numExecutorsIsSet() && rhs.numExecutorsIsSet() && getNumExecutors() == rhs.getNumExecutors())) &&
    
    
    ((!offlineIsSet() && !rhs.offlineIsSet()) || (offlineIsSet() && rhs.offlineIsSet() && isOffline() == rhs.isOffline())) &&
    
    
    ((!offlineCauseIsSet() && !rhs.offlineCauseIsSet()) || (offlineCauseIsSet() && rhs.offlineCauseIsSet() && getOfflineCause() == rhs.getOfflineCause())) &&
    
    
    ((!offlineCauseReasonIsSet() && !rhs.offlineCauseReasonIsSet()) || (offlineCauseReasonIsSet() && rhs.offlineCauseReasonIsSet() && getOfflineCauseReason() == rhs.getOfflineCauseReason())) &&
    
    
    ((!temporarilyOfflineIsSet() && !rhs.temporarilyOfflineIsSet()) || (temporarilyOfflineIsSet() && rhs.temporarilyOfflineIsSet() && isTemporarilyOffline() == rhs.isTemporarilyOffline()))
    
    ;
}

bool HudsonMasterComputer::operator!=(const HudsonMasterComputer& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const HudsonMasterComputer& o)
{
    j = nlohmann::json();
    if(o.r_classIsSet())
        j["_class"] = o.m__class;
    if(o.displayNameIsSet())
        j["displayName"] = o.m_DisplayName;
    if(o.executorsIsSet() || !o.m_Executors.empty())
        j["executors"] = o.m_Executors;
    if(o.iconIsSet())
        j["icon"] = o.m_Icon;
    if(o.iconClassNameIsSet())
        j["iconClassName"] = o.m_IconClassName;
    if(o.idleIsSet())
        j["idle"] = o.m_Idle;
    if(o.jnlpAgentIsSet())
        j["jnlpAgent"] = o.m_JnlpAgent;
    if(o.launchSupportedIsSet())
        j["launchSupported"] = o.m_LaunchSupported;
    if(o.loadStatisticsIsSet())
        j["loadStatistics"] = o.m_LoadStatistics;
    if(o.manualLaunchAllowedIsSet())
        j["manualLaunchAllowed"] = o.m_ManualLaunchAllowed;
    if(o.monitorDataIsSet())
        j["monitorData"] = o.m_MonitorData;
    if(o.numExecutorsIsSet())
        j["numExecutors"] = o.m_NumExecutors;
    if(o.offlineIsSet())
        j["offline"] = o.m_Offline;
    if(o.offlineCauseIsSet())
        j["offlineCause"] = o.m_OfflineCause;
    if(o.offlineCauseReasonIsSet())
        j["offlineCauseReason"] = o.m_OfflineCauseReason;
    if(o.temporarilyOfflineIsSet())
        j["temporarilyOffline"] = o.m_TemporarilyOffline;
    
}

void from_json(const nlohmann::json& j, HudsonMasterComputer& o)
{
    if(j.find("_class") != j.end())
    {
        j.at("_class").get_to(o.m__class);
        o.m__classIsSet = true;
    } 
    if(j.find("displayName") != j.end())
    {
        j.at("displayName").get_to(o.m_DisplayName);
        o.m_DisplayNameIsSet = true;
    } 
    if(j.find("executors") != j.end())
    {
        j.at("executors").get_to(o.m_Executors);
        o.m_ExecutorsIsSet = true;
    } 
    if(j.find("icon") != j.end())
    {
        j.at("icon").get_to(o.m_Icon);
        o.m_IconIsSet = true;
    } 
    if(j.find("iconClassName") != j.end())
    {
        j.at("iconClassName").get_to(o.m_IconClassName);
        o.m_IconClassNameIsSet = true;
    } 
    if(j.find("idle") != j.end())
    {
        j.at("idle").get_to(o.m_Idle);
        o.m_IdleIsSet = true;
    } 
    if(j.find("jnlpAgent") != j.end())
    {
        j.at("jnlpAgent").get_to(o.m_JnlpAgent);
        o.m_JnlpAgentIsSet = true;
    } 
    if(j.find("launchSupported") != j.end())
    {
        j.at("launchSupported").get_to(o.m_LaunchSupported);
        o.m_LaunchSupportedIsSet = true;
    } 
    if(j.find("loadStatistics") != j.end())
    {
        j.at("loadStatistics").get_to(o.m_LoadStatistics);
        o.m_LoadStatisticsIsSet = true;
    } 
    if(j.find("manualLaunchAllowed") != j.end())
    {
        j.at("manualLaunchAllowed").get_to(o.m_ManualLaunchAllowed);
        o.m_ManualLaunchAllowedIsSet = true;
    } 
    if(j.find("monitorData") != j.end())
    {
        j.at("monitorData").get_to(o.m_MonitorData);
        o.m_MonitorDataIsSet = true;
    } 
    if(j.find("numExecutors") != j.end())
    {
        j.at("numExecutors").get_to(o.m_NumExecutors);
        o.m_NumExecutorsIsSet = true;
    } 
    if(j.find("offline") != j.end())
    {
        j.at("offline").get_to(o.m_Offline);
        o.m_OfflineIsSet = true;
    } 
    if(j.find("offlineCause") != j.end())
    {
        j.at("offlineCause").get_to(o.m_OfflineCause);
        o.m_OfflineCauseIsSet = true;
    } 
    if(j.find("offlineCauseReason") != j.end())
    {
        j.at("offlineCauseReason").get_to(o.m_OfflineCauseReason);
        o.m_OfflineCauseReasonIsSet = true;
    } 
    if(j.find("temporarilyOffline") != j.end())
    {
        j.at("temporarilyOffline").get_to(o.m_TemporarilyOffline);
        o.m_TemporarilyOfflineIsSet = true;
    } 
    
}

std::string HudsonMasterComputer::getClass() const
{
    return m__class;
}
void HudsonMasterComputer::setClass(std::string const& value)
{
    m__class = value;
    m__classIsSet = true;
}
bool HudsonMasterComputer::r_classIsSet() const
{
    return m__classIsSet;
}
void HudsonMasterComputer::unset_class()
{
    m__classIsSet = false;
}
std::string HudsonMasterComputer::getDisplayName() const
{
    return m_DisplayName;
}
void HudsonMasterComputer::setDisplayName(std::string const& value)
{
    m_DisplayName = value;
    m_DisplayNameIsSet = true;
}
bool HudsonMasterComputer::displayNameIsSet() const
{
    return m_DisplayNameIsSet;
}
void HudsonMasterComputer::unsetDisplayName()
{
    m_DisplayNameIsSet = false;
}
std::vector<org::openapitools::server::model::HudsonMasterComputerexecutors> HudsonMasterComputer::getExecutors() const
{
    return m_Executors;
}
void HudsonMasterComputer::setExecutors(std::vector<org::openapitools::server::model::HudsonMasterComputerexecutors> const& value)
{
    m_Executors = value;
    m_ExecutorsIsSet = true;
}
bool HudsonMasterComputer::executorsIsSet() const
{
    return m_ExecutorsIsSet;
}
void HudsonMasterComputer::unsetExecutors()
{
    m_ExecutorsIsSet = false;
}
std::string HudsonMasterComputer::getIcon() const
{
    return m_Icon;
}
void HudsonMasterComputer::setIcon(std::string const& value)
{
    m_Icon = value;
    m_IconIsSet = true;
}
bool HudsonMasterComputer::iconIsSet() const
{
    return m_IconIsSet;
}
void HudsonMasterComputer::unsetIcon()
{
    m_IconIsSet = false;
}
std::string HudsonMasterComputer::getIconClassName() const
{
    return m_IconClassName;
}
void HudsonMasterComputer::setIconClassName(std::string const& value)
{
    m_IconClassName = value;
    m_IconClassNameIsSet = true;
}
bool HudsonMasterComputer::iconClassNameIsSet() const
{
    return m_IconClassNameIsSet;
}
void HudsonMasterComputer::unsetIconClassName()
{
    m_IconClassNameIsSet = false;
}
bool HudsonMasterComputer::isIdle() const
{
    return m_Idle;
}
void HudsonMasterComputer::setIdle(bool const value)
{
    m_Idle = value;
    m_IdleIsSet = true;
}
bool HudsonMasterComputer::idleIsSet() const
{
    return m_IdleIsSet;
}
void HudsonMasterComputer::unsetIdle()
{
    m_IdleIsSet = false;
}
bool HudsonMasterComputer::isJnlpAgent() const
{
    return m_JnlpAgent;
}
void HudsonMasterComputer::setJnlpAgent(bool const value)
{
    m_JnlpAgent = value;
    m_JnlpAgentIsSet = true;
}
bool HudsonMasterComputer::jnlpAgentIsSet() const
{
    return m_JnlpAgentIsSet;
}
void HudsonMasterComputer::unsetJnlpAgent()
{
    m_JnlpAgentIsSet = false;
}
bool HudsonMasterComputer::isLaunchSupported() const
{
    return m_LaunchSupported;
}
void HudsonMasterComputer::setLaunchSupported(bool const value)
{
    m_LaunchSupported = value;
    m_LaunchSupportedIsSet = true;
}
bool HudsonMasterComputer::launchSupportedIsSet() const
{
    return m_LaunchSupportedIsSet;
}
void HudsonMasterComputer::unsetLaunchSupported()
{
    m_LaunchSupportedIsSet = false;
}
org::openapitools::server::model::Label1 HudsonMasterComputer::getLoadStatistics() const
{
    return m_LoadStatistics;
}
void HudsonMasterComputer::setLoadStatistics(org::openapitools::server::model::Label1 const& value)
{
    m_LoadStatistics = value;
    m_LoadStatisticsIsSet = true;
}
bool HudsonMasterComputer::loadStatisticsIsSet() const
{
    return m_LoadStatisticsIsSet;
}
void HudsonMasterComputer::unsetLoadStatistics()
{
    m_LoadStatisticsIsSet = false;
}
bool HudsonMasterComputer::isManualLaunchAllowed() const
{
    return m_ManualLaunchAllowed;
}
void HudsonMasterComputer::setManualLaunchAllowed(bool const value)
{
    m_ManualLaunchAllowed = value;
    m_ManualLaunchAllowedIsSet = true;
}
bool HudsonMasterComputer::manualLaunchAllowedIsSet() const
{
    return m_ManualLaunchAllowedIsSet;
}
void HudsonMasterComputer::unsetManualLaunchAllowed()
{
    m_ManualLaunchAllowedIsSet = false;
}
org::openapitools::server::model::HudsonMasterComputermonitorData HudsonMasterComputer::getMonitorData() const
{
    return m_MonitorData;
}
void HudsonMasterComputer::setMonitorData(org::openapitools::server::model::HudsonMasterComputermonitorData const& value)
{
    m_MonitorData = value;
    m_MonitorDataIsSet = true;
}
bool HudsonMasterComputer::monitorDataIsSet() const
{
    return m_MonitorDataIsSet;
}
void HudsonMasterComputer::unsetMonitorData()
{
    m_MonitorDataIsSet = false;
}
int32_t HudsonMasterComputer::getNumExecutors() const
{
    return m_NumExecutors;
}
void HudsonMasterComputer::setNumExecutors(int32_t const value)
{
    m_NumExecutors = value;
    m_NumExecutorsIsSet = true;
}
bool HudsonMasterComputer::numExecutorsIsSet() const
{
    return m_NumExecutorsIsSet;
}
void HudsonMasterComputer::unsetNumExecutors()
{
    m_NumExecutorsIsSet = false;
}
bool HudsonMasterComputer::isOffline() const
{
    return m_Offline;
}
void HudsonMasterComputer::setOffline(bool const value)
{
    m_Offline = value;
    m_OfflineIsSet = true;
}
bool HudsonMasterComputer::offlineIsSet() const
{
    return m_OfflineIsSet;
}
void HudsonMasterComputer::unsetOffline()
{
    m_OfflineIsSet = false;
}
std::string HudsonMasterComputer::getOfflineCause() const
{
    return m_OfflineCause;
}
void HudsonMasterComputer::setOfflineCause(std::string const& value)
{
    m_OfflineCause = value;
    m_OfflineCauseIsSet = true;
}
bool HudsonMasterComputer::offlineCauseIsSet() const
{
    return m_OfflineCauseIsSet;
}
void HudsonMasterComputer::unsetOfflineCause()
{
    m_OfflineCauseIsSet = false;
}
std::string HudsonMasterComputer::getOfflineCauseReason() const
{
    return m_OfflineCauseReason;
}
void HudsonMasterComputer::setOfflineCauseReason(std::string const& value)
{
    m_OfflineCauseReason = value;
    m_OfflineCauseReasonIsSet = true;
}
bool HudsonMasterComputer::offlineCauseReasonIsSet() const
{
    return m_OfflineCauseReasonIsSet;
}
void HudsonMasterComputer::unsetOfflineCauseReason()
{
    m_OfflineCauseReasonIsSet = false;
}
bool HudsonMasterComputer::isTemporarilyOffline() const
{
    return m_TemporarilyOffline;
}
void HudsonMasterComputer::setTemporarilyOffline(bool const value)
{
    m_TemporarilyOffline = value;
    m_TemporarilyOfflineIsSet = true;
}
bool HudsonMasterComputer::temporarilyOfflineIsSet() const
{
    return m_TemporarilyOfflineIsSet;
}
void HudsonMasterComputer::unsetTemporarilyOffline()
{
    m_TemporarilyOfflineIsSet = false;
}


} // namespace org::openapitools::server::model

