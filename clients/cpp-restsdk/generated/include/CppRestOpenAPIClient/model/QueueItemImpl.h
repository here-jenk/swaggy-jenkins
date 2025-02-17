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
 * QueueItemImpl.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_QueueItemImpl_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_QueueItemImpl_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  QueueItemImpl
    : public ModelBase
{
public:
    QueueItemImpl();
    virtual ~QueueItemImpl();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// QueueItemImpl members

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
    int32_t getExpectedBuildNumber() const;
    bool expectedBuildNumberIsSet() const;
    void unsetExpectedBuildNumber();

    void setExpectedBuildNumber(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getPipeline() const;
    bool pipelineIsSet() const;
    void unsetPipeline();

    void setPipeline(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getQueuedTime() const;
    bool queuedTimeIsSet() const;
    void unsetQueuedTime();

    void setQueuedTime(int32_t value);


protected:
    utility::string_t m__class;
    bool m__classIsSet;
    int32_t m_ExpectedBuildNumber;
    bool m_ExpectedBuildNumberIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Pipeline;
    bool m_PipelineIsSet;
    int32_t m_QueuedTime;
    bool m_QueuedTimeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_QueueItemImpl_H_ */
