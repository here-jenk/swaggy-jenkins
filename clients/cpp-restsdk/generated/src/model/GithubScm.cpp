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



#include "CppRestOpenAPIClient/model/GithubScm.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GithubScm::GithubScm()
{
    m__class = utility::conversions::to_string_t("");
    m__classIsSet = false;
    m__linksIsSet = false;
    m_CredentialId = utility::conversions::to_string_t("");
    m_CredentialIdIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Uri = utility::conversions::to_string_t("");
    m_UriIsSet = false;
}

GithubScm::~GithubScm()
{
}

void GithubScm::validate()
{
    // TODO: implement validation
}

web::json::value GithubScm::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m__classIsSet)
    {
        val[utility::conversions::to_string_t(U("_class"))] = ModelBase::toJson(m__class);
    }
    if(m__linksIsSet)
    {
        val[utility::conversions::to_string_t(U("_links"))] = ModelBase::toJson(m__links);
    }
    if(m_CredentialIdIsSet)
    {
        val[utility::conversions::to_string_t(U("credentialId"))] = ModelBase::toJson(m_CredentialId);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_UriIsSet)
    {
        val[utility::conversions::to_string_t(U("uri"))] = ModelBase::toJson(m_Uri);
    }

    return val;
}

bool GithubScm::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("_links"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("_links")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<GithubScmlinks> refVal_setLinks;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLinks);
            setLinks(refVal_setLinks);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("credentialId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("credentialId")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCredentialId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCredentialId);
            setCredentialId(refVal_setCredentialId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("uri"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("uri")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUri;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUri);
            setUri(refVal_setUri);
        }
    }
    return ok;
}

void GithubScm::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m__linksIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("_links")), m__links));
    }
    if(m_CredentialIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("credentialId")), m_CredentialId));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_UriIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("uri")), m_Uri));
    }
}

bool GithubScm::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("_links"))))
    {
        std::shared_ptr<GithubScmlinks> refVal_setLinks;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("_links"))), refVal_setLinks );
        setLinks(refVal_setLinks);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("credentialId"))))
    {
        utility::string_t refVal_setCredentialId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("credentialId"))), refVal_setCredentialId );
        setCredentialId(refVal_setCredentialId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("uri"))))
    {
        utility::string_t refVal_setUri;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("uri"))), refVal_setUri );
        setUri(refVal_setUri);
    }
    return ok;
}

utility::string_t GithubScm::getClass() const
{
    return m__class;
}

void GithubScm::setClass(const utility::string_t& value)
{
    m__class = value;
    m__classIsSet = true;
}

bool GithubScm::r_classIsSet() const
{
    return m__classIsSet;
}

void GithubScm::unset_class()
{
    m__classIsSet = false;
}
std::shared_ptr<GithubScmlinks> GithubScm::getLinks() const
{
    return m__links;
}

void GithubScm::setLinks(const std::shared_ptr<GithubScmlinks>& value)
{
    m__links = value;
    m__linksIsSet = true;
}

bool GithubScm::linksIsSet() const
{
    return m__linksIsSet;
}

void GithubScm::unset_links()
{
    m__linksIsSet = false;
}
utility::string_t GithubScm::getCredentialId() const
{
    return m_CredentialId;
}

void GithubScm::setCredentialId(const utility::string_t& value)
{
    m_CredentialId = value;
    m_CredentialIdIsSet = true;
}

bool GithubScm::credentialIdIsSet() const
{
    return m_CredentialIdIsSet;
}

void GithubScm::unsetCredentialId()
{
    m_CredentialIdIsSet = false;
}
utility::string_t GithubScm::getId() const
{
    return m_Id;
}

void GithubScm::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool GithubScm::idIsSet() const
{
    return m_IdIsSet;
}

void GithubScm::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t GithubScm::getUri() const
{
    return m_Uri;
}

void GithubScm::setUri(const utility::string_t& value)
{
    m_Uri = value;
    m_UriIsSet = true;
}

bool GithubScm::uriIsSet() const
{
    return m_UriIsSet;
}

void GithubScm::unsetUri()
{
    m_UriIsSet = false;
}
}
}
}
}


