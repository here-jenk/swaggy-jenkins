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
 * Queue.h
 *
 * 
 */

#ifndef Queue_H_
#define Queue_H_


#include "QueueBlockedItem.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Queue
{
public:
    Queue();
    virtual ~Queue() = default;


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

    bool operator==(const Queue& rhs) const;
    bool operator!=(const Queue& rhs) const;

    /////////////////////////////////////////////
    /// Queue members

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
    std::vector<org::openapitools::server::model::QueueBlockedItem> getItems() const;
    void setItems(std::vector<org::openapitools::server::model::QueueBlockedItem> const& value);
    bool itemsIsSet() const;
    void unsetItems();

    friend void to_json(nlohmann::json& j, const Queue& o);
    friend void from_json(const nlohmann::json& j, Queue& o);
protected:
    std::string m__class;
    bool m__classIsSet;
    std::vector<org::openapitools::server::model::QueueBlockedItem> m_Items;
    bool m_ItemsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* Queue_H_ */
