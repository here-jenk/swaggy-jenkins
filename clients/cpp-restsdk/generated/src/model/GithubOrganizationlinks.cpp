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



#include "CppRestOpenAPIClient/model/GithubOrganizationlinks.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GithubOrganizationlinks::GithubOrganizationlinks()
{
    m_RepositoriesIsSet = false;
    m_SelfIsSet = false;
    m__class = utility::conversions::to_string_t("");
    m__classIsSet = false;
}

GithubOrganizationlinks::~GithubOrganizationlinks()
{
}

void GithubOrganizationlinks::validate()
{
    // TODO: implement validation
}

web::json::value GithubOrganizationlinks::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_RepositoriesIsSet)
    {
        val[utility::conversions::to_string_t(U("repositories"))] = ModelBase::toJson(m_Repositories);
    }
    if(m_SelfIsSet)
    {
        val[utility::conversions::to_string_t(U("self"))] = ModelBase::toJson(m_Self);
    }
    if(m__classIsSet)
    {
        val[utility::conversions::to_string_t(U("_class"))] = ModelBase::toJson(m__class);
    }

    return val;
}

bool GithubOrganizationlinks::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("repositories"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("repositories")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Link> refVal_setRepositories;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRepositories);
            setRepositories(refVal_setRepositories);
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

void GithubOrganizationlinks::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_RepositoriesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("repositories")), m_Repositories));
    }
    if(m_SelfIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("self")), m_Self));
    }
    if(m__classIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("_class")), m__class));
    }
}

bool GithubOrganizationlinks::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("repositories"))))
    {
        std::shared_ptr<Link> refVal_setRepositories;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("repositories"))), refVal_setRepositories );
        setRepositories(refVal_setRepositories);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("self"))))
    {
        std::shared_ptr<Link> refVal_setSelf;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("self"))), refVal_setSelf );
        setSelf(refVal_setSelf);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("_class"))))
    {
        utility::string_t refVal_setClass;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("_class"))), refVal_setClass );
        setClass(refVal_setClass);
    }
    return ok;
}

std::shared_ptr<Link> GithubOrganizationlinks::getRepositories() const
{
    return m_Repositories;
}

void GithubOrganizationlinks::setRepositories(const std::shared_ptr<Link>& value)
{
    m_Repositories = value;
    m_RepositoriesIsSet = true;
}

bool GithubOrganizationlinks::repositoriesIsSet() const
{
    return m_RepositoriesIsSet;
}

void GithubOrganizationlinks::unsetRepositories()
{
    m_RepositoriesIsSet = false;
}
std::shared_ptr<Link> GithubOrganizationlinks::getSelf() const
{
    return m_Self;
}

void GithubOrganizationlinks::setSelf(const std::shared_ptr<Link>& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}

bool GithubOrganizationlinks::selfIsSet() const
{
    return m_SelfIsSet;
}

void GithubOrganizationlinks::unsetSelf()
{
    m_SelfIsSet = false;
}
utility::string_t GithubOrganizationlinks::getClass() const
{
    return m__class;
}

void GithubOrganizationlinks::setClass(const utility::string_t& value)
{
    m__class = value;
    m__classIsSet = true;
}

bool GithubOrganizationlinks::r_classIsSet() const
{
    return m__classIsSet;
}

void GithubOrganizationlinks::unset_class()
{
    m__classIsSet = false;
}
}
}
}
}


