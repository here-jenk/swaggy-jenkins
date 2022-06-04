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
 * ExtensionClassImpl.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ExtensionClassImpl_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ExtensionClassImpl_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/ExtensionClassImpllinks.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class ExtensionClassImpllinks;

/// <summary>
/// 
/// </summary>
class  ExtensionClassImpl
    : public ModelBase
{
public:
    ExtensionClassImpl();
    virtual ~ExtensionClassImpl();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ExtensionClassImpl members

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
    std::shared_ptr<ExtensionClassImpllinks> getLinks() const;
    bool linksIsSet() const;
    void unset_links();

    void setLinks(const std::shared_ptr<ExtensionClassImpllinks>& value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<utility::string_t>& getClasses();
    bool classesIsSet() const;
    void unsetClasses();

    void setClasses(const std::vector<utility::string_t>& value);


protected:
    utility::string_t m__class;
    bool m__classIsSet;
    std::shared_ptr<ExtensionClassImpllinks> m__links;
    bool m__linksIsSet;
    std::vector<utility::string_t> m_Classes;
    bool m_ClassesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ExtensionClassImpl_H_ */
