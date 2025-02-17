/**
* Swaggy Jenkins
* Jenkins API clients generated from Swagger / Open API specification
*
* The version of the OpenAPI document: 1.5.1-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * StringParameterDefinition.h
 *
 * 
 */

#ifndef StringParameterDefinition_H_
#define StringParameterDefinition_H_


#include <string>
#include "StringParameterValue.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  StringParameterDefinition
{
public:
    StringParameterDefinition();
    virtual ~StringParameterDefinition() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const StringParameterDefinition& rhs) const;
    bool operator!=(const StringParameterDefinition& rhs) const;

    /////////////////////////////////////////////
    /// StringParameterDefinition members

    /// <summary>
    /// 
    /// </summary>
    std::string getClass() const;
    void setClass(std::string const& value);
    bool r_classIsSet() const;
    void unset_class();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::StringParameterValue getDefaultParameterValue() const;
    void setDefaultParameterValue(org::openapitools::server::model::StringParameterValue const& value);
    bool defaultParameterValueIsSet() const;
    void unsetDefaultParameterValue();
    /// <summary>
    /// 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// 
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);
    bool typeIsSet() const;
    void unsetType();

    friend void to_json(nlohmann::json& j, const StringParameterDefinition& o);
    friend void from_json(const nlohmann::json& j, StringParameterDefinition& o);
protected:
    std::string m__class;
    bool m__classIsSet;
    org::openapitools::server::model::StringParameterValue m_DefaultParameterValue;
    bool m_DefaultParameterValueIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_Type;
    bool m_TypeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* StringParameterDefinition_H_ */
