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



#include "CppRestOpenAPIClient/model/GithubOrganization.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GithubOrganization::GithubOrganization()
{
    m__class = utility::conversions::to_string_t("");
    m__classIsSet = false;
    m__linksIsSet = false;
    m_JenkinsOrganizationPipeline = false;
    m_JenkinsOrganizationPipelineIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
}

GithubOrganization::~GithubOrganization()
{
}

void GithubOrganization::validate()
{
    // TODO: implement validation
}

web::json::value GithubOrganization::toJson() const
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
    if(m_JenkinsOrganizationPipelineIsSet)
    {
        val[utility::conversions::to_string_t(U("jenkinsOrganizationPipeline"))] = ModelBase::toJson(m_JenkinsOrganizationPipeline);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }

    return val;
}

bool GithubOrganization::fromJson(const web::json::value& val)
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
            std::shared_ptr<GithubOrganizationlinks> refVal_setLinks;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLinks);
            setLinks(refVal_setLinks);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("jenkinsOrganizationPipeline"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("jenkinsOrganizationPipeline")));
        if(!fieldValue.is_null())
        {
            bool refVal_setJenkinsOrganizationPipeline;
            ok &= ModelBase::fromJson(fieldValue, refVal_setJenkinsOrganizationPipeline);
            setJenkinsOrganizationPipeline(refVal_setJenkinsOrganizationPipeline);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    return ok;
}

void GithubOrganization::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_JenkinsOrganizationPipelineIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("jenkinsOrganizationPipeline")), m_JenkinsOrganizationPipeline));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
}

bool GithubOrganization::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
        std::shared_ptr<GithubOrganizationlinks> refVal_setLinks;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("_links"))), refVal_setLinks );
        setLinks(refVal_setLinks);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("jenkinsOrganizationPipeline"))))
    {
        bool refVal_setJenkinsOrganizationPipeline;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("jenkinsOrganizationPipeline"))), refVal_setJenkinsOrganizationPipeline );
        setJenkinsOrganizationPipeline(refVal_setJenkinsOrganizationPipeline);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    return ok;
}

utility::string_t GithubOrganization::getClass() const
{
    return m__class;
}

void GithubOrganization::setClass(const utility::string_t& value)
{
    m__class = value;
    m__classIsSet = true;
}

bool GithubOrganization::r_classIsSet() const
{
    return m__classIsSet;
}

void GithubOrganization::unset_class()
{
    m__classIsSet = false;
}
std::shared_ptr<GithubOrganizationlinks> GithubOrganization::getLinks() const
{
    return m__links;
}

void GithubOrganization::setLinks(const std::shared_ptr<GithubOrganizationlinks>& value)
{
    m__links = value;
    m__linksIsSet = true;
}

bool GithubOrganization::linksIsSet() const
{
    return m__linksIsSet;
}

void GithubOrganization::unset_links()
{
    m__linksIsSet = false;
}
bool GithubOrganization::isJenkinsOrganizationPipeline() const
{
    return m_JenkinsOrganizationPipeline;
}

void GithubOrganization::setJenkinsOrganizationPipeline(bool value)
{
    m_JenkinsOrganizationPipeline = value;
    m_JenkinsOrganizationPipelineIsSet = true;
}

bool GithubOrganization::jenkinsOrganizationPipelineIsSet() const
{
    return m_JenkinsOrganizationPipelineIsSet;
}

void GithubOrganization::unsetJenkinsOrganizationPipeline()
{
    m_JenkinsOrganizationPipelineIsSet = false;
}
utility::string_t GithubOrganization::getName() const
{
    return m_Name;
}

void GithubOrganization::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool GithubOrganization::nameIsSet() const
{
    return m_NameIsSet;
}

void GithubOrganization::unsetName()
{
    m_NameIsSet = false;
}
}
}
}
}


