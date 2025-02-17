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
 * InputStepImpl.h
 *
 * 
 */

#ifndef InputStepImpl_H_
#define InputStepImpl_H_



#include "InputStepImpllinks.h"
#include <string>
#include "StringParameterDefinition.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  InputStepImpl 
{
public:
    InputStepImpl() = default;
    explicit InputStepImpl(boost::property_tree::ptree const& pt);
    virtual ~InputStepImpl() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// InputStepImpl members

    /// <summary>
    /// 
    /// </summary>
    std::string get_Class() const;
    void set_Class(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<InputStepImpllinks> get_Links() const;
    void set_Links(std::shared_ptr<InputStepImpllinks> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getMessage() const;
    void setMessage(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getOk() const;
    void setOk(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<StringParameterDefinition>> getParameters() const;
    void setParameters(std::vector<std::shared_ptr<StringParameterDefinition>> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getSubmitter() const;
    void setSubmitter(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m__class = "";
    std::shared_ptr<InputStepImpllinks> m__links;
    std::string m_Id = "";
    std::string m_Message = "";
    std::string m_Ok = "";
    std::vector<std::shared_ptr<StringParameterDefinition>> m_Parameters;
    std::string m_Submitter = "";
};

std::vector<InputStepImpl> createInputStepImplVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* InputStepImpl_H_ */
