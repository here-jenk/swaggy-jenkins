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



#include "CppRestOpenAPIClient/model/ResponseTimeMonitorData.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ResponseTimeMonitorData::ResponseTimeMonitorData()
{
    m__class = utility::conversions::to_string_t("");
    m__classIsSet = false;
    m_Timestamp = 0;
    m_TimestampIsSet = false;
    m_Average = 0;
    m_AverageIsSet = false;
}

ResponseTimeMonitorData::~ResponseTimeMonitorData()
{
}

void ResponseTimeMonitorData::validate()
{
    // TODO: implement validation
}

web::json::value ResponseTimeMonitorData::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m__classIsSet)
    {
        val[utility::conversions::to_string_t(U("_class"))] = ModelBase::toJson(m__class);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t(U("timestamp"))] = ModelBase::toJson(m_Timestamp);
    }
    if(m_AverageIsSet)
    {
        val[utility::conversions::to_string_t(U("average"))] = ModelBase::toJson(m_Average);
    }

    return val;
}

bool ResponseTimeMonitorData::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("_class"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("_class")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setClass;
            ok &= ModelBase::fromJson(fieldValue, refVal_setClass);
            setClass(refVal_setClass);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("timestamp"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("timestamp")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setTimestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTimestamp);
            setTimestamp(refVal_setTimestamp);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("average"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("average")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setAverage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAverage);
            setAverage(refVal_setAverage);
        }
    }
    return ok;
}

void ResponseTimeMonitorData::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m__classIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("_class")), m__class));
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timestamp")), m_Timestamp));
    }
    if(m_AverageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("average")), m_Average));
    }
}

bool ResponseTimeMonitorData::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("_class"))))
    {
        utility::string_t refVal_setClass;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("_class"))), refVal_setClass );
        setClass(refVal_setClass);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timestamp"))))
    {
        int32_t refVal_setTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timestamp"))), refVal_setTimestamp );
        setTimestamp(refVal_setTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("average"))))
    {
        int32_t refVal_setAverage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("average"))), refVal_setAverage );
        setAverage(refVal_setAverage);
    }
    return ok;
}

utility::string_t ResponseTimeMonitorData::getClass() const
{
    return m__class;
}

void ResponseTimeMonitorData::setClass(const utility::string_t& value)
{
    m__class = value;
    m__classIsSet = true;
}

bool ResponseTimeMonitorData::r_classIsSet() const
{
    return m__classIsSet;
}

void ResponseTimeMonitorData::unset_class()
{
    m__classIsSet = false;
}
int32_t ResponseTimeMonitorData::getTimestamp() const
{
    return m_Timestamp;
}

void ResponseTimeMonitorData::setTimestamp(int32_t value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool ResponseTimeMonitorData::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void ResponseTimeMonitorData::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
int32_t ResponseTimeMonitorData::getAverage() const
{
    return m_Average;
}

void ResponseTimeMonitorData::setAverage(int32_t value)
{
    m_Average = value;
    m_AverageIsSet = true;
}

bool ResponseTimeMonitorData::averageIsSet() const
{
    return m_AverageIsSet;
}

void ResponseTimeMonitorData::unsetAverage()
{
    m_AverageIsSet = false;
}
}
}
}
}


