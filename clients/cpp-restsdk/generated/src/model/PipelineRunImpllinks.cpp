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



#include "CppRestOpenAPIClient/model/PipelineRunImpllinks.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



PipelineRunImpllinks::PipelineRunImpllinks()
{
    m_NodesIsSet = false;
    m_LogIsSet = false;
    m_SelfIsSet = false;
    m_ActionsIsSet = false;
    m_StepsIsSet = false;
    m__class = utility::conversions::to_string_t("");
    m__classIsSet = false;
}

PipelineRunImpllinks::~PipelineRunImpllinks()
{
}

void PipelineRunImpllinks::validate()
{
    // TODO: implement validation
}

web::json::value PipelineRunImpllinks::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_NodesIsSet)
    {
        val[utility::conversions::to_string_t(U("nodes"))] = ModelBase::toJson(m_Nodes);
    }
    if(m_LogIsSet)
    {
        val[utility::conversions::to_string_t(U("log"))] = ModelBase::toJson(m_Log);
    }
    if(m_SelfIsSet)
    {
        val[utility::conversions::to_string_t(U("self"))] = ModelBase::toJson(m_Self);
    }
    if(m_ActionsIsSet)
    {
        val[utility::conversions::to_string_t(U("actions"))] = ModelBase::toJson(m_Actions);
    }
    if(m_StepsIsSet)
    {
        val[utility::conversions::to_string_t(U("steps"))] = ModelBase::toJson(m_Steps);
    }
    if(m__classIsSet)
    {
        val[utility::conversions::to_string_t(U("_class"))] = ModelBase::toJson(m__class);
    }

    return val;
}

bool PipelineRunImpllinks::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("nodes"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("nodes")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Link> refVal_setNodes;
            ok &= ModelBase::fromJson(fieldValue, refVal_setNodes);
            setNodes(refVal_setNodes);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("log"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("log")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Link> refVal_setLog;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLog);
            setLog(refVal_setLog);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("self"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("self")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Link> refVal_setSelf;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSelf);
            setSelf(refVal_setSelf);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("actions"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("actions")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Link> refVal_setActions;
            ok &= ModelBase::fromJson(fieldValue, refVal_setActions);
            setActions(refVal_setActions);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("steps"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("steps")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Link> refVal_setSteps;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSteps);
            setSteps(refVal_setSteps);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("_class"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("_class")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setClass;
            ok &= ModelBase::fromJson(fieldValue, refVal_setClass);
            setClass(refVal_setClass);
        }
    }
    return ok;
}

void PipelineRunImpllinks::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_NodesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("nodes")), m_Nodes));
    }
    if(m_LogIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("log")), m_Log));
    }
    if(m_SelfIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("self")), m_Self));
    }
    if(m_ActionsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("actions")), m_Actions));
    }
    if(m_StepsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("steps")), m_Steps));
    }
    if(m__classIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("_class")), m__class));
    }
}

bool PipelineRunImpllinks::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("nodes"))))
    {
        std::shared_ptr<Link> refVal_setNodes;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("nodes"))), refVal_setNodes );
        setNodes(refVal_setNodes);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("log"))))
    {
        std::shared_ptr<Link> refVal_setLog;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("log"))), refVal_setLog );
        setLog(refVal_setLog);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("self"))))
    {
        std::shared_ptr<Link> refVal_setSelf;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("self"))), refVal_setSelf );
        setSelf(refVal_setSelf);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("actions"))))
    {
        std::shared_ptr<Link> refVal_setActions;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("actions"))), refVal_setActions );
        setActions(refVal_setActions);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("steps"))))
    {
        std::shared_ptr<Link> refVal_setSteps;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("steps"))), refVal_setSteps );
        setSteps(refVal_setSteps);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("_class"))))
    {
        utility::string_t refVal_setClass;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("_class"))), refVal_setClass );
        setClass(refVal_setClass);
    }
    return ok;
}

std::shared_ptr<Link> PipelineRunImpllinks::getNodes() const
{
    return m_Nodes;
}

void PipelineRunImpllinks::setNodes(const std::shared_ptr<Link>& value)
{
    m_Nodes = value;
    m_NodesIsSet = true;
}

bool PipelineRunImpllinks::nodesIsSet() const
{
    return m_NodesIsSet;
}

void PipelineRunImpllinks::unsetNodes()
{
    m_NodesIsSet = false;
}
std::shared_ptr<Link> PipelineRunImpllinks::getLog() const
{
    return m_Log;
}

void PipelineRunImpllinks::setLog(const std::shared_ptr<Link>& value)
{
    m_Log = value;
    m_LogIsSet = true;
}

bool PipelineRunImpllinks::logIsSet() const
{
    return m_LogIsSet;
}

void PipelineRunImpllinks::unsetLog()
{
    m_LogIsSet = false;
}
std::shared_ptr<Link> PipelineRunImpllinks::getSelf() const
{
    return m_Self;
}

void PipelineRunImpllinks::setSelf(const std::shared_ptr<Link>& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}

bool PipelineRunImpllinks::selfIsSet() const
{
    return m_SelfIsSet;
}

void PipelineRunImpllinks::unsetSelf()
{
    m_SelfIsSet = false;
}
std::shared_ptr<Link> PipelineRunImpllinks::getActions() const
{
    return m_Actions;
}

void PipelineRunImpllinks::setActions(const std::shared_ptr<Link>& value)
{
    m_Actions = value;
    m_ActionsIsSet = true;
}

bool PipelineRunImpllinks::actionsIsSet() const
{
    return m_ActionsIsSet;
}

void PipelineRunImpllinks::unsetActions()
{
    m_ActionsIsSet = false;
}
std::shared_ptr<Link> PipelineRunImpllinks::getSteps() const
{
    return m_Steps;
}

void PipelineRunImpllinks::setSteps(const std::shared_ptr<Link>& value)
{
    m_Steps = value;
    m_StepsIsSet = true;
}

bool PipelineRunImpllinks::stepsIsSet() const
{
    return m_StepsIsSet;
}

void PipelineRunImpllinks::unsetSteps()
{
    m_StepsIsSet = false;
}
utility::string_t PipelineRunImpllinks::getClass() const
{
    return m__class;
}

void PipelineRunImpllinks::setClass(const utility::string_t& value)
{
    m__class = value;
    m__classIsSet = true;
}

bool PipelineRunImpllinks::r_classIsSet() const
{
    return m__classIsSet;
}

void PipelineRunImpllinks::unset_class()
{
    m__classIsSet = false;
}
}
}
}
}


