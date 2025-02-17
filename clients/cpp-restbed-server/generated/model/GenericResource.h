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
 * GenericResource.h
 *
 * 
 */

#ifndef GenericResource_H_
#define GenericResource_H_



#include <string>
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
class  GenericResource 
{
public:
    GenericResource() = default;
    explicit GenericResource(boost::property_tree::ptree const& pt);
    virtual ~GenericResource() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GenericResource members

    /// <summary>
    /// 
    /// </summary>
    std::string get_Class() const;
    void set_Class(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getDisplayName() const;
    void setDisplayName(std::string value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getDurationInMillis() const;
    void setDurationInMillis(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getResult() const;
    void setResult(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getStartTime() const;
    void setStartTime(std::string value);

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
    std::string m_DisplayName = "";
    int32_t m_DurationInMillis = 0;
    std::string m_Id = "";
    std::string m_Result = "";
    std::string m_StartTime = "";
};

std::vector<GenericResource> createGenericResourceVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GenericResource_H_ */
