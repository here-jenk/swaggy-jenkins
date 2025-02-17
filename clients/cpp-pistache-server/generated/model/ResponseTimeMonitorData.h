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
 * ResponseTimeMonitorData.h
 *
 * 
 */

#ifndef ResponseTimeMonitorData_H_
#define ResponseTimeMonitorData_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ResponseTimeMonitorData
{
public:
    ResponseTimeMonitorData();
    virtual ~ResponseTimeMonitorData() = default;


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

    bool operator==(const ResponseTimeMonitorData& rhs) const;
    bool operator!=(const ResponseTimeMonitorData& rhs) const;

    /////////////////////////////////////////////
    /// ResponseTimeMonitorData members

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
    int32_t getTimestamp() const;
    void setTimestamp(int32_t const value);
    bool timestampIsSet() const;
    void unsetTimestamp();
    /// <summary>
    /// 
    /// </summary>
    int32_t getAverage() const;
    void setAverage(int32_t const value);
    bool averageIsSet() const;
    void unsetAverage();

    friend void to_json(nlohmann::json& j, const ResponseTimeMonitorData& o);
    friend void from_json(const nlohmann::json& j, ResponseTimeMonitorData& o);
protected:
    std::string m__class;
    bool m__classIsSet;
    int32_t m_Timestamp;
    bool m_TimestampIsSet;
    int32_t m_Average;
    bool m_AverageIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ResponseTimeMonitorData_H_ */
