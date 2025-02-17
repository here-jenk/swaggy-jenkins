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
 * PipelineRunImpllinks.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_PipelineRunImpllinks_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_PipelineRunImpllinks_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Link.h"
#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Link;

/// <summary>
/// 
/// </summary>
class  PipelineRunImpllinks
    : public ModelBase
{
public:
    PipelineRunImpllinks();
    virtual ~PipelineRunImpllinks();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PipelineRunImpllinks members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Link> getNodes() const;
    bool nodesIsSet() const;
    void unsetNodes();

    void setNodes(const std::shared_ptr<Link>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Link> getLog() const;
    bool logIsSet() const;
    void unsetLog();

    void setLog(const std::shared_ptr<Link>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Link> getSelf() const;
    bool selfIsSet() const;
    void unsetSelf();

    void setSelf(const std::shared_ptr<Link>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Link> getActions() const;
    bool actionsIsSet() const;
    void unsetActions();

    void setActions(const std::shared_ptr<Link>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Link> getSteps() const;
    bool stepsIsSet() const;
    void unsetSteps();

    void setSteps(const std::shared_ptr<Link>& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getClass() const;
    bool r_classIsSet() const;
    void unset_class();

    void setClass(const utility::string_t& value);


protected:
    std::shared_ptr<Link> m_Nodes;
    bool m_NodesIsSet;
    std::shared_ptr<Link> m_Log;
    bool m_LogIsSet;
    std::shared_ptr<Link> m_Self;
    bool m_SelfIsSet;
    std::shared_ptr<Link> m_Actions;
    bool m_ActionsIsSet;
    std::shared_ptr<Link> m_Steps;
    bool m_StepsIsSet;
    utility::string_t m__class;
    bool m__classIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_PipelineRunImpllinks_H_ */
