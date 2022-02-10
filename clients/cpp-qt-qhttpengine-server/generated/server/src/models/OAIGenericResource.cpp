/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIGenericResource.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGenericResource::OAIGenericResource(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGenericResource::OAIGenericResource() {
    this->initializeModel();
}

OAIGenericResource::~OAIGenericResource() {}

void OAIGenericResource::initializeModel() {

    m__class_isSet = false;
    m__class_isValid = false;

    m_display_name_isSet = false;
    m_display_name_isValid = false;

    m_duration_in_millis_isSet = false;
    m_duration_in_millis_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_result_isSet = false;
    m_result_isValid = false;

    m_start_time_isSet = false;
    m_start_time_isValid = false;
}

void OAIGenericResource::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGenericResource::fromJsonObject(QJsonObject json) {

    m__class_isValid = ::OpenAPI::fromJsonValue(_class, json[QString("_class")]);
    m__class_isSet = !json[QString("_class")].isNull() && m__class_isValid;

    m_display_name_isValid = ::OpenAPI::fromJsonValue(display_name, json[QString("displayName")]);
    m_display_name_isSet = !json[QString("displayName")].isNull() && m_display_name_isValid;

    m_duration_in_millis_isValid = ::OpenAPI::fromJsonValue(duration_in_millis, json[QString("durationInMillis")]);
    m_duration_in_millis_isSet = !json[QString("durationInMillis")].isNull() && m_duration_in_millis_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_result_isValid = ::OpenAPI::fromJsonValue(result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;

    m_start_time_isValid = ::OpenAPI::fromJsonValue(start_time, json[QString("startTime")]);
    m_start_time_isSet = !json[QString("startTime")].isNull() && m_start_time_isValid;
}

QString OAIGenericResource::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGenericResource::asJsonObject() const {
    QJsonObject obj;
    if (m__class_isSet) {
        obj.insert(QString("_class"), ::OpenAPI::toJsonValue(_class));
    }
    if (m_display_name_isSet) {
        obj.insert(QString("displayName"), ::OpenAPI::toJsonValue(display_name));
    }
    if (m_duration_in_millis_isSet) {
        obj.insert(QString("durationInMillis"), ::OpenAPI::toJsonValue(duration_in_millis));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_result_isSet) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(result));
    }
    if (m_start_time_isSet) {
        obj.insert(QString("startTime"), ::OpenAPI::toJsonValue(start_time));
    }
    return obj;
}

QString OAIGenericResource::getClass() const {
    return _class;
}
void OAIGenericResource::setClass(const QString &_class) {
    this->_class = _class;
    this->m__class_isSet = true;
}

bool OAIGenericResource::is__class_Set() const{
    return m__class_isSet;
}

bool OAIGenericResource::is__class_Valid() const{
    return m__class_isValid;
}

QString OAIGenericResource::getDisplayName() const {
    return display_name;
}
void OAIGenericResource::setDisplayName(const QString &display_name) {
    this->display_name = display_name;
    this->m_display_name_isSet = true;
}

bool OAIGenericResource::is_display_name_Set() const{
    return m_display_name_isSet;
}

bool OAIGenericResource::is_display_name_Valid() const{
    return m_display_name_isValid;
}

qint32 OAIGenericResource::getDurationInMillis() const {
    return duration_in_millis;
}
void OAIGenericResource::setDurationInMillis(const qint32 &duration_in_millis) {
    this->duration_in_millis = duration_in_millis;
    this->m_duration_in_millis_isSet = true;
}

bool OAIGenericResource::is_duration_in_millis_Set() const{
    return m_duration_in_millis_isSet;
}

bool OAIGenericResource::is_duration_in_millis_Valid() const{
    return m_duration_in_millis_isValid;
}

QString OAIGenericResource::getId() const {
    return id;
}
void OAIGenericResource::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIGenericResource::is_id_Set() const{
    return m_id_isSet;
}

bool OAIGenericResource::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIGenericResource::getResult() const {
    return result;
}
void OAIGenericResource::setResult(const QString &result) {
    this->result = result;
    this->m_result_isSet = true;
}

bool OAIGenericResource::is_result_Set() const{
    return m_result_isSet;
}

bool OAIGenericResource::is_result_Valid() const{
    return m_result_isValid;
}

QString OAIGenericResource::getStartTime() const {
    return start_time;
}
void OAIGenericResource::setStartTime(const QString &start_time) {
    this->start_time = start_time;
    this->m_start_time_isSet = true;
}

bool OAIGenericResource::is_start_time_Set() const{
    return m_start_time_isSet;
}

bool OAIGenericResource::is_start_time_Valid() const{
    return m_start_time_isValid;
}

bool OAIGenericResource::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m__class_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_display_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_duration_in_millis_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_result_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_start_time_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGenericResource::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
