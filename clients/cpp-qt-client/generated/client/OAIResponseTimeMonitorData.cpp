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

#include "OAIResponseTimeMonitorData.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIResponseTimeMonitorData::OAIResponseTimeMonitorData(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIResponseTimeMonitorData::OAIResponseTimeMonitorData() {
    this->initializeModel();
}

OAIResponseTimeMonitorData::~OAIResponseTimeMonitorData() {}

void OAIResponseTimeMonitorData::initializeModel() {

    m__class_isSet = false;
    m__class_isValid = false;

    m_timestamp_isSet = false;
    m_timestamp_isValid = false;

    m_average_isSet = false;
    m_average_isValid = false;
}

void OAIResponseTimeMonitorData::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIResponseTimeMonitorData::fromJsonObject(QJsonObject json) {

    m__class_isValid = ::OpenAPI::fromJsonValue(_class, json[QString("_class")]);
    m__class_isSet = !json[QString("_class")].isNull() && m__class_isValid;

    m_timestamp_isValid = ::OpenAPI::fromJsonValue(timestamp, json[QString("timestamp")]);
    m_timestamp_isSet = !json[QString("timestamp")].isNull() && m_timestamp_isValid;

    m_average_isValid = ::OpenAPI::fromJsonValue(average, json[QString("average")]);
    m_average_isSet = !json[QString("average")].isNull() && m_average_isValid;
}

QString OAIResponseTimeMonitorData::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIResponseTimeMonitorData::asJsonObject() const {
    QJsonObject obj;
    if (m__class_isSet) {
        obj.insert(QString("_class"), ::OpenAPI::toJsonValue(_class));
    }
    if (m_timestamp_isSet) {
        obj.insert(QString("timestamp"), ::OpenAPI::toJsonValue(timestamp));
    }
    if (m_average_isSet) {
        obj.insert(QString("average"), ::OpenAPI::toJsonValue(average));
    }
    return obj;
}

QString OAIResponseTimeMonitorData::getClass() const {
    return _class;
}
void OAIResponseTimeMonitorData::setClass(const QString &_class) {
    this->_class = _class;
    this->m__class_isSet = true;
}

bool OAIResponseTimeMonitorData::is__class_Set() const{
    return m__class_isSet;
}

bool OAIResponseTimeMonitorData::is__class_Valid() const{
    return m__class_isValid;
}

qint32 OAIResponseTimeMonitorData::getTimestamp() const {
    return timestamp;
}
void OAIResponseTimeMonitorData::setTimestamp(const qint32 &timestamp) {
    this->timestamp = timestamp;
    this->m_timestamp_isSet = true;
}

bool OAIResponseTimeMonitorData::is_timestamp_Set() const{
    return m_timestamp_isSet;
}

bool OAIResponseTimeMonitorData::is_timestamp_Valid() const{
    return m_timestamp_isValid;
}

qint32 OAIResponseTimeMonitorData::getAverage() const {
    return average;
}
void OAIResponseTimeMonitorData::setAverage(const qint32 &average) {
    this->average = average;
    this->m_average_isSet = true;
}

bool OAIResponseTimeMonitorData::is_average_Set() const{
    return m_average_isSet;
}

bool OAIResponseTimeMonitorData::is_average_Valid() const{
    return m_average_isValid;
}

bool OAIResponseTimeMonitorData::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m__class_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_timestamp_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_average_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIResponseTimeMonitorData::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
