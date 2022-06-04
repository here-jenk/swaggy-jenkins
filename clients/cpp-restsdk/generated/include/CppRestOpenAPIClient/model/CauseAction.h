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
 * CauseAction.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CauseAction_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CauseAction_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CauseUserIdCause.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CauseUserIdCause;

/// <summary>
/// 
/// </summary>
class  CauseAction
    : public ModelBase
{
public:
    CauseAction();
    virtual ~CauseAction();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CauseAction members

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
    std::vector<std::shared_ptr<CauseUserIdCause>>& getCauses();
    bool causesIsSet() const;
    void unsetCauses();

    void setCauses(const std::vector<std::shared_ptr<CauseUserIdCause>>& value);


protected:
    utility::string_t m__class;
    bool m__classIsSet;
    std::vector<std::shared_ptr<CauseUserIdCause>> m_Causes;
    bool m_CausesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CauseAction_H_ */
