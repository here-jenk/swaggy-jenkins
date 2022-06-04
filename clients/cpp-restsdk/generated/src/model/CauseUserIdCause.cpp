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



#include "CppRestOpenAPIClient/model/CauseUserIdCause.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CauseUserIdCause::CauseUserIdCause()
{
    m__class = utility::conversions::to_string_t("");
    m__classIsSet = false;
    m_ShortDescription = utility::conversions::to_string_t("");
    m_ShortDescriptionIsSet = false;
    m_UserId = utility::conversions::to_string_t("");
    m_UserIdIsSet = false;
    m_UserName = utility::conversions::to_string_t("");
    m_UserNameIsSet = false;
}

CauseUserIdCause::~CauseUserIdCause()
{
}

void CauseUserIdCause::validate()
{
    // TODO: implement validation
}

web::json::value CauseUserIdCause::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m__classIsSet)
    {
        val[utility::conversions::to_string_t(U("_class"))] = ModelBase::toJson(m__class);
    }
    if(m_ShortDescriptionIsSet)
    {
        val[utility::conversions::to_string_t(U("shortDescription"))] = ModelBase::toJson(m_ShortDescription);
    }
    if(m_UserIdIsSet)
    {
        val[utility::conversions::to_string_t(U("userId"))] = ModelBase::toJson(m_UserId);
    }
    if(m_UserNameIsSet)
    {
        val[utility::conversions::to_string_t(U("userName"))] = ModelBase::toJson(m_UserName);
    }

    return val;
}

bool CauseUserIdCause::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    if(val.has_field(utility::conversions::to_string_t(U("shortDescription"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("shortDescription")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setShortDescription;
            ok &= ModelBase::fromJson(fieldValue, refVal_setShortDescription);
            setShortDescription(refVal_setShortDescription);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("userId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("userId")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUserId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUserId);
            setUserId(refVal_setUserId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("userName"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("userName")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUserName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUserName);
            setUserName(refVal_setUserName);
        }
    }
    return ok;
}

void CauseUserIdCause::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m__classIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("_class")), m__class));
    }
    if(m_ShortDescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("shortDescription")), m_ShortDescription));
    }
    if(m_UserIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("userId")), m_UserId));
    }
    if(m_UserNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("userName")), m_UserName));
    }
}

bool CauseUserIdCause::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("_class"))))
    {
        utility::string_t refVal_setClass;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("_class"))), refVal_setClass );
        setClass(refVal_setClass);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("shortDescription"))))
    {
        utility::string_t refVal_setShortDescription;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("shortDescription"))), refVal_setShortDescription );
        setShortDescription(refVal_setShortDescription);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("userId"))))
    {
        utility::string_t refVal_setUserId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("userId"))), refVal_setUserId );
        setUserId(refVal_setUserId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("userName"))))
    {
        utility::string_t refVal_setUserName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("userName"))), refVal_setUserName );
        setUserName(refVal_setUserName);
    }
    return ok;
}

utility::string_t CauseUserIdCause::getClass() const
{
    return m__class;
}

void CauseUserIdCause::setClass(const utility::string_t& value)
{
    m__class = value;
    m__classIsSet = true;
}

bool CauseUserIdCause::r_classIsSet() const
{
    return m__classIsSet;
}

void CauseUserIdCause::unset_class()
{
    m__classIsSet = false;
}
utility::string_t CauseUserIdCause::getShortDescription() const
{
    return m_ShortDescription;
}

void CauseUserIdCause::setShortDescription(const utility::string_t& value)
{
    m_ShortDescription = value;
    m_ShortDescriptionIsSet = true;
}

bool CauseUserIdCause::shortDescriptionIsSet() const
{
    return m_ShortDescriptionIsSet;
}

void CauseUserIdCause::unsetShortDescription()
{
    m_ShortDescriptionIsSet = false;
}
utility::string_t CauseUserIdCause::getUserId() const
{
    return m_UserId;
}

void CauseUserIdCause::setUserId(const utility::string_t& value)
{
    m_UserId = value;
    m_UserIdIsSet = true;
}

bool CauseUserIdCause::userIdIsSet() const
{
    return m_UserIdIsSet;
}

void CauseUserIdCause::unsetUserId()
{
    m_UserIdIsSet = false;
}
utility::string_t CauseUserIdCause::getUserName() const
{
    return m_UserName;
}

void CauseUserIdCause::setUserName(const utility::string_t& value)
{
    m_UserName = value;
    m_UserNameIsSet = true;
}

bool CauseUserIdCause::userNameIsSet() const
{
    return m_UserNameIsSet;
}

void CauseUserIdCause::unsetUserName()
{
    m_UserNameIsSet = false;
}
}
}
}
}


