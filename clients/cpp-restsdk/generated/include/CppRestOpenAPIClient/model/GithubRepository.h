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
 * GithubRepository.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GithubRepository_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GithubRepository_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/GithubRepositorylinks.h"
#include "CppRestOpenAPIClient/model/GithubRepositorypermissions.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class GithubRepositorylinks;
class GithubRepositorypermissions;

/// <summary>
/// 
/// </summary>
class  GithubRepository
    : public ModelBase
{
public:
    GithubRepository();
    virtual ~GithubRepository();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GithubRepository members

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
    std::shared_ptr<GithubRepositorylinks> getLinks() const;
    bool linksIsSet() const;
    void unset_links();

    void setLinks(const std::shared_ptr<GithubRepositorylinks>& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getDefaultBranch() const;
    bool defaultBranchIsSet() const;
    void unsetDefaultBranch();

    void setDefaultBranch(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getDescription() const;
    bool descriptionIsSet() const;
    void unsetDescription();

    void setDescription(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<GithubRepositorypermissions> getPermissions() const;
    bool permissionsIsSet() const;
    void unsetPermissions();

    void setPermissions(const std::shared_ptr<GithubRepositorypermissions>& value);

    /// <summary>
    /// 
    /// </summary>
    bool isRPrivate() const;
    bool rPrivateIsSet() const;
    void unsetr_private();

    void setRPrivate(bool value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getFullName() const;
    bool fullNameIsSet() const;
    void unsetFullName();

    void setFullName(const utility::string_t& value);


protected:
    utility::string_t m__class;
    bool m__classIsSet;
    std::shared_ptr<GithubRepositorylinks> m__links;
    bool m__linksIsSet;
    utility::string_t m_DefaultBranch;
    bool m_DefaultBranchIsSet;
    utility::string_t m_Description;
    bool m_DescriptionIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    std::shared_ptr<GithubRepositorypermissions> m_Permissions;
    bool m_PermissionsIsSet;
    bool m_r_private;
    bool m_r_privateIsSet;
    utility::string_t m_FullName;
    bool m_FullNameIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GithubRepository_H_ */
