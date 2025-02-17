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

/*
 * GithubOrganization.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GithubOrganization_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GithubOrganization_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/GithubOrganizationlinks.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class GithubOrganizationlinks;

/// <summary>
/// 
/// </summary>
class  GithubOrganization
    : public ModelBase
{
public:
    GithubOrganization();
    virtual ~GithubOrganization();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GithubOrganization members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getClass() const;
    bool r_classIsSet() const;
    void unset_class();

    void setClass(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<GithubOrganizationlinks> getLinks() const;
    bool linksIsSet() const;
    void unset_links();

    void setLinks(const std::shared_ptr<GithubOrganizationlinks>& value);

    /// <summary>
    /// 
    /// </summary>
    bool isJenkinsOrganizationPipeline() const;
    bool jenkinsOrganizationPipelineIsSet() const;
    void unsetJenkinsOrganizationPipeline();

    void setJenkinsOrganizationPipeline(bool value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);


protected:
    utility::string_t m__class;
    bool m__classIsSet;
    std::shared_ptr<GithubOrganizationlinks> m__links;
    bool m__linksIsSet;
    bool m_JenkinsOrganizationPipeline;
    bool m_JenkinsOrganizationPipelineIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GithubOrganization_H_ */
