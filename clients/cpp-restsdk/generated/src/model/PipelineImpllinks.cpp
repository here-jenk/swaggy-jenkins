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



#include "CppRestOpenAPIClient/model/PipelineImpllinks.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



PipelineImpllinks::PipelineImpllinks()
{
    m_RunsIsSet = false;
    m_SelfIsSet = false;
    m_QueueIsSet = false;
    m_ActionsIsSet = false;
    m__class = utility::conversions::to_string_t("");
    m__classIsSet = false;
}

PipelineImpllinks::~PipelineImpllinks()
{
}

void PipelineImpllinks::validate()
{
    // TODO: implement validation
}

web::json::value PipelineImpllinks::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_RunsIsSet)
    {
        val[utility::conversions::to_string_t(U("runs"))] = ModelBase::toJson(m_Runs);
    }
    if(m_SelfIsSet)
    {
        val[utility::conversions::to_string_t(U("self"))] = ModelBase::toJson(m_Self);
    }
    if(m_QueueIsSet)
    {
        val[utility::conversions::to_string_t(U("queue"))] = ModelBase::toJson(m_Queue);
    }
    if(m_ActionsIsSet)
    {
        val[utility::conversions::to_string_t(U("actions"))] = ModelBase::toJson(m_Actions);
    }
    if(m__classIsSet)
    {
        val[utility::conversions::to_string_t(U("_class"))] = ModelBase::toJson(m__class);
    }

    return val;
}

bool PipelineImpllinks::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("runs"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("runs")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Link> refVal_setRuns;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRuns);
            setRuns(refVal_setRuns);
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
    if(val.has_field(utility::conversions::to_string_t(U("queue"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("queue")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Link> refVal_setQueue;
            ok &= ModelBase::fromJson(fieldValue, refVal_setQueue);
            setQueue(refVal_setQueue);
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

void PipelineImpllinks::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_RunsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("runs")), m_Runs));
    }
    if(m_SelfIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("self")), m_Self));
    }
    if(m_QueueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("queue")), m_Queue));
    }
    if(m_ActionsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("actions")), m_Actions));
    }
    if(m__classIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("_class")), m__class));
    }
}

bool PipelineImpllinks::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("runs"))))
    {
        std::shared_ptr<Link> refVal_setRuns;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("runs"))), refVal_setRuns );
        setRuns(refVal_setRuns);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("self"))))
    {
        std::shared_ptr<Link> refVal_setSelf;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("self"))), refVal_setSelf );
        setSelf(refVal_setSelf);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("queue"))))
    {
        std::shared_ptr<Link> refVal_setQueue;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("queue"))), refVal_setQueue );
        setQueue(refVal_setQueue);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("actions"))))
    {
        std::shared_ptr<Link> refVal_setActions;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("actions"))), refVal_setActions );
        setActions(refVal_setActions);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("_class"))))
    {
        utility::string_t refVal_setClass;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("_class"))), refVal_setClass );
        setClass(refVal_setClass);
    }
    return ok;
}

std::shared_ptr<Link> PipelineImpllinks::getRuns() const
{
    return m_Runs;
}

void PipelineImpllinks::setRuns(const std::shared_ptr<Link>& value)
{
    m_Runs = value;
    m_RunsIsSet = true;
}

bool PipelineImpllinks::runsIsSet() const
{
    return m_RunsIsSet;
}

void PipelineImpllinks::unsetRuns()
{
    m_RunsIsSet = false;
}
std::shared_ptr<Link> PipelineImpllinks::getSelf() const
{
    return m_Self;
}

void PipelineImpllinks::setSelf(const std::shared_ptr<Link>& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}

bool PipelineImpllinks::selfIsSet() const
{
    return m_SelfIsSet;
}

void PipelineImpllinks::unsetSelf()
{
    m_SelfIsSet = false;
}
std::shared_ptr<Link> PipelineImpllinks::getQueue() const
{
    return m_Queue;
}

void PipelineImpllinks::setQueue(const std::shared_ptr<Link>& value)
{
    m_Queue = value;
    m_QueueIsSet = true;
}

bool PipelineImpllinks::queueIsSet() const
{
    return m_QueueIsSet;
}

void PipelineImpllinks::unsetQueue()
{
    m_QueueIsSet = false;
}
std::shared_ptr<Link> PipelineImpllinks::getActions() const
{
    return m_Actions;
}

void PipelineImpllinks::setActions(const std::shared_ptr<Link>& value)
{
    m_Actions = value;
    m_ActionsIsSet = true;
}

bool PipelineImpllinks::actionsIsSet() const
{
    return m_ActionsIsSet;
}

void PipelineImpllinks::unsetActions()
{
    m_ActionsIsSet = false;
}
utility::string_t PipelineImpllinks::getClass() const
{
    return m__class;
}

void PipelineImpllinks::setClass(const utility::string_t& value)
{
    m__class = value;
    m__classIsSet = true;
}

bool PipelineImpllinks::r_classIsSet() const
{
    return m__classIsSet;
}

void PipelineImpllinks::unset_class()
{
    m__classIsSet = false;
}
}
}
}
}


